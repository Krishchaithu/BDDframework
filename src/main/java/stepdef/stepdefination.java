package stepdef;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;

public class stepdefination {
	

@Given("^user is on the website$")
public void user_is_on_the_website()  {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("this is first");
}

@Then("^verify the page title$")
public void verify_the_page_title() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("this is second");
}

}
