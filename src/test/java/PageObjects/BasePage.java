package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    private By lnkTimetablePage = By.xpath("//a[@href='TrainTimeListPage.cshtml']");
    private By lnkLoginPage = By.xpath("//a[@href='/Account/Login.cshtml']");
    private By lnkBookTicketPage = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private By lnkRegisterPage = By.xpath("//a[@href='/Account/Register.cshtml']");
    private By lnkMyTicketPage = By.xpath("//a[@href='/Page/ManageTicket.cshtml']");

    public WebElement getLnkLoginPage() {return Constant.DRIVER.findElement(lnkLoginPage);}
    public WebElement getLnkBookTicketPage() {return Constant.DRIVER.findElement(lnkBookTicketPage);}
    public WebElement getLnkRegisterPage() {return Constant.DRIVER.findElement(lnkRegisterPage);}
    public WebElement getLnkMyTicketPage() {return Constant.DRIVER.findElement(lnkMyTicketPage);}

    public void moveToRegisterPage() {getLnkRegisterPage().click();}
    public void moveToLoginPage() {getLnkLoginPage().click();}
    public void moveToBookTicketPage() {getLnkBookTicketPage().click();}
    public void moveToMyTicketPage() {getLnkMyTicketPage().click();}
}