package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.TumbrlHomePage;
import utilities.ConfigUtils;
import utilities.DriverUtils;

public class TumblrStepDefs {

    private WebDriver driver;

    @Given("I am on Tumblr home page")
    public void i_am_on_tumbr_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("facebook_url");
        driver.get(url);
    }

    @When("I click login button")
    public void i_click_login_button() {
        TumbrlHomePage thp = new TumbrlHomePage(driver);
        thp.loginButton.click();
    }

    @When("I click continue with email")
    public void i_click_continue_with_email() {
        TumbrlHomePage thp = new TumbrlHomePage(driver);
        thp.continueWithEmailButton.click();
    }

    @When("I enter {string} email")
    public void i_enter_email(String email) {
        TumbrlHomePage thp = new TumbrlHomePage(driver);
        thp.emailInputField.sendKeys(email + Keys.ENTER);

    }

    @When("I enter {string} password")
    public void i_enter_password(String password) {
        TumbrlHomePage thp = new TumbrlHomePage(driver);
        thp.passwordInputField.sendKeys(password + Keys.ENTER);
    }

    @Then("I should get {string} error")
    public void i_should_get_error(String expectedError) {
        TumbrlHomePage thp = new TumbrlHomePage(driver);
        String actualError = thp.error.getText();
        Assert.assertEquals(expectedError, actualError);
    }


}
