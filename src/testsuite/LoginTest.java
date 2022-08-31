package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/*2. Create the package ‘testsuite’ and create the following class inside the ‘testsuite’ package.
 1. LoginTest
 */
public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setup (){
        openBrowser(baseUrl);
    }

    @Test
    /* 3. Write down the following test into ‘LoginTest’ class
     1. userSholdLoginSuccessfullyWithValid Credentials
      * Enter “standard_user” username * Enter “secret_sauce” password
      * Click on ‘LOGIN’ button * Verify the text “PRODUCTS”
     */

    public void userShouldLoginSuccessfullyWithValidCredentials () {
        sendKeysToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        sendKeysToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        clickOnElement(By.xpath("//input[@id='login-button']"));
        String actualmes = getTextFromElement(By.xpath("//span[@class='title']"));
        System.out.println(actualmes);
        String expectedmes = "PRODUCTS";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*2. verifyThatSixProductsAreDisplayedOnPage
     * Enter “standard_user” username * Enter “secret_sauce” password
     * Click on ‘LOGIN’ button
     * Verify that six products are displayed on page
     */
    public void verifyThatSixProductAreDisplayedOnPage () {
        sendKeysToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        sendKeysToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        clickOnElement(By.xpath("//input[@id='login-button']"));
        String actualmes = getTextFromElement(By.xpath("//span[@class='title']"));
        System.out.println(actualmes);
        String expectedmes = "PRODUCTS";
        Assert.assertEquals(expectedmes, actualmes);
    }

    @After
    public void teardown (){
      //  closebrowser();
    }

}
