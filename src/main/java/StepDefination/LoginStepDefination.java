package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;


public class LoginStepDefination {

	WebDriver driver;
	

@Given("^user is on site page$")
public void user_is_on_site_page() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C://Apps//driver//chrome//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://akamai.markethub.shell.com");
}

@Then("^title of the page is akamai$")
public void title_of_the_page_is_akamai()  {
    // Write code here that turns the phrase above into concrete actions
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Shell MarketHub | Login", title);
}

@Then("^user enters username$")
public void user_enters_username() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("userId")).sendKeys("placeallorders");
    
}

@Then("^user enters password$")
public void user_enters_password()  {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).sendKeys("CDE#4rfv");
   
}

@Then("^user click on submit button$")
public void user_click_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).submit();
}

@Then("^user validates title page is Home$")
public void user_validates_title_page_is_Home()  {
    // Write code here that turns the phrase above into concrete actions
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("home", title);
}
	
@Then("^close browser$")
public void close_browse(){
	driver.quit();
}
	
}
