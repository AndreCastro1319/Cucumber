package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageClass extends CommonMethods {
    @FindBy(xpath="//*[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath ="//*[@name='lastName']" )
    public WebElement lastName;

    @FindBy(xpath ="//*[@name='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@name='userName']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='address1']")
    public WebElement addressField;

    @FindBy(xpath = "//*[@name='city']")
    public WebElement cityField;

    @FindBy(xpath = "//*[@name='state']")
    public WebElement stateField;

    @FindBy(xpath = "//*[@name='postalCode']")
    public WebElement postalCodeField;

    @FindBy(xpath = "//*[@name='country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@name='submit']")
    public WebElement submitButton;

    public RegisterPageClass(){
        PageFactory.initElements(driver,this);
    }


}
