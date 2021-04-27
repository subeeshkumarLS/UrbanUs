package com.urban.us.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.urban.us.pages.HomePg;
import com.urban.us.base.TestBas;

public class LoginPg extends TestBas {
	
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "terms")
	WebElement checkbox;
	
	@FindBy(className = "button-primary")
	WebElement signupBtn;
	
	public LoginPg() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePg loginTest() throws IOException  {
		email.sendKeys("urbanus@gmail.com");
		password.sendKeys("12345678");
		checkbox.click();
		signupBtn.click();

		return new HomePg();

	}

}
