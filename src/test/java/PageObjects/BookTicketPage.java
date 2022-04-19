package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends BasePage {

    private By txtBookTicketHeader = By.xpath("//div[@id='content']/h1");
    private By departDaySelect = By.xpath("//div[@id='content']/div[1]/form/fieldset/ol/li[1]/select");
    private By departFromSelect = By.xpath("//select[@name='DepartStation']");
    private By arriveAtSelect = By.xpath("//select[@name='ArriveStation']");
    private By seatTypeSelect = By.xpath("//select[@name='SeatType']");
    private By ticketAmount = By.xpath("//select[@name='TicketAmount']");
    private By btnBookTicket = By.xpath("//div[@id='content']//input");
    private By lblBookTicketMessage =By.xpath("//div[@id='content']/h1");

    public WebElement getTxtBookTicketHeader() {return Constant.DRIVER.findElement(txtBookTicketHeader);}
    public WebElement getDepartDaySelect() {return Constant.DRIVER.findElement(departDaySelect);}
    public WebElement getDepartFromSelect() {return Constant.DRIVER.findElement(departFromSelect);}
    public WebElement getArriveAtSelect() {return Constant.DRIVER.findElement(arriveAtSelect);}
    public WebElement getSeatTypeSelect() {return Constant.DRIVER.findElement(seatTypeSelect);}
    public WebElement getTicketAmount() {return Constant.DRIVER.findElement(ticketAmount);}
    public WebElement getBookTicketButton() {return Constant.DRIVER.findElement(btnBookTicket);}
    public WebElement getBookTicketMessage() {return Constant.DRIVER.findElement(lblBookTicketMessage);}
}