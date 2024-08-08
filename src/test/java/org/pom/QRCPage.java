package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QRCPage extends BaseClass {
	

	@FindBy(xpath="//span[normalize-space()='QRC']")
	private WebElement QRC;
	
	//========QRC List========//
	
	@FindBy(xpath="//a[normalize-space()='QRC List']")
	private WebElement QRCList;
	
	@FindBy(xpath="//i[@class='fa fa-expand']")
	private WebElement QRCExpand;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-adduser']")
	private WebElement QRCAddNew;
	
	@FindBy(xpath="//i[@class='fa fa-chevron-up']")
	private WebElement QRCFilter;
	
	@FindBy(xpath="//select[@id='filter_status']")
	private WebElement QRCStatusSelect;
	
	@FindBy(xpath="//input[@role='textbox']")
	private WebElement QRCAllTabTextBox;
	
	@FindBy(xpath="//select[@id='filter_type']")
	private WebElement QRCTicketTypeSelect;
	
	@FindBy (xpath="//select[@id='filter_cat']")
	private WebElement QRCCategorySelect;
	
	@FindBy (xpath="//select[@id='filter_sub_cat']")
	private WebElement QRCSubCategorySelect;
	
	@FindBy (xpath="//select[@id='filter_source']")
	private WebElement QRCSourceSelect;
	
	@FindBy (xpath="//input[@id='filter_mail']")
	private WebElement QRCEmail;
	
	@FindBy (xpath="//input[@id='filter_mobile']")
	private WebElement QRCMobileNumber;
	
	@FindBy (xpath="//a[@id='btn_filter']")
	private WebElement QRCApplyBtn;
	
	@FindBy (xpath="//a[@id='btn_filter_clear']")
	private WebElement QRCResetBtn;
	
	@FindBy (xpath="//select[@name='reportTable_length']")
	private WebElement QRCShowSelect;
	
	@FindBy (xpath="//span[normalize-space()='Excel']")
	private WebElement QRCEntriesDownloadExcel;
	
	@FindBy(xpath="//textarea[@id='qrc_details']")
	private WebElement QRCDetails;
	
	@FindBy(xpath="//input[@id='docfile']")
	private WebElement QRCDocumentUpload;
	
	@FindBy (xpath="//a[normalize-space()='Back']")
	private WebElement QRCBackBtn;
	
	@FindBy (xpath="//button[@id='btnSave']")
	private WebElement QRCSaveBtn;

	public WebElement getQRC() {
		return QRC;
	}

	public WebElement getQRCList() {
		return QRCList;
	}

	public WebElement getQRCExpand() {
		return QRCExpand;
	}

	public WebElement getQRCAddNew() {
		return QRCAddNew;
	}

	public WebElement getQRCFilter() {
		return QRCFilter;
	}

	

	public WebElement getQRCAllTabTextBox() {
		return QRCAllTabTextBox;
	}

	
	

	public WebElement getQRCStatusSelect() {
		return QRCStatusSelect;
	}

	public WebElement getQRCTicketTypeSelect() {
		return QRCTicketTypeSelect;
	}

	public WebElement getQRCCategorySelect() {
		return QRCCategorySelect;
	}

	public WebElement getQRCSourceSelect() {
		return QRCSourceSelect;
	}

	public WebElement getQRCSubCategorySelect() {
		return QRCSubCategorySelect;
	}

	

	public WebElement getQRCEmail() {
		return QRCEmail;
	}

	public WebElement getQRCMobileNumber() {
		return QRCMobileNumber;
	}

	public WebElement getQRCApplyBtn() {
		return QRCApplyBtn;
	}

	public WebElement getQRCResetBtn() {
		return QRCResetBtn;
	}

	public WebElement getQRCShowSelect() {
		return QRCShowSelect;
	}

	
	
	public WebElement getQRCDetails() {
		return QRCDetails;
	}

	public WebElement getQRCDocumentUpload() {
		return QRCDocumentUpload;
	}

	public WebElement getQRCBackBtn() {
		return QRCBackBtn;
	}

	public WebElement getQRCSaveBtn() {
		return QRCSaveBtn;
	}

	public WebElement getQRCEntriesDownloadExcel() {
		return QRCEntriesDownloadExcel;
	}
	
	
	
	//...................After Click AddNew And NewTicket Button............//
	
	@FindBy (xpath="//a[normalize-space()='New Ticket']")
	private WebElement QRCNewTicket;
	
	@FindBy (xpath="//input[@id='qrc_title']")
	private WebElement QRCTitle;
	
	@FindBy (xpath="//select[@id='qrc_typeid']")
	private WebElement QRCAddNewTicketTypeSelect;
	
	@FindBy (xpath="//select[@id='qrc_catid']")
	private WebElement QRCAddNewCategorySelect;
	
	@FindBy (xpath="//select[@id='qrc_subcatid']")
	private WebElement QRCAddNewSubCategorySelect;
	
	@FindBy (xpath="//select[@id='qrc_sourceid']")
	private WebElement QRCAddNewSourceSelect;
	
	@FindBy (xpath="//select[@id='qrc_repobyid']")
	private WebElement QRCAddNewReportedBySelect;
	
	@FindBy (xpath="//select[@id='qrc_orgid']")
	private WebElement QRCAddNewOrganizationSelect;
	
	@FindBy (xpath="//select[@id='qrc_branchid']")
	private WebElement QRCAddNewBranchSelect;
	
	@FindBy (xpath="//input[@id='qrc_rep_name']")
	private WebElement QRCAddNewReportedName;
	
	@FindBy (xpath="//input[@id='qrc_mobile']")
	private WebElement QRCAddNewMobileNo;
	
	@FindBy (xpath="//input[@id='qrc_email']")
	private WebElement QRCAddNewEmail;
	
	@FindBy (xpath="//input[@id='qrc_loc']")
	private WebElement QRCAddNewLocation;
	
	
	
	
	
	public WebElement getQRCNewTicket() {
		return QRCNewTicket;
	}

	public WebElement getQRCTitle() {
		return QRCTitle;
	}

	public WebElement getQRCAddNewTicketTypeSelect() {
		return QRCAddNewTicketTypeSelect;
	}

	public WebElement getQRCAddNewCategorySelect() {
		return QRCAddNewCategorySelect;
	}

	public WebElement getQRCAddNewSubCategorySelect() {
		return QRCAddNewSubCategorySelect;
	}

	public WebElement getQRCAddNewSourceSelect() {
		return QRCAddNewSourceSelect;
	}

	public WebElement getQRCAddNewReportedBySelect() {
		return QRCAddNewReportedBySelect;
	}

	public WebElement getQRCAddNewOrganizationSelect() {
		return QRCAddNewOrganizationSelect;
	}

	public WebElement getQRCAddNewBranchSelect() {
		return QRCAddNewBranchSelect;
	}

	public WebElement getQRCAddNewReportedName() {
		return QRCAddNewReportedName;
	}

	public WebElement getQRCAddNewMobileNo() {
		return QRCAddNewMobileNo;
	}

	public WebElement getQRCAddNewEmail() {
		return QRCAddNewEmail;
	}

	public WebElement getQRCAddNewLocation() {
		return QRCAddNewLocation;
	}

	
	//..........After Click Update Status...(us).....//
	
	@FindBy (xpath="//tr[@class='odd']//a[@class='btn btn-primary btn-xs']")
	private WebElement QRCUpdateStatus;
	
	@FindBy (xpath="//tbody/tr[3]/td[10]/a[2]")
	private WebElement QRCViewHistory;
	
	@FindBy (xpath="//select[@id='qrc_member']")
	private WebElement QRC_us_AssignedToSelect;
	
	@FindBy (xpath="//select[@id='qrc_status']")
	private WebElement QRC_us_StatusSelect;
	
	

	public WebElement getQRCUpdateStatus() {
		return QRCUpdateStatus;
	}

	public WebElement getQRCViewHistory() {
		return QRCViewHistory;
	}

	public WebElement getQRC_us_AssignedToSelect() {
		return QRC_us_AssignedToSelect;
	}

	public WebElement getQRC_us_StatusSelect() {
		return QRC_us_StatusSelect;
	}
	
	//======================================================
	

    @FindBy (xpath="//input[@id='docfilename']]")
	private WebElement QRC_browse;
	
	@FindBy (xpath="//*[@id=\"reportTable\"]/tbody/tr[1]/td[10]/a[1]")
	private WebElement QRC_UpdatedStatus;
	
	@FindBy (xpath="//*[@id=\"reportTable\"]/tbody/tr[1]/td[10]/a[1]")
	private WebElement QRC_FilterApply;
	
	
	@FindBy (xpath="//button[normalize-space()='Ok']")
	private WebElement pop_ok;
	
	public WebElement getPop_ok() {
		return pop_ok;
	}

	public WebElement getQRC_UpdatedStatus() {
		return QRC_UpdatedStatus;
	}

	public WebElement getQRC_browse() {
		return QRC_browse;
	}
	
	@FindBy (xpath="//a[@href='/Home/Index']")
	private WebElement QRCHome;
	
	public WebElement getQRCHome() {
		return QRCHome;
	}

	
	
	
	
	
	public QRCPage() {
		PageFactory.initElements(driver, this);
	}
		
		

}
