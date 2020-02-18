package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

public class RegisterPage {

    private static final By FIRST_NAME = By.id("input-firstname");
    private static final By SECOND_NAME = By.id("input-lastname");
    private static final By EMAIL_BOX = By.id("input-email");
    private static final By PASSWORD = By.id("input-password");
    private static final By CONFIRM_PASSWORD = By.id("input-confirm");
    private static final By TELEPHONE = By.id("input-telephone");
    private static final By RADIO_BUTT = By.xpath("//div[@class='form-group']//div[@class='col-sm-10']//label[1]/input");
    private static final By CHECK_BOX = By.xpath("//*[@name='agree']");
    private static final By SUBMIT_BUTT = By.xpath("//*[@type='submit']");
    private static final By MESSAGE_REGISTER_CORRECT = By.xpath("//*[@id='content']/p[1]");


    public static void goToRegister(){
        Browser.driver.findElement(By.cssSelector(".caret")).click();
        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(1)")).click();

        Assert.assertEquals(Browser.driver.getTitle(), "Register Account");
    }

    public static void firstNameEnter(String name) {
        Browser.driver.findElement(FIRST_NAME).sendKeys(name);
    }

    public static void lastNameEnter(String lastName) {
        Browser.driver.findElement(SECOND_NAME).sendKeys(lastName);
    }

    public static void emailEnter(String email) {
        Browser.driver.findElement(EMAIL_BOX).sendKeys(email);
    }

    public static void passwordEnter(String password) {
Browser.driver.findElement(PASSWORD).sendKeys(password);
    }

    public static void passwordConfirm(String confirm) {
Browser.driver.findElement(CONFIRM_PASSWORD).sendKeys(confirm);
    }

    public static void telephoneEnter(String tel){
        Browser.driver.findElement(TELEPHONE).sendKeys(tel);
    }

    public static void radioButClickYes(){
        WebElement radioBut = Browser.driver.findElement(RADIO_BUTT);

        if(radioBut.isEnabled()) {
            radioBut.click();
        }
        Assert.assertTrue(radioBut.isSelected());
    }

    public static void checkBoxClick(){
        WebElement checkBox = Browser.driver.findElement(CHECK_BOX);
        if(checkBox.isEnabled()){
            if(!checkBox.isSelected()){
                checkBox.click();
            }
        }
        Assert.assertTrue(checkBox.isSelected());
    }

    public static void submit(){
        Browser.driver.findElement(SUBMIT_BUTT).click();
    }

    public static void isRegister(){
        Assert.assertTrue(Browser.driver.findElement(MESSAGE_REGISTER_CORRECT).getText().contains("Congratulations!"));
    }

    public static void logoutUser(){
        Browser.driver.findElement(By.cssSelector(".caret")).click();
        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(5)")).click();

        Browser.quitBrowser();
    }
}
