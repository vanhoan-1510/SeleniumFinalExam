package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MyTicketPage extends BasePage {
    private By cancelButton = By.xpath("//div[@class='DivCenter']//input");
    private By infoMessage = By.xpath("//div[@id='content']/div/li[1]");
    private By errorMessage = By.xpath("//div[@class='error message']");

    public WebElement getCancelButton() {return Constant.DRIVER.findElement(cancelButton);}
    public WebElement getInfoMessage() {return Constant.DRIVER.findElement(infoMessage);}
    public WebElement getErrorMessage() {return Constant.DRIVER.findElement(errorMessage);}

    public void cancelTicket() {
        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", getCancelButton());
        getCancelButton().click();
        Constant.DRIVER.switchTo().alert().accept();
    }
}