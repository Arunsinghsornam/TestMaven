package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EMSPage {
	
	@FindBy(xpath="//body/div[@id='wrapper']/nav[@role='navigation']/div[@class='sidebar-collapse']/ul[@id='side-menu']/li[2]/a[1]")
	private WebElement EMS;
	
	@FindBy(xpath="//a[normalize-space()='Employee List']")
	private WebElement employeeList;
	
	@FindBy(xpath="//a[contains(@class,'navbar-minimalize minimalize-styl-2 btn btn-primary')]")
	private WebElement employeeMinimalizeButton;
	
	@FindBy(xpath="//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement employeeDateAndTime;
	
	@FindBy(xpath="//b[normalize-space()='Help']")
	private WebElement employeeHelpButton;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	private WebElement employeeLogoutButton;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-15de0iv-MuiButtonBase-root-MuiButton-root']")
	private WebElement employeeAddNew;
	
	@FindBy(xpath="//button[@aria-label='Toggle density']")
	private WebElement employeeToggleDensity;
	
	@FindBy(xpath="//button[@aria-label='Show/Hide columns']//*[name()='svg']")
	private WebElement employeeShowAndHide;
	
	@FindBy(xpath="//button[@aria-label='Show/Hide filters']//*[name()='svg']")
	private WebElement employeeShowHideFilters;
	
	@FindBy(xpath="//button[@aria-label='Show/Hide search']//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root']")
	private WebElement employeeSearchButton;
	
	@FindBy(xpath="//button[normalize-space()='Hide all']")
	private WebElement employeeHideAll;
	
	@FindBy(xpath="//button[normalize-space()='Show all']")
	private WebElement employeeShowAll;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[1]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeNameFilter;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[2]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeNumberFilter;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[3]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeEmailFilter;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeIdFilter;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/ul[1]/li[5]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeDepertmentFilter;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/button[1]")
	private WebElement employeeEditButton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/button[1]")
	private WebElement employeeDeleteButton;
	
	@FindBy(xpath="//input[@id='mui-67']")
	private WebElement employeeSearchByName;
	
	@FindBy(xpath="//input[@id='mui-60']")
	private WebElement employeePersonalDetails1;
	
	@FindBy(xpath="//input[@id='mui-61']")
	private WebElement employeeMobileNumber1;
	
	@FindBy(xpath="//input[@id='mui-62']")
	private WebElement employeeEmail1;
	
	@FindBy(xpath="//input[@id='mui-63']")
	private WebElement employeeCompanyEmail1;
	
	@FindBy(xpath="//input[@id='mui-64']")
	private WebElement employeeAlternateNumber1;
	
	@FindBy(xpath="//input[@id='mui-65']")
	private WebElement employeeID1;
	
	@FindBy(xpath="//div[@id='mui-component-select-Designation']")
	private WebElement employeeDesignation1;
	
	@FindBy(xpath="//div[@id='mui-component-select-Branches']")
	private WebElement employeeBranch1;
	
	@FindBy(xpath="//button[@title='Open']//*[name()='svg']")
	private WebElement employeeOpenButton;
	
	@FindBy(xpath="//div[@id='mui-component-select-Department']")
	private WebElement employeeDepartMent1;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-sghohy-MuiButtonBase-root-MuiButton-root']")
	private WebElement employeeBackButton1;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeMedium MuiButton-containedSizeMedium css-ke5b6m-MuiButtonBase-root-MuiButton-root']")
	private WebElement employeeSaveButton1;
	
	@FindBy(xpath="//input[@id='mui-23']")
	private WebElement employeePersonalDetails;
	
	@FindBy(xpath="//input[@id='mui-24']")
	private WebElement employeeMobileNumber;
	
	@FindBy(xpath="//input[@id='mui-25']")
	private WebElement employeeEmail;
	
	@FindBy(xpath="//input[@id='mui-26']")
	private WebElement employeeCompanyEmail;
	
	@FindBy(xpath="//input[@id='mui-27']")
	private WebElement employeeAlternateNumber;
	
	
	@FindBy(xpath="//div[@id='mui-component-select-Designation']")
	private WebElement employeeDesignation;
	
	@FindBy(xpath="//div[@id='mui-component-select-Branches']")
	private WebElement employeeBranch;
	
	
	@FindBy(xpath="//div[@id='mui-component-select-Department']")
	private WebElement employeeDepartMent;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-sghohy-MuiButtonBase-root-MuiButton-root']")
	private WebElement employeeBackButton;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeMedium MuiButton-containedSizeMedium css-ke5b6m-MuiButtonBase-root-MuiButton-root']")
	private WebElement employeeSaveButton;
	
	@FindBy(xpath="//div[@id='mui-43']")
	private WebElement employeeRowsPerPage;
	
	@FindBy(xpath="///p[@class='MuiTablePagination-displayedRows css-levciy-MuiTablePagination-displayedRows']")
	private WebElement employeeTablePagination;
	
	@FindBy(xpath="//button[@title='Go to first page']")
	private WebElement employeeGoToFirstPage;
	
	@FindBy(xpath="//button[@title='Go to last page']//*[name()='svg']")
	private WebElement employeeGoToLastPage;
	
	@FindBy(xpath="//button[@title='Go to previous page']//*[name()='svg']")
	private WebElement employeeGoToPriviousPage;
	
	@FindBy(xpath="//button[@title='Go to next page']//*[name()='svg']")
	private WebElement employeeGoToNextPage;
	
	@FindBy(xpath="//div[@title='Name']")
	private WebElement employeeNameAsceAndDecButton;
	
	@FindBy(xpath="//th[1]//div[1]//div[2]//button[1]//*[name()='svg']")
	private WebElement employeeNameMoveButton;
	
	@FindBy(xpath="//th[1]//div[1]//div[2]//button[2]//*[name()='svg']")
	private WebElement employeeNameColumnAction;
	
	@FindBy(xpath="//body/div[@role='presentation']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-1poimk-MuiPaper-root-MuiMenu-paper-MuiPaper-root-MuiPopover-paper']/ul[@role='menu']/li[1]/div[1]")
	private WebElement employeeClearSort;
	
	@FindBy(xpath="//div[normalize-space()='Sort by Name descending']")
	private WebElement employeeNameSortByDecending;
	
	@FindBy(xpath="//div[normalize-space()='Filter by Name']")
	private WebElement employeeFilterByName;
	
	@FindBy(xpath="//div[normalize-space()='Group by Name']")
	private WebElement employeeGroupByName;
	
	@FindBy(xpath="//div[normalize-space()='Hide Name column']")
	private WebElement employeeHideNameColumn;
	
	@FindBy(xpath="//div[normalize-space()='Sort by Name ascending']")
	private WebElement employeeNameSortByAsending;
	
	@FindBy(xpath="//div[normalize-space()='Clear filter']")
	private WebElement employeeNameClearFilter;
	
	@FindBy(xpath="//div[@role='presentation']//li[1]")
	private WebElement employeeShowAllColoum;
	
	@FindBy(xpath="//div[normalize-space()='Hide Mobile Number column']")
	private WebElement employeeNameHideMobileNumber;
	
	@FindBy(xpath="//button[normalize-space()='Show all']")
	private WebElement employeeSACShowAll;
	
	@FindBy(xpath="//body/div[3]/div[3]/ul[1]/li[4]/div[1]")
	private WebElement employeeSACName;
	
	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[2]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeSACMobileNumber;
	
	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[3]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeSACEmail;
	
	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[4]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeSACEmployeeID;
	
	@FindBy(xpath="//body[1]/div[4]/div[3]/ul[1]/li[5]/div[1]/label[1]/span[1]/span[1]/input[1]")
	private WebElement employeeSACDepartment;
	
	@FindBy(xpath="//div[normalize-space()='Sort by Mobile Number ascending']")
	private WebElement employeeMobileNumberAscending;
	
	@FindBy(xpath="//div[normalize-space()='Sort by Mobile Number descending']")
	private WebElement employeeMobileNumberDecending;
	
	@FindBy(xpath="//div[normalize-space()='Filter by Mobile Number']")
	private WebElement employeeFilterByMobNumber;
	
	@FindBy(xpath="//div[normalize-space()='Group by Mobile Number']")
	private WebElement employeeGroupByMobNum;
	
	@FindBy(xpath="//div[normalize-space()='Hide Mobile Number column']")
	private WebElement employeeHideMobNumColumn;
	
	@FindBy(xpath="//th[2]//div[1]//div[2]//button[1]//*[name()='svg']")
	private WebElement employeeMobileNumMoveButton;
	
	@FindBy(xpath="//div[@title='Mobile Number']")
	private WebElement employeeMobNumAscAndDecButton;
	
	@FindBy(xpath="//span[@aria-label='Sorted by Mobile Number ascending']//*[name()='svg']")
	private WebElement employeeMobNumAscAndDecArrow;
	
	@FindBy(xpath="//th[1]//div[1]//div[1]//span[1]//*[name()='svg']")
	private WebElement employeeNameAscAndDecArrow;
	
	@FindBy(xpath="//div[@title='Email']")
	private WebElement employeeEmailAscAndDecButton;
	
	@FindBy(xpath="//th[3]//div[1]//div[1]//span[1]//*[name()='svg']")
	private WebElement employeeEmailAscAndDecArrow;
	
	@FindBy(xpath="//th[2]//div[1]//div[2]//button[2]//*[name()='svg']")
	private WebElement employeeMobNumColumnAction;
	
	@FindBy(xpath="//th[3]//div[1]//div[2]//button[2]//*[name()='svg']")
	private WebElement employeeEmailColumnAction;
	
	@FindBy(xpath="//body/div[@role='presentation']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-1poimk-MuiPaper-root-MuiMenu-paper-MuiPaper-root-MuiPopover-paper']/ul[@role='menu']/li[2]/div[1]")
	private WebElement employeeEmailSortByAce;
	
	@FindBy(xpath="//div[@title='Employee Id']")
	private WebElement employeeIDAceAndDecButton;
	
	@FindBy(xpath="//span[@aria-label='Sorted by Employee Id descending']//*[name()='svg']//*[name()='path' and contains(@d,'m20 12-1.4')]")
	private WebElement employeeIDAceAndDecArrow;
	
	@FindBy(xpath="//th[4]//div[1]//div[2]//button[1]//*[name()='svg']")
	private WebElement employeeIDMoveButton;
	
	@FindBy(xpath="//body/div[@role='presentation']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-1poimk-MuiPaper-root-MuiMenu-paper-MuiPaper-root-MuiPopover-paper']/ul[@role='menu']/li[1]/div[1]")
	private WebElement employeeIDClearSort;
	
	@FindBy(xpath="//body/div[@role='presentation']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-1poimk-MuiPaper-root-MuiMenu-paper-MuiPaper-root-MuiPopover-paper']/ul[@role='menu']/li[1]/div[1]")
	private WebElement employeeIDSortByAce;
	
	@FindBy(xpath="//body/div[@role='presentation']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiPaper-root MuiMenu-paper MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-1poimk-MuiPaper-root-MuiMenu-paper-MuiPaper-root-MuiPopover-paper']/ul[@role='menu']/li[1]/div[1]")
	private WebElement employeeIDColumnAction;
	
	
	
	

}
