package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class webSearch {

        @Given("open a google site and search for new tech")
        public void open_a_google_site_and_search_for_new_tech() {
            System.out.println("this is google");
        }

        @Given("click on the first link")
        public void click_on_the_first_link() {
            System.out.println("the link you wanted to click");
        }

        @Then("select the copy site url")
        public void select_the_copy_site_url() {
            System.out.println("site url is : google.com/");
        }


}
