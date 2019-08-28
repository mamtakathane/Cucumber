package com.StepDefination;


	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;
	import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class LoginStepDefination {
	WebDriver driver;
		
		
		@Given("^user is already on login page$")
		
		public void user_is_already_on_login_page(){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
			
		}
		@When("^title of login page is AdminLTE$")
		public void title_of_login_page_is_AdminLTE(){
			
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("AdminLTE", title);
			
			
		}
		@Then("^user enters username and password$")
		public void user_enters_username_and_password(){
			
		driver.findElement(By.name("username")).sendKeys("kiran@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
			
			 
		}
		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button(){
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//JavaScriptExecutor js=(JavaScriptExecutor)driver;
				//js.executeScript("arguments[0].click();",loginbtn);
		
		
		}
		@And("^ user is on home page$")
		public void user_is_on_home_page(){
		String title=driver.getTitle();
		System.out.println("home page title "+title);
		Assert.assertEquals("AdminLTE", title);
			
			
		}
		
	}
		
		
		
		

	
	
	
	
	

