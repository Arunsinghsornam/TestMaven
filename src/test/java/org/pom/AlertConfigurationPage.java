package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertConfigurationPage  extends BaseClass{

	@FindBy(xpath="//span[normalize-space()='Alert Configuration']")
	private WebElement AlertConfiguration;
	
	@FindBy(xpath="//a[normalize-space()='Renewal Alerts Configuration']")
	private WebElement RenewalAlert;
	
	@FindBy(xpath="//button[normalize-space()='New Alert']")
	private WebElement AlertNewAlert;
	
	
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement AlertType;
	
	@FindBy (xpath="//li[normalize-space()='Renewal']")
	private WebElement AlertTypeClickRenewal;
	
	@FindBy (xpath="//li[normalize-space()='Claim']")
	private WebElement AlertTypeClickClaim;
	

	@FindBy(xpath="//div[@id='page-wrapper']//div//div[2]//div[1]//div[1]//div[1]")
	private WebElement AlertPolicyType; 
	@FindBy(xpath="//li[normalize-space()='Retail']")
	private WebElement AlertPolicyTypeRetailclick;
	
	@FindBy(xpath="//li[normalize-space()='Group']")
	private WebElement AlertPolicyTypeGroupclick;
	
	@FindBy(xpath="//textarea[@placeholder='Alert Name']")
	private WebElement AlertName;
	@FindBy(xpath="//textarea[@placeholder='Alert Description']")
	private WebElement AlertDescription;
	
	@FindBy(xpath="//input[@id='outlined-basic']")
	private WebElement AlertNoOfDays;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	private WebElement AlertNextButton;
	//Policy Details
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/input[1]")
	private WebElement AlertPolicyCheckBox;
	//Recipient
	
	@FindBy(xpath="//li[normalize-space()='GroupExpireEmailTemplate.html']")
	private WebElement AlertGroupexpirClick;
	@FindBy(xpath="//li[normalize-space()='GroupYetToExpireEmailTemplate.html']")
	private WebElement AlertGropYetClick;
	
	@FindBy(xpath="//li[normalize-space()='RetailExpireEmailTemplate.html']")
	private WebElement AlertRetailExpirTempClick;
	@FindBy(xpath="//li[normalize-space()='RetailYetToExpireEmailTemplate.html']")
	private WebElement AlertRetailYetClick;
	
	
	@FindBy(xpath="//div[@id='mui-component-select-SMSTemplate']")
	private WebElement AlertSuperAdminSmsTemplate;
	
	@FindBy(xpath="//button[normalize-space()='View Template']")
	private WebElement AlertViewSamTemplate;
	
	@FindBy(xpath="//div[@id='mui-component-select-EmailTemplate']")
	private WebElement AlertEmailTemplate;
	
	@FindBy(xpath="//a[normalize-space()='View Template']")
	private WebElement AlertViewEmailTemplate;
	
	@FindBy (xpath="//input[@name='SAsms']")
	private WebElement AlertSuperAdminSms;
	
	@FindBy (xpath="//input[@name='SAemail']")
	private WebElement AlertSuperAdminEmail;
	
	
	@FindBy(xpath="//input[@name='Asms']")
	private WebElement AlertAdminSmsCheckBox;
	
	@FindBy(xpath="//input[@name='Aemail']")
	private WebElement AlertAdminEmailCheckBox;
	
	@FindBy(xpath="//input[@name='EMPsms']")
	private WebElement AlertAdminEmployeeSms;
	
	@FindBy(xpath="//input[@name='EMPemail']")
	private WebElement AlertAdminEmployeeEmail;
	
	@FindBy(xpath="//div[11]//span[1]//input[1]")
	private WebElement AlertProAlertSettingSms;
	
	@FindBy(xpath="//div[12]//span[1]//input[1]")
	private WebElement AlertProAlertSettingEmail;
	
	@FindBy(xpath="//input[@name='PHemail']")
	private WebElement AlertPolicyHolderEmail;
	
	@FindBy(xpath="//div[17]//span[1]//input[1]")
	private WebElement AlertParssu;
	@FindBy(xpath="//div[18]//span[1]//input[1]")
	private WebElement AlertParssuEmailSms;
	
	@FindBy(xpath="//input[@placeholder='Type or paste email addresses and press `Enter`...']")
	private WebElement AlertTextBox;
	
	@FindBy(xpath="//button[normalize-space()='Back']")
	private WebElement AlertBackButton;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	private WebElement AlertSubmitButton;
	@FindBy(xpath="//button[normalize-space()='Ok']")
	private WebElement AlertSuccessButton;
	
	public WebElement getAlertSuccessButton() {
		return AlertSuccessButton;
	}

	public WebElement getAlertConfiguration() {
		return AlertConfiguration;
	}

	public WebElement getRenewalAlert() {
		return RenewalAlert;
	}
	

	public WebElement getAlertTypeClickRenewal() {
		return AlertTypeClickRenewal;
	}

	public WebElement getAlertTypeClickClaim() {
		return AlertTypeClickClaim;
	}

	public WebElement getAlertNewAlert() {
		return AlertNewAlert;
	}

	public WebElement getAlertType() {
		return AlertType;
	}

	public WebElement getAlertPolicyType() {
		return AlertPolicyType;
	}

	public WebElement getAlertPolicyTypeRetailclick() {
		return AlertPolicyTypeRetailclick;
	}

	public WebElement getAlertPolicyTypeGroupclick() {
		return AlertPolicyTypeGroupclick;
	}

	public WebElement getAlertName() {
		return AlertName;
	}

	public WebElement getAlertDescription() {
		return AlertDescription;
	}

	public WebElement getAlertNoOfDays() {
		return AlertNoOfDays;
	}

	public WebElement getAlertNextButton() {
		return AlertNextButton;
	}

	public WebElement getAlertPolicyCheckBox() {
		return AlertPolicyCheckBox;
	}

	public WebElement getAlertSuperAdminSmsTemplate() {
		return AlertSuperAdminSmsTemplate;
	}

	public WebElement getAlertViewSamTemplate() {
		return AlertViewSamTemplate;
	}

	public WebElement getAlertEmailTemplate() {
		return AlertEmailTemplate;
	}

	public WebElement getAlertViewEmailTemplate() {
		return AlertViewEmailTemplate;
	}

	public WebElement getAlertGroupexpirClick() {
		return AlertGroupexpirClick;
	}

	public WebElement getAlertGropYetClick() {
		return AlertGropYetClick;
	}

	public WebElement getAlertRetailExpirTempClick() {
		return AlertRetailExpirTempClick;
	}

	public WebElement getAlertRetailYetClick() {
		return AlertRetailYetClick;
	}

	public WebElement getAlertSuperAdminSms() {
		return AlertSuperAdminSms;
	}

	public WebElement getAlertSuperAdminEmail() {
		return AlertSuperAdminEmail;
	}

	public WebElement getAlertAdminSmsCheckBox() {
		return AlertAdminSmsCheckBox;
	}

	public WebElement getAlertAdminEmailCheckBox() {
		return AlertAdminEmailCheckBox;
	}

	public WebElement getAlertAdminEmployeeSms() {
		return AlertAdminEmployeeSms;
	}

	public WebElement getAlertAdminEmployeeEmail() {
		return AlertAdminEmployeeEmail;
	}

	public WebElement getAlertProAlertSettingSms() {
		return AlertProAlertSettingSms;
	}

	public WebElement getAlertProAlertSettingEmail() {
		return AlertProAlertSettingEmail;
	}

	public WebElement getAlertPolicyHolderEmail() {
		return AlertPolicyHolderEmail;
	}

	public WebElement getAlertParssu() {
		return AlertParssu;
	}

	public WebElement getAlertParssuEmailSms() {
		return AlertParssuEmailSms;
	}

	public WebElement getAlertTextBox() {
		return AlertTextBox;
	}

	public WebElement getAlertBackButton() {
		return AlertBackButton;
	}

	public WebElement getAlertSubmitButton() {
		return AlertSubmitButton;
	}

	public AlertConfigurationPage() {
		
		PageFactory.initElements(driver,this);

	}
}