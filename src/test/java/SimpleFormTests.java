
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormDemo;

public class SimpleFormTests extends BasePage {

    private SimpleFormDemo simpleFormDemo;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormDemo = new SimpleFormDemo(driver);
    }
    @Test
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.enterTextinTextField("Test");
        simpleFormDemo.clickOnGetCheckedButtonValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Test"));
    }
    //caractere speciale
    //cifre
    //spatii
    @Test
    public void enterMessageAndClickGetCheckedValue1() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.enterTextinTextField("@");
        simpleFormDemo.clickOnGetCheckedButtonValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("@"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue2() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.enterTextinTextField("1");
        simpleFormDemo.clickOnGetCheckedButtonValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue3() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.enterTextinTextField("'c'");
        simpleFormDemo.clickOnGetCheckedButtonValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("'c'"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue4() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.enterTextinTextField("'z'");
        simpleFormDemo.clickOnGetCheckedButtonValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("'z'"));
    }


    @Test
    public void addTwoNumbersAndGetTheirSum(){
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.EnterTheFirstValue("1");
        simpleFormDemo.EnterTheSecondValue("0");
        simpleFormDemo.clickOnGetSum();
        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("1"));
    }

    @Test
    public void addTwoNumbersAndGetTheirSum2(){
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.EnterTheFirstValue("");
        simpleFormDemo.EnterTheSecondValue("");
        simpleFormDemo.clickOnGetSum();
        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("Entered value is not a number"));
    }
    @Test
    public void addTwoNumbersAndGetTheirSum3(){
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.EnterTheFirstValue("1");
        simpleFormDemo.EnterTheSecondValue("1");
        simpleFormDemo.clickOnGetSum();
        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("2"));
    }
    @Test
    public void addTwoNumbersAndGetTheirSum4(){
        driver.findElement(simpleFormDemoLink).click();
        simpleFormDemo.EnterTheFirstValue("0");
        simpleFormDemo.EnterTheSecondValue("1");

        simpleFormDemo.clickOnGetSum();
        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("1"));
    }

}
