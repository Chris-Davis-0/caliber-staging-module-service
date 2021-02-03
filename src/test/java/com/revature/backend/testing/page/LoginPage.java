package com.revature.backend.testing.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
private WebDriver driver;
	
	@FindBy(xpath = "//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;
	
	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		this.loginButton.click();
	}
}