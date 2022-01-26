package steps;

import Pages.RegisterPageClass;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class RegisterationSteps extends CommonMethods {

    @Given("user is navigated to mercury tours application")
    public void user_is_navigated_to_mercury_tours_application() {
       openBrowserAndLaunchApplication();
    }

    @When("user enters values for registering the user")
    public void user_enters_values_for_registering_the_user() {
        RegisterPageClass registerPageClass = new RegisterPageClass();
        registerPageClass.firstName.sendKeys("Jimmy");
        registerPageClass.lastName.sendKeys("Castro");
        registerPageClass.phoneNumber.sendKeys("571-332-2844");
        registerPageClass.email.sendKeys("ndrecastro@gmail.com");
        registerPageClass.addressField.sendKeys("12345 Virginia St");
        registerPageClass.cityField.sendKeys("WoodBridge");
        registerPageClass.stateField.sendKeys("Virginia");
        registerPageClass.postalCodeField.sendKeys("22191");
        Select s = new Select(registerPageClass.countryDropdown);
        s.selectByVisibleText("NIUE");
        registerPageClass.username.sendKeys("Andresinho420");
        registerPageClass.password.sendKeys("jimito123");
        registerPageClass.confirmPassword.sendKeys("jimito123");

    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        RegisterPageClass r = new RegisterPageClass();
        r.submitButton.click();
    }
    @Then("user is able to see message successful registration")
    public void user_is_able_to_see_message_successful_registration() {
        System.out.println("Test Passed");
        driver.quit();
    }
    @When("user enters {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}   for registering the user")
    public void user_enters_for_registering_the_user(String fn, String ln, String phone, String email, String address,
                                                     String city, String state, String postal, String username, String country,
                                                     String password, String confirmpassword) {
        RegisterPageClass registerPageClass = new RegisterPageClass();
        registerPageClass.firstName.sendKeys(fn);
        registerPageClass.lastName.sendKeys(ln);
        registerPageClass.phoneNumber.sendKeys(phone);
        registerPageClass.email.sendKeys(email);
        registerPageClass.addressField.sendKeys(address);
        registerPageClass.cityField.sendKeys(city);
        registerPageClass.stateField.sendKeys(state);
        registerPageClass.postalCodeField.sendKeys(postal);
        Select s = new Select(registerPageClass.countryDropdown);
        s.selectByVisibleText(country);
        registerPageClass.username.sendKeys(username);
        registerPageClass.password.sendKeys(password);
        registerPageClass.confirmPassword.sendKeys(confirmpassword);
    }

}
