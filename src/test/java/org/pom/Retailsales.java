package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Retailsales extends BaseClass{

	
	@FindBy(xpath = "//body/div[@id='wrapper']/nav[@role='navigation']/div[@class='sidebar-collapse']/ul[@id='side-menu']/li[3]/a[1]")
	private WebElement Salesmenuitem;

	@FindBy(xpath = "//a[normalize-space()='Product Segments']")
	private WebElement ProductSegmentsmenuitem;

	@FindBy(xpath = "//div[@class='tile-stats pro_tile_2']")
	private WebElement ProductSegmentHealth;

	@FindBy(xpath = "//div[@class='tile-stats pro_tile_001R']")
	private WebElement ProductSegmentRetail;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement Productviewplans;

	@FindBy(xpath = "//a[normalize-space()='New Policy']")
	private WebElement RetailProductnewpolicy;

	@FindBy(xpath = "//input[@id='r_mobileno']")
	private WebElement Retail_mobileno;

	@FindBy(xpath = "//a[@class='btn btn-success btn-xs']")
	private WebElement Retail_customerselect;
	
	@FindBy(xpath = "//button[@id='btn-search']")
	private WebElement Retail_mobileno_search;
	
	@FindBy(xpath = "//div[@class='tile-stats pro_tile_3']")
	private WebElement ProductSegmentPA;
	
	
	//------------------------------------------------------------------------------------------------------------	
	//Customers-------
	
	 public WebElement getProductSegmentPA() {
			return ProductSegmentPA;
		}
	 
    @FindBy(xpath="//a[@id='btn_AddBranch']")
    private WebElement  RetailCustomerAdd;
    
    @FindBy(xpath="//select[@id='salutationid']")
    private WebElement  Retailcustomersalutation;
    
    @FindBy(xpath="//input[@id='firstname']")
    private WebElement Retailcustomerfirstname ;
    
    @FindBy(xpath="//input[@id='lastname']")
    private WebElement Retailcustomerlastname ;
    
    @FindBy(xpath="//div[@class='iradio_square-green hover']")
    private WebElement Retailcustomermale ;
    
    @FindBy(xpath="//div[@class='iradio_square-green']")
    private WebElement  Retailcustomerfemale;
    
    @FindBy(xpath="//input[@id='dateofbirth']")
    private WebElement Retailcustomerdateofbirth ;
    
    @FindBy(xpath="//input[@id='email']")
    private WebElement  Retailcustomeremail;
    
    @FindBy(xpath="//input[@id='mobile']")
    private WebElement Retailcustomermobilenumber ;

    @FindBy(xpath="//input[@id='pincode']")
    private WebElement Retailcustomerpincode;
    
    @FindBy(xpath="//textarea[@id='address']")
    private WebElement Retailcustomeraddress;
    
    @FindBy(xpath="//button[@id='btn-save']")
    private WebElement Retailcustomersave ;


//------------------------------------------------------------------------------------------------------------	
//Policydetails-------

	@FindBy(xpath = "//select[@id='r_insurance']")
	private WebElement Retail_insurancecompany;

	@FindBy(xpath = "//input[@id='r_insu_location']")
	private WebElement Retail_insurancelocation;

	@FindBy(xpath = "//input[@id='r_pro_name']")
	private WebElement Retail_productname;

	@FindBy(xpath = "//select[@id='r_policy_type']")
	private WebElement Retail_policytype;

	@FindBy(xpath = "//input[@id='r_policy_number']")
	private WebElement Retail_policynumber;

	@FindBy(xpath = "//input[@id='r_start_date']")
	private WebElement Retail_policystartdate;

	@FindBy(xpath = "//input[@id='r_end_date']")
	private WebElement Retail_policyenddate;

	@FindBy(xpath = "//input[@id='r_issuance_date']")
	private WebElement Retail_policyissuancedate;

	@FindBy(xpath = "//input[@id='r_policy_term']")
	private WebElement Retail_policyterm;

	@FindBy(xpath = "//select[@id='r_referance']")
	private WebElement Retail_referencetype;

	@FindBy(xpath = "//input[@id='r_ref_name']")
	private WebElement Retail_referncename;

	@FindBy(xpath = "//input[@id='r_ref_mobile']")
	private WebElement Retail_referncemobilenumber;

	@FindBy(xpath = "//input[@id='r_ref_email']")
	private WebElement Retail_refernceemail;

	@FindBy(xpath = "//select[@id='r_salesmanager']")
	private WebElement Retail_salesmanager;

	@FindBy(xpath = "//select[@id='r_bop']")
	private WebElement Retail_Bop;

	@FindBy(xpath = "//select[@id='r_regionalmanager']")
	private WebElement Retail_regionalmanager;

	@FindBy(xpath = "//select[@id='r_telecaller']")
	private WebElement Retail_telecaller;

	@FindBy(xpath = "//input[@id='r_transaction_date']")
	private WebElement Retail_transactiondate;

	@FindBy(xpath = "//textarea[@id='r_coverages']")
	private WebElement Retail_policycoverages;

	@FindBy(xpath = "//input[@id='coi_file_path_cor']")
	private WebElement Retail_coipath;

	@FindBy(xpath = "//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
	private WebElement HRCheckbox;

//	-----------------------------------------------------------------------------------------
// TPAdetails---

	@FindBy(xpath = "//select[@id='rc_tpa']")
	private WebElement RetailTPA;

	@FindBy(xpath = "//input[@placeholder='TPA%']")
	private WebElement RetailTPApercentage;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement RetailTPAcontactname;

	@FindBy(xpath = "//div[@class='display-flex m-b']//input[@placeholder='Mobile No']")
	private WebElement RetailTPAcontactdetails;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement RetailTPAcontactemail;

	@FindBy(xpath = "//button[@id='btnaddtparow']")
	private WebElement RetailTPAAddnew;

//	-----------------------------------------------------------------------------------------
// Policydocuments---

	@FindBy(xpath = "//button[@id='btnadddocumentrow']")
	private WebElement Retailpolicydocumentsaddnew;

	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement Retailpolicydocumenttile;

	@FindBy(xpath = "//input[@placeholder='Remarks']")
	private WebElement Retailpolicydocumentremarks;

	@FindBy(xpath = "//input[@name='RC_policydocuments']")
	private WebElement Retailpolicydocumentbrowse;

	@FindBy(xpath = "//label[@id='r_pastpolicy']")
	private WebElement Retailpreviouspolicycheckbox;

//	-----------------------------------------------------------------------------------------
// PreviousPolicydetails---

	@FindBy(xpath = "//input[@id='r_pre_policy_number']")
	private WebElement RetailpreviouspolicyNumber;

	@FindBy(xpath = "//input[@id='r_pre_insurance']")
	private WebElement Retailpreviousinsurancecompany;

	@FindBy(xpath = "//input[@id='r_pre_members']")
	private WebElement Retailpreviousnoofmembers;

	@FindBy(xpath = "//input[@id='r_pre_premium']")
	private WebElement Retailpreviouspremium;

	@FindBy(xpath = "//input[@id='r_pre_sum_assured']")
	private WebElement Retailprevioussuminsured;

	@FindBy(xpath = "//input[@id='r_pre_no_claims']")
	private WebElement Retailpreviousnoofclaims;

	@FindBy(xpath = "//input[@id='r_pre_claimamount']")
	private WebElement Retailpreviousclaimedamount;

//	-----------------------------------------------------------------------------------------
// Memberdetails---	

	@FindBy(xpath = "//a[normalize-space()='Members Details']")
	private WebElement Retailmembersdetailstab;

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement Retailnomineefirstname;

	@FindBy(xpath = "//input[@id='laname']")
	private WebElement Retailnomineelastname;

	@FindBy(xpath = "//input[@id='nommobile']")
	private WebElement Retailnomineemobilenumber;

	@FindBy(xpath = "//input[@id='nomemail']")
	private WebElement Retailnomineeemail;

	@FindBy(xpath = "//input[@id='nomineedob']")
	private WebElement Retailnomineedob;

	@FindBy(xpath = "//select[@id='nomrelation']")
	private WebElement Retailnomineerelationship;

	@FindBy(xpath = "//textarea[@id='nomaddress1']")
	private WebElement Retailnomineeaddress1;

	@FindBy(xpath = "//textarea[@id='nomaddress2']")
	private WebElement Retailnomineeaddress2;

//	-----------------------------------------------------------------------------------------
// PolicyCoveragedetails------	

	@FindBy(xpath = "//a[normalize-space()='Coverage and Premium Details']")
	private WebElement RetailCoverageandPremiumdetailstab;

	@FindBy(xpath = "//button[@id='btnaddexpanserow']")
	private WebElement RetailpolicycoverageAddnew;

	@FindBy(xpath = "//td[@class='td_title']//input[@id='expenseclaim']")
	private WebElement Retailpolicycoveragetitle;

	@FindBy(xpath = "//td[@class='td_amount']//input[@id='expenseamount']")
	private WebElement Retailpolicycoverageamount;
	

//	-----------------------------------------------------------------------------------------
// Premiumdetails------		
	
	@FindBy(xpath = "//button[@id='btnaddpremiumrow']")
	private WebElement Retailpremiumdetailsaddnew;
	
	@FindBy(xpath = "//div[@class='display-flex m-b']//input[@placeholder='Coverage']")
	private WebElement Retailpremiumdetailstitle;
	
	@FindBy(xpath = "//input[@placeholder='Description']")
	private WebElement Retailpremiumdetailsdescription;
	
	@FindBy(xpath = "//input[@placeholder='Premium Rate']")
	private WebElement Retailpremiumdetailspremiumrate;
	
	@FindBy(xpath = "//input[@value='18']")
	private WebElement RetailpremiumdetailsGst;
	
	
//	-----------------------------------------------------------------------------------------
// Discountdetails------
	
	
	@FindBy(xpath = "//button[@id='btndiscountrow']")
	private WebElement Retaildiscountdetailaddnew;
	
	@FindBy(xpath = "//td[@class='td_distitle']//input[@id='expenseclaim']")
	private WebElement Retaildiscountdetailtitle;
	
	@FindBy(xpath = "//td[@class='td_disamount']//input[@id='expenseamount']")
	private WebElement Retaildiscountdetailamount;
	
	@FindBy(xpath = "//button[@id='btn-save']")
	private WebElement Retailpolicysavebutton;
	
	
	public  Retailsales() {
		PageFactory.initElements(driver,this);
	}


	public WebElement getSalesmenuitem() {
		return Salesmenuitem;
	}


	public WebElement getProductSegmentsmenuitem() {
		return ProductSegmentsmenuitem;
	}


	public WebElement getProductSegmentHealth() {
		return ProductSegmentHealth;
	}


	public WebElement getProductSegmentRetail() {
		return ProductSegmentRetail;
	}


	public WebElement getProductviewplans() {
		return Productviewplans;
	}


	public WebElement getRetailProductnewpolicy() {
		return RetailProductnewpolicy;
	}


	public WebElement getRetail_mobileno() {
		return Retail_mobileno;
	}


	public WebElement getRetail_customerselect() {
		return Retail_customerselect;
	}


	public WebElement getRetailCustomerAdd() {
		return RetailCustomerAdd;
	}


	public WebElement getRetailcustomersalutation() {
		return Retailcustomersalutation;
	}


	public WebElement getRetailcustomerfirstname() {
		return Retailcustomerfirstname;
	}


	public WebElement getRetailcustomerlastname() {
		return Retailcustomerlastname;
	}


	public WebElement getRetailcustomermale() {
		return Retailcustomermale;
	}


	public WebElement getRetailcustomerfemale() {
		return Retailcustomerfemale;
	}


	public WebElement getRetailcustomerdateofbirth() {
		return Retailcustomerdateofbirth;
	}


	public WebElement getRetailcustomeremail() {
		return Retailcustomeremail;
	}


	public WebElement getRetailcustomermobilenumber() {
		return Retailcustomermobilenumber;
	}


	public WebElement getRetailcustomerpincode() {
		return Retailcustomerpincode;
	}


	public WebElement getRetailcustomeraddress() {
		return Retailcustomeraddress;
	}


	public WebElement getRetailcustomersave() {
		return Retailcustomersave;
	}


	public WebElement getRetail_insurancecompany() {
		return Retail_insurancecompany;
	}


	public WebElement getRetail_insurancelocation() {
		return Retail_insurancelocation;
	}


	public WebElement getRetail_productname() {
		return Retail_productname;
	}


	public WebElement getRetail_policytype() {
		return Retail_policytype;
	}


	public WebElement getRetail_policynumber() {
		return Retail_policynumber;
	}


	public WebElement getRetail_policystartdate() {
		return Retail_policystartdate;
	}


	public WebElement getRetail_policyenddate() {
		return Retail_policyenddate;
	}


	public WebElement getRetail_policyissuancedate() {
		return Retail_policyissuancedate;
	}


	public WebElement getRetail_policyterm() {
		return Retail_policyterm;
	}


	public WebElement getRetail_referencetype() {
		return Retail_referencetype;
	}


	public WebElement getRetail_referncename() {
		return Retail_referncename;
	}


	public WebElement getRetail_referncemobilenumber() {
		return Retail_referncemobilenumber;
	}


	public WebElement getRetail_refernceemail() {
		return Retail_refernceemail;
	}


	public WebElement getRetail_salesmanager() {
		return Retail_salesmanager;
	}


	public WebElement getRetail_Bop() {
		return Retail_Bop;
	}


	public WebElement getRetail_regionalmanager() {
		return Retail_regionalmanager;
	}


	public WebElement getRetail_telecaller() {
		return Retail_telecaller;
	}


	public WebElement getRetail_transactiondate() {
		return Retail_transactiondate;
	}


	public WebElement getRetail_policycoverages() {
		return Retail_policycoverages;
	}


	public WebElement getRetail_coipath() {
		return Retail_coipath;
	}


	public WebElement getHRCheckbox() {
		return HRCheckbox;
	}


	public WebElement getRetailTPA() {
		return RetailTPA;
	}


	public WebElement getRetailTPApercentage() {
		return RetailTPApercentage;
	}


	public WebElement getRetailTPAcontactname() {
		return RetailTPAcontactname;
	}


	public WebElement getRetailTPAcontactdetails() {
		return RetailTPAcontactdetails;
	}


	public WebElement getRetailTPAcontactemail() {
		return RetailTPAcontactemail;
	}


	public WebElement getRetailTPAAddnew() {
		return RetailTPAAddnew;
	}


	public WebElement getRetailpolicydocumentsaddnew() {
		return Retailpolicydocumentsaddnew;
	}


	public WebElement getRetailpolicydocumenttile() {
		return Retailpolicydocumenttile;
	}


	public WebElement getRetailpolicydocumentremarks() {
		return Retailpolicydocumentremarks;
	}


	public WebElement getRetailpolicydocumentbrowse() {
		return Retailpolicydocumentbrowse;
	}


	public WebElement getRetailpreviouspolicycheckbox() {
		return Retailpreviouspolicycheckbox;
	}


	public WebElement getRetailpreviouspolicyNumber() {
		return RetailpreviouspolicyNumber;
	}


	public WebElement getRetailpreviousinsurancecompany() {
		return Retailpreviousinsurancecompany;
	}


	public WebElement getRetailpreviousnoofmembers() {
		return Retailpreviousnoofmembers;
	}


	public WebElement getRetailpreviouspremium() {
		return Retailpreviouspremium;
	}


	public WebElement getRetailprevioussuminsured() {
		return Retailprevioussuminsured;
	}


	public WebElement getRetailpreviousnoofclaims() {
		return Retailpreviousnoofclaims;
	}


	public WebElement getRetailpreviousclaimedamount() {
		return Retailpreviousclaimedamount;
	}


	public WebElement getRetailmembersdetailstab() {
		return Retailmembersdetailstab;
	}


	public WebElement getRetailnomineefirstname() {
		return Retailnomineefirstname;
	}


	public WebElement getRetailnomineelastname() {
		return Retailnomineelastname;
	}


	public WebElement getRetailnomineemobilenumber() {
		return Retailnomineemobilenumber;
	}


	public WebElement getRetailnomineeemail() {
		return Retailnomineeemail;
	}


	public WebElement getRetailnomineedob() {
		return Retailnomineedob;
	}


	public WebElement getRetailnomineerelationship() {
		return Retailnomineerelationship;
	}


	public WebElement getRetailnomineeaddress1() {
		return Retailnomineeaddress1;
	}


	public WebElement getRetailnomineeaddress2() {
		return Retailnomineeaddress2;
	}


	public WebElement getRetailCoverageandPremiumdetailstab() {
		return RetailCoverageandPremiumdetailstab;
	}


	public WebElement getRetailpolicycoverageAddnew() {
		return RetailpolicycoverageAddnew;
	}


	public WebElement getRetailpolicycoveragetitle() {
		return Retailpolicycoveragetitle;
	}


	public WebElement getRetailpolicycoverageamount() {
		return Retailpolicycoverageamount;
	}


	public WebElement getRetailpremiumdetailsaddnew() {
		return Retailpremiumdetailsaddnew;
	}


	public WebElement getRetailpremiumdetailstitle() {
		return Retailpremiumdetailstitle;
	}


	public WebElement getRetailpremiumdetailsdescription() {
		return Retailpremiumdetailsdescription;
	}


	public WebElement getRetailpremiumdetailspremiumrate() {
		return Retailpremiumdetailspremiumrate;
	}


	public WebElement getRetailpremiumdetailsGst() {
		return RetailpremiumdetailsGst;
	}


	public WebElement getRetaildiscountdetailaddnew() {
		return Retaildiscountdetailaddnew;
	}


	public WebElement getRetaildiscountdetailtitle() {
		return Retaildiscountdetailtitle;
	}


	public WebElement getRetaildiscountdetailamount() {
		return Retaildiscountdetailamount;
	}


	public WebElement getRetailpolicysavebutton() {
		return Retailpolicysavebutton;
	}
	
	public WebElement getRetail_mobileno_search() {
		return Retail_mobileno_search;
	}
	@FindBy(xpath="/html/body/div[3]/div[3]/div/button")
	private WebElement pwOk;
	
	public WebElement getPwOk() {
		return pwOk;
	}
	@FindBy(xpath="//div[@class='tile-stats pro_tile_6']")
	private WebElement Protection;

    public WebElement getProtection() {
		return Protection;
	}
    @FindBy(xpath="//div[@class='iradio_square-green checked']")
    private WebElement cust_yes;
    @FindBy(xpath="//div[@class='iradio_square-green']")
    private WebElement cust_No;

	public WebElement getCust_yes() {
		return cust_yes;
	}


	public WebElement getCust_No() {
		return cust_No;
	}
	
	
	
	@FindBy(xpath = "//div[@class='tile-stats pro_tile_10']")
	private WebElement ProductSegmentHouseholder;

public WebElement getProductSegmentHouseholder() {
		return ProductSegmentHouseholder;
	}

@FindBy(xpath="//a[normalize-space()='Property Details']")
	private WebElement Hrpropertydetails ;
	
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
}
