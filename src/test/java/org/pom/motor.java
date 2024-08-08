package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class motor extends BaseClass{
	@FindBy(xpath="/html/body/div[3]/div[3]/div/button")
	private WebElement pwOk;
	
	public WebElement getPwOk() {
		return pwOk;
	}
	 @FindBy(xpath = "//body/div[@id='wrapper']/nav[@role='navigation']/div[@class='sidebar-collapse']/ul[@id='side-menu']/li[3]/a[1]")
	    private WebElement Salesmenuitem;

	    @FindBy(xpath = "//a[normalize-space()='Product Segments']")
	    private WebElement ProductSegmentsmenuitem;
	    

	    public WebElement getSalesmenuitem() {
	                   return Salesmenuitem;
	    }


	    public WebElement getProductSegmentsmenuitem() {
	                   return ProductSegmentsmenuitem;
	    }
@FindBy(xpath="//div[@class='tile-stats pro_tile_13']")
private WebElement motor;

	public WebElement getMotor() {
	return motor;
}
	@FindBy (xpath="//a[@class='btn btn-primary']")
	private WebElement mr_MotorViewPlans;
	
	@FindBy (xpath="//a[normalize-space()='New Policy']")
	private WebElement mr_Plan1NewPolicy;
	
	
	
	public WebElement getMr_MotorViewPlans() {
		return mr_MotorViewPlans;
	}
 
	public WebElement getMr_Plan1NewPolicy() {
		return mr_Plan1NewPolicy;
	}
 
	//..............after click plan ...new proposal...(np)....//
	
	@FindBy (xpath="//input[@id='r_mobileno']")
	private WebElement mr_np_mobileno;
	
	@FindBy (xpath="//button[@id='btn-search']")
	private WebElement mr_np_Searchbtn;
	
	
 
	public WebElement getMr_np_mobileno() {
		return mr_np_mobileno;
	}
 
	public WebElement getMr_np_Searchbtn() {
		return mr_np_Searchbtn;
	}
	
	//.................After click the search button.......customer list...(cl)..........//
	
	@FindBy (xpath="//a[@class='btn btn-success btn-xs']")
	private WebElement mr_cl_Selectbtn;
	
	@FindBy (xpath="//button[@id='customer_close']")
	private WebElement mr_cl_closebtn;
	
	@FindBy (xpath="//select[@name='reportTable_length']")
	private WebElement mr_cl_showSelect;
	
	@FindBy (xpath="//span[normalize-space()='Excel']")
	private WebElement mr_cl_Exceldownload;
	
	@FindBy (xpath="//a[@id='btn_AddBranch']")
	private WebElement mr_cl_AddNewbtn;
	
 
	public WebElement getMr_cl_Selectbtn() {
		return mr_cl_Selectbtn;
	}
 
	public WebElement getMr_cl_closebtn() {
		return mr_cl_closebtn;
	}
 
	public WebElement getMr_cl_showSelect() {
		return mr_cl_showSelect;
	}
 
	public WebElement getMr_cl_Exceldownload() {
		return mr_cl_Exceldownload;
	}
 
	public WebElement getMr_cl_AddNewbtn() {
		return mr_cl_AddNewbtn;
	}
	
	//..........After click the AddNew btn......new customer...(nc).....//
	
	@FindBy (xpath="//select[@id='salutationid']")
	private WebElement mr_nc_salutationSelect;
	
	@FindBy (xpath="//input[@id='firstname']")
	private WebElement mr_nc_Firstname;
	
	@FindBy (xpath="//input[@id='lastname']")
	private WebElement mr_nc_LastName;
	
	@FindBy (xpath="//div[@class='checkbox-inline i-checks']//label[1]")
	private WebElement mr_nc_Genderclickmale;
	
	@FindBy (xpath="//div[@class='checkbox-inline i-checks']//label[2]")
	private WebElement mr_nc_GenderClickFemale;
	
	@FindBy (xpath="//input[@id='dateofbirth']")
	private WebElement mr_nc_DateOfBirth;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement mr_nc_Email;
	
	@FindBy (xpath="//input[@id='mobile']")
	private WebElement mr_nc_Mobilenumber;
	
	@FindBy (xpath="//input[@id='pincode']")
	private WebElement mr_nc_pincode;
	
	@FindBy (xpath="//textarea[@id='address']")
	private WebElement mr_nc_Address;
	
	@FindBy (xpath="//button[@id='btn-save']")
	private WebElement mr_nc_Savebtn;
	
	
 
	public WebElement getMr_nc_salutationSelect() {
		return mr_nc_salutationSelect;
	}
 
	public WebElement getMr_nc_Firstname() {
		return mr_nc_Firstname;
	}
 
	public WebElement getMr_nc_LastName() {
		return mr_nc_LastName;
	}
 
	public WebElement getMr_nc_Genderclickmale() {
		return mr_nc_Genderclickmale;
	}
 
	public WebElement getMr_nc_GenderClickFemale() {
		return mr_nc_GenderClickFemale;
	}
 
	public WebElement getMr_nc_DateOfBirth() {
		return mr_nc_DateOfBirth;
	}
 
	public WebElement getMr_nc_Email() {
		return mr_nc_Email;
	}
 
	public WebElement getMr_nc_Mobilenumber() {
		return mr_nc_Mobilenumber;
	}
 
	public WebElement getMr_nc_pincode() {
		return mr_nc_pincode;
	}
 
	public WebElement getMr_nc_Address() {
		return mr_nc_Address;
	}
 
	public WebElement getMr_nc_Savebtn() {
		return mr_nc_Savebtn;
	}
 
 
	//............After click the Select in customer list..................new proposal...//
	
	//.........policy Details.......(pd)....//
	
	@FindBy(xpath = "//a[normalize-space()='Policy Details']")
	private WebElement mr_pd_PolicyDetailsClick;
 
	@FindBy(xpath = "//select[@id='r_insurance']")
	private WebElement mr_pd_InsuranceCompanySelect;
 
	@FindBy(xpath = "//input[@id='r_insu_location']")
	private WebElement mr_pd_InsuranceCompanyLocation;
 
	@FindBy(xpath = "//input[@id='r_pro_name']")
	private WebElement mr_pd_ProductName;
 
	@FindBy(xpath = "//select[@id='r_policy_type']")
	private WebElement mr_pd_PolicyTypeSelect;
 
	@FindBy(xpath = "//div[@class='iradio_square-green checked']//ins[@class='iCheck-helper']")
	private WebElement mr_pd_IsRenewableClickYes;
 
	@FindBy(xpath = "//div[@class='iradio_square-green']//ins[@class='iCheck-helper']")
	private WebElement mr_pd_IsRenewableClickNo;
 
	@FindBy(xpath = "//input[@id='r_policy_number']")
	private WebElement mr_pd_PolicyNumber;
 
	@FindBy(xpath = "//input[@id='r_start_date']")
	private WebElement mr_pd_PolicyStartDate;
 
	@FindBy(xpath = "//input[@id='r_end_date']")
	private WebElement mr_pd_PolicyEndDate;
 
	@FindBy(xpath = "//input[@id='r_issuance_date']")
	private WebElement mr_pd_PolicyIssuanceDate;
 
	@FindBy(xpath = "//input[@id='r_policy_term']")
	private WebElement mr_pd_PolicyTerm;
 
	@FindBy(xpath = "//select[@id='r_referance']")
	private WebElement mr_pd_ReferanceTypeSelect;
 
	@FindBy(xpath = "//input[@id='r_ref_name']")
	private WebElement mr_pd_RefName;
 
	@FindBy(xpath = "//input[@id='r_ref_mobile']")
	private WebElement mr_pd_RefMobileNo;
 
	@FindBy(xpath = "//input[@id='r_ref_email']")
	private WebElement mr_pd_RefEmail;
 
	@FindBy(xpath = "//select[@id='r_salesmanager']")
	private WebElement mr_pd_SalesManagerSelect;
 
	@FindBy(xpath = "//select[@id='r_bop']")
	private WebElement mr_pd_BOPSelect;
 
	@FindBy(xpath = "//select[@id='r_regionalmanager']")
	private WebElement mr_pd_RegionalManagerSelect;
 
	@FindBy(xpath = "//select[@id='r_telecaller']")
	private WebElement mr_pd_TeleCaller;
 
	@FindBy(xpath = "//input[@id='r_transaction_date']")
	private WebElement mr_pd_DateOfTransaction;
 
	@FindBy(xpath = "//textarea[@id='r_coverages']")
	private WebElement mr_pd_PolicyCoverages;
 
	@FindBy(xpath = "//input[@id='coi_file_path_cor']")
	private WebElement mr_pd_CoiChooseFile;
 
	@FindBy(xpath = "//select[@id='rc_tpa']")
	private WebElement mr_pd_TPASelect;
 
	@FindBy(xpath = "//input[@placeholder='TPA%']")
	private WebElement mr_pd_TPAPercentage;
 
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement mr_pd_ContactName;
 
	@FindBy(xpath = "//div[@class='display-flex m-b']//input[@placeholder='Mobile No']")
	private WebElement mr_pd_ContactMobile;
 
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement mr_pd_ContactEmail;
 
	@FindBy(xpath = "//button[@id='btnaddtparow']")
	private WebElement mr_pd_TPADetailsAddNewBtn;
 
	@FindBy(xpath = "//button[contains(@class,'remove')]")
	private WebElement mr_pd_TPADetailsRemoveBtn;
 
	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement mr_pd_Title;
 
	@FindBy(xpath = "//input[@placeholder='Remarks']")
	private WebElement mr_pd_Remarks;
 
	@FindBy(xpath = "//input[@name='RC_policydocuments']")
	private WebElement mr_pd_PolicyDocumentFileBrowse;
 
	@FindBy(xpath = "//button[@id='btnadddocumentrow']")
	private WebElement mr_pd_PolicyDocumentsAddNewBtn;
 
	@FindBy(xpath = "//tr[@id='brokerdetails_0']//button[contains(@class,'remove')]")
	private WebElement mr_pd_PolicyDocumentsRemoveBtn;
 
	@FindBy(xpath = "//button[@id='btn-save']")
	private WebElement mr_pd_SaveBtn;
	
	
	
	public WebElement getMr_pd_PolicyDetailsClick() {
		return mr_pd_PolicyDetailsClick;
	}
 
	public WebElement getMr_pd_InsuranceCompanySelect() {
		return mr_pd_InsuranceCompanySelect;
	}
 
	public WebElement getMr_pd_InsuranceCompanyLocation() {
		return mr_pd_InsuranceCompanyLocation;
	}
 
	public WebElement getMr_pd_ProductName() {
		return mr_pd_ProductName;
	}
 
	public WebElement getMr_pd_PolicyTypeSelect() {
		return mr_pd_PolicyTypeSelect;
	}
 
	public WebElement getMr_pd_IsRenewableClickYes() {
		return mr_pd_IsRenewableClickYes;
	}
 
	public WebElement getMr_pd_IsRenewableClickNo() {
		return mr_pd_IsRenewableClickNo;
	}
 
	public WebElement getMr_pd_PolicyNumber() {
		return mr_pd_PolicyNumber;
	}
 
	public WebElement getMr_pd_PolicyStartDate() {
		return mr_pd_PolicyStartDate;
	}
 
	public WebElement getMr_pd_PolicyEndDate() {
		return mr_pd_PolicyEndDate;
	}
 
	public WebElement getMr_pd_PolicyIssuanceDate() {
		return mr_pd_PolicyIssuanceDate;
	}
 
	public WebElement getMr_pd_PolicyTerm() {
		return mr_pd_PolicyTerm;
	}
 
	public WebElement getMr_pd_ReferanceTypeSelect() {
		return mr_pd_ReferanceTypeSelect;
	}
 
	public WebElement getMr_pd_RefName() {
		return mr_pd_RefName;
	}
 
	public WebElement getMr_pd_RefMobileNo() {
		return mr_pd_RefMobileNo;
	}
 
	public WebElement getMr_pd_RefEmail() {
		return mr_pd_RefEmail;
	}
 
	public WebElement getMr_pd_SalesManagerSelect() {
		return mr_pd_SalesManagerSelect;
	}
 
	public WebElement getMr_pd_BOPSelect() {
		return mr_pd_BOPSelect;
	}
 
	public WebElement getMr_pd_RegionalManagerSelect() {
		return mr_pd_RegionalManagerSelect;
	}
 
	public WebElement getMr_pd_TeleCaller() {
		return mr_pd_TeleCaller;
	}
 
	public WebElement getMr_pd_DateOfTransaction() {
		return mr_pd_DateOfTransaction;
	}
 
	public WebElement getMr_pd_PolicyCoverages() {
		return mr_pd_PolicyCoverages;
	}
 
	public WebElement getMr_pd_CoiChooseFile() {
		return mr_pd_CoiChooseFile;
	}
 
	public WebElement getMr_pd_TPASelect() {
		return mr_pd_TPASelect;
	}
 
	public WebElement getMr_pd_TPAPercentage() {
		return mr_pd_TPAPercentage;
	}
 
	public WebElement getMr_pd_ContactName() {
		return mr_pd_ContactName;
	}
 
	public WebElement getMr_pd_ContactMobile() {
		return mr_pd_ContactMobile;
	}
 
	public WebElement getMr_pd_ContactEmail() {
		return mr_pd_ContactEmail;
	}
 
	public WebElement getMr_pd_TPADetailsAddNewBtn() {
		return mr_pd_TPADetailsAddNewBtn;
	}
 
	public WebElement getMr_pd_TPADetailsRemoveBtn() {
		return mr_pd_TPADetailsRemoveBtn;
	}
 
	public WebElement getMr_pd_Title() {
		return mr_pd_Title;
	}
 
	public WebElement getMr_pd_Remarks() {
		return mr_pd_Remarks;
	}
 
	public WebElement getMr_pd_PolicyDocumentFileBrowse() {
		return mr_pd_PolicyDocumentFileBrowse;
	}
 
	public WebElement getMr_pd_PolicyDocumentsAddNewBtn() {
		return mr_pd_PolicyDocumentsAddNewBtn;
	}
 
	public WebElement getMr_pd_PolicyDocumentsRemoveBtn() {
		return mr_pd_PolicyDocumentsRemoveBtn;
	}
 
	public WebElement getMr_pd_SaveBtn() {
		return mr_pd_SaveBtn;
	}
	
	//................after click Do you have any Previous Policy.........//
	//.....previous policy details.......(ppd)....//
	
	@FindBy (xpath="//label[normalize-space()='Do you have any Previous Policy?']")
	private WebElement mr_pd_DoYouHaveAnyPreviousPolicyClick;
	
	@FindBy (xpath="//input[@id='r_pre_policy_number']")
	private WebElement mr_pd_ppd_PolicyNumber;
	
	@FindBy (xpath="//input[@id='r_pre_insurance']")
	private WebElement mr_pd_ppd_InsuranceCompany;
	
	@FindBy (xpath="//input[@id='r_pre_members']")
	private WebElement mr_pd_ppd_NoOfMembers;
	
	@FindBy (xpath="//input[@id='r_pre_premium']")
	private WebElement mr_pd_ppd_Premium;
	
	@FindBy (xpath="//input[@id='r_pre_sum_assured']")
	private WebElement mr_pd_ppd_Sumassured;
	
	@FindBy (xpath="//input[@id='r_pre_no_claims']")
	private WebElement mr_pd_ppd_NoOfClaims;
	
	@FindBy (xpath="//input[@id='r_pre_claimamount']")
	private WebElement mr_pd_ppd_ClaimedAmount;
	
	
	
	public WebElement getMr_pd_ppd_PolicyNumber() {
		return mr_pd_ppd_PolicyNumber;
	}
 
	public WebElement getMr_pd_ppd_InsuranceCompany() {
		return mr_pd_ppd_InsuranceCompany;
	}
 
	public WebElement getMr_pd_ppd_NoOfMembers() {
		return mr_pd_ppd_NoOfMembers;
	}
 
	public WebElement getMr_pd_ppd_Premium() {
		return mr_pd_ppd_Premium;
	}
 
	public WebElement getMr_pd_ppd_Sumassured() {
		return mr_pd_ppd_Sumassured;
	}
 
	public WebElement getMr_pd_ppd_NoOfClaims() {
		return mr_pd_ppd_NoOfClaims;
	}
 
	public WebElement getMr_pd_ppd_ClaimedAmount() {
		return mr_pd_ppd_ClaimedAmount;
	}
 
	public WebElement getMr_pd_DoYouHaveAnyPreviousPolicyClick() {
		return mr_pd_DoYouHaveAnyPreviousPolicyClick;
	}
	
	
	//...........vehicle Details.............(vd)................//
	
	
 
	@FindBy (xpath="//a[normalize-space()='Vehicle Details']")
	private WebElement mr_vehicleDetails;
	
	@FindBy (xpath="//input[@id='registrationnumber']")
	private WebElement mr_vd_RegistrationNumber;
	
	@FindBy (xpath="//input[@id='make']")
	private WebElement mr_vd_Make;
	
	@FindBy (xpath="//input[@id='model']")
	private WebElement mr_vd_model;
	
	@FindBy (xpath="//input[@id='typrofbody']")
	private WebElement mr_vd_TypeOfBody;
	
	@FindBy (xpath="//input[@id='cc']")
	private WebElement mr_vd_CC;
	
	@FindBy (xpath="//input[@id='year']")
	private WebElement mr_vd_ManufacturingYear;
	
	@FindBy (xpath="//input[@id='seatingcapacity']")
	private WebElement mr_vd_SeatingCapacity;
	
	@FindBy (xpath="//input[@id='chassisnumber']")
	private WebElement mr_vd_ChassisNumber;
	
	@FindBy (xpath="//input[@id='enginenumber']")
	private WebElement mr_vd_EngineNumber;
	
	
 
	public WebElement getMr_vehicleDetails() {
		return mr_vehicleDetails;
	}
 
	public WebElement getMr_vd_RegistrationNumber() {
		return mr_vd_RegistrationNumber;
	}
 
	public WebElement getMr_vd_Make() {
		return mr_vd_Make;
	}
 
	public WebElement getMr_vd_model() {
		return mr_vd_model;
	}
 
	public WebElement getMr_vd_TypeOfBody() {
		return mr_vd_TypeOfBody;
	}
 
	public WebElement getMr_vd_CC() {
		return mr_vd_CC;
	}
 
	public WebElement getMr_vd_ManufacturingYear() {
		return mr_vd_ManufacturingYear;
	}
 
	public WebElement getMr_vd_SeatingCapacity() {
		return mr_vd_SeatingCapacity;
	}
 
	public WebElement getMr_vd_ChassisNumber() {
		return mr_vd_ChassisNumber;
	}
 
	public WebElement getMr_vd_EngineNumber() {
		return mr_vd_EngineNumber;
	}
	
	// .................Coverage And Premium Details...........(cpd)...//
 
		@FindBy(xpath = "//a[normalize-space()='Coverage and Premium Details']")
		private WebElement mr_CoverageAndPremiumDetailsClick;
 
		@FindBy(id = "expenseclaim")
		private WebElement mr_cpd_VehicleValuationDetailsTitle;
 
		@FindBy(xpath = "//td[@class='td_amount']//input[@id='expenseamount']")
		private WebElement mr_cpd_VehicleValuationDetailsAmount;
 
		@FindBy(xpath = "//button[@id='btnaddexpanserow']")
		private WebElement mr_cpd_VehicleValuationDetailsAddNewRowBtn;
 
		@FindBy(xpath = "//tr[@id='valuation_0']//button[contains(@class,'remove')]")
		private WebElement mr_cpd_VehicleValuationDetailsRemoveRowBtn;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_1']//input[contains(@placeholder,'Coverage')]")
		private WebElement mr_cpd_PremiumDetailsTitle;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_1']//input[contains(@placeholder,'Description')]")
		private WebElement mr_cpd_Description;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_1']//input[contains(@placeholder,'Premium Rate')]")
		private WebElement mr_cpd_PremiumRate;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_1']//td[@class='td_gst']//input[@name='Share']")
		private WebElement mr_cpd_GSTPrecentage;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_1']//td[contains(@class,'td_gstamount')]//input[contains(@name,'Share')]")
		private WebElement mr_cpd_GSTAmount;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_1']//td[contains(@class,'td_netpremium')]//input[contains(@name,'Share')]")
		private WebElement mr_cpd_NetPremium;
 
		@FindBy(xpath = "//button[@id='btnaddpremiumrow']")
		private WebElement mr_cpd_PremiumDetailsAddNewRowBtn;
 
		@FindBy(xpath = "//tr[@id='premiumdetails_0']//button[contains(@class,'remove')]")
		private WebElement mr_cpd_PremiumDetailsRemoveBtn;
 
		@FindBy(xpath = "//tr[@id='discountdetails_1']//input[@id='expenseclaim']")
		private WebElement mr_cpd_DiscountDetailsTitle;
 
		@FindBy(xpath = "//tr[@id='discountdetails_1']//input[@id='expenseamount']")
		private WebElement mr_cpd_DiscountDetailsAmount;
 
		@FindBy(xpath = "//button[@id='btndiscountrow']")
		private WebElement mr_cpd_DiscountDetailsAddNewRowBtn;
 
		@FindBy(xpath = "//tr[@id='discountdetails_0']//button[1]")
		private WebElement mr_cpd_DiscountDetailsRemoveRowBtn;
	
 
	public WebElement getMr_CoverageAndPremiumDetailsClick() {
			return mr_CoverageAndPremiumDetailsClick;
		}
 
		
 
		public WebElement getMr_cpd_VehicleValuationDetailsTitle() {
		return mr_cpd_VehicleValuationDetailsTitle;
	}
 
	public WebElement getMr_cpd_VehicleValuationDetailsAmount() {
		return mr_cpd_VehicleValuationDetailsAmount;
	}
 
	public WebElement getMr_cpd_VehicleValuationDetailsAddNewRowBtn() {
		return mr_cpd_VehicleValuationDetailsAddNewRowBtn;
	}
 
	public WebElement getMr_cpd_VehicleValuationDetailsRemoveRowBtn() {
		return mr_cpd_VehicleValuationDetailsRemoveRowBtn;
	}
 
		public WebElement getMr_cpd_PremiumDetailsTitle() {
			return mr_cpd_PremiumDetailsTitle;
		}
 
		public WebElement getMr_cpd_Description() {
			return mr_cpd_Description;
		}
 
		public WebElement getMr_cpd_PremiumRate() {
			return mr_cpd_PremiumRate;
		}
 
		public WebElement getMr_cpd_GSTPrecentage() {
			return mr_cpd_GSTPrecentage;
		}
 
		public WebElement getMr_cpd_GSTAmount() {
			return mr_cpd_GSTAmount;
		}
 
		public WebElement getMr_cpd_NetPremium() {
			return mr_cpd_NetPremium;
		}
 
		public WebElement getMr_cpd_PremiumDetailsAddNewRowBtn() {
			return mr_cpd_PremiumDetailsAddNewRowBtn;
		}
 
		public WebElement getMr_cpd_PremiumDetailsRemoveBtn() {
			return mr_cpd_PremiumDetailsRemoveBtn;
		}
 
		public WebElement getMr_cpd_DiscountDetailsTitle() {
			return mr_cpd_DiscountDetailsTitle;
		}
 
		public WebElement getMr_cpd_DiscountDetailsAmount() {
			return mr_cpd_DiscountDetailsAmount;
		}
 
		public WebElement getMr_cpd_DiscountDetailsAddNewRowBtn() {
			return mr_cpd_DiscountDetailsAddNewRowBtn;
		}
 
		public WebElement getMr_cpd_DiscountDetailsRemoveRowBtn() {
			return mr_cpd_DiscountDetailsRemoveRowBtn;
		}
		@FindBy(xpath="//body/div[@id='wrapper']/div[@id='page-wrapper']/div/div[@class='row']/div[@class='col-md-12']/div[@class='ibox float-e-margins']/div[@class='ibox-content gray-bg']/div[@class='row top_tiles']/div[@id='productplans']/div[1]")
		private WebElement motorRetail;
		
		
		 public WebElement getMotorRetail() {
			return motorRetail;
		}


		public  motor() {
             PageFactory.initElements(driver,this);
}
}
