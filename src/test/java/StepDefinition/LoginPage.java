package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.loginP.*;

public class LoginPage {
    @Given("^User navigates to sign in page$")
        public void User_navigates_to_sign_in_page () throws InterruptedException {
        clickSignin();
    }
    @When("^User clicks on sign in button and enter details$")
            public void User_clicks_on_sign_in_button_and_enter_details () throws InterruptedException {
        typeEmail();
        typePassword();
        clickSigninButton();
    }
    @Then("^User should be able to view the Homepage$")
    public void User_should_be_able_to_view_the_Homepage () throws InterruptedException {
        String actual_name = homepage();
        if(actual_name.equals("Sai Sreekar A")) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
