package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends BasePage{


    public CheckBoxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "isAgeSelected")
    private WebElement SingleCheckbox;
    public void ClickOnTheSingleCheckbox() {  SingleCheckbox.click();
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/label")
    private WebElement MultipleCheckBoxDemoOption1;
    public void ClickOnTheFirstOptionsOfCheckBoxDemo () { MultipleCheckBoxDemoOption1.click();}

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/label")
    private WebElement MultipleCheckBoxDemoOption2;
    public void ClickOnTheSecondOptionOfCheckBoxDemo () { MultipleCheckBoxDemoOption2.click();}

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/label")
    private WebElement MultipleCheckBoxDemoOption3;
    public void ClickOnTheSecondThirdOfCheckBoxDemo () { MultipleCheckBoxDemoOption3.click();}

    @FindBy(xpath = "//*[@id=\"ex1-check3\"]")
    private WebElement MultipleCheckBoxDemoOption4;
    public void ClickOnTheSecondForthOfCheckBoxDemo () { MultipleCheckBoxDemoOption4.click();}

    @FindBy(id ="box")
    private WebElement CheckAllButton;
    public void ClickOnCheckAllButton() {
        CheckAllButton.click();
    }


}
