package PageObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePassword {

    private By currentPasswordBox = By.xpath("//input[@id='currentPassword']");
    private By newPasswordBox = By.xpath("//input[@id='newPassword']");
    private By confirmPasswordBox = By.xpath("//*[@id='confirmPassword']");


    public WebElement getCurrentPasswordBox() {return Constant.DRIVER.findElement(currentPasswordBox);}
    public WebElement getNewPasswordBox() {return Constant.DRIVER.findElement(newPasswordBox);}
    public WebElement getConfirmPasswordBox() {return Constant.DRIVER.findElement(confirmPasswordBox);}

}