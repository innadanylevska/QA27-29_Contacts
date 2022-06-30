package com.telrun.contacts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isSignOutButtonPresent()) {
            click(By.xpath("//button[contains(.,'Sign Out')]"));
        }
    }

    @Test
    public void registrationPositiveTest() {
        //click on the link LOGIN
        click(By.xpath("//a[contains(.,'LOGIN')]"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".login_login__3EHKB")));
        //fill registration form
        type(By.cssSelector("[placeholder='Email']"), "jesse+982@mail.ru");
        type(By.cssSelector("[placeholder='Password']"), "Jesse_12345");
        //click on the button Registration
        click(By.xpath("//button[contains(.,'Registration')]"));
        //assert the button Sign out displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(.,'Sign Out')]")));
    }

}
