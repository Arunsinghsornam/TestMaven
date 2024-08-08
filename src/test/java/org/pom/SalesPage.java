package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage extends BaseClass{


	@FindBy(xpath="/html/body/div[3]/div[3]/div/button")
	private WebElement pwOk;
	
	public WebElement getPwOk() {
		return pwOk;
	}
		@FindBy (xpath="//select[@id='branchId']")
		private WebElement loginbranchSelect;



		public WebElement getLoginbranchSelect() {
			return loginbranchSelect;
		}


		@FindBy (xpath="//span[normalize-space()='Sales']")
		private WebElement Sales1;


		public WebElement getSales1() {
			return Sales1;
		}


		//..........After click the policies Upload.........(pu).....//

		@FindBy (xpath="//a[normalize-space()='Policies Upload']")
		private WebElement PoliciesUpload;

		@FindBy (xpath="//span[@class='slider round']")
		private WebElement pu_SwitchToComboSales;


		@FindBy (xpath="//span[@id='select2-orgid-container']")
		private WebElement pu_organizationspan;

		@FindBy (xpath="//select[@id='orgid']")
		private WebElement pu_organizationSelect;

		@FindBy (xpath="//span[@id='select2-productid-container']")
		private WebElement pu_productSpan;

		@FindBy (xpath="//select[@id='productid']")
		private WebElement pu_productSalect;

		@FindBy (xpath="//span[@id='select2-productplanid-container']")
		private WebElement pu_productplanSpan;

		@FindBy (xpath="//select[@id='productplanid']")
		private WebElement pu_productplanSelect;

		@FindBy (xpath="//button[@id='policies_btn']")
		private WebElement pu_okbtn;

		@FindBy (xpath="//input[@id='excelfile']")
		private WebElement pu_uploadExcelfile;

		public WebElement getPoliciesUpload() {
			return PoliciesUpload;
		}

		public WebElement getPu_organizationspan() {
			return pu_organizationspan;
		}


		public WebElement getPu_SwitchToComboSales() {
			return pu_SwitchToComboSales;
		}

		public WebElement getPu_organizationSelect() {
			return pu_organizationSelect;
		}

		public WebElement getPu_productSpan() {
			return pu_productSpan;
		}

		public WebElement getPu_productSalect() {
			return pu_productSalect;
		}

		public WebElement getPu_productplanSpan() {
			return pu_productplanSpan;
		}

		public WebElement getPu_productplanSelect() {
			return pu_productplanSelect;
		}


		public WebElement getPu_uploadExcelfile() {
			return pu_uploadExcelfile;
		}

		public WebElement getPu_okbtn() {
			return pu_okbtn;
		}

		//...................After click the Motor.............//

		@FindBy (xpath="//a[normalize-space()='Motor']")
		private WebElement Motor;

		public WebElement getMotor() {
			return Motor;
		}


		//..............After click the  product segments........(ps)......//

		@FindBy (xpath="//a[normalize-space()='Product Segments']")
		private WebElement productSegments;


		public WebElement getProductSegments() {
			return productSegments;
		}

		@FindBy (xpath="//h3[normalize-space()='Protection']")
		private WebElement ps_Protection;

		@FindBy (xpath="//h3[normalize-space()='Health']")
		private WebElement ps_Health;

		@FindBy (xpath="//h3[normalize-space()='Personal Accident']")
		private WebElement ps_PersonalAccident;

		@FindBy (xpath="//h3[normalize-space()='Children']")
		private WebElement ps_Children;

		@FindBy (xpath="//h3[normalize-space()='House Holder']")
		private WebElement ps_HouseHolder;

		@FindBy (xpath="//h3[normalize-space()='Shop Keeper']")
		private WebElement ps_Shopkeeper;

		@FindBy (xpath="//h3[normalize-space()='Liability']")
		private WebElement ps_Liability;

		@FindBy (xpath="//h3[normalize-space()='Motor']")
		private WebElement ps_Motor;

		@FindBy (xpath="//h3[normalize-space()='Pension']")
		private WebElement ps_Pension;

		@FindBy (xpath="//h3[normalize-space()='Savings']")
		private WebElement ps_Savings;

		@FindBy (xpath="//h3[normalize-space()='Investments']")
		private WebElement ps_Investments;

		@FindBy (xpath="//h3[normalize-space()='Travel']")
		private WebElement ps_Travel;

		@FindBy (xpath="//h3[normalize-space()='Engineering']")
		private WebElement ps_Engineering;

		@FindBy (xpath="//h3[normalize-space()='Combo Product']")
		private WebElement ps_ComboProduct;

		@FindBy (xpath="//h3[normalize-space()='Wellness']")
		private WebElement ps_Wellness;

		@FindBy (xpath="//h3[normalize-space()='Retail']")
		private WebElement ps_Retail;

		@FindBy (xpath="//h3[normalize-space()='Group']")
		private WebElement ps_Group;



		public WebElement getPs_Protection() {
			return ps_Protection;
		}

		public WebElement getPs_Health() {
			return ps_Health;
		}

		public WebElement getPs_PersonalAccident() {
			return ps_PersonalAccident;
		}

		public WebElement getPs_Children() {
			return ps_Children;
		}

		public WebElement getPs_HouseHolder() {
			return ps_HouseHolder;
		}

		public WebElement getPs_Shopkeeper() {
			return ps_Shopkeeper;
		}

		public WebElement getPs_Liability() {
			return ps_Liability;
		}

		public WebElement getPs_Motor() {
			return ps_Motor;
		}

		public WebElement getPs_Pension() {
			return ps_Pension;
		}

		public WebElement getPs_Savings() {
			return ps_Savings;
		}

		public WebElement getPs_Investments() {
			return ps_Investments;
		}

		public WebElement getPs_Travel() {
			return ps_Travel;
		}

		public WebElement getPs_Engineering() {
			return ps_Engineering;
		}

		public WebElement getPs_ComboProduct() {
			return ps_ComboProduct;
		}

		public WebElement getPs_Wellness() {
			return ps_Wellness;
		}


		public WebElement getPs_Retail() {
			return ps_Retail;
		}

		public WebElement getPs_Group() {
			return ps_Group;
		}

		//=================================Protection=====================================//

		@FindBy(xpath="//select[@id='branchId']")
		private WebElement selectBranchlogin;

		@FindBy(xpath="//input[@id='employeeId']")
		private WebElement Employeecodelogin;

		@FindBy(xpath="//input[@id='password']")
		private WebElement salesPassword;

		@FindBy(xpath="//button[text()='Login']")
		private WebElement saleslogInButton;


		@FindBy(xpath="//button[normalize-space()='Ok']")
		private WebElement sales_popup;

		public WebElement getSaleslogInButton() {
			return saleslogInButton;
		}



		public WebElement getSales_popup() {
			return sales_popup;
		}



		public WebElement getSelectBranchlogin() {
			return selectBranchlogin;
		}



		public WebElement getEmployeecodelogin() {
			return Employeecodelogin;
		}



		public WebElement getSalesPassword() {
			return salesPassword;
		}

		//---------------------------------
		@FindBy(xpath="//span[normalize-space()='Sales']")
		private WebElement Sales;

		@FindBy(xpath="//a[normalize-space()='Product Segments']")
		private WebElement ProductSegment;

		public WebElement getSales() {
			return Sales1;
		}

		public WebElement getProductSegment() {
			return ProductSegment;
		}


		//-------------------------------Protection-----------------------------------------------//


		@FindBy(xpath="//body//div[@id='wrapper']//div[@class='row']//div[@class='row']//div[1]//a[1]")
		private WebElement protection;


		@FindBy(xpath="//h3[normalize-space()='Group']")
		private WebElement protection_group;


		@FindBy(xpath="//div[@id='page-wrapper']//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")
		private WebElement protection_groupBajajGTL;


		@FindBy(xpath="//*[@id=\"div_premium\"]/div[1]/div[2]/div[2]/div[1]/a")
		private WebElement protection_groupBajajGTL_GTLIndividual;

		public WebElement getProtection_groupBajajGTL_GTLIndividual() {
			return protection_groupBajajGTL_GTLIndividual;
		}



		public WebElement getProtection_groupBajajGTL() {
			return protection_groupBajajGTL;
		}



		public WebElement getProtection_group() {
			return protection_group;
		}



		public WebElement getProtection() {
			return protection;
		}
		//-----------------------------


		@FindBy(xpath="//input[@id='custid']")
		private WebElement BajajGTL_GTL_customerId;

		@FindBy(xpath="//input[@id='mobno']")
		private WebElement BajajGTL_GTL_mobileNo;

		@FindBy(xpath="//input[@id='fname']")
		private WebElement BajajGTL_GTL_FirstName;

		@FindBy(xpath="//input[@id='email']")
		private WebElement BajajGTL_GTL_Email;

		@FindBy(xpath="//input[@id='lname']")
		private WebElement BajajGTL_GTL_LastName;

		@FindBy(xpath="//input[@id='loanamountid']")
		private WebElement BajajGTL_GTL_LoanAmount;

		@FindBy(xpath="//input[@id='loan_tenureid']")
		private WebElement BajajGTL_GTL_LoanTenureid;

		@FindBy(xpath="//input[@id='sumassuredid']")
		private WebElement BajajGTL_GTL_SumAssure;

		@FindBy(xpath="//select[@id='policy_term_id']")
		private WebElement BajajGTL_GTL_PolicyTerm;


		@FindBy(xpath="//textarea[@id='address']")
		private WebElement BajajGTL_GTL_Address1;

		@FindBy(xpath="//input[@id='loanaccountnumber']")
		private WebElement BajajGTL_GTL_LoanAccountNo;

		@FindBy(xpath="//textarea[@id='second_address']")
		private WebElement BajajGTL_GTL_Address2;



		@FindBy(xpath="//input[@id='annualincome']")
		private WebElement BajajGTL_GTL_AnnualIncome;

		@FindBy(xpath="//input[@id='pan_card']")
		private WebElement BajajGTL_GTL_PanCard;


		@FindBy(xpath="//select[@id='state_id']")
		private WebElement BajajGTL_GTL_state;


		@FindBy(xpath="//input[@id='city_name']")
		private WebElement BajajGTL_city;

		@FindBy(xpath="//input[@id='pin_code']")
		private WebElement BajajGTL_PINcode;

		public WebElement getBajajGTL_city() {
			return BajajGTL_city;
		}



		public WebElement getBajajGTL_PINcode() {
			return BajajGTL_PINcode;
		}



		public WebElement getBajajGTL_nom_salutionId() {
			return BajajGTL_nom_salutionId;
		}



		public WebElement getBajajGTL_nominee_FirstName() {
			return BajajGTL_nominee_FirstName;
		}



		public WebElement getBajajGTL_nominee_LastName() {
			return BajajGTL_nominee_LastName;
		}



		public WebElement getBajajGTL_nominee_Date() {
			return BajajGTL_nominee_Date;
		}



		public WebElement getBajajGTL_member_Date() {
			return BajajGTL_member_Date;
		}



		public WebElement getBajajGTL_nominee_Relation() {
			return BajajGTL_nominee_Relation;
		}



		public WebElement getBajajGTL_nominee_Mobile() {
			return BajajGTL_nominee_Mobile;
		}



		public WebElement getBajajGTL_nominee_Address1() {
			return BajajGTL_nominee_Address1;
		}



		public WebElement getBajajGTL_nominee_Address2() {
			return BajajGTL_nominee_Address2;
		}

		@FindBy(xpath="//select[@id='nom_salutationid']")
		private WebElement BajajGTL_nom_salutionId;


		@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='First Name']")
		private WebElement BajajGTL_nominee_FirstName;

		@FindBy(xpath="//input[@class='form-control name lastname alphabetAllow']")
		private WebElement BajajGTL_nominee_LastName;

		@FindBy(xpath="//div[@data-tag-attr='nom']//input[@placeholder='Select Date']")
		private WebElement BajajGTL_nominee_Date;

		@FindBy(xpath="//div[@data-tag-attr='mem']//input[@placeholder='Select Date']")
		private WebElement BajajGTL_member_Date;

		@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//select[@id='relation']")
		private WebElement BajajGTL_nominee_Relation;

		@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Mobile No']")
		private WebElement BajajGTL_nominee_Mobile;

		@FindBy(xpath="//input[contains(@placeholder,'Address 1')]")
		private WebElement BajajGTL_nominee_Address1;

		@FindBy(xpath="//input[@placeholder='Address 2']")
		private WebElement BajajGTL_nominee_Address2;

		@FindBy(xpath="//button[@id='btn-save']")
		private WebElement BajajGTL_Save;






		public WebElement getBajajGTL_Save() {
			return BajajGTL_Save;
		}



		public WebElement getBajajGTL_GTL_AnnualIncome() {
			return BajajGTL_GTL_AnnualIncome;
		}



		public WebElement getBajajGTL_GTL_PanCard() {
			return BajajGTL_GTL_PanCard;
		}



		public WebElement getBajajGTL_GTL_state() {
			return BajajGTL_GTL_state;
		}



		public WebElement getBajajGTL_GTL_Address1() {
			return BajajGTL_GTL_Address1;
		}



		public WebElement getBajajGTL_GTL_LoanAccountNo() {
			return BajajGTL_GTL_LoanAccountNo;
		}



		public WebElement getBajajGTL_GTL_Address2() {
			return BajajGTL_GTL_Address2;
		}


		public WebElement getBajajGTL_GTL_customerId() {
			return BajajGTL_GTL_customerId;
		}



		public WebElement getBajajGTL_GTL_mobileNo() {
			return BajajGTL_GTL_mobileNo;
		}



		public WebElement getBajajGTL_GTL_FirstName() {
			return BajajGTL_GTL_FirstName;
		}



		public WebElement getBajajGTL_GTL_Email() {
			return BajajGTL_GTL_Email;
		}



		public WebElement getBajajGTL_GTL_LastName() {
			return BajajGTL_GTL_LastName;
		}



		public WebElement getBajajGTL_GTL_LoanAmount() {
			return BajajGTL_GTL_LoanAmount;
		}



		public WebElement getBajajGTL_GTL_LoanTenureid() {
			return BajajGTL_GTL_LoanTenureid;
		}



		public WebElement getBajajGTL_GTL_SumAssure() {
			return BajajGTL_GTL_SumAssure;
		}



		public WebElement getBajajGTL_GTL_PolicyTerm() {
			return BajajGTL_GTL_PolicyTerm;
		}

		//==================================Bajaj GLPP(Insured Details)=======================================//
		@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]")
		private WebElement BajajGLPP_ViewPlans;

		@FindBy(xpath="//div[@id='div_premium']//div[1]//div[2]//div[2]//div[1]//a[1]")
		private WebElement BajajGLPP_SandB_individual;

		@FindBy(xpath="//input[@id='custid']")
		private WebElement BajajGLPP_SandB_ID_customerid;

		@FindBy(xpath="//input[@id='act_no']")
		private WebElement BajajGLPP_SandB_ID_Accountno;

		@FindBy(xpath="//input[@id='loanamountid']")
		private WebElement BajajGLPP_SandB_ID_LoanAmount;

		@FindBy(xpath="//input[@id='loan_tenureid']")
		private WebElement BajajGLPP_SandB_ID_loan_tenureid;

		@FindBy(xpath="//input[@id='sumassuredid']")
		private WebElement BajajGLPP_SandB_ID_sumassured;

		@FindBy(xpath="//select[@id='policy_term_id']")
		private WebElement BajajGLPP_SandB_ID_policyterm;

		@FindBy(xpath="//input[@id='annualincome']")
		private WebElement BajajGLPP_SandB_ID_AnnualIncome;


		public WebElement getBajajGLPP_ViewPlans() {
			return BajajGLPP_ViewPlans;
		}



		public WebElement getBajajGLPP_SandB_individual() {
			return BajajGLPP_SandB_individual;
		}



		public WebElement getBajajGLPP_SandB_ID_customerid() {
			return BajajGLPP_SandB_ID_customerid;
		}



		public WebElement getBajajGLPP_SandB_ID_Accountno() {
			return BajajGLPP_SandB_ID_Accountno;
		}



		public WebElement getBajajGLPP_SandB_ID_LoanAmount() {
			return BajajGLPP_SandB_ID_LoanAmount;
		}



		public WebElement getBajajGLPP_SandB_ID_loan_tenureid() {
			return BajajGLPP_SandB_ID_loan_tenureid;
		}



		public WebElement getBajajGLPP_SandB_ID_sumassured() {
			return BajajGLPP_SandB_ID_sumassured;
		}



		public WebElement getBajajGLPP_SandB_ID_policyterm() {
			return BajajGLPP_SandB_ID_policyterm;
		}



		public WebElement getBajajGLPP_SandB_ID_AnnualIncome() {
			return BajajGLPP_SandB_ID_AnnualIncome;
		}


		//=============================Bajaj GLPP(Member Details)============================================//

		@FindBy(xpath="//a[normalize-space()='Member Details']")
		private WebElement BajajGLPP_SandB_MD_MemberDetails;

		@FindBy(xpath="//select[@id='salutationid']")
		private WebElement BajajGLPP_SandB_MD_salutation;

		@FindBy(xpath="//input[@id='member_first_name']")
		private WebElement BajajGLPP_SandB_MD_FirstName;

		@FindBy(xpath="//input[@id='member_middle_name']")
		private WebElement BajajGLPP_SandB_MD_middleName;

		@FindBy(xpath="//input[@id='member_last_name']")
		private WebElement BajajGLPP_SandB_MD_LastName;

		@FindBy(xpath="//select[@id='member_gender']")
		private WebElement BajajGLPP_SandB_MD_member;

		@FindBy(xpath="//input[@id='member_occ']")
		private WebElement BajajGLPP_SandB_MD_occupation;

		@FindBy(xpath="//input[@id='member_nat']")
		private WebElement BajajGLPP_SandB_MD_natureofduties;

		@FindBy(xpath="//input[@id='pan_card']")
		private WebElement BajajGLPP_SandB_MD_PANno;

		@FindBy(xpath="//input[@id='member_height_feet']")
		private WebElement BajajGLPP_SandB_MD_Height_feet;

		@FindBy(xpath="//input[@id='member_height_inch']")
		private WebElement BajajGLPP_SandB_MD_Height_inch;

		@FindBy(xpath="//input[@id='member_weight']")
		private WebElement BajajGLPP_SandB_MD_weight;

		@FindBy(xpath="//input[@id='member_dob']")
		private WebElement BajajGLPP_SandB_MD_DateofBirth;

		@FindBy(xpath="//input[@id='mem_add1']")
		private WebElement BajajGLPP_SandB_MD_Address1;

		@FindBy(xpath="//input[@id='mem_add2']")
		private WebElement BajajGLPP_SandB_MD_Address2;

		@FindBy(xpath="//input[@id='mem_city']")
		private WebElement BajajGLPP_SandB_MD_city;	

		@FindBy(xpath="//select[@id='memeber_state_id']")
		private WebElement BajajGLPP_SandB_MD_state;

		@FindBy(xpath="//input[@id='mem_pincode']")
		private WebElement BajajGLPP_SandB_MD_PIN;

		@FindBy(xpath="//input[@id='mem_mobile']")
		private WebElement BajajGLPP_SandB_MD_Mobileno;

		@FindBy(xpath="//input[@id='member_email']")
		private WebElement BajajGLPP_SandB_MD_email;

		@FindBy(xpath="//select[@id='nomsalutationid']")
		private WebElement BajajGLPP_SandB_MD_nominee_salutation;

		@FindBy(xpath="//input[@id='nominee_name']")
		private WebElement BajajGLPP_SandB_MD_nomineeName;

		@FindBy(xpath="//input[@id='nominee_dob']")
		private WebElement BajajGLPP_SandB_MD_nomineeDateofBirth;

		@FindBy(xpath="//select[@id='nom_rel']")
		private WebElement BajajGLPP_SandB_MD_nomineeRelation;

		@FindBy(xpath="//select[@id='nom_rel']")
		private WebElement BajajGLPP_SandB_MD_nomineeGender;

		@FindBy(xpath="//input[@placeholder='Mobile No']")
		private WebElement BajajGLPP_SandB_MD_nomineeMobileNo;

		@FindBy(xpath="//input[@placeholder='Address 1']")
		private WebElement BajajGLPP_SandB_MD_nomineeAddress1;

		@FindBy(xpath="//input[@placeholder='Address 2']")
		private WebElement BajajGLPP_SandB_MD_nomineeAddress2;





		public WebElement getBajajGLPP_SandB_MD_MemberDetails() {
			return BajajGLPP_SandB_MD_MemberDetails;
		}



		public WebElement getBajajGLPP_SandB_MD_salutation() {
			return BajajGLPP_SandB_MD_salutation;
		}



		public WebElement getBajajGLPP_SandB_MD_FirstName() {
			return BajajGLPP_SandB_MD_FirstName;
		}



		public WebElement getBajajGLPP_SandB_MD_middleName() {
			return BajajGLPP_SandB_MD_middleName;
		}



		public WebElement getBajajGLPP_SandB_MD_LastName() {
			return BajajGLPP_SandB_MD_LastName;
		}



		public WebElement getBajajGLPP_SandB_MD_member() {
			return BajajGLPP_SandB_MD_member;
		}



		public WebElement getBajajGLPP_SandB_MD_occupation() {
			return BajajGLPP_SandB_MD_occupation;
		}



		public WebElement getBajajGLPP_SandB_MD_natureofduties() {
			return BajajGLPP_SandB_MD_natureofduties;
		}



		public WebElement getBajajGLPP_SandB_MD_PANno() {
			return BajajGLPP_SandB_MD_PANno;
		}



		public WebElement getBajajGLPP_SandB_MD_Height_feet() {
			return BajajGLPP_SandB_MD_Height_feet;
		}



		public WebElement getBajajGLPP_SandB_MD_Height_inch() {
			return BajajGLPP_SandB_MD_Height_inch;
		}



		public WebElement getBajajGLPP_SandB_MD_weight() {
			return BajajGLPP_SandB_MD_weight;
		}



		public WebElement getBajajGLPP_SandB_MD_DateofBirth() {
			return BajajGLPP_SandB_MD_DateofBirth;
		}



		public WebElement getBajajGLPP_SandB_MD_Address1() {
			return BajajGLPP_SandB_MD_Address1;
		}



		public WebElement getBajajGLPP_SandB_MD_Address2() {
			return BajajGLPP_SandB_MD_Address2;
		}



		public WebElement getBajajGLPP_SandB_MD_city() {
			return BajajGLPP_SandB_MD_city;
		}



		public WebElement getBajajGLPP_SandB_MD_state() {
			return BajajGLPP_SandB_MD_state;
		}



		public WebElement getBajajGLPP_SandB_MD_PIN() {
			return BajajGLPP_SandB_MD_PIN;
		}



		public WebElement getBajajGLPP_SandB_MD_Mobileno() {
			return BajajGLPP_SandB_MD_Mobileno;
		}



		public WebElement getBajajGLPP_SandB_MD_email() {
			return BajajGLPP_SandB_MD_email;
		}



		public WebElement getBajajGLPP_SandB_MD_nominee_salutation() {
			return BajajGLPP_SandB_MD_nominee_salutation;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeName() {
			return BajajGLPP_SandB_MD_nomineeName;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeDateofBirth() {
			return BajajGLPP_SandB_MD_nomineeDateofBirth;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeRelation() {
			return BajajGLPP_SandB_MD_nomineeRelation;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeGender() {
			return BajajGLPP_SandB_MD_nomineeGender;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeMobileNo() {
			return BajajGLPP_SandB_MD_nomineeMobileNo;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeAddress1() {
			return BajajGLPP_SandB_MD_nomineeAddress1;
		}



		public WebElement getBajajGLPP_SandB_MD_nomineeAddress2() {
			return BajajGLPP_SandB_MD_nomineeAddress2;
		}

		//=============================Bajaj GLPP(DGH)============================================//


		@FindBy(xpath="//a[@id='dgh_tab']")
		private WebElement BajajGLPP_SandB_DGH;

		@FindBy(xpath="//*[@id=\"life1y_2546\"]/div/label/div")
		private WebElement BajajGLPP_SandB_DGH_AA_yes;

		@FindBy(xpath="//td[@id='life1n_1083']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_DGH_AA_no;

		@FindBy(xpath="//td[@id='life1y_1084']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_DGH_Goodhealth_yes;

		@FindBy(xpath="//td[@id='life1n_1084']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_DGH_Goodhealth_no;

		@FindBy(xpath="//td[@id='life1y_1085']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_DGH_as_yes;

		@FindBy(xpath="//td[@id='life1n_1085']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_DGH_as_no;



		public WebElement getBajajGLPP_SandB_DGH() {
			return BajajGLPP_SandB_DGH;
		}



		public WebElement getBajajGLPP_SandB_DGH_AA_yes() {
			return BajajGLPP_SandB_DGH_AA_yes;
		}



		public WebElement getBajajGLPP_SandB_DGH_AA_no() {
			return BajajGLPP_SandB_DGH_AA_no;
		}



		public WebElement getBajajGLPP_SandB_DGH_Goodhealth_yes() {
			return BajajGLPP_SandB_DGH_Goodhealth_yes;
		}



		public WebElement getBajajGLPP_SandB_DGH_Goodhealth_no() {
			return BajajGLPP_SandB_DGH_Goodhealth_no;
		}



		public WebElement getBajajGLPP_SandB_DGH_as_yes() {
			return BajajGLPP_SandB_DGH_as_yes;
		}



		public WebElement getBajajGLPP_SandB_DGH_as_no() {
			return BajajGLPP_SandB_DGH_as_no;
		}

		//========================Bajaj GLPP(covid declaration)========================//


		@FindBy(xpath="//td[@id='cov_life1y_1086']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_CD_as_yes;

		@FindBy(xpath="//td[@id='cov_life1n_1086']//ins[@class='iCheck-helper']")
		private WebElement BajajGLPP_SandB_CD_as_no;


		public WebElement getBajajGLPP_SandB_CD_as_yes() {
			return BajajGLPP_SandB_CD_as_yes;
		}



		public WebElement getBajajGLPP_SandB_CD_as_no() {
			return BajajGLPP_SandB_CD_as_no;
		}
		//...............................protection close...........................//

		//.........................................................................................................//	


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

		//................personal accident group close................................//

		//....................................................................................................//		




		//........................after click Motor....Retail........(mr).................//

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

		@FindBy(xpath = "//label[normalize-space()='Do you have any Previous Policy?']")
		private WebElement Retailpreviouspolicycheckbox;

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



		public WebElement getRetailpreviouspolicycheckbox() {
			return Retailpreviouspolicycheckbox;
		}


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


		//		-----------------------------Health-------------------------



		@FindBy(xpath = "//body/div[@id='wrapper']/nav[@role='navigation']/div[@class='sidebar-collapse']/ul[@id='side-menu']/li[3]/a[1]")
		private WebElement Salesmenuitem;

		@FindBy(xpath = "//a[normalize-space()='Product Segments']")
		private WebElement ProductSegmentsmenuitem;

		@FindBy(xpath = "//div[@class='tile-stats pro_tile_2']")
		private WebElement ProductSegmentHealth;

		@FindBy(xpath = "//div[@class='tile-stats pro_tile_002G']")
		private WebElement ProductSegmentGroup;

		@FindBy(xpath = "//a[@class='btn btn-primary']")
		private WebElement Productviewplans;

		@FindBy(xpath = "//a[normalize-space()='Individual']")
		private WebElement Planindividual;

		@FindBy(xpath = "//input[@id='custid']")
		private WebElement Proposercustomerid;

		@FindBy(xpath = "//input[@id='mobno']")
		private WebElement Proposermobile;

		@FindBy(xpath = "//input[@id='fname']")
		private WebElement Proposerfirstname;

		@FindBy(xpath = "//input[@id='email']")
		private WebElement Proposeremail;

		@FindBy(xpath = "//input[@id='lname']")
		private WebElement Proposerlastname;

		@FindBy(xpath = "//textarea[@id='address']")
		private WebElement ProposerAddress;

		@FindBy(xpath = "//input[@id='city_name']")
		private WebElement Proposercity;

		@FindBy(xpath = "//textarea[@id='second_address']")
		private WebElement ProposerAddress2;

		@FindBy(xpath = "//select[@id='state_id']")
		private WebElement Proposerstate;

		@FindBy(xpath = "//select[@id='suminsuredid']")
		private WebElement Proposersuminsured;

		@FindBy(xpath = "//input[@id='pin_code']")
		private WebElement Proposerpincode;

		@FindBy(xpath = "//input[@id='loanaccountnumber']")
		private WebElement ProposerLan;

		@FindBy(xpath = "//select[@id='nom_salutationid']")
		private WebElement Nomineesalutation;

		@FindBy(xpath = "//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Full Name']")
		private WebElement Nomineefirstname;

		@FindBy(xpath = "//input[@class='form-control name lastname alphabetAllow']")
		private WebElement Nomineelastname;

		@FindBy(xpath = "//span[contains(@class,'select2 select2-container select2-container--default select2-container--above')]//span[@id='select2-relation-container']")
		private WebElement Nomineerelationship;

		@FindBy(xpath = "//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='Mobile No']")
		private WebElement Nomineemobienumber;

		@FindBy(xpath = "//input[@placeholder='Address 1']")
		private WebElement NomineeAdress1;

		@FindBy(xpath = "//div[@id='theid_1']//input[@placeholder='First Name']")
		private WebElement Adult2firstname;

		@FindBy(xpath = "//div[@id='theid_1']//div[@class='col-sm-4 border-right d-member']//input[@placeholder='Last Name']")
		private WebElement Adult2lastname;

		@FindBy(xpath = "//span[@class='select2 select2-container select2-container--default select2-container--below']//span[@id='select2-relation-container']]")
		private WebElement Adult2relationship;

		@FindBy(xpath = "//div[@id='theid_2']//input[@placeholder='First Name']")
		private WebElement Child1firstname;

		@FindBy(xpath = "//div[@id='theid_2']//div[@class='col-sm-4 border-right d-member']//input[@placeholder='Last Name']")
		private WebElement Child1lastname;

		@FindBy(xpath = "//div[@id='theid_2']//div[@class='col-sm-4 border-right d-member']//span[@id='select2-relation-container']")
		private WebElement Child1relationship;

		@FindBy(xpath = "//div[@id='theid_3']//input[@placeholder='First Name']")
		private WebElement Child2firstname;

		@FindBy(xpath = "//div[@id='theid_3']//div[@class='col-sm-4 border-right d-member']//input[@placeholder='Last Name']")
		private WebElement Child2lastname;

		@FindBy(xpath = "//div[@id='theid_3']//div[@class='col-sm-4 border-right d-member']//span[@id='select2-relation-container']")
		private WebElement Child2relationship;

		@FindBy(xpath = "//button[@id='btn-save']")
		private WebElement policysavebtn;

		@FindBy(xpath = "//input[@id='confirmmobile_otp']")
		private WebElement policyconformotp;

		@FindBy(xpath = "//button[@id='confirm_policy']")
		private WebElement policyconformbutton;

		@FindBy(xpath = "//button[normalize-space()='Cancel']")
		private WebElement policycancelbutton;

		public WebElement getSalesmenuitem() {
			return Salesmenuitem;
		}

		public WebElement getProductSegmentsmenuitem() {
			return ProductSegmentsmenuitem;
		}

		public WebElement getProductSegmentHealth() {
			return ProductSegmentHealth;
		}

		public WebElement getProductSegmentGroup() {
			return ProductSegmentGroup;
		}

		public WebElement getProductviewplans() {
			return Productviewplans;
		}

		public WebElement getPlanindividual() {
			return Planindividual;
		}

		public WebElement getProposercustomerid() {
			return Proposercustomerid;
		}

		public WebElement getProposermobile() {
			return Proposermobile;
		}

		public WebElement getProposerfirstname() {
			return Proposerfirstname;
		}

		public WebElement getProposeremail() {
			return Proposeremail;
		}

		public WebElement getProposerlastname() {
			return Proposerlastname;
		}

		public WebElement getProposerAddress() {
			return ProposerAddress;
		}

		public WebElement getProposercity() {
			return Proposercity;
		}

		public WebElement getProposerAddress2() {
			return ProposerAddress2;
		}

		public WebElement getProposerstate() {
			return Proposerstate;
		}

		public WebElement getProposersuminsured() {
			return Proposersuminsured;
		}

		public WebElement getProposerpincode() {
			return Proposerpincode;
		}

		public WebElement getProposerLan() {
			return ProposerLan;
		}

		public WebElement getNomineesalutation() {
			return Nomineesalutation;
		}

		public WebElement getNomineefirstname() {
			return Nomineefirstname;
		}

		public WebElement getNomineelastname() {
			return Nomineelastname;
		}

		public WebElement getNomineerelationship() {
			return Nomineerelationship;
		}

		public WebElement getNomineemobienumber() {
			return Nomineemobienumber;
		}

		public WebElement getNomineeAdress1() {
			return NomineeAdress1;
		}

		public WebElement getAdult2firstname() {
			return Adult2firstname;
		}

		public WebElement getAdult2lastname() {
			return Adult2lastname;
		}

		public WebElement getAdult2relationship() {
			return Adult2relationship;
		}

		public WebElement getChild1firstname() {
			return Child1firstname;
		}

		public WebElement getChild1lastname() {
			return Child1lastname;
		}

		public WebElement getChild1relationship() {
			return Child1relationship;
		}

		public WebElement getChild2firstname() {
			return Child2firstname;
		}

		public WebElement getChild2lastname() {
			return Child2lastname;
		}

		public WebElement getChild2relationship() {
			return Child2relationship;
		}

		public WebElement getPolicysavebtn() {
			return policysavebtn;
		}

		public WebElement getPolicyconformotp() {
			return policyconformotp;
		}

		public WebElement getPolicyconformbutton() {
			return policyconformbutton;
		}

		public WebElement getPolicycancelbutton() {
			return policycancelbutton;
		}

		//	--------------------Shopkeeper--------------------		


		//-----Fixed----

		@FindBy(xpath = "//input[@id='mui-1']")
		private WebElement SKFCarpetarea;

		@FindBy(xpath = "//input[@id='mui-2']")
		private WebElement SKFCostpersqft;

		@FindBy(xpath = "//div[@id='demo-simple-select']")
		private WebElement SKFSuminsured;

		@FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-154xyx0-MuiInputBase-root-MuiOutlinedInput-root']")
		private WebElement SKFState;

		@FindBy(xpath = "//button[normalize-space()='Edit']")
		private WebElement SKCoveragedetailsEdit;


		//----Variable-----

		@FindBy(xpath = "//input[@id='mui-3']")
		private WebElement SKVSuminsured;

		@FindBy(xpath = "//div[@id='demo-simple-select']")
		private WebElement SKVTenure;


		//--------------------------proposerdetails------------------------------

		//---Fixed----

		@FindBy(xpath = "//input[@id='mui-3']")
		private WebElement SKFcustomerid;

		@FindBy(xpath = "//input[@id='mui-4']")
		private WebElement SKFmobilenumber;

		@FindBy(xpath = "//input[@id='mui-5']")
		private WebElement SKFDateofbirth;

		@FindBy(xpath = "//div[4]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[4]//div[1]//div[1]//div[1]")
		private WebElement SKFVSalutation;

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
		private WebElement SKFVproposerstate;

		@FindBy(xpath = "//input[@id='mui-12']")
		private WebElement SKFAnnualincome;

		@FindBy(xpath = "//span[contains(@class,'MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary Mui-checked MuiRadio-root MuiRadio-colorPrimary css-vqmohf-MuiButtonBase-root-MuiRadio-root')]//input[contains(@name,'gender')]")
		private WebElement SKFGendermale;

		@FindBy(xpath = "//span[contains(@class,'MuiButtonBase-root MuiRadio-root MuiRadio-colorPrimary PrivateSwitchBase-root MuiRadio-root MuiRadio-colorPrimary Mui-checked MuiRadio-root MuiRadio-colorPrimary css-vqmohf-MuiButtonBase-root-MuiRadio-root')]//input[contains(@name,'gender')]")
		private WebElement SKFGenderfemale;

		@FindBy(xpath = "//input[@id='mui-13']")
		private WebElement SKFcity;

		@FindBy(xpath = "//input[@id='mui-14']")
		private WebElement SKFpincode;

		@FindBy(xpath = "//input[@id='mui-15']")
		private WebElement SKFEmail;

		@FindBy(xpath = "//input[@id='mui-16']")
		private WebElement SKFArea;

		@FindBy(xpath = "//input[@id='mui-17']")
		private WebElement SKFoccupation;


		//---Variable----

		@FindBy(xpath = "//input[@id='mui-4']")
		private WebElement SKVcustomerid;

		@FindBy(xpath = "//input[@id='mui-5']")
		private WebElement SKVmobilenumber;

		@FindBy(xpath = "//input[@id='mui-6']")
		private WebElement SKVDateofbirth;

		@FindBy(xpath = "//input[@id='mui-7']")
		private WebElement SKVAadharnumber;

		@FindBy(xpath = "//input[@id='mui-8']")
		private WebElement SKVAdress1;

		@FindBy(xpath = "//input[@id='mui-9']")
		private WebElement SKVFirstname;

		@FindBy(xpath = "//input[@id='mui-10']")
		private WebElement SKVpannumber;

		@FindBy(xpath = "//input[@id='mui-11']")
		private WebElement SKVAdress2;

		@FindBy(xpath = "//input[@id='mui-12']")
		private WebElement SKVLastname;

		@FindBy(xpath = "//input[@id='mui-13']")
		private WebElement SKVAnnualincome;

		@FindBy(xpath = "//input[@id='mui-14']")
		private WebElement SKVCity;

		@FindBy(xpath = "//input[@id='mui-15']")
		private WebElement SKVPincode;

		@FindBy(xpath = "//input[@id='mui-16']")
		private WebElement SKVEmail;

		@FindBy(xpath = "//input[@id='mui-17']")
		private WebElement SKVArea;

		@FindBy(xpath = "//input[@id='mui-18']")
		private WebElement SKVOccupation;


		//------------------------------Propertydetails-----------------------------------------------------------------	
		//Fixed----	

		@FindBy(xpath = "//input[@id='mui-18']")
		private WebElement SKFpropertyName;

		@FindBy(xpath = "//div[@id='mui-component-select-PropertyType']")
		private WebElement SKFpropertytype;

		@FindBy(xpath = "//input[@id='mui-19']")
		private WebElement SKFnatureofbusiness;

		@FindBy(xpath = "//input[@id='mui-20']")
		private WebElement SKFpropertylocatedarea;

		@FindBy(xpath = "//input[@id='mui-21']")
		private WebElement SKFpropertynooffloors;

		@FindBy(xpath = "//input[@id='mui-22']")
		private WebElement SKFpropertyfloornumber;

		@FindBy(xpath = "//input[@id='mui-23']")
		private WebElement SKFpropertyAddress;

		@FindBy(xpath = "//input[@id='mui-24']")
		private WebElement SKFpropertycity;

		@FindBy(xpath = "//div[@id='mui-component-select-State']")
		private WebElement SKFpropertystate;

		@FindBy(xpath = "//input[@id='mui-25']")
		private WebElement SKFpropertypincode;

		@FindBy(xpath = "//input[@id='mui-26']")
		private WebElement SKFpropertylandmark;

		@FindBy(xpath = "//input[@id='mui-27']")
		private WebElement SKFpropertyrisklocationcode;

		@FindBy(xpath = "//input[@id='mui-28']")
		private WebElement SKFpropertysqaurefeet;

		@FindBy(xpath = "//input[@id='mui-29']")
		private WebElement SKFpropertyage;

		@FindBy(css = "input[value='true'][name='Propertylocatedatbasement']")
		private WebElement SKFpropertylocatedbasementtrue;

		@FindBy(css = "input[value='false'][name='Propertylocatedatbasement']")
		private WebElement SKFpropertylocatedbasementfalse;

		@FindBy(css = "input[value='true'][name='RentforalternativeAccommodation']")
		private WebElement SKFpropertyrentforalternateaccomadtiontrue;

		@FindBy(css = "input[value='false'][name='RentforalternativeAccommodation']")
		private WebElement SKFpropertyrentforalternateaccomadtionfalse;



		//-----------Variable Property details 

		@FindBy(xpath = "//input[@id='mui-19']")
		private WebElement SKVpropertyName;

		@FindBy(xpath = "//div[@id='mui-component-select-PropertyType']")
		private WebElement SKVpropertytype;

		@FindBy(xpath = "//input[@id='mui-20']")
		private WebElement SKVnatureofbusiness;

		@FindBy(xpath = "//input[@id='mui-21']")
		private WebElement SKvpropertylocatedarea;

		@FindBy(xpath = "//input[@id='mui-22']")
		private WebElement SKVpropertynooffloors;

		@FindBy(xpath = "//input[@id='mui-23']")
		private WebElement SKVpropertyfloornumber;

		@FindBy(xpath = "//input[@id='mui-24']")
		private WebElement SKVpropertyAddress;

		@FindBy(xpath = "//input[@id='mui-25']")
		private WebElement SKVpropertycity;

		@FindBy(xpath = "//div[@id='mui-component-select-State']")
		private WebElement SKVpropertystate;

		@FindBy(xpath = "//input[@id='mui-26']")
		private WebElement SKVpropertypincode;

		@FindBy(xpath = "//input[@id='mui-27']")
		private WebElement SKVpropertylandmark;

		@FindBy(xpath = "//input[@id='mui-28']")
		private WebElement SKVpropertyrisklocationcode;

		@FindBy(xpath = "//input[@id='mui-29']")
		private WebElement SKVpropertysqaurefeet;

		@FindBy(xpath = "//input[@id='mui-30']")
		private WebElement SKVpropertyage;

		@FindBy(css = "input[value='true'][name='Propertylocatedatbasement']")
		private WebElement SKVpropertylocatedbasementtrue;

		@FindBy(css = "input[value='false'][name='Propertylocatedatbasement']")
		private WebElement SKVpropertylocatedbasementfalse;

		@FindBy(css = "input[value='true'][name='RentforalternativeAccommodation']")
		private WebElement SKVpropertyrentforalternateaccomadtiontrue;

		@FindBy(css = "input[value='false'][name='RentforalternativeAccommodation']")
		private WebElement SKVpropertyrentforalternateaccomadtionfalse;


		//--------------------------------------------------------
		//

		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		private WebElement SKFnomineesalutation;

		@FindBy(xpath = "//div[@id='mui-component-select-relationship']")
		private WebElement SKFnomineerelation;

		@FindBy(xpath = "//input[@id='mui-30']")
		private WebElement SKFnomineemobilenumber;

		@FindBy(xpath = "//input[@id='mui-31']")
		private WebElement SKFnomineefirstname;

		@FindBy(xpath = "//input[@id='mui-32']")
		private WebElement SKFnomineedateofbirth;

		@FindBy(xpath = "//input[@id='mui-33']")
		private WebElement SKFnomineeAdress1;

		@FindBy(xpath = "//input[@id='mui-34']")
		private WebElement SKFnomineelastname;

		@FindBy(xpath = "//input[@id='mui-35']")
		private WebElement SKFnomineeemail;

		@FindBy(xpath = "//input[@id='mui-36']")
		private WebElement SKFnomineeAdress2;

		//----Variable




		@FindBy(xpath = "//input[@id='mui-31']")
		private WebElement SKVnomineemobilenumber;

		@FindBy(xpath = "//input[@id='mui-32']")
		private WebElement SKVnomineefirstname;

		@FindBy(xpath = "//input[@id='mui-33']")
		private WebElement SKVnomineedateofbirth;

		@FindBy(xpath = "//input[@id='mui-34']")
		private WebElement SKVnomineeAdress1;

		@FindBy(xpath = "//input[@id='mui-35']")
		private WebElement SKVnomineelastname;

		@FindBy(xpath = "//input[@id='mui-36']")
		private WebElement SKVnomineeemail;

		@FindBy(xpath = "//input[@id='mui-37']")
		private WebElement SKVnomineeAdress2;





		//--------------------------------- Hypothicationdetails--------------------------------
		//Fixed-------

		@FindBy(xpath = "//input[@name='IsHypothecation']")
		private WebElement SKFHypothecationcheckbox;

		@FindBy(xpath = "//input[@id='mui-37']")
		private WebElement SKFFinanceInstitutename;

		@FindBy(xpath = "//input[@id='mui-38']")
		private WebElement SKFFinanceInstitutebranch;

		@FindBy(xpath = "//input[@id='mui-39']")
		private WebElement SKFFinanceInstitutelocation;




		//variable

		@FindBy(xpath = "//input[@id='mui-40']")
		private WebElement SKVFinanceInstitutename;

		@FindBy(xpath = "//input[@id='mui-41']")
		private WebElement SKVFinanceInstitutebranch;

		@FindBy(xpath = "//input[@id='mui-42']")
		private WebElement SKVFinanceInstitutelocation;


		//			----------------------------------Appliancesdetails------------------------------------

		@FindBy(xpath = "//input[@name='ShopKeeperApplianceName']")
		private WebElement SKFAppliancename;

		@FindBy(xpath = "//input[@name='ManufacturerName']")
		private WebElement SKFManfacturername;

		@FindBy(xpath = "//input[@name='Age']")
		private WebElement SKFApplianceage;

		@FindBy(xpath = "//input[@name='ApplianceCost']")
		private WebElement SKFAppliancevalue;

		@FindBy(xpath = "//input[@name='ApplianceInvoiceNumber']")
		private WebElement SKFApplianceinvoiceno;

		@FindBy(xpath = "//button[normalize-space()='+  Add Appliances']")
		private WebElement SKFAddAppliances;

		@FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]")
		private WebElement SKFRemoveAppliancerow;


		//--------------------------------------OTPconform--------------------

		@FindBy(xpath = "//input[@id='mui-40']")
		private WebElement SKFOTP;

		@FindBy(xpath = "//button[normalize-space()='Resend OTP']")
		private WebElement SKFResendOTPbutton;

		@FindBy(xpath = "//button[normalize-space()='Cancel']")
		private WebElement SKFOTPcancelbtn;

		@FindBy(xpath = "//button[normalize-space()='Confirm']")
		private WebElement SKFOTPconformbtn;

		@FindBy(xpath = "//button[normalize-space()='Back']")
		private WebElement SKFPagebackbtn;

		@FindBy(xpath = "//button[normalize-space()='Next']")
		private WebElement SKFnextpagebutton;

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
			return SKFnextpagebutton;
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

		public WebElement getSKCoveragedetailsEdit() {
			return SKCoveragedetailsEdit;
		}

		public WebElement getSKVSuminsured() {
			return SKVSuminsured;
		}

		public WebElement getSKVTenure() {
			return SKVTenure;
		}

		public WebElement getSKFVSalutation() {
			return SKFVSalutation;
		}

		public WebElement getSKFVproposerstate() {
			return SKFVproposerstate;
		}

		public WebElement getSKVcustomerid() {
			return SKVcustomerid;
		}

		public WebElement getSKVmobilenumber() {
			return SKVmobilenumber;
		}

		public WebElement getSKVDateofbirth() {
			return SKVDateofbirth;
		}

		public WebElement getSKVAadharnumber() {
			return SKVAadharnumber;
		}

		public WebElement getSKVAdress1() {
			return SKVAdress1;
		}

		public WebElement getSKVFirstname() {
			return SKVFirstname;
		}

		public WebElement getSKVpannumber() {
			return SKVpannumber;
		}

		public WebElement getSKVAdress2() {
			return SKVAdress2;
		}

		public WebElement getSKVLastname() {
			return SKVLastname;
		}

		public WebElement getSKVAnnualincome() {
			return SKVAnnualincome;
		}

		public WebElement getSKVCity() {
			return SKVCity;
		}

		public WebElement getSKVPincode() {
			return SKVPincode;
		}

		public WebElement getSKVEmail() {
			return SKVEmail;
		}

		public WebElement getSKVArea() {
			return SKVArea;
		}

		public WebElement getSKVOccupation() {
			return SKVOccupation;
		}

		public WebElement getSKVpropertyName() {
			return SKVpropertyName;
		}

		public WebElement getSKVpropertytype() {
			return SKVpropertytype;
		}

		public WebElement getSKVnatureofbusiness() {
			return SKVnatureofbusiness;
		}

		public WebElement getSKvpropertylocatedarea() {
			return SKvpropertylocatedarea;
		}

		public WebElement getSKVpropertynooffloors() {
			return SKVpropertynooffloors;
		}

		public WebElement getSKVpropertyfloornumber() {
			return SKVpropertyfloornumber;
		}

		public WebElement getSKVpropertyAddress() {
			return SKVpropertyAddress;
		}

		public WebElement getSKVpropertycity() {
			return SKVpropertycity;
		}

		public WebElement getSKVpropertystate() {
			return SKVpropertystate;
		}

		public WebElement getSKVpropertypincode() {
			return SKVpropertypincode;
		}

		public WebElement getSKVpropertylandmark() {
			return SKVpropertylandmark;
		}

		public WebElement getSKVpropertyrisklocationcode() {
			return SKVpropertyrisklocationcode;
		}

		public WebElement getSKVpropertysqaurefeet() {
			return SKVpropertysqaurefeet;
		}

		public WebElement getSKVpropertyage() {
			return SKVpropertyage;
		}

		public WebElement getSKVpropertylocatedbasementtrue() {
			return SKVpropertylocatedbasementtrue;
		}

		public WebElement getSKVpropertylocatedbasementfalse() {
			return SKVpropertylocatedbasementfalse;
		}

		public WebElement getSKVpropertyrentforalternateaccomadtiontrue() {
			return SKVpropertyrentforalternateaccomadtiontrue;
		}

		public WebElement getSKVpropertyrentforalternateaccomadtionfalse() {
			return SKVpropertyrentforalternateaccomadtionfalse;
		}

		public WebElement getSKVnomineemobilenumber() {
			return SKVnomineemobilenumber;
		}

		public WebElement getSKVnomineefirstname() {
			return SKVnomineefirstname;
		}

		public WebElement getSKVnomineedateofbirth() {
			return SKVnomineedateofbirth;
		}

		public WebElement getSKVnomineeAdress1() {
			return SKVnomineeAdress1;
		}

		public WebElement getSKVnomineelastname() {
			return SKVnomineelastname;
		}

		public WebElement getSKVnomineeemail() {
			return SKVnomineeemail;
		}

		public WebElement getSKVnomineeAdress2() {
			return SKVnomineeAdress2;
		}

		public WebElement getSKFHypothecationcheckbox() {
			return SKFHypothecationcheckbox;
		}

		public WebElement getSKFFinanceInstitutename() {
			return SKFFinanceInstitutename;
		}

		public WebElement getSKFFinanceInstitutebranch() {
			return SKFFinanceInstitutebranch;
		}

		public WebElement getSKFFinanceInstitutelocation() {
			return SKFFinanceInstitutelocation;
		}

		public WebElement getSKVFinanceInstitutename() {
			return SKVFinanceInstitutename;
		}

		public WebElement getSKVFinanceInstitutebranch() {
			return SKVFinanceInstitutebranch;
		}

		public WebElement getSKVFinanceInstitutelocation() {
			return SKVFinanceInstitutelocation;
		}

		public WebElement getSKFAppliancename() {
			return SKFAppliancename;
		}

		public WebElement getSKFManfacturername() {
			return SKFManfacturername;
		}

		public WebElement getSKFApplianceage() {
			return SKFApplianceage;
		}

		public WebElement getSKFAppliancevalue() {
			return SKFAppliancevalue;
		}

		public WebElement getSKFApplianceinvoiceno() {
			return SKFApplianceinvoiceno;
		}

		public WebElement getSKFAddAppliances() {
			return SKFAddAppliances;
		}

		public WebElement getSKFRemoveAppliancerow() {
			return SKFRemoveAppliancerow;
		}

		public WebElement getSKFPagebackbtn() {
			return SKFPagebackbtn;
		}

		public WebElement getSKFnextpagebutton() {
			return SKFnextpagebutton;
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


		@FindBy (xpath="//select[@id='emifeature_id']")
		private WebElement ProposerEmiValue;

		@FindBy (xpath="//div[@class='col-sm-4 border-right d-nominee']//select[@id='relation']")
		private WebElement NomineeRelation;

		@FindBy (xpath="//input[@placeholder='Address 2']")
		private WebElement NomineeAddress2;






		public WebElement getNomineeAddress2() {
			return NomineeAddress2;
		}

		public WebElement getNomineeRelation() {
			return NomineeRelation;
		}

		public WebElement getProposerEmiValue() {
			return ProposerEmiValue;
		}

		@FindBy (xpath="//button[normalize-space()='Confirm']")
		private WebElement confirmpolicy;

		@FindBy (xpath="//*[@id=\"confirmmobile_otp\"]")
		private WebElement proposerotp;

		@FindBy (xpath="//*[@id=\"confirmnomineemobile_otp\"]")
		private WebElement Nomineeotp;

		@FindBy (xpath="//button[normalize-space()='Cancel']")
		private WebElement Cancelpolicy;

		@FindBy (xpath="//div[@id='theid_1']//div[@class='col-sm-4 border-right d-member']//select[@id='relation']")
		private WebElement Adult2relationshipselect;

		@FindBy (xpath="//button[normalize-space()='Yes']")
		private WebElement policyconfirmyesbtn;

		@FindBy (xpath="//*[@id=\"confirmpay_btn\"]")
		private WebElement policyConfirmPay;



		public WebElement getPolicyConfirmPay() {
			return policyConfirmPay;
		}

		public WebElement getPolicyconfirmyesbtn() {
			return policyconfirmyesbtn;
		}

		public WebElement getAdult2relationshipselect() {
			return Adult2relationshipselect;
		}

		public WebElement getConfirmpolicy() {
			return confirmpolicy;
		}

		public WebElement getProposerotp() {
			return proposerotp;
		}

		public WebElement getNomineeotp() {
			return Nomineeotp;
		}

		public WebElement getCancelpolicy() {
			return Cancelpolicy;
		}

		@FindBy (xpath="//div[@id='theid_2']//div[@class='col-sm-4 border-right d-member']//select[@id='relation']")
		private WebElement Child1RelationshipSelect;


		@FindBy (xpath="//div[@id='theid_3']//div[@class='col-sm-4 border-right d-member']//select[@id='relation']")
		private WebElement Child2RealtionshipSelect;


		public WebElement getChild1RelationshipSelect() {
			return Child1RelationshipSelect;
		}

		public WebElement getChild2RealtionshipSelect() {
			return Child2RealtionshipSelect;
		}
		//================================================

		@FindBy(xpath="//select[@id='policy_term_id']")
		private WebElement PApolicyterm;

		@FindBy(xpath="//input[@id='loan_tenureid']")
		private WebElement PA_LoanTenureid;

		@FindBy(xpath="//input[@id='loanamountid']")
		private WebElement PA_loanamountid;

		@FindBy(xpath="//input[@id='sumassuredid']")
		private WebElement PA_sumassuredid;

		@FindBy(xpath="//input[@id='annualincome']")
		private WebElement PA_annualincome;


		@FindBy(xpath="//input[@id='pan_card']")
		private WebElement PA_pan_card;

		@FindBy(xpath="//div[@class='col-sm-4 border-right d-nominee']//input[@placeholder='First Name']")
		private WebElement nominee_FirstName;

		@FindBy(xpath="//input[@class='form-control name lastname alphabetAllow']")
		private WebElement nominee_LastName;

		@FindBy(xpath="//input[@placeholder='Address 2']")
		private WebElement nominee_Address2;


		@FindBy(xpath = "//button[@id='confirm_policy']")
		private WebElement OTP_policyconformbutton;

		@FindBy(xpath = "//button[normalize-space()='Yes']")
		private WebElement PApolicy_YES;


		@FindBy(xpath = "//button[@id='confirmpay_btn']")
		private WebElement confirmpay_btn;


		public WebElement getConfirmpay_btn() {
			return confirmpay_btn;
		}

		public WebElement getPApolicy_YES() {
			return PApolicy_YES;
		}

		public WebElement getOTP_policyconformbutton() {
			return OTP_policyconformbutton;
		}




		public WebElement getNominee_Address2() {
			return nominee_Address2;
		}

		public WebElement getNominee_LastName() {
			return nominee_LastName;
		}

		public WebElement getNominee_FirstName() {
			return nominee_FirstName;
		}

		public WebElement getPA_pan_card() {
			return PA_pan_card;
		}

		public WebElement getPA_annualincome() {
			return PA_annualincome;
		}

		public WebElement getPA_sumassuredid() {
			return PA_sumassuredid;
		}

		public WebElement getPA_loanamountid() {
			return PA_loanamountid;
		}





		public WebElement getPA_LoanTenureid() {
			return PA_LoanTenureid;
		}

		public WebElement getPApolicyterm() {
			return PApolicyterm;
		}


		//--------------------------------------------------------


		@FindBy(xpath = "//div[@id='theid_0']//input[@placeholder='Address 2']\n")
		private WebElement NomineeAdress2;
		
		@FindBy(xpath = "//div[@id='theid_1']//div[@class='col-sm-4 border-right d-member']//input[@placeholder='First Name']")
		private WebElement childFirstname;
		
		@FindBy(xpath = "//div[@id='theid_1']//div[@class='col-sm-4 border-right d-member']//input[@placeholder='Last Name']")
		private WebElement childLastname;


		@FindBy(xpath = "//*[@id=\"cov_life1y_2547\"]/div/label/div")
		private WebElement SandB_Covid;
		
		@FindBy(xpath = "//a[@id='covid_tab']")
		private WebElement Covid_tab;
		
		public WebElement getCovid_tab() {
			return Covid_tab;
		}

		public WebElement getSandB_Covid() {
			return SandB_Covid;
		}

		public WebElement getChildLastname() {
			return childLastname;
		}

		public WebElement getChildFirstname() {
			return childFirstname;
		}

		public WebElement getNomineeAdress2() {
			return NomineeAdress2;
		}
		
		
		//.............Retail.....health.............//

		@FindBy(xpath="//span[normalize-space()='Sales']")
		private WebElement SalesCorporate;
		@FindBy(xpath="//a[normalize-space()='Product Segments']")
		private WebElement HproductSegment;
		@FindBy(xpath="//div[@class='tile-stats pro_tile_2']")
		private WebElement Health;
		@FindBy(xpath="//div[@class='tile-stats pro_tile_002G']")
		private WebElement Hgroup;
		@FindBy(xpath="//a[@class='btn btn-primary']")
		private WebElement viewplans;
		@FindBy(xpath="//a[normalize-space()='Individual']")
		private WebElement Hindividual;

		@FindBy(xpath="//input[@id='rc_empcode']")
		private WebElement Hemp_id;
		@FindBy(xpath="//select[@id='rc_memsalutationid']")
		private WebElement Hsalutation_id;
		@FindBy(xpath="//input[@id='rc_memname']")
		private WebElement HmemberName;
		@FindBy(xpath="//input[@id='rc_memdob']")
		private WebElement Hmember_DOB;
		@FindBy(xpath="//div[@class='iradio_square-green checked']//ins[@class='iCheck-helper']")
		private WebElement HMale ;
		@FindBy(xpath="//div[@class='iradio_square-green']//ins[@class='iCheck-helper']")
		private WebElement Hfemale;
		@FindBy(xpath="//input[@id='rc_mememail']")
		private WebElement Hemail ;
		@FindBy(xpath="//input[@id='rc_memmobile']")
		private WebElement Hmobile ;
		@FindBy(xpath="//select[@id='rc_relationid']")
		private WebElement Hrelation_id;
		@FindBy(xpath="//input[@id='rc_designation']")
		private WebElement Hdesignation ;
		@FindBy(xpath="//input[@id='rc_memLocation']")
		private WebElement Hlocation;
		@FindBy(xpath="//input[@id='rc_memdoj']")
		private WebElement Hmember_joinDate;
		@FindBy(xpath="//input[@id='rc_memdoc']")
		private WebElement HDOC ;
		@FindBy(xpath="//select[@id='rc_suminsurd']")
		private WebElement Hsuminsure;
		@FindBy(xpath="//input[@id='rc_healthCardno']")
		private WebElement HhealthCard_No;
		@FindBy(xpath="//input[@id='rc_memberpremium']")
		private WebElement HmemeberPremium;
		@FindBy(xpath="//input[@id='rc_gstamount']")
		private WebElement Hgst_Amount;
		@FindBy(xpath="//input[@id='coi_file_path']")
		private WebElement Hfilepath ;
		@FindBy(xpath="//input[@id='coi_file_path_cor']")
		private WebElement Hbrowse_Btn;
		//--------------------------------------------nominee details-----------------
		@FindBy(xpath="//input[@id='rc_nominee_fname']")
		private WebElement H_Nominee_fname ;
		@FindBy(xpath="//input[@id='rc_nominee_lname']")
		private WebElement H_Nominee_lastName;
		@FindBy(xpath="//input[@id='rc_nominee_mobile']")
		private WebElement H_Nominee_mobile;
		@FindBy(xpath="//input[@id='rc_nominee_email']")
		private WebElement H_Nominee_email;
		@FindBy(xpath="//input[@id='rc_nominee_dob']")
		private WebElement H_Nominee_dob;
		@FindBy(xpath="//select[@id='rc_nominee_relation']")
		private WebElement H_Nominee_relation ;
		@FindBy(xpath="//textarea[@id='rc_nominee_add1']")
		private WebElement H_Nominee_address1;
		@FindBy(xpath="//textarea[@id='rc_nominee_add2']")
		private WebElement H_Nominee_address2;
		@FindBy(xpath="//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
		private WebElement Send_mail_Alert;
		@FindBy(xpath="//input[@id='sms_send_modal']")
		private WebElement Send_SMS_Alert;
		@FindBy(xpath="//button[@id='member_save']")
		private WebElement Save_btn;
		@FindBy(xpath="//button[@id='go-back']")
		private WebElement Back_btn;
		public WebElement getSalesCorporate() {
		return SalesCorporate;
		}
		public WebElement getHproductSegment() {
		return HproductSegment;
		}
		public WebElement getHealth() {
		return Health;
		}
		public WebElement getHgroup() {
		return Hgroup;
		}
		public WebElement getViewplans() {
		return viewplans;
		}
		public WebElement getHindividual() {
		return Hindividual;
		}
		public WebElement getHemp_id() {
		return Hemp_id;
		}
		public WebElement getHsalutation_id() {
		return Hsalutation_id;
		}
		public WebElement getHmemberName() {
		return HmemberName;
		}
		public WebElement getHmember_DOB() {
		return Hmember_DOB;
		}
		public WebElement getHMale() {
		return HMale;
		}
		public WebElement getHfemale() {
		return Hfemale;
		}
		public WebElement getHemail() {
		return Hemail;
		}
		public WebElement getHmobile() {
		return Hmobile;
		}
		public WebElement getHrelation_id() {
		return Hrelation_id;
		}
		public WebElement getHdesignation() {
		return Hdesignation;
		}
		public WebElement getHlocation() {
		return Hlocation;
		}
		public WebElement getHmember_joinDate() {
		return Hmember_joinDate;
		}
		public WebElement getHDOC() {
		return HDOC;
		}
		public WebElement getHsuminsure() {
		return Hsuminsure;
		}
		public WebElement getHhealthCard_No() {
		return HhealthCard_No;
		}
		public WebElement getHmemeberPremium() {
		return HmemeberPremium;
		}
		public WebElement getHgst_Amount() {
		return Hgst_Amount;
		}
		public WebElement getHfilepath() {
		return Hfilepath;
		}
		public WebElement getHbrowse_Btn() {
		return Hbrowse_Btn;
		}
		public WebElement getH_Nominee_fname() {
		return H_Nominee_fname;
		}
		public WebElement getH_Nominee_lastName() {
		return H_Nominee_lastName;
		}
		public WebElement getH_Nominee_mobile() {
		return H_Nominee_mobile;
		}
		public WebElement getH_Nominee_email() {
		return H_Nominee_email;
		}
		public WebElement getH_Nominee_dob() {
		return H_Nominee_dob;
		}
		public WebElement getH_Nominee_relation() {
		return H_Nominee_relation;
		}
		public WebElement getH_Nominee_address1() {
		return H_Nominee_address1;
		}
		public WebElement getH_Nominee_address2() {
		return H_Nominee_address2;
		}
		public WebElement getSend_mail_Alert() {
		return Send_mail_Alert;
		}
		public WebElement getSend_SMS_Alert() {
		return Send_SMS_Alert;
		}
		public WebElement getSave_btn() {
		return Save_btn;
		}
		public WebElement getBack_btn() {
		return Back_btn;
		}

		@FindBy(xpath="//span[normalize-space()='Sales']")
		private WebElement HHSales;

		


		public WebElement getHHSales() {
		return HHSales;
		}

		
		public void setSalesCorporate(WebElement salesCorporate) {
		SalesCorporate = salesCorporate;
		}
		public void setHproductSegment(WebElement hproductSegment) {
		HproductSegment = hproductSegment;
		}
		public void setHealth(WebElement health) {
		Health = health;
		}
		public void setHgroup(WebElement hgroup) {
		Hgroup = hgroup;
		}
		public void setViewplans(WebElement viewplans) {
		this.viewplans = viewplans;
		}
		public void setHindividual(WebElement hindividual) {
		Hindividual = hindividual;
		}
		public void setHemp_id(WebElement hemp_id) {
		Hemp_id = hemp_id;
		}
		public void setHsalutation_id(WebElement hsalutation_id) {
		Hsalutation_id = hsalutation_id;
		}
		public void setHmemberName(WebElement hmemberName) {
		HmemberName = hmemberName;
		}
		public void setHmember_DOB(WebElement hmember_DOB) {
		Hmember_DOB = hmember_DOB;
		}
		public void setHMale(WebElement hMale) {
		HMale = hMale;
		}
		public void setHfemale(WebElement hfemale) {
		Hfemale = hfemale;
		}
		public void setHemail(WebElement hemail) {
		Hemail = hemail;
		}
		public void setHmobile(WebElement hmobile) {
		Hmobile = hmobile;
		}
		public void setHrelation_id(WebElement hrelation_id) {
		Hrelation_id = hrelation_id;
		}
		public void setHdesignation(WebElement hdesignation) {
		Hdesignation = hdesignation;
		}
		public void setHlocation(WebElement hlocation) {
		Hlocation = hlocation;
		}
		public void setHmember_joinDate(WebElement hmember_joinDate) {
		Hmember_joinDate = hmember_joinDate;
		}
		public void setHDOC(WebElement hDOC) {
		HDOC = hDOC;
		}
		public void setHsuminsure(WebElement hsuminsure) {
		Hsuminsure = hsuminsure;
		}
		public void setHhealthCard_No(WebElement hhealthCard_No) {
		HhealthCard_No = hhealthCard_No;
		}
		public void setHmemeberPremium(WebElement hmemeberPremium) {
		HmemeberPremium = hmemeberPremium;
		}
		public void setHgst_Amount(WebElement hgst_Amount) {
		Hgst_Amount = hgst_Amount;
		}
		public void setHfilepath(WebElement hfilepath) {
		Hfilepath = hfilepath;
		}
		public void setHbrowse_Btn(WebElement hbrowse_Btn) {
		Hbrowse_Btn = hbrowse_Btn;
		}
		public void setH_Nominee_fname(WebElement h_Nominee_fname) {
		H_Nominee_fname = h_Nominee_fname;
		}
		public void setH_Nominee_lastName(WebElement h_Nominee_lastName) {
		H_Nominee_lastName = h_Nominee_lastName;
		}
		public void setH_Nominee_mobile(WebElement h_Nominee_mobile) {
		H_Nominee_mobile = h_Nominee_mobile;
		}
		public void setH_Nominee_email(WebElement h_Nominee_email) {
		H_Nominee_email = h_Nominee_email;
		}
		public void setH_Nominee_dob(WebElement h_Nominee_dob) {
		H_Nominee_dob = h_Nominee_dob;
		}
		public void setH_Nominee_relation(WebElement h_Nominee_relation) {
		H_Nominee_relation = h_Nominee_relation;
		}
		public void setH_Nominee_address1(WebElement h_Nominee_address1) {
		H_Nominee_address1 = h_Nominee_address1;
		}
		public void setH_Nominee_address2(WebElement h_Nominee_address2) {
		H_Nominee_address2 = h_Nominee_address2;
		}
		public void setSend_mail_Alert(WebElement send_mail_Alert) {
		Send_mail_Alert = send_mail_Alert;
		}
		public void setSend_SMS_Alert(WebElement send_SMS_Alert) {
		Send_SMS_Alert = send_SMS_Alert;
		}
		public void setSave_btn(WebElement save_btn) {
		Save_btn = save_btn;
		}
		public void setBack_btn(WebElement back_btn) {
		Back_btn = back_btn;
		}

		//-----------------------PA------------------
		@FindBy(xpath="//div[@class='tile-stats pro_tile_3']//h3[@id='segment_icn_name']")
		private WebElement PersonalAccident;
		@FindBy(xpath="//div[@class='tile-stats pro_tile_002G']//h3[@id='sale_icn_name']")
		private WebElement PA_Group;





			public WebElement getPersonalAccident() {
			return PersonalAccident;
		}

			public WebElement getPA_Group() {
				return PA_Group;
			}
		@FindBy(xpath="//a[normalize-space()='Bulk Upload']")
		private WebElement PA_Bulkupload;

			public WebElement getPA_Bulkupload() {
			return PA_Bulkupload;
		}
		@FindBy(xpath="//button[@id='upload_data']")
		private WebElement PA_Uploadbutton;

			public WebElement getPA_Uploadbutton() {
			return PA_Uploadbutton;
		}
		@FindBy(xpath="//button[normalize-space()='Yes']")
		private WebElement PA_okButton;

			public WebElement getPA_okButton() {
			return PA_okButton;
		}
		@FindBy(xpath="//button[@id='send_alerts']")
		private WebElement PA_SendAlert;
		@FindBy(xpath="//button[@id='back_home']")
		private WebElement PA_back_Home;

			public WebElement getPA_SendAlert() {
			return PA_SendAlert;
		}

		public WebElement getPA_back_Home() {
			return PA_back_Home;
		}
		@FindBy(xpath="//input[@id='rc_excelfile']")
		private WebElement PA_corporate_excel;
		

		public WebElement getPA_corporate_excel() {
			return PA_corporate_excel;
		}
		
		@FindBy(xpath = "//button[@id='upload_data']")
		private WebElement Bulk_uploadButton;
		

		public WebElement getBulk_uploadButton() {
			return Bulk_uploadButton;
		}
		//--------------------------------------Corporate--------------------------
		@FindBy(xpath="//select[@id='orgid']")
		private WebElement Corporate_org;
		@FindBy(xpath="//select[@id='branchid']")
		private WebElement Corporate_branch;
		@FindBy(xpath="//select[@id='productid']")
		private WebElement Corporate_proid;
		@FindBy(xpath="//select[@id='productplanid']")
		private WebElement Corporate_Proplanid;
		@FindBy(xpath="//button[@id='bulkpol_btn']")
		private WebElement Corporate_uploadbtn;


			public WebElement getCorporate_org() {
			return Corporate_org;
		}

		public WebElement getCorporate_branch() {
			return Corporate_branch;
		}

		public WebElement getCorporate_proid() {
			return Corporate_proid;
		}

		public WebElement getCorporate_Proplanid() {
			return Corporate_Proplanid;
		}

		public WebElement getCorporate_uploadbtn() {
			return Corporate_uploadbtn;
		}
		@FindBy(xpath="//a[normalize-space()='Corporate Policies Upload']")
		private WebElement Corporate_Policyupload;

			public WebElement getCorporate_Policyupload() {
			return Corporate_Policyupload;
		}
			@FindBy(xpath="//div[@id='rc_upload_btn']//button[@id='upload_data']")
			private WebElement Corporate_Uploadbtn;
			
			

			public WebElement getCorporate_Uploadbtn() {
				return Corporate_Uploadbtn;
			}
			@FindBy(xpath="//body/div[@id='wrapper']/div[@id='page-wrapper']/div/div[@class='row p-sm']/div[@class='col-lg-12']/div[@id='ibox1']/div[@class='ibox-content']/div[@id='excel_upload_div']/div[@class='row']/div[@class='col-lg-12']/div[@class='ibox float-e-margins']/div[@class='ibox-title']/div[@class='tab-content']/div[@id='comments']/div[3]/div[1]")
			private WebElement Corporate_excel;
			

			public WebElement getCorporate_excel() {
				return Corporate_excel;
			}
			
			@FindBy(xpath = "//button[@id='upload_data']")
			private WebElement uploadpolicies;

			public WebElement getuploadpolicies() {
				return uploadpolicies;
			}
			
			@FindBy(xpath="//input[@id='rc_suminsurd']")
			private WebElement Corporate_gtl_suminsured;
			
			
		public WebElement getCorporate_gtl_suminsured() {
				return Corporate_gtl_suminsured;
			}
		

		@FindBy(xpath="//div[@class='tile-stats pro_tile_26']")
		private WebElement Wellness;
		

		public WebElement getWellness() {
			return Wellness;
		}

		public SalesPage() {
			PageFactory.initElements(driver, this);
		}
	}






