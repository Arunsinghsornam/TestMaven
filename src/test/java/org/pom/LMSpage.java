package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LMSpage extends BaseClass {

	@FindBy(xpath="//body[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement Lms;

	@FindBy(xpath="//a[normalize-space()='Lead List']")
	private WebElement leadList;


	public WebElement getLms() {
		return Lms;
	}



	public WebElement getLeadList() {
		return leadList;
	}



	public WebElement getLeadListMinimalize() {
		return leadListMinimalize;
	}



	public WebElement getLeadListDateAndTime() {
		return leadListDateAndTime;
	}



	public WebElement getLeadListHelpButton() {
		return leadListHelpButton;
	}



	public WebElement getLeadListLogoutButton() {
		return leadListLogoutButton;
	}



	public WebElement getLeadListNew() {
		return leadListNew;
	}



	public WebElement getLeadListNextPage() {
		return leadListNextPage;
	}



	public WebElement getLeadListPreviousPage() {
		return leadListPreviousPage;
	}



	public WebElement getLeadListLastPage() {
		return leadListLastPage;
	}



	public WebElement getLeadListRows() {
		return leadListRows;
	}



	@FindBy(xpath="//a[contains(@class,'navbar-minimalize minimalize-styl-2 btn btn-primary')]")
	private WebElement leadListMinimalize;

	@FindBy(xpath="//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement leadListDateAndTime;

	@FindBy(xpath="//i[@class='fa fa-info-circle']")
	private WebElement leadListHelpButton;

	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	private WebElement leadListLogoutButton;

	@FindBy(xpath="//button[@class='btn btn-label-primary m-3']")
	private WebElement leadListNew;

	@FindBy(xpath="//select[@placeholder='Business Segment']")
	private WebElement leadListNewSelectBType;

	@FindBy(xpath="//button[normalize-space()='close']")
	private WebElement leadListNewCloseButton;

	@FindBy(xpath="//button[normalize-space()='ok']")
	private WebElement leadListNewOkButton;

	@FindBy(xpath="//button[@title='Go to next page']")
	private WebElement leadListNextPage;

	@FindBy(xpath="//button[@title='Go to previous page']")
	private WebElement leadListPreviousPage;

	@FindBy(xpath="//button[@title='Go to last page']")
	private WebElement leadListLastPage;

	@FindBy(xpath="//button[5]//*[name()='svg']")
	private WebElement leadListFullScreen;

	@FindBy(xpath="//*[name()='path' and contains(@d,'M3 3h18v2H')]")
	private WebElement leadListDensity;

	@FindBy(xpath="//button[@aria-label='Show/Hide columns']//*[name()='svg']")
	private WebElement leadListShowHideColumn;

	@FindBy(xpath="//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-14nc9fn-MuiToolbar-root']//button[2]//*[name()='svg']")
	private WebElement leadListShowHideFilters;

	@FindBy(xpath="//button[@aria-label='Show/Hide search']//*[name()='svg']")
	private WebElement leadListShowHideSearch;

	@FindBy(xpath="//button[normalize-space()='Hide all']")
	private WebElement leadListHideAll;

	@FindBy(xpath="//button[normalize-space()='Show all']")
	private WebElement leadListShowAll;

	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[1]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListHideByName;

	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[2]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListHideByPhone;

	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[3]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListHideByEmail;

	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListHideBType;

	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[5]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListHideByStatus;



	@FindBy(xpath="//input[@id='mui-239']")
	private WebElement leadListFilterByName1;


	@FindBy(xpath="//input[@id='mui-241']")
	private WebElement leadListFilterByPhoneNum1;

	@FindBy(xpath="//input[@id='mui-243']")
	private WebElement leadListFilterByEmail1;

	@FindBy(xpath="//input[@id='mui-245']")
	private WebElement leadListFilterBType1;

	@FindBy(xpath="//input[@id='mui-247']")
	private WebElement leadListFilterStatus1;

	@FindBy(xpath="//div[@title='Name']")
	private WebElement leadListNameAceAndDec;

	@FindBy(xpath="//span[@aria-label='Unsorted']//*[name()='svg']")
	private WebElement leadListNameAceAndDecArrow;

	@FindBy(xpath="//th[1]//div[1]//div[2]//button[1]//*[name()='svg']")
	private WebElement leadListNameMove;

	@FindBy(xpath="//th[1]//div[1]//div[2]//button[2]")
	private WebElement leadListNameActionColumn;

	@FindBy(xpath="//div[text()='Clear sort']")
	private WebElement leadListNameClearSort;

	@FindBy(xpath="//div[text()='Sort by Name ascending']")
	private WebElement leadListSortByNameAce;

	@FindBy(xpath="//div[text()='Sort by Name descending']")
	private WebElement leadListSortByNamedec;

	@FindBy(xpath="//div[text()='Filter by Name']")
	private WebElement leadListFilterByName;

	@FindBy(xpath="//div[text()='Group by Name']")
	private WebElement leadListFilterByGroupName;

	@FindBy(xpath="//div[text()='Hide Name column']")
	private WebElement leadListHideNameColumn;

	@FindBy(xpath="//div[text()='Show all columns']")
	private WebElement leadListNameShowAllColumn;

	@FindBy(xpath="//button[text()='Show all']")
	private WebElement leadListNameSACShowAll;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[1]/div[1]/label[1]/span[1]")
	private WebElement leadListNameShowNameColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[2]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListNameShowPhoneColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[3]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListNameShowEmailColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListNameShowBtypeColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[5]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListNameShowStatusColumn;

	@FindBy(xpath="//div[@title='Phone']")
	private WebElement leadListPhoneAceAndDec;

	@FindBy(xpath="//span[@aria-label='Unsorted']//*[name()='svg']")
	private WebElement leadListPhoneAceAndDecArrow;

	@FindBy(xpath="//button[@aria-label='Move']//*[name()='svg']")
	private WebElement leadListPhoneMove;

	@FindBy(xpath="//button[@aria-label='Column Actions']//*[name()='svg']")
	private WebElement leadListPhoneColumnAction;

	@FindBy(xpath="//div[text()='Sort by Phone ascending']")
	private WebElement leadListSortByPhoneAce;

	@FindBy(xpath="//div[text()='Sort by Phone descending']")
	private WebElement leadListSortByPhoneDec;

	@FindBy(xpath="//div[text()='Filter by Phone']")
	private WebElement leadListPhoneFilterByPhoneNum;

	@FindBy(xpath="//div[text()='Group by Phone']")
	private WebElement leadListPhoneFilterByGroupPhone;

	@FindBy(xpath="//div[text()='Hide Phone column']")
	private WebElement leadListPhoneHidePhoneColumn;

	@FindBy(xpath="//div[text()='Show all columns']")
	private WebElement leadListPhoneShowAllColumn;

	@FindBy(xpath="//button[text()='Show all']")
	private WebElement leadListPhoneSACShowAll;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[1]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListPhoneShowNameColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[3]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListPhoneShowEmailColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListPhoneShowBtypeColumn;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[5]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListPhoneShowStatusColumn;

	@FindBy(xpath="//div[@title='Email']")
	private WebElement leadListEmailAceAndDec;

	@FindBy(xpath="//span[@aria-label='Unsorted']//*[name()='svg']")
	private WebElement leadListEmailAceAndDecArrow;

	@FindBy(xpath="//button[@aria-label='Move']//*[name()='svg']")
	private WebElement leadListEmailMove;

	@FindBy(xpath="//button[@aria-label='Column Actions']//*[name()='svg']")
	private WebElement leadListEmailColumnAction;

	@FindBy(xpath="//div[text()='Sort by Email ascending']")
	private WebElement leadListEmailSortByEmailAse;

	@FindBy(xpath="//div[text()='Sort by Email descending']")
	private WebElement leadListEmailSortByDes;

	@FindBy(xpath="//div[text()='Filter by Email']")
	private WebElement leadListEmailFilterByEmail;

	@FindBy(xpath="//div[text()='Group by Email']")
	private WebElement leadListEmailFilterByGroupEmail;

	@FindBy(xpath="//div[text()='Hide Email column']")
	private WebElement leadListEmailHideEmailColumn;

	@FindBy(xpath="//div[text()='Show all columns']")
	private WebElement leadListEmailShowAllColumn;

	@FindBy(xpath="//button[text()='Show all']")
	private WebElement leadListEmailSACShowAll;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[1]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListEmailShowByName;

	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[2]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListEmailShowByPhone;


	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListEmailShowBType;


	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[5]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement leadListEmailShowByStatus;


	@FindBy(xpath="//div[@title='Business Type']")
	private WebElement leadListBTypeAceAndDec;

	@FindBy(xpath="//span[@aria-label='Unsorted']//*[name()='svg']")
	private WebElement leadListBTypeAceAndDecArrow;

	@FindBy(xpath="//button[@aria-label='Move']//*[name()='svg']")
	private WebElement leadListBtypeMove;

	@FindBy(xpath="//button[@aria-label='Column Actions']//*[name()='svg']")
	private WebElement leadListBTypeColumnAction;

	@FindBy(xpath="//div[text()='Sort by Business Type ascending']")
	private WebElement leadListSortBTypeeAce;

	@FindBy(xpath="//div[text()='Sort by Business Type descending']']")
	private WebElement leadListSortBTypeDec;

	@FindBy(xpath="//div[text()='Filter by Business Type']")
	private WebElement leadListPhoneFilterBType;

	@FindBy(xpath="//div[text()='Group by Business Type']")
	private WebElement leadListBtypeFilterBType;

	@FindBy(xpath="//div[text()='Hide Business Type column']")
	private WebElement leadListBtypeHideBtypeColumn;

	@FindBy(xpath="//div[text()='Show all columns']")
	private WebElement leadListBTypeShowAllColumn;

	@FindBy(xpath="//button[text()='Show all']")
	private WebElement leadListBTypeSACShowAll;

	@FindBy(xpath="//span[normalize-space()='Name']")
	private WebElement leadListBTypeShowNameColumn;

	@FindBy(xpath="//span[normalize-space()='Phone']")
	private WebElement leadListBTypeShowPhoneColumn;

	@FindBy(xpath="//span[normalize-space()='Email']")
	private WebElement leadListBTypeShowEmailColumn;

	@FindBy(xpath="//span[normalize-space()='Status']")
	private WebElement leadListBTypeStatusColumn;


	@FindBy(xpath="//select[@placeholder='Business Type']")
	private WebElement leadListSelectChannel;

	@FindBy(xpath="//select[@name='subBusinessTypesId']")
	private WebElement leadListSelectBType;

	@FindBy(xpath="//input[@name='businessName']")
	private WebElement leadListBName;

	@FindBy(xpath="//input[@name='cinNumber']")
	private WebElement leadListCINNum;

	@FindBy(xpath="//input[@name='webSite']")
	private WebElement leadListWebSite;

	@FindBy(id="basic-icon-default-phone")
	private WebElement leadListPhoneNum;

	@FindBy(id="basic-icon-default-email")
	private WebElement leadListEmail;

	@FindBy(id="basic-icon-default-Turnover")
	private WebElement leadListTurnOver;

	@FindBy(xpath="//select[@name='leadSourceId']")
	private WebElement leadListLeadSource;

	@FindBy(xpath="//select[@name='leadStatusId']")
	private WebElement leadListLeadStatus;

	@FindBy(xpath="//select[@name='leadPriorityId']")
	private WebElement leadListLeadPriority;

	@FindBy(xpath="//select[@name='leadStageId']")
	private WebElement leadListLeadStage;

	@FindBy(xpath="//select[@name='leadAssignedTo']")
	private WebElement leadListLeadAssTo;

	@FindBy(xpath="//select[@name='stateId']")
	private WebElement leadListLeadState;

	@FindBy(xpath="//input[@name='city']")
	private WebElement leadListLeadCity;

	@FindBy(xpath="//input[@name='pincode']")
	private WebElement leadListLeadPinCode;

	@FindBy(xpath="//input[@name='gpsLocation']")
	private WebElement leadListLeadGPS;

	@FindBy(xpath="//textarea[@name='address']")
	private WebElement leadListLeadAdress;

	@FindBy(id="Name")
	private WebElement leadListContactName;

	@FindBy(xpath="//select[@name='designationId']")
	private WebElement leadListContactDesignation;

	@FindBy(id="Email")
	private WebElement leadListContactEmail;

	@FindBy(id="MobileNumber")
	private WebElement leadListContactNum;

	@FindBy(xpath="//table[@class='table']//thead//tr//th//button[@type='button']")
	private WebElement leadListAddContact;

	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='page-wrapper']/div/div[@id='root']/div/div[@class='col-12']/button[1]")
	private WebElement leadListContactBackButton;

	@FindBy(id="basic-icon-default-fullname")
	private WebElement leadListRetailName;

	@FindBy(id="basic-icon-default-phone")
	private WebElement leadListRetailPhoneNum;

	@FindBy(id="basic-icon-default-email")
	private WebElement leadListRetailEmail;

	@FindBy(xpath="//select[@placeholder='Lead Source']")
	private WebElement leadListRetaiLeadSource;

	@FindBy(xpath="//select[@placeholder='Lead Status']")
	private WebElement leadListRetailLeadStatus;

	@FindBy(xpath="//select[@placeholder='Lead priority']")
	private WebElement leadListRetailPriority;

	@FindBy(xpath="//select[@placeholder='Lead Stage']")
	private WebElement leadListRetaiLeadStage;

	@FindBy(xpath="//select[@placeholder='Lead Assigned To']")
	private WebElement leadListRetailLeadAssTo;



	@FindBy(id="//select[@placeholder='Lead State']")
	private WebElement leadListRetailLeadState;

	@FindBy(id="basic-icon-default-website")
	private WebElement leadListRetailCity;

	@FindBy(id="basic-icon-default-phone")
	private WebElement leadListRetailPincode;

	@FindBy(id="basic-icon-default-message")
	private WebElement leadListRetailAddress;

	@FindBy(xpath="//button[1]")
	private WebElement leadListRetailBackButton;

	@FindBy(xpath="//button[2]")
	private WebElement leadListRetailSaveButton;




	public WebElement getLeadListContactBackButton() {
		return leadListContactBackButton;
	}



	public WebElement getLeadListRetailName() {
		return leadListRetailName;
	}



	public WebElement getLeadListRetailPhoneNum() {
		return leadListRetailPhoneNum;
	}



	public WebElement getLeadListRetailEmail() {
		return leadListRetailEmail;
	}



	public WebElement getLeadListRetaiLeadSource() {
		return leadListRetaiLeadSource;
	}



	public WebElement getLeadListRetailLeadStatus() {
		return leadListRetailLeadStatus;
	}



	public WebElement getLeadListRetailPriority() {
		return leadListRetailPriority;
	}



	public WebElement getLeadListRetaiLeadStage() {
		return leadListRetaiLeadStage;
	}







	public WebElement getLeadListRetailLeadAssTo() {
		return leadListRetailLeadAssTo;
	}



	public WebElement getLeadListRetailLeadState() {
		return leadListRetailLeadState;
	}



	public WebElement getLeadListRetailCity() {
		return leadListRetailCity;
	}



	public WebElement getLeadListRetailPincode() {
		return leadListRetailPincode;
	}



	public WebElement getLeadListRetailAddress() {
		return leadListRetailAddress;
	}



	public WebElement getLeadListRetailBackButton() {
		return leadListRetailBackButton;
	}



	public WebElement getLeadListRetailSaveButton() {
		return leadListRetailSaveButton;
	}



	public WebElement getLeadListNewSelectBType() {
		return leadListNewSelectBType;
	}



	public WebElement getLeadListNewCloseButton() {
		return leadListNewCloseButton;
	}



	public WebElement getLeadListNewOkButton() {
		return leadListNewOkButton;
	}



	public WebElement getLeadListFullScreen() {
		return leadListFullScreen;
	}



	public WebElement getLeadListDensity() {
		return leadListDensity;
	}



	public WebElement getLeadListShowHideColumn() {
		return leadListShowHideColumn;
	}



	public WebElement getLeadListShowHideFilters() {
		return leadListShowHideFilters;
	}



	public WebElement getLeadListShowHideSearch() {
		return leadListShowHideSearch;
	}



	public WebElement getLeadListHideAll() {
		return leadListHideAll;
	}



	public WebElement getLeadListShowAll() {
		return leadListShowAll;
	}



	public WebElement getLeadListHideByName() {
		return leadListHideByName;
	}



	public WebElement getLeadListHideByPhone() {
		return leadListHideByPhone;
	}



	public WebElement getLeadListHideByEmail() {
		return leadListHideByEmail;
	}



	public WebElement getLeadListHideBType() {
		return leadListHideBType;
	}



	public WebElement getLeadListHideByStatus() {
		return leadListHideByStatus;
	}



	public WebElement getLeadListFilterByName1() {
		return leadListFilterByName1;
	}



	public WebElement getLeadListFilterByPhoneNum1() {
		return leadListFilterByPhoneNum1;
	}



	public WebElement getLeadListFilterByEmail1() {
		return leadListFilterByEmail1;
	}



	public WebElement getLeadListFilterBType1() {
		return leadListFilterBType1;
	}



	public WebElement getLeadListFilterStatus1() {
		return leadListFilterStatus1;
	}



	public WebElement getLeadListNameAceAndDec() {
		return leadListNameAceAndDec;
	}



	public WebElement getLeadListNameAceAndDecArrow() {
		return leadListNameAceAndDecArrow;
	}



	public WebElement getLeadListNameMove() {
		return leadListNameMove;
	}



	public WebElement getLeadListNameActionColumn() {
		return leadListNameActionColumn;
	}



	public WebElement getLeadListNameClearSort() {
		return leadListNameClearSort;
	}



	public WebElement getLeadListSortByNameAce() {
		return leadListSortByNameAce;
	}



	public WebElement getLeadListSortByNamedec() {
		return leadListSortByNamedec;
	}



	public WebElement getLeadListFilterByName() {
		return leadListFilterByName;
	}



	public WebElement getLeadListFilterByGroupName() {
		return leadListFilterByGroupName;
	}



	public WebElement getLeadListHideNameColumn() {
		return leadListHideNameColumn;
	}



	public WebElement getLeadListNameShowAllColumn() {
		return leadListNameShowAllColumn;
	}



	public WebElement getLeadListNameSACShowAll() {
		return leadListNameSACShowAll;
	}



	public WebElement getLeadListNameShowNameColumn() {
		return leadListNameShowNameColumn;
	}



	public WebElement getLeadListNameShowPhoneColumn() {
		return leadListNameShowPhoneColumn;
	}



	public WebElement getLeadListNameShowEmailColumn() {
		return leadListNameShowEmailColumn;
	}



	public WebElement getLeadListNameShowBtypeColumn() {
		return leadListNameShowBtypeColumn;
	}



	public WebElement getLeadListNameShowStatusColumn() {
		return leadListNameShowStatusColumn;
	}



	public WebElement getLeadListPhoneAceAndDec() {
		return leadListPhoneAceAndDec;
	}



	public WebElement getLeadListPhoneAceAndDecArrow() {
		return leadListPhoneAceAndDecArrow;
	}



	public WebElement getLeadListPhoneMove() {
		return leadListPhoneMove;
	}



	public WebElement getLeadListPhoneColumnAction() {
		return leadListPhoneColumnAction;
	}



	public WebElement getLeadListSortByPhoneAce() {
		return leadListSortByPhoneAce;
	}



	public WebElement getLeadListSortByPhoneDec() {
		return leadListSortByPhoneDec;
	}



	public WebElement getLeadListPhoneFilterByPhoneNum() {
		return leadListPhoneFilterByPhoneNum;
	}



	public WebElement getLeadListPhoneFilterByGroupPhone() {
		return leadListPhoneFilterByGroupPhone;
	}



	public WebElement getLeadListPhoneHidePhoneColumn() {
		return leadListPhoneHidePhoneColumn;
	}



	public WebElement getLeadListPhoneShowAllColumn() {
		return leadListPhoneShowAllColumn;
	}



	public WebElement getLeadListPhoneSACShowAll() {
		return leadListPhoneSACShowAll;
	}



	public WebElement getLeadListPhoneShowNameColumn() {
		return leadListPhoneShowNameColumn;
	}



	public WebElement getLeadListPhoneShowEmailColumn() {
		return leadListPhoneShowEmailColumn;
	}



	public WebElement getLeadListPhoneShowBtypeColumn() {
		return leadListPhoneShowBtypeColumn;
	}



	public WebElement getLeadListPhoneShowStatusColumn() {
		return leadListPhoneShowStatusColumn;
	}



	public WebElement getLeadListEmailAceAndDec() {
		return leadListEmailAceAndDec;
	}



	public WebElement getLeadListEmailAceAndDecArrow() {
		return leadListEmailAceAndDecArrow;
	}



	public WebElement getLeadListEmailMove() {
		return leadListEmailMove;
	}



	public WebElement getLeadListEmailColumnAction() {
		return leadListEmailColumnAction;
	}



	public WebElement getLeadListEmailSortByEmailAse() {
		return leadListEmailSortByEmailAse;
	}



	public WebElement getLeadListEmailSortByDes() {
		return leadListEmailSortByDes;
	}



	public WebElement getLeadListEmailFilterByEmail() {
		return leadListEmailFilterByEmail;
	}



	public WebElement getLeadListEmailFilterByGroupEmail() {
		return leadListEmailFilterByGroupEmail;
	}



	public WebElement getLeadListEmailHideEmailColumn() {
		return leadListEmailHideEmailColumn;
	}



	public WebElement getLeadListEmailShowAllColumn() {
		return leadListEmailShowAllColumn;
	}



	public WebElement getLeadListEmailSACShowAll() {
		return leadListEmailSACShowAll;
	}



	public WebElement getLeadListEmailShowByName() {
		return leadListEmailShowByName;
	}



	public WebElement getLeadListEmailShowByPhone() {
		return leadListEmailShowByPhone;
	}



	public WebElement getLeadListEmailShowBType() {
		return leadListEmailShowBType;
	}



	public WebElement getLeadListEmailShowByStatus() {
		return leadListEmailShowByStatus;
	}



	public WebElement getLeadListBTypeAceAndDec() {
		return leadListBTypeAceAndDec;
	}



	public WebElement getLeadListBTypeAceAndDecArrow() {
		return leadListBTypeAceAndDecArrow;
	}



	public WebElement getLeadListBtypeMove() {
		return leadListBtypeMove;
	}



	public WebElement getLeadListBTypeColumnAction() {
		return leadListBTypeColumnAction;
	}



	public WebElement getLeadListSortBTypeeAce() {
		return leadListSortBTypeeAce;
	}



	public WebElement getLeadListSortBTypeDec() {
		return leadListSortBTypeDec;
	}



	public WebElement getLeadListPhoneFilterBType() {
		return leadListPhoneFilterBType;
	}



	public WebElement getLeadListBtypeFilterBType() {
		return leadListBtypeFilterBType;
	}



	public WebElement getLeadListBtypeHideBtypeColumn() {
		return leadListBtypeHideBtypeColumn;
	}



	public WebElement getLeadListBTypeShowAllColumn() {
		return leadListBTypeShowAllColumn;
	}



	public WebElement getLeadListBTypeSACShowAll() {
		return leadListBTypeSACShowAll;
	}



	public WebElement getLeadListBTypeShowNameColumn() {
		return leadListBTypeShowNameColumn;
	}



	public WebElement getLeadListBTypeShowPhoneColumn() {
		return leadListBTypeShowPhoneColumn;
	}



	public WebElement getLeadListBTypeShowEmailColumn() {
		return leadListBTypeShowEmailColumn;
	}



	public WebElement getLeadListBTypeStatusColumn() {
		return leadListBTypeStatusColumn;
	}



	public WebElement getLeadListSelectChannel() {
		return leadListSelectChannel;
	}



	public WebElement getLeadListSelectBType() {
		return leadListSelectBType;
	}



	public WebElement getLeadListBName() {
		return leadListBName;
	}



	public WebElement getLeadListCINNum() {
		return leadListCINNum;
	}



	public WebElement getLeadListWebSite() {
		return leadListWebSite;
	}



	public WebElement getLeadListPhoneNum() {
		return leadListPhoneNum;
	}



	public WebElement getLeadListEmail() {
		return leadListEmail;
	}



	public WebElement getLeadListTurnOver() {
		return leadListTurnOver;
	}



	public WebElement getLeadListLeadSource() {
		return leadListLeadSource;
	}



	public WebElement getLeadListLeadStatus() {
		return leadListLeadStatus;
	}



	public WebElement getLeadListLeadPriority() {
		return leadListLeadPriority;
	}



	public WebElement getLeadListLeadStage() {
		return leadListLeadStage;
	}



	public WebElement getLeadListLeadAssTo() {
		return leadListLeadAssTo;
	}



	public WebElement getLeadListLeadState() {
		return leadListLeadState;
	}



	public WebElement getLeadListLeadCity() {
		return leadListLeadCity;
	}



	public WebElement getLeadListLeadPinCode() {
		return leadListLeadPinCode;
	}



	public WebElement getLeadListLeadGPS() {
		return leadListLeadGPS;
	}



	public WebElement getLeadListLeadAdress() {
		return leadListLeadAdress;
	}



	public WebElement getLeadListContactName() {
		return leadListContactName;
	}



	public WebElement getLeadListContactDesignation() {
		return leadListContactDesignation;
	}



	public WebElement getLeadListContactEmail() {
		return leadListContactEmail;
	}



	public WebElement getLeadListContactNum() {
		return leadListContactNum;
	}



	public WebElement getLeadListAddContact() {
		return leadListAddContact;
	}



	@FindBy(id="mui-66")
	private WebElement leadListRows;

	public LMSpage() {
		PageFactory.initElements(driver, this);

	}

}
