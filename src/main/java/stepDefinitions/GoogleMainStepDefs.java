package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.GoogleMainPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Hooks;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GoogleMainStepDefs {
    GoogleMainPage googleMainPage = new GoogleMainPage();
    @Given("the user is on the Google page")
    public void the_user_is_on_the_Google_page() throws IOException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        googleMainPage.aceptarTodo.click();
        Hooks.getScreenshot("first step");
    }
    @When("the user search for {string}")
    public void the_user_search_for(String expectedProduct) throws IOException {
        googleMainPage.searchBox.sendKeys(expectedProduct);
        googleMainPage.searchBox.sendKeys(Keys.ENTER);
        System.out.println(googleMainPage.resultBox.getText());
        Hooks.getScreenshot("second step");
    }
    @Then("the user get result will appear")
    public void the_user_get_result_will_appear() throws IOException {
        String [] text = googleMainPage.resultBox.getText().split(" ");
        String text1 = text[1].replace(",","");
        long number = Long.parseLong(text1);
        if ( number > 100000 ) {
            System.out.println("OK");
        }
        else if ( number < 10000 ) {
            System.out.println("NOK");
        }
        Hooks.getScreenshot("third step");
    }

}
