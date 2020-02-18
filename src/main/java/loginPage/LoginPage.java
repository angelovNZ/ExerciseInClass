package loginPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class LoginPage {

    private static final By EMAIL_BOX = By.id("input-email");
    private static final By PASSSWORD_BOX = By.id("input-password");
    private static final By SUBMIT_BUTT = By.xpath("//input[@class='btn btn-primary']");


    public static void goToLogin(){
        Browser.driver.findElement(By.cssSelector(".caret")).click();
        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(2)")).click();

        Assert.assertEquals(Browser.driver.getTitle(),
                "Account Login");
    }

    public static void emailEnter(String email){
        Browser.driver.findElement(EMAIL_BOX).sendKeys(email);
    }

    public static void passwordEnter(String pass){
        Browser.driver.findElement(PASSSWORD_BOX).sendKeys(pass);
    }

    public static void submit(){
        Browser.driver.findElement(SUBMIT_BUTT).click();
    }

    public static void isLoginCorrect(){
        Assert.assertEquals(Browser.driver.getTitle(),
                "My Account");
    }
}
