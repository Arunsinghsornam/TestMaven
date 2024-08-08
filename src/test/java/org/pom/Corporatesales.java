package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corporatesales extends BaseClass {

	//-------------------------
	@FindBy (xpath="//span[normalize-space()='Sales']")
	private WebElement sales;

	@FindBy (xpath="//a[normalize-space()='Product Segments']")
	private WebElement productsegment;


	//-----------------------Protection------------------------//

	@FindBy(xpath="//body//div[@id='wrapper']//div[@class='row']//div[@class='row']//div[1]//a[1]")
	private WebElement protection;

	@FindBy(xpath="//*[@id=\"productplans\"]/div[3]/a")
	private WebElement protection_group;

	@FindBy (xpath="//a[@class='btn btn-primary']")
	private WebElement Protection_viewPlans;

	@FindBy (xpath="//a[normalize-space()='New Policy']")
	private WebElement corporateProtection_newpolicy;

	@FindBy(xpath="//input[@id='custid']")
	private WebElement corporateProtection_customerId;

	@FindBy(xpath="//select[@id='policy_type']")
	private WebElement corporateProtection_policytype;

	@FindBy(xpath="//div[@class='iradio_square-green checked']//ins[@class='iCheck-helper']")
	private WebElement corporateProtection_Isrenewable_Yes;

	@FindBy(xpath="//div[@class='iradio_square-green']//ins[@class='iCheck-helper']")
	private WebElement corporateProtection_Isrenewable_No;

	@FindBy(xpath="//input[@id='policy_number']")
	private WebElement corporateProtection_policyNo;

	@FindBy(xpath="//input[@id='start_date']")
	private WebElement corporateProtection_startdate;

	@FindBy(xpath="//input[@id='end_date']")
	private WebElement corporateProtection_EndDate;

	@FindBy(xpath="//input[@id='issuance_date']")
	private WebElement corporateProtection_issuancedate;

	@FindBy(xpath="//input[@id='policy_term']")
	private WebElement corporateProtection_policyterm;

	@FindBy(xpath="//select[@id='referance']")
	private WebElement corporateProtection_referanceType;

	@FindBy(xpath="//input[@id='ref_name']")
	private WebElement corporateProtection_refName;

	@FindBy(xpath="//input[@id='ref_mobile']")
	private WebElement corporateProtection_refMobile;

	@FindBy(xpath="//input[@id='ref_email']")
	private WebElement corporateProtection_refEmail;

	@FindBy(xpath="//select[@id='salesmanager']")
	private WebElement corporateProtection_salemanager;

	@FindBy(xpath="//select[@id='bop']")
	private WebElement corporateProtection_BOP;

	@FindBy(xpath="//select[@id='regionalmanager']")
	private WebElement corporateProtection_regionalmanager;

	@FindBy(xpath="//select[@id='telecaller']")
	private WebElement corporateProtection_telecaller;

	@FindBy(xpath="//input[@id='coi_file_path_cor']")
	private WebElement corporateProtection_choosefile;

	@FindBy (xpath="//select[@id='tpa']")
	private WebElement corporateProtection_tpa;

	@FindBy (xpath="//input[@placeholder='TPA%']")
	private WebElement corporateProtection_TPA;

	@FindBy (xpath="//input[@placeholder='Name']")
	private WebElement corporateProtection_TPAName;

	@FindBy (xpath="//input[@placeholder='Mobile No']")
	private WebElement corporateProtection_TPAMobileNo;

	@FindBy (xpath="//input[@placeholder='Email']")
	private WebElement corporateProtection_TPAEmail;

	@FindBy (xpath="//button[@id='btnaddtparow']")
	private WebElement corporateProtection_TPA_AddNew;

	@FindBy (xpath="//button[@id='btnadddocumentrow']")
	private WebElement corporateProtection_TPA_policy_AddNew;

	@FindBy (xpath="//input[@placeholder='Title']")
	private WebElement corporateProtection_policyDocument_Tile;

	@FindBy (xpath="//input[@placeholder='Remarks']")
	private WebElement corporateProtection_policyDocument_Remarks;

	@FindBy (xpath="//input[@name='RC_policydocuments']")
	private WebElement corporateProtection_policyDocument_Browse;

	@FindBy (xpath="//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
	private WebElement corporateProtection_policyDocument_perviouspolicy_checkbox;

	@FindBy (xpath="//button[@id='btn-save']")
	private WebElement corporateProtection_save;

	@FindBy (xpath="//i[@class='fa fa-expand']")
	private WebElement corporateProtection_ExpandButton;



	public WebElement getSales() {
		return sales;
	}



	public WebElement getProductsegment() {
		return productsegment;
	}


	public WebElement getProtection() {
		return protection;
	}



	public WebElement getProtection_group() {
		return protection_group;
	}



	public WebElement getProtection_viewPlans() {
		return Protection_viewPlans;
	}


	public WebElement getCorporateProtection_newpolicy() {
		return corporateProtection_newpolicy;
	}


	public WebElement getCorporateProtection_customerId() {
		return corporateProtection_customerId;
	}


	public WebElement getCorporateProtection_policytype() {
		return corporateProtection_policytype;
	}



	public WebElement getCorporateProtection_Isrenewable_Yes() {
		return corporateProtection_Isrenewable_Yes;
	}



	public WebElement getCorporateProtection_Isrenewable_No() {
		return corporateProtection_Isrenewable_No;
	}



	public WebElement getCorporateProtection_policyNo() {
		return corporateProtection_policyNo;
	}



	public WebElement getCorporateProtection_startdate() {
		return corporateProtection_startdate;
	}



	public WebElement getCorporateProtection_EndDate() {
		return corporateProtection_EndDate;
	}



	public WebElement getCorporateProtection_issuancedate() {
		return corporateProtection_issuancedate;
	}


	public WebElement getCorporateProtection_policyterm() {
		return corporateProtection_policyterm;
	}

	public WebElement getCorporateProtection_referanceType() {
		return corporateProtection_referanceType;
	}


	public WebElement getCorporateProtection_refName() {
		return corporateProtection_refName;
	}



	public WebElement getCorporateProtection_refMobile() {
		return corporateProtection_refMobile;
	}




	public WebElement getCorporateProtection_refEmail() {
		return corporateProtection_refEmail;
	}



	public WebElement getCorporateProtection_salemanager() {
		return corporateProtection_salemanager;
	}



	public WebElement getCorporateProtection_BOP() {
		return corporateProtection_BOP;
	}



	public WebElement getCorporateProtection_regionalmanager() {
		return corporateProtection_regionalmanager;
	}


	public WebElement getCorporateProtection_telecaller() {
		return corporateProtection_telecaller;
	}


	public WebElement getCorporateProtection_choosefile() {
		return corporateProtection_choosefile;
	}



	public WebElement getCorporateProtection_tpa() {
		return corporateProtection_tpa;
	}


	public WebElement getCorporateProtection_TPA() {
		return corporateProtection_TPA;
	}



	public WebElement getCorporateProtection_TPAName() {
		return corporateProtection_TPAName;
	}



	public WebElement getCorporateProtection_TPAMobileNo() {
		return corporateProtection_TPAMobileNo;
	}


	public WebElement getCorporateProtection_TPAEmail() {
		return corporateProtection_TPAEmail;
	}


	public WebElement getCorporateProtection_TPA_AddNew() {
		return corporateProtection_TPA_AddNew;
	}


	public WebElement getCorporateProtection_TPA_policy_AddNew() {
		return corporateProtection_TPA_policy_AddNew;
	}


	public WebElement getCorporateProtection_policyDocument_Tile() {
		return corporateProtection_policyDocument_Tile;
	}


	public WebElement getCorporateProtection_policyDocument_Remarks() {
		return corporateProtection_policyDocument_Remarks;
	}



	public WebElement getCorporateProtection_policyDocument_Browse() {
		return corporateProtection_policyDocument_Browse;
	}


	public WebElement getCorporateProtection_policyDocument_perviouspolicy_checkbox() {
		return corporateProtection_policyDocument_perviouspolicy_checkbox;
	}

	public WebElement getCorporateProtection_save() {
		return corporateProtection_save;
	}

	public WebElement getCorporateProtection_ExpandButton() {
		return corporateProtection_ExpandButton;
	}





	//------------------------------Health-------------------------------------//

	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[2]/div[2]/div/div/div/div/div[2]/a")
	private WebElement corporateHealth;

	@FindBy(xpath="//*[@id=\"productplans\"]/div[3]/a")
	private WebElement corporateHealth_group;


	@FindBy(xpath="//div[@class='row wrapper wrapper-content animated fadeInRight']//div[2]//div[1]//div[1]//div[2]//div[2]//a[1]")
	private WebElement corporateHealth_group_viewplan;

	@FindBy(xpath="//a[normalize-space()='New Policy']")
	private WebElement corporateHealth_NewPolicy;


	@FindBy(xpath="//input[@id='custid']")
	private WebElement corporateHealth_customerId;

	@FindBy(xpath="//select[@id='policy_type']")
	private WebElement corporateHealth_policytype;

	@FindBy(xpath="//div[@class='iradio_square-green checked']//ins[@class='iCheck-helper']")
	private WebElement corporateHealth_Isrenewable_Yes;

	@FindBy(xpath="//div[@class='iradio_square-green']//ins[@class='iCheck-helper']")
	private WebElement corporateHealth_Isrenewable_No;

	@FindBy(xpath="//input[@id='policy_number']")
	private WebElement corporateHealth_policyNo;

	@FindBy(xpath="//input[@id='start_date']")
	private WebElement corporateHealth_startdate;

	@FindBy(xpath="//input[@id='end_date']")
	private WebElement corporateHealth_EndDate;

	@FindBy(xpath="//input[@id='issuance_date']")
	private WebElement corporateHealth_issuancedate;

	@FindBy(xpath="//input[@id='policy_term']")
	private WebElement corporateHealth_policyterm;

	@FindBy(xpath="//select[@id='referance']")
	private WebElement corporateHealth_referanceType;

	@FindBy(xpath="//input[@id='ref_name']")
	private WebElement corporateHealth_refName;

	@FindBy(xpath="//input[@id='ref_mobile']")
	private WebElement corporateHealth_refMobile;

	@FindBy(xpath="//input[@id='ref_email']")
	private WebElement corporateHealth_refEmail;

	@FindBy(xpath="//select[@id='salesmanager']")
	private WebElement corporateHealth_salemanager;

	@FindBy(xpath="//select[@id='bop']")
	private WebElement corporateHealth_BOP;

	@FindBy(xpath="//select[@id='regionalmanager']")
	private WebElement corporateHealth_regionalmanager;

	@FindBy(xpath="//select[@id='telecaller']")
	private WebElement corporateHealth_telecaller;

	@FindBy(xpath="//input[@id='coi_file_path_cor']")
	private WebElement corporateHealth_choosefile;

	@FindBy (xpath="//select[@id='tpa']")
	private WebElement corporateHealth_tpa;

	@FindBy (xpath="//input[@placeholder='TPA%']")
	private WebElement corporateHealth_TPA;

	@FindBy (xpath="//input[@placeholder='Name']")
	private WebElement corporateHealth_TPAName;

	@FindBy (xpath="//input[@placeholder='Mobile No']")
	private WebElement corporateHealth_TPAMobileNo;

	@FindBy (xpath="//input[@placeholder='Email']")
	private WebElement corporateHealth_TPAEmail;

	@FindBy (xpath="//button[@id='btnaddtparow']")
	private WebElement corporateHealth_TPA_AddNew;

	@FindBy (xpath="//button[@id='btnadddocumentrow']")
	private WebElement corporateHealth_TPA_policy_AddNew;

	@FindBy (xpath="//input[@placeholder='Title']")
	private WebElement corporateHealth_policyDocument_Tile;

	@FindBy (xpath="//input[@placeholder='Remarks']")
	private WebElement corporateHealth_policyDocument_Remarks;

	@FindBy (xpath="//input[@name='RC_policydocuments']")
	private WebElement corporateHealth_policyDocument_Browse;

	@FindBy (xpath="//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
	private WebElement corporateHealth_policyDocument_perviouspolicy_checkbox;

	@FindBy (xpath="//button[@id='btn-save']")
	private WebElement corporateHealth_save;

	@FindBy (xpath="//i[@class='fa fa-expand']")
	private WebElement corporateHealth_ExpandButton;



	public WebElement getCorporateHealth() {
		return corporateHealth;
	}

	public WebElement getCorporateHealth_group() {
		return corporateHealth_group;
	}

	public WebElement getCorporateHealth_group_viewplan() {
		return corporateHealth_group_viewplan;
	}

	public WebElement getCorporateHealth_NewPolicy() {
		return corporateHealth_NewPolicy;
	}

	public WebElement getCorporateHealth_customerId() {
		return corporateHealth_customerId;
	}

	public WebElement getCorporateHealth_policytype() {
		return corporateHealth_policytype;
	}

	public WebElement getCorporateHealth_Isrenewable_Yes() {
		return corporateHealth_Isrenewable_Yes;
	}

	public WebElement getCorporateHealth_Isrenewable_No() {
		return corporateHealth_Isrenewable_No;
	}

	public WebElement getCorporateHealth_policyNo() {
		return corporateHealth_policyNo;
	}

	public WebElement getCorporateHealth_startdate() {
		return corporateHealth_startdate;
	}

	public WebElement getCorporateHealth_EndDate() {
		return corporateHealth_EndDate;
	}

	public WebElement getCorporateHealth_issuancedate() {
		return corporateHealth_issuancedate;
	}

	public WebElement getCorporateHealth_policyterm() {
		return corporateHealth_policyterm;
	}

	public WebElement getCorporateHealth_referanceType() {
		return corporateHealth_referanceType;
	}

	public WebElement getCorporateHealth_refName() {
		return corporateHealth_refName;
	}

	public WebElement getCorporateHealth_refMobile() {
		return corporateHealth_refMobile;
	}

	public WebElement getCorporateHealth_refEmail() {
		return corporateHealth_refEmail;
	}

	public WebElement getCorporateHealth_salemanager() {
		return corporateHealth_salemanager;
	}

	public WebElement getCorporateHealth_BOP() {
		return corporateHealth_BOP;
	}

	public WebElement getCorporateHealth_regionalmanager() {
		return corporateHealth_regionalmanager;
	}

	public WebElement getCorporateHealth_telecaller() {
		return corporateHealth_telecaller;
	}

	public WebElement getCorporateHealth_choosefile() {
		return corporateHealth_choosefile;
	}

	public WebElement getCorporateHealth_tpa() {
		return corporateHealth_tpa;
	}

	public WebElement getCorporateHealth_TPA() {
		return corporateHealth_TPA;
	}

	public WebElement getCorporateHealth_TPAName() {
		return corporateHealth_TPAName;
	}

	public WebElement getCorporateHealth_TPAMobileNo() {
		return corporateHealth_TPAMobileNo;
	}

	public WebElement getCorporateHealth_TPAEmail() {
		return corporateHealth_TPAEmail;
	}

	public WebElement getCorporateHealth_TPA_AddNew() {
		return corporateHealth_TPA_AddNew;
	}

	public WebElement getCorporateHealth_TPA_policy_AddNew() {
		return corporateHealth_TPA_policy_AddNew;
	}

	public WebElement getCorporateHealth_policyDocument_Tile() {
		return corporateHealth_policyDocument_Tile;
	}

	public WebElement getCorporateHealth_policyDocument_Remarks() {
		return corporateHealth_policyDocument_Remarks;
	}

	public WebElement getCorporateHealth_policyDocument_Browse() {
		return corporateHealth_policyDocument_Browse;
	}

	public WebElement getCorporateHealth_policyDocument_perviouspolicy_checkbox() {
		return corporateHealth_policyDocument_perviouspolicy_checkbox;
	}

	public WebElement getCorporateHealth_save() {
		return corporateHealth_save;
	}

	public WebElement getCorporateHealth_ExpandButton() {
		return corporateHealth_ExpandButton;
	}

	//-------------------------------------------------Personal Accident-------------------------//

	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[2]/div[2]/div/div/div/div/div[3]/a")
	private WebElement corporatePersonalAccident;

	@FindBy(xpath="//*[@id=\"productplans\"]/div[3]/a")
	private WebElement corporate_PA_group;




	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement PersonalAccidentCorporate_viewplan;

	@FindBy(xpath="//a[normalize-space()='New Policy']")
	private WebElement PersonalAccidentCorporate_Newpolicy;

	@FindBy(xpath="//input[@id='custid']")
	private WebElement CorporatePersonalAccident_customerId;

	@FindBy(xpath="//select[@id='policy_type']")
	private WebElement CorporatePersonalAccident_policytype;

	@FindBy(xpath="//div[@class='iradio_square-green checked']//ins[@class='iCheck-helper']")
	private WebElement CorporatePersonalAccident_Isrenewable_Yes;

	@FindBy(xpath="//div[@class='iradio_square-green']//ins[@class='iCheck-helper']")
	private WebElement CorporatePersonalAccident_Isrenewable_No;

	@FindBy(xpath="//input[@id='policy_number']")
	private WebElement CorporatePersonalAccident_policyNo;

	@FindBy(xpath="//input[@id='start_date']")
	private WebElement CorporatePersonalAccident_startdate;

	@FindBy(xpath="//input[@id='end_date']")
	private WebElement CorporatePersonalAccident_EndDate;

	@FindBy(xpath="//input[@id='issuance_date']")
	private WebElement CorporatePersonalAccident_issuancedate;

	@FindBy(xpath="//input[@id='policy_term']")
	private WebElement CorporatePersonalAccident_policyterm;

	@FindBy(xpath="//select[@id='referance']")
	private WebElement CorporatePersonalAccident_referanceType;

	@FindBy(xpath="//input[@id='ref_name']")
	private WebElement CorporatePersonalAccident_refName;

	@FindBy(xpath="//input[@id='ref_mobile']")
	private WebElement CorporatePersonalAccident_refMobile;

	@FindBy(xpath="//input[@id='ref_email']")
	private WebElement CorporatePersonalAccident_refEmail;

	@FindBy(xpath="//select[@id='salesmanager']")
	private WebElement CorporatePersonalAccident_salemanager;

	@FindBy(xpath="//select[@id='bop']")
	private WebElement CorporatePersonalAccident_BOP;

	@FindBy(xpath="//select[@id='regionalmanager']")
	private WebElement CorporatePersonalAccident_regionalmanager;

	@FindBy(xpath="//select[@id='telecaller']")
	private WebElement CorporatePersonalAccident_telecaller;

	@FindBy(xpath="//input[@id='coi_file_path_cor']")
	private WebElement CorporatePersonalAccident_choosefile;

	@FindBy (xpath="//select[@id='tpa']")
	private WebElement CorporatePersonalAccident_tpa;

	@FindBy (xpath="//input[@placeholder='TPA%']")
	private WebElement CorporatePersonalAccident_TPA;

	@FindBy (xpath="//input[@placeholder='Name']")
	private WebElement CorporatePersonalAccident_TPAName;

	@FindBy (xpath="//input[@placeholder='Mobile No']")
	private WebElement CorporatePersonalAccident_TPAMobileNo;

	@FindBy (xpath="//input[@placeholder='Email']")
	private WebElement CorporatePersonalAccident_TPAEmail;

	@FindBy (xpath="//button[@id='btnaddtparow']")
	private WebElement CorporatePersonalAccident_TPA_AddNew;

	@FindBy (xpath="//button[@id='btnadddocumentrow']")
	private WebElement CorporatePersonalAccident_TPA_policy_AddNew;

	@FindBy (xpath="//input[@placeholder='Title']")
	private WebElement CorporatePersonalAccident_policyDocument_Tile;

	@FindBy (xpath="//input[@placeholder='Remarks']")
	private WebElement CorporatePersonalAccident_policyDocument_Remarks;

	@FindBy (xpath="//input[@name='RC_policydocuments']")
	private WebElement CorporatePersonalAccident_policyDocument_Browse;

	@FindBy (xpath="//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
	private WebElement CorporatePersonalAccident_policyDocument_perviouspolicy_checkbox;

	@FindBy (xpath="//button[@id='btn-save']")
	private WebElement CorporatePersonalAccident_save;

	@FindBy (xpath="//i[@class='fa fa-expand']")
	private WebElement CorporatePersonalAccident_ExpandButton;



	public WebElement getCorporatePersonalAccident() {
		return corporatePersonalAccident;
	}

	public WebElement getCorporate_PA_group() {
		return corporate_PA_group;
	}

	public WebElement getPersonalAccidentCorporate_viewplan() {
		return PersonalAccidentCorporate_viewplan;
	}

	public WebElement getPersonalAccidentCorporate_Newpolicy() {
		return PersonalAccidentCorporate_Newpolicy;
	}

	public WebElement getCorporatePersonalAccident_customerId() {
		return CorporatePersonalAccident_customerId;
	}

	public WebElement getCorporatePersonalAccident_policytype() {
		return CorporatePersonalAccident_policytype;
	}

	public WebElement getCorporatePersonalAccident_Isrenewable_Yes() {
		return CorporatePersonalAccident_Isrenewable_Yes;
	}

	public WebElement getCorporatePersonalAccident_Isrenewable_No() {
		return CorporatePersonalAccident_Isrenewable_No;
	}

	public WebElement getCorporatePersonalAccident_policyNo() {
		return CorporatePersonalAccident_policyNo;
	}

	public WebElement getCorporatePersonalAccident_startdate() {
		return CorporatePersonalAccident_startdate;
	}

	public WebElement getCorporatePersonalAccident_EndDate() {
		return CorporatePersonalAccident_EndDate;
	}

	public WebElement getCorporatePersonalAccident_issuancedate() {
		return CorporatePersonalAccident_issuancedate;
	}

	public WebElement getCorporatePersonalAccident_policyterm() {
		return CorporatePersonalAccident_policyterm;
	}

	public WebElement getCorporatePersonalAccident_referanceType() {
		return CorporatePersonalAccident_referanceType;
	}

	public WebElement getCorporatePersonalAccident_refName() {
		return CorporatePersonalAccident_refName;
	}

	public WebElement getCorporatePersonalAccident_refMobile() {
		return CorporatePersonalAccident_refMobile;
	}

	public WebElement getCorporatePersonalAccident_refEmail() {
		return CorporatePersonalAccident_refEmail;
	}

	public WebElement getCorporatePersonalAccident_salemanager() {
		return CorporatePersonalAccident_salemanager;
	}

	public WebElement getCorporatePersonalAccident_BOP() {
		return CorporatePersonalAccident_BOP;
	}

	public WebElement getCorporatePersonalAccident_regionalmanager() {
		return CorporatePersonalAccident_regionalmanager;
	}

	public WebElement getCorporatePersonalAccident_telecaller() {
		return CorporatePersonalAccident_telecaller;
	}

	public WebElement getCorporatePersonalAccident_choosefile() {
		return CorporatePersonalAccident_choosefile;
	}

	public WebElement getCorporatePersonalAccident_tpa() {
		return CorporatePersonalAccident_tpa;
	}

	public WebElement getCorporatePersonalAccident_TPA() {
		return CorporatePersonalAccident_TPA;
	}

	public WebElement getCorporatePersonalAccident_TPAName() {
		return CorporatePersonalAccident_TPAName;
	}

	public WebElement getCorporatePersonalAccident_TPAMobileNo() {
		return CorporatePersonalAccident_TPAMobileNo;
	}

	public WebElement getCorporatePersonalAccident_TPAEmail() {
		return CorporatePersonalAccident_TPAEmail;
	}

	public WebElement getCorporatePersonalAccident_TPA_AddNew() {
		return CorporatePersonalAccident_TPA_AddNew;
	}

	public WebElement getCorporatePersonalAccident_TPA_policy_AddNew() {
		return CorporatePersonalAccident_TPA_policy_AddNew;
	}

	public WebElement getCorporatePersonalAccident_policyDocument_Tile() {
		return CorporatePersonalAccident_policyDocument_Tile;
	}

	public WebElement getCorporatePersonalAccident_policyDocument_Remarks() {
		return CorporatePersonalAccident_policyDocument_Remarks;
	}

	public WebElement getCorporatePersonalAccident_policyDocument_Browse() {
		return CorporatePersonalAccident_policyDocument_Browse;
	}

	public WebElement getCorporatePersonalAccident_policyDocument_perviouspolicy_checkbox() {
		return CorporatePersonalAccident_policyDocument_perviouspolicy_checkbox;
	}

	public WebElement getCorporatePersonalAccident_save() {
		return CorporatePersonalAccident_save;
	}

	public WebElement getCorporatePersonalAccident_ExpandButton() {
		return CorporatePersonalAccident_ExpandButton;
	}
	
	//.............................corporate.....Shop Keeper..group.(skg)..After click the Group.................................................//
	
			@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
			private WebElement skgViewplans1;
			
			@FindBy (xpath="//div[@id='page-wrapper']//div[1]//div[1]//div[1]//div[2]//div[3]//div[1]//a[1]")
			private WebElement skgMasterPolicyPlans1;
			
			@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]")
			private WebElement skgViewsPlans2;
			
			@FindBy (xpath="//div[@id='page-wrapper']//div[2]//div[2]//div[2]//div[2]//div[3]//div[1]//a[1]")
			private WebElement skgMasterPolicyPlans2;
			
			@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/a[1]")
			private WebElement  skgViewsPlans3;
			
			@FindBy (xpath="//div[@id='page-wrapper']//div[3]//div[1]//div[1]//div[2]//div[3]//div[1]//a[1]")
			private WebElement groupMasterPolicyPlans3;
			
			public WebElement getSkgViewplans1() {
				return skgViewplans1;
			}
	 
			public WebElement getSkgMasterPolicyPlans1() {
				return skgMasterPolicyPlans1;
			}
	 
			public WebElement getSkgViewsPlans2() {
				return skgViewsPlans2;
			}
	 
			public WebElement getSkgMasterPolicyPlans2() {
				return skgMasterPolicyPlans2;
			}
	 
			public WebElement getSkgViewsPlans3() {
				return skgViewsPlans3;
			}
	 
			public WebElement getGroupMasterPolicyPlans3() {
				return groupMasterPolicyPlans3;
			}
			
			
			
			//.............. after click the plans.............//
			
	 
			@FindBy (xpath="//a[normalize-space()='New Policy']")
			private WebElement skgNewPolicyPlan1;
			
			public WebElement getSkgNewPolicyPlan1() {
				return skgNewPolicyPlan1;
			}
			
			//.................Policy Details.........(pd)..............//
			
			
	 
			
	 
			@FindBy (xpath="//a[normalize-space()='Policy Details']")
			private WebElement skg_policyDetails;
			
			@FindBy (xpath="//input[@id='custid']")
			private WebElement skg_pd_CustomerId;
			
			@FindBy (xpath="//select[@id='policy_type']")
			private WebElement skg_pd_PolicyTypeSelect;
			
			@FindBy (xpath="//div[@class='checkbox-inline i-checks']//label[1]")
			private WebElement skg_pd_IsRenewableClickYes;
			
			@FindBy (xpath="//div[@class='checkbox-inline i-checks']//label[2]")
			private WebElement skg_pd_IsRenewableClickNo;
			
			@FindBy (xpath="//input[@id='policy_number']")
			private WebElement skg_pd_PolicyNumber;
			
			@FindBy (xpath="//input[@id='start_date']")
			private WebElement skg_pd_PolicyStartDate;
			
			@FindBy (xpath="//input[@id='end_date']")
			private WebElement skg_pd_PolicyEndDate;
			
			@FindBy (xpath="//input[@id='issuance_date']")
			private WebElement skg_pd_PolicyIssuanceDate;
			
			@FindBy (xpath="//input[@id='policy_term']")
			private WebElement skg_pd_PolicyTerm;
			
			@FindBy (xpath="//select[@id='referance']")
			private WebElement skg_pd_ReferanceTypeSelect;
	 
			@FindBy (xpath="//input[@id='ref_name']")
			private WebElement skg_pd_RefName;
			
			@FindBy (xpath="//input[@id='ref_mobile']")
			private WebElement skg_pd_RefMobileNo;
			
			@FindBy (xpath="//input[@id='ref_email']")
			private WebElement skg_pd_RefEmail;
			
			@FindBy (xpath="//select[@id='salesmanager']")
			private WebElement skg_pd_SalesManagerSelect;
			
			@FindBy(xpath="//select[@id='bop']")
			private WebElement skg_pd_BOP;
			
			@FindBy (xpath="//select[@id='regionalmanager']")
			private WebElement skg_pd_RegionalManagerSelect;
			
			@FindBy (xpath="//select[@id='telecaller']")
			private WebElement skg_pd_TeleCallerSelect;
			
			@FindBy (xpath="//input[@id='coi_file_path_cor']")
			private WebElement skg_pd_COIupload;
			
			@FindBy (xpath="//select[@id='tpa']")
			private WebElement skg_pd_TPASelect;
			
			@FindBy (xpath="//input[@placeholder='TPA%']")
			private WebElement skg_pd_TPApercentage;
			
			@FindBy (xpath="//input[@placeholder='Name']")
			private WebElement skg_pd_TPAContactName;
			
			@FindBy (xpath="//input[@placeholder='Mobile No']")
			private WebElement skg_pd_TPAContactMobile;
			
			@FindBy (xpath="//input[@placeholder='Email']")
			private WebElement skg_pd_TPAContactEmail;
			
			@FindBy (xpath="//button[@id='btnaddtparow']")
			private WebElement skg_pd_TPAAddNewRow;
			
			@FindBy (xpath="//tr[@id='brokerdetails_0']//button[1]")
			private WebElement skg_pd_TPARemoveRow;
			
			@FindBy (xpath="//input[contains(@placeholder,'Title')]")
			private WebElement skg_pd_PolicyDocumentsTitle;
			
			@FindBy (xpath="//input[@placeholder='Remarks']")
			private WebElement skg_pd_PolicyDocumentsRemarks;
			
			@FindBy (xpath="//input[contains(@name,'RC_policydocuments')]")
			private WebElement skg_pd_PolicyDocumentsDocumentFileBrowse;
			
			@FindBy (xpath="//button[@id='btnadddocumentrow']")
			private WebElement skg_pd_PolicyDocumentsAddNewRow;
			
			@FindBy (xpath="//tr[@id='brokerdetails_1']//i[contains(@class,'fa fa-minus-circle')]")
			private WebElement skg_pd_PolicyDocumentsRemove;
			
			@FindBy (xpath="//label[normalize-space()='Do you have any Previous Policy?']")
			private WebElement skg_pd_DoyouhaveanyPreviousPolicy;
			
			//..............previous Policy Details.....(ppd)............//
			
			@FindBy (xpath="//input[@id='pre_policy_number']")
			private WebElement skg_pd_ppd_PolicyNumber;
			
			@FindBy (xpath="//input[@id='pre_insurance']")
			private WebElement skg_pd_ppd_InsuranceCompany;
			
			@FindBy (xpath="//input[@id='pre_members']")
			private WebElement skg_pd_ppd_NoOfMembers;
			
			@FindBy (xpath="//input[@id='pre_premium']")
			private WebElement skg_pd_ppd_Premium;
			
			@FindBy (xpath="//input[@id='pre_sum_assured']")
			private WebElement skg_pd_ppd_Sumassured;
			
			@FindBy (xpath="//input[@id='pre_no_claims']")
			private WebElement skg_pd_ppd_NoOfClaims;
			
			@FindBy (xpath="//input[@id='pre_claimamount']")
			private WebElement skg_pd_ppd_ClaimedAmount;
			
		
		public WebElement getSkg_policyDetails() {
				return skg_policyDetails;
			}
	 
			public WebElement getSkg_pd_CustomerId() {
				return skg_pd_CustomerId;
			}
	 
			public WebElement getSkg_pd_PolicyTypeSelect() {
				return skg_pd_PolicyTypeSelect;
			}
	 
			public WebElement getSkg_pd_IsRenewableClickYes() {
				return skg_pd_IsRenewableClickYes;
			}
	 
			public WebElement getSkg_pd_IsRenewableClickNo() {
				return skg_pd_IsRenewableClickNo;
			}
	 
			public WebElement getSkg_pd_PolicyNumber() {
				return skg_pd_PolicyNumber;
			}
	 
			public WebElement getSkg_pd_PolicyStartDate() {
				return skg_pd_PolicyStartDate;
			}
	 
			public WebElement getSkg_pd_PolicyEndDate() {
				return skg_pd_PolicyEndDate;
			}
	 
			public WebElement getSkg_pd_PolicyIssuanceDate() {
				return skg_pd_PolicyIssuanceDate;
			}
	 
			public WebElement getSkg_pd_PolicyTerm() {
				return skg_pd_PolicyTerm;
			}
	 
			public WebElement getSkg_pd_ReferanceTypeSelect() {
				return skg_pd_ReferanceTypeSelect;
			}
	 
			public WebElement getSkg_pd_RefName() {
				return skg_pd_RefName;
			}
	 
			public WebElement getSkg_pd_RefMobileNo() {
				return skg_pd_RefMobileNo;
			}
	 
			public WebElement getSkg_pd_RefEmail() {
				return skg_pd_RefEmail;
			}
	 
			public WebElement getSkg_pd_SalesManagerSelect() {
				return skg_pd_SalesManagerSelect;
			}
	 
			public WebElement getSkg_pd_BOP() {
				return skg_pd_BOP;
			}
	 
			public WebElement getSkg_pd_RegionalManagerSelect() {
				return skg_pd_RegionalManagerSelect;
			}
	 
			public WebElement getSkg_pd_TeleCallerSelect() {
				return skg_pd_TeleCallerSelect;
			}
	 
			public WebElement getSkg_pd_COIupload() {
				return skg_pd_COIupload;
			}
	 
			public WebElement getSkg_pd_TPASelect() {
				return skg_pd_TPASelect;
			}
	 
			public WebElement getSkg_pd_TPApercentage() {
				return skg_pd_TPApercentage;
			}
	 
			public WebElement getSkg_pd_TPAContactName() {
				return skg_pd_TPAContactName;
			}
	 
			public WebElement getSkg_pd_TPAContactMobile() {
				return skg_pd_TPAContactMobile;
			}
	 
			public WebElement getSkg_pd_TPAContactEmail() {
				return skg_pd_TPAContactEmail;
			}
	 
			public WebElement getSkg_pd_TPAAddNewRow() {
				return skg_pd_TPAAddNewRow;
			}
	 
			public WebElement getSkg_pd_TPARemoveRow() {
				return skg_pd_TPARemoveRow;
			}
	 
			public WebElement getSkg_pd_PolicyDocumentsTitle() {
				return skg_pd_PolicyDocumentsTitle;
			}
	 
			public WebElement getSkg_pd_PolicyDocumentsRemarks() {
				return skg_pd_PolicyDocumentsRemarks;
			}
	 
			public WebElement getSkg_pd_PolicyDocumentsDocumentFileBrowse() {
				return skg_pd_PolicyDocumentsDocumentFileBrowse;
			}
	 
			public WebElement getSkg_pd_PolicyDocumentsAddNewRow() {
				return skg_pd_PolicyDocumentsAddNewRow;
			}
	 
			public WebElement getSkg_pd_PolicyDocumentsRemove() {
				return skg_pd_PolicyDocumentsRemove;
			}
	 
			public WebElement getSkg_pd_DoyouhaveanyPreviousPolicy() {
				return skg_pd_DoyouhaveanyPreviousPolicy;
			}
	 
			public WebElement getSkg_pd_ppd_PolicyNumber() {
				return skg_pd_ppd_PolicyNumber;
			}
	 
			public WebElement getSkg_pd_ppd_InsuranceCompany() {
				return skg_pd_ppd_InsuranceCompany;
			}
	 
			public WebElement getSkg_pd_ppd_NoOfMembers() {
				return skg_pd_ppd_NoOfMembers;
			}
	 
			public WebElement getSkg_pd_ppd_Premium() {
				return skg_pd_ppd_Premium;
			}
	 
			public WebElement getSkg_pd_ppd_Sumassured() {
				return skg_pd_ppd_Sumassured;
			}
	 
			public WebElement getSkg_pd_ppd_NoOfClaims() {
				return skg_pd_ppd_NoOfClaims;
			}
	 
			public WebElement getSkg_pd_ppd_ClaimedAmount() {
				return skg_pd_ppd_ClaimedAmount;
			}
	 
			//.......................Coverage and premium Details.....(cpd)...........................//
			
			//..........Risk Details.....(rd)..............//
			
			@FindBy (xpath="//input[@id='risk']")
			private WebElement skg_cpd_rd_Title;
			
			@FindBy (xpath="//input[@id='riskdescription']")
			private WebElement skg_cpd_rd_DescriptionOfProperty;
			
			@FindBy (xpath="//input[@id='risksuminsured']")
			private WebElement skg_cpd_rd_SumInsured;
			
			@FindBy (xpath="//button[@class='btn btn-success btn-sm employees']")
			private WebElement skg_cpd_rd_LocationDetails;
			
			//..........After click the Location details.............//
			
			@FindBy (xpath="//input[@id='1536']")
			private WebElement  skg_cpd_rd_LocationDetailsclickcheckbox;
			
			@FindBy (xpath="//div[@id='employee_modal']//button[@id='branch_close']")
			private WebElement skg_cpd_rd_LocationDetailsClosebtn;
			
			@FindBy (xpath="//button[@id='emp_ok']")
			private WebElement skg_cpd_rd_LocationDetailsOkbtn;
			
			@FindBy (xpath="//input[@id='riskexcess']")
			private WebElement skg_cpd_rd_Excess;
			
			@FindBy (xpath="//button[@id='btnaddexpanserow']")
			private WebElement skg_cpd_rd_AddNewRow;
			
			//......................After click the AddNew Button...............................//
			
			@FindBy (xpath="//select[@id='coverage']")
			private WebElement skg_cpd_rd_AddNewRowChooseCoverageforSelect;
			
			@FindBy (xpath="//button[@id='coverage_close']")
			private WebElement skg_cpd_rd_AddNewRowCloseBtn;
			
			@FindBy (xpath="//button[@id='coverage_ok']")
			private WebElement skg_cpd_rd_AddNewRowOkBtn;
			
			@FindBy (xpath="//tr[@id='risk_2']//button[contains(@class,'remove')]")
			private WebElement skg_cpd_rd_RemoveRow;
			
			//.............Premium Details....(pd)..........//
			
			@FindBy (xpath="//div[@class='display-flex m-b']//input[@placeholder='Coverage']")
			private WebElement skg_cpd_pd_Title;
			
			@FindBy (xpath="//td[contains(@class,'td_description')]//input[contains(@placeholder,'Description')]")
			private WebElement skg_cpd_pd_Description;
			
			@FindBy (xpath="//input[contains(@placeholder,'Premium Rate')]")
			private WebElement skg_cpd_pd_PremiumRate;
			
			@FindBy (xpath="//input[@value='18']")
			private WebElement skg_cpd_pd_GST;
			
			@FindBy (xpath="//td[@class='td_gstamount']//input[@name='Share']")
			private WebElement skg_cpd_pd_GSTAmount;
			
			@FindBy (xpath="//td[@class='td_netpremium']//input[@name='Share']")
			private WebElement skg_cpd_pd_NetPremium;
			
			@FindBy (xpath="//button[@id='btnaddpremiumrow']")
			private WebElement skg_cpd_pd_AddNewRow;
			
			@FindBy (xpath="//tr[@id='premiumdetails_0']//button[1]")
			private WebElement skg_cpd_pd_RemoveRow;
			
			//...................Discount Details........(dd).........................//
			
			@FindBy (xpath="//input[@id='expenseclaim']")
			private WebElement skg_cpd_dd_Title;
			
			@FindBy (xpath="//input[@id='expenseamount']")
			private WebElement skg_cpd_dd_Amount;
			
			@FindBy (xpath="//button[@id='btndiscountrow']")
			private WebElement skg_cpd_dd_AddNewRow;
			
			@FindBy (xpath="//tr[@id='discountdetails_0']//button[1]")
			private WebElement skg_cpd_dd_RemoveRow;
			
			
			
			
			
			
		public WebElement getSkg_cpd_rd_Title() {
				return skg_cpd_rd_Title;
			}
	 
			public WebElement getSkg_cpd_rd_DescriptionOfProperty() {
				return skg_cpd_rd_DescriptionOfProperty;
			}
	 
			public WebElement getSkg_cpd_rd_SumInsured() {
				return skg_cpd_rd_SumInsured;
			}
	 
			public WebElement getSkg_cpd_rd_LocationDetails() {
				return skg_cpd_rd_LocationDetails;
			}
	 
			public WebElement getSkg_cpd_rd_LocationDetailsclickcheckbox() {
				return skg_cpd_rd_LocationDetailsclickcheckbox;
			}
	 
			public WebElement getSkg_cpd_rd_LocationDetailsClosebtn() {
				return skg_cpd_rd_LocationDetailsClosebtn;
			}
	 
			public WebElement getSkg_cpd_rd_LocationDetailsOkbtn() {
				return skg_cpd_rd_LocationDetailsOkbtn;
			}
	 
			public WebElement getSkg_cpd_rd_Excess() {
				return skg_cpd_rd_Excess;
			}
	 
			public WebElement getSkg_cpd_rd_AddNewRow() {
				return skg_cpd_rd_AddNewRow;
			}
	 
			public WebElement getSkg_cpd_rd_AddNewRowChooseCoverageforSelect() {
				return skg_cpd_rd_AddNewRowChooseCoverageforSelect;
			}
	 
			public WebElement getSkg_cpd_rd_AddNewRowCloseBtn() {
				return skg_cpd_rd_AddNewRowCloseBtn;
			}
	 
			public WebElement getSkg_cpd_rd_AddNewRowOkBtn() {
				return skg_cpd_rd_AddNewRowOkBtn;
			}
	 
			public WebElement getSkg_cpd_rd_RemoveRow() {
				return skg_cpd_rd_RemoveRow;
			}
	 
			public WebElement getSkg_cpd_pd_Title() {
				return skg_cpd_pd_Title;
			}
	 
			public WebElement getSkg_cpd_pd_Description() {
				return skg_cpd_pd_Description;
			}
	 
			public WebElement getSkg_cpd_pd_PremiumRate() {
				return skg_cpd_pd_PremiumRate;
			}
	 
			public WebElement getSkg_cpd_pd_GST() {
				return skg_cpd_pd_GST;
			}
	 
			public WebElement getSkg_cpd_pd_GSTAmount() {
				return skg_cpd_pd_GSTAmount;
			}
	 
			public WebElement getSkg_cpd_pd_NetPremium() {
				return skg_cpd_pd_NetPremium;
			}
	 
			public WebElement getSkg_cpd_pd_AddNewRow() {
				return skg_cpd_pd_AddNewRow;
			}
	 
			public WebElement getSkg_cpd_pd_RemoveRow() {
				return skg_cpd_pd_RemoveRow;
			}
	 
			public WebElement getSkg_cpd_dd_Title() {
				return skg_cpd_dd_Title;
			}
	 
			public WebElement getSkg_cpd_dd_Amount() {
				return skg_cpd_dd_Amount;
			}
	 
			public WebElement getSkg_cpd_dd_AddNewRow() {
				return skg_cpd_dd_AddNewRow;
			}
	 
			public WebElement getSkg_cpd_dd_RemoveRow() {
				return skg_cpd_dd_RemoveRow;
			}
			//--------
			@FindBy (xpath="//a[normalize-space()='Coverage and Premium Details']")
			private WebElement Coverage_and_Premium_Details;
			
			public WebElement getCoverage_and_Premium_Details() {
				return Coverage_and_Premium_Details;
			}

			@FindBy(xpath="//input[@id='1920']")
			private WebElement Employee_locationdetails;
			
			@FindBy(xpath="//input[@id='1164']")
			private WebElement branchselect_locationdetails;
			
			@FindBy(xpath="//button[@id='branch_ok']")
			private WebElement branchok_locationdetails;
			
			public WebElement getBranchok_locationdetails() {
				return branchok_locationdetails;
			}



			public WebElement getBranchselect_locationdetails() {
				return branchselect_locationdetails;
			}





			@FindBy(xpath="//button[@class='btn btn-success btn-sm branches']")
			private WebElement branch_locationdetails;
			
			public WebElement getBranch_locationdetails() {
				return branch_locationdetails;
			}



			public WebElement getEmployee_locationdetails() {
				return Employee_locationdetails;
			}
			
			//................close shop keeper for corporate .....................................//
			
			@FindBy(xpath="//a[normalize-space()='Corporate Policies Upload']")
			private WebElement corporate_policies_upload;

			@FindBy(xpath="//select[@id='orgid']")
			private WebElement corporate_selectOrganization;
			
			@FindBy(xpath="//select[@id='branchid']")
			private WebElement corporate_selectBranch;
			
			@FindBy(xpath="//select[@id='productid']")
			private WebElement corporate_selectProduct;
			
			@FindBy(xpath="//select[@id='productplanid']")
			private WebElement corporate_selectPlan;
			
			@FindBy(xpath="//button[@id='bulkpol_btn']")
			private WebElement corporate_bulkupload;
			
			@FindBy(xpath="//input[@id='rc_excelfile']")
			private WebElement corporate_ExcelUpload;
			
			@FindBy(xpath="//div[@id='rc_upload_btn']//button[@id='upload_data']")
			private WebElement corporate_uploadbutton;
			
			@FindBy(xpath="//button[normalize-space()='Yes']")
			private WebElement corporate_Yes_bulkupload;
			
			public WebElement getCorporate_Yes_bulkupload() {
				return corporate_Yes_bulkupload;
			}



			public WebElement getCorporate_uploadbutton() {
				return corporate_uploadbutton;
			}



			public WebElement getCorporate_ExcelUpload() {
				return corporate_ExcelUpload;
			}



			public WebElement getCorporate_bulkupload() {
				return corporate_bulkupload;
			}


			public WebElement getCorporate_selectOrganization() {
				return corporate_selectOrganization;
			}



			public WebElement getCorporate_selectBranch() {
				return corporate_selectBranch;
			}



			public WebElement getCorporate_selectProduct() {
				return corporate_selectProduct;
			}



			public WebElement getCorporate_selectPlan() {
				return corporate_selectPlan;
			}
			
			public WebElement getCorporate_policies_upload() {
				return corporate_policies_upload;
			}


			//CorporateHR--------------
			@FindBy(xpath="//span[normalize-space()='PMS']")
			private WebElement Corporate_HR_PMS;
			@FindBy(xpath="//a[normalize-space()='Master Policies']")
			private WebElement Corporate_MasterPolice;
			@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/a[2]")
		    private WebElement Corporate_HR_Plans;
			@FindBy(xpath="//a[normalize-space()='New Proposal']")
			private WebElement Corporate_HR_Newproposal;
			@FindBy(xpath="//input[@id='custid']")
			private WebElement Corporate_HR_Cudtid;
			@FindBy(xpath="//select[@id='policy_type']")
			private WebElement Corporate_Hr_policyType;
			@FindBy(xpath="//input[@id='policy_number']")
			private WebElement Corporate_HR_PolicyNumber;
			@FindBy(xpath="//input[@id='start_date']")
			private WebElement Corporate_HR_StartDate;
			
			@FindBy(xpath="//input[@id='end_date']")
			private WebElement Corporate_HR_endDate;
			@FindBy(xpath="//input[@id='issuance_date']")
			private WebElement Corporate_HR_issuanceDate;
			@FindBy(xpath="//input[@id='policy_term']")
			private WebElement Corporate_HR_PolicyTerm;
			@FindBy(xpath="//select[@id='referance']")
			private WebElement Corporate_HR_ReferenceType;
			@FindBy(xpath="//input[@id='ref_name']")
			private WebElement Corporate_HR_RefName;
			@FindBy(xpath="//input[@id='ref_mobile']")
			private WebElement Corporate_HR_Ref_mobile;
			@FindBy(xpath="//input[@id='ref_email']")
			private WebElement Corporate_HR_Ref_email;
			@FindBy(xpath="//select[@id='salesmanager']")
			private WebElement Corporate_HR_SaleManger;
			@FindBy(xpath="//select[@id='bop']")
			private WebElement Corporate_HR_BOP;
			@FindBy(xpath="//select[@id='regionalmanager']")
			private WebElement Corporate_HR_ReginManager;
			
			@FindBy(xpath="//select[@id='telecaller']")
			private WebElement Corporate_HR_Telecaller;
			@FindBy(xpath="//input[@id='coi_file_path_cor']")
			private WebElement Corporate_HR_CoiPath;
			@FindBy(xpath="//select[@id='tpa']")
			private WebElement Corporate_HR_TPASelect;
			@FindBy(xpath="//input[@placeholder='TPA%']")
			private WebElement Corporate_HR_TPA_Percentage;
			@FindBy(xpath="//input[@placeholder='Name']")
			private WebElement Corporate_HR_TPA_Name;
			@FindBy(xpath="//input[@placeholder='Mobile No']")
			private WebElement Corporate_HR_TPA_Mobile;
			@FindBy(xpath="//input[@placeholder='Email']")
			private WebElement Corporate_HR_TPA_Email;
			//--------------------------Previous policy-------------------------
			@FindBy(xpath="//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
			private WebElement Pre_checkbox;
			@FindBy(xpath="//input[@id='pre_policy_number']")
			private WebElement  Pre_policyNumber;
			@FindBy(xpath="//input[@id='pre_insurance']")
			private WebElement Pre_ins;
			
			
			
			//------------------Policy Document----------------------
			@FindBy(xpath="//input[@placeholder='Title']")
			private WebElement Corporate_HR_PD_Title;
			@FindBy(xpath="//input[@placeholder='Remarks']")
			private WebElement Corporate_HR_PD_Remarks;
			@FindBy(xpath="//span[contains(text(),'Browse...')]")
			private WebElement Corporate_HR_PD_Browse;
			//--------------------------------Coverage and Premium Details---------
			@FindBy(xpath="//a[normalize-space()='Coverage and Premium Details']")
			private WebElement Corporate_HR_Coverage_Tab;
			@FindBy(xpath="//input[@id='risk']")
			private WebElement Corporate_HR_Risk_title;
			@FindBy(xpath="//input[@id='riskdescription']")
			private WebElement Corporate_HR_RiskDescription;
			@FindBy(xpath="//input[@id='risksuminsured']")
			private WebElement Corporate_HR_Risk_suminsure;
			@FindBy(xpath="//input[@id='riskexcess']")
			private WebElement Corporate_HR_Risk_excess;
			//-----------------Premium details---------------
			@FindBy(xpath="//div[@class='display-flex m-b']//input[@placeholder='Coverage']")
			private WebElement Corporate_HR_Premium_title;
			@FindBy(xpath="//div[@class='display-flex m-b']//input[@placeholder='Description']")
			private WebElement Corporate_HR_Premium_Description;
			@FindBy(xpath="//td[@class='td_premiumrate numberonly']")
			private WebElement Corporate_HR_Premium_rate;
			
			@FindBy(xpath="//input[@value='18']")
			private WebElement Corporate_HR_Premium_GST;
			@FindBy(xpath="//input[@id='expenseclaim']")
			private WebElement Corporate_HR_Discount_Title;
			@FindBy(xpath="(//input[@id='expenseamount'])[1]")
			private WebElement Corporate_HR_Disc_Amount;
			@FindBy(xpath="//button[@id='btn-save']")
			private WebElement Corporate_HR_Save_btn;
			
			
			public WebElement getCorporate_HR_PMS() {
				return Corporate_HR_PMS;
			}


			public WebElement getCorporate_MasterPolice() {
				return Corporate_MasterPolice;
			}


			public WebElement getCorporate_HR_Plans() {
				return Corporate_HR_Plans;
			}


			public WebElement getCorporate_HR_Newproposal() {
				return Corporate_HR_Newproposal;
			}


			public WebElement getCorporate_HR_Cudtid() {
				return Corporate_HR_Cudtid;
			}


			public WebElement getCorporate_Hr_policyType() {
				return Corporate_Hr_policyType;
			}


			public WebElement getCorporate_HR_PolicyNumber() {
				return Corporate_HR_PolicyNumber;
			}


			public WebElement getCorporate_HR_StartDate() {
				return Corporate_HR_StartDate;
			}


			public WebElement getCorporate_HR_endDate() {
				return Corporate_HR_endDate;
			}


			public WebElement getCorporate_HR_issuanceDate() {
				return Corporate_HR_issuanceDate;
			}


			public WebElement getCorporate_HR_PolicyTerm() {
				return Corporate_HR_PolicyTerm;
			}



			public WebElement getCorporate_HR_ReferenceType() {
				return Corporate_HR_ReferenceType;
			}


			public WebElement getPre_checkbox() {
				return Pre_checkbox;
			}


			public WebElement getPre_policyNumber() {
				return Pre_policyNumber;
			}


			public WebElement getPre_ins() {
				return Pre_ins;
			}




			public WebElement getCorporate_HR_RefName() {
				return Corporate_HR_RefName;
			}


			public WebElement getCorporate_HR_Ref_mobile() {
				return Corporate_HR_Ref_mobile;
			}


			public WebElement getCorporate_HR_Ref_email() {
				return Corporate_HR_Ref_email;
			}


			public WebElement getCorporate_HR_SaleManger() {
				return Corporate_HR_SaleManger;
			}


			public WebElement getCorporate_HR_BOP() {
				return Corporate_HR_BOP;
			}


			public WebElement getCorporate_HR_ReginManager() {
				return Corporate_HR_ReginManager;
			}


			public WebElement getCorporate_HR_Telecaller() {
				return Corporate_HR_Telecaller;
			}


			public WebElement getCorporate_HR_CoiPath() {
				return Corporate_HR_CoiPath;
			}


			public WebElement getCorporate_HR_TPASelect() {
				return Corporate_HR_TPASelect;
			}


			public WebElement getCorporate_HR_TPA_Percentage() {
				return Corporate_HR_TPA_Percentage;
			}


			public WebElement getCorporate_HR_TPA_Name() {
				return Corporate_HR_TPA_Name;
			}


			public WebElement getCorporate_HR_TPA_Mobile() {
				return Corporate_HR_TPA_Mobile;
			}


			public WebElement getCorporate_HR_TPA_Email() {
				return Corporate_HR_TPA_Email;
			}


			public WebElement getCorporate_HR_PD_Title() {
				return Corporate_HR_PD_Title;
			}


			public WebElement getCorporate_HR_PD_Remarks() {
				return Corporate_HR_PD_Remarks;
			}


			public WebElement getCorporate_HR_PD_Browse() {
				return Corporate_HR_PD_Browse;
			}


			public WebElement getCorporate_HR_Coverage_Tab() {
				return Corporate_HR_Coverage_Tab;
			}


			public WebElement getCorporate_HR_Risk_title() {
				return Corporate_HR_Risk_title;
			}


			public WebElement getCorporate_HR_RiskDescription() {
				return Corporate_HR_RiskDescription;
			}


			public WebElement getCorporate_HR_Risk_suminsure() {
				return Corporate_HR_Risk_suminsure;
			}


			public WebElement getCorporate_HR_Risk_excess() {
				return Corporate_HR_Risk_excess;
			}


			public WebElement getCorporate_HR_Premium_title() {
				return Corporate_HR_Premium_title;
			}


			public WebElement getCorporate_HR_Premium_Description() {
				return Corporate_HR_Premium_Description;
			}


			public WebElement getCorporate_HR_Premium_rate() {
				return Corporate_HR_Premium_rate;
			}


			public WebElement getCorporate_HR_Premium_GST() {
				return Corporate_HR_Premium_GST;
			}


			public WebElement getCorporate_HR_Discount_Title() {
				return Corporate_HR_Discount_Title;
			}


			public WebElement getCorporate_HR_Disc_Amount() {
				return Corporate_HR_Disc_Amount;
			}


			public WebElement getCorporate_HR_Save_btn() {
				return Corporate_HR_Save_btn;
			}




			
			
			

	public Corporatesales() {
		PageFactory.initElements(driver, this);
	}

}




