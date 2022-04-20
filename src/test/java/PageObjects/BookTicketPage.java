package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends BasePage {
    private By departDaySelect = By.xpath("//div[@id='content']/div[1]/form/fieldset/ol/li[1]/select");
    private By departStationSelect = By.xpath("//select[@name='DepartStation']");
    private By arriveStationSelect = By.xpath("//select[@name='ArriveStation']");
    private By btnBookTicket = By.xpath("//div[@id='content']//input");

    public WebElement getDepartDaySelect() {return Constant.DRIVER.findElement(departDaySelect);}
    public WebElement getDepartStationSelect() {return Constant.DRIVER.findElement(departStationSelect);}
    public WebElement getArriveAtSelect() {return Constant.DRIVER.findElement(arriveStationSelect);}
    public WebElement getBookTicketButton() {return Constant.DRIVER.findElement(btnBookTicket);}

    public void bookTicket(String depart_date, String depart_station, String arrive_station) throws InterruptedException {
        Select selectDate = new Select(getDepartDaySelect());
        selectDate.selectByVisibleText(depart_date);

        Select selectDepartStation = new Select(getDepartStationSelect());
        selectDepartStation.selectByVisibleText(depart_station);
        Thread.sleep(1500);

        Select selectArriveStation = new Select(getArriveAtSelect());
        selectArriveStation.selectByVisibleText(arrive_station);


        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", getBookTicketButton());

        getBookTicketButton().click();
    }
}