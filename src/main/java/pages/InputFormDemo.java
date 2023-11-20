package pages;
import java.awt.*;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormDemo extends BasePage {
    public InputFormDemo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "name")
    private WebElement nameField;
    public void enterTextinTextFieldname(String name) {
        nameField.sendKeys(name);
    }
    @FindBy(id = "inputEmail4")
    private WebElement emailField;
    public void enterTextinTextFieldemail(String email) {
        emailField.sendKeys(email);
    }

    @FindBy(id = "inputPassword4")
    private WebElement passwordField;
    public void enterTextinTextFieldpassword(String pass) {
        passwordField.sendKeys(pass);
    }

    @FindBy(id = "company")
    private WebElement companyField;
    public void enterTextinTextFieldcompany(String comp) {
        companyField.sendKeys(comp);
    }

    @FindBy(id = "websitename")
    private WebElement webSiteField;

    public void enterTextinTextFieldwebsite(String web) {
        webSiteField.sendKeys(web);
    }

    @FindBy(css = "option[value=RO]")
    private WebElement countryDropdownField;
    public void selectTextInTextFieldCountry() {
        countryDropdownField.click();
    }

    @FindBy(id = "inputCity")
    private WebElement cityField;

    public void enterTextinTextFieldcity(String city) {
        cityField.sendKeys(city);
    }

    @FindBy(id = "inputAddress1")
    private WebElement address1Field;

    public void enterTextinTextFieldaddress1(String address1) {
        address1Field.sendKeys(address1);
    }

    @FindBy(id = "inputAddress2")
    private WebElement address2Field;
    public void enterTextinTextFieldaddress2(String address2) {
        address2Field.sendKeys(address2);
    }

    @FindBy(id = "inputState")
    private WebElement stateField;
    public void enterTextinTextFieldstate(String state) {
        stateField.sendKeys(state);
    }

    @FindBy(id = "inputZip")
    private WebElement zipField;
    public void enterTextinTextFieldzip(String zip)    {zipField.sendKeys(zip);
    }

    @FindBy(css = ".mt-20 > button[type=submit]")
    private WebElement submitButton;

    public void clickOnSubmit()
    {
        submitButton.click();
    }


}
