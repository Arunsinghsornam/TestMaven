package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LMSReusableMethods extends BaseClass {
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement LMS_Dashboard_POPof_Ok_Button;
	@FindBy(xpath = "//span[normalize-space()='Lead Management']")
	private WebElement LeadManagement_DropDown_Button;
	@FindBy(xpath = "//a[normalize-space()='Raw Data Upload']")
	private WebElement RawDataUpload_module;
	@FindBy(xpath = "//a[normalize-space()='Raw Data']")
	private WebElement RawData_Tab;
	@FindBy(xpath = "//a[normalize-space()='Lead List']")
	private WebElement LeadList_Tab;
	@FindBy(xpath = "//body[1]/div[2]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement LMS_Qrc_DropDown_Button;
	@FindBy(xpath = "//a[normalize-space()='QRC List']")
	private WebElement Qrc_list_Tab;
	@FindBy(xpath = "//a[normalize-space()='New Ticket']")
	private WebElement Qrc_NewTicket_Tab;
	@FindBy(xpath = "//i[@class='fa fa-bars']")
	private WebElement LMS_maxmum_window_Button;
	@FindBy(xpath = "//b[normalize-space()='Log out']")
	private WebElement LMS_LogOut_Button;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")
	private WebElement LMS_Dashboard_Help_Button;
	@FindBy(xpath = "//button[normalize-space()='Refresh']")
	private WebElement LMS_Dashboard_RefreshButton;
	@FindBy(xpath = "//button[@id='simple-tab-1']")
	private WebElement LMS_OrganizationDrillDownTab;
	@FindBy(xpath = "//button[@id='simple-tab-2']")
	private WebElement LMS_VisualizationTab;
	@FindBy(xpath = "//div[@id='simple-tabpanel-0']//div[2]//div[1]//div[2]//*[name()='svg']")
	private WebElement YearonYearBusiness_Tabpanel;
	@FindBy(xpath = "//div[@id='simple-tabpanel-0']//div[3]//div[1]//div[2]//*[name()='svg']")
	private WebElement RelationShipWiseBusiness_Tabpanel;
	@FindBy(xpath = "//div[@id='simple-tabpanel-0']//div[4]//div[1]//div[2]//*[name()='svg']")
	private WebElement ChennalWiseBusiness_Tabpanel;
	@FindBy(xpath = "//div[5]//div[1]//div[2]//*[name()='svg']")
	private WebElement SegmentWiseBusiness_Tabpanel;
	@FindBy(xpath = "//button[normalize-space()='Raw Contacts List']")
	private WebElement RDU_RawContactList_Button;
	@FindBy(xpath = "//button[normalize-space()='Prospects List']")
	private WebElement RDU_Prospects_List_Button;
	@FindBy(xpath = "//a[normalize-space()='Click Here']")
	private WebElement RDU_ExcelClick_Button;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement RDU_ExcelFileUpload_Button;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement RDU_CancleButton;
	@FindBy(xpath = "//select[@aria-label='Rows per page:']")
	private WebElement RDU_Rows_per_page_Button;
	@FindBy(xpath = "//button[normalize-space()='Upload']")
	private WebElement RDU_Upload_Button;
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement RDU_Areyousuretouploadthedata_Yes;
	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement RDU_Areyousuretouploadthedata_No;
	@FindBy(xpath = "//button[normalize-space()='RawData']")
	private WebElement RDU_Data_hasbeen_Uploaded_Sucessfully_RawData;
	@FindBy(xpath = "//button[normalize-space()='Upload Again']")
	private WebElement RDU_Data_hasbeen_Uploaded_Sucessfully_Upload_Again;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-sghohy-MuiButtonBase-root-MuiButton-root']")
	private WebElement RDU_DownLoad_Button;
	@FindBy(xpath = "//button[@aria-label='Show/Hide search']//*[name()='svg']")
	private WebElement RDU_SearchBar;
	@FindBy(xpath = "//button[@aria-label='Show/Hide filters']")
	private WebElement RDU_ShowHideFilter_Button;
	@FindBy(xpath = "//button[@aria-label='Show/Hide columns']//*[name()='svg']")
	private WebElement RDU_showHideColumns;
	@FindBy(xpath = "//button[@aria-label='Toggle density']//*[name()='svg']")
	private WebElement RDU_Toggle_Density;
	@FindBy(xpath = "//input[@id=':r1v:']")
	private WebElement RDU_RCL_FilterByOrganizationName_TextBox;
	@FindBy(xpath = "//input[@id=':r23:']")
	private WebElement RDU_RCL_FilterByBusinessType_TextBox;
	@FindBy(xpath = "//input[@id=':r7b:']")
	private WebElement RDU_RCL_FilterBySourceType_TextBox;
	@FindBy(xpath = "//input[@id=':r7f:']")
	private WebElement RDU_RCL_FilterByStates_TextBox;
	@FindBy(xpath = "//input[@id=':r7j:']")
	private WebElement RDU_RCL_FilterByAssignedType_TextBox;
	@FindBy(xpath = "//input[@id=':r7n:']")
	private WebElement RDU_RCL_FilterByStatus_TextBox;
	@FindBy(xpath = "//	div[@id=':r16:']")
	private WebElement RDU_RCL_Rows_perpage;
	@FindBy(xpath = "//li[normalize-space()='10']")
	private WebElement RDU_RCL_count10;
	@FindBy(xpath = "//li[normalize-space()='100']")
	private WebElement RDU_RCL_count100;
	@FindBy(xpath = "//li[normalize-space()='500']")
	private WebElement RDU_RCL_count500;
	@FindBy(xpath = "//li[normalize-space()='1000']")
	private WebElement RDU_RCL_count1000;
	@FindBy(xpath = "//li[normalize-space()='5000']")
	private WebElement RDU_RCL_count5000;
	@FindBy(xpath = "//li[normalize-space()='10000']")
	private WebElement RDU_RCL_count10000;
	@FindBy(xpath = "//input[@aria-label='Toggle select all']")
	private WebElement RDU_RCL_Action_SelectAll_Button;
	@FindBy(xpath = "//button[normalize-space()='Move to ProspectList']")
	private WebElement RDU_RCL_Move_to_ProspectList_Button;
	@FindBy(xpath = "//button[@title='Go to previous page']//*[name()='svg']")
	private WebElement RDU_RCL_Go_to_previousPage;
	@FindBy(xpath = "//button[@title='Go to next page']//*[name()='svg']")
	private WebElement RDU_RCL_Go_to_NextPage;
	@FindBy(xpath = "//button[normalize-space()='Go to ProspectList']")
	private WebElement RDU_RCL_Go_to_ProspectList_Button;
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement RDU_RCL_Go_to_ProspectList_Close_Button;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//form//div[@class='table-responsive text-nowrap']//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation2 css-80pr5n-MuiPaper-root']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//div[@class='MuiBox-root css-sq9qdz']//div//div[@class='MuiBox-root css-1mrd89u']//button[@type='button']")
	private WebElement RDU_ZL_Download_Button;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//div[@class='MuiBox-root css-1cjiko4']//button[1]//*[name()='svg']")
	private WebElement RDU_ZL_ShowHide_search;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[2]//*[name()='svg']")
	private WebElement RDU_ZL_ShowHideFilter;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[3]//*[name()='svg']")
	private WebElement RDU_ZL_ShowHideColumn;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//button[@aria-label='Toggle density']//*[name()='svg']")
	private WebElement RDU_ZL_ToggleDensity;
	@FindBy(xpath = "//input[@id=':r8t:']")
	private WebElement RDU_ZL_FilterByOrganizationName;
	@FindBy(xpath = "//input[@id=':r91:']")
	private WebElement RDU_ZL_FilterByBusinessType;
	@FindBy(xpath = "//input[@id=':r95:']")
	private WebElement RDU_ZL_FilterByBobileNumber;
	@FindBy(xpath = "//input[@id=':r99:']")
	private WebElement RDU_ZL_FilterByAssignedTo;
	@FindBy(xpath = "//input[@id=':r9d:']")
	private WebElement RDU_ZL_FilterByCreateOn;
	@FindBy(xpath = "//input[@id=':r9h:']")
	private WebElement RDU_ZL_FilterByLeadStage;
	@FindBy(xpath = "//input[@id=':r9l:']")
	private WebElement RDU_ZL_FilterByTaskPrograss;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//button[@title='Go to next page']//*[name()='svg']")
	private WebElement RDU_ZL_Go_tonext_page;
	@FindBy(xpath = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)")
	private WebElement RDU_ZL_Rows_per_page;
	@FindBy(xpath = "//li[normalize-space()='10']")
	private WebElement RDU_ZL_count10;
	@FindBy(xpath = "//li[normalize-space()='100']")
	private WebElement RDU_ZL_count100;
	@FindBy(xpath = "//li[normalize-space()='500']")
	private WebElement RDU_ZL_count500;
	@FindBy(xpath = "//li[normalize-space()='1000']")
	private WebElement RDU_ZL_count1000;
	@FindBy(xpath = "//button[text()='My Leads']")
	private WebElement RDU_MY_List_Tab;
	@FindBy(xpath = "//button[normalize-space()='Active Leads']")
	private WebElement RDU_ML_ActiveLeads_Button;
	@FindBy(xpath = "//button[normalize-space()='Opportunity Created']")
	private WebElement RDU_ML_OpportunityCreated_Button;
	@FindBy(xpath = "//*[@id=\"navs-pills-top-profile\"]/div/div/div[2]/table/tbody/tr/td[1]/div/a/button")
	private WebElement RDU_ML_OpportunityCreated_View_button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a/i")
	private WebElement RDU_ML_OpportunityCreated_Update_Organization_details_view;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement RDU_ML_OpportunityCreated_Update_Organization_details_Close_Button;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")
	private WebElement RDU_ML_OpportunityCreated_Update_Organization_details_Activities;
	@FindBy(xpath = "//button[@class='btn-close']")
	private WebElement RDU_ML_OpportunityCreated_Update_Organization_details_Activities_Close;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a/i")
	private WebElement RDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_View;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/button[1]")
	private WebElement RDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_Activities;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/a[1]/i[1]")
	private WebElement RDU_ML_OpportunityCreated_Confirmation_ofthe_Stakeholders_view;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/button[1]")
	private WebElement RDU_ML_OpportunityCreated_Confirmation_ofthe_Stakeholders_Activities;
	@FindBy(xpath = "//button[normalize-space()='Business cards']")
	private WebElement RDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_BussinessCards;
	@FindBy(xpath = "//button[@class='btn btn-primary float-end']")
	private WebElement RDU_ML_Next_Button;
	@FindBy(xpath = "//div[contains(@class,'bs-stepper-header')]//div[contains(@class,'col-12')]//button[1]")
	private WebElement RDU_ML_previous_Button;
	@FindBy(xpath = "//span[contains(@class,'align-middle d-sm-inline-block d-none me-sm-1')]")
	private WebElement RDU_ML_LeadFollowUp_Button;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-next']")
	private WebElement RDU_ML_LeadClouse_Button;
	@FindBy(xpath = "//span[normalize-space()='Previous']")
	private WebElement RDU_ML_LeadClouse_Previous_Button;
	@FindBy(xpath = "//span[normalize-space()='Prospect List']")
	private WebElement RDU_ML_ProspectList_Button;
	@FindBy(xpath = "//button[normalize-space()='Lost Leads']")
	private WebElement RDU_ML_LostLeads_Button;
	@FindBy(xpath = "//div[@id='navs-pills-top-home']//div[@class='table-responsive text-nowrap']//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation2 css-80pr5n-MuiPaper-root']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//div[@class='MuiBox-root css-sq9qdz']//div//div[@class='MuiBox-root css-1mrd89u']//button[@type='button']")
	private WebElement RDU_ML_ActivityLeads_Download;
	@FindBy(xpath = "//div[@id='navs-pills-top-home']//div[@class='MuiBox-root css-1cjiko4']//button[1]//*[name()='svg']")
	private WebElement RDU_ML_ActivityLeads_ShowHideSearch;
	@FindBy(xpath = "//div[@id='navs-pills-top-home']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[2]//*[name()='svg']")
	private WebElement RDU_ML_ActivityLeads_ShowHideFilters;
	@FindBy(xpath = "//div[@id='navs-pills-top-home']//button[3]//*[name()='svg']")
	private WebElement RDU_ML_ActivityLeads_showHideColumn;
	@FindBy(xpath = "//div[@id='navs-pills-top-home']//button[@aria-label='Toggle density']")
	private WebElement RDU_ML_ActivityLeads_ToggleDensity;
	@FindBy(xpath = "//input[@id=':rgt:']")
	private WebElement RDU_ML_ActivityLeads_FilterByActions;
	@FindBy(xpath = "//input[@id=':rh1:']")
	private WebElement RDU_ML_ActivityLeads_FilterByOrganizationname;
	@FindBy(xpath = "//input[@id=':rh5:']")
	private WebElement RDU_ML_ActivityLeads_FilterByBusinessType;
	@FindBy(xpath = "//input[@id=':rh9:']")
	private WebElement RDU_ML_ActivityLeads_FilterByMobileNumber;
	@FindBy(xpath = "//input[@id=':rhd:']")
	private WebElement RDU_ML_ActivityLeads_FilterByAssignedTo;
	@FindBy(xpath = "//input[@id=':rhh:']")
	private WebElement RDU_ML_ActivityLeads_FilterByLeadStage;
	@FindBy(xpath = "//input[@id=':rhl:']")
	private WebElement RDU_ML_ActivityLeads_FilterByTaskProgress;
	@FindBy(xpath = "//div[@id='navs-pills-top-profile']//div[@class='MuiBox-root css-1cjiko4']//button[1]//*[name()='svg']")
	private WebElement RDU_OpportunityCreated_ShowHide_Search;
	@FindBy(xpath = "//div[@id='navs-pills-top-profile']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[2]//*[name()='svg']")
	private WebElement RDU_OpportunityCreated_ShowHide_Filters;
	@FindBy(xpath = "//div[@id='navs-pills-top-profile']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[3]")
	private WebElement RDU_OpportunityCreated_ShowHide_Column;
	@FindBy(xpath = "//div[@id='navs-pills-top-profile']//button[@aria-label='Toggle density']//*[name()='svg']")
	private WebElement RDU_OpportunityCreated_ShowHide_Toggle_density;
	@FindBy(xpath = "//input[@id=':ri1:']")
	private WebElement RDU_OpportunityCreated_FilterByActions;
	@FindBy(xpath = "//input[@id=':ri5:']")
	private WebElement RDU_OpportunityCreated_FilterByOrganizationName;
	@FindBy(xpath = "//input[@id=':ri9:']")
	private WebElement RDU_OpportunityCreated_FilterByBusinessType;
	@FindBy(xpath = "//input[@id=':rid:']")
	private WebElement RDU_OpportunityCreated_FilterByMobileNumber;
	@FindBy(xpath = "//input[@id=':rih:']")
	private WebElement RDU_OpportunityCreated_FilterByAssignedTo;
	@FindBy(xpath = "//input[@id=':ril:']")
	private WebElement RDU_OpportunityCreated_FilterByCreatedDate;
	@FindBy(xpath = "//input[@id=':rip:']")
	private WebElement RDU_OpportunityCreated_FilterByClosweDate;
	@FindBy(xpath = "//div[@id='navs-pills-top-messages']//div[@class='table-responsive text-nowrap']//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation2 css-80pr5n-MuiPaper-root']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//div[@class='MuiBox-root css-sq9qdz']//div//div[@class='MuiBox-root css-1mrd89u']//button[@type='button']")
	private WebElement RDU_LostLeads_Downloads;
	@FindBy(xpath = "//div[@id='navs-pills-top-messages']//div[@class='MuiBox-root css-1cjiko4']//button[1]//*[name()='svg']")
	private WebElement RDU_LostLeads_ShowHide_Search;
	@FindBy(xpath = "//div[@id='navs-pills-top-messages']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[2]//*[name()='svg']")
	private WebElement RDU_LostLeads_ShowHide_Filters;
	@FindBy(xpath = "//div[@id='navs-pills-top-messages']//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-dense css-1omuo8w-MuiToolbar-root']//button[3]//*[name()='svg']")
	private WebElement RDU_LostLeads_ShowHide_Column;
	@FindBy(xpath = "//div[@id='navs-pills-top-messages']//button[@aria-label='Toggle density']//*[name()='svg']")
	private WebElement RDU_LostLeads_ShowHide_Toggle_density;
	@FindBy(xpath = "//div[@id=':rdo:']")
	private WebElement RDU_LostLeads_RowsPerPage;
	@FindBy(xpath = "//div[@id='navs-pills-top-messages']//button[@title='Go to next page']//*[name()='svg']")
	private WebElement RDU_LostLeads_Goto_next_page;
	@FindBy(xpath = "//button[normalize-space()='Back']")
	private WebElement Back_button;
	@FindBy(xpath = "//div[@data-i18n='Lead Management']")
	private WebElement LeadManagement_dropDown;
	@FindBy(xpath = "//div[@data-i18n='DashBoard']")
	private WebElement Dashboard_Tab_Button;
	@FindBy(xpath = "//a[@href='/LeadManagement/Reports']")
	private WebElement Reports_Button;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//label[@for='0'][normalize-space()='Daily']//input[@name='ReportsFilter']")
	private WebElement DailyWiseReport_Radio_Button;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//label[@for='2'][normalize-space()='Yearly']//input[@name='ReportsFilter']")
	private WebElement YearlyWiseReport_Radio_Button;
	@FindBy(xpath = "//button[normalize-space()='State Wise']")
	private WebElement SateWise_tab;
	@FindBy(xpath = "//button[normalize-space()='Employee Wise']")
	private WebElement EmployeeWise_Tab;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//label[@for='1'][normalize-space()='Monthly']//input[@name='ReportsFilter']")
	private WebElement MonthlyWiseReport_Radio_Button;
	@FindBy(xpath = "//div[@data-i18n='LMS Checker']")
	private WebElement LMS_Checker_dropDown;
	@FindBy(xpath = "//div[@data-i18n='Approval']")
	private WebElement Approval_Tab;
	@FindBy(xpath = "//a[@href='/LeadManagement/CheckerPending']")
	private WebElement CheckerPending_tab;
	@FindBy(xpath = "//a[@href='/LeadManagement/CheckerRejected']")
	private WebElement CheckerRejected_Tab;
	@FindBy(xpath = "//div[@id='form-tabs-state']//label[@for='0'][normalize-space()='Daily']//input[@name='ReportsFilter']")
	private WebElement stateWise_dailyReport_RadioButton;
	@FindBy(xpath = "//div[@id='form-tabs-state']//label[@for='1'][normalize-space()='Monthly']//input[@name='ReportsFilter']")
	private WebElement stateWise_MonthlyReport_RadioButton;
	@FindBy(xpath = "//div[@id='form-tabs-state']//label[@for='2'][normalize-space()='Yearly']//input[@name='ReportsFilter']")
	private WebElement stateWise_YearlyReport_RadioButton;
	@FindBy(xpath = "//div[@id='form-tabs-employee']//label[@for='0'][normalize-space()='Daily']//input[@name='ReportsFilter']")
	private WebElement EmployeeWise_DailyReport_RadioButton;
	@FindBy(xpath = "//div[@id='form-tabs-employee']//label[@for='1'][normalize-space()='Monthly']//input[@name='ReportsFilter']")
	private WebElement EmployeeWise_MonthlyReport_RadioButton;
	@FindBy(xpath = "//div[@id='form-tabs-employee']//label[@for='2'][normalize-space()='Yearly']//input[@name='ReportsFilter']")
	private WebElement EmployeeWise_YearlyReport_RadioButton;
	@FindBy(xpath="//*[@id=\"form-tabs-personal\"]/form/div/div/div[2]/table/tbody/tr[1]/td[1]/div/a")
	private WebElement AllLeads_view_Button;

//-------------------------Zonal Manager----------------------------------	
   @FindBy(xpath="//button[normalize-space()='Raw Data Upload']")
   private WebElement Zm_RawdataUpload_Button;
   @FindBy(xpath="//button[normalize-space()='View']")
   private WebElement ZM_AllLeads_view_button;
	@FindBy(xpath = "//button[normalize-space()='Loss Lead']")
	private WebElement ZM_Predefined_Tasks_LossLead_Button;
	@FindBy(xpath = "//span[@class='align-middle d-sm-inline-block d-none me-sm-1']")
	private WebElement ZM_Predefined_Tasks_LeadFollowUp_Button;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement ZM_Predefined_Tasks_Please_complete_mandatory_tasks_Ok_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[1]/td[4]/button")
	private WebElement ZM_Predefined_Tasks_scheduledDate_button;
	@FindBy(xpath = "//textarea[1]")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Reason_textBox;
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Textbox;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Save_button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[1]/td[5]/button[2]")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_Add_button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[1]/td[7]/button")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Actions_Close_button;
	@FindBy(xpath = "//input[@value='1']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_Telephonic_Radio_button;
	@FindBy(xpath = "//input[@value='2']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_Email_Radio_button;
	@FindBy(xpath = "//button[normalize-space()='Yes, Close it!']")
	private WebElement ZM_Do_you_wantto_Closethis_Task_YesCloseIt;
	@FindBy(xpath = "//button[normalize-space()='No, keep it']")
	private WebElement ZM_Do_you_wantto_Closethis_Task_NoKeepIt;
	@FindBy(xpath = "//input[@name='Activity']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_Meeting_Radio_button;
	@FindBy(xpath = "//input[@value='online']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_online_Radio_button;
	@FindBy(xpath = "//input[@value='offline']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_offline_Radio_button;
	@FindBy(xpath = "//input[@placeholder=' Enter Your Name']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_ATTENDES;
	@FindBy(xpath = "//input[@placeholder='HH:MM']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_Duration;
	@FindBy(xpath = "//input[@placeholder='Choose File']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_FILE_UPLOAD;
	@FindBy(xpath = "//i[@type='button']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_UPLOAD;
	@FindBy(xpath = "//textarea[@placeholder='Enter Agenda']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_AGENDA;
	@FindBy(xpath = "//textarea[@placeholder='Enter MOM']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_MoM;
	@FindBy(xpath = "//textarea[@placeholder='Enter Comments']")
	private WebElement ZM_Predefined_Tasks_scheduledDate_Activities_COMMENTS;
	@FindBy(xpath = "//button[normalize-space()='New Task']")
	private WebElement ZM_TaskList_NewTask_Button;
	@FindBy(xpath = "//button[normalize-space()='Convert to Opportunity']")
	private WebElement ZM_convertToOpportunity;
	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement ZM_taskDatails_Title;
	@FindBy(xpath = "//textarea[@placeholder='Description']")
	private WebElement ZM_taskDatails_Description;
	@FindBy(xpath = "//input[@name='Opendate']")
	private WebElement ZM_taskDatails_OPENDATE;
	@FindBy(xpath = "//input[@name='Scheduledate']")
	private WebElement ZM_taskDatails_Scheduledate;
	@FindBy(xpath = "//*[@id=\":r4h:\"]")
	private WebElement ZM_Activities_MOBILENUMBER;
	@FindBy(xpath = "//input[@value='3']")
	private WebElement ZM_taskDatails_InActive_radioButton;
	@FindBy(xpath = "//input[@value='4']")
	private WebElement ZM_taskDatails_InActive_Closed;
	@FindBy(xpath = "//*[@id=\"navs-pills-top-profile\"]/div/div/div[2]/table/tbody/tr/td[1]/div/a/button")
	private WebElement ZM_MyList_opportunityCreated_view_Button;
	                 
	@FindBy(xpath = "//*[@id=\"navs-pills-top-home\"]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/a/button")
	private WebElement ZM_MyList_ActiveLeads_View_Button;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//form//div//div[@class='add-contacts-button']//button[@type='button']")
	private WebElement ZM_MyList_AddContacts;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[2]/td[4]/button")
	private WebElement ZM_MyList_ActiveLeads_Identification_ScheduledDate;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[2]/td[5]/button[2]")
	private WebElement ZM_MyList_ActiveLeads_Identification_Add_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[2]/td[7]/button")
	private WebElement ZM_MyList_ActiveLeads_Identification_Close_Button;
	@FindBy(xpath = "//div[@id='form-tabs-personal']//form//div//button[@type='button']")
	private WebElement ZM_MyList_ActiveLeads_Identification_AddContacts_Button;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1]")
	private WebElement ZM_MyList_ActiveLeads_Confirmation_ScheduledDate;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[3]/td[5]/button[2]")
	private WebElement ZM_MyList_ActiveLeads_Confirmation_Activities_Add;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[3]/td[7]/button")
	private WebElement ZM_MyList_ActiveLeads_Confirmation_Activities_Action_Close_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[4]/td[4]/button")
	private WebElement ZM_MyList_ActiveLeads_Meeting_ScheduledDate;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[4]/td[5]/button[2]")
	private WebElement ZM_MyList_ActiveLeads_Meeting_Activities_Add_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[4]/td[7]/button")
	private WebElement ZM_MyList_ActiveLeads_Meeting_Actions_Close_Button;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-prev']")
	private WebElement ZM_MyList_ActiveLeads_ProspectList_Button;

//..................Regional ........................
	                 
	@FindBy(xpath = "//*[@id=\"navs-pills-top-home\"]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/a/button")
	private WebElement Re_ActiveLeads_View_button;
	@FindBy(xpath = "//*[@id=\"navs-pills-top-profile\"]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/a/button")
	private WebElement Re_opportunityCreated_view_Button;
	@FindBy(xpath = "//input[@placeholder='Enter Organization Name']")
	private WebElement Re_Org_Name;
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	private WebElement Re_Org_Email;
	@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
	private WebElement Re_Org_MobileNumber;
	@FindBy(xpath = "//input[@placeholder='Address 1']")
	private WebElement Re_Org_Address_1;
	@FindBy(xpath = "//input[@placeholder='Address 2']")
	private WebElement Re_Org_Address_2;
	@FindBy(xpath = "//div[@class='col-md-6']//div[contains(@class,'css-qbdosj-Input')]")
	private WebElement Re_Org_State;
	@FindBy(id = "react-select-5-input")
	private WebElement Re_Org_DISTRICT;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter City')]")
	private WebElement Re_Org_CITY;
	@FindBy(xpath = "//input[@placeholder='Enter PIN code']")
	private WebElement Re_Org_pincode;
	@FindBy(xpath = "//input[@value='1']")
	private WebElement Re_Org_Retail_Radio_Button;
	@FindBy(xpath = "//input[@value='2']")
	private WebElement Re_Org_Corporate_Redio_Button;
	@FindBy(xpath = "//input[@value='3']")
	private WebElement Re_Org_Fig_Redio_Button;
	@FindBy(xpath = "//div[@class='row g-2 mb-1 ']//div[@class=' css-qbdosj-Input']")
	private WebElement Re_Org_Business_email;
	@FindBy(xpath = "//input[@value='4']")
	private WebElement Re_Org_O2O_Redio_Button;
	@FindBy(xpath = "//input[@value='11']")
	private WebElement Re_Org_Tecnology_Redio_Button;
	@FindBy(xpath = "//input[@placeholder='Enter CIN Number']")
	private WebElement Re_Org_CIN_NUMBER;
	@FindBy(xpath = "//input[@placeholder='Website']")
	private WebElement Re_Org_WEBSITE;
	@FindBy(xpath = "//input[@placeholder='Turn Over']")
	private WebElement Re_Org_TURNOVER;
	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	private WebElement Re_Cont_Name;
	@FindBy(xpath = "//input[@placeholder='Enter Designation']")
	private WebElement Re_Cont_Designation;
	@FindBy(xpath = "//div[@class=' css-qbdosj-Input']")
	private WebElement Re_Cont_CATEGORY;
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	private WebElement Re_Cont_Email;
	@FindBy(xpath = "//input[@placeholder='Enter Mobile']")
	private WebElement Re_Cont_MobileNO;
	@FindBy(xpath = "//textarea[@name='comments']")
	private WebElement Re_Activities_Comments;
	                 
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement Save_Ok_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[3]/td[5]/button[2]")
	private WebElement Re_Confirmation_Add_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[4]/td[5]/button[2]")
	private WebElement Re_MeetingArrangement_Add_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[5]/td[5]/button[2]")
	private WebElement Re_BusinessPresentation_Add_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[6]/td[5]/button[2]")
	private WebElement Re_IT_Demonstration_add_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[1]/td[7]/button")
	private WebElement Re_Update_Organization_details_Task_Close_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[3]/td[7]/button")
	private WebElement Re_Confirmation_ofthe_Stakeholders_Task_Close_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[4]/td[7]/button")
	private WebElement Re_Meeting_Arrangement_Task_Close_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[5]/td[7]/button")
	private WebElement Re_Business_Presentation_Task_Close_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[6]/td[7]/button")
	private WebElement Re_IT_Demonstration_Task_Close_Button;
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/div/table/tbody/tr[2]/td[7]/button")
	private WebElement Re_Identificationof_stakeholders_Task_Close_Button;
	@FindBy(xpath="//textarea[@placeholder='Comments']")
	private WebElement Leadloss_Comment_TextBox;
	
	@FindBy(xpath="//input[@name='Mobile']")
	private WebElement mobileNumber;
   @FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/input[1]")
	private WebElement checkBox;
   @FindBy(xpath="//tbody/tr[2]/td[1]/span[1]/input[1]")
   private WebElement checkBox2;
   
   @FindBy(xpath="//*[@id=\"navs-pills-top-home\"]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/a/button")
   private WebElement ZM_MyLeads_view_Button;
   
//   ----------------------------------
   
   @FindBy(xpath="//button[normalize-space()='Re-open']")
   private WebElement Re_Open_Button;
   
   @FindBy(xpath="//body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/textarea[1]")
   private WebElement Reason_textBox;
 @FindBy(xpath="//span[normalize-space()='LMS Checker']")
 private WebElement LA_LMS_Checker_DropDown;
   @FindBy(xpath="//a[normalize-space()='Pending']")
   private WebElement Pending_Tab;
   @FindBy(xpath="//button[normalize-space()='Approve']")
   private WebElement Approved_button;
   @FindBy(xpath="//button[@type='button'][normalize-space()='Approve']")
   private WebElement Approved_Ok_button;
   
   
   
//   ----------------------------------------------
   @FindBy(xpath="//*[@id=\"navs-pills-top-messages\"]/div/div/div[2]/table/tbody/tr[1]/td[1]/div/a/button")
   private WebElement LostLead_view_button;
   
   @FindBy(xpath="//button[normalize-space()='search']")
   private WebElement Search_Button;
   @FindBy(xpath="//*[@id=\"form-tabs-personal\"]/form/div[1]/div[2]/div/div")
   private WebElement selectYear;
   @FindBy(xpath="//*[@id=\"form-tabs-personal\"]/form/div[1]/div[1]/div/div/div[1]/div[2]")
   private WebElement SelectMonth;
   @FindBy(xpath="//*[@id=\"form-tabs-personal\"]/form/div[1]/div[1]/div/div")
   private WebElement Yearly_SelectYear;
 @FindBy(xpath="//*[@id=\"form-tabs-state\"]/form/div[1]/div[2]/div/div/div[1]/div[2]")
 private WebElement StateWise_SelectYear;
   @FindBy(xpath="//*[@id=\"form-tabs-state\"]/form/div[1]/div[1]/div/div/div[2]")
   private WebElement StateWise_SelectMonth;
   @FindBy(xpath="//*[@id=\"form-tabs-state\"]/form/div[1]/div[1]/div/div/div[1]/div[2]")
   private WebElement StateWise_SelectAnnualYear;
   @FindBy(xpath="//*[@id=\"form-tabs-employee\"]/form/div[1]/div[2]/div/div/div[1]/div[2]")
   private WebElement EmployeeWise_SelectYear;
   @FindBy(xpath="//*[@id=\"form-tabs-employee\"]/form/div[1]/div[1]/div/div/div[2]")
   private WebElement EmployeeWise_SelectMonth;
   @FindBy(xpath="//*[@id=\"form-tabs-employee\"]/form/div[1]/div[1]/div/div/div[1]/div[2]")
   private WebElement EmployeeWise_SelectAnnualYear;
   @FindBy(xpath="//div[@data-i18n='PMS']")
   private WebElement PMSDrop_down;
   public WebElement getLostLead_view_button() {
	return LostLead_view_button;
}

public WebElement getSearch_Button() {
	return Search_Button;
}

public WebElement getSelectYear() {
	return selectYear;
}

public WebElement getSelectMonth() {
	return SelectMonth;
}

public WebElement getYearly_SelectYear() {
	return Yearly_SelectYear;
}

public WebElement getStateWise_SelectYear() {
	return StateWise_SelectYear;
}

public WebElement getStateWise_SelectMonth() {
	return StateWise_SelectMonth;
}

public WebElement getStateWise_SelectAnnualYear() {
	return StateWise_SelectAnnualYear;
}

public WebElement getEmployeeWise_SelectYear() {
	return EmployeeWise_SelectYear;
}

public WebElement getEmployeeWise_SelectMonth() {
	return EmployeeWise_SelectMonth;
}

public WebElement getEmployeeWise_SelectAnnualYear() {
	return EmployeeWise_SelectAnnualYear;
}

public WebElement getPMSDrop_down() {
	return PMSDrop_down;
}

public WebElement getPolicies_Tab() {
	return policies_Tab;
}

@FindBy(xpath="//a[@href='/PolicyManagement/Index']")
   private WebElement policies_Tab;
   
   
   
//   -------------------------------------------------------------------------
   
   
   
   
	public WebElement getAllLeads_view_Button() {
	return AllLeads_view_Button;
}

public WebElement getRe_Open_Button() {
	return Re_Open_Button;
}

public WebElement getReason_textBox() {
	return Reason_textBox;
}

public WebElement getLA_LMS_Checker_DropDown() {
	return LA_LMS_Checker_DropDown;
}

public WebElement getPending_Tab() {
	return Pending_Tab;
}

public WebElement getApproved_button() {
	return Approved_button;
}

public WebElement getApproved_Ok_button() {
	return Approved_Ok_button;
}

	public WebElement getZM_MyLeads_view_Button() {
	return ZM_MyLeads_view_Button;
}

	public LMSReusableMethods() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLMS_Dashboard_POPof_Ok_Button() {
		return LMS_Dashboard_POPof_Ok_Button;
	}

	public WebElement getLeadManagement_DropDown_Button() {
		return LeadManagement_DropDown_Button;
	}

	

	public WebElement getRawDataUpload_module() {
		return RawDataUpload_module;
	}

	public WebElement getRawData_Tab() {
		return RawData_Tab;
	}

	public WebElement getLeadList_Tab() {
		return LeadList_Tab;
	}

	public WebElement getLMS_Qrc_DropDown_Button() {
		return LMS_Qrc_DropDown_Button;
	}

	public WebElement getQrc_list_Tab() {
		return Qrc_list_Tab;
	}

	public WebElement getQrc_NewTicket_Tab() {
		return Qrc_NewTicket_Tab;
	}

	public WebElement getLMS_maxmum_window_Button() {
		return LMS_maxmum_window_Button;
	}

	public WebElement getLMS_LogOut_Button() {
		return LMS_LogOut_Button;
	}

	public WebElement getLMS_Dashboard_Help_Button() {
		return LMS_Dashboard_Help_Button;
	}

	public WebElement getLMS_Dashboard_RefreshButton() {
		return LMS_Dashboard_RefreshButton;
	}

	public WebElement getLMS_OrganizationDrillDownTab() {
		return LMS_OrganizationDrillDownTab;
	}

	public WebElement getLMS_VisualizationTab() {
		return LMS_VisualizationTab;
	}

	public WebElement getYearonYearBusiness_Tabpanel() {
		return YearonYearBusiness_Tabpanel;
	}

	public WebElement getRelationShipWiseBusiness_Tabpanel() {
		return RelationShipWiseBusiness_Tabpanel;
	}

	public WebElement getChennalWiseBusiness_Tabpanel() {
		return ChennalWiseBusiness_Tabpanel;
	}

	public WebElement getSegmentWiseBusiness_Tabpanel() {
		return SegmentWiseBusiness_Tabpanel;
	}

	public WebElement getRDU_RawContactList_Button() {
		return RDU_RawContactList_Button;
	}

	public WebElement getRDU_Prospects_List_Button() {
		return RDU_Prospects_List_Button;
	}

	public WebElement getRDU_ExcelClick_Button() {
		return RDU_ExcelClick_Button;
	}

	public WebElement getRDU_ExcelFileUpload_Button() {
		return RDU_ExcelFileUpload_Button;
	}

	public WebElement getRDU_CancleButton() {
		return RDU_CancleButton;
	}

	public WebElement getRDU_Rows_per_page_Button() {
		return RDU_Rows_per_page_Button;
	}

	public WebElement getRDU_Upload_Button() {
		return RDU_Upload_Button;
	}

	public WebElement getRDU_Areyousuretouploadthedata_Yes() {
		return RDU_Areyousuretouploadthedata_Yes;
	}

	public WebElement getRDU_Areyousuretouploadthedata_No() {
		return RDU_Areyousuretouploadthedata_No;
	}

	public WebElement getRDU_Data_hasbeen_Uploaded_Sucessfully_RawData() {
		return RDU_Data_hasbeen_Uploaded_Sucessfully_RawData;
	}

	public WebElement getRDU_Data_hasbeen_Uploaded_Sucessfully_Upload_Again() {
		return RDU_Data_hasbeen_Uploaded_Sucessfully_Upload_Again;
	}

	public WebElement getRDU_DownLoad_Button() {
		return RDU_DownLoad_Button;
	}

	public WebElement getRDU_SearchBar() {
		return RDU_SearchBar;
	}

	public WebElement getRDU_ShowHideFilter_Button() {
		return RDU_ShowHideFilter_Button;
	}

	public WebElement getRDU_showHideColumns() {
		return RDU_showHideColumns;
	}

	public WebElement getRDU_Toggle_Density() {
		return RDU_Toggle_Density;
	}

	public WebElement getRDU_RCL_FilterByOrganizationName_TextBox() {
		return RDU_RCL_FilterByOrganizationName_TextBox;
	}

	public WebElement getRDU_RCL_FilterByBusinessType_TextBox() {
		return RDU_RCL_FilterByBusinessType_TextBox;
	}

	public WebElement getRDU_RCL_FilterBySourceType_TextBox() {
		return RDU_RCL_FilterBySourceType_TextBox;
	}

	public WebElement getRDU_RCL_FilterByStates_TextBox() {
		return RDU_RCL_FilterByStates_TextBox;
	}

	public WebElement getRDU_RCL_FilterByAssignedType_TextBox() {
		return RDU_RCL_FilterByAssignedType_TextBox;
	}

	public WebElement getRDU_RCL_FilterByStatus_TextBox() {
		return RDU_RCL_FilterByStatus_TextBox;
	}

	public WebElement getRDU_RCL_Rows_perpage() {
		return RDU_RCL_Rows_perpage;
	}

	public WebElement getRDU_RCL_count10() {
		return RDU_RCL_count10;
	}

	public WebElement getRDU_RCL_count100() {
		return RDU_RCL_count100;
	}

	public WebElement getRDU_RCL_count500() {
		return RDU_RCL_count500;
	}

	public WebElement getRDU_RCL_count1000() {
		return RDU_RCL_count1000;
	}

	public WebElement getRDU_RCL_count5000() {
		return RDU_RCL_count5000;
	}

	public WebElement getRDU_RCL_count10000() {
		return RDU_RCL_count10000;
	}

	public WebElement getRDU_RCL_Action_SelectAll_Button() {
		return RDU_RCL_Action_SelectAll_Button;
	}

	public WebElement getRDU_RCL_Move_to_ProspectList_Button() {
		return RDU_RCL_Move_to_ProspectList_Button;
	}

	public WebElement getRDU_RCL_Go_to_previousPage() {
		return RDU_RCL_Go_to_previousPage;
	}

	public WebElement getRDU_RCL_Go_to_NextPage() {
		return RDU_RCL_Go_to_NextPage;
	}

	public WebElement getRDU_RCL_Go_to_ProspectList_Button() {
		return RDU_RCL_Go_to_ProspectList_Button;
	}

	public WebElement getRDU_RCL_Go_to_ProspectList_Close_Button() {
		return RDU_RCL_Go_to_ProspectList_Close_Button;
	}

	public WebElement getRDU_ZL_Download_Button() {
		return RDU_ZL_Download_Button;
	}

	public WebElement getRDU_ZL_ShowHide_search() {
		return RDU_ZL_ShowHide_search;
	}

	public WebElement getRDU_ZL_ShowHideFilter() {
		return RDU_ZL_ShowHideFilter;
	}

	public WebElement getRDU_ZL_ShowHideColumn() {
		return RDU_ZL_ShowHideColumn;
	}

	public WebElement getRDU_ZL_ToggleDensity() {
		return RDU_ZL_ToggleDensity;
	}

	public WebElement getRDU_ZL_FilterByOrganizationName() {
		return RDU_ZL_FilterByOrganizationName;
	}

	public WebElement getRDU_ZL_FilterByBusinessType() {
		return RDU_ZL_FilterByBusinessType;
	}

	public WebElement getRDU_ZL_FilterByBobileNumber() {
		return RDU_ZL_FilterByBobileNumber;
	}

	public WebElement getRDU_ZL_FilterByAssignedTo() {
		return RDU_ZL_FilterByAssignedTo;
	}

	public WebElement getRDU_ZL_FilterByCreateOn() {
		return RDU_ZL_FilterByCreateOn;
	}

	public WebElement getRDU_ZL_FilterByLeadStage() {
		return RDU_ZL_FilterByLeadStage;
	}

	public WebElement getRDU_ZL_FilterByTaskPrograss() {
		return RDU_ZL_FilterByTaskPrograss;
	}

	public WebElement getRDU_ZL_Go_tonext_page() {
		return RDU_ZL_Go_tonext_page;
	}

	public WebElement getRDU_ZL_Rows_per_page() {
		return RDU_ZL_Rows_per_page;
	}

	public WebElement getRDU_ZL_count10() {
		return RDU_ZL_count10;
	}

	public WebElement getRDU_ZL_count100() {
		return RDU_ZL_count100;
	}

	public WebElement getRDU_ZL_count500() {
		return RDU_ZL_count500;
	}

	public WebElement getRDU_ZL_count1000() {
		return RDU_ZL_count1000;
	}

	public WebElement getRDU_MY_List_Tab() {
		return RDU_MY_List_Tab;
	}

	public WebElement getRDU_ML_ActiveLeads_Button() {
		return RDU_ML_ActiveLeads_Button;
	}

	public WebElement getRDU_ML_OpportunityCreated_Button() {
		return RDU_ML_OpportunityCreated_Button;
	}

	public WebElement getRDU_ML_OpportunityCreated_View_button() {
		return RDU_ML_OpportunityCreated_View_button;
	}

	public WebElement getRDU_ML_OpportunityCreated_Update_Organization_details_view() {
		return RDU_ML_OpportunityCreated_Update_Organization_details_view;
	}

	public WebElement getRDU_ML_OpportunityCreated_Update_Organization_details_Close_Button() {
		return RDU_ML_OpportunityCreated_Update_Organization_details_Close_Button;
	}

	public WebElement getRDU_ML_OpportunityCreated_Update_Organization_details_Activities() {
		return RDU_ML_OpportunityCreated_Update_Organization_details_Activities;
	}

	public WebElement getRDU_ML_OpportunityCreated_Update_Organization_details_Activities_Close() {
		return RDU_ML_OpportunityCreated_Update_Organization_details_Activities_Close;
	}

	public WebElement getRDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_View() {
		return RDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_View;
	}

	public WebElement getRDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_Activities() {
		return RDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_Activities;
	}

	public WebElement getRDU_ML_OpportunityCreated_Confirmation_ofthe_Stakeholders_view() {
		return RDU_ML_OpportunityCreated_Confirmation_ofthe_Stakeholders_view;
	}

	public WebElement getRDU_ML_OpportunityCreated_Confirmation_ofthe_Stakeholders_Activities() {
		return RDU_ML_OpportunityCreated_Confirmation_ofthe_Stakeholders_Activities;
	}

	public WebElement getRDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_BussinessCards() {
		return RDU_ML_OpportunityCreated_Identification_ofthe_stakeholders_BussinessCards;
	}

	public WebElement getRDU_ML_Next_Button() {
		return RDU_ML_Next_Button;
	}

	public WebElement getRDU_ML_previous_Button() {
		return RDU_ML_previous_Button;
	}

	public WebElement getRDU_ML_LeadFollowUp_Button() {
		return RDU_ML_LeadFollowUp_Button;
	}

	public WebElement getRDU_ML_LeadClouse_Button() {
		return RDU_ML_LeadClouse_Button;
	}

	public WebElement getRDU_ML_LeadClouse_Previous_Button() {
		return RDU_ML_LeadClouse_Previous_Button;
	}

	public WebElement getRDU_ML_ProspectList_Button() {
		return RDU_ML_ProspectList_Button;
	}

	public WebElement getRDU_ML_LostLeads_Button() {
		return RDU_ML_LostLeads_Button;
	}

	public WebElement getRDU_ML_ActivityLeads_Download() {
		return RDU_ML_ActivityLeads_Download;
	}

	public WebElement getRDU_ML_ActivityLeads_ShowHideSearch() {
		return RDU_ML_ActivityLeads_ShowHideSearch;
	}

	public WebElement getRDU_ML_ActivityLeads_ShowHideFilters() {
		return RDU_ML_ActivityLeads_ShowHideFilters;
	}

	public WebElement getRDU_ML_ActivityLeads_showHideColumn() {
		return RDU_ML_ActivityLeads_showHideColumn;
	}

	public WebElement getRDU_ML_ActivityLeads_ToggleDensity() {
		return RDU_ML_ActivityLeads_ToggleDensity;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByActions() {
		return RDU_ML_ActivityLeads_FilterByActions;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByOrganizationname() {
		return RDU_ML_ActivityLeads_FilterByOrganizationname;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByBusinessType() {
		return RDU_ML_ActivityLeads_FilterByBusinessType;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByMobileNumber() {
		return RDU_ML_ActivityLeads_FilterByMobileNumber;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByAssignedTo() {
		return RDU_ML_ActivityLeads_FilterByAssignedTo;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByLeadStage() {
		return RDU_ML_ActivityLeads_FilterByLeadStage;
	}

	public WebElement getRDU_ML_ActivityLeads_FilterByTaskProgress() {
		return RDU_ML_ActivityLeads_FilterByTaskProgress;
	}

	public WebElement getRDU_OpportunityCreated_ShowHide_Search() {
		return RDU_OpportunityCreated_ShowHide_Search;
	}

	public WebElement getRDU_OpportunityCreated_ShowHide_Filters() {
		return RDU_OpportunityCreated_ShowHide_Filters;
	}

	public WebElement getRDU_OpportunityCreated_ShowHide_Column() {
		return RDU_OpportunityCreated_ShowHide_Column;
	}

	public WebElement getRDU_OpportunityCreated_ShowHide_Toggle_density() {
		return RDU_OpportunityCreated_ShowHide_Toggle_density;
	}

	public WebElement getRDU_OpportunityCreated_FilterByActions() {
		return RDU_OpportunityCreated_FilterByActions;
	}

	public WebElement getRDU_OpportunityCreated_FilterByOrganizationName() {
		return RDU_OpportunityCreated_FilterByOrganizationName;
	}

	public WebElement getRDU_OpportunityCreated_FilterByBusinessType() {
		return RDU_OpportunityCreated_FilterByBusinessType;
	}

	public WebElement getRDU_OpportunityCreated_FilterByMobileNumber() {
		return RDU_OpportunityCreated_FilterByMobileNumber;
	}

	public WebElement getRDU_OpportunityCreated_FilterByAssignedTo() {
		return RDU_OpportunityCreated_FilterByAssignedTo;
	}

	public WebElement getRDU_OpportunityCreated_FilterByCreatedDate() {
		return RDU_OpportunityCreated_FilterByCreatedDate;
	}

	public WebElement getRDU_OpportunityCreated_FilterByClosweDate() {
		return RDU_OpportunityCreated_FilterByClosweDate;
	}

	public WebElement getRDU_LostLeads_Downloads() {
		return RDU_LostLeads_Downloads;
	}

	public WebElement getRDU_LostLeads_ShowHide_Search() {
		return RDU_LostLeads_ShowHide_Search;
	}

	public WebElement getRDU_LostLeads_ShowHide_Filters() {
		return RDU_LostLeads_ShowHide_Filters;
	}

	public WebElement getRDU_LostLeads_ShowHide_Column() {
		return RDU_LostLeads_ShowHide_Column;
	}

	public WebElement getRDU_LostLeads_ShowHide_Toggle_density() {
		return RDU_LostLeads_ShowHide_Toggle_density;
	}

	public WebElement getRDU_LostLeads_RowsPerPage() {
		return RDU_LostLeads_RowsPerPage;
	}

	public WebElement getRDU_LostLeads_Goto_next_page() {
		return RDU_LostLeads_Goto_next_page;
	}

	public WebElement getBack_button() {
		return Back_button;
	}

	public WebElement getLeadManagement_dropDown() {
		return LeadManagement_dropDown;
	}

	public WebElement getDashboard_Tab_Button() {
		return Dashboard_Tab_Button;
	}

	public WebElement getReports_Button() {
		return Reports_Button;
	}

	public WebElement getDailyWiseReport_Radio_Button() {
		return DailyWiseReport_Radio_Button;
	}

	public WebElement getYearlyWiseReport_Radio_Button() {
		return YearlyWiseReport_Radio_Button;
	}

	public WebElement getSateWise_tab() {
		return SateWise_tab;
	}

	public WebElement getEmployeeWise_Tab() {
		return EmployeeWise_Tab;
	}

	public WebElement getMonthlyWiseReport_Radio_Button() {
		return MonthlyWiseReport_Radio_Button;
	}

	public WebElement getLMS_Checker_dropDown() {
		return LMS_Checker_dropDown;
	}

	public WebElement getApproval_Tab() {
		return Approval_Tab;
	}

	public WebElement getCheckerPending_tab() {
		return CheckerPending_tab;
	}

	public WebElement getCheckerRejected_Tab() {
		return CheckerRejected_Tab;
	}

	public WebElement getStateWise_dailyReport_RadioButton() {
		return stateWise_dailyReport_RadioButton;
	}

	public WebElement getStateWise_MonthlyReport_RadioButton() {
		return stateWise_MonthlyReport_RadioButton;
	}

	public WebElement getStateWise_YearlyReport_RadioButton() {
		return stateWise_YearlyReport_RadioButton;
	}

	public WebElement getEmployeeWise_DailyReport_RadioButton() {
		return EmployeeWise_DailyReport_RadioButton;
	}

	public WebElement getEmployeeWise_MonthlyReport_RadioButton() {
		return EmployeeWise_MonthlyReport_RadioButton;
	}

	public WebElement getEmployeeWise_YearlyReport_RadioButton() {
		return EmployeeWise_YearlyReport_RadioButton;
	}

	public WebElement getZM_Predefined_Tasks_LossLead_Button() {
		return ZM_Predefined_Tasks_LossLead_Button;
	}

	public WebElement getZM_Predefined_Tasks_LeadFollowUp_Button() {
		return ZM_Predefined_Tasks_LeadFollowUp_Button;
	}

	public WebElement getZM_Predefined_Tasks_Please_complete_mandatory_tasks_Ok_Button() {
		return ZM_Predefined_Tasks_Please_complete_mandatory_tasks_Ok_Button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_button() {
		return ZM_Predefined_Tasks_scheduledDate_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Reason_textBox() {
		return ZM_Predefined_Tasks_scheduledDate_Reason_textBox;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Textbox() {
		return ZM_Predefined_Tasks_scheduledDate_Textbox;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Save_button() {
		return ZM_Predefined_Tasks_scheduledDate_Save_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_Add_button() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_Add_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Actions_Close_button() {
		return ZM_Predefined_Tasks_scheduledDate_Actions_Close_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_Telephonic_Radio_button() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_Telephonic_Radio_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_Email_Radio_button() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_Email_Radio_button;
	}

	public WebElement getZM_Do_you_wantto_Closethis_Task_YesCloseIt() {
		return ZM_Do_you_wantto_Closethis_Task_YesCloseIt;
	}

	public WebElement getZM_Do_you_wantto_Closethis_Task_NoKeepIt() {
		return ZM_Do_you_wantto_Closethis_Task_NoKeepIt;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_Meeting_Radio_button() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_Meeting_Radio_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_online_Radio_button() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_online_Radio_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_offline_Radio_button() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_offline_Radio_button;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_ATTENDES() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_ATTENDES;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_Duration() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_Duration;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_FILE_UPLOAD() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_FILE_UPLOAD;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_UPLOAD() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_UPLOAD;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_AGENDA() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_AGENDA;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_MoM() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_MoM;
	}

	public WebElement getZM_Predefined_Tasks_scheduledDate_Activities_COMMENTS() {
		return ZM_Predefined_Tasks_scheduledDate_Activities_COMMENTS;
	}

	public WebElement getZM_TaskList_NewTask_Button() {
		return ZM_TaskList_NewTask_Button;
	}

	public WebElement getZM_convertToOpportunity() {
		return ZM_convertToOpportunity;
	}

	public WebElement getZM_taskDatails_Title() {
		return ZM_taskDatails_Title;
	}

	public WebElement getZM_taskDatails_Description() {
		return ZM_taskDatails_Description;
	}

	public WebElement getZM_taskDatails_OPENDATE() {
		return ZM_taskDatails_OPENDATE;
	}

	public WebElement getZM_taskDatails_Scheduledate() {
		return ZM_taskDatails_Scheduledate;
	}

	public WebElement getZM_Activities_MOBILENUMBER() {
		return ZM_Activities_MOBILENUMBER;
	}

	public WebElement getZM_taskDatails_InActive_radioButton() {
		return ZM_taskDatails_InActive_radioButton;
	}

	public WebElement getZM_taskDatails_InActive_Closed() {
		return ZM_taskDatails_InActive_Closed;
	}

	public WebElement getZM_MyList_opportunityCreated_view_Button() {
		return ZM_MyList_opportunityCreated_view_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_View_Button() {
		return ZM_MyList_ActiveLeads_View_Button;
	}

	public WebElement getZM_MyList_AddContacts() {
		return ZM_MyList_AddContacts;
	}

	public WebElement getZM_MyList_ActiveLeads_Identification_ScheduledDate() {
		return ZM_MyList_ActiveLeads_Identification_ScheduledDate;
	}

	public WebElement getZM_MyList_ActiveLeads_Identification_Add_Button() {
		return ZM_MyList_ActiveLeads_Identification_Add_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_Identification_Close_Button() {
		return ZM_MyList_ActiveLeads_Identification_Close_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_Identification_AddContacts_Button() {
		return ZM_MyList_ActiveLeads_Identification_AddContacts_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_Confirmation_ScheduledDate() {
		return ZM_MyList_ActiveLeads_Confirmation_ScheduledDate;
	}

	public WebElement getZM_MyList_ActiveLeads_Confirmation_Activities_Add() {
		return ZM_MyList_ActiveLeads_Confirmation_Activities_Add;
	}

	public WebElement getZM_MyList_ActiveLeads_Confirmation_Activities_Action_Close_Button() {
		return ZM_MyList_ActiveLeads_Confirmation_Activities_Action_Close_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_Meeting_ScheduledDate() {
		return ZM_MyList_ActiveLeads_Meeting_ScheduledDate;
	}

	public WebElement getZM_MyList_ActiveLeads_Meeting_Activities_Add_Button() {
		return ZM_MyList_ActiveLeads_Meeting_Activities_Add_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_Meeting_Actions_Close_Button() {
		return ZM_MyList_ActiveLeads_Meeting_Actions_Close_Button;
	}

	public WebElement getZM_MyList_ActiveLeads_ProspectList_Button() {
		return ZM_MyList_ActiveLeads_ProspectList_Button;
	}

	public WebElement getRe_ActiveLeads_View_button() {
		return Re_ActiveLeads_View_button;
	}

	public WebElement getRe_opportunityCreated_view_Button() {
		return Re_opportunityCreated_view_Button;
	}

	public WebElement getRe_Org_Name() {
		return Re_Org_Name;
	}

	public WebElement getRe_Org_Email() {
		return Re_Org_Email;
	}

	public WebElement getRe_Org_MobileNumber() {
		return Re_Org_MobileNumber;
	}

	public WebElement getRe_Org_Address_1() {
		return Re_Org_Address_1;
	}

	public WebElement getRe_Org_Address_2() {
		return Re_Org_Address_2;
	}

	public WebElement getRe_Org_State() {
		return Re_Org_State;
	}

	public WebElement getRe_Org_DISTRICT() {
		return Re_Org_DISTRICT;
	}

	public WebElement getRe_Org_CITY() {
		return Re_Org_CITY;
	}

	public WebElement getRe_Org_pincode() {
		return Re_Org_pincode;
	}

	public WebElement getRe_Org_Retail_Radio_Button() {
		return Re_Org_Retail_Radio_Button;
	}

	public WebElement getRe_Org_Corporate_Redio_Button() {
		return Re_Org_Corporate_Redio_Button;
	}

	public WebElement getRe_Org_Fig_Redio_Button() {
		return Re_Org_Fig_Redio_Button;
	}

	public WebElement getRe_Org_Business_email() {
		return Re_Org_Business_email;
	}

	public WebElement getRe_Org_O2O_Redio_Button() {
		return Re_Org_O2O_Redio_Button;
	}

	public WebElement getRe_Org_Tecnology_Redio_Button() {
		return Re_Org_Tecnology_Redio_Button;
	}

	public WebElement getRe_Org_CIN_NUMBER() {
		return Re_Org_CIN_NUMBER;
	}

	public WebElement getRe_Org_WEBSITE() {
		return Re_Org_WEBSITE;
	}

	public WebElement getRe_Org_TURNOVER() {
		return Re_Org_TURNOVER;
	}

	public WebElement getRe_Cont_Name() {
		return Re_Cont_Name;
	}

	public WebElement getRe_Cont_Designation() {
		return Re_Cont_Designation;
	}

	public WebElement getRe_Cont_CATEGORY() {
		return Re_Cont_CATEGORY;
	}

	public WebElement getRe_Cont_Email() {
		return Re_Cont_Email;
	}

	public WebElement getRe_Cont_MobileNO() {
		return Re_Cont_MobileNO;
	}

	public WebElement getRe_Activities_Comments() {
		return Re_Activities_Comments;
	}

	public WebElement getSave_Ok_Button() {
		return Save_Ok_Button;
	}

	public WebElement getRe_Confirmation_Add_Button() {
		return Re_Confirmation_Add_Button;
	}

	public WebElement getRe_MeetingArrangement_Add_Button() {
		return Re_MeetingArrangement_Add_Button;
	}

	public WebElement getRe_BusinessPresentation_Add_Button() {
		return Re_BusinessPresentation_Add_Button;
	}

	public WebElement getRe_IT_Demonstration_add_Button() {
		return Re_IT_Demonstration_add_Button;
	}

	public WebElement getRe_Update_Organization_details_Task_Close_Button() {
		return Re_Update_Organization_details_Task_Close_Button;
	}

	public WebElement getRe_Confirmation_ofthe_Stakeholders_Task_Close_Button() {
		return Re_Confirmation_ofthe_Stakeholders_Task_Close_Button;
	}

	public WebElement getRe_Meeting_Arrangement_Task_Close_Button() {
		return Re_Meeting_Arrangement_Task_Close_Button;
	}

	public WebElement getRe_Business_Presentation_Task_Close_Button() {
		return Re_Business_Presentation_Task_Close_Button;
	}

	public WebElement getRe_IT_Demonstration_Task_Close_Button() {
		return Re_IT_Demonstration_Task_Close_Button;
	}

	public WebElement getRe_Identificationof_stakeholders_Task_Close_Button() {
		return Re_Identificationof_stakeholders_Task_Close_Button;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getLeadloss_Comment_TextBox() {
		return Leadloss_Comment_TextBox;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getZm_RawdataUpload_Button() {
		return Zm_RawdataUpload_Button;
	}

	public WebElement getZM_AllLeads_view_button() {
		return ZM_AllLeads_view_button;
	}

	public WebElement getCheckBox2() {
		return checkBox2;
	}

}
