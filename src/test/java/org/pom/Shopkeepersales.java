package org.pom;
import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopkeepersales extends BaseClass{
	@FindBy(xpath = "//input[@id='mui-1']")
	private WebElement SKFCarpetarea;
	
	@FindBy(xpath = "//input[@id='mui-2']")
	private WebElement SKFCostpersqft;
	
	@FindBy(xpath = "//input[@name='SumInsured']")
	private WebElement SKFSuminsured;
	
	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-154xyx0-MuiInputBase-root-MuiOutlinedInput-root']")
	private WebElement SKFState;
	
	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement SKFbackbutton;
	
	@FindBy(name = "customerID")
	private WebElement SKFcustomerid;
	
	@FindBy(xpath = "//input[@id='mui-4']")
	private WebElement SKFmobilenumber;
	
	@FindBy(xpath = "//input[@id='mui-5']")
	private WebElement SKFDateofbirth;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='page-wrapper']/div/div[@id='root']/div[@class='MuiBox-root css-1thazht']/div[@class='MuiContainer-root MuiContainer-maxWidthLg css-1oqqzyl-MuiContainer-root']/div[@class='justify-content-md-center row']/div[@class='col-md-12 col-sm-12']/div[@class='MuiBox-root css-0']/div[@class='css-t9tecc-MuiStack-root']/div/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiAccordion-root MuiAccordion-rounded Mui-expanded MuiAccordion-gutters css-1elwnq4-MuiPaper-root-MuiAccordion-root']/div[@class='MuiCollapse-root MuiCollapse-vertical MuiCollapse-entered css-pwcg7p-MuiCollapse-root']/div[@class='MuiCollapse-wrapper MuiCollapse-vertical css-smkl36-MuiCollapse-wrapper']/div[@class='MuiCollapse-wrapperInner MuiCollapse-vertical css-9l5vo-MuiCollapse-wrapperInner']/div[@id='panel1a-content']/div[@class='MuiAccordionDetails-root css-15v22id-MuiAccordionDetails-root']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-mhc70k-MuiGrid-root']/div[4]/div[1]/div[1]/input[1]")
	private WebElement SKFSalutation;
	
	@FindBy(xpath = "//input[@id='mui-6']")
	private WebElement SKFAadharnumber;
	
	@FindBy(xpath = "//input[@id='mui-7']")
	private WebElement SKFAddress1;
	
	@FindBy(xpath = "//input[@id='mui-8']")
	private WebElement SKFFirstname;
	
	@FindBy(xpath = "//input[@id='mui-9']")
	private WebElement SKFPannumber;
	
	@FindBy(xpath = "//input[@id='mui-10']")
	private WebElement SKFAddress2;
	
	@FindBy(xpath = "//input[@id='mui-11']")
	private WebElement SKFLastname;
	
	@FindBy(xpath = "//div[@id='mui-component-select-state']")
	private WebElement SKFPropertystate;
	
	@FindBy(xpath = "//input[@id='mui-96']")
	private WebElement SKFAnnualincome;
	
	@FindBy(xpath = "//span[contains(@class,'MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary Mui-checked MuiRadio-root MuiRadio-colorPrimary css-vqmohf-MuiButtonBase-root-MuiRadio-root')]//input[contains(@name,'gender')]")
	private WebElement SKFGendermale;
	
	@FindBy(xpath = "//span[contains(@class,'MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary Mui-checked MuiRadio-root MuiRadio-colorPrimary css-vqmohf-MuiButtonBase-root-MuiRadio-root')]//input[contains(@name,'gender')]")
	private WebElement SKFGenderfemale;
	
	@FindBy(xpath = "//input[@id='mui-97']")
	private WebElement SKFcity;
	
	@FindBy(xpath = "//input[@id='mui-98']")
	private WebElement SKFpincode;
	
	@FindBy(xpath = "//input[@id='mui-99']")
	private WebElement SKFEmail;
	
	@FindBy(xpath = "//input[@id='mui-100']")
	private WebElement SKFArea;
	
	@FindBy(xpath = "//input[@id='mui-101']")
	private WebElement SKFoccupation;
	
//------------------------------Propertydetails-----------------------------------------------------------------	
	
	@FindBy(xpath = "//input[@id='mui-102']")
	private WebElement SKFpropertyName;
	
	@FindBy(xpath = "//div[@id='mui-component-select-PropertyType']")
	private WebElement SKFpropertytype;
	
	@FindBy(xpath = "//input[@id='mui-103']")
	private WebElement SKFnatureofbusiness;
	
	@FindBy(xpath = "//input[@id='mui-104']")
	private WebElement SKFpropertylocatedarea;
	
	@FindBy(xpath = "//input[@id='mui-105']")
	private WebElement SKFpropertynooffloors;

	@FindBy(xpath = "//input[@id='mui-106']")
	private WebElement SKFpropertyfloornumber;

	@FindBy(xpath = "//input[@id='mui-107']")
	private WebElement SKFpropertyAddress;
	
	@FindBy(xpath = "//input[@id='mui-108']")
	private WebElement SKFpropertycity;
	
	@FindBy(xpath = "//div[@id='mui-component-select-State']")
	private WebElement SKFpropertystate;
	
	@FindBy(xpath = "//input[@id='mui-109']")
	private WebElement SKFpropertypincode;
	
	@FindBy(xpath = "//input[@id='mui-110']")
	private WebElement SKFpropertylandmark;
	
	@FindBy(xpath = "//input[@id='mui-111']")
	private WebElement SKFpropertyrisklocationcode;
	
	@FindBy(xpath = "//input[@id='mui-112']")
	private WebElement SKFpropertysqaurefeet;
	
	@FindBy(xpath = "//input[@id='mui-113']")
	private WebElement SKFpropertyage;
	
	@FindBy(css = "input[value='true'][name='Propertylocatedatbasement']")
	private WebElement SKFpropertylocatedbasementtrue;
	
	@FindBy(css = "input[value='false'][name='Propertylocatedatbasement']")
	private WebElement SKFpropertylocatedbasementfalse;
	
	@FindBy(css = "input[value='true'][name='RentforalternativeAccommodation']")
	private WebElement SKFpropertyrentforalternateaccomadtiontrue;
	
	@FindBy(css = "input[value='false'][name='RentforalternativeAccommodation']")
	private WebElement SKFpropertyrentforalternateaccomadtionfalse;
	
	@FindBy(xpath = "//input[@name='IsHypothecation']")
	private WebElement SKFpropertyishypocheckbox;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement SKFnomineesalutation;
	
	@FindBy(xpath = "//div[@id='mui-component-select-relationship']")
	private WebElement SKFnomineerelation;
	
	@FindBy(xpath = "//input[@id='mui-114']")
	private WebElement SKFnomineemobilenumber;
	
	@FindBy(xpath = "//input[@id='mui-115']")
	private WebElement SKFnomineefirstname;
	
	@FindBy(xpath = "//input[@id='mui-126']")
	private WebElement SKFnomineedateofbirth;
	
	@FindBy(xpath = "//input[@id='mui-117']")
	private WebElement SKFnomineeAdress1;
	
	@FindBy(xpath = "//input[@id='mui-118']")
	private WebElement SKFnomineelastname;
	
	@FindBy(xpath = "//input[@id='mui-119']")
	private WebElement SKFnomineeemail;
	
	@FindBy(xpath = "//input[@id='mui-120']")
	private WebElement SKFnomineeAdress2;
	
	
//--------------------------------------OTPconform--------------------

	@FindBy(xpath = "//input[@id='mui-133']")
	private WebElement SKFOTP;

	@FindBy(xpath = "//button[normalize-space()='Resend OTP']")
	private WebElement SKFResendOTPbutton;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement SKFOTPcancelbtn;
	
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement SKFOTPconformbtn;
	
	
//-------------------------------------------------------------------------
	
	public WebElement getSKFCarpetarea() {
		return SKFCarpetarea;
	}

	public WebElement getSKFCostpersqft() {
		return SKFCostpersqft;
	}

	public WebElement getSKFSuminsured() {
		return SKFSuminsured;
	}

	public WebElement getSKFState() {
		return SKFState;
	}

	public WebElement getSKFbackbutton() {
		return SKFbackbutton;
	}

	public WebElement getSKFcustomerid() {
		return SKFcustomerid;
	}

	public WebElement getSKFmobilenumber() {
		return SKFmobilenumber;
	}

	public WebElement getSKFDateofbirth() {
		return SKFDateofbirth;
	}

	public WebElement getSKFSalutation() {
		return SKFSalutation;
	}

	public WebElement getSKFAadharnumber() {
		return SKFAadharnumber;
	}

	public WebElement getSKFAddress1() {
		return SKFAddress1;
	}

	public WebElement getSKFFirstname() {
		return SKFFirstname;
	}

	public WebElement getSKFPannumber() {
		return SKFPannumber;
	}

	public WebElement getSKFAddress2() {
		return SKFAddress2;
	}

	public WebElement getSKFLastname() {
		return SKFLastname;
	}

	public WebElement getSKFPropertystate() {
		return SKFPropertystate;
	}

	public WebElement getSKFAnnualincome() {
		return SKFAnnualincome;
	}

	public WebElement getSKFGendermale() {
		return SKFGendermale;
	}

	public WebElement getSKFGenderfemale() {
		return SKFGenderfemale;
	}

	public WebElement getSKFcity() {
		return SKFcity;
	}

	public WebElement getSKFpincode() {
		return SKFpincode;
	}

	public WebElement getSKFEmail() {
		return SKFEmail;
	}

	public WebElement getSKFArea() {
		return SKFArea;
	}

	public WebElement getSKFoccupation() {
		return SKFoccupation;
	}

	public WebElement getSKFpropertyName() {
		return SKFpropertyName;
	}

	public WebElement getSKFpropertytype() {
		return SKFpropertytype;
	}

	public WebElement getSKFnatureofbusiness() {
		return SKFnatureofbusiness;
	}

	public WebElement getSKFpropertylocatedarea() {
		return SKFpropertylocatedarea;
	}

	public WebElement getSKFpropertynooffloors() {
		return SKFpropertynooffloors;
	}

	public WebElement getSKFpropertyfloornumber() {
		return SKFpropertyfloornumber;
	}

	public WebElement getSKFpropertyAddress() {
		return SKFpropertyAddress;
	}

	public WebElement getSKFpropertycity() {
		return SKFpropertycity;
	}

	public WebElement getSKFpropertystate() {
		return SKFpropertystate;
	}

	public WebElement getSKFpropertypincode() {
		return SKFpropertypincode;
	}

	public WebElement getSKFpropertylandmark() {
		return SKFpropertylandmark;
	}

	public WebElement getSKFpropertyrisklocationcode() {
		return SKFpropertyrisklocationcode;
	}

	public WebElement getSKFpropertysqaurefeet() {
		return SKFpropertysqaurefeet;
	}

	public WebElement getSKFpropertyage() {
		return SKFpropertyage;
	}

	public WebElement getSKFpropertylocatedbasementtrue() {
		return SKFpropertylocatedbasementtrue;
	}

	public WebElement getSKFpropertylocatedbasementfalse() {
		return SKFpropertylocatedbasementfalse;
	}

	public WebElement getSKFpropertyrentforalternateaccomadtiontrue() {
		return SKFpropertyrentforalternateaccomadtiontrue;
	}

	public WebElement getSKFpropertyrentforalternateaccomadtionfalse() {
		return SKFpropertyrentforalternateaccomadtionfalse;
	}

	public WebElement getSKFpropertyishypocheckbox() {
		return SKFpropertyishypocheckbox;
	}

	public WebElement getSKFnomineesalutation() {
		return SKFnomineesalutation;
	}

	public WebElement getSKFnomineerelation() {
		return SKFnomineerelation;
	}

	public WebElement getSKFnomineemobilenumber() {
		return SKFnomineemobilenumber;
	}

	public WebElement getSKFnomineefirstname() {
		return SKFnomineefirstname;
	}

	public WebElement getSKFnomineedateofbirth() {
		return SKFnomineedateofbirth;
	}

	public WebElement getSKFnomineeAdress1() {
		return SKFnomineeAdress1;
	}

	public WebElement getSKFnomineelastname() {
		return SKFnomineelastname;
	}

	public WebElement getSKFnomineeemail() {
		return SKFnomineeemail;
	}

	public WebElement getSKFnomineeAdress2() {
		return SKFnomineeAdress2;
	}

	public WebElement getSKFOTP() {
		return SKFOTP;
	}

	public WebElement getSKFResendOTPbutton() {
		return SKFResendOTPbutton;
	}

	public WebElement getSKFOTPcancelbtn() {
		return SKFOTPcancelbtn;
	}

	public WebElement getSKFOTPconformbtn() {
		return SKFOTPconformbtn;
	}
	
	//-----------------------------------------
	
	@FindBy(xpath = "//*[@id=\"free-solo-2-demo\"]")
	private WebElement state;
	
	@FindBy(xpath = "//div[@id='demo-simple-select']")
	private WebElement sum_insured;
	
	@FindBy(xpath = "//li[@role='option']")
	private WebElement option;

	@FindBy(xpath = "//*[@id=\"mui-component-select-SalutationId\"]")
	private WebElement salutation;
	
	@FindBy(xpath = "//input[@id='mui-6']")
	private WebElement aadhar_no;
	
	@FindBy(xpath = "//input[@id='mui-7']")
	private WebElement Address1;
	
	@FindBy(xpath = "//input[@id='mui-8']")
	private WebElement First_name;
	
	@FindBy(xpath = "//input[@id='mui-9']")
	private WebElement PANcard;
	
	@FindBy(xpath = "//input[@id='mui-10']")
	private WebElement Adderess2;
	
	@FindBy(xpath = "//input[@id='mui-11']")
	private WebElement Lastname;
	
	
	@FindBy(xpath = "//div[@id='mui-component-select-state']")
	private WebElement state_policy;
	
	
	@FindBy(xpath = "//li[normalize-space()='ANDHRA PRADESH']")
	private WebElement state_option;
	
	@FindBy(xpath = "//input[@id='mui-12']")
	private WebElement annualIncome;
	
	@FindBy(xpath = "//*[@id=\"panel1a-content\"]/div/div/div[13]/div/div/label[1]/span")
	private WebElement male_checkbox;
	
	@FindBy(xpath = "//input[@id='mui-13']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='mui-14']")
	private WebElement PIN;
	
	@FindBy(xpath = "//input[@id='mui-15']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='mui-16']")
	private WebElement Area;
	
	@FindBy(xpath = "//input[@id='mui-17']")
	private WebElement occupation;
	
	@FindBy(xpath = "//input[@id='mui-18']")
	private WebElement propertyName;
	
	@FindBy(xpath = "//div[@id='mui-component-select-PropertyType']")
	private WebElement propertyType;
	
	@FindBy(xpath = "//input[@id='mui-19']")
	private WebElement NatureofBusiness;
	
	@FindBy(xpath = "//input[@id='mui-20']")
	private WebElement propertyLocatedArea;
	
	@FindBy(xpath = "//input[@id='mui-21']")
	private WebElement Address_Property;
	
	@FindBy(xpath = "//input[@id='mui-22']")
	private WebElement city_Property;
	
	@FindBy(xpath = "//input[@id='mui-23']")
	private WebElement PIN_Property;
	
	@FindBy(xpath = "//input[@id='mui-24']")
	private WebElement landMark_Property;
	
	@FindBy(xpath = "//input[@id='mui-25']")
	private WebElement Sq_feet_Property;
	
	@FindBy(xpath = "//input[@id='mui-26']")
	private WebElement Age_Property;
	
	
	@FindBy(xpath = "//p[contains(text(),'Yes')][1]")
	private WebElement Accommidation_Property;
	
	
	@FindBy(xpath = "(//p[contains(text(),'Yes')])[2]")
	private WebElement Basement_Property;
	
	@FindBy(xpath = "//span[normalize-space()='Is Hypothecation']")
	private WebElement Hypothecation_Property;
	
	@FindBy(name = "FinancialInstitutionName")
	private WebElement Institutionname_Hypothecation;
	
	@FindBy(name = "FinancialInstitutionBranch")
	private WebElement Institutionbranch_Hypothecation;
	
	@FindBy(name = "FinancialInstitutionLocation")
	private WebElement Institutionlocation_Hypothecation;
	
	@FindBy(xpath = "(//div[@id='mui-component-select-SalutationId'])[2]")
	private WebElement SalutationId;
	

	@FindBy(xpath = "//*[@id=\"mui-component-select-relationship\"]")
	private WebElement Relationship;
	
	@FindBy(xpath = "//input[@id='mui-27']")
	private WebElement Mobile_no;
	
	@FindBy(xpath = "//input[@id='mui-28']")
	private WebElement first_name1;
	
	@FindBy(xpath = "//input[@id='mui-29']")
	private WebElement DOB2;
	
	
	@FindBy(xpath = "//input[@id='mui-30']")
	private WebElement Addresse3;
	
	@FindBy(xpath = "//input[@id='mui-31']")
	private WebElement lastname1;
	
	@FindBy(xpath = "//input[@id='mui-32']")
	private WebElement email2;
	
	@FindBy(xpath = "//input[@id='mui-33']")
	private WebElement address3;
	
	@FindBy(xpath = "//*[@id=\"panel1a-content\"]/div/div/div[10]/div/div/label[1]/span")
	private WebElement gender_nominee;
	
	
	
	
	public WebElement getGender_nominee() {
		return gender_nominee;
	}

	public WebElement getAddress3() {
		return address3;
	}

	public WebElement getEmail2() {
		return email2;
	}

	public WebElement getLastname1() {
		return lastname1;
	}

	public WebElement getAddresse3() {
		return Addresse3;
	}

	public WebElement getDOB2() {
		return DOB2;
	}

	public WebElement getFirst_name1() {
		return first_name1;
	}

	public WebElement getMobile_no() {
		return Mobile_no;
	}

	public WebElement getRelationship() {
		return Relationship;
	}

	public WebElement getSalutationId() {
		return SalutationId;
	}

	public WebElement getInstitutionlocation_Hypothecation() {
		return Institutionlocation_Hypothecation;
	}

	public WebElement getInstitutionbranch_Hypothecation() {
		return Institutionbranch_Hypothecation;
	}

	public WebElement getInstitutionname_Hypothecation() {
		return Institutionname_Hypothecation;
	}

	public WebElement getHypothecation_Property() {
		return Hypothecation_Property;
	}

	public WebElement getBasement_Property() {
		return Basement_Property;
	}

	public WebElement getAccommidation_Property() {
		return Accommidation_Property;
	}

	public WebElement getAge_Property() {
		return Age_Property;
	}

	public WebElement getSq_feet_Property() {
		return Sq_feet_Property;
	}

	public WebElement getLandMark_Property() {
		return landMark_Property;
	}

	public WebElement getPIN_Property() {
		return PIN_Property;
	}

	public WebElement getCity_Property() {
		return city_Property;
	}

	public WebElement getAddress_Property() {
		return Address_Property;
	}

	public WebElement getPropertyLocatedArea() {
		return propertyLocatedArea;
	}

	public WebElement getNatureofBusiness() {
		return NatureofBusiness;
	}

	public WebElement getPropertyType() {
		return propertyType;
	}

	public WebElement getPropertyName() {
		return propertyName;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getArea() {
		return Area;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPIN() {
		return PIN;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMale_checkbox() {
		return male_checkbox;
	}

	public WebElement getAnnualIncome() {
		return annualIncome;
	}

	public WebElement getState_option() {
		return state_option;
	}

	public WebElement getState_policy() {
		return state_policy;
	}

	public WebElement getAdderess2() {
		return Adderess2;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getPANcard() {
		return PANcard;
	}

	public WebElement getFirst_name() {
		return First_name;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getAadhar_no() {
		return aadhar_no;
	}

	public WebElement getSalutation() {
		return salutation;
	}

	public WebElement getOption() {
		return option;
	}

	public WebElement getSum_insured() {
		return sum_insured;
	}

	public WebElement getState() {
		return state;
	}
	
	@FindBy (xpath="//input[@name='ShopKeeperApplianceName']")
	private WebElement SKApplianceName;
	
	@FindBy (xpath="//input[@name='ManufacturerName']")
	private WebElement SKManufacturerName;
	
	@FindBy (xpath="//input[@name='Age']")
	private WebElement SKApplianceAge;
	
	@FindBy (xpath="//input[@name='ApplianceCost']")
	private WebElement SKAppliancevalue;
	
	@FindBy (xpath="//input[@name='ApplianceInvoiceNumber']")
	private WebElement SKApplianceInvoiceNumber;
	
	@FindBy (xpath="//button[normalize-space()='Next']")
	private WebElement SKNextbtn;
	
	
	
	
	public WebElement getSKApplianceName() {
		return SKApplianceName;
	}

	public WebElement getSKManufacturerName() {
		return SKManufacturerName;
	}

	public WebElement getSKApplianceAge() {
		return SKApplianceAge;
	}

	public WebElement getSKAppliancevalue() {
		return SKAppliancevalue;
	}

	public WebElement getSKApplianceInvoiceNumber() {
		return SKApplianceInvoiceNumber;
	}

	public WebElement getSKNextbtn() {
		return SKNextbtn;
	}

	public Shopkeepersales() {
		PageFactory.initElements(driver, this);
	}
}
