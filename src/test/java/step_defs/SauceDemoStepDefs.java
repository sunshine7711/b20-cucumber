package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SauceLoginPage;
import pages.SauceProductsPage;
import utilities.ConfigUtils;

public class SauceDemoStepDefs {

    WebDriver driver;

    @When("I login with visual user")
    public void i_login_with_visual_user() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_visual_username");
        String password = ConfigUtils.getConfigProp("Sauce_password");
        slp.login(username, password);

    }

    @Then("I should see {string} item")
    public void i_should_see_backpack_item(String item) {

        SauceProductsPage spp = new SauceProductsPage(driver);

        if (item.equalsIgnoreCase("backpack")) {
            boolean isBackPackDisplayed = spp.backpackItem.isDisplayed();
            Assert.assertTrue(isBackPackDisplayed);
        } else if (item.equalsIgnoreCase("onesie")) {
            boolean isOnesieDisplayed = spp.onesieItem.isDisplayed();
            Assert.assertTrue(isOnesieDisplayed);
        } else {
            Assert.fail("Provided item is not supported yet");
        }
    }

    @Then("price should be {double}")
    public void price_should_be(double price){

    }

}
