package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FBLoginPageSteps {
	
	public static WebDriver driver;
	
	@Given("user has to be in the FB login page")
	public void user_has_to_be_in_the_FB_login_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Kannan\\CucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@When("user has to fill the username and password")
	public void user_has_to_fill_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("kanna608@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9442432207");
	    	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("verify user is navigating to the login page")
	public void verify_user_is_navigating_to_the_login_page() {
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		System.out.println("User is unable to login");
	    
	}

}
