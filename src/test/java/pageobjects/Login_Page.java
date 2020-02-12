package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;



public class Login_Page extends Base {
	
//	private WebDriver driver;
//	
	public Login_Page(){
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath=("//a[@id='nav-link-accountList']"))	
	private WebElement signInButton;
	
	@FindBy(xpath=("//input[@id='ap_email']"))
	private WebElement userName;
	
	@FindBy(xpath=("//input[@id='continue']"))
	private WebElement continueButton;
	
	@FindBy(xpath=("//input[@id='ap_password']"))
	private WebElement password;
	
	@FindBy(xpath=("//input[@id='signInSubmit']"))
	private WebElement signInSubmitButton;


	public void clickSignInButton() {
	signInButton.click();	}	
		
	public void enterUserName(String userName) {
	this.userName.sendKeys(userName); }
	
	public void clickContinueButton() {
	continueButton.click();	}
	
	public void enterpassword(String password) {
	this.password.sendKeys(password);	}
	
	public void clicksignInSubmitButton() {
	signInSubmitButton.click();	}
	
	
	}
