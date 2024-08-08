package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HouseHolderRetail extends BaseClass {

	@FindBy(xpath="//span[normalize-space()='Sales']")
	private WebElement HRSales;
	@FindBy(xpath="//a[normalize-space()='Product Segments']")
	private WebElement HRproductSegment;
	@FindBy(xpath="//div[@class='tile-stats pro_tile_10']")
	private WebElement  HRhouseholder;
	@FindBy(xpath="//div[@class='tile-stats pro_tile_001R']")
	private WebElement HRetail;
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement  HRviewplans;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
	private WebElement HR_ViewPlans ;
	@FindBy(xpath="//a[normalize-space()='New Policy']")
	private WebElement HR_newPolicy;
	@FindBy(xpath="//a[@class='btn btn-xs btn-default']")
	private WebElement  HRmasterpolicyPdf;
	
	@FindBy(xpath="//input[@id='r_mobileno']")
	private WebElement HRmobileNumberserachBox ;
	@FindBy(xpath="//button[@id='btn-search']")
	private WebElement HRsreachButton ;
	@FindBy(xpath="//select[@name='reportTable_length']")
	private WebElement HRmobilePopupShow  ;
	@FindBy(xpath="//span[normalize-space()='Excel']")
	private WebElement HRexcel ;
	//==========================================Customer Details====================
	@FindBy(xpath="//span[@aria-hidden='true']")
	private WebElement HRcustClose;
	public WebElement getHRcustClose() {
		return HRcustClose;
	}

	@FindBy(xpath="//a[@id='btn_AddBranch']")
	private WebElement  HRcustaddNewButton;
	@FindBy(xpath="//select[@id='salutationid']")
	private WebElement  HRsalutationid;
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement HRfirstName ;
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement HRlastName ;
	@FindBy(xpath="//div[@class='iradio_square-green hover']")
	private WebElement HRmale ;
	@FindBy(xpath="//div[@class='iradio_square-green']")
	private WebElement  HRfemale;
	@FindBy(xpath="//input[@id='dateofbirth']")
	private WebElement HRdate ;
	@FindBy(xpath="//input[@id='email']")
	private WebElement  HRmail;
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement HRmobile ;

	@FindBy(xpath="//input[@id='pincode']")
	private WebElement  HRpincode;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement  HRaddress;
	@FindBy(xpath="//button[@id='btn-save']")
	private WebElement HRsavebutton ;
	@FindBy(xpath="//button[@id='customer_close']")
	private WebElement HRcloseButton ;
	@FindBy(xpath="//a[@class='btn btn-success btn-xs']")
	private WebElement  HRselectButton;
	//===================policy details-========================
	@FindBy(xpath="//select[@id='r_insurance']")
	private WebElement HRinsurance ;
	@FindBy(xpath="//input[@id='r_insu_location']")
	private WebElement  HRinsLocation;
	@FindBy(xpath="//input[@id='r_pro_name']")
	private WebElement HRproname ;
	@FindBy(xpath="//select[@id='r_policy_type']")
	private WebElement HRpolicyType ;
	@FindBy(xpath="//div[@class='iradio_square-green hover']")
	private WebElement HRisRenewalYes ;
	@FindBy(xpath="//div[@class='iradio_square-green hover']")
	private WebElement HRisRenewalNo ;
	@FindBy(xpath="//input[@id='r_policy_number']")
	private WebElement HRpolicyNumber ;
	
	@FindBy(xpath="//input[@id='r_start_date']")
	private WebElement  HRstartDate;
	@FindBy(xpath="//input[@id='r_end_date']")
	private WebElement HRendDate ;
	@FindBy(xpath="//input[@id='r_issuance_date']")
	private WebElement HRissuanceDate ;
	@FindBy(xpath="//input[@id='r_policy_term']")
	private WebElement HRpolicyTerm ;
	@FindBy(xpath="//select[@id='r_referance']")
	private WebElement HRreferanceType ;
	@FindBy(xpath="//input[@id='r_ref_name']")
	private WebElement HRrefName ;
	@FindBy(xpath="//input[@id='r_ref_mobile']")
	private WebElement HRrefMobile ;
	@FindBy(xpath="//input[@id='r_ref_email']")
	private WebElement  HRrefEmail;
	@FindBy(xpath="//select[@id='r_salesmanager']")
	private WebElement  HRsalemanager;
	@FindBy(xpath="//select[@id='r_bop']")
	private WebElement  HRselectBOP;
	@FindBy(xpath="//select[@id='r_regionalmanager']")
	private WebElement HRregionalmanager ;
	@FindBy(xpath="//select[@id='r_telecaller']")
	private WebElement HRtelecaller ;
	@FindBy(xpath="//input[@id='r_transaction_date']")
	private WebElement HRtransDate ;
	@FindBy(xpath="//textarea[@id='r_coverages']")
	private WebElement HRpolicycoverage ;
	@FindBy(xpath="//input[@id='coi_file_path_cor']")
	private WebElement  HRfilepath;
	@FindBy(xpath="//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
	private WebElement HRCheckbox ;
	//==============================previous policy details====================
	@FindBy(xpath="//input[@id='r_pre_policy_number']")
	private WebElement HRpreviouspolicyNumber ;
	@FindBy(xpath="//input[@id='r_pre_insurance']")
	private WebElement HRprevious_ins;
	@FindBy(xpath="//input[@id='r_pre_members']")
	private WebElement HRprevious_members ;
	@FindBy(xpath="//input[@id='r_pre_premium']")
	private WebElement HRprevious_premium ;
	@FindBy(xpath="//input[@id='r_pre_sum_assured']")
	private WebElement HRPrevious_assured;
	@FindBy(xpath="//input[@id='r_pre_no_claims']")
	private WebElement HRprevious_claims ;
	@FindBy(xpath="//input[@id='r_pre_claimamount']")
	private WebElement  HRprevious_cal_amount;
	//========================TPA=====================================
	@FindBy(xpath="//select[@id='rc_tpa']")
	private WebElement HRtpa ;
	@FindBy(xpath="//input[@placeholder='TPA%']")
	private WebElement  HRtpapersantage;
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement HRtpaName ;
	@FindBy(xpath="//div[@class='display-flex m-b']//input[@placeholder='Mobile No']")
	private WebElement  HRtpamobile;
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement HRtpaEmail ;
	
	@FindBy(xpath="//button[@id='btnaddtparow']")
	private WebElement HRtpaAddNew ;
	//==========================policy Documents===========================
	@FindBy(xpath="//button[@id='btnadddocumentrow']")
	private WebElement HRpdAddbutton;
	@FindBy(xpath="//input[@placeholder='Title']")
	private WebElement HRpdTitle ;
	@FindBy(xpath="//input[@placeholder='Remarks']")
	private WebElement  HRpdRemarks;
	@FindBy(xpath="//input[@name='RC_policydocuments']")
	private WebElement  HRpdbroswer;
	@FindBy(xpath="//div[@class='icheckbox_square-green']")
	private WebElement  HRpdCheckbox;
	//===============================property Details=====================
	@FindBy(xpath="//a[normalize-space()='Property Details']")
	private WebElement Hrpropertydetails ;
	@FindBy(xpath="//input[@id='propertyaddress']")
	private WebElement  HRproAddress;
	@FindBy(xpath="//input[@id='propertysqfeet']")
	private WebElement HRproFeet;
	@FindBy(xpath="//select[@id='stateid']")
	private WebElement  HRproState;
	@FindBy(xpath="//input[@id='propertyarea']")
	private WebElement  HRproArea;
	@FindBy(xpath="//input[@id='propertycity']")
	private WebElement  HRprocity;
	@FindBy(xpath="//input[@id='propertypincode']")
	private WebElement HRproPincode ;
	@FindBy(xpath="//div[@id='menu1_pa']//div[1]//div[1]//div[1]//label[1]//div[1]")
	private WebElement  HRisproBaseYes;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/label[2]/div[1]")
	private WebElement  HRisproBaseNo; ;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/label[1]/div[1]")
	private WebElement HRRentAlert_AccmmodationYes ;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/label[2]/div[1]")
	private WebElement HRRentAlert_AccmmodationNo  ;
	@FindBy(xpath="//select[@id='propertytypeid']")
	private WebElement HrproId ;
	@FindBy(xpath="//input[@id='floorinbuilding']")
	private WebElement HRprofloor ;
	@FindBy(xpath="//input[@id='propertyfloor']")
	private WebElement HRpro_located_floor ;
	@FindBy(xpath="//input[@id='marketvalue']")
	private WebElement  HRproMarketValue;
	@FindBy(xpath="//input[@id='landmark']")
	private WebElement HRpro_landmark ;
	@FindBy(xpath="//input[@id='carpetarea']")
	private WebElement  HRpro_area;
	@FindBy(xpath="//input[@id='costconstruction']")
	private WebElement HRcostconstruction ;
	@FindBy(xpath="//input[@id='propertyage']")
	private WebElement HRproAge ;
	//====================================Coverage and premium=============
	@FindBy(xpath="//a[normalize-space()='Coverage and Premium Details']")
	private WebElement HRcoverage ;
	
	@FindBy(xpath="//button[@id='btnaddexpanserow']")
	private WebElement  HRcovAddnew;
	@FindBy(xpath="//td[@class='td_title']//input[@id='expenseclaim']")
	private WebElement  HRcovTitle;
	@FindBy(xpath="//td[@class='td_amount']//input[@id='expenseamount']")
	private WebElement HRcovAmount ;
	//====================================Premium details=====================
	@FindBy(xpath="//button[@id='btnaddpremiumrow']")
	private WebElement HRpreAddbutton ;
	@FindBy(xpath="//div[@class='display-flex m-b']//input[@placeholder='Coverage']")
	private WebElement HRprecoverage ;
	@FindBy(xpath="//input[@placeholder='Description']")
	private WebElement  HRpredescription;
	@FindBy(xpath="//input[@placeholder='Premium Rate']")
	private WebElement HRpreRate ;
	@FindBy(xpath="//input[@value='18']")
	private WebElement  HRpreGST;
	@FindBy(xpath="//td[@class='td_distitle']//input[@id='expenseclaim']")
	private WebElement HRpreDisTitle ;
	@FindBy(xpath="//td[@class='td_disamount']//input[@id='expenseamount']")
	private WebElement HRDisAmount ;

	
	
	
	
	public WebElement getHRpdAddbutton() {
		return HRpdAddbutton;
	}

	public WebElement getHR_ViewPlans() {
		return HR_ViewPlans;
	}

	public WebElement getHR_newPolicy() {
		return HR_newPolicy;
	}

	public WebElement getHRSales() {
		return HRSales;
	}

	public WebElement getHRproductSegment() {
		return HRproductSegment;
	}
	public WebElement getHRhouseholder() {
		return HRhouseholder;
	}
	public WebElement getHRetail() {
		return HRetail;
	}
	public WebElement getHRviewplans() {
		return HRviewplans;
	}

	public WebElement getHRmasterpolicyPdf() {
		return HRmasterpolicyPdf;
	}

	public WebElement getHRnewPolicy() {
		return HRnewPolicy;
	}
	public WebElement getHRmobileNumberserachBox() {
		return HRmobileNumberserachBox;
	}
	public WebElement getHRsreachButton() {
		return HRsreachButton;
	}
	public WebElement getHRmobilePopupShow() {
		return HRmobilePopupShow;
	}

	public WebElement getHRexcel() {
		return HRexcel;
	}





	public WebElement getHRcustaddNewButton() {
		return HRcustaddNewButton;
	}





	public WebElement getHRsalutationid() {
		return HRsalutationid;
	}





	public WebElement getHRfirstName() {
		return HRfirstName;
	}





	public WebElement getHRlastName() {
		return HRlastName;
	}





	public WebElement getHRmale() {
		return HRmale;
	}





	public WebElement getHRfemale() {
		return HRfemale;
	}





	public WebElement getHRdate() {
		return HRdate;
	}





	public WebElement getHRmail() {
		return HRmail;
	}





	public WebElement getHRmobile() {
		return HRmobile;
	}





	public WebElement getHRpincode() {
		return HRpincode;
	}





	public WebElement getHRaddress() {
		return HRaddress;
	}





	public WebElement getHRsavebutton() {
		return HRsavebutton;
	}





	public WebElement getHRcloseButton() {
		return HRcloseButton;
	}





	public WebElement getHRselectButton() {
		return HRselectButton;
	}





	public WebElement getHRinsurance() {
		return HRinsurance;
	}





	public WebElement getHRinsLocation() {
		return HRinsLocation;
	}





	public WebElement getHRproname() {
		return HRproname;
	}





	public WebElement getHRpolicyType() {
		return HRpolicyType;
	}





	public WebElement getHRisRenewalYes() {
		return HRisRenewalYes;
	}





	public WebElement getHRisRenewalNo() {
		return HRisRenewalNo;
	}





	public WebElement getHRpolicyNumber() {
		return HRpolicyNumber;
	}





	public WebElement getHRstartDate() {
		return HRstartDate;
	}





	public WebElement getHRendDate() {
		return HRendDate;
	}





	public WebElement getHRissuanceDate() {
		return HRissuanceDate;
	}





	public WebElement getHRpolicyTerm() {
		return HRpolicyTerm;
	}





	public WebElement getHRreferanceType() {
		return HRreferanceType;
	}





	public WebElement getHRrefName() {
		return HRrefName;
	}





	public WebElement getHRrefMobile() {
		return HRrefMobile;
	}





	public WebElement getHRrefEmail() {
		return HRrefEmail;
	}





	public WebElement getHRsalemanager() {
		return HRsalemanager;
	}





	public WebElement getHRselectBOP() {
		return HRselectBOP;
	}





	public WebElement getHRregionalmanager() {
		return HRregionalmanager;
	}





	public WebElement getHRtelecaller() {
		return HRtelecaller;
	}





	public WebElement getHRtransDate() {
		return HRtransDate;
	}





	public WebElement getHRpolicycoverage() {
		return HRpolicycoverage;
	}





	public WebElement getHRfilepath() {
		return HRfilepath;
	}





	public WebElement getHRCheckbox() {
		return HRCheckbox;
	}





	public WebElement getHRpreviouspolicyNumber() {
		return HRpreviouspolicyNumber;
	}





	public WebElement getHRprevious_ins() {
		return HRprevious_ins;
	}





	public WebElement getHRprevious_members() {
		return HRprevious_members;
	}





	public WebElement getHRprevious_premium() {
		return HRprevious_premium;
	}





	public WebElement getHRPrevious_assured() {
		return HRPrevious_assured;
	}





	public WebElement getHRprevious_claims() {
		return HRprevious_claims;
	}





	public WebElement getHRprevious_cal_amount() {
		return HRprevious_cal_amount;
	}





	public WebElement getHRtpa() {
		return HRtpa;
	}





	public WebElement getHRtpapersantage() {
		return HRtpapersantage;
	}





	public WebElement getHRtpaName() {
		return HRtpaName;
	}





	public WebElement getHRtpamobile() {
		return HRtpamobile;
	}





	public WebElement getHRtpaEmail() {
		return HRtpaEmail;
	}





	public WebElement getHRtpaAddNew() {
		return HRtpaAddNew;
	}





	public WebElement getHRpdTitle() {
		return HRpdTitle;
	}





	public WebElement getHRpdRemarks() {
		return HRpdRemarks;
	}





	public WebElement getHRpdbroswer() {
		return HRpdbroswer;
	}





	public WebElement getHRpdCheckbox() {
		return HRpdCheckbox;
	}





	public WebElement getHrpropertydetails() {
		return Hrpropertydetails;
	}





	public WebElement getHRproAddress() {
		return HRproAddress;
	}





	public WebElement getHRproFeet() {
		return HRproFeet;
	}





	public WebElement getHRproState() {
		return HRproState;
	}





	public WebElement getHRproArea() {
		return HRproArea;
	}





	public WebElement getHRprocity() {
		return HRprocity;
	}





	public WebElement getHRproPincode() {
		return HRproPincode;
	}





	public WebElement getHRisproBaseYes() {
		return HRisproBaseYes;
	}





	public WebElement getHRisproBaseNo() {
		return HRisproBaseNo;
	}





	public WebElement getHRRentAlert_AccmmodationYes() {
		return HRRentAlert_AccmmodationYes;
	}





	public WebElement getHRRentAlert_AccmmodationNo() {
		return HRRentAlert_AccmmodationNo;
	}





	public WebElement getHrproId() {
		return HrproId;
	}





	public WebElement getHRprofloor() {
		return HRprofloor;
	}





	public WebElement getHRpro_located_floor() {
		return HRpro_located_floor;
	}





	public WebElement getHRproMarketValue() {
		return HRproMarketValue;
	}





	public WebElement getHRpro_landmark() {
		return HRpro_landmark;
	}





	public WebElement getHRpro_area() {
		return HRpro_area;
	}





	public WebElement getHRcostconstruction() {
		return HRcostconstruction;
	}





	public WebElement getHRproAge() {
		return HRproAge;
	}





	public WebElement getHRcoverage() {
		return HRcoverage;
	}





	public WebElement getHRcovAddnew() {
		return HRcovAddnew;
	}





	public WebElement getHRcovTitle() {
		return HRcovTitle;
	}





	public WebElement getHRcovAmount() {
		return HRcovAmount;
	}





	public WebElement getHRpreAddbutton() {
		return HRpreAddbutton;
	}





	public WebElement getHRprecoverage() {
		return HRprecoverage;
	}





	public WebElement getHRpredescription() {
		return HRpredescription;
	}





	public WebElement getHRpreRate() {
		return HRpreRate;
	}





	public WebElement getHRpreGST() {
		return HRpreGST;
	}





	public WebElement getHRpreDisTitle() {
		return HRpreDisTitle;
	}





	public WebElement getHRDisAmount() {
		return HRDisAmount;
	}
	@FindBy(xpath="//div[@id='div_premium']//div[1]//div[2]//div[2]//div[1]//a[1]")
	private WebElement HRnewPolicy ;




	public HouseHolderRetail() {
		PageFactory.initElements(driver, this);
	}
}
