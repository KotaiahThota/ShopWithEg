package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.DriverFactory;
import pages.LandingPage;
import pages.LoginPage;

public class StepDefination  extends DriverFactory {
	
	LandingPage landingpage = new LandingPage(driver);
	
	LoginPage loginpage = new LoginPage(driver);
	
	@Given("user launchs shopwitheg application")
	public void user_launchs_shopwitheg_application() {
		driver.get("https://stg.shopwitheg.com/");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   landingpage.loginButton(); 
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	   loginpage.enterinvalidEmail();
	   loginpage.enterinvalidpassword();
	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginpage.clickSignIn();
	    
	}

	@Then("verify the error messages")
	public void verify_the_error_messages() {
	   
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
	}

	@Then("verify the user successfully logged in")
	public void verify_the_user_successfully_logged_in() {
	    
	}
	
	@Given("user launches shopwitheg personal information page")
	public void user_launches_shopwitheg_personal_information_page() {
	   
	}

	@Given("user changes first name")
	public void user_changes_first_name() {
	    
	}

	@Given("user changes second name")
	public void user_changes_second_name() {
	    
	}

	@Then("user changes email")
	public void user_changes_email() {
	    
	}

	@Then("user clicks on save changes")
	public void user_clicks_on_save_changes() {
	    
	}

	@Then("verify success message")
	public void verify_success_message() {
	    
	}
	
	@Then("user clicks on men")
	public void user_clicks_on_men() {
	   
	}

	@Then("user select the product")
	public void user_select_the_product() {
	    
	}

	@Then("user select size")
	public void user_select_size() {
	    
	}

	@Then("user select colour")
	public void user_select_colour() {
	   
	}

	@Then("user clicks add to cart")
	public void user_clicks_add_to_cart() {
	   
	}

	@Then("verify product is added successfully")
	public void verify_product_is_added_successfully() {
	   
	}
	
	@Then("user navigate to shopwitheg reset password")
	public void user_navigate_to_shopwitheg_reset_password() {
	    
	}

	@Then("user enter old password")
	public void user_enter_old_password() {
	    
	}

	@Then("user enter new password")
	public void user_enter_new_password() {
	   
	}

	@Then("user reenter the confirm password")
	public void user_reenter_the_confirm_password() {
	   
	}

	@Then("user clicks save changes")
	public void user_clicks_save_changes() {
	   
	}

	@Then("verify the password changed successfully")
	public void verify_the_password_changed_successfully() {
	    

	}

}
