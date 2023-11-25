import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckBoxPage;
import pages.InputFormDemo;

public class CheckBoxTests extends BasePage {

    private CheckBoxPage checkboxDemo;
    private final By checkboxDemoLink = By.linkText("Checkbox Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxDemo = new CheckBoxPage(driver);
    }

    @Test
    public void checkIfTheSingleCheckBoxDemoIsChecked() {
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxDemo.ClickOnTheSingleCheckbox();
        String actualResult = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "Checked");
        checkboxDemo.ClickOnTheSingleCheckbox();

    }

    @Test
    public void checkIfAllOptionInMultipleCheckBoxDemoIsChecked(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxDemo.ClickOnCheckAllButton();
        String actualResult = driver.findElement(By.cssSelector("input[value=\"Uncheck All\"]")).getAccessibleName();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Uncheck All"));


    }


}
