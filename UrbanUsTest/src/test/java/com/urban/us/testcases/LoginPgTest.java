package com.urban.us.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.urban.us.base.TestBas;
import com.urban.us.pages.HomePg;
import com.urban.us.pages.LoginPg;

public class LoginPgTest extends TestBas {
	
	LoginPg loginPg;
	HomePg  homePg;


	public LoginPgTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		loginPg = new LoginPg();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPg.validateLoginPageTitle();
		Assert.assertEquals(title, "Urban Us");
	}

	@Test(priority = 2)
	public void loginTest() throws IOException, InterruptedException {
		homePg = loginPg.loginTest();
	}
	
	
	

}
