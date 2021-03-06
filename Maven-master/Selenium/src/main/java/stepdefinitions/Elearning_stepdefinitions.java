package stepdefinitions;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.internal.Configuration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import common.Configurations;

public class Elearning_stepdefinitions {


	public static WebDriver driver;
	String url = "http://elearningm1.upskills.in/";

	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		WebDriver driver = Configurations.createFireFoxDriver();
		driver.get(url);
	}

	@Then("^I entered the username \"([^\"]*)\"$")
	public void i_entered_the_username(String username) throws Throwable {
		driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys(username);

	}

	@Then("^I entered the password \"([^\"]*)\"$")
	public void i_entered_the_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^I click the submit button$")
	public void i_click_the_submit_button() throws Throwable {
		driver.findElement(By.cssSelector("button[name=submitAuth]")).click();
	}

	@When("^I click on add user link$")
	public void i_click_on_add_user_link() throws Throwable {
		driver.findElement(By.partialLinkText("Add")).click();
		
	}

	@Then("^I enter the first name$")
	public void i_enter_the_first_name() throws Throwable {
       driver.findElement(By.id("firstname")).sendKeys("Neetu");
	}

	@Then("^I entered the last name$")
	public void i_entered_the_last_name() throws Throwable {
       driver.findElement(By.name("lastname")).sendKeys("Khanna");
	}

	@Then("^I entered the email id$")
	public void i_entered_the_email_id() throws Throwable {
      driver.findElement(By.name("email")).sendKeys("neetukaushish0408@gmail.com");
	}

	@Then("^I entered the phone number$")
	public void i_entered_the_phone_number() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("1234567899");

	}

	@Then("^I entered Login credential textbox$")
	public void i_entered_Login_credential_textbox() throws Throwable {
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("neetu");

	}

	@Then("^I select the password radio button$")
	public void i_select_the_password_radio_button() throws Throwable {
		driver.findElement(By.xpath("(//*[@type=\"radio\"])[1]")).click();

	}

	@Then("^I entered the password for user$")
	public void i_entered_the_password_for_user() throws Throwable {
		driver.findElement(By.xpath("//*[@name=\"password[password]\"]")).sendKeys("khanna");
	}

	@Then("^I  select the profile trainer$")
	public void i_select_the_profile_trainer() throws Throwable {
		
     driver.findElement(By.xpath("(//*[@class=\"filter-option\"])[1]")).click();
     driver.findElement(By.xpath("(//input[@class='form-control'])[8]")).sendKeys("Trainer");
   }

	@Then("^I click on add button$")
	public void i_click_on_add_button() throws Throwable {
        driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
	}
	
	@Then("^Verify message$")
	public void verify_message() throws Throwable {
		 driver.findElement(By.xpath("//*[contains(text(),'The user has been added: ')] ")).isDisplayed();
	}
	
	@Then("^Delete the user$")
	public void delete_the_user() throws Throwable {
		driver.findElement(By.xpath("//*[@name='keyword']")).sendKeys("neetu01");
		driver.findElement(By.xpath("(//*[@name='submit'])[1]")).click();
		driver.findElement(By.xpath("//*[@alt='Delete']")).click();
		driver.switchTo().alert().accept();
	}	
	
	
	
	@Given("^I launch the learning application$")
	public void i_launch_the_learning_application() throws Throwable {
		WebDriver driver = Configurations.createFireFoxDriver();
		driver.get(url);
	}

	@Then("^I entered the teacher login \"([^\"]*)\"$")
	public void i_entered_the_teacher_login(String username) throws Throwable {
		driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys(username);

	}

	@Then("^I entered the teacher password \"([^\"]*)\"$")
	public void i_entered_the_teacher_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^submit button$")
	public void submit_button() throws Throwable {
		driver.findElement(By.cssSelector("button[name=submitAuth]")).click();

	}
		
	@When("^I click on create a course$")
	public void i_click_on_create_a_course() throws Throwable {
	    driver.findElement(By.xpath("//*[@href='main/create_course/add_course.php']")).click();
	}

	@Then("^I enter the course name$")
	public void i_enter_the_course_name() throws Throwable {
	 driver.findElement(By.id("title")).sendKeys("4sele");   
	}

	@Then("^I click on advanced setting$")
	public void i_click_on_advanced_setting() throws Throwable {
	    driver.findElement(By.id("advanced_params")).click();
	}

	@Then("^I entered category list$")
	public void i_entered_category_list() throws Throwable {
		driver.findElement(By.xpath("(//*[@class=\"filter-option\"])[1]")).click();
	     driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Projects");
	}

	@Then("^I entered the course code$")
	public void i_entered_the_course_code() throws Throwable {
        driver.findElement(By.id("add_course_wanted_code")).sendKeys("code4");

	}

	@Then("^I entered the language$")
	public void i_entered_the_language() throws Throwable {
		driver.findElement(By.xpath("(//*[@class=\"filter-option\"])[2]")).click();
	     driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("English");
	}

	@Then("^I click on create a course button$")
	public void i_click_on_create_a_course_button() throws Throwable {
	    driver.findElement(By.id("add_course_submit")).click();
	}

	@Then("^I click on add add a introduction icon$")
	public void i_click_on_add_add_a_introduction_icon() throws Throwable {
	  driver.findElement(By.xpath("(//*[@class=\"fa fa-file-text\"])[2]")).click();
	}

	@Then("^I entered the valid credential$")
	public void i_entered_the_valid_credential() throws Throwable {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
	   
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).click();
		   
	    
	    driver.findElement(By.xpath("//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("This is new course");
		   
	}

	@Then("^I click save intro text$")
	public void i_click_save_intro_text() throws Throwable {
	    driver.findElement(By.id("introduction_text_intro_cmdUpdate")).click();
	}

	@Then("^Verification message$")
	public void verification_message() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(),'Intro was updated')] ")).isDisplayed();
	}


}
