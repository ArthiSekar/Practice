package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookHotelStep {
	WebDriver driver;

	@Given("User is on the Adactin page")
	public void userIsOnTheAdactinPage() {
		WebDriverManager.chromiumdriver().setup();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		
	}
	
	@When("User should perform login {string} , {string}")
	public void userShouldPerformLogin(String userName, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(userName);

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	
	
	@Then("User should verify after login {string}")
	public void userShouldVerifyAfterLogin(String string) {
		Assert.assertTrue("Hello Balaji2507!", true);
	}
	
	
	@Then("User should perform Search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldPerformSearchHotelAnd(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		
		WebElement dDnLocation = driver.findElement(By.id("location"));
		dDnLocation.sendKeys(location);

		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		dDnHotel.sendKeys(hotels);

		WebElement dDnRoomType = driver.findElement(By.id("room_type"));
		dDnRoomType.sendKeys(roomType);

		WebElement dDnnoofRooms = driver.findElement(By.id("room_nos"));
		dDnnoofRooms.sendKeys(noOfRooms);

		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		dateIn.sendKeys(checkInDate);

		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		dateOut.sendKeys(checkOutDate);

		WebElement dDnAdultPerRoom = driver.findElement(By.id("adult_room"));
		dDnAdultPerRoom.sendKeys(adultsPerRoom);

		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
		dDnChildPerRoom.sendKeys(childrenPerRoom);

		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	}
	
	
	@Then("User should verify after Search hotel {string}")
	public void userShouldVerifyAfterSearchHotel(String string) {
		Assert.assertTrue("Select Hotel", true);
	}
	
	@Then("User should Select the Hotel Name")
	public void userShouldSelectTheHotelName() {
		WebElement RadiobtnSelect = driver.findElement(By.id("radiobutton_0"));
		RadiobtnSelect.click();

		WebElement btnSearchHotel = driver.findElement(By.id("continue"));
		btnSearchHotel.click();
		
	}
	
	@Then("User should verify message {string} after click Continue")
	public void userShouldVerifyMessageAfterClickContinue(String string) {
		Assert.assertTrue("verify Book Hotel message", true);
	}
	
	@Then("User should perform Book hotel {string},{string} and {string}")
	public void userShouldPerformBookHotelAnd(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) {
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(firstName);

		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(lastName);

		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(address);

	}
	@Then("User should verify after Book Hotel {string}")
	public void userShouldVerifyAfterBookHotel(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User should Cancel Order id")
	public void userShouldCancelOrderId() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User should verify after cancel Order id {string}")
	public void userShouldVerifyAfterCancelOrderId(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
