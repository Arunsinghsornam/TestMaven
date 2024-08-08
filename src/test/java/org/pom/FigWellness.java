package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FigWellness extends BaseClass {
@FindBy(xpath="//span[normalize-space()='Sales']")
private WebElement Wsales;
@FindBy(xpath="//a[normalize-space()='Product Segments']")
private WebElement productManagement  ;

@FindBy(xpath="//div[@class='tile-stats pro_tile_26']")
private WebElement   Wellness;
@FindBy(xpath="//div[@class='tile-stats pro_tile_002G']")
private WebElement  Wgroup ;
@FindBy(xpath="//div[@id='page-wrapper']//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")
private WebElement  Well_viewPlans ;
@FindBy(xpath="//a[normalize-space()='Individual']")
private WebElement  Well_individual ;
@FindBy(xpath="//input[@id='custid']")
private WebElement Well_Custmerid  ;
@FindBy(xpath="//select[@id='salutationid']")
private WebElement  Well_salutation ;
@FindBy(xpath="//input[@id='fname']")
private WebElement  Well_fristName ;
@FindBy(xpath="//input[@id='lname']")
private WebElement  Well_LastName ;
@FindBy(xpath="//input[@id='city_name']")
private WebElement   Well_city;
@FindBy(xpath="//select[@id='state_id']")
private WebElement Well_state  ;
@FindBy(xpath="//select[@id='suminsuredid']")
private WebElement  Well_policy_trem ;
@FindBy(xpath="//input[@id='sumassuredid']")
private WebElement Well_sumassured;
@FindBy(xpath="//input[@id='loanaccountnumber']")
private WebElement Well_loanAccountNumber  ;
@FindBy(xpath="//input[@id='mobno']")
private WebElement  Well_mobno ;
@FindBy(xpath="//input[@id='email']")
private WebElement  Well_email ;
@FindBy(xpath="//textarea[@id='address']")
private WebElement Well_address  ;
@FindBy(xpath="//textarea[@id='second_address']")
private WebElement  Well_second_address ;
@FindBy(xpath="//input[@id='pin_code']")
private WebElement   Well_pincode;
@FindBy(xpath="//div[@data-tag-attr='mem']//input[@placeholder='Select Date']")
private WebElement  Well_Dob ;
@FindBy(xpath="//div[@class='iradio_square-green hover']")
private WebElement  Well_male ;
@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/label[1]/div[1]")
private WebElement  Well_Female ;
@FindBy(xpath="//span[normalize-space()='SELF']//span[@id='select2-relation-container']")
private WebElement Well_self  ;
@FindBy(xpath="//select[@id='nom_salutationid']")
private WebElement  Well_Nominee_salutation ;
@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Full Name']")
private WebElement  Well_Nominee_fullName ;
@FindBy(xpath="//input[@class='form-control name lastname alphabetAllow']")
private WebElement Well_Nominee_LastName  ;
@FindBy(xpath="//div[@data-tag-attr='nom']//input[@placeholder='Select Date']")
private WebElement  Well_Nominee_Dob ;
@FindBy(xpath="//div[@class='iradio_square-green hover']")
private WebElement  Well_Nominee_Male;
@FindBy(xpath="//div[@class='iradio_square-green hover']")
private WebElement  Well_Nominee_Female ;
@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//span[@id='select2-relation-container']")
private WebElement  Well_Nominee_relationship  ;
@FindBy(xpath="//div[contains(@class,'col-sm-4 border-right d-nominee')]//input[contains(@placeholder,'Mobile No')]")
private WebElement Well_Nominee_mobile  ;
@FindBy(xpath="//input[@placeholder='Address 1']")
private WebElement   Well_Nominee_Address;
@FindBy(xpath="//input[@placeholder='Address 2']")
private WebElement Well_Nominee_Address2  ;
@FindBy(xpath="//a[normalize-space()='Bulk Upload']")
private WebElement  Wellness_bulkupload ;
@FindBy(xpath="//input[@id='excelfile']")
private WebElement   Wellness_memberUpload_browser;
//=======================================wellness Variable=================
@FindBy(xpath="//div[@class='row wrapper wrapper-content animated fadeInRight']//div[2]//div[1]//div[1]//div[2]//div[2]//a[1]")
private WebElement  Well_variable_viewplans ;
@FindBy(xpath="//div[@id='theid_0']//div[@class='col-sm-4 border-right d-member']//div[1]//label[1]//div[1]")
private WebElement Well_variable_male  ;
@FindBy(xpath="//div[@class='iradio_square-green hover']")
private WebElement Well_variable_Female  ;
@FindBy(xpath="//span[@class='select2 select2-container select2-container--default select2-container--disabled']//span[@id='select2-relation-container']")
private WebElement Well_veriable_Relastionship  ;
@FindBy(xpath="//div[@id='theid_0']//select[@id='nom_salutationid']")
private WebElement  Well_veriable_salutation ;
@FindBy(xpath="//div[@id='theid_0']//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Full Name']")
private WebElement  Well_veriable_firstName ;
@FindBy(xpath="//div[@id='theid_0']//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Last Name']")
private WebElement  Well_veriable_lastName ;
@FindBy(xpath="//div[@id='theid_0']//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Select Date']")
private WebElement  Well_veriable_dob ;
@FindBy(xpath="//div[@id='theid_0']//div[@class='col-sm-4 border-right d-nominee']//div[1]//label[1]//div[1]")
private WebElement Well_veriable_Male  ;
@FindBy(css="div[class='iradio_square-green hover'] ins[class='iCheck-helper']")
private WebElement  Well_veriable_Female ;
@FindBy(xpath="//span[@class='select2 select2-container select2-container--default select2-container--below']//span[@id='select2-relation-container']")
private WebElement  Well_veriable_NomineeSelect ;
@FindBy(xpath="//div[@id='theid_0']//input[contains(@placeholder,'Mobile No')]")
private WebElement Well_veriable_Nominee_mobile ;
@FindBy(xpath="//div[@id='theid_0']//input[contains(@placeholder,'Address 1')]")
private WebElement  Well_veriable_Nominee_Address ;
@FindBy(xpath="//div[@id='theid_0']//input[contains(@placeholder,'Address 2')]")
private WebElement  Well_veriable_Nominee_Address2 ;
@FindBy(xpath="//div[@id='theid_1']//input[contains(@placeholder,'First Name')]")
private WebElement  Well_veriable_Adult_firstName ;
@FindBy(xpath="//div[@id='theid_1']//div[contains(@class,'col-sm-4 border-right d-member')]//input[contains(@placeholder,'Last Name')]")
private WebElement  Well_veriable_Adult_lastName ;
@FindBy(xpath="//div[@id='theid_1']//div[contains(@class,'col-sm-4 border-right d-member')]//input[contains(@placeholder,'Select Date')]")
private WebElement   Well_adult_dob;
@FindBy(xpath="//div[@id='theid_1']//div[@class='col-sm-4 border-right d-member']//div[1]//label[1]//div[1]//ins[1]")
private WebElement   Well_Adult_Male;
@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[2]/label[1]/div[1]/input[1]")
private WebElement Well_adult_Female  ;
@FindBy(xpath="//div[@class='col-sm-4 border-right d-member']//span[@class='select2 select2-container select2-container--default']//span[@id='select2-relation-container']")
private WebElement  Well_adult_relastionship  ;






public WebElement getWsales() {
	return Wsales;
}
public WebElement getProductManagement() {
	return productManagement;
}

public WebElement getWellness() {
	return Wellness;
}
public WebElement getWgroup() {
	return Wgroup;
}
public WebElement getWell_viewPlans() {
	return Well_viewPlans;
}
public WebElement getWell_individual() {
	return Well_individual;
}

public WebElement getWell_Custmerid() {
	return Well_Custmerid;
}

public WebElement getWell_salutation() {
	return Well_salutation;
}

public WebElement getWell_fristName() {
	return Well_fristName;
}
public WebElement getWell_LastName() {
	return Well_LastName;
}
public WebElement getWell_city() {
	return Well_city;
}
public WebElement getWell_state() {
	return Well_state;
}
public WebElement getWell_policy_trem() {
	return Well_policy_trem;
}
public WebElement getWell_sumassured() {
	return Well_sumassured;
}
public WebElement getWell_loanAccountNumber() {
	return Well_loanAccountNumber;
}
public WebElement getWell_mobno() {
	return Well_mobno;
}
public WebElement getWell_email() {
	return Well_email;
}
public WebElement getWell_address() {
	return Well_address;
}

public WebElement getWell_second_address() {
	return Well_second_address;
}
public WebElement getWell_pincode() {
	return Well_pincode;
}
public WebElement getWell_Dob() {
	return Well_Dob;
}
public WebElement getWell_male() {
	return Well_male;
}

public WebElement getWell_Female() {
	return Well_Female;
}

public WebElement getWell_self() {
	return Well_self;
}

public WebElement getWell_Nominee_salutation() {
	return Well_Nominee_salutation;
}

public WebElement getWell_Nominee_fullName() {
	return Well_Nominee_fullName;
}

public WebElement getWell_Nominee_LastName() {
	return Well_Nominee_LastName;
}

public WebElement getWell_Nominee_Dob() {
	return Well_Nominee_Dob;
}

public WebElement getWell_Nominee_Male() {
	return Well_Nominee_Male;
}

public WebElement getWell_Nominee_Female() {
	return Well_Nominee_Female;
}

public WebElement getWell_Nominee_relationship() {
	return Well_Nominee_relationship;
}

public WebElement getWell_Nominee_mobile() {
	return Well_Nominee_mobile;
}

public WebElement getWell_Nominee_Address() {
	return Well_Nominee_Address;
}
public WebElement getWell_Nominee_Address2() {
	return Well_Nominee_Address2;
}

public WebElement getWellness_bulkupload() {
	return Wellness_bulkupload;
}
public WebElement getWellness_memberUpload_browser() {
	return Wellness_memberUpload_browser;
}
public WebElement getWell_variable_viewplans() {
	return Well_variable_viewplans;
}
public WebElement getWell_variable_male() {
	return Well_variable_male;
}

public WebElement getWell_variable_Female() {
	return Well_variable_Female;
}
public WebElement getWell_veriable_Relastionship() {
	return Well_veriable_Relastionship;

}
public WebElement getWell_veriable_salutation() {
	return Well_veriable_salutation;
}
public WebElement getWell_veriable_firstName() {
	return Well_veriable_firstName;
}
public WebElement getWell_veriable_lastName() {
	return Well_veriable_lastName;
}
public WebElement getWell_veriable_dob() {
	return Well_veriable_dob;
}
public WebElement getWell_veriable_Male() {
	return Well_veriable_Male;
}
public WebElement getWell_veriable_Female() {
	return Well_veriable_Female;
}
public WebElement getWell_veriable_NomineeSelect() {
	return Well_veriable_NomineeSelect;
}
public WebElement getWell_veriable_Nominee_mobile() {
	return Well_veriable_Nominee_mobile;
}
public WebElement getWell_veriable_Nominee_Address() {
	return Well_veriable_Nominee_Address;
}
public WebElement getWell_veriable_Nominee_Address2() {
	return Well_veriable_Nominee_Address2;
}

 WebElement getWell_veriable_Adult_firstName() {
	return Well_veriable_Adult_firstName;
}

public WebElement getWell_veriable_Adult_lastName() {
	return Well_veriable_Adult_lastName;
}
public WebElement getWell_adult_dob() {
	return Well_adult_dob;
}

public WebElement getWell_Adult_Male() {
	return Well_Adult_Male;
}
public WebElement getWell_adult_Female() {
	return Well_adult_Female;
}
public WebElement getWell_adult_relastionship() {
	return Well_adult_relastionship;
}

@FindBy(xpath="//button[@id='btn-save']")
private WebElement saveBtn;
@FindBy(xpath="//input[@id='confirmmobile_otp']")
private WebElement otpBox;
@FindBy(xpath="//button[normalize-space()='Cancel']")
private WebElement cancelBtn;
@FindBy(xpath="//button[@id='confirm_policy']")
private WebElement confirm_policy;




public WebElement getSaveBtn() {
	return saveBtn;
}
public WebElement getOtpBox() {
	return otpBox;
}
public WebElement getCancelBtn() {
	return cancelBtn;
}
public WebElement getConfirm_policy() {
	return confirm_policy;
}
public FigWellness() {
	
	PageFactory.initElements(driver,this);

}
}
