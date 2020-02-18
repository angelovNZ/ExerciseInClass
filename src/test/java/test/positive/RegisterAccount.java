package test.positive;

import org.testng.annotations.Test;
import register.RegisterPage;
import utils.Browser;

public class RegisterAccount {
    @Test
    public void registerAccount() {
        Browser.openPage("chrome", "http://shop.pragmatic.bg/");

        RegisterPage.goToRegister();
        RegisterPage.firstNameEnter("Nikolay");
        RegisterPage.lastNameEnter("Angelov");
        RegisterPage.telephoneEnter("021001020");
        RegisterPage.emailEnter("blablabla.5@abv.bg");
        RegisterPage.passwordEnter("A000000!");
        RegisterPage.passwordConfirm("A000000!");
        RegisterPage.radioButClickYes();
        RegisterPage.checkBoxClick();
        RegisterPage.submit();
        RegisterPage.isRegister();
        RegisterPage.logoutUser();

//        Browser.driver.findElement(By.cssSelector(".caret")).click();
//        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(1)")).click();
//
//        Assert.assertEquals(Browser.driver.getTitle(), "Register Account");
//
//        Browser.driver.findElement(By.id("input-firstname")).sendKeys("Nikolay");
//        Browser.driver.findElement(By.id("input-lastname")).sendKeys("Angelov");
//        Browser.driver.findElement(By.id("input-email")).sendKeys("blablabla.5@abv.bg");
//        Browser.driver.findElement(By.id("input-telephone")).sendKeys("0828937197319");
//
//        Browser.driver.findElement(By.id("input-password")).sendKeys("A000000!");
//        Browser.driver.findElement(By.id("input-confirm")).sendKeys("A000000!");
//
//
//        WebElement radioBut = Browser.driver.findElement(By.xpath("//div[@class='form-group']//div[@class='col-sm-10']//label[1]/input"));
//        if(radioBut.isEnabled()) {
//            radioBut.click();
//        }
//        Assert.assertTrue(radioBut.isSelected());
//
//        WebElement checkBox = Browser.driver.findElement(By.xpath("//*[@name='agree']"));
//        if(checkBox.isEnabled()){
//            if(!checkBox.isSelected()){
//                checkBox.click();
//            }
//        }
//        Assert.assertTrue(checkBox.isSelected());
//
//        Browser.driver.findElement(By.xpath("//*[@type='submit']")).click();
//
//        Assert.assertTrue(Browser.driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText().contains("Congratulations!"));
//
//        Browser.driver.findElement(By.cssSelector(".caret")).click();
//        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(5)")).click();
//
//        Browser.quitBrowser();


    }
}
