package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationManagement extends BaseClass {

	public WebElement getOrgManagement() {
		return orgManagement;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getZones() {
		return Zones;
	}

	public WebElement getRegions() {
		return Regions;
	}

	public WebElement getBranches() {
		return Branches;
	}

	public WebElement getEmployees() {
		return Employees;
	}

	public WebElement getInsuranceCompany() {
		return insuranceCompany;
	}

	public WebElement getAddUser() {
		return addUser;
	}

	public WebElement getSelectBusinessType() {
		return selectBusinessType;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getOrganizationKey() {
		return organizationKey;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getOrganizationEmail() {
		return organizationEmail;
	}

	public WebElement getOrganizationNumber() {
		return organizationNumber;
	}

	public WebElement getOrganizationDescription() {
		return organizationDescription;
	}

	public WebElement getOrganizationAddress() {
		return organizationAddress;
	}

	public WebElement getAlternateEmail() {
		return alternateEmail;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getBackButton() {
		return backButton;
	}

	public WebElement getExpandButton() {
		return expandButton;
	}

	public WebElement getMultiBranchRadioButton() {
		return multiBranchRadioButton;
	}

	public WebElement getActiveButton() {
		return activeButton;
	}

	@FindBy(xpath = "//span[text()='Organization Management']")
	private WebElement orgManagement;

	@FindBy(xpath = "//a[normalize-space()='Organizations']")
	private WebElement organizations;

	@FindBy(xpath = "//a[text()='Zones']")
	private WebElement Zones;

	@FindBy(xpath = "//a[text()='Regions']")
	private WebElement Regions;

	@FindBy(xpath = "//a[text()='Branches']")
	private WebElement Branches;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-adduser']")
	private WebElement addUser;

	@FindBy(id = "btn_AddZone")
	private WebElement addNewZone;

	public WebElement getAddNewZone() {
		return addNewZone;
	}

	@FindBy(id = "biz_type")
	private WebElement selectBusinessType;

	@FindBy(id = "org_name")
	private WebElement organizationName;

	@FindBy(id = "org_key")
	private WebElement organizationKey;

	@FindBy(id = "org_link")
	private WebElement organizationLink;

	@FindBy(id = "org_email")
	private WebElement organizationEmail;

	@FindBy(id = "org_number")
	private WebElement organizationNumber;

	@FindBy(xpath = "//textarea[@id='org_des']")
	private WebElement organizationDescription;

	@FindBy(id = "org_address")
	private WebElement organizationAddress;

	@FindBy(id = "org_alt_email")
	private WebElement alternateEmail;

	@FindBy(id = "org-pincode")
	private WebElement pincode;

	@FindBy(id = "logo-id")
	private WebElement logo;

	@FindBy(id = "btnSave")
	private WebElement saveButton;

	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement backButton;

	@FindBy(xpath = "(//a[contains(@class,'fullscreen-link btn btn-default')])[1]")
	private WebElement expandButton;

	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[1]")
	private WebElement multiBranchRadioButton;

	@FindBy(id = "org_isactive")
	private WebElement activeButton;

	@FindBy(id = "stateid")
	private WebElement OrganizationstateId;

	@FindBy(id = "org-city")
	private WebElement organizationCity;

	@FindBy(id = "org-gstin")
	private WebElement organizationGST;

	@FindBy(xpath = "//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement organizationDateAndTime;

	@FindBy(xpath = "//a[@class='navbar-minimalize minimalize-styl-2 btn btn-primary ']")
	private WebElement organizationMinimalizeButton;

	@FindBy(id = "org-pan")
	private WebElement organizationPan;

	public WebElement getOrganizationMinimalizeButton() {
		return organizationMinimalizeButton;
	}

	@FindBy(id = "org-distributioncode")
	private WebElement distributionCode;

	@FindBy(id = "Zone_name")
	private WebElement zoneName;

	@FindBy(id = "zone_code")
	private WebElement zoneCode;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement zoneHomeLink;

	@FindBy(xpath = "//strong[text()='Zones List']")
	private WebElement zoneListLink;

	@FindBy(xpath = "//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement zoneDateAndTime;

	@FindBy(xpath = "//a[@class='navbar-minimalize minimalize-styl-2 btn btn-primary ']")
	private WebElement zoneMinimalizeButton;

	public WebElement getZoneMinimalizeButton() {
		return zoneMinimalizeButton;
	}

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement zoneFilterButton;

	@FindBy(xpath = "//span[text()='Excel']")
	private WebElement zoneExcelEntries;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement zoneCountShow;

	@FindBy(xpath = "//i[@class='fa fa-sign-out']")
	private WebElement zoneLogoutButton;

	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement zoneHelpButton;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement zoneExpandButton;

	@FindBy(id = "zone_description")
	private WebElement zoneDescribtion;

	@FindBy(id = "btn_filter")
	private WebElement zoneApplyFilter;

	@FindBy(id = "btn_filter_clear")
	private WebElement zoneResetFilter;

	@FindBy(xpath = "//select[@id='zone_org']")
	private WebElement zoneOrganizationSelect;

	@FindBy(id = "zone_org")
	private WebElement zoneOrganization;

	@FindBy(id = "zonecontactname")
	private WebElement zoneContactName;

	@FindBy(id = "zonecontctnumber")
	private WebElement zoneContactNumber;

	@FindBy(id = "Zone_email")
	private WebElement zoneContactEmail;

	@FindBy(id = "Zone_close")
	private WebElement zoneCloseButton;

	@FindBy(id = "Zone_update")
	private WebElement zoneSaveButton;

	@FindBy(xpath = "//h2[text()='Organization created successfully']")
	private WebElement createSuccessfullyMessage;

	@FindBy(xpath = "//button[@class='cancel']")
	private WebElement declineWelcomeLetterButton;

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement acceptWelcomeLetterButton;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement regionHomeLink;

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement regionFilterButton;

	@FindBy(id = "region_org")
	private WebElement regionOrganizationSelect;

	@FindBy(id = "region_zone")
	private WebElement regionZoneSelect;

	@FindBy(xpath = "//select[@id='zoneid']")
	private WebElement filter_regionZoneSelect;

	public WebElement getFilter_regionZoneSelect() {
		return filter_regionZoneSelect;
	}

	@FindBy(id = "btn_filter")
	private WebElement regionApplyButton;

	@FindBy(xpath = "//span[@id='select2-reportTable_length-77-container']")
	private WebElement regionCountShow;

	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement regionHelpButton;

	@FindBy(xpath = "//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement regionDateAndTime;

	@FindBy(xpath = "//a[@class='navbar-minimalize minimalize-styl-2 btn btn-primary ']")
	private WebElement regionMinimalizeButton;

	@FindBy(xpath = "//i[@class='fa fa-sign-out']")
	private WebElement regionLogoutButton;

	@FindBy(id = "btn_filter_clear")
	private WebElement regionResetButton;

	@FindBy(xpath = "//span[text()='Excel']")
	private WebElement regionExcelEntries;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement organizationHomeLink;

	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement organizationHelpButton;

	@FindBy(xpath = "//i[@class='//i[@class='fa fa-sign-out']']")
	private WebElement organizationLogoutButton;

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement organizationFilterButton;

	public WebElement getOrganizationstateId() {
		return OrganizationstateId;
	}

	public WebElement getOrganizationGST() {
		return organizationGST;
	}

	public WebElement getOrganizationDateAndTime() {
		return organizationDateAndTime;
	}

	public WebElement getZoneHomeLink() {
		return zoneHomeLink;
	}

	public WebElement getZoneListLink() {
		return zoneListLink;
	}

	public WebElement getZoneDateAndTime() {
		return zoneDateAndTime;
	}

	public WebElement getZoneFilterButton() {
		return zoneFilterButton;
	}

	public WebElement getZoneExcelEntries() {
		return zoneExcelEntries;
	}

	public WebElement getZoneCountShow() {
		return zoneCountShow;
	}

	public WebElement getZoneLogoutButton() {
		return zoneLogoutButton;
	}

	public WebElement getZoneHelpButton() {
		return zoneHelpButton;
	}

	public WebElement getZoneExpandButton() {
		return zoneExpandButton;
	}

	public WebElement getZoneApplyFilter() {
		return zoneApplyFilter;
	}

	public WebElement getZoneResetFilter() {
		return zoneResetFilter;
	}

	public WebElement getZoneOrganizationSelect() {
		return zoneOrganizationSelect;
	}

	public WebElement getRegionHomeLink() {
		return regionHomeLink;
	}

	public WebElement getOrganizationHomeLink() {
		return organizationHomeLink;
	}

	public WebElement getOrganizationHelpButton() {
		return organizationHelpButton;
	}

	public WebElement getOrganizationLogoutButton() {
		return organizationLogoutButton;
	}

	public WebElement getOrganizationFilterButton() {
		return organizationFilterButton;
	}

	public WebElement getOrganizationSelectDropdown() {
		return organizationSelectDropdown;
	}

	public WebElement getOrganizationApplyFilter() {
		return organizationApplyFilter;
	}

	public WebElement getOrganizationResetFilter() {
		return organizationResetFilter;
	}

	public WebElement getOrganizationCountShow() {
		return organizationCountShow;
	}

	public WebElement getOrganizationExcelEntries() {
		return organizationExcelEntries;
	}

	public WebElement getRegionLists() {
		return regionLists;
	}

	public WebElement getOrganizationLists() {
		return organizationLists;
	}

	public WebElement getRegionExpandButton() {
		return regionExpandButton;
	}

	public WebElement getNewRegion() {
		return newRegion;
	}

	@FindBy(id = "select2-orgid-container")
	private WebElement organizationSelectDropdown;

	@FindBy(id = "btn_filter")
	private WebElement organizationApplyFilter;

	@FindBy(id = "btn_filter_clear")
	private WebElement organizationResetFilter;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement organizationCountShow;

	@FindBy(xpath = "//span[text()='Excel']")
	private WebElement organizationExcelEntries;

	@FindBy(xpath = "//strong[text()='Regions List']")
	private WebElement regionLists;

	@FindBy(xpath = "//strong[text()='Organizations List']")
	private WebElement organizationLists;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement regionExpandButton;

	public WebElement getCreateSuccessfullyMessage() {
		return createSuccessfullyMessage;
	}

	public WebElement getDeclineWelcomeLetterButton() {
		return declineWelcomeLetterButton;
	}

	public WebElement getAcceptWelcomeLetterButton() {
		return acceptWelcomeLetterButton;
	}

	@FindBy(xpath = "//ins[@class='iCheck-helper']")
	private WebElement zoneActiveButton;

	@FindBy(xpath = "//a[text()='Regions']")
	private WebElement regions;

	@FindBy(id = "btn_AddRegion")
	private WebElement newRegion;

	public WebElement getZoneName() {
		return zoneName;
	}

	public WebElement getZoneCode() {
		return zoneCode;
	}

	public WebElement getZoneDescribtion() {
		return zoneDescribtion;
	}

	public WebElement getZoneOrganization() {
		return zoneOrganization;
	}

	public WebElement getZoneContactName() {
		return zoneContactName;
	}

	public WebElement getZoneContactNumber() {
		return zoneContactNumber;
	}

	public WebElement getZoneContactEmail() {
		return zoneContactEmail;
	}

	public WebElement getZoneCloseButton() {
		return zoneCloseButton;
	}

	public WebElement getZoneSaveButton() {
		return zoneSaveButton;
	}

	public WebElement getZoneActiveButton() {
		return zoneActiveButton;
	}

	public WebElement getDistributionCode() {
		return distributionCode;
	}

	@FindBy(id = "org-annual")
	private WebElement organizationAnnualTurnOver;

	public WebElement getOrganizationStateId() {
		return OrganizationstateId;
	}

	public WebElement getOrganizationCity() {
		return organizationCity;
	}

	public WebElement getOrganizationPan() {
		return organizationPan;
	}

	public WebElement getOrganizationAnnualTurnOver() {
		return organizationAnnualTurnOver;
	}

	@FindBy(xpath = "//a[text()='Branches']")
	private WebElement branches;

	@FindBy(id = "btn_AddBranch")
	private WebElement addNewBranch;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement branchExpandButton;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement branchHomeLink;

	@FindBy(xpath = "//strong[text()='Branches']")
	private WebElement branchList;

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement branchFilterButton;

	@FindBy(id = "select2-orgid-container")
	private WebElement branchOrganizationSelect;

	@FindBy(xpath = "select2-zoneid-container")
	private WebElement branchZoneSelect;

	@FindBy(xpath = "select2-regionid-container")
	private WebElement branchRegionSelect;

	@FindBy(xpath = "//span[@id='select2-regionid-container']")
	private WebElement FilterBranchregion;

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement FilterBranchApply;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement FilterBranchReset;

	public WebElement getFilterBranchApply() {
		return FilterBranchApply;
	}

	public WebElement getFilterBranchReset() {
		return FilterBranchReset;
	}

	public WebElement getFilterBranchregion() {
		return FilterBranchregion;
	}

	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement branchHelpButton;

	@FindBy(xpath = "//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement branchDateAndTime;

	@FindBy(xpath = "//i[@class='fa fa-sign-out']")
	private WebElement branchLogoutButton;

	@FindBy(xpath = "//a[@class='navbar-minimalize minimalize-styl-2 btn btn-primary ']")
	private WebElement branchMinimalizeButton;

	@FindBy(xpath = "//*[@id=\"reportTable_length\"]/label/select")
	private WebElement branchCountShow;

	@FindBy(xpath = "//button[@class='dt-button buttons-excel buttons-html5']")
	private WebElement branchExcelEntries;

	@FindBy(xpath = "//a[text()='Employees']")
	private WebElement Employees;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-adduser ']")
	private WebElement addNewEmployees;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement employeesExpandButton;

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement employeesFilterButton;

	@FindBy(xpath = "//span[@class='select2 select2-container select2-container--default select2-container--below']")
	private WebElement employeeOrganizationSelect;

	@FindBy(xpath = "//span[@id='select2-orgname-container']")
	private WebElement employeeOrganizationSelectdropdown;

	public WebElement getEmployeeOrganizationSelectdropdown() {
		return employeeOrganizationSelectdropdown;
	}

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement BranchExcel;

	public WebElement getBranchExcel() {
		return BranchExcel;
	}

	@FindBy(xpath = "select2-branchname-container")
	private WebElement employeeBranchSelect;

	@FindBy(id = "btn_filter")
	private WebElement employeeApplyFilter;

	@FindBy(id = "btn_filter_clear")
	private WebElement employeeResetFilter;

	@FindBy(id = "select2-reportTable_length-je-container")
	private WebElement employeeCountShow;

	@FindBy(xpath = "//button[@class='dt-button buttons-excel buttons-html5']")
	private WebElement employeeExcelEntries;

	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement employeeHelpButton;

	@FindBy(xpath = "//i[@class='fa fa-sign-out']")
	private WebElement employeeLogoutButton;

	@FindBy(xpath = "//a[@class='navbar-minimalize minimalize-styl-2 btn btn-primary ']")
	private WebElement employeeMinimalizeButton;

	@FindBy(xpath = "//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement employeeDateAndTime;

	@FindBy(xpath = "//a[text()='Employees List']")
	private WebElement employeeList;

	@FindBy(id = "btnSave")
	private WebElement employeeSaveButton;

	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement employeeBackButton;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement employeeExpandButton;

	@FindBy(id = "emp_code")
	private WebElement employeeCode;

	@FindBy(id = "emp_fst_name")
	private WebElement employeeFirstName;

	@FindBy(id = "emp_last_name")
	private WebElement employeeLastName;

	@FindBy(id = "emp_mob")
	private WebElement employeeMobNum;

	@FindBy(id = "emp_email")
	private WebElement employeeEmail;

	@FindBy(id = "select2-emp_orgid-container")
	private WebElement employee_Ins_OrgSelect;

	@FindBy(id = "select2-emp_branchid-container")
	private WebElement employee_Ins_BranchSelect;

	@FindBy(id = "select2-emp_role_id-container")
	private WebElement employee_Ins_Role;

	@FindBy(xpath = "//label[normalize-space()='Is Insurance Company Employee']")
	private WebElement employeeInsCom;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement employeeInsCompSearch;

	public WebElement getRegionFilterButton() {
		return regionFilterButton;
	}

	public WebElement getRegionOrganizationSelect() {
		return regionOrganizationSelect;
	}

	public WebElement getRegionZoneSelect() {
		return regionZoneSelect;
	}

	public WebElement getRegionApplyButton() {
		return regionApplyButton;
	}

	public WebElement getRegionCountShow() {
		return regionCountShow;
	}

	public WebElement getRegionHelpButton() {
		return regionHelpButton;
	}

	public WebElement getRegionDateAndTime() {
		return regionDateAndTime;
	}

	public WebElement getRegionMinimalizeButton() {
		return regionMinimalizeButton;
	}

	public WebElement getRegionLogoutButton() {
		return regionLogoutButton;
	}

	public WebElement getRegionResetButton() {
		return regionResetButton;
	}

	public WebElement getRegionExcelEntries() {
		return regionExcelEntries;
	}

	public WebElement getAddNewBranch() {
		return addNewBranch;
	}

	public WebElement getBranchExpandButton() {
		return branchExpandButton;
	}

	public WebElement getBranchHomeLink() {
		return branchHomeLink;
	}

	public WebElement getBranchList() {
		return branchList;
	}

	public WebElement getBranchFilterButton() {
		return branchFilterButton;
	}

	public WebElement getBranchOrganizationSelect() {
		return branchOrganizationSelect;
	}

	public WebElement getBranchZoneSelect() {
		return branchZoneSelect;
	}

	public WebElement getBranchRegionSelect() {
		return branchRegionSelect;
	}

	public WebElement getBranchHelpButton() {
		return branchHelpButton;
	}

	public WebElement getBranchDateAndTime() {
		return branchDateAndTime;
	}

	public WebElement getBranchLogoutButton() {
		return branchLogoutButton;
	}

	public WebElement getBranchMinimalizeButton() {
		return branchMinimalizeButton;
	}

	public WebElement getBranchCountShow() {
		return branchCountShow;
	}

	public WebElement getBranchExcelEntries() {
		return branchExcelEntries;
	}

	public WebElement getAddNewEmployees() {
		return addNewEmployees;
	}

	public WebElement getEmployeesExpandButton() {
		return employeesExpandButton;
	}

	public WebElement getEmployeesFilterButton() {
		return employeesFilterButton;
	}

	public WebElement getEmployeeOrganizationSelect() {
		return employeeOrganizationSelect;
	}

	public WebElement getEmployeeBranchSelect() {
		return employeeBranchSelect;
	}

	public WebElement getEmployeeApplyFilter() {
		return employeeApplyFilter;
	}

	public WebElement getEmployeeResetFilter() {
		return employeeResetFilter;
	}

	public WebElement getEmployeeCountShow() {
		return employeeCountShow;
	}

	public WebElement getEmployeeExcelEntries() {
		return employeeExcelEntries;
	}

	public WebElement getEmployeeHelpButton() {
		return employeeHelpButton;
	}

	public WebElement getEmployeeLogoutButton() {
		return employeeLogoutButton;
	}

	public WebElement getEmployeeMinimalizeButton() {
		return employeeMinimalizeButton;
	}

	public WebElement getEmployeeDateAndTime() {
		return employeeDateAndTime;
	}

	public WebElement getEmployeeList() {
		return employeeList;
	}

	public WebElement getEmployeeSaveButton() {
		return employeeSaveButton;
	}

	public WebElement getEmployeeBackButton() {
		return employeeBackButton;
	}

	public WebElement getEmployeeExpandButton() {
		return employeeExpandButton;
	}

	public WebElement getEmployeeCode() {
		return employeeCode;
	}

	public WebElement getEmployeeFirstName() {
		return employeeFirstName;
	}

	public WebElement getEmployeeLastName() {
		return employeeLastName;
	}

	public WebElement getEmployeeMobNum() {
		return employeeMobNum;
	}

	public WebElement getEmployeeEmail() {
		return employeeEmail;
	}

	public WebElement getEmployee_Ins_OrgSelect() {
		return employee_Ins_OrgSelect;
	}

	public WebElement getEmployee_Ins_BranchSelect() {
		return employee_Ins_BranchSelect;
	}

	public WebElement getEmployee_Ins_Role() {
		return employee_Ins_Role;
	}

	public WebElement getEmployeeInsCom() {
		return employeeInsCom;
	}

	public WebElement getEmployeeInsCompSearch() {
		return employeeInsCompSearch;
	}

	public WebElement getInsuranceMinimalizeButton() {
		return insuranceMinimalizeButton;
	}

	public WebElement getInsuranceDateAndTime() {
		return insuranceDateAndTime;
	}

	public WebElement getInsuranceHelpButton() {
		return insuranceHelpButton;
	}

	public WebElement getInsuranceLogoutButton() {
		return insuranceLogoutButton;
	}

	public WebElement getInsuranceHomeLink() {
		return insuranceHomeLink;
	}

	public WebElement getInsuranceAddNewComp() {
		return insuranceAddNewComp;
	}

	public WebElement getInsuranceFilterButton() {
		return insuranceFilterButton;
	}

	public WebElement getInsuranceCompName() {
		return insuranceCompName;
	}

	public WebElement getInsuranceApplyFilter() {
		return insuranceApplyFilter;
	}

	public WebElement getInsuranceResetFilter() {
		return insuranceResetFilter;
	}

	public WebElement getInsuranceCompSelect() {
		return insuranceCompSelect;
	}

	public WebElement getInsuranceListLink() {
		return insuranceListLink;
	}

	public WebElement getInsuranceCompKey() {
		return insuranceCompKey;
	}

	public WebElement getInsuranceCompEmail() {
		return insuranceCompEmail;
	}

	public WebElement getInsuranceCompNumber() {
		return insuranceCompNumber;
	}

	public WebElement getInsuranceCompCity() {
		return insuranceCompCity;
	}

	public WebElement getInsuranceCompWebsite() {
		return insuranceCompWebsite;
	}

	public WebElement getInsuranceCompAddress() {
		return insuranceCompAddress;
	}

	public WebElement getInsuranceCompDescription() {
		return insuranceCompDescription;
	}

	public WebElement getInsuranceCompClose() {
		return insuranceCompClose;
	}

	public WebElement getInsuranceCompSave() {
		return insuranceCompSave;
	}

	@FindBy(xpath = "//a[text()='Insurance Company']")
	private WebElement insuranceCompany;

	@FindBy(xpath = "//a[@class='navbar-minimalize minimalize-styl-2 btn btn-primary ']")
	private WebElement insuranceMinimalizeButton;

	@FindBy(xpath = "//span[@class='m-r-sm text-muted welcome-message']")
	private WebElement insuranceDateAndTime;

	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement insuranceHelpButton;

	@FindBy(xpath = "//i[@class='fa fa-sign-out']")
	private WebElement insuranceLogoutButton;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement insuranceHomeLink;

	@FindBy(id = "btn_AddCompany")
	private WebElement insuranceAddNewComp;

	@FindBy(xpath = "//*[@id=\"tab-1\"]/div/div[1]/div[1]/div/a/i")
	private WebElement insuranceFilterButton;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement insuranceExcel;

	public WebElement getInsuranceExcel() {
		return insuranceExcel;
	}

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement insuranceCompanyNameDropdown;

	public WebElement getInsuranceCompanyNameDropdown() {
		return insuranceCompanyNameDropdown;
	}

	@FindBy(id = "companyname")
	private WebElement insuranceCompName;

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement insuranceApplyFilter;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement insuranceResetFilter;

	@FindBy(id = "select2-insname-container")
	private WebElement insuranceCompSelect;

	@FindBy(xpath = "//strong[text()='Insurance Companies List']")
	private WebElement insuranceListLink;

	@FindBy(id = "inskey")
	private WebElement insuranceCompKey;

	@FindBy(id = "companymail")
	private WebElement insuranceCompEmail;

	@FindBy(id = "companynumber")
	private WebElement insuranceCompNumber;

	@FindBy(id = "companycity")
	private WebElement insuranceCompCity;

	@FindBy(id = "companywebsite")
	private WebElement insuranceCompWebsite;

	@FindBy(id = "companyaddress")
	private WebElement insuranceCompAddress;

	@FindBy(id = "companydec")
	private WebElement insuranceCompDescription;

	@FindBy(xpath = "//button[text()='Close']")
	private WebElement insuranceCompClose;

	@FindBy(id = "Company_update")
	private WebElement insuranceCompSave;

	@FindBy(xpath = "//h2[text()='Organization created successfully']")
	private WebElement organizationCreatSucessfull;

	public WebElement getOrganizationCreatSucessfull() {
		return organizationCreatSucessfull;
	}

	@FindBy(id = "Region_name")
	private WebElement regionName;

	@FindBy(id = "region_description")
	private WebElement regionDes;

	@FindBy(id = "Region_code")
	private WebElement regionCode;

	@FindBy(id = "Region_contactname")
	private WebElement regionContactName;

	@FindBy(id = "region_contactnumber")
	private WebElement regionContactNumber;

	@FindBy(id = "region_contactemail")
	private WebElement regionContactEmail;

	@FindBy(id = "Region_update")
	private WebElement regionSaveButton;

	@FindBy(id = "RegionModal_Close")
	private WebElement regionCloseButton;

	@FindBy(xpath = "//ins[@class='iCheck-helper']")
	private WebElement regionActiveButton;

	public WebElement getRegionName() {
		return regionName;
	}

	public WebElement getRegionDes() {
		return regionDes;
	}

	public WebElement getRegionCode() {
		return regionCode;
	}

	public WebElement getRegionContactName() {
		return regionContactName;
	}

	public WebElement getRegionContactNumber() {
		return regionContactNumber;
	}

	public WebElement getRegionContactEmail() {
		return regionContactEmail;
	}

	public WebElement getRegionSaveButton() {
		return regionSaveButton;
	}

	public WebElement getRegionCloseButton() {
		return regionCloseButton;
	}

	public WebElement getRegionActiveButton() {
		return regionActiveButton;
	}

	@FindBy(id = "branch_name")
	private WebElement branchName;

	@FindBy(id = "branch_code")
	private WebElement branchCode;

	@FindBy(id = "branch_org")
	private WebElement branchSelectOrg;

	@FindBy(id = "branch_zone")
	private WebElement branchSelectZone;

	@FindBy(id = "branch_region")
	private WebElement branchSelectRegion;

	@FindBy(id = "branch_Contactname")
	private WebElement branchConName;

	@FindBy(id = "branch_contactnumber")
	private WebElement branchConNum;

	@FindBy(id = "branch_contactemail")
	private WebElement branchConEmail;

	@FindBy(id = "branch_pincode")
	private WebElement branchPincode;

	@FindBy(id = "branchaddress")
	private WebElement branchAddress;

	@FindBy(id = "branch_close")
	private WebElement branchCloseButton;

	@FindBy(id = "Branch_update")
	private WebElement branchSaveButton;

	@FindBy(xpath = "//ins[@class='iCheck-helper']")
	private WebElement branchActiveButton;

	public WebElement getBranchName() {
		return branchName;
	}

	public WebElement getBranchCode() {
		return branchCode;
	}

	public WebElement getBranchSelectOrg() {
		return branchSelectOrg;
	}

	public WebElement getBranchSelectZone() {
		return branchSelectZone;
	}

	public WebElement getBranchSelectRegion() {
		return branchSelectRegion;
	}

	public WebElement getBranchConName() {
		return branchConName;
	}

	public WebElement getBranchConNum() {
		return branchConNum;
	}

	public WebElement getBranchConEmail() {
		return branchConEmail;
	}

	public WebElement getBranchPincode() {
		return branchPincode;
	}

	public WebElement getBranchAddress() {
		return branchAddress;
	}

	public WebElement getBranchCloseButton() {
		return branchCloseButton;
	}

	public WebElement getBranchSaveButton() {
		return branchSaveButton;
	}

	public WebElement getBranchActiveButton() {
		return branchActiveButton;
	}

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']")
	private WebElement employeeOrgSelect;

	public WebElement getEmployeeOrgSelect() {
		return employeeOrgSelect;
	}

	@FindBy(xpath = "//span[@id='select2-emp_reporting_to-container']")
	private WebElement employeeReporting;

	public WebElement getEmployeeReporting() {
		return employeeReporting;
	}

	@FindBy(xpath = "//button[@class='cancel']")
	private WebElement organizationCancelButton;

	public WebElement getOrganizationCancelButton() {
		return organizationCancelButton;
	}

	@FindBy(xpath = "//span[@id='select2-orgid-container']")
	private WebElement FilterOrganization;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement OrganizationExcel;

	@FindBy(xpath = "//span[@id='select2-reportTable_length-zj-container']")
	private WebElement showselect;

	public WebElement getShowselect() {
		return showselect;
	}

	public WebElement getOrganizationExcel() {
		return OrganizationExcel;
	}

	public WebElement getFilterOrganization() {
		return FilterOrganization;
	}

	// ============================================Admin
	// organization=========================//

	@FindBy(xpath = "//*[@id=\"filterreportTable_length\"]/label/select")
	private WebElement Admin_showcount;

	@FindBy(xpath = "//*[@id=\"reportTable_length\"]/label/span")
	private WebElement AdminOrg_Employeeshowcount;

	public WebElement getAdminOrg_Employeeshowcount() {
		return AdminOrg_Employeeshowcount;
	}

	public WebElement getAdmin_showcount() {
		return Admin_showcount;
	}
//---------------------------------------------------------------------------

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/a[1]")
	private WebElement org_Edit;

	@FindBy(xpath = "//a[@id='btn_AddZone']")
	private WebElement org_AddNewzone;

	@FindBy(xpath = "//a[@id='btn_AddRegion']")
	private WebElement org_AddNewRegion;

	@FindBy(xpath = "//button[@id='Zone_add']")
	private WebElement org_zoneSave;

	@FindBy(xpath = "//input[@id='region_name']")
	private WebElement org_regionname;

	@FindBy(xpath = "//input[@id='region_code']")
	private WebElement org_regioncode;

	@FindBy(xpath = "//select[@id='org_region_zone']")
	private WebElement org_regionzonedropdown;

	@FindBy(xpath = "//input[@id='region_contactname']")
	private WebElement org_regioncontactName;

	@FindBy(xpath = "//button[@id='regionsave']")
	private WebElement org_regionsave;

	public WebElement getOrg_regionsave() {
		return org_regionsave;
	}

	public WebElement getOrg_regionzonedropdown() {
		return org_regionzonedropdown;
	}

	public WebElement getOrg_regioncontactName() {
		return org_regioncontactName;
	}

	public WebElement getOrg_regioncode() {
		return org_regioncode;
	}

	public WebElement getOrg_regionname() {
		return org_regionname;
	}

	public WebElement getOrg_zoneSave() {
		return org_zoneSave;
	}

	public WebElement getOrg_AddNewzone() {
		return org_AddNewzone;
	}

	public WebElement getOrg_AddNewRegion() {
		return org_AddNewRegion;
	}

	public WebElement getOrg_Edit() {
		return org_Edit;
	}

	// ==========================================================

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement org_conformbutton;

	@FindBy(xpath = "//div[@class='text-right']//a[@title='Send'][normalize-space()='Send']")
	private WebElement org_conform_emailsend;

	public WebElement getOrg_conform_emailsend() {
		return org_conform_emailsend;
	}

	public WebElement getOrg_conformbutton() {
		return org_conformbutton;
	}

	// -------------------------------new add--------------
	@FindBy(xpath = "//select[@id='zone_org']")
	private WebElement org_zone;

	@FindBy(xpath = "//select[@id='region_org']")
	private WebElement org_Regions;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getOrg_Regions() {
		return org_Regions;
	}

	public WebElement getOrg_zone() {
		return org_zone;
	}

	@FindBy(xpath = "//select[@id='stateid']")
	private WebElement org_State;
	@FindBy(xpath = "//input[@id='org-city']")
	private WebElement or_City;
	@FindBy(xpath = "//input[@id='org-gstin']")
	private WebElement org_GST;
	@FindBy(xpath = "//input[@id='org-pan']")
	private WebElement org_PAN;
	@FindBy(xpath = "//input[@id='org-annual']")
	private WebElement org_Annual;
	@FindBy(xpath = "//textarea[@id='org_des']")
	private WebElement org_Description;

	public WebElement getOrg_State() {
		return org_State;
	}

	public WebElement getOr_City() {
		return or_City;
	}

	public WebElement getOrg_GST() {
		return org_GST;
	}

	public WebElement getOrg_PAN() {
		return org_PAN;
	}

	public WebElement getOrg_Annual() {
		return org_Annual;
	}

	public WebElement getOrg_Description() {
		return org_Description;
	}

	// -------------------------------------

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement FilterOrganizationselect;

	@FindBy(xpath = "//select[@name='filterreportTable_length']")
	private WebElement FilterOrganizationshow;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/a[1]")
	private WebElement org_Editoption;

	@FindBy(xpath = "	//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	private WebElement EditZonefilter;

	@FindBy(xpath = "	//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")
	private WebElement Regioneditbutton;

	@FindBy(xpath = "	//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
	private WebElement BranchEdit;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/a[1]")
	private WebElement FilterEmployeeedit;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")
	private WebElement insuranceEdit;

	public WebElement getInsuranceEdit() {
		return insuranceEdit;
	}

	public WebElement getFilterEmployeeedit() {
		return FilterEmployeeedit;
	}

	public WebElement getBranchEdit() {
		return BranchEdit;
	}

	public WebElement getRegioneditbutton() {
		return Regioneditbutton;
	}

	@FindBy(xpath = "//select[@id='zoneid']")
	private WebElement RegionfilterZone;

	public WebElement getRegionfilterZone() {
		return RegionfilterZone;
	}

	public WebElement getEditZonefilter() {
		return EditZonefilter;
	}

	public WebElement getOrg_Editoption() {
		return org_Editoption;
	}

	public WebElement getFilterOrganizationshow() {
		return FilterOrganizationshow;
	}

	public WebElement getFilterOrganizationselect() {
		return FilterOrganizationselect;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	private WebElement zoneedit;

	public WebElement getzoneedit() {
		return zoneedit;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")
	private WebElement regioneditbtn;

	public WebElement getregioneditbtn() {
		return regioneditbtn;
	}

	@FindBy(xpath = "//button[@id='RegionModal_Close']")
	private WebElement regionclosebtn;

	public WebElement getregionclosebtn() {
		return regionclosebtn;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]")
	private WebElement Admin_regioneditbtn;

	public WebElement getAdmin_regioneditbtn() {
		return Admin_regioneditbtn;
	}

	@FindBy(xpath = "//button[@id='RegionModal_Close']")
	private WebElement Admin_regionclosebtn;

	public WebElement getAdmin_regionclosebtn() {
		return Admin_regionclosebtn;
	}

	@FindBy(xpath = "//tr[@class='odd']//a[@class='btn btn-success btn-xs']")
	private WebElement Admin_brancheditbtn;

	public WebElement getAdmin_brancheditbtn() {
		return Admin_brancheditbtn;
	}

	@FindBy(xpath = "//button[@id='branch_close']")
	private WebElement Admin_branchclosebtn;

	public WebElement getAdmin_branchclosebtn() {
		return Admin_branchclosebtn;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
	private WebElement brancheditbtn;

	public WebElement getbrancheditbtn() {
		return brancheditbtn;
	}

	@FindBy(xpath = "//select[@id='regionid']")
	private WebElement branchregionfilter;

	public WebElement getbranchregionfilter() {
		return branchregionfilter;
	}

	@FindBy(xpath = "//select[@id='branch_org']")
	private WebElement branchNeworganization;

	public WebElement getbranchNeworganization() {
		return branchNeworganization;
	}

	@FindBy(xpath = "//select[@id='branch_zone']")
	private WebElement selectbranchNewzone;

	public WebElement getselectbranchNewzone() {
		return selectbranchNewzone;
	}

	@FindBy(xpath = "//select[@id='branch_region']")
	private WebElement selectbranchNewregion;

	public WebElement getselectbranchNewregion() {
		return selectbranchNewregion;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]")
	private WebElement Employeelisteditbtn;

	public WebElement getEmployeelisteditbtn() {
		return Employeelisteditbtn;
	}

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement Admin_employeebackbtn;

	public WebElement getAdmin_employeebackbtn() {
		return Admin_employeebackbtn;
	}

	// -----------------corporate flow--------------------------//
	@FindBy(xpath = "//select[@id='stateid']")
	private WebElement org_state;

	@FindBy(xpath = "//input[@id='org-city']")
	private WebElement org_city;

	@FindBy(xpath = "//input[@id='org-gstin']")
	private WebElement org_GSTIN;

	@FindBy(xpath = "//input[@id='org-pan']")
	private WebElement org_PANno;

	@FindBy(xpath = "//input[@id='org-annual']")
	private WebElement org_annualturnover;

	@FindBy(xpath = "//select[@id='emp_role_id']")
	private WebElement org_employeeRole;

	@FindBy(xpath = "//select[@id='emp_orgid']")
	private WebElement org_employeeorg;

	@FindBy(xpath = "//select[@id='emp_branchid']")
	private WebElement org_employeebranch;

	@FindBy(xpath = "//select[@id='emp_reporting_to']")
	private WebElement org_employeereportingemployee;

	public WebElement getOrg_employeereportingemployee() {
		return org_employeereportingemployee;
	}

	public WebElement getOrg_employeebranch() {
		return org_employeebranch;
	}

	public WebElement getOrg_employeeorg() {
		return org_employeeorg;
	}

	public WebElement getOrg_employeeRole() {
		return org_employeeRole;
	}

	public WebElement getOrg_state() {
		return org_state;
	}

	public WebElement getOrg_city() {
		return org_city;
	}

	public WebElement getOrg_GSTIN() {
		return org_GSTIN;
	}

	public WebElement getOrg_PANno() {
		return org_PANno;
	}

	public WebElement getOrg_annualturnover() {
		return org_annualturnover;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]")
	private WebElement organizationedit;

	public WebElement getorganizationedit() {
		return organizationedit;
	}

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement organizationselect;

	public WebElement getorganizationselect() {
		return organizationselect;
	}

	@FindBy(xpath = "//select[@id='orgname']")
	private WebElement Employeeorg;

	public WebElement getEmployeeorg() {
		return Employeeorg;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")
	private WebElement Insurancecompanyedit;

	public WebElement getInsurancecompanyedit() {
		return Insurancecompanyedit;
	}

	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement Insurancecompanyclosebtn;

	public WebElement getInsurancecompanyclosebtn() {
		return Insurancecompanyclosebtn;
	}

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement insuranceCompanyfilterdrill;

	public WebElement getinsuranceCompanyfilterdrill() {
		return insuranceCompanyfilterdrill;
	}

	@FindBy(xpath = "//select[@id='insname']")
	private WebElement Insurancecompanynamefilter;

	public WebElement getInsurancecompanynamefilter() {
		return Insurancecompanynamefilter;
	}
	
	@FindBy(xpath = "//a[normalize-space()='Insurance Company']")
	private WebElement Insurancecompany;

	public WebElement getInsurancecompany() {
		return Insurancecompany;
	}
	
	

	public OrganizationManagement() {
		PageFactory.initElements(driver, this);
	}

}
