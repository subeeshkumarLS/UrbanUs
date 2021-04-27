package com.urban.us.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.urban.us.util.Testut;

public class TestBas {

	public static WebDriver driver;
	public static Properties prop;

	public TestBas() {
		try {
			prop = new Properties();
			FileInputStream io = new FileInputStream(
					"C:\\Users\\Lenovo\\eclipse-workspace\\UrbanUsTest\\src\\main\\java\\com\\urban\\us\\config\\conf.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void init() {
		// String browserName = prop.getProperty("browser");
		// if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\crm2\\chromedriver.exe");

		driver = new ChromeDriver();
		// }

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testut.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testut.IMPLICIT_WAIT, TimeUnit.SECONDS);

		// driver.get(prop.getProperty("url"));
		driver.get("https://actyv-invest-portal.dev.actyv.com/login");
	}

}
