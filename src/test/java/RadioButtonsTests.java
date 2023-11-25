import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckBoxPage;
import pages.RadioButtonsPage;

public class RadioButtonsTests extends BasePage {
    private RadioButtonsPage radioButtonsDemo;

    private final By radioButtonsDemoLink = By.linkText("Radio Buttons Demo");
    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonsDemo = new RadioButtonsPage(driver);
    }
    @Test
    public void ClickOnTheMaleButtonDemo() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonsDemo.ClickOnTheMaleButton();
        radioButtonsDemo.ClickOnGetValueButton();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "Radio button 'Male' is checked");
    }
    @Test
    public void ClickOnTheFemaleButtonDemo() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonsDemo.ClickOnTheFemaleButton();
        radioButtonsDemo.ClickOnGetValueButton();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "Radio button 'Female' is checked");
    }

    @Test
    public void ClickOnTheGetValueButtonDemo() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonsDemo.ClickOnGetValueButton();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "Radio button is Not checked");
    }


}
