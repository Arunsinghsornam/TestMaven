package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalAccidentGroup extends BaseClass {

	
	
	@FindBy(xpath = "//h3[normalize-space()='Personal Accident']")
	private WebElement ps_PersonalAccident;
	@FindBy(xpath = "//h3[normalize-space()='Retail']")
	private WebElement ps_Retail;
 
	@FindBy(xpath = "//h3[normalize-space()='Group']")
	private WebElement ps_Group;
	@FindBy(xpath = "//span[normalize-space()='Sales']")
	private WebElement Sales;
	@FindBy(xpath = "//a[normalize-space()='Product Segments']")
	private WebElement productSegments;
	
	
	
	public WebElement getPs_PersonalAccident() {
	return ps_PersonalAccident;
}

public WebElement getPs_Retail() {
	return ps_Retail;
}

public WebElement getPs_Group() {
	return ps_Group;
}

public WebElement getSales() {
	return Sales;
}

public WebElement getProductSegments() {
	return productSegments;
}
	
	// ...................After click the Personal Accident..group.............//
	 
		// ......personal accident group .........(pag)................//
		
		// ........fixed and variable both are common paths............//
	




		@FindBy(xpath = "//a[@class='btn btn-primary']")
		private WebElement PersonalAccidentgroupFixedViewPlans;
	 
		@FindBy(xpath = "//a[@class='btn btn-xs btn-default']")
		private WebElement PersonalAccidentgroupFixedMasterPolicy;
	 
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]")
		private WebElement PersonalAccidentgroupVariableViewPlans;
	 
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]")
		private WebElement PersonalAccidentgroupVariableMasterPolicy;
	 
		@FindBy(xpath = "//*[@id=\"div_premium\"]/div[1]/div[2]/div[2]/div[1]/a")
		private WebElement pag_Plan1individualbtn;
	 
		@FindBy(xpath = "//*[@id=\"div_premium\"]/div[1]/div[2]/div[2]/div[2]/a")
		private WebElement pag_Plan1bulkUploadbtn;
	 
		@FindBy(xpath = "//*[@id=\\\"div_premium\\\"]/div[2]/div[2]/div[2]/div[1]/a")
		private WebElement pag_Plan2individualbtn;
	 
		@FindBy(xpath = "//*[@id=\"div_premium\"]/div[2]/div[2]/div[2]/div[2]/a")
		private WebElement pag_Plan2bulkUploadbtn;
	 
		@FindBy(xpath = "//*[@id=\\\"div_premium\\\"]/div[3]/div[2]/div[2]/div[1]/a")
		private WebElement pag_Plan3individualbtn;
	 
		@FindBy(xpath = "//*[@id=\"div_premium\"]/div[3]/div[2]/div[2]/div[2]/a")
		private WebElement pag_Plan3bulkUploadbtn;
	 
		
		
		public WebElement getPersonalAccidentgroupFixedViewPlans() {
			return PersonalAccidentgroupFixedViewPlans;
		}
	 
		public WebElement getPersonalAccidentgroupFixedMasterPolicy() {
			return PersonalAccidentgroupFixedMasterPolicy;
		}
	 
		public WebElement getPersonalAccidentgroupVariableViewPlans() {
			return PersonalAccidentgroupVariableViewPlans;
		}
	 
		public WebElement getPersonalAccidentgroupVariableMasterPolicy() {
			return PersonalAccidentgroupVariableMasterPolicy;
		}
	 
		public WebElement getPag_Plan1individualbtn() {
			return pag_Plan1individualbtn;
		}
	 
		public WebElement getPag_Plan1bulkUploadbtn() {
			return pag_Plan1bulkUploadbtn;
		}
	 
		public WebElement getPag_Plan2individualbtn() {
			return pag_Plan2individualbtn;
		}
	 
		public WebElement getPag_Plan2bulkUploadbtn() {
			return pag_Plan2bulkUploadbtn;
		}
	 
		public WebElement getPag_Plan3individualbtn() {
			return pag_Plan3individualbtn;
		}
	 
		public WebElement getPag_Plan3bulkUploadbtn() {
			return pag_Plan3bulkUploadbtn;
		}
	 
		
	 
		// After click the bulkupload button.............//
	 
		@FindBy(xpath = "//input[@id='excelfile']")
		private WebElement pag_bulk_UploadExcelfile;
	 
		public WebElement getPag_bulk_UploadExcelfile() {
			return pag_bulk_UploadExcelfile;
		}
	 
	 
		// ....after click the personal accident individual button.............//
	 
		// .........Proposor details......(pd)......................//
	 
		@FindBy(xpath = "//input[@id='custid']")
		private WebElement pag_pd_customerid;
	 
		@FindBy(xpath = "//input[@id='mobno']")
		private WebElement pag_pd_mobileNo;
	 
		@FindBy(xpath = "//select[@id='salutationid']")
		private WebElement pag_pd_FirstNameSelectMrMrs;
	 
		@FindBy(xpath = "//input[@id='fname']")
		private WebElement pag_pd_FirstName;
	 
		@FindBy(xpath = "//input[@id='email']")
		private WebElement pag_pd_Email;
	 
		@FindBy(xpath = "//input[@id='lname']")
		private WebElement pag_pd_Lastname;
	 
		@FindBy(xpath = "//textarea[@id='address']")
		private WebElement pag_pd_Address1;
	 
		@FindBy(xpath = "//input[@id='city_name']")
		private WebElement pag_pd_City;
	 
		@FindBy(xpath = "//select[@id='state_id']")
		private WebElement pag_pd_StateSelect;
	 
		@FindBy(xpath = "//textarea[@id='second_address']")
		private WebElement pag_pd_Address2;
	 
		@FindBy(xpath = "//select[@id='policy_term_id']")
		private WebElement pag_pd_SumInsuredSelect;
	 
		@FindBy(xpath = "//input[@id='pin_code']")
		private WebElement pag_pd_pinCode;
	 
		@FindBy(xpath = "//div[contains(@class,'col-lg-12')]//div[@id='ibox1']//a[contains(@class,'collapse-link')]")
		private WebElement pag_pd_proposordetailsArrowbutton;
	 
		
		
		
		
		public WebElement getPag_pd_customerid() {
			return pag_pd_customerid;
		}
	 
		public WebElement getPag_pd_mobileNo() {
			return pag_pd_mobileNo;
		}
	 
		public WebElement getPag_pd_FirstNameSelectMrMrs() {
			return pag_pd_FirstNameSelectMrMrs;
		}
	 
		public WebElement getPag_pd_FirstName() {
			return pag_pd_FirstName;
		}
	 
		public WebElement getPag_pd_Email() {
			return pag_pd_Email;
		}
	 
		public WebElement getPag_pd_Lastname() {
			return pag_pd_Lastname;
		}
	 
		public WebElement getPag_pd_Address1() {
			return pag_pd_Address1;
		}
	 
		public WebElement getPag_pd_City() {
			return pag_pd_City;
		}
	 
		public WebElement getPag_pd_StateSelect() {
			return pag_pd_StateSelect;
		}
	 
		public WebElement getPag_pd_Address2() {
			return pag_pd_Address2;
		}
	 
		public WebElement getPag_pd_SumInsuredSelect() {
			return pag_pd_SumInsuredSelect;
		}
	 
		public WebElement getPag_pd_pinCode() {
			return pag_pd_pinCode;
		}
	 
		public WebElement getPag_pd_proposordetailsArrowbutton() {
			return pag_pd_proposordetailsArrowbutton;
		}
	 
		
	 
		// .......................member details................//
	 
		// ...............Adult 1..............//
	 
		@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/a[1]/i")
		private WebElement pag_memberdetailsArrowbtn;
	 
		@FindBy(xpath = "//div[@id='theid_0']//div[contains(@class,'col-sm-4 border-right d-member')]//input[contains(@placeholder,'Full Name')]")
		private WebElement pag_adult1_firstname;
	 
		@FindBy(xpath = "//div[@id='theid_0']//div[contains(@class,'col-sm-4 border-right d-member')]//input[contains(@placeholder,'Last Name')]")
		private WebElement pag_adult1_Lastname;
	 
		@FindBy(xpath = "//div[@id='theid_0']//input[@id='memdateofbirth']")
		private WebElement pag_adult1_DateOfBirth;
	 
		@FindBy(xpath = "//*[@id=\"memdata-0\"]/div/div[1]/div[4]/div[1]/label")
		private WebElement pag_adult1_GenderclickMale;
	 
		@FindBy(xpath = "//*[@id=\"memdata-0\"]/div/div[1]/div[4]/div[2]/label")
		private WebElement pag_adult1_GenderclickFemale;
	 
		@FindBy(xpath = "//*[@id=\"relation\"]")
		private WebElement pag_adult1_relationshipSelect;
	 
		
		
		
		
		public WebElement getPag_memberdetailsArrowbtn() {
			return pag_memberdetailsArrowbtn;
		}
	 
		public WebElement getPag_adult1_firstname() {
			return pag_adult1_firstname;
		}
	 
		public WebElement getPag_adult1_Lastname() {
			return pag_adult1_Lastname;
		}
	 
		public WebElement getPag_adult1_DateOfBirth() {
			return pag_adult1_DateOfBirth;
		}
	 
		public WebElement getPag_adult1_GenderclickMale() {
			return pag_adult1_GenderclickMale;
		}
	 
		public WebElement getPag_adult1_GenderclickFemale() {
			return pag_adult1_GenderclickFemale;
		}
	 
		public WebElement getPag_adult1_relationshipSelect() {
			return pag_adult1_relationshipSelect;
		}
	 
		
	 
		// ............Nominee Details...........................//
	 
		@FindBy(xpath = "//select[@id='nom_salutationid']")
		private WebElement pag_Nominee_NomineeSalutationSelect;
	 
		@FindBy(xpath = "//div[@id='theid_0']//input[@placeholder='First Name']")
		private WebElement pag_Nominee_Firstname;
	 
		@FindBy(xpath = "//div[@id='theid_0']//div[contains(@class,'col-sm-4 border-right d-nominee')]//input[contains(@placeholder,'Last Name')]")
		private WebElement pag_Nominee_LastName;
	 
		@FindBy(xpath = "//div[@id='theid_0']//div[contains(@class,'col-sm-4 border-right d-nominee')]//input[contains(@placeholder,'Select Date')]")
		private WebElement pag_Nominee_DateOfBirth;
	 
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/label[1]")
		private WebElement pag_Nominee_GenderClickMale;
	 
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[2]/label[1]")
		private WebElement pag_Nominee_GenderClickFemale;
	 
		@FindBy(xpath = "//div[@id='theid_0']//div[@class='col-sm-4 border-right d-nominee']//select[@id='relation']")
		private WebElement pag_Nominee_RelationshipSelect;
	 
		@FindBy(xpath = "//div[@id='theid_0']//input[@placeholder='Mobile No']")
		private WebElement pag_Nominee_MobileNo;
	 
		@FindBy(xpath = "//div[@id='theid_0']//input[contains(@placeholder,'Address 1')]")
		private WebElement pag_Nominee_Address1;
	 
		@FindBy(xpath = "//div[@id='theid_0']//input[contains(@placeholder,'Address 2')]")
		private WebElement pag_Nominee_Address2;
	 
		
		
		
		public WebElement getPag_Nominee_NomineeSalutationSelect() {
			return pag_Nominee_NomineeSalutationSelect;
		}
	 
		public WebElement getPag_Nominee_Firstname() {
			return pag_Nominee_Firstname;
		}
	 
		public WebElement getPag_Nominee_LastName() {
			return pag_Nominee_LastName;
		}
	 
		public WebElement getPag_Nominee_DateOfBirth() {
			return pag_Nominee_DateOfBirth;
		}
	 
		public WebElement getPag_Nominee_GenderClickMale() {
			return pag_Nominee_GenderClickMale;
		}
	 
		public WebElement getPag_Nominee_GenderClickFemale() {
			return pag_Nominee_GenderClickFemale;
		}
	 
		public WebElement getPag_Nominee_RelationshipSelect() {
			return pag_Nominee_RelationshipSelect;
		}
	 
		public WebElement getPag_Nominee_MobileNo() {
			return pag_Nominee_MobileNo;
		}
	 
		public WebElement getPag_Nominee_Address1() {
			return pag_Nominee_Address1;
		}
	 
		public WebElement getPag_Nominee_Address2() {
			return pag_Nominee_Address2;
		}
	 
		
	 
		// ...............................child 1..................................//
	 
		@FindBy(xpath = "//div[@id='theid_1']//div[contains(@class,'col-sm-4 border-right d-member')]//input[contains(@placeholder,'Full Name')]")
		private WebElement pag_child1_FirstName;
	 
		@FindBy(xpath = "//div[@id='theid_1']//div[contains(@class,'col-sm-4 border-right d-member')]//input[contains(@placeholder,'Last Name')]")
		private WebElement pag_child1_Lastname;
	 
		@FindBy(xpath = "//div[@id='theid_1']//input[@id='memdateofbirth']")
		private WebElement pag_child1_DateOfBirth;
	 
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/label[1]")
		private WebElement pag_child1_GenderclickMale;
	 
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[2]/label[1]")
		private WebElement pag_child1_GenderclickFemale;
	 
		@FindBy(xpath = "//div[@id='theid_1']//div[@class='col-sm-4 border-right d-member']//select[@id='relation']")
		private WebElement pag_child1_RelationshipSelect;
	 
		@FindBy(xpath = "//button[@id='btn-save']")
		private WebElement pag_Savebtn;
	 
		
	 
		public WebElement getPag_child1_FirstName() {
			return pag_child1_FirstName;
		}
	 
		public WebElement getPag_child1_Lastname() {
			return pag_child1_Lastname;
		}
	 
		public WebElement getPag_child1_DateOfBirth() {
			return pag_child1_DateOfBirth;
		}
	 
		public WebElement getPag_child1_GenderclickMale() {
			return pag_child1_GenderclickMale;
		}
	 
		public WebElement getPag_child1_GenderclickFemale() {
			return pag_child1_GenderclickFemale;
		}
	 
		public WebElement getPag_child1_RelationshipSelect() {
			return pag_child1_RelationshipSelect;
		}
	 
		public WebElement getPag_Savebtn() {
			return pag_Savebtn;
		}
	
	
	
	
	
	
}
