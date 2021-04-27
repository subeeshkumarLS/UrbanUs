package com.urban.us.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.urban.us.base.TestBas;

public class HomePg extends TestBas {
	
public HomePg() throws IOException{
	PageFactory.initElements(driver, this);
}

public void sendInvite()
{
	driver.findElement(By.xpath("//button[text()='Invite Startup']")).click();
	driver.findElement(By.name("emailId")).sendKeys("subi@inboxbear.com");
	driver.findElement(By.xpath("//button[text()='Send Invite']")).click();
	
}

}
