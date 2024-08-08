package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagement extends BaseClass {

	@FindBy(xpath = "//span[normalize-space()='User Management']")
	private WebElement userManagement;

	// RoleList

	@FindBy(xpath = "//a[normalize-space()='Roles List']")
	private WebElement umRoleList;

	@FindBy(xpath = "//a[@id='btn_AddRole']")
	private WebElement umNewRole;

	@FindBy(xpath = "//input[@id='rolename']")
	private WebElement umRoleName;
	@FindBy(xpath = "//textarea[@id='roledescription']")
	private WebElement umRoleDescripption;

	@FindBy(xpath = "//ins[@class='iCheck-helper']")
	private WebElement umCheckBox;

	@FindBy(xpath = "//button[@id='Role_update']")
	private WebElement umSaveButton;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement umCancelButton;
	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement umShow;
	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement umExcelEntires;
	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement umRoleExpand;

	// User

	@FindBy(xpath = "//a[normalize-space()='Users']")
	private WebElement umUser;

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement umuserFilter;

	@FindBy(xpath = "//select[@id='orgname']")
	private WebElement umOrg;
	@FindBy(xpath = "//select[@id='branchname']")
	private WebElement umBranch;

	@FindBy(xpath = "//input[@id='filter_empcode']")
	private WebElement umEmployee;

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement umApply;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement umReset;

	@FindBy(xpath = "//*[@id=\"reportTable\"]/tbody/tr[1]/td[7]/a")
	private WebElement umEdit;
	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement umUserShow;
	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement umUserExcel;
	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement umUserExpand;

	// Menu Items//

	public WebElement getUmUseExpand() {
		return umUserExpand;
	}

	@FindBy(xpath = "//a[normalize-space()='Menu Items']")
	private WebElement umMenuIteams;

	@FindBy(xpath = "//*[@id=\"btn_AddRole\"]")
	private WebElement umMenuIteamNewButton;

	@FindBy(xpath = "//*[@id=\"menu_title\"]")
	private WebElement umMenuIteamTitle;

	@FindBy(xpath = "//*[@id=\"menu_controller\"]")
	private WebElement umMenuIteamController;

	@FindBy(xpath = "//*[@id=\"menu_action\"]")
	private WebElement umMenuIteamAction;

	@FindBy(xpath = "//*[@id=\"menu_query\"]")
	private WebElement umMenuIteamQuery;

	@FindBy(xpath = "//*[@id=\"parentid\"]")
	private WebElement umMenuIteamParent;

	@FindBy(xpath = "//*[@id=\"menu_icon\"]")
	private WebElement umMenuIteamIcon;

	@FindBy(xpath = "//div[@class='col-md-3']//label[1]//input[1]")
	private WebElement umMenuIteamRadioButton1;

	@FindBy(xpath = "//label[2]//input[1]")
	private WebElement umMenuIteamRadioButton2;

	@FindBy(id = "order_by")
	private WebElement umMenuIteamOrderBy;

	// Roles//
	@FindBy(xpath = "//*[@id=\"menu_roles\"]")
	private WebElement umMenuIteamsuper;

	@FindBy(xpath = "//label[normalize-space()='OrgFinanceAdmin']")
	private WebElement umMenuIteamOrg;

	@FindBy(xpath = "//label[normalize-space()='Sri Laxmi Prasa']")
	private WebElement umMenuIteamSriLaxmi;

	@FindBy(xpath = "//label[normalize-space()='Admin']//input[@id='menu_roles']")
	private WebElement umMenuIteamAdmin;

	@FindBy(xpath = "//label[normalize-space()='Employee']")
	private WebElement umMenuIteamEmployee;

	@FindBy(xpath = "//label[normalize-space()='Product Alert Setting']")
	private WebElement umMenuIteamProductAlert;

	@FindBy(xpath = "//label[normalize-space()='User']")
	private WebElement umMenuIteamUser;

	@FindBy(xpath = "//label[normalize-space()='Test']//input[@id='menu_roles']")
	private WebElement umMenuIteamTest;

	@FindBy(xpath = "//label[normalize-space()='Nodal Officer']")
	private WebElement umMenuIteamNodelOfficer;

	@FindBy(xpath = "//label[normalize-space()='Checker']//input[@id='menu_roles']")
	private WebElement umMenuIteamChecker;
	@FindBy(xpath = "//label[normalize-space()='Maker']//input[@id='menu_roles']")
	private WebElement umMenuIteamMaker;
	@FindBy(xpath = "//label[normalize-space()='rolesfive']")
	private WebElement umMenuIteamRolesfive;
	@FindBy(xpath = "//div[13]//label[1]//input[1]")
	private WebElement umMenuIteamPlicyHolder;
	@FindBy(xpath = "//label[normalize-space()='Test D']")
	private WebElement umMenuIteamTestD;
	@FindBy(xpath = "//label[normalize-space()='Field Officer']")
	private WebElement umMenuIteamFieldOfficer;

	@FindBy(xpath = "//label[normalize-space()='Inspector']")
	private WebElement umMenuIteamInsppector;

	@FindBy(xpath = "//label[normalize-space()='InsuranceHead']")
	private WebElement umMenuIteamInsureHead;

	@FindBy(xpath = "//label[normalize-space()='insert']")
	private WebElement umMenuIteamInsert;

	@FindBy(xpath = "//label[normalize-space()='role testing']")
	private WebElement umMenuIteamRoleTesting;

	@FindBy(xpath = "//label[normalize-space()='service manager']")
	private WebElement umMenuIteamServiceManager;

	@FindBy(xpath = "//label[normalize-space()='RoleOne']")
	private WebElement umMenuIteamRoleOne;
	@FindBy(xpath = "//label[normalize-space()='Roletwo']")
	private WebElement umMenuIteamRoleTwo;
	@FindBy(xpath = "//label[normalize-space()='Rolethree']")
	private WebElement umMenuIteamRoleThree;
	@FindBy(xpath = "//label[normalize-space()='sales Manager']")
	private WebElement umMenuIteamSalesManager;
	@FindBy(xpath = "//label[normalize-space()='jrdev']")
	private WebElement umMenuIteamJrDev;
	@FindBy(xpath = "//label[normalize-space()='FinanceChecker']")
	private WebElement umMenuIteamFinanceChecker;
	@FindBy(xpath = "//label[normalize-space()='InsuranceClaimAdmin']")
	private WebElement umMenuIteamInsuranceClaimAdmin;
	@FindBy(xpath = "//label[normalize-space()='Claims Admin']")
	private WebElement umMenuIteamClaimsAdmin;
	@FindBy(xpath = "//label[normalize-space()='Internal Endorsement Maker']")
	private WebElement umMenuIteamInternalEndorsementMaker;

	@FindBy(xpath = "//label[normalize-space()='Internal Endorsement Checker']")
	private WebElement umMenuIteamInternalEndorsementChecker;
	@FindBy(xpath = "//label[normalize-space()='prassu']")
	private WebElement umMenuIteamPrassu;

	@FindBy(xpath = "//label[normalize-space()='PowerAdmin']")
	private WebElement umMenuIteamPowerAdmin;
	@FindBy(xpath = "//label[normalize-space()='Policies Data Admin']")
	private WebElement umMenuIteamPoliciesData;

	@FindBy(xpath = "//label[normalize-space()='CorporateAdmin']")
	private WebElement umMenuIteamCorporateAdmin;

	@FindBy(xpath = "//div[39]//label[1]//input[1]")
	private WebElement umMenuIteamPolicyHolder;

	@FindBy(xpath = "//button[@id='save_menuitem']")
	private WebElement umMenuIteamSaveButton;

	@FindBy(xpath = "//*[@id=\"pageactions\"]/div/a[1]")
	private WebElement umMenuIteamBackButton;

	@FindBy(xpath = "//label[normalize-space()='Product Checker']")
	private WebElement umMenuIteamProductChecker;

	@FindBy(xpath = "//label[normalize-space()='Product Maker']")
	private WebElement umMenuIteamProductMaker;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement umMenuItemShow;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement umMenuItemExcel;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement umMenuItemExpand;

	public WebElement getUserManagement() {
		return userManagement;
	}

	public WebElement getUmRoleList() {
		return umRoleList;
	}

	public WebElement getUmNewRole() {
		return umNewRole;
	}

	public WebElement getUmRoleName() {
		return umRoleName;
	}

	public WebElement getUmRoleDescripption() {
		return umRoleDescripption;
	}

	public WebElement getUmCheckBox() {
		return umCheckBox;
	}

	public WebElement getUmSaveButton() {
		return umSaveButton;
	}

	public WebElement getUmCancelButton() {
		return umCancelButton;
	}

	public WebElement getUmShow() {
		return umShow;
	}

	public WebElement getUmExcelEntires() {
		return umExcelEntires;
	}

	public WebElement getUmRoleExpand() {
		return umRoleExpand;
	}

	public WebElement getUmUser() {
		return umUser;
	}

	public WebElement getUmuserFilter() {
		return umuserFilter;
	}

	public WebElement getUmOrg() {
		return umOrg;
	}

	public WebElement getUmBranch() {
		return umBranch;
	}

	public WebElement getUmEmployee() {
		return umEmployee;
	}

	public WebElement getUmApply() {
		return umApply;
	}

	public WebElement getUmReset() {
		return umReset;
	}

	public WebElement getUmEdit() {
		return umEdit;
	}

	public WebElement getUmUserShow() {
		return umUserShow;
	}

	public WebElement getUmUserExcel() {
		return umUserExcel;
	}

	public WebElement getUmMenuIteams() {
		return umMenuIteams;
	}

	public WebElement getUmMenuIteamNewButton() {
		return umMenuIteamNewButton;
	}

	public WebElement getUmMenuIteamTitle() {
		return umMenuIteamTitle;
	}

	public WebElement getUmMenuIteamController() {
		return umMenuIteamController;
	}

	public WebElement getUmMenuIteamAction() {
		return umMenuIteamAction;
	}

	public WebElement getUmMenuIteamQuery() {
		return umMenuIteamQuery;
	}

	public WebElement getUmMenuIteamParent() {
		return umMenuIteamParent;
	}

	public WebElement getUmMenuIteamIcon() {
		return umMenuIteamIcon;
	}

	public WebElement getUmMenuIteamRadioButton1() {
		return umMenuIteamRadioButton1;
	}

	public WebElement getUmMenuIteamRadioButton2() {
		return umMenuIteamRadioButton2;
	}

	public WebElement getUmMenuIteamOrderBy() {
		return umMenuIteamOrderBy;
	}

	public WebElement getUmMenuIteamsuper() {
		return umMenuIteamsuper;
	}

	public WebElement getUmMenuIteamOrg() {
		return umMenuIteamOrg;
	}

	public WebElement getUmMenuIteamSriLaxmi() {
		return umMenuIteamSriLaxmi;
	}

	public WebElement getUmMenuIteamAdmin() {
		return umMenuIteamAdmin;
	}

	public WebElement getUmMenuIteamEmployee() {
		return umMenuIteamEmployee;
	}

	public WebElement getUmMenuIteamProductAlert() {
		return umMenuIteamProductAlert;
	}

	public WebElement getUmMenuIteamUser() {
		return umMenuIteamUser;
	}

	public WebElement getUmMenuIteamTest() {
		return umMenuIteamTest;
	}

	public WebElement getUmMenuIteamNodelOfficer() {
		return umMenuIteamNodelOfficer;
	}

	public WebElement getUmMenuIteamChecker() {
		return umMenuIteamChecker;
	}

	public WebElement getUmMenuIteamMaker() {
		return umMenuIteamMaker;
	}

	public WebElement getUmMenuIteamRolesfive() {
		return umMenuIteamRolesfive;
	}

	public WebElement getUmMenuIteamPlicyHolder() {
		return umMenuIteamPlicyHolder;
	}

	public WebElement getUmMenuIteamTestD() {
		return umMenuIteamTestD;
	}

	public WebElement getUmMenuIteamFieldOfficer() {
		return umMenuIteamFieldOfficer;
	}

	public WebElement getUmMenuIteamInsppector() {
		return umMenuIteamInsppector;
	}

	public WebElement getUmMenuIteamInsureHead() {
		return umMenuIteamInsureHead;
	}

	public WebElement getUmMenuIteamInsert() {
		return umMenuIteamInsert;
	}

	public WebElement getUmMenuIteamRoleTesting() {
		return umMenuIteamRoleTesting;
	}

	public WebElement getUmMenuIteamServiceManager() {
		return umMenuIteamServiceManager;
	}

	public WebElement getUmMenuIteamRoleOne() {
		return umMenuIteamRoleOne;
	}

	public WebElement getUmMenuIteamRoleTwo() {
		return umMenuIteamRoleTwo;
	}

	public WebElement getUmMenuIteamRoleThree() {
		return umMenuIteamRoleThree;
	}

	public WebElement getUmMenuIteamSalesManager() {
		return umMenuIteamSalesManager;
	}

	public WebElement getUmMenuIteamJrDev() {
		return umMenuIteamJrDev;
	}

	public WebElement getUmMenuIteamFinanceChecker() {
		return umMenuIteamFinanceChecker;
	}

	public WebElement getUmMenuIteamInsuranceClaimAdmin() {
		return umMenuIteamInsuranceClaimAdmin;
	}

	public WebElement getUmMenuIteamClaimsAdmin() {
		return umMenuIteamClaimsAdmin;
	}

	public WebElement getUmMenuIteamInternalEndorsementMaker() {
		return umMenuIteamInternalEndorsementMaker;
	}

	public WebElement getUmMenuIteamInternalEndorsementChecker() {
		return umMenuIteamInternalEndorsementChecker;
	}

	public WebElement getUmMenuIteamPrassu() {
		return umMenuIteamPrassu;
	}

	public WebElement getUmMenuIteamPowerAdmin() {
		return umMenuIteamPowerAdmin;
	}

	public WebElement getUmMenuIteamPoliciesData() {
		return umMenuIteamPoliciesData;
	}

	public WebElement getUmMenuIteamCorporateAdmin() {
		return umMenuIteamCorporateAdmin;
	}

	public WebElement getUmMenuIteamPolicyHolder() {
		return umMenuIteamPolicyHolder;
	}

	public WebElement getUmMenuIteamSaveButton() {
		return umMenuIteamSaveButton;
	}

	public WebElement getUmMenuIteamBackButton() {
		return umMenuIteamBackButton;
	}

	public WebElement getUmMenuIteamProductChecker() {
		return umMenuIteamProductChecker;
	}

	public WebElement getUmMenuIteamProductMaker() {
		return umMenuIteamProductMaker;
	}

	public WebElement getUmMenuItemShow() {
		return umMenuItemShow;
	}

	public WebElement getUmMenuItemExcel() {
		return umMenuItemExcel;
	}

	public WebElement getUmMenuItemExpand() {
		return umMenuItemExpand;
	}

	// -------------------Admin usermanagement---------------------//
	@FindBy(xpath = "//*[@id=\"filterreportTable_length\"]/label/select")
	private WebElement Admin_userShowCount;

	public WebElement getUmUserExpand() {
		return umUserExpand;
	}

	public WebElement getAdmin_userShowCount() {
		return Admin_userShowCount;
	}

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement user_back;

	public WebElement getUser_back() {
		return user_back;
	}

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement userdetailsbackbtn;

	public WebElement getuserdetailsbackbtn() {
		return userdetailsbackbtn;
	}

	// -------------------------

	@FindBy(xpath = "//select[@id='user_role']")
	private WebElement user_role;

	public WebElement getUser_role() {
		return user_role;
	}

	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement user_save;

	public WebElement getUser_save() {
		return user_save;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")
	private WebElement Menuitemseditbtn;

	public WebElement getMenuitemseditbtn() {
		return Menuitemseditbtn;
	}
	
	@FindBy(xpath="//a[normalize-space()='Back']")
	private WebElement Menuitemsbackbtn;

	public WebElement getMenuitemsbackbtn() {
		return Menuitemsbackbtn;
	}

	public UserManagement() {

		PageFactory.initElements(driver, this);

	}

}
