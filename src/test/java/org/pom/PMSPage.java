package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PMSPage extends BaseClass {
	@FindBy(xpath = "//span[normalize-space()='PMS']")
	private WebElement pmsDropDown;

	public WebElement getPmsDropDown() {
		return pmsDropDown;
	}

	@FindBy(xpath = "//table[@id=\"reportTable\"]//tr[1]//td[16]//a[1]")
	private WebElement pmPolicieslistviewbtn;

	public WebElement getpmPolicieslistviewbtn() {
		return pmPolicieslistviewbtn;
	}

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement pmPolicieslisthomebtn;

	public WebElement getpmPolicieslisthomebtn() {
		return pmPolicieslisthomebtn;
	}

	@FindBy(xpath = "//table[@id=\"reportTable_expiredPolicies\"]//tr[1]//td[16]//a[1]")
	private WebElement pmExpiredPolicieslistviewbtn;

	public WebElement getpmExpiredPolicieslistviewbtn() {
		return pmExpiredPolicieslistviewbtn;
	}

	/// ..Monthly Wise Policy Data..(mwpd).//

	@FindBy(xpath = "//a[normalize-space()='Monthly Wise Policy Data']")
	private WebElement pmsMonthlyWisepolicyData;

	@FindBy(xpath = "//select[@id='policyyear_todate']")
	private WebElement pms_mwpd_YearSelect;

	@FindBy(xpath = "//select[@id='policymonth_fromdate']")
	private WebElement pms_mwpd_MonthSelect;

	@FindBy(xpath = "//a[@id='product_yearfilter_search']")
	private WebElement pms_mwpd_SearchBtn;

	@FindBy(xpath = "//a[@id='product_yearfilter_clear']")
	private WebElement pms_mwpd_ResetBtn;

	@FindBy(xpath = "//select[contains(@name,'pol_yearly_business_length')]")
	private WebElement pms_mwpd_ShowSelect;

	public WebElement getPmsMonthlyWisepolicyData() {
		return pmsMonthlyWisepolicyData;
	}

	public WebElement getPms_mwpd_YearSelect() {
		return pms_mwpd_YearSelect;
	}

	public WebElement getPms_mwpd_MonthSelect() {
		return pms_mwpd_MonthSelect;
	}

	public WebElement getPms_mwpd_SearchBtn() {
		return pms_mwpd_SearchBtn;
	}

	public WebElement getPms_mwpd_ResetBtn() {
		return pms_mwpd_ResetBtn;
	}

	public WebElement getPms_mwpd_ShowSelect() {
		return pms_mwpd_ShowSelect;
	}

	// ...Policies...(p).//

	@FindBy(xpath = "//a[normalize-space()='Policies']")
	private WebElement pmsPolicies;

	public WebElement getPmsPolicies() {
		return pmsPolicies;
	}

	// ...Policies List..(pl).///

	@FindBy(xpath = "//a[normalize-space()='Policies List']")
	private WebElement pms_p_policiesList;

	@FindBy(xpath = "//input[@id='filter_coinumber']")
	private WebElement pms_p_pl_CoiNo;

	@FindBy(xpath = "//input[@id='filter_loanaccount']")
	private WebElement pms_p_pl_LoanAccountNo;

	@FindBy(xpath = "//input[@id='search_startdatetime']")
	private WebElement pms_p_pl_PolicyStartDate;

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement pms_p_pl_apply;

	public WebElement getPms_p_pl_apply() {
		return pms_p_pl_apply;
	}

	public WebElement getPms_p_policiesList() {
		return pms_p_policiesList;
	}

	public WebElement getPms_p_pl_CoiNo() {
		return pms_p_pl_CoiNo;
	}

	public WebElement getPms_p_pl_LoanAccountNo() {
		return pms_p_pl_LoanAccountNo;
	}

	public WebElement getPms_p_pl_PolicyStartDate() {
		return pms_p_pl_PolicyStartDate;
	}

	// ...Rejected Policies..(rp).//

	@FindBy(xpath = "//a[normalize-space()='Rejected Policies']")
	private WebElement pms_p_rejectedPolicies;

	@FindBy(xpath = "//div[@id='tab-1']//i[@class='fa fa-chevron-up']")
	private WebElement pms_p_rp_FilterArrowButton;

	@FindBy(id = "select2-orgid_rej-container")
	private WebElement pms_p_rp_OrganizationSpan;

	@FindBy(id = "select2-inscompanyid_rej-container")
	private WebElement pms_p_rp_InsuranceCompanySpan;

	@FindBy(xpath = "//input[@id='filter_customerid_rej']")
	private WebElement pms_p_rp_CustomerId;

	@FindBy(xpath = "//input[@id='filter_mobile_rej']")
	private WebElement pms_p_rp_MobileNo;

	@FindBy(xpath = "//input[@id='filter_mail_rej']")
	private WebElement pms_p_rp_Email;

	@FindBy(xpath = "//input[@id='filter_coinumber_rej']")
	private WebElement pms_p_rp_CoiNo;

	@FindBy(xpath = "//input[@id='filter_loanaccount_rej']")
	private WebElement pms_p_rp_LoanAccountNo;

	@FindBy(xpath = "//input[@id='search_startdatetime_rej']")
	private WebElement pms_p_rp_PolicyStartDate;

	@FindBy(xpath = "//a[@id='btn_filter_rejPolicies']")
	private WebElement pms_p_rp_ApplyButton;

	@FindBy(xpath = "//a[@id='btn_filter_rejPolicies_clear']")
	private WebElement pms_p_rp_ResetButton;

	@FindBy(xpath = "//div[@id='reportTable_rejectedPolicies_wrapper']//div//span[contains(text(),'Excel')]")
	private WebElement pms_p_rp_EntriesDataDownloadInExcel;

	@FindBy(xpath = "//select[@name='reportTable_rejectedPolicies_length']")
	private WebElement pms_p_rp_ShowSelect;

	public WebElement getPms_p_rejectedPolicies() {
		return pms_p_rejectedPolicies;
	}

	public WebElement getPms_p_rp_FilterArrowButton() {
		return pms_p_rp_FilterArrowButton;
	}

	public WebElement getPms_p_rp_OrganizationSpan() {
		return pms_p_rp_OrganizationSpan;
	}

	public WebElement getPms_p_rp_InsuranceCompanySpan() {
		return pms_p_rp_InsuranceCompanySpan;
	}

	public WebElement getPms_p_rp_CustomerId() {
		return pms_p_rp_CustomerId;
	}

	public WebElement getPms_p_rp_MobileNo() {
		return pms_p_rp_MobileNo;
	}

	public WebElement getPms_p_rp_Email() {
		return pms_p_rp_Email;
	}

	public WebElement getPms_p_rp_CoiNo() {
		return pms_p_rp_CoiNo;
	}

	public WebElement getPms_p_rp_LoanAccountNo() {
		return pms_p_rp_LoanAccountNo;
	}

	public WebElement getPms_p_rp_PolicyStartDate() {
		return pms_p_rp_PolicyStartDate;
	}

	public WebElement getPms_p_rp_ApplyButton() {
		return pms_p_rp_ApplyButton;
	}

	public WebElement getPms_p_rp_ResetButton() {
		return pms_p_rp_ResetButton;
	}

	public WebElement getPms_p_rp_EntriesDataDownloadInExcel() {
		return pms_p_rp_EntriesDataDownloadInExcel;
	}

	public WebElement getPms_p_rp_ShowSelect() {
		return pms_p_rp_ShowSelect;
	}

	// ....Medical Waiting policies..(mwp).//

	@FindBy(xpath = "//a[normalize-space()='Medical Waiting Policies']")
	private WebElement pms_p_medicalWaitingpolicies;

	@FindBy(xpath = "//div[@id='tab-2']//i[@class='fa fa-chevron-up']")
	private WebElement pms_p_mwp_FilterArrowButton;

	@FindBy(id = "select2-orgid_med-container")
	private WebElement pms_p_mwp_OrganizationSpan;

	@FindBy(id = "select2-inscompanyid_med-container")
	private WebElement pms_p_mwp_InsuranceCompanySpan;

	@FindBy(xpath = "//input[@id='filter_customerid_med']")
	private WebElement pms_p_mwp_CustomerId;

	@FindBy(xpath = "//input[@id='filter_mobile_med']")
	private WebElement pms_p_mwp_MobileNo;

	@FindBy(xpath = "//input[@id='filter_mail_med']")
	private WebElement pms_p_mwp_Email;

	@FindBy(xpath = "//input[@id='filter_coinumber_med']")
	private WebElement pms_p_mwp_CoiNo;

	@FindBy(xpath = "//input[@id='filter_loanaccount_med']")
	private WebElement pms_p_mwp_LoanAccountNo;

	@FindBy(xpath = "//input[@id='search_startdatetime_med']")
	private WebElement pms_p_mwp_PolicyStartDate;

	@FindBy(xpath = "//a[@id='btn_filter_medicalWaiting']")
	private WebElement pms_p_mwp_ApplyButton;

	@FindBy(xpath = "//a[@id='btn_filter_medicalWaiting_clear']")
	private WebElement pms_p_mwp_ResetButton;

	@FindBy(xpath = "//div[@id='reportTable_medicalWaiting_wrapper']//div//span[contains(text(),'Excel')]")
	private WebElement pms_p_mwp_EntriesDataDownloadInExcel;

	@FindBy(xpath = "//select[@name='reportTable_medicalWaiting_length']")
	private WebElement pms_p_mwp_ShowSelect;

	public WebElement getPms_p_medicalWaitingpolicies() {
		return pms_p_medicalWaitingpolicies;
	}

	public WebElement getPms_p_mwp_FilterArrowButton() {
		return pms_p_mwp_FilterArrowButton;
	}

	public WebElement getPms_p_mwp_OrganizationSpan() {
		return pms_p_mwp_OrganizationSpan;
	}

	public WebElement getPms_p_mwp_InsuranceCompanySpan() {
		return pms_p_mwp_InsuranceCompanySpan;
	}

	public WebElement getPms_p_mwp_CustomerId() {
		return pms_p_mwp_CustomerId;
	}

	public WebElement getPms_p_mwp_MobileNo() {
		return pms_p_mwp_MobileNo;
	}

	public WebElement getPms_p_mwp_Email() {
		return pms_p_mwp_Email;
	}

	public WebElement getPms_p_mwp_CoiNo() {
		return pms_p_mwp_CoiNo;
	}

	public WebElement getPms_p_mwp_LoanAccountNo() {
		return pms_p_mwp_LoanAccountNo;
	}

	public WebElement getPms_p_mwp_PolicyStartDate() {
		return pms_p_mwp_PolicyStartDate;
	}

	public WebElement getPms_p_mwp_ApplyButton() {
		return pms_p_mwp_ApplyButton;
	}

	public WebElement getPms_p_mwp_ResetButton() {
		return pms_p_mwp_ResetButton;
	}

	public WebElement getPms_p_mwp_EntriesDataDownloadInExcel() {
		return pms_p_mwp_EntriesDataDownloadInExcel;
	}

	public WebElement getPms_p_mwp_ShowSelect() {
		return pms_p_mwp_ShowSelect;
	}

	// ....Expired Policies List..(epl).//

	@FindBy(xpath = "//a[normalize-space()='Expired Policies List']")
	private WebElement pms_p_expiredPoliciesList;

	@FindBy(xpath = "//div[@id='tab-3']//i[@class='fa fa-chevron-up']")
	private WebElement pms_p_epl_FilterArrowButton;

	@FindBy(id = "select2-orgid_exp-container")
	private WebElement pms_p_epl_OrganizationSpan;

//	@FindBy(id = "select2-productid_exp-container")
//	private WebElement pms_p_epl_ProductNameSpan;

	@FindBy(xpath = "//select[@id='productid_exp']")
	private WebElement pms_p_epl_ProductNameSpan;

	@FindBy(id = "select2-inscompanyid_exp-container")
	private WebElement pms_p_epl_InsuranceCompanySpan;

	@FindBy(xpath = "//input[@id='filter_customerid_exp']")
	private WebElement pms_p_epl_CustomerId;

	@FindBy(xpath = "//input[@id='filter_mobile_exp']")
	private WebElement pms_p_epl_MobileNo;

	@FindBy(xpath = "//input[@id='filter_mail_exp']")
	private WebElement pms_p_epl_Email;

	@FindBy(xpath = "//input[@id='filter_coinumber_exp']")
	private WebElement pms_p_epl_CoiNo;

	@FindBy(xpath = "//input[@id='filter_loanaccount_exp']")
	private WebElement pms_p_epl_LoanAccountNo;

	@FindBy(xpath = "//input[@id='search_startdatetime_exp']")
	private WebElement pms_p_epl_PolicyStartDate;

	@FindBy(xpath = "//input[@id='search_expirydatetime_exp']")
	private WebElement pms_p_epl_PolicyExpiryDate;

	@FindBy(xpath = "//a[@id='btn_filter_expPolicies']")
	private WebElement pms_p_epl_ApplyButton;

	@FindBy(xpath = "//a[@id='btn_filter_expPolicies_clear']")
	private WebElement pms_p_epl_Resetbutton;

	@FindBy(xpath = "//div[@id='reportTable_expiredPolicies_wrapper']//div//span[contains(text(),'Excel')]")
	private WebElement pms_p_epl_EntriesDataDownloadInExcel;

	@FindBy(xpath = "//select[@name='reportTable_expiredPolicies_length']")
	private WebElement pms_p_epl_ShowSelect;

	@FindBy(xpath = "//a[@id='btn_filter_expPolicies_clear']")
	private WebElement pms_expriredpolicies_reset_button;

	@FindBy(xpath = "//input[@id='search_startdatetime_exp']")
	private WebElement pms_exppolicies_startdate;

	public WebElement getPms_exppolicies_startdate() {
		return pms_exppolicies_startdate;
	}

	public WebElement getPms_exppolicies_Expdate() {
		return pms_exppolicies_Expdate;
	}

	@FindBy(xpath = "//input[@id='search_startdatetime_exp']")
	private WebElement pms_exppolicies_Expdate;

	public WebElement getPms_expriredpolicies_reset_button() {
		return pms_expriredpolicies_reset_button;
	}

	public WebElement getPms_p_expiredPoliciesList() {
		return pms_p_expiredPoliciesList;
	}

	public WebElement getPms_p_epl_FilterArrowButton() {
		return pms_p_epl_FilterArrowButton;
	}

	public WebElement getPms_p_epl_OrganizationSpan() {
		return pms_p_epl_OrganizationSpan;
	}

	public WebElement getPms_p_epl_ProductNameSpan() {
		return pms_p_epl_ProductNameSpan;
	}

	public WebElement getPms_p_epl_InsuranceCompanySpan() {
		return pms_p_epl_InsuranceCompanySpan;
	}

	public WebElement getPms_p_epl_CustomerId() {
		return pms_p_epl_CustomerId;
	}

	public WebElement getPms_p_epl_MobileNo() {
		return pms_p_epl_MobileNo;
	}

	public WebElement getPms_p_epl_Email() {
		return pms_p_epl_Email;
	}

	public WebElement getPms_p_epl_CoiNo() {
		return pms_p_epl_CoiNo;
	}

	public WebElement getPms_p_epl_LoanAccountNo() {
		return pms_p_epl_LoanAccountNo;
	}

	public WebElement getPms_p_epl_PolicyStartDate() {
		return pms_p_epl_PolicyStartDate;
	}

	public WebElement getPms_p_epl_PolicyExpiryDate() {
		return pms_p_epl_PolicyExpiryDate;
	}

	public WebElement getPms_p_epl_ApplyButton() {
		return pms_p_epl_ApplyButton;
	}

	public WebElement getPms_p_epl_Resetbutton() {
		return pms_p_epl_Resetbutton;
	}

	public WebElement getPms_p_epl_EntriesDataDownloadInExcel() {
		return pms_p_epl_EntriesDataDownloadInExcel;
	}

	public WebElement getPms_p_epl_ShowSelect() {
		return pms_p_epl_ShowSelect;
	}

	// ...After Click the View Button....//

	@FindBy(xpath = "//*[@id=\"pageactions\"]/div/a[1]")
	private WebElement pmsViewdetailsDownloadBtn;

	@FindBy(xpath = "//*[@id=\"pageactions\"]/div/a[2]")
	private WebElement pmsviewBackBtn;

	public WebElement getPmsViewdetailsDownloadBtn() {
		return pmsViewdetailsDownloadBtn;
	}

	public WebElement getPmsviewBackBtn() {
		return pmsviewBackBtn;
	}

	// ...After Click the Upload Button...//

	@FindBy(xpath = "//input[@id='healthcard_doc']")
	private WebElement pms_p_pl_Upload_HealthecarduploadFile;

	@FindBy(xpath = "//button[@id='RegionModal_Close']")
	private WebElement pms_p_pl_Upload_CloseBtn;

	@FindBy(xpath = "//button[@id='card_update']")
	private WebElement pms_p_pl_Upload_SaveBtn;

	public WebElement getPms_p_pl_Upload_HealthecarduploadFile() {
		return pms_p_pl_Upload_HealthecarduploadFile;
	}

	public WebElement getPms_p_pl_Upload_CloseBtn() {
		return pms_p_pl_Upload_CloseBtn;
	}

	public WebElement getPms_p_pl_Upload_SaveBtn() {
		return pms_p_pl_Upload_SaveBtn;
	}

	// {.....After Click the MembersUpload Button..(mu)..//

	// ........Upload Members.......//
	@FindBy(xpath = "//a[normalize-space()='Upload Members']")
	private WebElement pms_p_pl_mu_UploadMembersClick;

	@FindBy(xpath = "//input[@id='rc_excelfile']")
	private WebElement pms_p_pl_mu_UploadMembersExcelFile;

	public WebElement getPms_p_pl_mu_UploadMembersClick() {
		return pms_p_pl_mu_UploadMembersClick;
	}

	public WebElement getPms_p_pl_mu_UploadMembersExcelFile() {
		return pms_p_pl_mu_UploadMembersExcelFile;
	}

	// ...................MembersClick..........................//
	@FindBy(xpath = "//a[normalize-space()='Members']")
	private WebElement pms_p_pl_mu_MembersClick;

	public WebElement getPms_p_pl_mu_MembersClick() {
		return pms_p_pl_mu_MembersClick;
	}

	// .........Member Delete Button..................//

	@FindBy(xpath = "//a[@id='btn_delet_member']")
	private WebElement pms_p_pl_mu_members_MemberDeleteBtn;

	@FindBy(xpath = "//input[@id='rc_delete_excelfile']")
	private WebElement pms_p_pl_mu_members_UploadDeleteMembersExcelFile;

	public WebElement getPms_p_pl_mu_members_MemberDeleteBtn() {
		return pms_p_pl_mu_members_MemberDeleteBtn;
	}

	public WebElement getPms_p_pl_mu_members_UploadDeleteMembersExcelFile() {
		return pms_p_pl_mu_members_UploadDeleteMembersExcelFile;
	}

	// ...........Deleted Member List Button..........................//

	@FindBy(xpath = "//a[@id='btn_delet_memberlist']")
	private WebElement pms_p_pl_mu_members_DeletedMembersListBtn;

	@FindBy(xpath = "//input[@id='mui-3']")
	private WebElement pms_p_pl_mu_members_DeletedMembersListSearchRows;

	public WebElement getPms_p_pl_mu_members_DeletedMembersListBtn() {
		return pms_p_pl_mu_members_DeletedMembersListBtn;
	}

	public WebElement getPms_p_pl_mu_members_DeletedMembersListSearchRows() {
		return pms_p_pl_mu_members_DeletedMembersListSearchRows;
	}

	// ..........After Click HealthCard Upload...............//

	@FindBy(xpath = "//input[@id='coi_file_path_cor']")
	private WebElement pms_p_pl_mu_HealthCardChooseFile;

	@FindBy(xpath = "//button[@class='btn btn-danger'][normalize-space()='Close']")
	private WebElement pms_p_pl_mu_HealthCardUploadCloseBtn;

	@FindBy(xpath = "//button[@id='member_health_card_save']")
	private WebElement pms_p_Pl_mu_HealthCardUploadSaveBtn;

	public WebElement getPms_p_pl_mu_HealthCardChooseFile() {
		return pms_p_pl_mu_HealthCardChooseFile;
	}

	public WebElement getPms_p_pl_mu_HealthCardUploadCloseBtn() {
		return pms_p_pl_mu_HealthCardUploadCloseBtn;
	}

	public WebElement getPms_p_Pl_mu_HealthCardUploadSaveBtn() {
		return pms_p_Pl_mu_HealthCardUploadSaveBtn;
	}

	// ........New Self Member button......(Nsm)........//

	@FindBy(xpath = "//button[@id='btn_add_new_member']")
	private WebElement pms_p_pl_mu_members_NewSelfMemberBtn;

	@FindBy(xpath = "//input[@id='rc_empcode']")
	private WebElement pms_p_pl_mu_member_Nsm_EmployeeCode;

	@FindBy(xpath = "//select[@id='rc_memsalutationid']")
	private WebElement pms_p_pl_mu_member_Nsm_MemberNameSelectMr;

	@FindBy(xpath = "//input[@id='rc_memname']")
	private WebElement pms_p_pl_mu_member_Nsm_MemberName;

	@FindBy(xpath = "//div[@class='checkbox-inline i-checks']//label[1]")
	private WebElement pms_p_pl_mu_member_Nsm_GenderClickMale;

	@FindBy(xpath = "//div[@class='checkbox-inline i-checks']//label[2]")
	private WebElement pms_p_pl_mu_member_Nsm_GenderClickFemale;

	@FindBy(xpath = "//input[@id='rc_memdob']")
	private WebElement pms_p_pl_mu_member_Nsm_DateofBirth;

	@FindBy(xpath = "//input[@id='rc_mememail']")
	private WebElement pms_p_pl_mu_member_Nsm_Email;

	@FindBy(xpath = "//input[@id='rc_memmobile']")
	private WebElement pms_p_pl_mu_member_Nsm_MobileNumber;

	@FindBy(xpath = "//select[@id='rc_relationid']")
	private WebElement pms_p_pl_mu_member_Nsm_RelationshipSelect;

	@FindBy(xpath = "//input[@id='rc_designation']")
	private WebElement pms_p_pl_mu_member_Nsm_Designation;

	@FindBy(xpath = "//input[@id='rc_memLocation']")
	private WebElement pms_p_pl_mu_member_Nsm_Location;

	@FindBy(xpath = "//input[@id='rc_memdoj']")
	private WebElement pms_p_pl_mu_member_Nsm_DateOfJoin;

	@FindBy(xpath = "//input[@id='rc_memdoc']")
	private WebElement pms_p_pl_mu_member_Nsm_DOC;

	@FindBy(xpath = "//select[@id='rc_suminsurd']")
	private WebElement pms_p_pl_mu_member_Nsm_SumInsuredSelect;

	@FindBy(xpath = "//input[@id='rc_memberpremium']")
	private WebElement pms_p_pl_mu_member_Nsm_MemberPremiumAmount;

	@FindBy(xpath = "//input[@id='rc_gstamount']")
	private WebElement pms_p_pl_mu_member_Nsm_GSTAmount;

	@FindBy(xpath = "//input[@id='rc_nominee_fname']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeFirstName;

	@FindBy(xpath = "//input[@id='rc_nominee_lname']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeLastName;

	@FindBy(xpath = "//input[@id='rc_nominee_mobile']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeMobileNo;

	@FindBy(xpath = "//input[@id='rc_nominee_email']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeEmail;

	@FindBy(xpath = "//input[@id='rc_nominee_dob']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeDateofBirth;

	@FindBy(xpath = "//select[@id='rc_nominee_relation']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeRelationshipSelect;

	@FindBy(xpath = "//textarea[@id='rc_nominee_add1']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeAddress1;

	@FindBy(xpath = "//textarea[@id='rc_nominee_add2']")
	private WebElement pms_p_pl_mu_member_Nsm_NomineeAddress2;

	@FindBy(xpath = "//button[@id='Claimsource_close']")
	private WebElement pms_p_pl_mu_member_Nsm_CloseBtn;

	@FindBy(xpath = "//button[@id='member_save']")
	private WebElement pms_p_pl_mu_member_Nsm_SaveBtn;

	public WebElement getPms_p_pl_mu_members_NewSelfMemberBtn() {
		return pms_p_pl_mu_members_NewSelfMemberBtn;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_EmployeeCode() {
		return pms_p_pl_mu_member_Nsm_EmployeeCode;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_MemberNameSelectMr() {
		return pms_p_pl_mu_member_Nsm_MemberNameSelectMr;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_MemberName() {
		return pms_p_pl_mu_member_Nsm_MemberName;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_GenderClickMale() {
		return pms_p_pl_mu_member_Nsm_GenderClickMale;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_GenderClickFemale() {
		return pms_p_pl_mu_member_Nsm_GenderClickFemale;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_DateofBirth() {
		return pms_p_pl_mu_member_Nsm_DateofBirth;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_Email() {
		return pms_p_pl_mu_member_Nsm_Email;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_MobileNumber() {
		return pms_p_pl_mu_member_Nsm_MobileNumber;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_RelationshipSelect() {
		return pms_p_pl_mu_member_Nsm_RelationshipSelect;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_Designation() {
		return pms_p_pl_mu_member_Nsm_Designation;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_Location() {
		return pms_p_pl_mu_member_Nsm_Location;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_DateOfJoin() {
		return pms_p_pl_mu_member_Nsm_DateOfJoin;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_DOC() {
		return pms_p_pl_mu_member_Nsm_DOC;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_SumInsuredSelect() {
		return pms_p_pl_mu_member_Nsm_SumInsuredSelect;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_MemberPremiumAmount() {
		return pms_p_pl_mu_member_Nsm_MemberPremiumAmount;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_GSTAmount() {
		return pms_p_pl_mu_member_Nsm_GSTAmount;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeFirstName() {
		return pms_p_pl_mu_member_Nsm_NomineeFirstName;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeLastName() {
		return pms_p_pl_mu_member_Nsm_NomineeLastName;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeMobileNo() {
		return pms_p_pl_mu_member_Nsm_NomineeMobileNo;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeEmail() {
		return pms_p_pl_mu_member_Nsm_NomineeEmail;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeDateofBirth() {
		return pms_p_pl_mu_member_Nsm_NomineeDateofBirth;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeRelationshipSelect() {
		return pms_p_pl_mu_member_Nsm_NomineeRelationshipSelect;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeAddress1() {
		return pms_p_pl_mu_member_Nsm_NomineeAddress1;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_NomineeAddress2() {
		return pms_p_pl_mu_member_Nsm_NomineeAddress2;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_CloseBtn() {
		return pms_p_pl_mu_member_Nsm_CloseBtn;
	}

	public WebElement getPms_p_pl_mu_member_Nsm_SaveBtn() {
		return pms_p_pl_mu_member_Nsm_SaveBtn;
	}

	// ..........All Members List Button.....................//

	@FindBy(xpath = "//button[@id='all-members-list']")
	private WebElement pms_p_pl_mu_members_AllMembersListBtn;

	public WebElement getPms_p_pl_mu_members_AllMembersListBtn() {
		return pms_p_pl_mu_members_AllMembersListBtn;
	}

	// ...........After Click Deletion Pending List..............//

	@FindBy(xpath = "//a[normalize-space()='Deletion Pending List']")
	private WebElement pms_p_pl_mu_DeletionPendingListClick;

	@FindBy(xpath = "//*[@id=\"mui-1\"]")
	private WebElement pms_p_pl_mu_Dpl_RowsperpageSelcet;

	@FindBy(xpath = "//button[normalize-space()='View Members']")
	private WebElement pms_p_pl_mu_Dpl_ViewMembersBtn;

	@FindBy(xpath = "//button[normalize-space()='Back']")
	private WebElement pms_p_pl_mu_Dpl_BackBtn;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement pms_p_pl_mu_Dpl_ClickNextBtn;

	@FindBy(xpath = "//input[@id='filled-required']")
	private WebElement pms_p_pl_mu_Dpl_NextBtnPopupComments;

	@FindBy(xpath = "//button[normalize-space()='close']")
	private WebElement pms_p_pl_mu_Dpl_NextBtnpopupClosebtn;

	@FindBy(xpath = "//button[normalize-space()='Reject']")
	private WebElement pms_p_pl_mu_Dpl_NextBtnpopupRejectBtn;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	private WebElement pms_p_pl_mu_Dpl_NextBtnpopupApproveBtn;

	public WebElement getPms_p_pl_mu_Dpl_RowsperpageSelcet() {
		return pms_p_pl_mu_Dpl_RowsperpageSelcet;
	}

	public WebElement getPms_p_pl_mu_Dpl_ViewMembersBtn() {
		return pms_p_pl_mu_Dpl_ViewMembersBtn;
	}

	public WebElement getPms_p_pl_mu_Dpl_BackBtn() {
		return pms_p_pl_mu_Dpl_BackBtn;
	}

	public WebElement getPms_p_pl_mu_Dpl_ClickNextBtn() {
		return pms_p_pl_mu_Dpl_ClickNextBtn;
	}

	public WebElement getPms_p_pl_mu_Dpl_NextBtnPopupComments() {
		return pms_p_pl_mu_Dpl_NextBtnPopupComments;
	}

	public WebElement getPms_p_pl_mu_Dpl_NextBtnpopupClosebtn() {
		return pms_p_pl_mu_Dpl_NextBtnpopupClosebtn;
	}

	public WebElement getPms_p_pl_mu_Dpl_NextBtnpopupRejectBtn() {
		return pms_p_pl_mu_Dpl_NextBtnpopupRejectBtn;
	}

	public WebElement getPms_p_pl_mu_Dpl_NextBtnpopupApproveBtn() {
		return pms_p_pl_mu_Dpl_NextBtnpopupApproveBtn;
	}

	public WebElement getPms_p_pl_mu_DeletionPendingListClick() {
		return pms_p_pl_mu_DeletionPendingListClick;
	}

	// .......Common for All After Click Member Upload Button.........//
	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement pms_p_pl_mu_BackBtn;

	@FindBy(xpath = "//select[@name='rc_exceltable_length']")
	private WebElement pms_p_pl_mu_ShowSelect;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement pms_p_pl_mu_SearchBox;

	@FindBy(xpath = "//button[@id='rc_cancel_file']")
	private WebElement pms_p_pl_mu_CancelBtn;

	@FindBy(xpath = "//button[@id='upload_data']")
	private WebElement pms_p_pl_mu_SendApprovalBtn;

	@FindBy(xpath = "//button[@class='cancel']")
	private WebElement pms_p_pl_mu_SendApprovalCancelBtn;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement pms_p_pl_mu_SendApprovalYesBtn;

	public WebElement getPms_p_pl_mu_BackBtn() {
		return pms_p_pl_mu_BackBtn;
	}

	public WebElement getPms_p_pl_mu_ShowSelect() {
		return pms_p_pl_mu_ShowSelect;
	}

	public WebElement getPms_p_pl_mu_SearchBox() {
		return pms_p_pl_mu_SearchBox;
	}

	public WebElement getPms_p_pl_mu_CancelBtn() {
		return pms_p_pl_mu_CancelBtn;
	}

	public WebElement getPms_p_pl_mu_SendApprovalBtn() {
		return pms_p_pl_mu_SendApprovalBtn;
	}

	public WebElement getPms_p_pl_mu_SendApprovalCancelBtn() {
		return pms_p_pl_mu_SendApprovalCancelBtn;
	}

	public WebElement getPms_p_pl_mu_SendApprovalYesBtn() {
		return pms_p_pl_mu_SendApprovalYesBtn;
	}

	// close membersupload button }//

	// ....Policies Data.(pd).///

	@FindBy(xpath = "//a[normalize-space()='Policies Data']")
	private WebElement pmspoliciesData;

	@FindBy(xpath = "//span[@class='slider round']")
	private WebElement pms_pd_ClickToComboReport;

	@FindBy(xpath = "//input[@id='search_fromdatetime']")
	private WebElement pms_pd_FromDate;

	@FindBy(xpath = "//input[@id='search_todatetime']")
	private WebElement pms_pd_ToDate;

	@FindBy(xpath = "//button[@id='policy_reports']")
	private WebElement pms_pd_ClickOkBtn;

	@FindBy(xpath = "//button[@id='btn_coi']")
	private WebElement pms_pd_DownloadCoiBtn;

	@FindBy(xpath = "//button[@id='btn_healthcard']")
	private WebElement pms_pd_DownloadHealthCardBtn;

	@FindBy(xpath = "//button[@id='btn_AuthLetter']")
	private WebElement pms_pd_DownloadAuthorizationLetterBtn;

	@FindBy(xpath = "//button[@id='generate_healthcard']")
	private WebElement pms_pd_GenerateHealthCardBtn;

	@FindBy(xpath = "//button[@id='create_coi']")
	private WebElement pms_pd_ReGenerateCoiBtn;

	@FindBy(xpath = "//button[@id='create_Authorization']")
	private WebElement pms_pd_ReGenerateAuthorizationLetterBtn;

	@FindBy(xpath = "//button[@id='generate_AuthLetter']")
	private WebElement pms_pd_GenerateAuthorizationLetterBtn;

	@FindBy(xpath = "//button[@id='download_comboCOI']")
	private WebElement pms_pd_DownloadMembershipCertificateBtn;

	@FindBy(xpath = "//button[@id='generate_comboCOI']")
	private WebElement pms_pd_GenerateMembershipCertificateBtn;

	@FindBy(xpath = "//button[@id='btn_memberform']")
	private WebElement pms_pd_DownloadMemberFormsBtn;

	@FindBy(xpath = "//button[@id='create_memberform']")
	private WebElement pms_pd_ReGenerateMemberFormsBtn;

	@FindBy(xpath = "//button[@id='generate_memberform']")
	private WebElement pms_pd_GenerateMemberFormsBtn;

	public WebElement getPmspoliciesData() {
		return pmspoliciesData;
	}

	public WebElement getPms_pd_ClickToComboReport() {
		return pms_pd_ClickToComboReport;
	}

	public WebElement getPms_pd_FromDate() {
		return pms_pd_FromDate;
	}

	public WebElement getPms_pd_ToDate() {
		return pms_pd_ToDate;
	}

	public WebElement getPms_pd_ClickOkBtn() {
		return pms_pd_ClickOkBtn;
	}

	public WebElement getPms_pd_DownloadCoiBtn() {
		return pms_pd_DownloadCoiBtn;
	}

	public WebElement getPms_pd_DownloadHealthCardBtn() {
		return pms_pd_DownloadHealthCardBtn;
	}

	public WebElement getPms_pd_DownloadAuthorizationLetterBtn() {
		return pms_pd_DownloadAuthorizationLetterBtn;
	}

	public WebElement getPms_pd_GenerateHealthCardBtn() {
		return pms_pd_GenerateHealthCardBtn;
	}

	public WebElement getPms_pd_ReGenerateCoiBtn() {
		return pms_pd_ReGenerateCoiBtn;
	}

	public WebElement getPms_pd_ReGenerateAuthorizationLetterBtn() {
		return pms_pd_ReGenerateAuthorizationLetterBtn;
	}

	public WebElement getPms_pd_GenerateAuthorizationLetterBtn() {
		return pms_pd_GenerateAuthorizationLetterBtn;
	}

	public WebElement getPms_pd_DownloadMembershipCertificateBtn() {
		return pms_pd_DownloadMembershipCertificateBtn;
	}

	public WebElement getPms_pd_GenerateMembershipCertificateBtn() {
		return pms_pd_GenerateMembershipCertificateBtn;
	}

	public WebElement getPms_pd_DownloadMemberFormsBtn() {
		return pms_pd_DownloadMemberFormsBtn;
	}

	public WebElement getPms_pd_ReGenerateMemberFormsBtn() {
		return pms_pd_ReGenerateMemberFormsBtn;
	}

	public WebElement getPms_pd_GenerateMemberFormsBtn() {
		return pms_pd_GenerateMemberFormsBtn;
	}

	@FindBy(xpath = "//button[@id='generate_coi']")
	private WebElement pms_pd_GenerateCoiBtn;

	public WebElement getPms_pd_GenerateCoiBtn() {
		return pms_pd_GenerateCoiBtn;
	}

	// ..After Click pdGenerateCoiBtn....//

	@FindBy(xpath = "//div[@id='email_option_model']//div[@id='coi_form']//div[1]//div[1]//label[1]//div[1]//ins[1]")
	private WebElement pms_pd_GenerateCoipopupSendEmail;

	@FindBy(css = "body > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > ins:nth-child(2)")
	private WebElement pms_pd_GenerateCoipopupSendSms;

	@FindBy(xpath = "//button[@id='Cois_create']")
	private WebElement pms_pd_GenerateCoipopupContinue;

	@FindBy(xpath = "//button[@id='email_option_close']//span[@aria-hidden='true'][normalize-space()='×']")
	private WebElement pms_pd_CloseGenerateCoiPopup;

	public WebElement getPms_pd_GenerateCoipopupSendEmail() {
		return pms_pd_GenerateCoipopupSendEmail;
	}

	public WebElement getPms_pd_GenerateCoipopupSendSms() {
		return pms_pd_GenerateCoipopupSendSms;
	}

	public WebElement getPms_pd_GenerateCoipopupContinue() {
		return pms_pd_GenerateCoipopupContinue;
	}

	public WebElement getPms_pd_CloseGenerateCoiPopup() {
		return pms_pd_CloseGenerateCoiPopup;
	}

	// ...Policies Update..(pu).//

	@FindBy(xpath = "//a[normalize-space()='Policies Update']")
	private WebElement pmsPoliciesUpdate;

	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement pms_pu_BrowseBtnUploadXlsx;

	public WebElement getPmsPoliciesUpdate() {
		return pmsPoliciesUpdate;
	}

	public WebElement getPms_pu_BrowseBtnUploadXlsx() {
		return pms_pu_BrowseBtnUploadXlsx;
	}

	// ...Service Policies Upload..(spu).//

	@FindBy(xpath = "//a[normalize-space()='Service Policies Upload']")
	private WebElement pmsServicePoliciesUpload;

	@FindBy(id = "select2-productplanid-container")
	private WebElement pms_spu_ProductPlanSpan;

	public WebElement getPmsServicePoliciesUpload() {
		return pmsServicePoliciesUpload;
	}

	public WebElement getPms_spu_ProductPlanSpan() {
		return pms_spu_ProductPlanSpan;
	}

	// ...Retail Renewal Report.(rrr).//

	@FindBy(xpath = "//a[normalize-space()='Retail Renewal']")
	private WebElement pmsRetailRenewal;

	@FindBy(id = "search_expirydatetime")
	private WebElement pms_rrr_PolicyExpityDate;

	public WebElement getPmsRetailRenewal() {
		return pmsRetailRenewal;
	}

	public WebElement getPms_rrr_PolicyExpityDate() {
		return pms_rrr_PolicyExpityDate;
	}

	// ...After Click Renew Button....//

	// ..Policy Details.(pd).//

	@FindBy(xpath = "//a[normalize-space()='Policy Details']")
	private WebElement pms_rrr_PolicyDetailsClick;

	@FindBy(xpath = "//select[@id='r_insurance']")
	private WebElement pms_rrr_pd_InsuranceCompanySelect;

	@FindBy(xpath = "//input[@id='r_insu_location']")
	private WebElement pms_rrr_pd_InsuranceCompanyLocation;

	@FindBy(xpath = "//input[@id='r_pro_name']")
	private WebElement pms_rrr_pd_ProductName;

	@FindBy(xpath = "//select[@id='r_policy_type']")
	private WebElement pms_rrr_pd_PolicyTypeSelect;

	@FindBy(xpath = "//div[@class='iradio_square-green checked']//ins[@class='iCheck-helper']")
	private WebElement pms_rrr_pd_IsRenewableClickYes;

	@FindBy(xpath = "//div[@class='iradio_square-green']//ins[@class='iCheck-helper']")
	private WebElement pms_rrr_pd_IsRenewableClickNo;

	@FindBy(xpath = "//input[@id='r_policy_number']")
	private WebElement pms_rrr_pd_PolicyNumber;

	@FindBy(xpath = "//input[@id='r_start_date']")
	private WebElement pms_rrr_pd_PolicyStartDate;

	@FindBy(xpath = "//input[@id='r_end_date']")
	private WebElement pms_rrr_pd_PolicyEndDate;

	@FindBy(xpath = "//input[@id='r_issuance_date']")
	private WebElement pms_rrr_pd_PolicyIssuanceDate;

	@FindBy(xpath = "//input[@id='r_policy_term']")
	private WebElement pms_rrr_pd_PolicyTerm;

	@FindBy(xpath = "//select[@id='r_referance']")
	private WebElement pms_rrr_pd_ReferanceTypeSelect;

	@FindBy(xpath = "//input[@id='r_ref_name']")
	private WebElement pms_rrr_pd_RefName;

	@FindBy(xpath = "//input[@id='r_ref_mobile']")
	private WebElement pms_rrr_pd_RefMobileNo;

	@FindBy(xpath = "//input[@id='r_ref_email']")
	private WebElement pms_rrr_pd_RefEmail;

	@FindBy(xpath = "//select[@id='r_salesmanager']")
	private WebElement pms_rrr_pd_SalesManagerSelect;

	@FindBy(xpath = "//select[@id='r_bop']")
	private WebElement pms_rrr_pd_BOPSelect;

	@FindBy(xpath = "//select[@id='r_regionalmanager']")
	private WebElement pms_rrr_pd_RegionalManagerSelect;

	@FindBy(xpath = "//select[@id='r_telecaller']")
	private WebElement pms_rrr_pd_TeleCaller;

	@FindBy(xpath = "//input[@id='r_transaction_date']")
	private WebElement pms_rrr_pd_DateOfTransaction;

	@FindBy(xpath = "//textarea[@id='r_coverages']")
	private WebElement pms_rrr_pd_PolicyCoverages;

	@FindBy(xpath = "//input[@id='coi_file_path_cor']")
	private WebElement pms_rrr_pd_CoiChooseFile;

	@FindBy(xpath = "//select[@id='rc_tpa']")
	private WebElement pms_rrr_pd_TPASelect;

	@FindBy(xpath = "//input[@placeholder='TPA%']")
	private WebElement pms_rrr_pd_TPAPercentage;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement pms_rrr_pd_ContactName;

	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	private WebElement pms_rrr_pd_ContactMobile;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement pms_rrr_pd_ContactEmail;

	@FindBy(xpath = "//button[@id='btnaddtparow']")
	private WebElement pms_rrr_pd_TPADetailsAddNewBtn;

	@FindBy(xpath = "//button[contains(@class,'remove')]")
	private WebElement pms_rrr_pd_TPADetailsRemoveBtn;

	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement pms_rrr_pd_Title;

	@FindBy(xpath = "//input[@placeholder='Remarks']")
	private WebElement pms_rrr_pd_Remarks;

	@FindBy(xpath = "//input[@name='RC_policydocuments']")
	private WebElement pms_rrr_pd_PolicyDocumentFileBrowse;

	@FindBy(xpath = "//button[@id='btnadddocumentrow']")
	private WebElement pms_rrr_pd_PolicyDocumentsAddNewBtn;

	@FindBy(xpath = "//tr[@id='brokerdetails_0']//button[contains(@class,'remove')]")
	private WebElement pms_rrr_pd_PolicyDocumentsRemoveBtn;

	@FindBy(xpath = "//button[@id='btn-save']")
	private WebElement pms_rrr_pd_SaveBtn;

	public WebElement getPms_rrr_PolicyDetailsClick() {
		return pms_rrr_PolicyDetailsClick;
	}

	public WebElement getPms_rrr_pd_InsuranceCompanySelect() {
		return pms_rrr_pd_InsuranceCompanySelect;
	}

	public WebElement getPms_rrr_pd_InsuranceCompanyLocation() {
		return pms_rrr_pd_InsuranceCompanyLocation;
	}

	public WebElement getPms_rrr_pd_ProductName() {
		return pms_rrr_pd_ProductName;
	}

	public WebElement getPms_rrr_pd_PolicyTypeSelect() {
		return pms_rrr_pd_PolicyTypeSelect;
	}

	public WebElement getPms_rrr_pd_IsRenewableClickYes() {
		return pms_rrr_pd_IsRenewableClickYes;
	}

	public WebElement getPms_rrr_pd_IsRenewableClickNo() {
		return pms_rrr_pd_IsRenewableClickNo;
	}

	public WebElement getPms_rrr_pd_PolicyNumber() {
		return pms_rrr_pd_PolicyNumber;
	}

	public WebElement getPms_rrr_pd_PolicyStartDate() {
		return pms_rrr_pd_PolicyStartDate;
	}

	public WebElement getPms_rrr_pd_PolicyEndDate() {
		return pms_rrr_pd_PolicyEndDate;
	}

	public WebElement getPms_rrr_pd_PolicyIssuanceDate() {
		return pms_rrr_pd_PolicyIssuanceDate;
	}

	public WebElement getPms_rrr_pd_PolicyTerm() {
		return pms_rrr_pd_PolicyTerm;
	}

	public WebElement getPms_rrr_pd_ReferanceTypeSelect() {
		return pms_rrr_pd_ReferanceTypeSelect;
	}

	public WebElement getPms_rrr_pd_RefName() {
		return pms_rrr_pd_RefName;
	}

	public WebElement getPms_rrr_pd_RefMobileNo() {
		return pms_rrr_pd_RefMobileNo;
	}

	public WebElement getPms_rrr_pd_RefEmail() {
		return pms_rrr_pd_RefEmail;
	}

	public WebElement getPms_rrr_pd_SalesManagerSelect() {
		return pms_rrr_pd_SalesManagerSelect;
	}

	public WebElement getPms_rrr_pd_BOPSelect() {
		return pms_rrr_pd_BOPSelect;
	}

	public WebElement getPms_rrr_pd_RegionalManagerSelect() {
		return pms_rrr_pd_RegionalManagerSelect;
	}

	public WebElement getPms_rrr_pd_TeleCaller() {
		return pms_rrr_pd_TeleCaller;
	}

	public WebElement getPms_rrr_pd_DateOfTransaction() {
		return pms_rrr_pd_DateOfTransaction;
	}

	public WebElement getPms_rrr_pd_PolicyCoverages() {
		return pms_rrr_pd_PolicyCoverages;
	}

	public WebElement getPms_rrr_pd_CoiChooseFile() {
		return pms_rrr_pd_CoiChooseFile;
	}

	public WebElement getPms_rrr_pd_TPASelect() {
		return pms_rrr_pd_TPASelect;
	}

	public WebElement getPms_rrr_pd_TPAPercentage() {
		return pms_rrr_pd_TPAPercentage;
	}

	public WebElement getPms_rrr_pd_ContactName() {
		return pms_rrr_pd_ContactName;
	}

	public WebElement getPms_rrr_pd_ContactMobile() {
		return pms_rrr_pd_ContactMobile;
	}

	public WebElement getPms_rrr_pd_ContactEmail() {
		return pms_rrr_pd_ContactEmail;
	}

	public WebElement getPms_rrr_pd_TPADetailsAddNewBtn() {
		return pms_rrr_pd_TPADetailsAddNewBtn;
	}

	public WebElement getPms_rrr_pd_TPADetailsRemoveBtn() {
		return pms_rrr_pd_TPADetailsRemoveBtn;
	}

	public WebElement getPms_rrr_pd_Title() {
		return pms_rrr_pd_Title;
	}

	public WebElement getPms_rrr_pd_Remarks() {
		return pms_rrr_pd_Remarks;
	}

	public WebElement getPms_rrr_pd_PolicyDocumentFileBrowse() {
		return pms_rrr_pd_PolicyDocumentFileBrowse;
	}

	public WebElement getPms_rrr_pd_PolicyDocumentsAddNewBtn() {
		return pms_rrr_pd_PolicyDocumentsAddNewBtn;
	}

	public WebElement getPms_rrr_pd_PolicyDocumentsRemoveBtn() {
		return pms_rrr_pd_PolicyDocumentsRemoveBtn;
	}

	public WebElement getPms_rrr_pd_SaveBtn() {
		return pms_rrr_pd_SaveBtn;
	}

	// ....Members Details....(md).//

	@FindBy(xpath = "//a[normalize-space()='Members Details']")
	private WebElement pms_rrr_MemberDetailsClick;

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement pms_rrr_md_FirstName;

	@FindBy(xpath = "//input[@id='laname']")
	private WebElement pms_rrr_md_LastName;

	@FindBy(xpath = "//input[@id='nommobile']")
	private WebElement pms_rrr_md_MobileNo;

	@FindBy(xpath = "//input[@id='nomemail']")
	private WebElement pms_rrr_md_Email;

	@FindBy(xpath = "//input[@id='nomineedob']")
	private WebElement pms_rrr_md_DateofBirth;

	@FindBy(xpath = "//select[@id='nomrelation']")
	private WebElement pms_rrr_md_RelationShipSelect;

	@FindBy(xpath = "//textarea[@id='nomaddress1']")
	private WebElement pms_rrr_md_Address1;

	@FindBy(xpath = "//textarea[@id='nomaddress2']")
	private WebElement pms_rrr_md_Address2;

	public WebElement getPms_rrr_MemberDetailsClick() {
		return pms_rrr_MemberDetailsClick;
	}

	public WebElement getPms_rrr_md_FirstName() {
		return pms_rrr_md_FirstName;
	}

	public WebElement getPms_rrr_md_LastName() {
		return pms_rrr_md_LastName;
	}

	public WebElement getPms_rrr_md_MobileNo() {
		return pms_rrr_md_MobileNo;
	}

	public WebElement getPms_rrr_md_Email() {
		return pms_rrr_md_Email;
	}

	public WebElement getPms_rrr_md_DateofBirth() {
		return pms_rrr_md_DateofBirth;
	}

	public WebElement getPms_rrr_md_RelationShipSelect() {
		return pms_rrr_md_RelationShipSelect;
	}

	public WebElement getPms_rrr_md_Address1() {
		return pms_rrr_md_Address1;
	}

	public WebElement getPms_rrr_md_Address2() {
		return pms_rrr_md_Address2;
	}

	// ..Coverage And Premium Details..(cpd)...//

	@FindBy(xpath = "//a[normalize-space()='Coverage and Premium Details']")
	private WebElement pms_rrr_CoverageAndPremiumDetailsClick;

	@FindBy(id = "expenseclaim")
	private WebElement pms_rrr_cpd_PolicyCoverageDetailsTitle;

	@FindBy(xpath = "//td[@class='td_amount']//input[@id='expenseamount']")
	private WebElement pms_rrr_cpd_PolicyCoverageDetailsAmount;

	@FindBy(xpath = "//button[@id='btnaddexpanserow']")
	private WebElement pms_rrr_cpd_PolicyCoverageDetailsAddNewRowBtn;

	@FindBy(xpath = "//tr[@id='valuation_0']//button[contains(@class,'remove')]")
	private WebElement pms_rrr_cpd_PolicyCoverageDetailsRemoveRowBtn;

	@FindBy(xpath = "//tr[@id='premiumdetails_1']//input[contains(@placeholder,'Coverage')]")
	private WebElement pms_rrr_cpd_PremiumDetailsTitle;

	@FindBy(xpath = "//tr[@id='premiumdetails_1']//input[contains(@placeholder,'Description')]")
	private WebElement pms_rrr_cpd_Description;

	@FindBy(xpath = "//tr[@id='premiumdetails_1']//input[contains(@placeholder,'Premium Rate')]")
	private WebElement pms_rrr_cpd_PremiumRate;

	@FindBy(xpath = "//tr[@id='premiumdetails_1']//td[@class='td_gst']//input[@name='Share']")
	private WebElement pms_rrr_cpd_GSTPrecentage;

	@FindBy(xpath = "//tr[@id='premiumdetails_1']//td[contains(@class,'td_gstamount')]//input[contains(@name,'Share')]")
	private WebElement pms_rrr_cpd_GSTAmount;

	@FindBy(xpath = "//tr[@id='premiumdetails_1']//td[contains(@class,'td_netpremium')]//input[contains(@name,'Share')]")
	private WebElement pms_rrr_cpd_NetPremium;

	@FindBy(xpath = "//button[@id='btnaddpremiumrow']")
	private WebElement pms_rrr_cpd_PremiumDetailsAddNewRowBtn;

	@FindBy(xpath = "//tr[@id='premiumdetails_0']//button[contains(@class,'remove')]")
	private WebElement pms_rrr_cpd_PremiumDetailsRemoveBtn;

	@FindBy(xpath = "//tr[@id='discountdetails_1']//input[@id='expenseclaim']")
	private WebElement pms_rrr_cpd_DiscountDetailsTitle;

	@FindBy(xpath = "//tr[@id='discountdetails_1']//input[@id='expenseamount']")
	private WebElement pms_rrr_cpd_DiscountDetailsAmount;

	@FindBy(xpath = "//button[@id='btndiscountrow']")
	private WebElement pms_rrr_cpd_DiscountDetailsAddNewRowBtn;

	@FindBy(xpath = "//tr[@id='discountdetails_0']//button[1]")
	private WebElement pms_rrr_cpd_DiscountDetailsRemoveRowBtn;

	public WebElement getPms_rrr_CoverageAndPremiumDetailsClick() {
		return pms_rrr_CoverageAndPremiumDetailsClick;
	}

	public WebElement getPms_rrr_cpd_PolicyCoverageDetailsTitle() {
		return pms_rrr_cpd_PolicyCoverageDetailsTitle;
	}

	public WebElement getPms_rrr_cpd_PolicyCoverageDetailsAmount() {
		return pms_rrr_cpd_PolicyCoverageDetailsAmount;
	}

	public WebElement getPms_rrr_cpd_PolicyCoverageDetailsAddNewRowBtn() {
		return pms_rrr_cpd_PolicyCoverageDetailsAddNewRowBtn;
	}

	public WebElement getPms_rrr_cpd_PolicyCoverageDetailsRemoveRowBtn() {
		return pms_rrr_cpd_PolicyCoverageDetailsRemoveRowBtn;
	}

	public WebElement getPms_rrr_cpd_PremiumDetailsTitle() {
		return pms_rrr_cpd_PremiumDetailsTitle;
	}

	public WebElement getPms_rrr_cpd_Description() {
		return pms_rrr_cpd_Description;
	}

	public WebElement getPms_rrr_cpd_PremiumRate() {
		return pms_rrr_cpd_PremiumRate;
	}

	public WebElement getPms_rrr_cpd_GSTPrecentage() {
		return pms_rrr_cpd_GSTPrecentage;
	}

	public WebElement getPms_rrr_cpd_GSTAmount() {
		return pms_rrr_cpd_GSTAmount;
	}

	public WebElement getPms_rrr_cpd_NetPremium() {
		return pms_rrr_cpd_NetPremium;
	}

	public WebElement getPms_rrr_cpd_PremiumDetailsAddNewRowBtn() {
		return pms_rrr_cpd_PremiumDetailsAddNewRowBtn;
	}

	public WebElement getPms_rrr_cpd_PremiumDetailsRemoveBtn() {
		return pms_rrr_cpd_PremiumDetailsRemoveBtn;
	}

	public WebElement getPms_rrr_cpd_DiscountDetailsTitle() {
		return pms_rrr_cpd_DiscountDetailsTitle;
	}

	public WebElement getPms_rrr_cpd_DiscountDetailsAmount() {
		return pms_rrr_cpd_DiscountDetailsAmount;
	}

	public WebElement getPms_rrr_cpd_DiscountDetailsAddNewRowBtn() {
		return pms_rrr_cpd_DiscountDetailsAddNewRowBtn;
	}

	public WebElement getPms_rrr_cpd_DiscountDetailsRemoveRowBtn() {
		return pms_rrr_cpd_DiscountDetailsRemoveRowBtn;
	}

	// ...Policies Renewal Report..(prr).//

	@FindBy(xpath = "//a[normalize-space()='Renewal Report']")
	private WebElement pmsRenewalReport;

	@FindBy(id = "select2-businesstypeid-container")
	private WebElement pms_prr_BusinessTypeSpan;

	@FindBy(xpath = "//input[@id='filter_customerid']")
	private WebElement pms_prr_CustomerId;

	@FindBy(xpath = "//input[@id='filter_mobileno']")
	private WebElement pms_prr_MobileNo;

	@FindBy(xpath = "//input[@id='filter_Email']")
	private WebElement pms_prr_Email;

	public WebElement getPmsRenewalReport() {
		return pmsRenewalReport;
	}

	public WebElement getPms_prr_BusinessTypeSpan() {
		return pms_prr_BusinessTypeSpan;
	}

	public WebElement getPms_prr_CustomerId() {
		return pms_prr_CustomerId;
	}

	public WebElement getPms_prr_MobileNo() {
		return pms_prr_MobileNo;
	}

	public WebElement getPms_prr_Email() {
		return pms_prr_Email;
	}

	// ..Policies Bulk Upload Status..(pbus).//

	@FindBy(xpath = "//a[normalize-space()='Policies Bulk Upload Status']")
	private WebElement pmsPoliciesBulkUploadStatus;

	public WebElement getPmsPoliciesBulkUploadStatus() {
		return pmsPoliciesBulkUploadStatus;
	}

	// ..Common for Pms All sub modules ..//

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement pmsEntriesDataDownloadInExcel;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement pmsShowDropDownSelectTag;

	@FindBy(id = "//select[@id='orgid']")
	private WebElement pmsOrganizationSpan;

	@FindBy(xpath = "//select[@id='inscompanyid']")
	private WebElement pmsInsuranceCompanySpan;

	@FindBy(xpath = "//select[@id='productid']")
	private WebElement pmsProductNameSpan;

	@FindBy(id = "segmentid" + "")
	private WebElement pmsSegmentSpan;

	@FindBy(id = "filter_status")
	private WebElement pmsStatusSpan;

	@FindBy(xpath = "//select[@id='segmentid']")
	private WebElement rr_Segment;

	@FindBy(id = "select2-filter_status-container")
	private WebElement rr_Status;

	public WebElement getRr_Status() {
		return rr_Status;
	}

	public WebElement getRr_Segment() {
		return rr_Segment;
	}

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement pmsApplyBtn;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement pmsResetBtn;

	@FindBy(xpath = "//button[@id='policies_btn']")
	private WebElement pmsOkBtn;

	@FindBy(xpath = "//input[@id='filter_customerid']")
	private WebElement pmsCustomerId;

	@FindBy(xpath = "//input[@id='filter_mobile']")
	private WebElement pmsMobileNo;

	@FindBy(xpath = "//input[@id='filter_mobileno']")
	private WebElement rr_pmsMobileNo;

	@FindBy(xpath = "//input[@id='filter_Email']")
	private WebElement rr_pmsEmail;

	public WebElement getRr_pmsEmail() {
		return rr_pmsEmail;
	}

	public WebElement getRr_pmsMobileNo() {
		return rr_pmsMobileNo;
	}

	@FindBy(xpath = "//input[@id='filter_mail']")
	private WebElement pmsEmail;

	@FindBy(xpath = "//input[@id='filter_coi']")
	private WebElement pmsCoiNo;

	@FindBy(id = "search_fromdatetime")
	private WebElement pmsFromDate;

	@FindBy(id = "search_todatetime")
	private WebElement pmsToDate;

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement pmsfilterArrowButton;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement pmsTextBoxForSpan;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement pmsExpandBtn;

	public WebElement getPmsExpandBtn() {
		return pmsExpandBtn;
	}

	public WebElement getPmsTextBoxForSpan() {
		return pmsTextBoxForSpan;
	}

	public WebElement getPmsShowDropDownSelectTag() {
		return pmsShowDropDownSelectTag;
	}

	public WebElement getPmsEntriesDataDownloadInExcel() {
		return pmsEntriesDataDownloadInExcel;
	}

	public WebElement getPmsOrganizationSpan() {
		return pmsOrganizationSpan;
	}

	public WebElement getPmsInsuranceCompanySpan() {
		return pmsInsuranceCompanySpan;
	}

	public WebElement getPmsProductNameSpan() {
		return pmsProductNameSpan;
	}

	public WebElement getPmsSegmentSpan() {
		return pmsSegmentSpan;
	}

	public WebElement getPmsStatusSpan() {
		return pmsStatusSpan;
	}

	public WebElement getPmsApplyBtn() {
		return pmsApplyBtn;
	}

	public WebElement getPmsResetBtn() {
		return pmsResetBtn;
	}

	public WebElement getPmsOkBtn() {
		return pmsOkBtn;
	}

	public WebElement getPmsCustomerId() {
		return pmsCustomerId;
	}

	public WebElement getPmsMobileNo() {
		return pmsMobileNo;
	}

	public WebElement getPmsEmail() {
		return pmsEmail;
	}

	public WebElement getPmsCoiNo() {
		return pmsCoiNo;
	}

	public WebElement getPmsFromDate() {
		return pmsFromDate;
	}

	public WebElement getPmsToDate() {
		return pmsToDate;
	}

	public WebElement getPmsfilterArrowButton() {
		return pmsfilterArrowButton;
	}

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement Rr_showCount;

	public WebElement getRr_showCount() {
		return Rr_showCount;
	}

	public WebElement getRr_Excel() {
		return Rr_Excel;
	}

	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[4]/ul/li[2]/a")
	private WebElement Renewal_Report;

	public WebElement getPmPolicieslistviewbtn() {
		return pmPolicieslistviewbtn;
	}

	public WebElement getPmPolicieslisthomebtn() {
		return pmPolicieslisthomebtn;
	}

	public WebElement getPmExpiredPolicieslistviewbtn() {
		return pmExpiredPolicieslistviewbtn;
	}

	public WebElement getRenewal_Report() {
		return Renewal_Report;
	}

//------------------------------

	@FindBy(xpath = "//a[@id='btn_AddClaimReason']")
	private WebElement Newclaimbtn;

	@FindBy(xpath = "//a[normalize-space()='COI']")
	private WebElement ClaimCOI;

	@FindBy(xpath = "//select[@id='patient_name']")
	private WebElement ClaimPatientName;

	@FindBy(xpath = "//select[@id='occupationid']")
	private WebElement Claimoccupation;

	@FindBy(xpath = "//input[@id='city_patient']")
	private WebElement Claimcity;

	@FindBy(xpath = "//select[@id='stateid_patient']")
	private WebElement Claimstate;

	@FindBy(xpath = "//input[@id='pincode_patient']")
	private WebElement Claimspincode;

	@FindBy(xpath = "//select[@id='Source_Id']")
	private WebElement Claimsource;

	@FindBy(xpath = "//input[@id='claim_date_intimation']")
	private WebElement Claimintimationdate;

	@FindBy(xpath = "//input[@id='claim_amount']")
	private WebElement ClaimAmount;

	@FindBy(xpath = "//textarea[@id='userinsuredclaimcomments']")
	private WebElement Claimcomments;

	@FindBy(xpath = "//button[@id='btnSave_insuredetails']")
	private WebElement Claimintimationsavebtn;

	@FindBy(xpath = "//div[@class='stepwizard-row setup-panel']//div[2]")
	private WebElement Claimsubmissiontab;
	@FindBy(xpath = "//a[normalize-space()='Hospitalization Details']")
	private WebElement Hospitalizationdetails;
	@FindBy(xpath = "//input[@id='hospital_name']")
	private WebElement Claimsubmissionhospitalname;
	@FindBy(xpath = "//select[@id='roomcategoryid']")
	private WebElement Claimsubmissionroomcategory;
	@FindBy(xpath = "//select[@id='reasonid']")
	private WebElement Claimsubmissionreason;
	@FindBy(xpath = "//input[@id='date_injury']")
	private WebElement Claimsubmissiondateofinjury;
	@FindBy(xpath = "//input[@id='date_admission']")
	private WebElement Claimsubmissiondateofsubmission;
	@FindBy(xpath = "//input[@id='admission_time']")
	private WebElement Claimsubmissionadmissiontime;
	@FindBy(xpath = "//input[@id='date_discharge']")
	private WebElement Claimsubmissiondateofdischarge;
	@FindBy(xpath = "//input[@id='discharge_time']")
	private WebElement Claimsubmissiondischargetime;
	@FindBy(xpath = "//select[@id='injurycauseid']")
	private WebElement Claimsubmissioncauseofinjury;

	@FindBy(xpath = "//input[@id='medicine_system']")
	private WebElement Claimsubmissionsystemofmedicine;
	@FindBy(xpath = "//input[@id='date_surgery']")
	private WebElement Claimsubmissiondateofsurgery;
	@FindBy(xpath = "//select[@id='claimtypeid']")
	private WebElement Claimsubmissionclaimtype;
	@FindBy(xpath = "//input[@id='pre_hospitalization']")
	private WebElement Claimsubmissionprehospitalizationperiod;
	@FindBy(xpath = "//input[@id='post_hospitalization']")
	private WebElement Claimsubmissionposthospitalizationperiod;
	@FindBy(xpath = "//input[@id='reference_number']")
	private WebElement ClaimsubmissionClaimreferencenumber;
//	-------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//a[normalize-space()='Claim Details']")
	private WebElement Claimsubmissionclaimdetailstab;
	@FindBy(xpath = "//td[@class='td_expid']//input[@id='expenseclaim']")
	private WebElement Claimsubmissionclaimdetailstitle;
	@FindBy(xpath = "//input[@id='expenseamount']")
	private WebElement Claimsubmissionclaimdetailsexpenseamount;
	@FindBy(xpath = "//button[@id='btnaddexpanserow']")
	private WebElement Treatmentexpensesclaimedaddnewbtn;
	@FindBy(xpath = "//*[@id=\"brokerdetails_1\"]/td[4]/button")
	private WebElement Treatmentexpensesclaimedremovenewbtn;
	@FindBy(xpath = "//label[normalize-space()='Claim For Domiciliary Hospitalization']")
	private WebElement ClaimdetailsClaimForDomiciliaryHospitalizationcheckbox;
	@FindBy(xpath = "//td[@class='lumpcashexp']//input[@id='expenseclaim']")
	private WebElement ClaimsubmissionclaimdetailslumpsumcashbenefitclaimedTitle;
	@FindBy(xpath = "//input[@id='lumpamount']")
	private WebElement ClaimsubmissionclaimdetailslumpsumcashbenefitclaimedAmount;
	@FindBy(xpath = "//button[@id='btnaddexpansebillrow']")
	private WebElement ClaimsubmissionclaimdetailsDetailsofbillsenclosedAddnew;
	@FindBy(xpath = "//input[@id='billid']")
	private WebElement Claimsubmissionclaimdetailsbillno;
	@FindBy(xpath = "//input[@id='date_bill']")
	private WebElement Claimsubmissionclaimdetailsbilldate;
	@FindBy(xpath = "//input[@id='issuedby']")
	private WebElement ClaimsubmissionclaimdetailsIssuedby;
	@FindBy(xpath = "//input[@id='towards_hospitalization']")
	private WebElement Claimsubmissionclaimdetailshospitalization;
	@FindBy(xpath = "//input[@id='bill_amount']")
	private WebElement ClaimsubmissionclaimdetailsBillsEnclosedAmount;
	@FindBy(xpath = "//input[@class='claim_bill_documentInput empdocumentInp']")
	private WebElement ClaimsubmissionclaimdetailsdocumentBrowsebtn;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[4]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/button[1]")
	private WebElement Claimsubmissionclaimdetailsremovebtn;

	@FindBy(xpath = "//input[@id='pan_number']")
	private WebElement Claimsubmissionclaimdetailsprimaryinsuredbankdetailspannumber;

	@FindBy(xpath = "//input[@id='account_number']")
	private WebElement Claimsubmissionclaimdetailsprimaryinsuredbankdetailsaccountnumber;
	@FindBy(xpath = "//input[@id='bank_name']")
	private WebElement Claimsubmissionclaimdetailsprimaryinsuredbankdetailsbankname;

	@FindBy(xpath = "//input[@id='bank_branch']")
	private WebElement Claimsubmissionclaimdetailsprimaryinsuredbankdetailsbranchname;
	@FindBy(xpath = "//input[@id='check_dd']")
	private WebElement Claimsubmissionclaimdetailsprimaryinsuredchequedd;
	@FindBy(xpath = "//input[@id='ifsc_code']")
	private WebElement ClaimsubmissionclaimdetailsprimaryinsuredIsfccode;
	@FindBy(xpath = "//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
	private WebElement Claimsubmissionclaimdetailsprimaryinsureddeathcheckbox;
	@FindBy(xpath = "//input[@id='mp_pan_number']")
	private WebElement Claimsubmissionclaimdetailsmasterpolicypannumber;
	@FindBy(xpath = "//input[@id='mp_account_number']")
	private WebElement Claimsubmissionclaimdetailsmasterpolicyaccountnumber;
	@FindBy(xpath = "//input[@id='mp_bank_name']")
	private WebElement Claimsubmissionclaimdetailsmasterpolicybankname;
	@FindBy(xpath = "//input[@id='mp_bank_branch']")
	private WebElement Claimsubmissionclaimdetailsmasterpolicybranch;
	@FindBy(xpath = "//input[@id='mp_check_dd']")
	private WebElement Claimsubmissionclaimdetailsmasterpolicychequedd;
	@FindBy(xpath = "//input[@id='mp_ifsc_code']")
	private WebElement Claimsubmissionclaimdetailsmasterpolicyifsccode;
	@FindBy(xpath = "//a[normalize-space()='Document List']")
	private WebElement Claimsubmissionclaimdocumentlisttab;

	// ---------------------------claim settlement
	// tab-----------------------------------------------------------

	@FindBy(xpath = "//select[@id='claim_Status_Id']")
	private WebElement Claimsettlementclaimstatus;
	@FindBy(xpath = "//input[@id='micro_utr_number']")
	private WebElement ClaimsettlementUTRumber;
	@FindBy(xpath = "//input[@id='micro_amount']")
	private WebElement ClaimsettlementPaymentAmount;
	@FindBy(xpath = "//input[@id='date_micro_date']")
	private WebElement Claimsettlementpaymentdate;
	@FindBy(xpath = "//select[@id='claim_Comment_Id']")
	private WebElement Claimsettlementclaimcommenttype;
	@FindBy(xpath = "//input[@id='comment_doc']")
	private WebElement Claimsettlementcommentdocument;

	@FindBy(xpath = "//textarea[@id='userclaimcomment']")
	private WebElement Claimsettlementcomments;
	@FindBy(xpath = "//*[@id=\"submission_next\"]/ul/li[1]/a")
	private WebElement Claimspreviousbtn;

	@FindBy(xpath = "//*[@id=\"submission_next\"]/ul/li[2]/a")
	private WebElement Claimsnextbtn;

	public WebElement getNewclaimbtn() {
		return Newclaimbtn;
	}

	public WebElement getClaimCOI() {
		return ClaimCOI;
	}

	public WebElement getClaimPatientName() {
		return ClaimPatientName;
	}

	public WebElement getClaimoccupation() {
		return Claimoccupation;
	}

	public WebElement getClaimcity() {
		return Claimcity;
	}

	public WebElement getClaimstate() {
		return Claimstate;
	}

	public WebElement getClaimspincode() {
		return Claimspincode;
	}

	public WebElement getClaimsource() {
		return Claimsource;
	}

	public WebElement getClaimintimationdate() {
		return Claimintimationdate;
	}

	public WebElement getClaimAmount() {
		return ClaimAmount;
	}

	public WebElement getClaimcomments() {
		return Claimcomments;
	}

	public WebElement getClaimintimationsavebtn() {
		return Claimintimationsavebtn;
	}

	public WebElement getClaimsubmissiontab() {
		return Claimsubmissiontab;
	}

	public WebElement getHospitalizationdetails() {
		return Hospitalizationdetails;
	}

	public WebElement getClaimsubmissionhospitalname() {
		return Claimsubmissionhospitalname;
	}

	public WebElement getClaimsubmissionroomcategory() {
		return Claimsubmissionroomcategory;
	}

	public WebElement getClaimsubmissionreason() {
		return Claimsubmissionreason;
	}

	public WebElement getClaimsubmissiondateofinjury() {
		return Claimsubmissiondateofinjury;
	}

	public WebElement getClaimsubmissiondateofsubmission() {
		return Claimsubmissiondateofsubmission;
	}

	public WebElement getClaimsubmissionadmissiontime() {
		return Claimsubmissionadmissiontime;
	}

	public WebElement getClaimsubmissiondateofdischarge() {
		return Claimsubmissiondateofdischarge;
	}

	public WebElement getClaimsubmissiondischargetime() {
		return Claimsubmissiondischargetime;
	}

	public WebElement getClaimsubmissioncauseofinjury() {
		return Claimsubmissioncauseofinjury;
	}

	public WebElement getClaimsubmissionsystemofmedicine() {
		return Claimsubmissionsystemofmedicine;
	}

	public WebElement getClaimsubmissiondateofsurgery() {
		return Claimsubmissiondateofsurgery;
	}

	public WebElement getClaimsubmissionclaimtype() {
		return Claimsubmissionclaimtype;
	}

	public WebElement getClaimsubmissionprehospitalizationperiod() {
		return Claimsubmissionprehospitalizationperiod;
	}

	public WebElement getClaimsubmissionposthospitalizationperiod() {
		return Claimsubmissionposthospitalizationperiod;
	}

	public WebElement getClaimsubmissionClaimreferencenumber() {
		return ClaimsubmissionClaimreferencenumber;
	}

	public WebElement getClaimsubmissionclaimdetailstab() {
		return Claimsubmissionclaimdetailstab;
	}

	public WebElement getClaimsubmissionclaimdetailstitle() {
		return Claimsubmissionclaimdetailstitle;
	}

	public WebElement getClaimsubmissionclaimdetailsexpenseamount() {
		return Claimsubmissionclaimdetailsexpenseamount;
	}

	public WebElement getTreatmentexpensesclaimedaddnewbtn() {
		return Treatmentexpensesclaimedaddnewbtn;
	}

	public WebElement getTreatmentexpensesclaimedremovenewbtn() {
		return Treatmentexpensesclaimedremovenewbtn;
	}

	public WebElement getClaimdetailsClaimForDomiciliaryHospitalizationcheckbox() {
		return ClaimdetailsClaimForDomiciliaryHospitalizationcheckbox;
	}

	public WebElement getClaimsubmissionclaimdetailslumpsumcashbenefitclaimedTitle() {
		return ClaimsubmissionclaimdetailslumpsumcashbenefitclaimedTitle;
	}

	public WebElement getClaimsubmissionclaimdetailslumpsumcashbenefitclaimedAmount() {
		return ClaimsubmissionclaimdetailslumpsumcashbenefitclaimedAmount;
	}

	public WebElement getClaimsubmissionclaimdetailsDetailsofbillsenclosedAddnew() {
		return ClaimsubmissionclaimdetailsDetailsofbillsenclosedAddnew;
	}

	public WebElement getClaimsubmissionclaimdetailsbillno() {
		return Claimsubmissionclaimdetailsbillno;
	}

	public WebElement getClaimsubmissionclaimdetailsbilldate() {
		return Claimsubmissionclaimdetailsbilldate;
	}

	public WebElement getClaimsubmissionclaimdetailsIssuedby() {
		return ClaimsubmissionclaimdetailsIssuedby;
	}

	public WebElement getClaimsubmissionclaimdetailshospitalization() {
		return Claimsubmissionclaimdetailshospitalization;
	}

	public WebElement getClaimsubmissionclaimdetailsBillsEnclosedAmount() {
		return ClaimsubmissionclaimdetailsBillsEnclosedAmount;
	}

	public WebElement getClaimsubmissionclaimdetailsdocumentBrowsebtn() {
		return ClaimsubmissionclaimdetailsdocumentBrowsebtn;
	}

	public WebElement getClaimsubmissionclaimdetailsremovebtn() {
		return Claimsubmissionclaimdetailsremovebtn;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsuredbankdetailspannumber() {
		return Claimsubmissionclaimdetailsprimaryinsuredbankdetailspannumber;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsuredbankdetailsaccountnumber() {
		return Claimsubmissionclaimdetailsprimaryinsuredbankdetailsaccountnumber;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsuredbankdetailsbankname() {
		return Claimsubmissionclaimdetailsprimaryinsuredbankdetailsbankname;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsuredbankdetailsbranchname() {
		return Claimsubmissionclaimdetailsprimaryinsuredbankdetailsbranchname;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsuredchequedd() {
		return Claimsubmissionclaimdetailsprimaryinsuredchequedd;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsuredIsfccode() {
		return ClaimsubmissionclaimdetailsprimaryinsuredIsfccode;
	}

	public WebElement getClaimsubmissionclaimdetailsprimaryinsureddeathcheckbox() {
		return Claimsubmissionclaimdetailsprimaryinsureddeathcheckbox;
	}

	public WebElement getClaimsubmissionclaimdetailsmasterpolicypannumber() {
		return Claimsubmissionclaimdetailsmasterpolicypannumber;
	}

	public WebElement getClaimsubmissionclaimdetailsmasterpolicyaccountnumber() {
		return Claimsubmissionclaimdetailsmasterpolicyaccountnumber;
	}

	public WebElement getClaimsubmissionclaimdetailsmasterpolicybankname() {
		return Claimsubmissionclaimdetailsmasterpolicybankname;
	}

	public WebElement getClaimsubmissionclaimdetailsmasterpolicybranch() {
		return Claimsubmissionclaimdetailsmasterpolicybranch;
	}

	public WebElement getClaimsubmissionclaimdetailsmasterpolicychequedd() {
		return Claimsubmissionclaimdetailsmasterpolicychequedd;
	}

	public WebElement getClaimsubmissionclaimdetailsmasterpolicyifsccode() {
		return Claimsubmissionclaimdetailsmasterpolicyifsccode;
	}

	public WebElement getClaimsubmissionclaimdocumentlisttab() {
		return Claimsubmissionclaimdocumentlisttab;
	}

	public WebElement getClaimsettlementclaimstatus() {
		return Claimsettlementclaimstatus;
	}

	public WebElement getClaimsettlementUTRumber() {
		return ClaimsettlementUTRumber;
	}

	public WebElement getClaimsettlementPaymentAmount() {
		return ClaimsettlementPaymentAmount;
	}

	public WebElement getClaimsettlementpaymentdate() {
		return Claimsettlementpaymentdate;
	}

	public WebElement getClaimsettlementclaimcommenttype() {
		return Claimsettlementclaimcommenttype;
	}

	public WebElement getClaimsettlementcommentdocument() {
		return Claimsettlementcommentdocument;
	}

	public WebElement getClaimsettlementcomments() {
		return Claimsettlementcomments;
	}

	public WebElement getClaimspreviousbtn() {
		return Claimspreviousbtn;
	}

	public WebElement getClaimsnextbtn() {
		return Claimsnextbtn;
	}

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement dashboardpopupokbtn;

	public WebElement getdashboardpopupokbtn() {
		return dashboardpopupokbtn;
	}

	@FindBy(xpath = "//button[@id='save_user_comment']")
	private WebElement claimsettlementsavebtn;

	public WebElement getclaimsettlementsavebtn() {
		return claimsettlementsavebtn;
	}

	@FindBy(xpath = "//button[@id='claimsubmission_save']")
	private WebElement claimsubmissionsavebtn;

	public WebElement getclaimsubmissionsavebtn() {
		return claimsubmissionsavebtn;
	}

	@FindBy(css = "nav[id='settelment_next'] a[class='btn nextBtn btn-lg']")
	private WebElement claimsettlementnextbtn;

	public WebElement getclaimsettlementnextbtn() {
		return claimsettlementnextbtn;
	}

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement Rr_Excel;

	// ================================================

	@FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement claims_InsuredClaimsForm;

	public WebElement getClaims_InsuredClaimsForm() {
		return claims_InsuredClaimsForm;
	}

	@FindBy(xpath = "//tbody/tr[3]/td[4]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement claims_treatedDoctor;

	public WebElement getClaims_treatedDoctor() {
		return claims_treatedDoctor;
	}

	@FindBy(xpath = "//select[@id='productid_exp']")
	private WebElement Pms_productid;
	@FindBy(xpath = "//select[@id='inscompanyid_exp']")
	private WebElement Pms_ins;

	public WebElement getPms_productid() {
		return Pms_productid;
	}

	public WebElement getPms_ins() {
		return Pms_ins;
	}

	@FindBy(xpath = "//select[@id='productid']")
	private WebElement Pms_Renwal_proid;
	@FindBy(xpath = "//select[@id='segmentid']")
	private WebElement Pms_segmentid;
	@FindBy(xpath = "//select[@id='businesstypeid']")
	private WebElement Pms_businesstype;
	@FindBy(xpath = "//select[@id='filter_status']")
	private WebElement Pms_status;

	public WebElement getPms_Renwal_proid() {
		return Pms_Renwal_proid;
	}

	public WebElement getPms_segmentid() {
		return Pms_segmentid;
	}

	public WebElement getPms_businesstype() {
		return Pms_businesstype;
	}

	public WebElement getPms_status() {
		return Pms_status;
	}

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement Finance_org;

	public WebElement getFinance_org() {
		return Finance_org;
	}

	@FindBy(xpath = "//select[@id='orgid_rej']")
	private WebElement Pms_Reject_org;
	@FindBy(xpath = "//select[@id='inscompanyid_rej']")
	private WebElement Pms_Reject_insId;
	@FindBy(xpath = "//select[@id='orgid_med']")
	private WebElement Pms_Medical_org;
	@FindBy(xpath = "//select[@id='inscompanyid_med']")
	private WebElement Pms_Medical_insId;
	@FindBy(xpath = "//select[@id='orgid_exp']")
	private WebElement Pms_Expire_org;
	@FindBy(xpath = "//select[@id='productid_exp']")
	private WebElement Pms_Expire_productid;
	@FindBy(xpath = "//select[@id='inscompanyid_exp']")
	private WebElement Pms_Expire_insId;

	public WebElement getPms_Reject_org() {
		return Pms_Reject_org;
	}

	public WebElement getPms_Reject_insId() {
		return Pms_Reject_insId;
	}

	public WebElement getPms_Medical_org() {
		return Pms_Medical_org;
	}

	public WebElement getPms_Medical_insId() {
		return Pms_Medical_insId;
	}

	public WebElement getPms_Expire_org() {
		return Pms_Expire_org;
	}

	public WebElement getPms_Expire_productid() {
		return Pms_Expire_productid;
	}

	public WebElement getPms_Expire_insId() {
		return Pms_Expire_insId;
	}

	@FindBy(xpath = "//select[@id='inscompanyid']")
	private WebElement Pms_insurancecompany;

	public WebElement getDashboardpopupokbtn() {
		return dashboardpopupokbtn;
	}

	public WebElement getClaimsettlementsavebtn() {
		return claimsettlementsavebtn;
	}

	public WebElement getClaimsubmissionsavebtn() {
		return claimsubmissionsavebtn;
	}

	public WebElement getClaimsettlementnextbtn() {
		return claimsettlementnextbtn;
	}

	public WebElement getPms_insurancecompany() {
		return Pms_insurancecompany;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[16]/a[1]")
	private WebElement expiredpoliciesviewbtn;

	public WebElement getexpiredpoliciesviewbtn() {
		return expiredpoliciesviewbtn;
	}

	@FindBy(css = "div[id='tab-1'] i[class='fa fa-chevron-up']")
	private WebElement expiredpoliciesfiltersbtn;

	public WebElement getexpiredpoliciesfiltersbtn() {
		return expiredpoliciesfiltersbtn;
	}

	
	@FindBy(xpath = "//a[normalize-space()='Master Policies']")
	private WebElement Master_Policies;
	


	public WebElement getMaster_Policies() {
		return Master_Policies;
	}

//	................Cliams ..........................//
	
	 @FindBy(xpath="//input[@id='city_member']")
	   private WebElement ClaimMember_city;
	 @FindBy(xpath = "//select[@id='patient_name']")
		private WebElement ClaimPatientName1;
	 @FindBy(xpath="//select[@id='stateid_member']")
	private WebElement CI_Claims_states;
	 @FindBy(xpath="//input[@id='pincode_member']")
	 private WebElement CI_Claims_Pincode_Nu;
	 @FindBy(xpath="//select[@id='occupationid_member']")
	 private WebElement CI_Claims_Occpation;
	 @FindBy(xpath="//input[@id='claimant_name']")
	 private WebElement CI_CD_Name;
	 @FindBy(xpath="//input[@id='claimant_address']")
	 private WebElement CI_CD_Address;
	 @FindBy(xpath="//input[@id='claimant_date_birth']")
	 private WebElement CI_CD_DateOf_Brith;
	 @FindBy(xpath="//input[@id='claimant_emailid']")
	 private WebElement CI_CD_EmailId;
	 @FindBy(xpath="//input[@id='claimant_mobileno']")
	 private WebElement CI_CD_MobileNO;
	 @FindBy(xpath="//select[@id='claimant_relationship']")
	 private WebElement CI_CD_Relationship; 
	 @FindBy(xpath="//input[@id='palce_death']")
	 private WebElement CS_PlaceOFDeath;
	 @FindBy(xpath="//input[@id='death_time']")
	 private WebElement CS_DeathTime;
	 @FindBy(xpath="//input[@id='illness_days']")
	 private WebElement CS_Day;
	 @FindBy(xpath="//input[@id='illness_months']")
	 private WebElement CS_Months;
	 @FindBy(xpath="//input[@id='illness_years']")
	 private WebElement CS_Years;
	 @FindBy(xpath="//select[@id='deathreason']")
	 private WebElement CS_DeathReason; 
	
	 @FindBy(xpath="//input[@id='nom_pan_number']")
	 private WebElement CS_PanNumber;
	 @FindBy(xpath="//input[@id='nom_account_number']")
	 private WebElement CS_AccountNumber; 
	 @FindBy(xpath="//input[@id='nom_bank_name']")
	 private WebElement CS_BankName;
	 @FindBy(xpath="//input[@id='nom_bank_branch']")
	 private WebElement CS_Banck_branchNAme;
	 @FindBy(xpath="//input[@id='nom_check_dd']")
	 private WebElement CS_ChequeDetails;
	 @FindBy(xpath="//input[@id='nom_ifsc_code']")
	 private WebElement CS_IFSC_Code;
	 @FindBy(xpath="//a[normalize-space()='Claim Documents']")
	 private WebElement CS_ClaimDocument_Tab;
	 @FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	 private WebElement CD_DischargeSummary_Browse;
	 @FindBy(xpath="//tbody/tr[2]/td[4]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	 private WebElement CD_IndoorCasepapers_Browse;
	 @FindBy(xpath="//tbody/tr[3]/td[4]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	 private WebElement CD_FinalBill_Browse;
	 @FindBy(xpath="//tbody/tr[4]/td[4]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	 private WebElement CD_DeathCertificate_Browse;
	 @FindBy(xpath="//a[@id='btn_verifydocuments']")
	 private WebElement CD_VerifyDocument_Button;
	 @FindBy(xpath="//input[@id='commentdocumentInp']")
	 private WebElement CS_CommentAttachment_browse;
	 @FindBy(xpath="//span[normalize-space()='Claims']")
	 private WebElement Claims_dropDown;
	 @FindBy(xpath="//a[normalize-space()='Claims Reports']")
	 private WebElement Claims_Report_module;
	 @FindBy(xpath="//input[@id='pa_date_accident']")
	 private WebElement DateOfAccident;
	 @FindBy(xpath="//input[@id='pa_accident_time']")
	 private WebElement AccidentTime;
	 @FindBy(xpath="//input[@id='pa_palce_accident']")
	 private WebElement PlaceOFAccident;
	 @FindBy(xpath="//select[@id='pa_member_name']")
	 private WebElement patientName;
	 @FindBy(xpath="//input[@id='pa_city_member']")
	 private WebElement PA_City;
	 @FindBy(xpath="//select[@id='stateid_pa_member']")
	 private WebElement PA_State;
	 @FindBy(xpath="//input[@id='pa_pincode_member']")
	 private WebElement PA_Pincode;
	 @FindBy(xpath="//select[@id='pa_occupationid_member']")
	 private WebElement PA_Occupation;
	 @FindBy(xpath ="//select[@id='member_name']")
		private WebElement ClaimMemberName;
	public WebElement getClaimMember_city() {
		return ClaimMember_city;
	}
	public WebElement getClaimPatientName1() {
		return ClaimPatientName1;
	}

	public WebElement getCI_Claims_states() {
		return CI_Claims_states;
	}

	public WebElement getCI_Claims_Pincode_Nu() {
		return CI_Claims_Pincode_Nu;
	}

	public WebElement getCI_Claims_Occpation() {
		return CI_Claims_Occpation;
	}

	public WebElement getCI_CD_Name() {
		return CI_CD_Name;
	}

	public WebElement getCI_CD_Address() {
		return CI_CD_Address;
	}

	public WebElement getCI_CD_DateOf_Brith() {
		return CI_CD_DateOf_Brith;
	}

	public WebElement getCI_CD_EmailId() {
		return CI_CD_EmailId;
	}

	public WebElement getCI_CD_MobileNO() {
		return CI_CD_MobileNO;
	}

	public WebElement getCI_CD_Relationship() {
		return CI_CD_Relationship;
	}

	public WebElement getCS_PlaceOFDeath() {
		return CS_PlaceOFDeath;
	}

	public WebElement getCS_DeathTime() {
		return CS_DeathTime;
	}

	public WebElement getCS_Day() {
		return CS_Day;
	}

	public WebElement getCS_Months() {
		return CS_Months;
	}

	public WebElement getCS_Years() {
		return CS_Years;
	}

	public WebElement getCS_DeathReason() {
		return CS_DeathReason;
	}

	public WebElement getCS_PanNumber() {
		return CS_PanNumber;
	}

	public WebElement getCS_AccountNumber() {
		return CS_AccountNumber;
	}

	public WebElement getCS_BankName() {
		return CS_BankName;
	}

	public WebElement getCS_Banck_branchNAme() {
		return CS_Banck_branchNAme;
	}

	public WebElement getCS_ChequeDetails() {
		return CS_ChequeDetails;
	}

	public WebElement getCS_IFSC_Code() {
		return CS_IFSC_Code;
	}
	

	public WebElement getCS_ClaimDocument_Tab() {
		return CS_ClaimDocument_Tab;
	}

	public WebElement getCD_DischargeSummary_Browse() {
		return CD_DischargeSummary_Browse;
	}

	public WebElement getCD_IndoorCasepapers_Browse() {
		return CD_IndoorCasepapers_Browse;
	}

	public WebElement getCD_FinalBill_Browse() {
		return CD_FinalBill_Browse;
	}

	public WebElement getCD_DeathCertificate_Browse() {
		return CD_DeathCertificate_Browse;
	}

	public WebElement getCD_VerifyDocument_Button() {
		return CD_VerifyDocument_Button;
	}
	

	public WebElement getCS_CommentAttachment_browse() {
		return CS_CommentAttachment_browse;
	}

	public WebElement getClaims_dropDown() {
		return Claims_dropDown;
	}

	public WebElement getClaims_Report_module() {
		return Claims_Report_module;
	}

	public WebElement getDateOfAccident() {
		return DateOfAccident;
	}

	public WebElement getAccidentTime() {
		return AccidentTime;
	}

	public WebElement getPlaceOFAccident() {
		return PlaceOFAccident;
	}

	public WebElement getPatientName() {
		return patientName;
	}

	public WebElement getPA_City() {
		return PA_City;
	}

	public WebElement getPA_State() {
		return PA_State;
	}

	public WebElement getPA_Pincode() {
		return PA_Pincode;
	}

	public WebElement getPA_Occupation() {
		return PA_Occupation;
	}
	public WebElement getClaimMemberName() {
		return ClaimMemberName;
	}
	public PMSPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//tbody[1]/tr[3]/td[4]/div[1]/div[1]/span[1]/span[1]/input[1]")
	private WebElement Dischargesummary;

	public WebElement getDischargesummary() {
		return Dischargesummary;
	}
	
}