package com.urban.us.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.urban.us.base.TestBas;
import com.urban.us.pages.HomePg;
import com.urban.us.pages.LoginPg;

public class HomePgTest extends TestBas {
	LoginPg login;
	HomePg home;
	
public HomePgTest() throws IOException {
	super();
}

@BeforeMethod
public void setup() throws IOException, InterruptedException
{
	init();
	login = new LoginPg();
	home  = new HomePg();
	home  = login.loginTest();
	
}

@Test(priority=1)
public void sendInviteTest() {
	home.sendInvite();
}

}
