package test.negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Browser;

public class RegisterAccountNegative {
    @Test
    public void registerNegative(){
        Browser.openPage("chrome", "http://shop.pragmatic.bg/");

        Browser.driver.findElement(By.cssSelector(".caret")).click();
        Browser.driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right li:nth-of-type(1)")).click();

        Assert.assertEquals(Browser.driver.getTitle(), "Register Account");

        WebElement radioBut = Browser.driver.findElement(By.xpath("//div[@class='form-group']//div[@class='col-sm-10']//label[1]/input"));
        if(radioBut.isEnabled()) {
            radioBut.click();
        }
        Assert.assertTrue(radioBut.isSelected());

        WebElement checkBox = Browser.driver.findElement(By.xpath("//*[@name='agree']"));
        if(checkBox.isEnabled()){
            if(!checkBox.isSelected()){
                checkBox.click();
            }
        }
        Assert.assertTrue(checkBox.isSelected());

        Browser.driver.findElement(By.xpath("//*[@type='submit']")).click();

        Assert.assertEquals(Browser.driver.findElement(By.xpath("//*[@id='input-firstname']/following-sibling::div")).getText(),
        "First Name must be between 1 and 32 characters!");

        Assert.assertEquals(Browser.driver.findElement(By.xpath("//*[@id='input-lastname']/following-sibling::div")).getText(),
                "Last Name must be between 1 and 32 characters!");

        Assert.assertEquals(Browser.driver.findElement(By.xpath("//*[@id='input-email']/following-sibling::div")).getText(),
                "E-Mail Address does not appear to be valid!");

        Assert.assertEquals(Browser.driver.findElement(By.xpath("//*[@id='input-telephone']/following-sibling::div")).getText(),
                "Telephone must be between 3 and 32 characters!");

        Assert.assertEquals(Browser.driver.findElement(By.xpath("//*[@id='input-password']/following-sibling::div")).getText(),
                "Password must be between 4 and 20 characters!");

        Browser.driver.findElement(By.id("input-confirm")).sendKeys("A000000!");

        Browser.driver.findElement(By.xpath("//*[@type='submit']")).click();


        Assert.assertEquals(Browser.driver.findElement(By.xpath("//*[@id='input-confirm']/following-sibling::div")).getText(),
                "Password confirmation does not match password!");

        Browser.driver.quit();
    }
}
