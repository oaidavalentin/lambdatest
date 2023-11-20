import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputFormDemo;
import pages.KeyPressPage;
import pages.SimpleFormDemo;

public class KeyPressTests extends BasePage {

    private pages.KeyPressPage KeyPressPage;
    private final By KeyPressPageLink = By.linkText("Key Press");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        KeyPressPage = new KeyPressPage(driver);
    }

    @Test

    public void FirstTestOfKeyPressPage() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInTheTextField("C");
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: C");


    }


}
