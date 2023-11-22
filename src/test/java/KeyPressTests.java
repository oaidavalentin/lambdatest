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

    public void WriteATestAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInTheTextField("C");
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: C");


    }
    @Test

    public void TypeSpaceAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInTheTextField(" ");
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: SPACE");


    }
    @Test
    public void TypeShiftKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInShiftKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: SHIFT");


    }
    @Test
    public void TypeControlKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInControlKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: CONTROL");


    }
    @Test
    public void TypeEnterKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInEnterKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: ENTER");


    }

    @Test
    public void TypeAltKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInAltKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: ALT");


    }

    @Test
    public void TypeTabKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInTabKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: TAB");


    }
    @Test
    public void TypeDelKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInDeleteKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: DELETE");


    }
    @Test
    public void TypeInsertKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInInsertKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: INSERT");


    }

    @Test
    public void TypeBackspaceKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInBackspaceKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: BACK_SPACE");


    }

    @Test
    public void TypeEscapeKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInEscapeKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: ESCAPE");


    }

    @Test
    public void TypeUpKeyAndCheckTheResponse() {
        driver.findElement(KeyPressPageLink).click();
        KeyPressPage.typeInUpKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: UP");


    }



}
