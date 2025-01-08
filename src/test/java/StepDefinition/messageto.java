package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Message.*;

public class messageto {
    @Given("User searches based on profile name")
    public void user_searches_based_on_profile_name() throws InterruptedException {
        profilesearch();
    }
    @When("User find the profile and clicks on profile")
    public void user_find_the_profile_and_clicks_on_profile() throws InterruptedException {
        clickprofilename();
    }
    @Then("User clicks on message button and send a message")
    public void user_clicks_on_message_button_and_send_aMessage() throws InterruptedException {
        messageclick();
        Thread.sleep(2000);
        writemessage();
        String s = sentmsg();
        if (s.equals("Hi Rajesh Battula"))
        {
            System.out.println("Message has been sent successfully");
        }
        else {
            System.out.println("Message has not been sent successfully");
        }
    }
}
