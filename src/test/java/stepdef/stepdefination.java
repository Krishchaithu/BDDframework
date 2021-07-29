package stepdef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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

@Then("^click button$")
public void click_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("this is second");
}

}
