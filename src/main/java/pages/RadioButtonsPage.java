package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RadioButtonsPage extends BasePage {
    public RadioButtonsPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[1]")
    private WebElement MaleButton;

    public void ClickOnTheMaleButton() { MaleButton.click();}

    @FindBy(xpath= "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]")
    private WebElement FemaleButton;

    public void ClickOnTheFemaleButton()
    { FemaleButton.click();
    }

    @FindBy(id = "buttoncheck")
    private WebElement GetValueButton;

    public void ClickOnGetValueButton()
    { GetValueButton.click();
    }

}
