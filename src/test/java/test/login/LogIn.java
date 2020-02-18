package test.login;

import loginPage.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Browser;

public class LogIn {

    @Test
    public void logIn(){
        Browser.openPage("chrome", "http://shop.pragmatic.bg/");

        LoginPage.goToLogin();
        LoginPage.emailEnter("blablabla.4@abv.bg");
        LoginPage.passwordEnter("A000000!");
        LoginPage.submit();
        LoginPage.isLoginCorrect();

//
//        Browser.driver.findElement(By.cssSelector(".caret")).click();
//        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(2)")).click();
//
//        Assert.assertEquals(Browser.driver.getTitle(),
//                "Account Login");
//
//        Browser.driver.findElement(By.id("input-email")).sendKeys("blablabla.4@abv.bg");
//        Browser.driver.findElement(By.id("input-password")).sendKeys("A000000!");
//
//        Browser.driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//
//        Assert.assertEquals(Browser.driver.getTitle(),
//                "My Account");
    }
}
