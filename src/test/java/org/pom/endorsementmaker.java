package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class endorsementmaker extends BaseClass {
	//------------------------------pms-------------------
		@FindBy(xpath="//span[normalize-space()='PMS']")
		private WebElement endPms;
		 @FindBy(xpath="//a[normalize-space()='Policies']")
		 private WebElement endPmsPolices;
		 
		 @FindBy(xpath="//a[@class='fullscreen-link btn btn-default']")
		 private WebElement endPmsPolicesExpand;
		 @FindBy(xpath="//i[@class='fa fa-chevron-up']")
	      private WebElement endPmsFilter;
		 
		 @FindBy(xpath="//span[@id='select2-orgid-container']")
		 private WebElement endPms_Polices_org;
		 @FindBy(xpath="//span[@id='select2-inscompanyid-container']")
		 private WebElement endPms_Polices_InsCompany;
		 
		 @FindBy(xpath="//input[@id='filter_customerid']")
		 private WebElement endPms_Polices_Customerid;
		 
		 @FindBy(xpath="//input[@id='filter_mobile']")
		 private WebElement endPms_Polices_Mobile;
		 
		 @FindBy(xpath="//input[@id='filter_mail']")
		 private WebElement endPms_Polices_Mail;
		 
		 @FindBy(xpath="//input[@id='filter_coinumber']")
		 private WebElement endPms_Polices_coinumber;
		 
		 @FindBy(xpath="//input[@id='filter_loanaccount']")
		 private WebElement endPms_Polices_Loanaccount;
		 
		 @FindBy(xpath="//input[@id='search_startdatetime']")
		 private WebElement endPms_Polices_StartDate;
		 @FindBy(xpath="//a[@id='btn_filter']")
		 private WebElement endPms_Polices_Apply;
		 
		 @FindBy(xpath="//a[@id='btn_filter_clear']")
		 private WebElement endPms_Polices_Reset;
		 
		 @FindBy(xpath="//select[@name='reportTable_length']")
		 private WebElement  endPms_Polices_Show;
		 
		 @FindBy(xpath="//div[@id='reportTable_wrapper']//div//span[contains(text(),'Excel')]")
		 private WebElement endPms_Polices_excel;
	
	
	// ....Expired Policies List..(epl).//

	@FindBy(xpath = "//a[normalize-space()='Expired Policies List']")
	private WebElement pms_p_expiredPoliciesList;

	@FindBy(xpath = "//div[@id='tab-3']//i[@class='fa fa-chevron-up']")
	private WebElement pms_p_epl_FilterArrowButton;

	@FindBy(id = "select2-orgid_exp-container")
	private WebElement pms_p_epl_OrganizationSpan;

	@FindBy(id = "select2-productid_exp-container")
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
		//-----------------------------endorsement--------------------
		@FindBy(xpath="//span[normalize-space()='Endorsement']")
		private WebElement endorsement;
	//--------------------pendingList--------------------
		@FindBy(xpath="//a[normalize-space()='Pending List']")
		private WebElement endPendingList;
		
		@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
		private WebElement endPendingListView;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement endPendingListBackButton;
		
		@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
		private WebElement endPendingListHistory;
		
		@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
		private WebElement endPendingHistoryView;
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement endPendingHistoryVieBackButton;
		//--------------------Approved List----------------------
		
		@FindBy(xpath="//a[normalize-space()='Approved List']")
		private WebElement endApprovedList;
		
		@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
		private WebElement endApprovedListView;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement endApprovedListViewBackButton;
		
		@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
		private WebElement endApprovedListHistory;
		
		@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
		private WebElement endApprovedListHistoryView;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement endApprovedListHistoryViewBackButton;
		//-------------------------------RejectedList---------------
		
		@FindBy(xpath="//a[normalize-space()='Rejected List']")
		private WebElement endRejectList;
		
		@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
		private WebElement endRejectListView;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement endRejectListBackButton;
		
		@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
		private WebElement endRejectListHistory;
		
		@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
		private WebElement endRejectListHistoryView;
		
		@FindBy(xpath="//button[normalize-space()='Back']")
		private WebElement endRejectListHistoryViewBackButt;
		
		
		
		public WebElement getEndPms() {
			return endPms;
		}



		public WebElement getEndPmsPolices() {
			return endPmsPolices;
		}



		public WebElement getEndPmsPolicesExpand() {
			return endPmsPolicesExpand;
		}



		public WebElement getEndPmsFilter() {
			return endPmsFilter;
		}



		public WebElement getEndPms_Polices_org() {
			return endPms_Polices_org;
		}



		public WebElement getEndPms_Polices_InsCompany() {
			return endPms_Polices_InsCompany;
		}



		public WebElement getEndPms_Polices_Customerid() {
			return endPms_Polices_Customerid;
		}



		public WebElement getEndPms_Polices_Mobile() {
			return endPms_Polices_Mobile;
		}



		public WebElement getEndPms_Polices_Mail() {
			return endPms_Polices_Mail;
		}



		public WebElement getEndPms_Polices_coinumber() {
			return endPms_Polices_coinumber;
		}



		public WebElement getEndPms_Polices_Loanaccount() {
			return endPms_Polices_Loanaccount;
		}



		public WebElement getEndPms_Polices_StartDate() {
			return endPms_Polices_StartDate;
		}



		public WebElement getEndPms_Polices_Apply() {
			return endPms_Polices_Apply;
		}



		public WebElement getEndPms_Polices_Reset() {
			return endPms_Polices_Reset;
		}



		public WebElement getEndPms_Polices_Show() {
			return endPms_Polices_Show;
		}



		public WebElement getEndPms_Polices_excel() {
			return endPms_Polices_excel;
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



		public WebElement getPms_expriredpolicies_reset_button() {
			return pms_expriredpolicies_reset_button;
		}



		public WebElement getPms_exppolicies_startdate() {
			return pms_exppolicies_startdate;
		}



		public WebElement getEndorsement() {
			return endorsement;
		}



		public WebElement getEndPendingList() {
			return endPendingList;
		}



		public WebElement getEndPendingListView() {
			return endPendingListView;
		}



		public WebElement getEndPendingListBackButton() {
			return endPendingListBackButton;
		}



		public WebElement getEndPendingListHistory() {
			return endPendingListHistory;
		}



		public WebElement getEndPendingHistoryView() {
			return endPendingHistoryView;
		}



		public WebElement getEndPindingHistoryVieBackButton() {
			return endPendingHistoryVieBackButton;
		}



		public WebElement getEndApprovedList() {
			return endApprovedList;
		}



		public WebElement getEndApprovedListView() {
			return endApprovedListView;
		}



		public WebElement getEndApprovedListViewBackButton() {
			return endApprovedListViewBackButton;
		}



		public WebElement getEndApprovedListHistory() {
			return endApprovedListHistory;
		}



		public WebElement getEndApprovedListHistoryView() {
			return endApprovedListHistoryView;
		}



		public WebElement getEndApprovedListHistoryViewBackButton() {
			return endApprovedListHistoryViewBackButton;
		}



		public WebElement getEndRejectList() {
			return endRejectList;
		}



		public WebElement getEndRejectListView() {
			return endRejectListView;
		}



		public WebElement getEndRejectListBackButton() {
			return endRejectListBackButton;
		}



		public WebElement getEndRejectListHistory() {
			return endRejectListHistory;
		}



		public WebElement getEndRejectListHistoryView() {
			return endRejectListHistoryView;
		}



		public WebElement getEndRejectListHistoryViewBackButt() {
			return endRejectListHistoryViewBackButt;
		}



		public endorsementmaker() {
			
			PageFactory.initElements(driver,this);

		}
	
}