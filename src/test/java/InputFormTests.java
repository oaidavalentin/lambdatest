import org.openqa.selenium.By;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputFormDemo;
import java.lang.AssertionError;

public class InputFormTests extends BasePage {
    private InputFormDemo InputFormDemo;
    private final By InputFormDemoLink = By.linkText("Input Form Submit");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        InputFormDemo = new InputFormDemo(driver);
    }
    @Test
    public void FirstTestOfThePageInputFromSubmit(){
        driver.findElement(InputFormDemoLink).click();
        InputFormDemo.enterTextinTextFieldname("Oaida Valentin");
        InputFormDemo.enterTextinTextFieldemail("oaidavalentin@yahoo.com");
        InputFormDemo.enterTextinTextFieldpassword("Mira2009..");
        InputFormDemo.enterTextinTextFieldcompany("FastTrackIt");
        InputFormDemo.enterTextinTextFieldwebsite("www.google.ro");
        InputFormDemo.enterTextinTextFieldcity("Alba Iulia");
        InputFormDemo.enterTextinTextFieldaddress1("Strada Vai");
        InputFormDemo.enterTextinTextFieldaddress2("Numarul 7");
        InputFormDemo.enterTextinTextFieldstate("RO");
        InputFormDemo.enterTextinTextFieldzip("517424");


        InputFormDemo.clickOnSubmit();
        String actualResult = driver.findElement(By.cssSelector("#__next > div > section.mt-50 > div > div > div > div > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thanks for contacting us, we will get back to you shortly."));
    }

    @Test
    public void FirstTestOfThePageInputFromSubmit2(){
        driver.findElement(InputFormDemoLink).click();
        InputFormDemo.enterTextinTextFieldname("Oaida Valentin");
        InputFormDemo.enterTextinTextFieldemail("oaidavalentin@yahoo.com");
        InputFormDemo.enterTextinTextFieldpassword("Mira2009..");
        InputFormDemo.enterTextinTextFieldcompany("FastTrackIt");
        InputFormDemo.enterTextinTextFieldwebsite("www.google.ro");
        InputFormDemo.enterTextinTextFieldcity("Alba Iulia");
        InputFormDemo.enterTextinTextFieldaddress1("Strada Vai");
        InputFormDemo.enterTextinTextFieldaddress2("Numarul 7");
        InputFormDemo.enterTextinTextFieldstate("RO");
        InputFormDemo.enterTextinTextFieldzip("517424");


        InputFormDemo.clickOnSubmit();
        String actualResultForButton = driver.findElement(By.cssSelector(".mt-20 > button[type=submit]")).getAttribute("innerText");
        System.out.println(actualResultForButton);
        Assert.assertEquals(actualResultForButton, "Submit");
        String actualResultForSuccessfulFormValidation = driver.findElement(By.cssSelector(".mt-20 > .success-msg")).getText();
        System.out.println(actualResultForSuccessfulFormValidation);
        Assert.assertEquals(actualResultForSuccessfulFormValidation, "Thanks for contacting us, we will get back to you shortly.");
    }

    @Test
    public void FirstTestOfThePageInputFromSubmit3(){
        driver.findElement(InputFormDemoLink).click();
        InputFormDemo.enterTextinTextFieldname("Oaida Valentin Nicolae");
        InputFormDemo.enterTextinTextFieldemail("oaida.valentin@yahoo.com");
        InputFormDemo.enterTextinTextFieldpassword("Mira2009...");
        InputFormDemo.enterTextinTextFieldcompany("FastTrackIt");
        InputFormDemo.enterTextinTextFieldwebsite("www.google.ro");
        InputFormDemo.enterTextinTextFieldcity("Alba Iulia");
        InputFormDemo.enterTextinTextFieldaddress1("Strada Vai");
        InputFormDemo.enterTextinTextFieldaddress2("Numarul 7");
        InputFormDemo.enterTextinTextFieldstate("RO");
        InputFormDemo.enterTextinTextFieldzip("517424");


        InputFormDemo.clickOnSubmit();
        String actualResultForButton = driver.findElement(By.cssSelector(".mt-20 > button[type=submit]")).getAttribute("innerText");
        System.out.println(actualResultForButton);
        Assert.assertEquals(actualResultForButton, "Submit");
        String actualResultForSuccessfulFormValidation = driver.findElement(By.cssSelector(".mt-20 > .success-msg")).getText();
        System.out.println(actualResultForSuccessfulFormValidation);
        Assert.assertEquals(actualResultForSuccessfulFormValidation, "Thanks for contacting us, we will get back to you shortly.");
    }


}
