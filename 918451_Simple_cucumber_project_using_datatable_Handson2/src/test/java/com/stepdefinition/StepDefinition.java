package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	public static WebDriver driver;
	@Before
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("User is on Basic Contact Form Page")
	public void user_is_on_Basic_Contact_Form_Page() {
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples/basiccontact.php");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Basic Contact Form - myContactForm.com");
	}
	
	@When("User clicks on click here link")
	public void user_clicks_click_here_link() {
		driver.findElement(By.linkText("here")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Become a Site User - myContactForm.com");
	}
	
	@And("User enters valid name and email")
	public void user_enters_the_name_and_email_address(io.cucumber.datatable.DataTable data) {
		List<String> formData=data.asList();
		driver.findElement(By.id("name")).sendKeys(formData.get(0));
		driver.findElement(By.id("email")).sendKeys(formData.get(1));
	}

	@And("User fill other details")
	public void user_enters_other_details() {
		driver.findElement(By.id("user_signup")).sendKeys("abc453");
		driver.findElement(By.id("pass_signup")).sendKeys("password123");
		driver.findElement(By.name("pass2")).sendKeys("password123");
		driver.findElement(By.name("useragree")).click();	
	}
	

	@Then("User clicks the Submit button")
	public void clicks_the_Submit_button() {
		driver.findElement(By.name("Submit")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		try {
			wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"success_status\"]"))));
		} catch (Exception e) {
			
		}
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
}
