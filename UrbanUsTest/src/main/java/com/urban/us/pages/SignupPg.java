package com.urban.us.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.urban.us.base.TestBas;

public class SignupPg extends TestBas {
	public SignupPg() throws IOException {
		PageFactory.initElements(driver, this);
	}

	String url = "https://actyv-invest-portal.dev.actyv.com/startup/registration/"
			+ "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImdnY3Q5YXV1bXByIiwib3JnYW5pemF0aW9uIjoiNjAzYTNlNWQwZjE5MTkyMDVmN2MyZTEzIiwiaWF0IjoxNjE5NTQzNDgwLCJleHAiOjE2MTk3MTYyODB9._"
			+ "25-2eh3ydr58jxjpudheCGIanMAhG4qHA60d7GRLBA";

	public void validateFirstName() {
		driver.get(url);
		driver.findElement(By.name("firstName")).sendKeys("Peter");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateLastName() {
		driver.get(url);
		driver.findElement(By.name("lastName")).sendKeys("Paul");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateEmail() {
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys("abc@12.com");
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validatePhone() {
		driver.get(url);
		driver.findElement(By.name("phone")).sendKeys("1212343434");
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validatePassword() {
		driver.get(url);
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateConfirmPassword() {
		driver.get(url);
		driver.findElement(By.name("passwordConfirm")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateWhiteSpaceFirstName() {
		driver.get(url);
		driver.findElement(By.name("firstName")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateWhiteSpaceLastName() {
		driver.get(url);
		driver.findElement(By.name("lastName")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateWhiteSpaceEmail() {
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateWhiteSpacePhone() {
		driver.get(url);
		driver.findElement(By.name("phone")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateWhiteSpacePassword() {
		driver.get(url);
		driver.findElement(By.name("password")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateWhiteSpaceConfirmPassword() {
		driver.get(url);
		driver.findElement(By.name("passwordConfirm")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validatePassTestCases() {
		driver.get(url);
		driver.findElement(By.name("firstName")).sendKeys("Peter");
		driver.findElement(By.name("lastName")).sendKeys("Pet");
		driver.findElement(By.name("email")).sendKeys("abc@12.com");
		driver.findElement(By.name("phone")).sendKeys("1212343434");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.name("passwordConfirm")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateCompanyName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("companyName")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateCompanyDomain() {
		driver.findElement(By.name("companyDomain")).sendKeys("nutella.com");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateOverview() {
		driver.findElement(By.name("overview"))
				.sendKeys("A startup or start-up is a company or project undertaken by an entrepreneur");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateBusinessModel() {
		driver.findElement(By.name("businessModel"))
				.sendKeys("A startup or start-up is a company or project undertaken by an entrepreneur");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateExampleCustomer() {
		driver.findElement(By.name("exampleCustomer"))
				.sendKeys("A startup or start-up is a company or project undertaken by an entrepreneur");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateSector() {
		Select sector = new Select(driver.findElement(By.name("sector")));
		sector.selectByIndex(1);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void validateSubSector() {
		Select Subsector = new Select(driver.findElement(By.name("subSector")));
		Subsector.selectByIndex(1);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	public void ValidateTeamSize() {
		driver.findElement(By.xpath("//div[text()='201-500']")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void ValidatePassedCases() {
		driver.findElement(By.name("companyName")).sendKeys("abc123");
		driver.findElement(By.name("companyDomain")).sendKeys("nutella.com");
		driver.findElement(By.name("overview"))
				.sendKeys("A startup or start-up is a company or project undertaken by an entrepreneur");
		driver.findElement(By.name("businessModel"))
				.sendKeys("A startup or start-up is a company or project undertaken by an entrepreneur");
		driver.findElement(By.name("exampleCustomer"))
				.sendKeys("A startup or start-up is a company or project undertaken by an entrepreneur");
		Select sector = new Select(driver.findElement(By.name("sector")));
		sector.selectByIndex(1);
		Select Subsector = new Select(driver.findElement(By.name("subSector")));
		Subsector.selectByIndex(1);
		driver.findElement(By.xpath("//div[text()='201-500']")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

	public void validateCountryName() {
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("India");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateStateName() {
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Tamil Nadu");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateCityName() {
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByVisibleText("Chennai");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateFundingStage() {
		Select fund = new Select(driver.findElement(By.name("fundingStage")));
		fund.selectByVisibleText("Seed");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateCeoName() {
		driver.findElement(By.name("ceoName")).sendKeys("Peter");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateCeoPhone() {
		driver.findElement(By.name("ceoPhone")).sendKeys("1515152525");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateCeoEmail() {
		driver.findElement(By.name("ceoEmail")).sendKeys("peter@gmail.com");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validatePitchDeck() {
		WebElement UploadFile = driver.findElement(By.name("pitchDeck"));
		UploadFile.sendKeys("C:\\Users\\Lenovo\\Desktop\\doc.pdf");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void validateCompanyLogo() {
		WebElement UploadImage = driver.findElement(By.name("companyLogo"));
		UploadImage.sendKeys("C:\\Users\\Lenovo\\Desktop\\images.png");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	public void submitAllDetails() throws InterruptedException {
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("India");
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Tamil Nadu");
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByVisibleText("Chennai");
		Select fund = new Select(driver.findElement(By.name("fundingStage")));
		fund.selectByVisibleText("Seed");
		driver.findElement(By.name("ceoName")).sendKeys("Peter");
		driver.findElement(By.name("ceoPhone")).sendKeys("1515152525");
		driver.findElement(By.name("ceoEmail")).sendKeys("peter@gmail.com");
		WebElement UploadFile = driver.findElement(By.name("pitchDeck"));
		UploadFile.sendKeys("E:\\Actyv Project\\HelloPitch.pdf");
		WebElement UploadImage = driver.findElement(By.name("companyLogo"));
		UploadImage.sendKeys("C:\\Users\\Lenovo\\Desktop\\images.png");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		

	}

}
