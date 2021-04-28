package com.urban.us.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.urban.us.base.TestBas;

import com.urban.us.pages.SignupPg;

public class SignUpPgTest extends TestBas {
	SignupPg sign;

	public SignUpPgTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		init();
		sign = new SignupPg();

	}

	@Test(priority = 1)
	public void validateFirstNameTest() {
		sign.validateFirstName();

	}

	@Test(priority = 2)
	public void validateLastNameTest() {
		sign.validateLastName();

	}

	@Test(priority = 3)
	public void validateEmailTest() {
		sign.validateEmail();

	}

	@Test(priority = 4)
	public void validatePhoneTest() {
		sign.validatePhone();

	}

	@Test(priority = 5)
	public void validatePasswordTest() {
		sign.validatePassword();

	}

	@Test(priority = 6)
	public void validateConfirmPasswordTest() {
		sign.validateConfirmPassword();

	}

	@Test(priority = 7)
	public void validateWhiteSpaceFirstNameTest() {
		sign.validateWhiteSpaceFirstName();

	}

	@Test(priority = 8)
	public void validateWhiteSpaceLastNameTest() {
		sign.validateWhiteSpaceLastName();

	}

	@Test(priority = 9)
	public void validateWhiteSpaceEmailTest() {
		sign.validateWhiteSpaceEmail();

	}

	@Test(priority = 10)
	public void validateWhiteSpacePhoneTest() {
		sign.validateWhiteSpacePhone();

	}

	@Test(priority = 11)
	public void validateWhiteSpacePasswordTest() {
		sign.validateWhiteSpacePassword();
	}

	@Test(priority = 12)
	public void validateWhiteSpacePasswordConfirmTest() {
		sign.validateConfirmPassword();

	}

	@Test(priority = 13)
	public void validatePassTestCasesTest() {
		sign.validatePassTestCases();

	}

	@Test(priority = 14)
	public void validateCompanyNameTest() throws InterruptedException {
		sign.validatePassTestCases();
		sign.validateCompanyName();

	}

	@Test(priority = 15)
	public void validateCompanyDomainTest() {
		sign.validatePassTestCases();
		sign.validateCompanyDomain();

	}

	@Test(priority = 16)
	public void validateOverviewTest() {
		sign.validatePassTestCases();
		sign.validateOverview();

	}

	@Test(priority = 17)
	public void validateBusinessModelTest() {
		sign.validatePassTestCases();
		sign.validateBusinessModel();

	}

	@Test(priority = 18)
	public void validateExampleCustomerTest() {
		sign.validatePassTestCases();
		sign.validateExampleCustomer();

	}

	@Test(priority = 19)
	public void validateSectorTest() {
		sign.validatePassTestCases();
		sign.validateSector();

	}

	@Test(priority = 19)
	public void validateSubSectorTest() {
		sign.validatePassTestCases();
		sign.validateSubSector();

	}

	@Test(priority = 20)
	public void validateTeamSizeTest() {
		sign.validatePassTestCases();
		sign.ValidateTeamSize();

	}

	@Test(priority = 21)
	public void validatePassedCaseTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();

	}

	@Test(priority = 22)
	public void validateCountryNameTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCountryName();

	}

	@Test(priority = 23)
	public void validateStateNameTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCountryName();
		sign.validateStateName();

	}

	@Test(priority = 24)
	public void validateCityNameTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCountryName();
		sign.validateStateName();
		sign.validateCityName();

	}

	@Test(priority = 25)
	public void validateFundingStageTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateFundingStage();

	}

	@Test(priority = 26)
	public void validateCeoNameTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCeoName();

	}
	@Test(priority = 27)
	public void validateCeoPhoneTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCeoPhone();

	}
	@Test(priority = 28)
	public void validateCeoEmailTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCeoEmail();

	}
	@Test(priority = 29)
	public void validatePitchDeckTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validatePitchDeck();

	}
	@Test(priority = 30)
	public void validateCompanyLogoTest() {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.validateCompanyLogo();

	}
	@Test(priority = 31)
	public void submitAllDetailsTest() throws InterruptedException {
		sign.validatePassTestCases();
		sign.ValidatePassedCases();
		sign.submitAllDetails();

	}
}
