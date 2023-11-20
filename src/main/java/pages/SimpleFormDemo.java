package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemo extends BasePage {

    public SimpleFormDemo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;

    public void enterTextinTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;

    public void clickOnGetCheckedButtonValue() {
        getCheckedValueButton.click();
    }

    @FindBy(id = "message")
    private WebElement checkMessage;

    @FindBy(css ="input[placeholder='Please enter first value']")
    private WebElement textField1;

    public void textField1(String A)
    {
        textField1.sendKeys(A);
    }

    @FindBy(css ="input[placeholder='Please enter second value']")
    private WebElement textField2;

    public void textField2(String B)
    {
        textField2.sendKeys(B);
    }

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    private WebElement getSum;

    public void clickOnGetSum()
    {
        getSum.click();
    }


    public void checkYourMessage()
    {
        checkMessage.getText();
    }
}

