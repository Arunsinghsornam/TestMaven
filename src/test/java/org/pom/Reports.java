package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports extends BaseClass{
	/*-------------------------Report--------------------------------------*/

	@FindBy(xpath="//span[normalize-space()='Reports']")
	private WebElement Reports;

	public WebElement getReports() {
		return Reports;
	}


	
	/*-------------------------ProductionWiseBusiness--------------------------------------*/
	@FindBy(xpath="//a[normalize-space()='Product Wise Business']")
	private WebElement ProductWiseBusiness;

	public WebElement getProductWiseBusiness() {
		return ProductWiseBusiness;
	}
	/*-------------------------ProductionWiseBusiness(Daily Reports)--------------------------------------*/
	@FindBy(id="tab")
	private WebElement Daily;

	@FindBy(xpath="//*[@id=\"product_dayfilter_clear\"]")
	private WebElement ResetButton_Reports;

	@FindBy(xpath="//*[@id=\"productdaily_date\"]")
	private WebElement Date_Reports;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_wrapper\"]/div/div[2]/button/span")
	private WebElement Excel_Reports;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement ShowDropDown_Reports;

	public WebElement getDaily() {
		return Daily;
	}

	public WebElement getResetButton_Reports() {
		return ResetButton_Reports;
	}

	public WebElement getDate_Reports() {
		return Date_Reports;
	}

	public WebElement getExcel_Reports() {
		return Excel_Reports;
	}

	public WebElement getShowDropDown_Reports() {
		return ShowDropDown_Reports;
	}

	/*-------------------------ProductionWiseBusiness(Monthly Reports)--------------------------------------*/
	@FindBy(id="monthly_emp")
	private WebElement Monthly;


	@FindBy(id="productmonth_fromdate")
	private WebElement SelectMonth_Monthly;


	@FindBy(id="productmonth_todate")
	private WebElement SelectYear_Monthly;


	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement Show_Monthlyprodctwisereports;

	@FindBy(xpath="//*[@id=\"zone_monthfilter_btn\"]")
	private WebElement Ok_Reports;


	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_Monthlyprodctwisereports;


	@FindBy(xpath="//*[@id=\"product_yearfilter_clear\"]")
	private WebElement Resetbutton_Monthlyprodctwisereports;

	public WebElement getSelectMonth_Monthly() {
		return SelectMonth_Monthly;
	}

	public WebElement getSelectYear_Monthly() {
		return SelectYear_Monthly;
	}


	public WebElement getShow_Monthly_prodctwisereports() {
		return Show_Monthlyprodctwisereports;
	}

	public WebElement getExcel_Monthly_prodctwisereports() {
		return Excel_Monthlyprodctwisereports;
	}

	public WebElement getResetbutton_Monthly_prodctwisereports() {
		return Resetbutton_Monthlyprodctwisereports;
	}


	public WebElement getMonthly() {
		return Monthly;
	}



	public WebElement getOk_Reports() {
		return Ok_Reports;
	}
	/*-------------------------ProductionWiseBusiness(Annual Reports)--------------------------------------*/


	@FindBy(id="yearly_emp")
	private WebElement Annual;

	@FindBy(xpath="//*[@id=\"productyear_todate\"]")
	private WebElement SelectYear_Annual;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement show_Annualprodctwisereports;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button/span")
	private WebElement Excel_Annualprodctwisereports;

	@FindBy(xpath="//*[@id=\"product_yearfilter_clear\"]")
	private WebElement Reset_Annualprodctwisereports;

	public WebElement getShow_Monthlyprodctwisereports() {
		return Show_Monthlyprodctwisereports;
	}

	public WebElement getExcel_Monthlyprodctwisereports() {
		return Excel_Monthlyprodctwisereports;
	}


	public WebElement getAnnual() {
		return Annual;
	}

	public WebElement getSelectYear_Annual() {
		return SelectYear_Annual;
	}

	public WebElement getShow_Annualprodctwisereports() {
		return show_Annualprodctwisereports;
	}

	public WebElement getExcel_Annual_prodctwisereports() {
		return Excel_Annualprodctwisereports;
	}


	public WebElement getReset_Annualprodctwisereports() {
		return Reset_Annualprodctwisereports;
	}

	/*-------------------------ZonesWiseBusiness(Daily Reports)--------------------------------------*/
	@FindBy(xpath="//a[normalize-space()='Zonal Wise Business']")
	private WebElement ZoneWiseBusiness;

	@FindBy(xpath="//*[@id=\"zonedaily_date\"]")
	private WebElement SelectDate_DailyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zone_dayfilter_clear\"]")
	private WebElement Reset_DailyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement show_DailyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_DailyZoneWiseReport;


	public WebElement getZoneWiseBusiness() {
		return ZoneWiseBusiness;
	}

	public WebElement getSelectDate_DailyZoneWiseReport() {
		return SelectDate_DailyZoneWiseReport;
	}

	public WebElement getReset_DailyZoneWiseReport() {
		return Reset_DailyZoneWiseReport;
	}

	public WebElement getShow_DailyZoneWiseReport() {
		return show_DailyZoneWiseReport;
	}

	public WebElement getExcel_DailyZoneWiseReport() {
		return Excel_DailyZoneWiseReport;
	}
	/*-------------------------ZonesWiseBusiness(Monthly Reports)--------------------------------------*/
	//	@FindBy(xpath="//*[@id=\"monthly_emp\"]")
	//	private WebElement Monthly_ZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zonemonth_todate\"]")
	private WebElement SelectYear_MonthlyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zonemonth_fromdate\"]")
	private WebElement SelectMonth_MonthlyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement Show_MonthlyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button/span")
	private WebElement Excel_MonthlyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zone_monthfilter_clear\"]")
	private WebElement Reset_MonthlyZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zone_monthfilter_btn\"]")
	private WebElement ok_MonthlyZoneWiseReport;


	public WebElement getOk_MonthlyZoneWiseReport() {
		return ok_MonthlyZoneWiseReport;
	}

	public WebElement getSelectYear_MonthlyZoneWiseReport() {
		return SelectYear_MonthlyZoneWiseReport;
	}

	public WebElement getSelectMonth_MonthlyZoneWiseReport() {
		return SelectMonth_MonthlyZoneWiseReport;
	}

	public WebElement getShow_MonthlyZoneWiseReport() {
		return Show_MonthlyZoneWiseReport;
	}

	public WebElement getExcel_MonthlyZoneWiseReport() {
		return Excel_MonthlyZoneWiseReport;
	}

	public WebElement getReset_MonthlyZoneWiseReport() {
		return Reset_MonthlyZoneWiseReport;
	}

	/*-------------------------ZonesWiseBusiness(Annual Reports)--------------------------------------*/
	//	@FindBy(xpath="//*[@id=\"yearly_emp\"]")
	//	private WebElement Annual_ZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zoneyear_todate\"]")
	private WebElement SelectYear_AnnualZoneWiseReport;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement show_AnnualZoneWiseReport;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button/span")
	private WebElement Execl_AnnualZoneWiseReport;

	@FindBy(xpath="//*[@id=\"zone_yearfilter_clear\"]")
	private WebElement Reset_AnnualZoneWiseReport;



	public WebElement getSelectYear_AnnualZoneWiseReport() {
		return SelectYear_AnnualZoneWiseReport;
	}

	public WebElement getShow_AnnualZoneWiseReport() {
		return show_AnnualZoneWiseReport;
	}

	public WebElement getExecl_AnnualZoneWiseReport() {
		return Execl_AnnualZoneWiseReport;
	}

	public WebElement getReset_AnnualZoneWiseReport() {
		return Reset_AnnualZoneWiseReport;
	}

	/*-------------------------RegionWiseBusiness(Daily Reports)--------------------------------------*/
	@FindBy(xpath="//a[normalize-space()='Region Wise Business']")
	private WebElement RegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"zonedaily_date\"]")
	private WebElement SelectDate_DailyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement Show_DailyRegionWiseBusiness;

	@FindBy(css="#Pro_daily_business_wrapper > div > div.dt-buttons > button > span")
	private WebElement Excel_DailyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"monthly_emp\"]")
	private WebElement Monthly_DailyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"zone_dayfilter_clear\"]")
	private WebElement Reset_DailyRegionWiseBusiness;


	public WebElement getRegionWiseBusiness() {
		return RegionWiseBusiness;
	}

	public WebElement getSelectDate_DailyRegionWiseBusiness() {
		return SelectDate_DailyRegionWiseBusiness;
	}

	public WebElement getShow_DailyRegionWiseBusiness() {
		return Show_DailyRegionWiseBusiness;
	}

	public WebElement getExcel_DailyRegionWiseBusiness() {
		return Excel_DailyRegionWiseBusiness;
	}

	public WebElement getMonthly_DailyRegionWiseBusiness() {
		return Monthly_DailyRegionWiseBusiness;
	}

	public WebElement getReset_DailyRegionWiseBusiness() {
		return Reset_DailyRegionWiseBusiness;
	}

	/*-------------------------RegionWiseBusiness(Monthly Reports)--------------------------------------*/
	@FindBy(xpath="//*[@id=\"zonemonth_fromdate\"]")
	private WebElement SelectMonth_MonthlyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"zonemonth_todate\"]")
	private WebElement SelectYear_MonthlyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"zone_monthfilter_btn\"]")
	private WebElement Ok_MonthlyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"zone_monthfilter_clear\"]")
	private WebElement Reset_MonthlyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement Show_MonthlyRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_MonthlyRegionWiseBusiness;


	public WebElement getSelectMonth_MonthlyRegionWiseBusiness() {
		return SelectMonth_MonthlyRegionWiseBusiness;
	}

	public WebElement getSelectYear_MonthlyRegionWiseBusiness() {
		return SelectYear_MonthlyRegionWiseBusiness;
	}

	public WebElement getOk_MonthlyRegionWiseBusiness() {
		return Ok_MonthlyRegionWiseBusiness;
	}

	public WebElement getReset_MonthlyRegionWiseBusiness() {
		return Reset_MonthlyRegionWiseBusiness;
	}

	public WebElement getShow_MonthlyRegionWiseBusiness() {
		return Show_MonthlyRegionWiseBusiness;
	}

	public WebElement getExcel_MonthlyRegionWiseBusiness() {
		return Excel_MonthlyRegionWiseBusiness;
	}
	/*-------------------------RegionWiseBusiness(Annual Reports)--------------------------------------*/

	@FindBy(xpath="//*[@id=\"zoneyear_todate\"]")
	private WebElement SelectYear_AnnualRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement Show_AnnualRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_AnnualRegionWiseBusiness;

	@FindBy(xpath="//*[@id=\"zone_yearfilter_clear\"]")
	private WebElement Reset_AnnualRegionWiseBusiness;



	public WebElement getSelectYear_AnnualRegionWiseBusiness() {
		return SelectYear_AnnualRegionWiseBusiness;
	}

	public WebElement getShow_AnnualRegionWiseBusiness() {
		return Show_AnnualRegionWiseBusiness;
	}

	public WebElement getExcel_AnnualRegionWiseBusiness() {
		return Excel_AnnualRegionWiseBusiness;
	}

	public WebElement getReset_AnnualRegionWiseBusiness() {
		return Reset_AnnualRegionWiseBusiness;
	}

	/*-------------------------BranchWiseBusiness(Daily Reports)--------------------------------------*/

	@FindBy(xpath="//a[normalize-space()='Branch Wise Business']")
	private WebElement BranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"tab\"]")
	private WebElement DailyBranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"productdaily_date\"]")
	private WebElement Date_DailyBranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement show_DailyBranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_DailyBranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"product_dayfilter_clear\"]")
	private WebElement Reset_DailyBranchWiseBusiness;



	public WebElement getBranchWiseBusiness() {
		return BranchWiseBusiness;
	}

	public WebElement getDailyBranchWiseBusiness() {
		return DailyBranchWiseBusiness;
	}

	public WebElement getDate_DailyBranchWiseBusiness() {
		return Date_DailyBranchWiseBusiness;
	}

	public WebElement getShow_DailyBranchWiseBusiness() {
		return show_DailyBranchWiseBusiness;
	}

	public WebElement getExcel_DailyBranchWiseBusiness() {
		return Excel_DailyBranchWiseBusiness;
	}

	public WebElement getReset_DailyBranchWiseBusiness() {
		return Reset_DailyBranchWiseBusiness;
	}
	/*-------------------------BranchWiseBusiness(Monthly Reports)--------------------------------------*/

	@FindBy(xpath="//*[@id=\"productmonth_fromdate\"]")
	private WebElement SelectMonth_MonthlyBranchWiseBusiness; 

	@FindBy(xpath="//*[@id=\"productmonth_todate\"]")
	private WebElement SelectYear_MonthlyBranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement show_MonthlyBranchWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_MonthlyBranchWiseBusiness;



	public WebElement getSelectMonth_MonthlyBranchWiseBusiness() {
		return SelectMonth_MonthlyBranchWiseBusiness;
	}

	public WebElement getSelectYear_MonthlyBranchWiseBusiness() {
		return SelectYear_MonthlyBranchWiseBusiness;
	}

	public WebElement getShowDropDwon_MonthlyBranchWiseBusiness() {
		return show_MonthlyBranchWiseBusiness;
	}

	public WebElement getExcel_MonthlyBranchWiseBusiness() {
		return Excel_MonthlyBranchWiseBusiness;
	}

	/*-------------------------BranchWiseBusiness(Monthly Reports)--------------------------------------*/

	@FindBy(xpath="//*[@id=\"yearly_emp\"]")
	private WebElement Annual_BranchWiseBisiness;

	@FindBy(xpath="//*[@id=\"productyear_todate\"]")
	private WebElement SelectYear_AnnualBranchWiseBisiness;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement Show_AnnualBranchWiseBisiness;

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_AnnualBranchWiseBisiness;

	@FindBy(xpath="//*[@id=\"product_yearfilter_clear\"]")
	private WebElement Reset_AnnualBranchWiseBisiness;


	public WebElement getAnnual_BranchWiseBisiness() {
		return Annual_BranchWiseBisiness;
	}

	public WebElement getSelectYear_AnnualBranchWiseBisiness() {
		return SelectYear_AnnualBranchWiseBisiness;
	}

	public WebElement getShow_AnnualBranchWiseBisiness() {
		return Show_AnnualBranchWiseBisiness;
	}

	public WebElement getExcel_AnnualBranchWiseBisiness() {
		return Excel_AnnualBranchWiseBisiness;
	}

	public WebElement getReset_AnnualBranchWiseBisiness() {
		return Reset_AnnualBranchWiseBisiness;
	}

	/*-------------------------EmployeeWiseBusiness(Daily Reports)--------------------------------------*/	

	@FindBy(xpath="//a[normalize-space()='Employee Wise Business']")
	private WebElement EmployeeWiseBusiness; 

	@FindBy(id="productdaily_date")
	private WebElement SelectDate_DailyEmployeeWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement show_DailyEmployeeWiseBusiness;

	@FindBy(xpath="//*[@id=\"Pro_daily_business_wrapper\"]/div/div[2]/button")
	private WebElement excel_DailyEmployeeWiseBusiness;

	@FindBy(xpath="//*[@id=\"product_dayfilter_clear\"]")
	private WebElement Reset_DailyEmployeeWiseBusiness;
	

	public WebElement getEmployeeWiseBusiness() {
		return EmployeeWiseBusiness;
	}

	public WebElement getSelectDate_DailyEmployeeWiseBusiness() {
		return SelectDate_DailyEmployeeWiseBusiness;
	}

	public WebElement getShow_DailyEmployeeWiseBusiness() {
		return show_DailyEmployeeWiseBusiness;
	}

	public WebElement getExcel_DailyEmployeeWiseBusiness() {
		return excel_DailyEmployeeWiseBusiness;
	}

	public WebElement getReset_DailyEmployeeWiseBusiness() {
		return Reset_DailyEmployeeWiseBusiness;
	}
	/*-------------------------EmployeeWiseBusiness(Monthly Reports)--------------------------------------*/	
	
	@FindBy(xpath="//*[@id=\"productmonth_todate\"]")
	private WebElement selectYear_MonthlyEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"productmonth_fromdate\"]")
	private WebElement selectMonth_MonthlyEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"zone_monthfilter_btn\"]")
	private WebElement ok_MonthlyEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"product_monthfilter_clear\"]")
	private WebElement Reset_MonthlyEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement show_MonthlyEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button")	
	private WebElement Excel_MonthlyEmployeeWiseBusiness;


	public WebElement getSelectYear_MonthlyEmployeeWiseBusiness() {
		return selectYear_MonthlyEmployeeWiseBusiness;
	}

	public WebElement getSelectMonth_MonthlyEmployeeWiseBusiness() {
		return selectMonth_MonthlyEmployeeWiseBusiness;
	}

	public WebElement getOk_MonthlyEmployeeWiseBusiness() {
		return ok_MonthlyEmployeeWiseBusiness;
	}

	public WebElement getReset_MonthlyEmployeeWiseBusiness() {
		return Reset_MonthlyEmployeeWiseBusiness;
	}

	public WebElement getShow_MonthlyEmployeeWiseBusiness() {
		return show_MonthlyEmployeeWiseBusiness;
	}

	public WebElement getExcel_MonthlyEmployeeWiseBusiness() {
		return Excel_MonthlyEmployeeWiseBusiness;
	}

	/*-------------------------EmployeeWiseBusiness(Annual Reports)--------------------------------------*/	
	
	@FindBy(xpath="//*[@id=\"productyear_todate\"]")
	private WebElement selectYear_AnnualEmployeeWiseBusiness;
	 
	@FindBy(xpath="//*[@id=\"product_yearfilter_clear\"]")
	private WebElement Reset_AnnualEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement show_AnnualEmployeeWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_AnnualEmployeeWiseBusiness;
	
	
	public WebElement getExcel_AnnualEmployeeWiseBusiness() {
		return Excel_AnnualEmployeeWiseBusiness;
	}

	public WebElement getShow_AnnualEmployeeWiseBusiness() {
		return show_AnnualEmployeeWiseBusiness;
	}

	public WebElement getReset_AnnualEmployeeWiseBusiness() {
		return Reset_AnnualEmployeeWiseBusiness;
	}

	public WebElement getSelectYear_AnnualEmployeeWiseBusiness() {
		return selectYear_AnnualEmployeeWiseBusiness;
	}

	/*-------------------------TransactionReports(Annual Reports)--------------------------------------*/		
	
	
	@FindBy(xpath="//a[normalize-space()='Transaction Reports']")
	private WebElement TransactionReports;
	
	@FindBy(xpath="//*[@id=\"select2-orgid-container\"]")
	private WebElement SelectOrganization_TransactionReports;
	
	@FindBy(xpath="//*[@id=\"select2-productid-container\"]")
	private WebElement SelectProduct_TransactionReports;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	private WebElement SearchBar_TransactionReports;
	
	@FindBy(xpath="//*[@id=\"policy_reports\"]")
	private WebElement ok_TransactionReports;
	
	@FindBy(xpath="//*[@id=\"reportTable_length\"]/label/select")
	private WebElement show_TransactionReports;
	
	@FindBy(xpath="//*[@id=\"reportTable_wrapper\"]/div/div[2]/button")
	private WebElement Excel_TransactionReports;
	
	@FindBy(xpath="//input[@id='search_fromdatetime']")
	private WebElement Transaction_fromdate;
	
	@FindBy(xpath="//input[@id='search_todatetime']")
	private WebElement Transaction_Todate;
	
	@FindBy(xpath="//a[@class='fullscreen-link btn btn-default']")
	private WebElement Transaction_screenmax;
	
	
	public WebElement getTransaction_screenmax() {
		return Transaction_screenmax;
	}

	public WebElement getTransaction_Todate() {
		return Transaction_Todate;
	}

	public WebElement getTransaction_fromdate() {
		return Transaction_fromdate;
	}

	

	public WebElement getExcel_TransactionReports() {
		return Excel_TransactionReports;
	}

	public WebElement getShow_TransactionReports() {
		return show_TransactionReports;
	}

	public WebElement getOk_TransactionReports() {
		return ok_TransactionReports;
	}

	public WebElement getSelectProduct_TransactionReports() {
		return SelectProduct_TransactionReports;
	}

	public WebElement getSelectOrganization_TransactionReports() {
		return SelectOrganization_TransactionReports;
	}

	public WebElement getTransactionReports() {
		return TransactionReports;
	}

	/*-------------------------OrganizationWiseReports(Daily Reports)--------------------------------------*/		
	@FindBy(xpath="//a[normalize-space()='Organization Wise Business']")
	private WebElement OrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"productdaily_date\"]")
	private WebElement SelectDate_dailyOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement Show_dailyOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_daily_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_dailyOrganizationWiseBusiness;
	

	@FindBy(xpath="//*[@id=\"product_dayfilter_clear\"]")
	private WebElement Reset_dailyOrganizationWiseBusiness;
	
	

	public WebElement getShow_dailyOrganizationWiseBusiness() {
		return Show_dailyOrganizationWiseBusiness;
	}

	public WebElement getExcel_dailyOrganizationWiseBusiness() {
		return Excel_dailyOrganizationWiseBusiness;
	}

	public WebElement getReset_dailyOrganizationWiseBusiness() {
		return Reset_dailyOrganizationWiseBusiness;
	}

	public WebElement getOrganizationWiseBusiness() {
		return OrganizationWiseBusiness;
	}

	public WebElement getSelectDate_dailyOrganizationWiseBusiness() {
		return SelectDate_dailyOrganizationWiseBusiness;
	}

	
	/*-------------------------OrganizationWiseReports(Monthly Reports)--------------------------------------*/	
	
	@FindBy(xpath="//*[@id=\"productmonth_fromdate\"]")
	private WebElement Selectmonth_montlyOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"productmonth_todate\"]")
	private WebElement Selectyear_montlyOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"zone_monthfilter_btn\"]")
	private WebElement ok_montlyOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"product_monthfilter_clear\"]")
	private WebElement Reset_montlyOrganizationWiseBusiness;
	

	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement show_montlyOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_montlyOrganizationWiseBusiness;
	

	public WebElement getSelectmonth_montlyOrganizationWiseBusiness() {
		return Selectmonth_montlyOrganizationWiseBusiness;
	}

	public WebElement getSelectyear_montlyOrganizationWiseBusiness() {
		return Selectyear_montlyOrganizationWiseBusiness;
	}

	public WebElement getOk_dailyOrganizationWiseBusiness() {
		return ok_montlyOrganizationWiseBusiness;
	}

	public WebElement getReset_montlyOrganizationWiseBusiness() {
		return Reset_montlyOrganizationWiseBusiness;
	}

	public WebElement getShow_montlyOrganizationWiseBusiness() {
		return show_montlyOrganizationWiseBusiness;
	}

	public WebElement getExcel_montlyOrganizationWiseBusiness() {
		return Excel_montlyOrganizationWiseBusiness;
	}


	/*-------------------------OrganizationWiseReports(Annual Reports)--------------------------------------*/	
	
	@FindBy(xpath="//*[@id=\"productyear_todate\"]")
	private WebElement SelectYear_AnnualOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"product_yearfilter_clear\"]")
	private WebElement Reset_AnnualOrganizationWiseBusiness;
	

	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement show_AnnualOrganizationWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_AnnualOrganizationWiseBusiness;
	
	
	public WebElement getSelectYear_AnnualOrganizationWiseBusiness() {
		return SelectYear_AnnualOrganizationWiseBusiness;
	}

	public WebElement getReset_AnnualOrganizationWiseBusiness() {
		return Reset_AnnualOrganizationWiseBusiness;
	}

	public WebElement getShow_AnnualOrganizationWiseBusiness() {
		return show_AnnualOrganizationWiseBusiness;
	}

	public WebElement getExcel_AnnualOrganizationWiseBusiness() {
		return Excel_AnnualOrganizationWiseBusiness;
	}
	
	/*-------------------------InsuranceCompanyWiseBusiness(daily Reports)--------------------------------------*/	
	@FindBy(xpath="//a[normalize-space()='Insurance Company Wise Business']")
	private WebElement InsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"productdaily_date\"]")
	private WebElement selectdate_dailyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"product_dayfilter_clear\"]")
	private WebElement reset_dailyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_daily_business_length\"]/label/select")
	private WebElement show_dailyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_daily_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_dailyInsuranceCompanyWiseBusiness;
	
	
	
	
	public WebElement getInsuranceCompanyWiseBusiness() {
		return InsuranceCompanyWiseBusiness;
	}

	public WebElement getSelectdate_dailyInsuranceCompanyWiseBusiness() {
		return selectdate_dailyInsuranceCompanyWiseBusiness;
	}

	public WebElement getReset_dailyInsuranceCompanyWiseBusiness() {
		return reset_dailyInsuranceCompanyWiseBusiness;
	}

	public WebElement getShow_dailyInsuranceCompanyWiseBusiness() {
		return show_dailyInsuranceCompanyWiseBusiness;
	}

	public WebElement getExcel_dailyInsuranceCompanyWiseBusiness() {
		return Excel_dailyInsuranceCompanyWiseBusiness;
	}

	/*-------------------------InsuranceCompanyWiseBusiness(monthly Reports)--------------------------------------*/	
	@FindBy(xpath="//*[@id=\"productmonth_todate\"]")
	private WebElement selectyear_monthlyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"productmonth_fromdate\"]")
	private WebElement selectmonth_monthlyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_monthly_business_length\"]/label/select")
	private WebElement show_monthlyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_monthly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_monthlyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"zone_monthfilter_btn\"]")
	private WebElement ok_monthlyInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"product_monthfilter_clear\"]")
	private WebElement reset_monthlyInsuranceCompanyWiseBusiness;
	
	
	public WebElement getSelectyear_monthlyInsuranceCompanyWiseBusiness() {
		return selectyear_monthlyInsuranceCompanyWiseBusiness;
	}

	public WebElement getSelectmonth_monthlyInsuranceCompanyWiseBusiness() {
		return selectmonth_monthlyInsuranceCompanyWiseBusiness;
	}

	public WebElement getShow_monthlyInsuranceCompanyWiseBusiness() {
		return show_monthlyInsuranceCompanyWiseBusiness;
	}

	public WebElement getExcel_monthlyInsuranceCompanyWiseBusiness() {
		return Excel_monthlyInsuranceCompanyWiseBusiness;
	}

	public WebElement getOk_monthlyInsuranceCompanyWiseBusiness() {
		return ok_monthlyInsuranceCompanyWiseBusiness;
	}

	public WebElement getReset_monthlyInsuranceCompanyWiseBusiness() {
		return reset_monthlyInsuranceCompanyWiseBusiness;
	}

	/*-------------------------InsuranceCompanyWiseBusiness(Annual Reports)--------------------------------------*/	
	@FindBy(xpath="//*[@id=\"productyear_todate\"]")
	private WebElement selectyear_annualInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"product_yearfilter_clear\"]")
	private WebElement reset_annualInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
	private WebElement show_annualInsuranceCompanyWiseBusiness;
	
	@FindBy(xpath="//*[@id=\"Pro_yearly_business_wrapper\"]/div/div[2]/button")
	private WebElement Excel_annualInsuranceCompanyWiseBusiness;
	
	
	
	
	public WebElement getSelectyear_annualInsuranceCompanyWiseBusiness() {
		return selectyear_annualInsuranceCompanyWiseBusiness;
	}

	public WebElement getReset_annualInsuranceCompanyWiseBusiness() {
		return reset_annualInsuranceCompanyWiseBusiness;
	}

	public WebElement getShow_annualInsuranceCompanyWiseBusiness() {
		return show_annualInsuranceCompanyWiseBusiness;
	}

	public WebElement getExcel_annualInsuranceCompanyWiseBusiness() {
		return Excel_annualInsuranceCompanyWiseBusiness;
	}
	
	
	//................Policies Data.........................//
	
		@FindBy (xpath="//a[normalize-space()='Policies Data']")
		private WebElement report_policiesData;
		
		@FindBy (xpath="//select[@id='orgid']")
		private WebElement report_pd_organizationSelect;
		
		@FindBy (xpath="//select[@id='productid']")
		private WebElement report_pd_productSelect;
		
		@FindBy (xpath="//input[@id='search_fromdate']")
		private WebElement report_pd_FromDate;
		
		@FindBy (xpath="//input[@id='search_todate']")
		private WebElement report_pd_ToDate;
		
		@FindBy (xpath="//button[@id='policy_reports']")
		private WebElement report_pd_okbuton;
		
		
		public WebElement getReport_policiesData() {
			return report_policiesData;
		}

		public WebElement getReport_pd_organizationSelect() {
			return report_pd_organizationSelect;
		}

		public WebElement getReport_pd_productSelect() {
			return report_pd_productSelect;
		}

		public WebElement getReport_pd_FromDate() {
			return report_pd_FromDate;
		}

		public WebElement getReport_pd_ToDate() {
			return report_pd_ToDate;
		}

		public WebElement getReport_pd_okbuton() {
			return report_pd_okbuton;
		}
	
	
	

	public WebElement getResetbutton_Monthlyprodctwisereports() {
			return Resetbutton_Monthlyprodctwisereports;
		}

		public WebElement getExcel_Annualprodctwisereports() {
			return Excel_Annualprodctwisereports;
		}

		public WebElement getShow_MonthlyBranchWiseBusiness() {
			return show_MonthlyBranchWiseBusiness;
		}

		public WebElement getSearchBar_TransactionReports() {
			return SearchBar_TransactionReports;
		}

		public WebElement getOk_montlyOrganizationWiseBusiness() {
			return ok_montlyOrganizationWiseBusiness;
		}

		//============================================
		@FindBy (xpath="//*[@id=\"Pro_yearly_business_length\"]/label/select")
		private WebElement Admin_reportshow;
		

	public WebElement getAdmin_reportshow() {
			return Admin_reportshow;
		}
	@FindBy(xpath="//a[normalize-space()='Medical Waiting']")
	private WebElement Reports_medical;
	
	@FindBy(xpath="//select[@name='reportTable_length']")
	private WebElement Reports_medicalwaiting_show;
	
	
	
	public WebElement getReports_medical() {
		return Reports_medical;
	}

	public WebElement getReports_medicalwaiting_show() {
		return Reports_medicalwaiting_show;
	}
	/*------------------------------------------------------------------------------------------------------------*/	
	public Reports() {
		PageFactory.initElements(driver, this);
	}





}
