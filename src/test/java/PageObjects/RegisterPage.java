package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    private By usernameBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By confirmPasswordBox = By.xpath("//input[@id='confirmPassword']");
    private By passportBox = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//form[@id='RegisterForm']/fieldset/p/input");

    public WebElement getUserNameBox() {return Constant.DRIVER.findElement(usernameBox);}
    public WebElement getPasswordBox() {
        return Constant.DRIVER.findElement(passwordBox);
    }
    public WebElement getConfirmPasswordBox() {
        return Constant.DRIVER.findElement(confirmPasswordBox);
    }
    public WebElement getPassportBox() {
        return Constant.DRIVER.findElement(passportBox);
    }
    public WebElement getRegisterButton() {
        return Constant.DRIVER.findElement(btnRegister);
    }

    public void register(String username, String password, String confirm_password, String pid) {
        this.getUserNameBox().sendKeys(username);
        this.getPasswordBox().sendKeys(password);
        this.getConfirmPasswordBox().sendKeys(confirm_password);
        this.getPassportBox().sendKeys(pid);

        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView()", getRegisterButton());
        getRegisterButton().click();
    }
}