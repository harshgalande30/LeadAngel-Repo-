package com.leadAngel.pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {	
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
	 private final WebDriver driver;
	 private final WebDriverWait wait;

	
	@FindBy(xpath = "//input[@formcontrolname='clientID']")
	WebElement txtClientid;

	@FindBy(xpath = "//input[@formcontrolname='emailId']")
	WebElement txtEmailId;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement txtPassword;

//	@FindBy(xpath = "//div[@class='innerLoginPanelLeft']//button[@type='submit']")
//	WebElement btnLogin;
	
	
	
	@FindBy(xpath = "//span[text()='Login ']")
	WebElement btnLogin;
	@FindBy(xpath = "//span[text()=' Forgot Password ? ']/ancestor::button")
	WebElement btnForgotPassword;

	@FindBy(xpath = "//input[@formcontrolname='clientId']")
	WebElement CidForgotPassword;

	@FindBy(xpath = "//input[@type='email']")
	WebElement EmailForgotPassword;

	@FindBy(xpath = "//span[text()='Request Password reset link']/ancestor::button")
	WebElement btnRequestPassword;

	@FindBy(xpath = "//div[@class=\"form-group\"]//button[@type=\"button\"]")
	WebElement btnCancelForgotPassword;

	@FindBy(xpath = "//div[text()='Reset link has been sent to your email account.']")
	WebElement SuccessForgotPassword;

	@FindBy(xpath = "//div[text()='SSO is not configured for this client']")
	WebElement ErrorForgotPassword;

	@FindBy(xpath = "//div[text()='Login Failed']")
	WebElement ErrorLogin;

	@FindBy(xpath = "//div[text()='Failed']")
	WebElement ErrorForgotPassword2;

	@FindBy(xpath = "(//input[@name='clientID'])[2]")
	WebElement ClientidSSO;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement btnLoginSSO;

	@FindBy(xpath = "//div[text()='Invalid Email Or Password Or Client ID']")
	WebElement ErrorLogin2;
	
	@FindBy(xpath = "//div[@class='centernotify']")
	WebElement DisplayForgotPasswordCenternotify;
	
	
	
	public Boolean DisplayForgotPasswordCenternotify(Boolean D) {
        wait.until(ExpectedConditions.visibilityOf(DisplayForgotPasswordCenternotify)).isDisplayed();
		return D = DisplayForgotPasswordCenternotify.isDisplayed();
	}

	
	
	public void setClientId(String cid) {
        wait.until(ExpectedConditions.visibilityOf(txtClientid)).clear();
		txtClientid.sendKeys(cid);
	}

	public void setEmail(String uname) {
        wait.until(ExpectedConditions.visibilityOf(txtEmailId)).clear();
		txtEmailId.sendKeys(uname);
	}

	public void setPassword(String pwd) {
        wait.until(ExpectedConditions.visibilityOf(txtPassword)).clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
        wait.until(ExpectedConditions.visibilityOf(btnLogin)).click();
	}

	public void ClickForgotButton() {
        wait.until(ExpectedConditions.visibilityOf(btnForgotPassword)).click();
	}

	public void CidForgotPassword(String cidFP) {
        wait.until(ExpectedConditions.visibilityOf(CidForgotPassword)).clear();
		CidForgotPassword.sendKeys(cidFP);
	}

	public void EmailForgotPassword(String EmailFP) {
        wait.until(ExpectedConditions.visibilityOf(EmailForgotPassword)).clear();
		EmailForgotPassword.sendKeys(EmailFP);
	}

	public void clickRequestPassword() {
        wait.until(ExpectedConditions.visibilityOf(btnRequestPassword)).click();
	}

	public void clickCancelForgotPassword() {
        wait.until(ExpectedConditions.visibilityOf(btnCancelForgotPassword)).click();
	}

	public Boolean DisplaySuccessForgotPassword(Boolean D) {
        wait.until(ExpectedConditions.visibilityOf(SuccessForgotPassword)).isDisplayed();
		return D = SuccessForgotPassword.isDisplayed();	
	}
	

	public Boolean DisplayErrorForgotPassword(Boolean E) {
        wait.until(ExpectedConditions.visibilityOf(ErrorForgotPassword)).isDisplayed();
		return E = ErrorForgotPassword.isDisplayed();
	}

	public Boolean DisplayErrorLogin(Boolean F) {
        wait.until(ExpectedConditions.visibilityOf(ErrorLogin)).isDisplayed();
		return F = ErrorLogin.isDisplayed();
	}

	public Boolean DisplayErrorLogin2(Boolean G) {
        wait.until(ExpectedConditions.visibilityOf(ErrorLogin2)).isDisplayed();
		return G = ErrorLogin2.isDisplayed();
	}

	public Boolean DisplayErrorForgotPassword2(Boolean H) {
        wait.until(ExpectedConditions.visibilityOf(ErrorForgotPassword2)).isDisplayed();
		return H = ErrorForgotPassword2.isDisplayed();
	}

	public void CidSSO(String cidsso) {
        wait.until(ExpectedConditions.visibilityOf(ClientidSSO)).clear();
		ClientidSSO.sendKeys(cidsso);
	}

	public void clickloginSSO() {
        wait.until(ExpectedConditions.visibilityOf(btnLoginSSO)).click();
	}
	
	//******************************************* OTP Verification X path *********************************************
	
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	WebElement ClickOnRememberMeCheckBox;
	
	@FindBy(xpath = "//input[@id='twostepcode']")
	WebElement EnterVerificationCode;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement ClickOnVerifyButton;
	
	@FindBy(xpath = "(//span[@class='bog']//span[text()='OTP for your LeadAngel sign-in'])[1]")
	WebElement ClickOnSignInOTPmessage;
	
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement EnterEmailID;
	
	@FindBy(xpath = "//button[@type='button']//span[text()='Next']")
	WebElement ClickOnNextButton;
	
	@FindBy(xpath = "//input[@name='Passwd']")
	WebElement EnterGmailPassword;
	
	@FindBy(xpath = "//h3[text()='Email - Gmail - Google']")
	WebElement ClickOnGmailLink;
	
	
	
	public void ClickOnNextButton() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnNextButton));
		ClickOnNextButton.click();
	}
	public void EnterEmailID() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(EnterEmailID));
		EnterEmailID.sendKeys("testautomation1210@gmail.com");
	}
	public void ClickOnGmailLink() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnGmailLink));
		ClickOnGmailLink.click();
	}
	public void ClickOnSignInOTPmessage() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnSignInOTPmessage));
		ClickOnSignInOTPmessage.click();
	}
	
	public void EnterVerificationCode() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(EnterVerificationCode));
		EnterVerificationCode.sendKeys("");
	}
	public void ClickOnRememberMeCheckBox() {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnRememberMeCheckBox));
		ClickOnRememberMeCheckBox.click();
	}
	
	
	
	
	
	
	
}