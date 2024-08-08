package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancePage extends BaseClass {

	@FindBy(xpath = "//span[normalize-space()='Finance']")
	private WebElement finance;

	public WebElement getFinance() {
		return finance;
	}

	// .............Wallet Credit History.....(in insurance Employee
	// login)................//
	@FindBy(xpath = "//a[normalize-space()='Wallet Credit History']")
	private WebElement WalletCreditHistory;

	public WebElement getWalletCreditHistory() {
		return WalletCreditHistory;
	}

	// .......product wallet...........//

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/button")
	private WebElement pwOk;

	public WebElement getPwOk() {
		return pwOk;
	}

	@FindBy(xpath = "//a[normalize-space()='Product Wallet']")
	private WebElement productWallet;

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement FinProFilter;

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement pwOrg;

	@FindBy(xpath = "//select[@id='productid']")
	private WebElement pwProductSegment;

	@FindBy(xpath = "//select[@id='inscompanyid']")
	private WebElement pwInsuranceCompany;

	@FindBy(xpath = "//select[@id='wallettypeid']")
	private WebElement pwWalletTypeId;

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement pwpwApplyButton;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement pwRestButton;

	// Wallet
	@FindBy(xpath = "//*[@id=\"reportTable\"]/tbody/tr[2]/td[11]/a[1]")
	private WebElement pwWallet;

	@FindBy(xpath = "//input[@id='add_balance']")
	private WebElement pwEnterAmount;

	@FindBy(xpath = "//input[@id='add_bankname']")
	private WebElement pwBankname;

	@FindBy(xpath = "//input[@id='add_ifsccode']")
	private WebElement pwIfsccode;

	@FindBy(xpath = "//input[@id='add_utrnumber']")
	private WebElement pwUtrnumber;

	@FindBy(xpath = "//input[@id='add_date']")
	private WebElement pwDateofTrans;

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement pwWalletDailyBalDetailsArrow;

	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement pwSave;

	@FindBy(xpath = "//button[@id='btnClear']")
	private WebElement pwClear;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement pwBack;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement pwExpand;

	public WebElement getProductWallet() {
		return productWallet;
	}

	public WebElement getPwWallet() {
		return pwWallet;
	}

	public WebElement getPwEnterAmount() {
		return pwEnterAmount;
	}

	public WebElement getPwBankname() {
		return pwBankname;
	}

	public WebElement getPwIfsccode() {
		return pwIfsccode;
	}

	public WebElement getPwUtrnumber() {
		return pwUtrnumber;
	}

	public WebElement getPwDateofTrans() {
		return pwDateofTrans;
	}

	public WebElement getPwWalletDailyBalDetailsArrow() {
		return pwWalletDailyBalDetailsArrow;
	}

	public WebElement getPwSave() {
		return pwSave;
	}

	public WebElement getPwClear() {
		return pwClear;
	}

	public WebElement getPwBack() {
		return pwBack;
	}

	public WebElement getPwExpand() {
		return pwExpand;
	}

	public WebElement getFinProFilter() {
		return FinProFilter;
	}

	public WebElement getPwOrg() {
		return pwOrg;
	}

	public WebElement getPwProductSegment() {
		return pwProductSegment;
	}

	public WebElement getPwInsuranceCompany() {
		return pwInsuranceCompany;
	}

	public WebElement getPwWalletTypeId() {
		return pwWalletTypeId;
	}

	public WebElement getPwpwApplyButton() {
		return pwpwApplyButton;
	}

	public WebElement getPwRestButton() {
		return pwRestButton;
	}

	// .......Branch Wallet................//

	@FindBy(xpath = "//a[normalize-space()='Branch Wallet']")
	private WebElement Branch;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
	private WebElement BranchAddWallet;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	private WebElement BranchDebit_History;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement BranchCredit_History;

	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement BranchPolicyRejectHistory;

	@FindBy(xpath = "//a[@class='btn btn-warning']")
	private WebElement BranchWalletRejectHistory;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[1]/div/div/a[1]")
	private WebElement Branch_Back_Button;

	@FindBy(xpath = "//span[normalize-space()='Download Branches List Format']")
	private WebElement BranchExcelDownload;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement branch_show;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement branch_Excel;

	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement BranchExcelUpload;

	@FindBy(xpath = "//input[@id='transaction_file']")
	private WebElement BranchTransactionProof;

	@FindBy(xpath = "//button[normalize-space()='Upload']")
	private WebElement BranchUploadBtn;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement BranchCancelBtn;

	@FindBy(xpath = "//button[@class='cancel']")
	private WebElement BranchUploadClickCancel;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement BranchUploadClickYes;

	public WebElement getBranchUploadBtn() {
		return BranchUploadBtn;
	}

	public WebElement getBranchCancelBtn() {
		return BranchCancelBtn;
	}

	public WebElement getBranchUploadClickCancel() {
		return BranchUploadClickCancel;
	}

	public WebElement getBranchUploadClickYes() {
		return BranchUploadClickYes;
	}

	public WebElement getBranch_show() {
		return branch_show;
	}

	public WebElement getBranch_Excel() {
		return branch_Excel;
	}

	public WebElement getBranchTransactionProof() {
		return BranchTransactionProof;
	}

	public WebElement getBranchExcelUpload() {
		return BranchExcelUpload;
	}

	public WebElement getBranchExcelDownload() {
		return BranchExcelDownload;
	}

	public WebElement getBranch_Back_Button() {
		return Branch_Back_Button;
	}

	public WebElement getBranchPolicyRejectHistory() {
		return BranchPolicyRejectHistory;
	}

	public WebElement getBranchWalletRejectHistory() {
		return BranchWalletRejectHistory;
	}

	public WebElement getBranchCredit_History() {
		return BranchCredit_History;
	}

	public WebElement getBranchDebit_History() {
		return BranchDebit_History;
	}

	public WebElement getBranchAddWallet() {
		return BranchAddWallet;
	}

	public WebElement getBranch() {
		return Branch;
	}

	// ..............Wallet Balance Approvals..........(wba)......//

	@FindBy(xpath = "//a[normalize-space()='Wallet Balance Approvals']")
	private WebElement walletBalanceApprovals;

	public WebElement getWalletBalanceApprovals() {
		return walletBalanceApprovals;
	}

	// .......After click. . .approval list...(al).. product Wallet Approval
	// List..(pwal).................//

	@FindBy(xpath = "//a[normalize-space()='Product Wallet Approval List']")
	private WebElement wba_alproductWalletApprovalList;

	@FindBy(xpath = "//a[@id='reportTable_next']")
	private WebElement wba_pwal_NextButton;

	@FindBy(xpath = "//*[@id=\"reportTable\"]/tbody/tr[1]/td[8]/a")
	private WebElement wba_pwal_DetailsButton;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[8]/div/div/div/label/b")
	private WebElement wba_pwal_ClickCheckBox;

	public WebElement getWba_alproductWalletApprovalList() {
		return wba_alproductWalletApprovalList;
	}

	public WebElement getWba_pwal_NextButton() {
		return wba_pwal_NextButton;
	}

	public WebElement getWba_pwal_DetailsButton() {
		return wba_pwal_DetailsButton;
	}

	public WebElement getWba_pwal_ClickCheckBox() {
		return wba_pwal_ClickCheckBox;
	}

	/// ..........After click Branch Wallet Approval List.(bwal).............//

	@FindBy(xpath = "//a[normalize-space()='Branch Wallet Approval List']")
	private WebElement wba_alBranchWalletApprovalList;

	@FindBy(xpath = "//*[@id=\"reportTableBulk\"]/tbody/tr[1]/td[3]/a")
	private WebElement wba_bwal_DetailsButton;

	@FindBy(xpath = "//a[@id='reportTableBulk_next']")
	private WebElement wba_bwal_NextButton;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[5]/div/div/div/label/b")
	private WebElement wba_bwal_ClickCheckBox;

	@FindBy(xpath = "//a[normalize-space()='View']")
	private WebElement wba_bwal_ProofOfTransactionView;

	@FindBy(xpath = "//select[@name='reportTableBulk_length']")
	private WebElement wba_bwal_selectshow;

	public WebElement getWba_bwal_selectshow() {
		return wba_bwal_selectshow;
	}

	public WebElement getWba_alBranchWalletApprovalList() {
		return wba_alBranchWalletApprovalList;
	}

	public WebElement getWba_bwal_DetailsButton() {
		return wba_bwal_DetailsButton;
	}

	public WebElement getWba_bwal_NextButton() {
		return wba_bwal_NextButton;
	}

	public WebElement getWba_bwal_ClickCheckBox() {
		return wba_bwal_ClickCheckBox;
	}

	public WebElement getWba_bwal_ProofOfTransactionView() {
		return wba_bwal_ProofOfTransactionView;
	}

	// ....Common for Wallet balance Approval..(wba).......//

	@FindBy(xpath = "//input[@id='app_name']")
	private WebElement wba_approvedByName;

	@FindBy(xpath = "//input[@id='app_email']")
	private WebElement wba_approvedByEmail;

	@FindBy(xpath = "//input[@id='app_mobile']")
	private WebElement wba_approvedByMobile;

	@FindBy(xpath = "//textarea[@id='app_comments']")
	private WebElement wba_comments;

	@FindBy(xpath = "//input[@id='docfile']")
	private WebElement wba_documentUpload;

	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement wba_ApproveButton;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement wba_approveButtonClickYes;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement wba_approveButtonClickCancel;

	@FindBy(xpath = "//button[@id='btnReject']")
	private WebElement wba_rejectButton;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement wba_rejectButtonClickYes;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement wba_rejectButtonClickCancel;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement wba_clickBackbutton;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement wba_ShowSelect;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement wba_EntriesDataDownloadInExcel;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement wba_ApprovalListExpandBtn;

	public WebElement getWba_ShowSelect() {
		return wba_ShowSelect;
	}

	public WebElement getWba_EntriesDataDownloadInExcel() {
		return wba_EntriesDataDownloadInExcel;
	}

	public WebElement getWba_approvedByName() {
		return wba_approvedByName;
	}

	public WebElement getWba_approvedByEmail() {
		return wba_approvedByEmail;
	}

	public WebElement getWba_approvedByMobile() {
		return wba_approvedByMobile;
	}

	public WebElement getWba_comments() {
		return wba_comments;
	}

	public WebElement getWba_documentUpload() {
		return wba_documentUpload;
	}

	public WebElement getWba_ApproveButton() {
		return wba_ApproveButton;
	}

	public WebElement getWba_approveButtonClickYes() {
		return wba_approveButtonClickYes;
	}

	public WebElement getWba_approveButtonClickCancel() {
		return wba_approveButtonClickCancel;
	}

	public WebElement getWba_rejectButton() {
		return wba_rejectButton;
	}

	public WebElement getWba_rejectButtonClickYes() {
		return wba_rejectButtonClickYes;
	}

	public WebElement getWba_rejectButtonClickCancel() {
		return wba_rejectButtonClickCancel;
	}

	public WebElement getWba_clickBackbutton() {
		return wba_clickBackbutton;
	}

	public WebElement getWba_ApprovalListExpandBtn() {
		return wba_ApprovalListExpandBtn;
	}

	@FindBy(xpath = "//select[@name='filterreportTable_length']")
	private WebElement finace_Productshow;

	public WebElement getFinace_Productshow() {
		return finace_Productshow;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[1]")
	private WebElement WBAdetailsbtn;

	public WebElement getWBAdetailsbtn() {
		return WBAdetailsbtn;
	}
	
	@FindBy(xpath = "//input[@id='issued_date']")
	private WebElement pwissuancedate;
	
	public WebElement getPwissuancedate() {
		return pwissuancedate;
	}

	public FinancePage() {
		PageFactory.initElements(driver, this);
	}

}
