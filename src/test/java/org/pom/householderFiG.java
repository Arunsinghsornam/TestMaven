package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class householderFiG extends BaseClass{

	@FindBy(xpath="/html/body/div[3]/div[3]/div/button")
	private WebElement pwOk;
	
	public WebElement getPwOk() {
		return pwOk;
	}

	@FindBy(xpath="//span[normalize-space()='Sales']")
	private WebElement HHSales;
	
	@FindBy(xpath="//a[normalize-space()='Product Segments']")
	private WebElement ProductSegment;
	
	@FindBy(xpath="//div[@class='tile-stats pro_tile_10']")
	private WebElement HHhouseholder;
	
	@FindBy(xpath="//div[@class='tile-stats pro_tile_001R']")
	private WebElement HHRetail;
	
	@FindBy(xpath="//div[@class='tile-stats pro_tile_002G']")
	private WebElement HHGroup;
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[2]//div[2]//a[1]")
	private WebElement HHStructre;
	
	public WebElement getHHStructre() {
		return HHStructre;
	}
	@FindBy(xpath="//a[normalize-space()='Individual']")
	private WebElement individual;
	
	public WebElement getIndividual() {
		return individual;
	}

	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]")
	private WebElement ViewPlans;
	
	public WebElement getViewPlans() {
		return ViewPlans;
	}

	public WebElement getNomineeGuardian_Name() {
		return NomineeGuardian_Name;
	}

	public WebElement getNomineeGuardian_dob() {
		return NomineeGuardian_dob;
	}

	public WebElement getNomineeGuardian_Male() {
		return NomineeGuardian_Male;
	}

	public WebElement getNomineeGuardian_Female() {
		return NomineeGuardian_Female;
	}

	public WebElement getNomineeGuardian_Relationship() {
		return NomineeGuardian_Relationship;
	}

	@FindBy(xpath="//a[normalize-space()='Individual']")
	private WebElement HHViewPlansIndividual;
	@FindBy(xpath="//div[@id='Plans_Modal_CfDJ8HIYX4nAKWdBs9YPHdYG4j01CkmtFGavziWUNp8Db3mJTca0hMpM7WXC84WGbyBN3c3_7kI3Cnoqd8YjeBol_ZvJYwGiVCC-PC4MEeezMY6chbsmggwaZ3qzcSPVO5i2Fg']//div[@class='modal-header']//span[@aria-hidden='true'][normalize-space()='×']")
	private WebElement HHDetailsClosebutton;
	
	@FindBy(xpath="//input[@id='sqfeet']")
	private WebElement HHViewPlansCraptArea;
	
	@FindBy(xpath="//input[@id='costofconstruction']")
	private WebElement HHViewPlansSqfeet;
	
	@FindBy(xpath="//select[@id='state_id']")
	private WebElement HHViewPlansState;
	@FindBy(xpath="//select[@id='suminsured']")
	private WebElement HHViewPlansSuminsured;
	
	@FindBy(xpath="//button[@id='ViewPlans']")
	private WebElement HHViewPlansNextbutton;
	
	@FindBy(xpath="//button[@id='modal_close']")
	private WebElement HHViewPlansClosebutton;
	//=============================New proposal============================//
	@FindBy(xpath="//div[@class='panel-body']//div[1]//div[1]//div[1]//div[1]//div[2]//a[1]//i[1]")
	private WebElement HHcoverydetailsdropdown;
	@FindBy(xpath="//div[@class='col-lg-12']//div[@id='ibox1']//i[@class='fa fa-expand']")
	private WebElement HHcoveryexpand;
	@FindBy(xpath="//a[normalize-space()='Customer Details']")
	private WebElement HHCustomerdetails;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
	private WebElement HHCustomerdetaildropdown;
	
	@FindBy(xpath="//div[@class='panel-body']//div[1]//div[1]//div[1]//div[1]//div[2]//a[2]//i[1]")
	private WebElement HHCustomerdetailexpad;
	@FindBy(xpath="//input[@id='custid']")
	private WebElement HHCustomerid;
	
	
	@FindBy(xpath="//select[@id='salutationid']")
	private WebElement HHCustomerdetailssaluation;
	@FindBy(xpath="//input[@id='fname']")
	private WebElement HHCustomerdetailName;
	@FindBy(xpath="//input[@id='lname']")
	private WebElement HHCustomerdetailLastName;
	@FindBy(xpath="//div[@id='proposar']//div[@class='col-md-4 border-right']//div[1]//label[1]//div[1]")
	private WebElement HHCustomerdetailmale;
	@FindBy(xpath="//div[@id='proposar']//div[2]//label[1]//div[1]//ins[1]")
	private WebElement HHCustomerdetailfemale;
	
	 @FindBy(xpath="//input[@class='form-control proposerdob date-in-val']")
	 private WebElement HHCustomerdetailDate;
		
		@FindBy(xpath="//input[@id='email']")
		private WebElement HHCustomerdetailEmail;
		@FindBy(xpath="//input[@id='mobno']")
		private WebElement HHCustomerdetailMobile;
		@FindBy(xpath="//input[@id='aadharno']")
		private WebElement HHCustomerdetailAdhar;
		
		@FindBy(xpath="//input[@id='pancardno']")
		private WebElement HHCustomerdetailPan;
		@FindBy(xpath="//select[@id='state']")
		private WebElement HHCustomerdetailsState;
		@FindBy(xpath="//input[@id='cityid']")
		private WebElement HHCustomerdetailsCity;
	
	
	@FindBy(xpath="//input[@id='areaid']")
	private WebElement HHCustomerdetailArea;
	@FindBy(xpath="//textarea[@id='address1']")
	private WebElement HHCustomerdetailsAddress;
	@FindBy(xpath="//textarea[@id='address2']")
	private WebElement HHCustomerdetailsAddress2;
	@FindBy(xpath="//input[@id='pincode']")
	private WebElement HHCustomerdetailsPincode;
	@FindBy(xpath="//input[@id='annualincome']")
	private WebElement HHCustomerdetailsAnnualincome;
	@FindBy(xpath="//input[@id='occupation']")
	private WebElement HHCustomerdetailsOccupation;
	//==========================================Property details====================================
	@FindBy(xpath="//body//div[@id='wrapper']//div[@class='ibox-content']//div[@class='ibox-content']//div[2]//div[1]//div[1]//div[1]//div[2]//a[1]//i[1]")
	private WebElement HHPropertydetails;
	@FindBy(xpath="//i[@class='fa fa-compress']")
	private WebElement HHPropertydetailsexpand;
	@FindBy(xpath="//select[@id='propertytypeid']")
	private WebElement HHPropertytypeid;
	
	@FindBy(xpath="//input[@placeholder='Enter Property Age(year(s))']")
	private WebElement HHPropertyAge;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/label[1]/div[1]")
	private WebElement HHPropertylocatedYes;
	@FindBy(xpath="//div[@id='tab-0']//div[3]//div[2]//label[1]//div[1]")
	private WebElement HHPropertylocatedNo;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/label[1]/div[1]")
	private WebElement HHPropertyRentYes;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/label[1]/div[1]")
	private WebElement HHPropertyRentNo;
	@FindBy(xpath="//input[@id='propertysqfeet']")
	private WebElement HHPropertySqfeet;
	@FindBy(xpath="//input[@id='propertyareaid']")
	private WebElement HHPropertylocatedArea;
	@FindBy(xpath="//textarea[@id='propertyaddress']")
	private WebElement HHPropertylocatedAddress;
	@FindBy(xpath="//input[@id='propertycity']")
	private WebElement HHPropertyCity;
	@FindBy(xpath="//select[@id='propertystate']")
	private WebElement HHPropertyState;
	@FindBy(xpath="//input[@id='propertypincode']")
	private WebElement HHPropertyPincode;
	@FindBy(xpath="//input[@id='numberoffloors']")
	private WebElement HHPropertyNoofFloors;
	
	@FindBy(xpath="//input[@id='floornumber']")
	private WebElement HHPropertyfloorNo;
	@FindBy(xpath="//input[@id='existingloantenure']")
	private WebElement HHPropertyloanTenure;
	@FindBy(xpath="//input[@id='loansanctionedamount']")
	private WebElement HHPropertyloanSAmount;
	@FindBy(xpath="//input[@id='loandisbursalamount']")
	private WebElement HHPropertyL_D_Amount;
	
	@FindBy(xpath="//input[@placeholder='Select loan Date']")
	private WebElement HHPropertySelectloanDate;
	
	@FindBy(xpath="//input[@id='loanaccountnumber']")
	private WebElement HHPropertyloanAccnumber;
	@FindBy(xpath="//input[@id='risklocation']")
	private WebElement HHPropertyRiskloactions;
	@FindBy(xpath="//input[@id='risklocationcode']")
	private WebElement HHPropertyRisklocationcode;
	@FindBy(xpath="//input[@id='institutionname']")
	private WebElement HIsFinaceName;
	@FindBy(xpath="//input[@id='institutionbranch']")
	private WebElement HIsFinanceBranch;
	@FindBy(xpath="//input[@id='institutionlocation']")
	private WebElement HIsFinanceLocation;
	public WebElement getHIsFinaceName() {
		return HIsFinaceName;
	}

	public WebElement getHIsFinanceBranch() {
		return HIsFinanceBranch;
	}

	public WebElement getHIsFinanceLocation() {
		return HIsFinanceLocation;
	}

	public WebElement getHHNomineeCancelButton() {
		return HHNomineeCancelButton;
	}

	public WebElement getHHNomineeProposerOtpBox() {
		return HHNomineeProposerOtpBox;
	}

	public WebElement getHHNomineeNomineeOtp() {
		return HHNomineeNomineeOtp;
	}

	public WebElement getHHNomineeOtpCancelBtn() {
		return HHNomineeOtpCancelBtn;
	}

	public WebElement getHHNomineeOtpConfirmBtn() {
		return HHNomineeOtpConfirmBtn;
	}

	@FindBy(xpath="//button[@class='btn btn-info btnNext']")
	private WebElement HHPropertyNextButton;
	//===========================================Nominee details===================================
	@FindBy(xpath="//a[normalize-space()='Nominee Details']")
	private WebElement HHNomineedetails;
	@FindBy(xpath="//select[@id='nom_salutationid']")
	private WebElement HHNomineesalutationId;
	@FindBy(xpath="//input[@class='form-control name fullname alphabetAllow']")
	private WebElement HHNomineefristName;
	@FindBy(xpath="//input[@class='form-control name lastname alphabetAllow']")
	private WebElement HHNomineeLastName;
	@FindBy(xpath="//input[@class='form-control dateofbirth date-in-val']")
	private WebElement HHNominee_dob;
	@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//div[1]//label[1]//div[1]")
	private WebElement HHNomineeNo;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/label[1]/div[1]/ins[1]")
	private WebElement HHNomineeYes;
	@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//select[@id='relation']")
	private WebElement HHNomineeSelect;
	@FindBy(xpath="//input[@class='form-control number numericallow nom_mobno']")
	private WebElement HHNomineeMobile;
	@FindBy(xpath="//input[@class='form-control nomemail']")
	private WebElement HHNomineeEamil;
	@FindBy(xpath="//input[@placeholder='Address 1']")
	private WebElement HHNomineeAddress1;
	@FindBy(xpath="//input[@placeholder='Address 2']")
	private WebElement HHNomineeAddress2;
	@FindBy(xpath="//div[@class='icheckbox_square-green']")
	private WebElement HHIsCheckbox;
	@FindBy(xpath="//i[@class='fa fa-arrow-right']")
	private WebElement HHCustomerdetailsNextbutton;
	@FindBy(xpath="//button[@id='btn-save']")
	private WebElement HHSavebutton;
	@FindBy(xpath="//button[normalize-space()='Yes']")
	private WebElement HHNomineeOkButton;
	@FindBy(xpath="//button[@class='cancel']")
	private WebElement HHNomineeCancelButton;
	 
	@FindBy(xpath="//input[@id='confirmmobile_otp']")
	private WebElement HHNomineeProposerOtpBox;
	 
	@FindBy(xpath="//input[@id='confirmnomineemobile_otp']")
	private WebElement HHNomineeNomineeOtp;
	 
	@FindBy(xpath="//button[@type='button'][normalize-space()='Cancel']")
	private WebElement HHNomineeOtpCancelBtn;
	 
	@FindBy(xpath="//button[@id='confirm_policy']")
	private WebElement HHNomineeOtpConfirmBtn;
	@FindBy(xpath="//button[@class='btn btn-info btnBack']")
	private WebElement HHprevious_btn;
	//-------------------------------------------Guardian-----------------------
	@FindBy(xpath="//input[@placeholder='Full Name']")
	private WebElement NomineeGuardian_Name;
	@FindBy(xpath="//input[@class='form-control dateofbirth guard_dateofbirth date-in-val']")
	private WebElement NomineeGuardian_dob;
	@FindBy(xpath="//div[@class='col-sm-4 d-guard']//div[1]//label[1]//div[1]")
	private WebElement NomineeGuardian_Male;
	@FindBy(xpath="//div[@class='col-sm-4 d-guard']//div[2]//label[1]//div[1]//ins[1]")
	private WebElement NomineeGuardian_Female;
	@FindBy(xpath="//div[@class='col-sm-4 d-guard']//select[@id='relation']")
	private WebElement NomineeGuardian_Relationship;
	
	//================================================Bulk Upload====================================
	@FindBy(xpath="//div[@id='div_premium']//div[1]//div[2]//div[2]//div[2]//a[1]")
	private WebElement HHBulkupload;
	
	@FindBy(xpath="//i[@class='fa fa-compress']")
	private WebElement HHBulkuploadExpand;
	
	@FindBy(xpath="//a[normalize-space()='Click Here']")
	private WebElement HHBulkuploadClickHere;
	
	@FindBy(xpath="//input[@id='excelfilename']")
	private WebElement HHBulkuploadExcel;
	@FindBy(xpath="//label[@id='mymodal3_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//i[@class='fa fa-caret-down']")
	private WebElement HHSalespicth;
	@FindBy(xpath="//div[@id='myModal3_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//button[@type='button'][normalize-space()='×']")
	private WebElement HHSalespicthClose;
	@FindBy(xpath="//label[@id='mymodal2_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//i[@class='fa fa-caret-down']")
	private WebElement HHWhatsCovered;
	
	@FindBy(xpath="//div[@id='myModal2_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//button[@type='button'][normalize-space()='×']")
	private WebElement HHWhatsCoveredClose;
	@FindBy(xpath="//label[@id='mymodal2_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//i[@class='fa fa-caret-down']")
	private WebElement HHWhatsNotcovered;
	@FindBy(xpath="//div[@id='myModal4_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//button[@type='button'][normalize-space()='×']")
	private WebElement HHWhatsNotcoveredClose;
	@FindBy(xpath="//label[@id='mymodal_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//i[@class='fa fa-caret-down']")
	private WebElement HHPremium;
	@FindBy(xpath="//div[@id='myModal_CfDJ8HIYX4nAKWdBs9YPHdYG4j2RefSTX0OS0xD6hmPJQC4rjVxFECrQFFSBUovwZyb1EvllBG-s_jPu66MZy-Rym-AEeUCBZIb1Vhr0a2iB3xGA8szHkdNdxGHeLcopCYE_Ng']//span[@aria-hidden='true'][normalize-space()='×']")
	private WebElement HHPremiumClose;
	
	public WebElement getHHSales() {
		return HHSales;
	}

	public WebElement getProductSegment() {
		return ProductSegment;
	}

	public WebElement getHHhouseholder() {
		return HHhouseholder;
	}

	public WebElement getHHRetail() {
		return HHRetail;
	}

	public WebElement getHHGroup() {
		return HHGroup;
	}


	public WebElement getHHViewPlansIndividual() {
		return HHViewPlansIndividual;
	}

	public WebElement getHHDetailsClosebutton() {
		return HHDetailsClosebutton;
	}

	public WebElement getHHViewPlansCraptArea() {
		return HHViewPlansCraptArea;
	}

	public WebElement getHHViewPlansSqfeet() {
		return HHViewPlansSqfeet;
	}

	public WebElement getHHViewPlansState() {
		return HHViewPlansState;
	}

	public WebElement getHHViewPlansSuminsured() {
		return HHViewPlansSuminsured;
	}

	public WebElement getHHViewPlansNextbutton() {
		return HHViewPlansNextbutton;
	}

	public WebElement getHHViewPlansClosebutton() {
		return HHViewPlansClosebutton;
	}

	public WebElement getHHcoverydetailsdropdown() {
		return HHcoverydetailsdropdown;
	}

	public WebElement getHHcoveryexpand() {
		return HHcoveryexpand;
	}

	public WebElement getHHCustomerdetails() {
		return HHCustomerdetails;
	}

	public WebElement getHHCustomerdetaildropdown() {
		return HHCustomerdetaildropdown;
	}

	public WebElement getHHCustomerdetailexpad() {
		return HHCustomerdetailexpad;
	}

	public WebElement getHHCustomerid() {
		return HHCustomerid;
	}

	public WebElement getHHCustomerdetailssaluation() {
		return HHCustomerdetailssaluation;
	}

	public WebElement getHHCustomerdetailName() {
		return HHCustomerdetailName;
	}

	public WebElement getHHCustomerdetailLastName() {
		return HHCustomerdetailLastName;
	}

	public WebElement getHHCustomerdetailmale() {
		return HHCustomerdetailmale;
	}

	public WebElement getHHCustomerdetailfemale() {
		return HHCustomerdetailfemale;
	}

	public WebElement getHHCustomerdetailDate() {
		return HHCustomerdetailDate;
	}

	public WebElement getHHCustomerdetailEmail() {
		return HHCustomerdetailEmail;
	}

	public WebElement getHHCustomerdetailMobile() {
		return HHCustomerdetailMobile;
	}

	public WebElement getHHCustomerdetailAdhar() {
		return HHCustomerdetailAdhar;
	}

	public WebElement getHHCustomerdetailPan() {
		return HHCustomerdetailPan;
	}

	public WebElement getHHCustomerdetailsState() {
		return HHCustomerdetailsState;
	}

	public WebElement getHHCustomerdetailsCity() {
		return HHCustomerdetailsCity;
	}

	public WebElement getHHCustomerdetailArea() {
		return HHCustomerdetailArea;
	}

	public WebElement getHHCustomerdetailsAddress() {
		return HHCustomerdetailsAddress;
	}

	public WebElement getHHCustomerdetailsAddress2() {
		return HHCustomerdetailsAddress2;
	}

	public WebElement getHHCustomerdetailsPincode() {
		return HHCustomerdetailsPincode;
	}

	public WebElement getHHCustomerdetailsAnnualincome() {
		return HHCustomerdetailsAnnualincome;
	}

	public WebElement getHHCustomerdetailsOccupation() {
		return HHCustomerdetailsOccupation;
	}
//=================================Property Details================================
	public WebElement getHHPropertydetails() {
		return HHPropertydetails;
	}

	public WebElement getHHPropertydetailsexpand() {
		return HHPropertydetailsexpand;
	}

	public WebElement getHHPropertytypeid() {
		return HHPropertytypeid;
	}

	public WebElement getHHPropertyAge() {
		return HHPropertyAge;
	}

	public WebElement getHHPropertylocatedYes() {
		return HHPropertylocatedYes;
	}

	public WebElement getHHPropertylocatedNo() {
		return HHPropertylocatedNo;
	}

	public WebElement getHHPropertyRentYes() {
		return HHPropertyRentYes;
	}

	public WebElement getHHPropertyRentNo() {
		return HHPropertyRentNo;
	}

	public WebElement getHHPropertySqfeet() {
		return HHPropertySqfeet;
	}

	public WebElement getHHPropertylocatedArea() {
		return HHPropertylocatedArea;
	}

	public WebElement getHHPropertylocatedAddress() {
		return HHPropertylocatedAddress;
	}

	public WebElement getHHPropertyCity() {
		return HHPropertyCity;
	}

	public WebElement getHHPropertyState() {
		return HHPropertyState;
	}

	public WebElement getHHPropertyPincode() {
		return HHPropertyPincode;
	}

	public WebElement getHHPropertyNoofFloors() {
		return HHPropertyNoofFloors;
	}

	public WebElement getHHPropertyfloorNo() {
		return HHPropertyfloorNo;
	}

	public WebElement getHHPropertyloanTenure() {
		return HHPropertyloanTenure;
	}

	public WebElement getHHPropertyloanSAmount() {
		return HHPropertyloanSAmount;
	}

	public WebElement getHHPropertyL_D_Amount() {
		return HHPropertyL_D_Amount;
	}

	public WebElement getHHPropertySelectloanDate() {
		return HHPropertySelectloanDate;
	}

	public WebElement getHHPropertyloanAccnumber() {
		return HHPropertyloanAccnumber;
	}

	public WebElement getHHPropertyRiskloactions() {
		return HHPropertyRiskloactions;
	}

	public WebElement getHHPropertyRisklocationcode() {
		return HHPropertyRisklocationcode;
	}

	public WebElement getHHNomineedetails() {
		return HHNomineedetails;
	}

	public WebElement getHHNomineesalutationId() {
		return HHNomineesalutationId;
	}

	public WebElement getHHNomineefristName() {
		return HHNomineefristName;
	}

	public WebElement getHHNomineeLastName() {
		return HHNomineeLastName;
	}

	public WebElement getHHNominee_dob() {
		return HHNominee_dob;
	}

	public WebElement getHHNomineeNo() {
		return HHNomineeNo;
	}

	public WebElement getHHNomineeYes() {
		return HHNomineeYes;
	}

	public WebElement getHHNomineeSelect() {
		return HHNomineeSelect;
	}

	public WebElement getHHNomineeMobile() {
		return HHNomineeMobile;
	}

	public WebElement getHHNomineeEamil() {
		return HHNomineeEamil;
	}

	public WebElement getHHNomineeAddress1() {
		return HHNomineeAddress1;
	}

	public WebElement getHHNomineeAddress2() {
		return HHNomineeAddress2;
	}

	public WebElement getHHIsCheckbox() {
		return HHIsCheckbox;
	}

	public WebElement getHHCustomerdetailsNextbutton() {
		return HHCustomerdetailsNextbutton;
	}

	public WebElement getHHSavebutton() {
		return HHSavebutton;
	}

	public WebElement getHHNomineeOkButton() {
		return HHNomineeOkButton;
	}

	public WebElement getHHBulkupload() {
		return HHBulkupload;
	}

	public WebElement getHHBulkuploadExpand() {
		return HHBulkuploadExpand;
	}

	public WebElement getHHBulkuploadClickHere() {
		return HHBulkuploadClickHere;
	}

	public WebElement getHHBulkuploadExcel() {
		return HHBulkuploadExcel;
	}

	public WebElement getHHSalespicth() {
		return HHSalespicth;
	}

	public WebElement getHHSalespicthClose() {
		return HHSalespicthClose;
	}

	public WebElement getHHWhatsCovered() {
		return HHWhatsCovered;
	}

	public WebElement getHHWhatsCoveredClose() {
		return HHWhatsCoveredClose;
	}

	public WebElement getHHWhatsNotcovered() {
		return HHWhatsNotcovered;
	}

	public WebElement getHHWhatsNotcoveredClose() {
		return HHWhatsNotcoveredClose;
	}

	public WebElement getHHPremium() {
		return HHPremium;
	}

	public WebElement getHHPremiumClose() {
		return HHPremiumClose;
	}

	public WebElement getHHPropertyNextButton() {
		return HHPropertyNextButton;
	}
	
public WebElement getHHprevious_btn() {
		return HHprevious_btn;
	}

	//-------------------------------------------------------Newly add------------------------------------
	@FindBy(xpath="//select[@id='tenure_id']")
	private WebElement HHtenure;
	@FindBy(xpath="//input[@id='suminsured']")
	private WebElement HHsuminsured;
	@FindBy(xpath="//input[@id='applianceId']")
	private WebElement HHveribleApplianceid;
	
	@FindBy(xpath="//input[@id='txtManufacturer']")
	private WebElement HHveribletextManufacturer;
	@FindBy(xpath="//input[@id='propertyage']")
	private WebElement HHveriblePropertyAge;
	@FindBy  (xpath="//input[@id='propertycost']")
	private WebElement HHveriblePropertcost;
	@FindBy(xpath="//input[@id='invoicenumber']")
	private WebElement HHveribleinvoicenuber;
	@FindBy(xpath="//button[@class='btn btn-sm btn-danger btn_remove']")
	private WebElement HHveribleRemove_btn;
	@FindBy(xpath="//button[@id='obtn_opphrs']")
	private WebElement HHverible_Add_btn;
	
	
	
	public WebElement getHHtenure() {
		return HHtenure;
	}

	public WebElement getHHsuminsured() {
		return HHsuminsured;
	}

	public WebElement getHHveribleApplianceid() {
		return HHveribleApplianceid;
	}

	public WebElement getHHveribletextManufacturer() {
		return HHveribletextManufacturer;
	}

	public WebElement getHHveriblePropertyAge() {
		return HHveriblePropertyAge;
	}

	public WebElement getHHveriblePropertcost() {
		return HHveriblePropertcost;
	}

	public WebElement getHHveribleinvoicenuber() {
		return HHveribleinvoicenuber;
	}

	public WebElement getHHveribleRemove_btn() {
		return HHveribleRemove_btn;
	}

	public WebElement getHHverible_Add_btn() {
		return HHverible_Add_btn;
	}
@FindBy(xpath="//button[@id='confirmpay_btn']")
private WebElement confirmpay;

	public WebElement getConfirmpay() {
	return confirmpay;
}
@FindBy(xpath="//button[normalize-space()='Yes']")
private WebElement yes_btn;

	public WebElement getYes_btn() {
	return yes_btn;
}

	public householderFiG() {
		PageFactory.initElements(driver, this);
	}
	
}
