package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	

	//===========homes==========//
	
	@FindBy(xpath="//span[normalize-space()='Home']")
	private WebElement home;
	
	@FindBy(xpath="//a[normalize-space()='Dashboard']")
	private WebElement homeDashboard;
	
	@FindBy(xpath="//a[normalize-space()='Login History']")
	private WebElement homeLoginHistory;
	
	@FindBy(xpath="//a[contains(@class,'navbar-minimalize')]")
	private WebElement homeMinimalizeButton;
	
	@FindBy(xpath="//i[@class='fa fa-info-circle']")
	private WebElement homeHelpButton;
	
	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	private WebElement homeLogoutButton;
	
	
	@FindBy(id="simple-tab-0")
	private WebElement homeTable;
	
	@FindBy(xpath="//select[@id='orgid']")
	private WebElement loginHistoryOrganization;
	
	@FindBy(xpath="//input[@id='search_logindatetime']")
	private WebElement loginHistoryDate;
	
	

	public WebElement getHome() {
		return home;
	}

	public WebElement getHomeDashboard() {
		return homeDashboard;
	}

	public WebElement getHomeLoginHistory() {
		return homeLoginHistory;
	}

	public WebElement getHomeMinimalizeButton() {
		return homeMinimalizeButton;
	}

	public WebElement getHomeHelpButton() {
		return homeHelpButton;
	}

	public WebElement getHomeLogoutButton() {
		return homeLogoutButton;
	}

	public WebElement getHomeTable() {
		return homeTable;
	}

	public WebElement getLoginHistoryOrganization() {
		return loginHistoryOrganization;
	}

	public WebElement getLoginHistoryDate() {
		return loginHistoryDate;
	}
	
	public WebElement getLoginHistoryOkButton() {
		return loginHistoryOkButton;
	}

	public WebElement getLoginHistoryShows() {
		return loginHistoryShows;
	}

	public WebElement getLoginHistoryExcel() {
		return loginHistoryExcel;
	}

	@FindBy (xpath="//button[@id='searchby_teams']")
	private WebElement loginHistoryOkButton;
	
	@FindBy (xpath="//select[@name='reportTable_length']")
	private WebElement loginHistoryShows;
	
	@FindBy (xpath ="//span[normalize-space()='Excel']")
	private WebElement loginHistoryExcel;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//button[@id='simple-tab-0']")
	private WebElement dashboardTable;
	
	@FindBy (xpath="//button[@id='simple-tab-1']")
	private WebElement dashboardDrillDown;
	
	@FindBy (xpath="//button[@id='simple-tab-2']")
	private WebElement dashboardVisualization;
	
	@FindBy (xpath="//div[@class='page-container']//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//a[1]")
	private WebElement dashboardYearOnYearBusiness;
	
	@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement dashboardRelationshipWiseBusiness;
	
	@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement dashboardChannelWiseBusiness;
	
	@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement dashboardSegmentWiseBusiness;
	
	@FindBy (xpath="//div[@id='simple-tabpanel-0']//div[2]//div[1]//div[2]//*[name()='svg']")
	private WebElement dashboardYOYBArrow;
	
	@FindBy (xpath="//div[@id='simple-tabpanel-0']//div[3]//div[1]//div[2]//*[name()='svg']")
	private WebElement dashboardRWBArrow;
	
	@FindBy (xpath="//div[@id='simple-tabpanel-0']//div[4]//div[1]//div[2]//*[name()='svg']")
	private WebElement dashboardCWBArrow;
	
	@FindBy (xpath="//div[@id='simple-tabpanel-0']//div[5]//div[1]//div[2]//*[name()='svg']")
	private WebElement dashboardSWBArrow;
	
	
	public WebElement getDashboardTable() {
		return dashboardTable;
	}

	public WebElement getDashboardDrillDown() {
		return dashboardDrillDown;
	}

	public WebElement getDashboardVisualization() {
		return dashboardVisualization;
	}

	public WebElement getDashboardYearOnYearBusiness() {
		return dashboardYearOnYearBusiness;
	}

	public WebElement getDashboardRelationshipWiseBusiness() {
		return dashboardRelationshipWiseBusiness;
	}

	public WebElement getDashboardChannelWiseBusiness() {
		return dashboardChannelWiseBusiness;
	}

	public WebElement getDashboardSegmentWiseBusiness() {
		return dashboardSegmentWiseBusiness;
	}

	public WebElement getDashboardYOYBArrow() {
		return dashboardYOYBArrow;
	}

	public WebElement getDashboardRWBArrow() {
		return dashboardRWBArrow;
	}

	public WebElement getDashboardCWBArrow() {
		return dashboardCWBArrow;
	}

	public WebElement getDashboardSWBArrow() {
		return dashboardSWBArrow;
	}

	public WebElement getDashboardRefresh() {
		return dashboardRefresh;
	}

	@FindBy (xpath="//button[normalize-space()='Refresh']")
	private WebElement dashboardRefresh;



}
