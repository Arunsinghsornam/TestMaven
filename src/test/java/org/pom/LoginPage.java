package org.pom;
import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class LoginPage extends BaseClass {
	public WebElement getLoginselectbranch() {
		return loginselectbranch;
	}

	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement userPassWord;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement logInButton;
	
	@FindBy(xpath = "//select[@id='branchId']")
	private WebElement loginselectbranch;
	
	@FindBy(xpath = "//input[@id='employeeId']")
	private WebElement Employeecode;

	@FindBy(xpath="//select[@id='branchId']")
	private WebElement Admin_selectBranch;
	
	@FindBy(xpath="//input[@id='employeeId']")
	private WebElement Admin_EmployeeCode;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Admin_Password;
	
	public WebElement getAdmin_EmployeeCode() {
		return Admin_EmployeeCode;
	}

	public WebElement getAdmin_Password() {
		return Admin_Password;
	}

	public WebElement getAdmin_selectBranch() {
		return Admin_selectBranch;
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getloginselectbranch() {
		return loginselectbranch;
	}
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getUserPassWord() {
		return userPassWord;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}
	
	public WebElement getEmployeecode() {
		return Employeecode;
	}
	
	@FindBy (xpath="//a[normalize-space()='Log out']")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	  @FindBy(xpath = "//input[@id='emailid']")
		private WebElement Email;
		
		@FindBy(xpath = "//input[@id='mobileno']")
		private WebElement Mobile;
		
		@FindBy(xpath = "//button[@id='btnVerify']")
		private WebElement GenerateOTPbtn;
	 
		public WebElement getEmail() {
			return Email;
		}
	 
		public WebElement getMobile() {
			return Mobile;
		}
	 
		public WebElement getGenerateOTPbtn() {
			return GenerateOTPbtn;
		}
		
		public WebElement getMobileOTP() {
			return MobileOTP;
		}
	 
		public WebElement getEmailOTP() {
			return EmailOTP;
		}
	 
		public WebElement getNewpassword() {
			return Newpassword;
		}
	 
		public WebElement getConformpassword() {
			return Conformpassword;
		}
	 
		public WebElement getUpdatepassword() {
			return Updatepassword;
		}
	 
		public WebElement getResendOTP() {
			return ResendOTP;
		}
		@FindBy(xpath = "//input[@id='mobileotp']")
		private WebElement MobileOTP;
		
		@FindBy(xpath = "//input[@id='emailotp']")
		private WebElement EmailOTP;
		
		@FindBy(xpath = "//input[@id='txtpassword']")
		private WebElement Newpassword;
		
		@FindBy(xpath = "//input[@id='txtConfirmPassword']")
		private WebElement Conformpassword;
		
		
		@FindBy(xpath = "//button[@id='btnAddQuick']")
		private WebElement Updatepassword;
		
		@FindBy(xpath = "//button[@id='btnResendotp']")
		private WebElement ResendOTP;
		//-------------------------------policy
		
				@FindBy(xpath="//a[@id='for_pass']")
				private WebElement forgot_passwoard;
				
				@FindBy(xpath="//input[@id='empcode']")
				private WebElement admin_empcode;
				
				@FindBy(xpath="//input[@id='emailid']")
				private WebElement admin_emailid;

				
				@FindBy(xpath="//input[@id='mobileno']")
				private WebElement admin_mobileno;
				
				
				@FindBy(xpath="//button[@id='btnVerify']")
				private WebElement admin_btnVerify;

				

				@FindBy(xpath="//button[normalize-space()='Login']")
				private WebElement admin_Loinbutton;

				

				public WebElement getAdmin_Loinbutton() {
					return admin_Loinbutton;
				}

				public WebElement getAdmin_btnVerify() {
					return admin_btnVerify;
				}

				public WebElement getAdmin_mobileno() {
					return admin_mobileno;
				}

				public WebElement getAdmin_emailid() {
					return admin_emailid;
				}

				public WebElement getAdmin_empcode() {
					return admin_empcode;
				}

				public WebElement getForgot_passwoard() {
					return forgot_passwoard;
				}
				@FindBy(xpath="//*[@id=\"username\"]")
				private WebElement userName1;
				@FindBy(xpath="//*[@id=\"password\"]")
				private WebElement Password;
				@FindBy(xpath="/html/body/div/div/form/button")
				private WebElement Clicklogin;

				public WebElement getUserName1() {
					return userName1;
				}

				public WebElement getPassword() {
					return Password;
				}

				public WebElement getClicklogin() {
					return Clicklogin;
				}

}