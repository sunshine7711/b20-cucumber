package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.FacebookLoginPage;
import pages.TumbrlHomePage;
import utilities.ConfigUtils;
import utilities.DriverUtils;

public class FacebookStepDefs {
    private WebDriver driver;
    public FacebookLoginPage flp;

    @Given("I am on Facebook login page")
    public void i_am_on_facebook_login_page() {
        driver = DriverUtils.getDriver("chrome");
        driver.get("https://www.facebook.com/");
    }

    @Given("I enter invalid Facebook email {string}")
    public void i_enter_invalid_facebook_email(String email) {
        flp = new FacebookLoginPage(driver);
        flp.emailField.sendKeys(email);
    }


    @Given("I enter invalid Facebook password {string}")
    public void i_enter_invalid_facebook_password(String password) {
        flp.passwordField.sendKeys(password);
        flp.loginButton.click();
    }

    @Then("I should get error message: {string}")
    public void i_should_get_error_message(String expectedErrorMessage) {
        String actualErrorMessage = flp.error.getText();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));

    }
}





