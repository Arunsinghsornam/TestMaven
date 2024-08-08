package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Claimpage extends BaseClass {

	@FindBy(xpath = "//span[text()='Claims']")
	private WebElement claims;

	@FindBy(xpath = "//a[normalize-space()='Monthly Claims Data']")
	private WebElement claimsMonthlyClaimsData;

	@FindBy(xpath = "//a[normalize-space()='Claims Reports']")
	private WebElement claimsReports;

	@FindBy(xpath = "//a[normalize-space()='Dash Board']")
	private WebElement claimsDashboard;

	@FindBy(xpath = "//a[normalize-space()='Claim Holidays List']")
	private WebElement claimsHolidayList;

	@FindBy(xpath = "//a[normalize-space()='Claim Bulk Intimation']")
	private WebElement claimsBulkIntimation;

	@FindBy(xpath = "//select[@id='claimyear_todate']")
	private WebElement claimsMonthlyDataSelectYear;

	@FindBy(xpath = "//select[@id='claimmonth_todate']")
	private WebElement claimsMonthlyDataSelectMonth;

	@FindBy(xpath = "//a[@id='product_yearfilter_search']")
	private WebElement claimsMonthlyDataSearch;

	@FindBy(xpath = "//a[@id='product_yearfilter_clear']")
	private WebElement claimsMonthlyDataReset;

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement claimsReportFilter;

	@FindBy(xpath = "//select[@id='businesstypeid']")
	private WebElement claimsReportBusinessType;

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement claimsReportOrganization;

	@FindBy(xpath = "//select[@id='productid']")
	private WebElement claimsReportProduct;

	@FindBy(xpath = "//input[@id='filter_mobile']")
	private WebElement claimsReportMobileNumber;

	@FindBy(xpath = "//input[@id='filter_mail']")
	private WebElement claimsReportEmail;

	@FindBy(xpath = "//select[@id='filter_claim_Status_Id']")
	private WebElement claimsReportClaimStatus;

	@FindBy(xpath = "//input[@id='filter_refnumber']")
	private WebElement claimsReportClaimReference;

	@FindBy(xpath = "//input[@id='filter_coinumber']")
	private WebElement claimsReportCOINumber;

	@FindBy(xpath = "//input[@id='filter_loannumber']")
	private WebElement claimsReportLoanAccountNumber;

	@FindBy(xpath = "//input[@id='filter_claimid']")
	private WebElement claimsReportClaimID;

	@FindBy(xpath = "//a[@id='btn_filter']")
	private WebElement claimsReportApplyButton;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement claimsReportResetButton;

	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-0.6 css-f7r9ys-MuiGrid-root']//button[@type='button']//*[name()='svg']")
	private WebElement claimsHolidayPreviousButton;

	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-0.1 css-1hc7gqb-MuiGrid-root']//button[@type='button']//*[name()='svg']")
	private WebElement claimsHolidayNextButton;

	@FindBy(xpath = "//button[normalize-space()='Save Holidays']")
	private WebElement claimsHolidaySaveButton;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement claimsBulkIntimationBackButton;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement claimsBulkIntimationFullscreenButton;

	@FindBy(xpath = "//a[normalize-space()='Click Here']")
	private WebElement claimsBulkIntimationClickHereLink;

	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement claimsBulkIntimationBrowseButton;

	@FindBy(xpath = "//a[normalize-space()='Multiple Members Claims Details']")
	private WebElement claimsBulkIntimationMultipleMemberClaimDetail;

	@FindBy(xpath = "//a[normalize-space()='Single Member Claims Details']")
	private WebElement claimsBulkIntimationSingleMemberClaimDetail;

	@FindBy(xpath = "//a[@href='/home']")
	private WebElement Homepage;

	@FindBy(xpath = "//select[@name='claims_yearly_business_length']")
	private WebElement Showbtn;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement Excelbtn;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement FilterTextsearchbox;

	@FindBy(xpath = "//select[@name='filterreportTable_length']")
	private WebElement claimreportshowbtn;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement claims_Reports_show;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement claimreport_show;

	public WebElement getClaimreport_show() {
		return claimreport_show;
	}

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement claims_Reports_Excel;

	public WebElement getClaims_Reports_Excel() {
		return claims_Reports_Excel;
	}

	public WebElement getClaimreportshowbtn() {
		return claimreportshowbtn;
	}

	public WebElement getClaims_Reports_show() {
		return claims_Reports_show;
	}

	public WebElement getOrganizationwiseShowbtn() {
		return organizationwiseShowbtn;
	}

	public WebElement getOrganizationwiseexcelbtn() {
		return organizationwiseexcelbtn;
	}

	public WebElement getClaimbulkintimationexpandbtn() {
		return claimbulkintimationexpandbtn;
	}

	public WebElement getclaimreportshowbtn() {
		return claimreportshowbtn;
	}

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement statuswiseShowbtn;

	@FindBy(xpath = "//div[@id='reportTable_wrapper']//div//button[@type='button']")
	private WebElement statuswiseexcelbtn;

	@FindBy(xpath = "//select[@name='channelTable_length']")
	private WebElement channelwiseShowbtn;

	@FindBy(xpath = "//div[@id='channelTable_wrapper']//div//button[@type='button']")
	private WebElement channelwiseexcelbtn;

	@FindBy(xpath = "//select[@name='orgreportTable_length']")
	private WebElement organizationwiseShowbtn;

	@FindBy(xpath = "//div[@id='orgreportTable_wrapper']//div//button[@type='button']")
	private WebElement organizationwiseexcelbtn;

	@FindBy(xpath = "//select[@name='insureportTable_length']")
	private WebElement insurancewiseShowbtn;

	@FindBy(xpath = "//div[@id='insureportTable_wrapper']//div//button[@type='button']")
	private WebElement insurancewiseexcelbtn;

	@FindBy(xpath = "//button[@class='swal2-deny swal2-styled']")
	private WebElement claimholidaylistcancelbtn;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement claimbulkintimationexpandbtn;

	public WebElement getclaimbulkintimationexpandbtn() {
		return claimbulkintimationexpandbtn;
	}

	public WebElement getClaimholidaylistcancelbtn() {
		return claimholidaylistcancelbtn;
	}

	public WebElement getStatuswiseexcelbtn() {
		return statuswiseexcelbtn;
	}

	public WebElement getStatuswiseShowbtn() {
		return statuswiseShowbtn;
	}

	public WebElement getChannelwiseexcelbtn() {
		return channelwiseexcelbtn;
	}

	public WebElement getChannelwiseShowbtn() {
		return channelwiseShowbtn;
	}

	public WebElement getOrgwiseexcelbtn() {
		return organizationwiseexcelbtn;
	}

	public WebElement getOrgwiseShowbtn() {
		return organizationwiseShowbtn;
	}

	public WebElement getInsurancewiseexcelbtn() {
		return insurancewiseexcelbtn;
	}

	public WebElement getInsurancewiseShowbtn() {
		return insurancewiseShowbtn;
	}

	public WebElement getFilterTextsearchbox() {
		return FilterTextsearchbox;
	}

	public WebElement getExcelbtn() {
		return Excelbtn;
	}

	public WebElement getShowbtn() {
		return Showbtn;
	}

	public WebElement getClaims() {
		return claims;
	}

	public WebElement getClaimsMonthlyClaimsData() {
		return claimsMonthlyClaimsData;
	}

	public WebElement getClaimsReports() {
		return claimsReports;
	}

	public WebElement getClaimsDashboard() {
		return claimsDashboard;
	}

	public WebElement getClaimsHolidayList() {
		return claimsHolidayList;
	}

	public WebElement getClaimsBulkIntimation() {
		return claimsBulkIntimation;
	}

	public WebElement getClaimsMonthlyDataSelectYear() {
		return claimsMonthlyDataSelectYear;
	}

	public WebElement getClaimsMonthlyDataSelectMonth() {
		return claimsMonthlyDataSelectMonth;
	}

	public WebElement getClaimsMonthlyDataSearch() {
		return claimsMonthlyDataSearch;
	}

	public WebElement getClaimsMonthlyDataReset() {
		return claimsMonthlyDataReset;
	}

	public WebElement getClaimsReportFilter() {
		return claimsReportFilter;
	}

	public WebElement getClaimsReportBusinessType() {
		return claimsReportBusinessType;
	}

	public WebElement getClaimsReportOrganization() {
		return claimsReportOrganization;
	}

	public WebElement getClaimsReportProduct() {
		return claimsReportProduct;
	}

	public WebElement getClaimsReportMobileNumber() {
		return claimsReportMobileNumber;
	}

	public WebElement getClaimsReportEmail() {
		return claimsReportEmail;
	}

	public WebElement getClaimsReportClaimStatus() {
		return claimsReportClaimStatus;
	}

	public WebElement getClaimsReportClaimReference() {
		return claimsReportClaimReference;
	}

	public WebElement getClaimsReportCOINumber() {
		return claimsReportCOINumber;
	}

	public WebElement getClaimsReportLoanAccountNumber() {
		return claimsReportLoanAccountNumber;
	}

	public WebElement getClaimsReportClaimID() {
		return claimsReportClaimID;
	}

	public WebElement getClaimsReportApplyButton() {
		return claimsReportApplyButton;
	}

	public WebElement getClaimsReportResetButton() {
		return claimsReportResetButton;
	}

	public WebElement getClaimsHolidayPreviousButton() {
		return claimsHolidayPreviousButton;
	}

	public WebElement getClaimsHolidayNextButton() {
		return claimsHolidayNextButton;
	}

	public WebElement getClaimsHolidaySaveButton() {
		return claimsHolidaySaveButton;
	}

	public WebElement getClaimsBulkIntimationBackButton() {
		return claimsBulkIntimationBackButton;
	}

	public WebElement getClaimsBulkIntimationFullscreenButton() {
		return claimsBulkIntimationFullscreenButton;
	}

	public WebElement getClaimsBulkIntimationClickHereLink() {
		return claimsBulkIntimationClickHereLink;
	}

	public WebElement getClaimsBulkIntimationBrowseButton() {
		return claimsBulkIntimationBrowseButton;
	}

	public WebElement getClaimsBulkIntimationMultipleMemberClaimDetail() {
		return claimsBulkIntimationMultipleMemberClaimDetail;
	}

	public WebElement getClaimsBulkIntimationSingleMemberClaimDetail() {
		return claimsBulkIntimationSingleMemberClaimDetail;
	}

	public WebElement getHomepage() {
		return Homepage;
	}

	// ------------------------Admin claims-----------------------------//
	@FindBy(xpath = "//*[@id=\"filterreportTable_length\"]/label/select")
	private WebElement admin_claimsshowcount;

	public WebElement getAdmin_claimsshowcount() {
		return admin_claimsshowcount;
	}

	// -------------------Admin-------------------//
	@FindBy(xpath = "//*[@id=\"filterreportTable_length\"]/label/select")
	private WebElement Claims_Reports_show_Admin;

	public WebElement getClaims_Reports_show_Admin() {
		return Claims_Reports_show_Admin;
	}

	@FindBy(xpath = "//table[@id='reportTable']//tr[1]//td[27]//a[1]")
	private WebElement claimreportdocumentsbtn;

	@FindBy(xpath = "//table[@id='reportTable']//tr[1]//td[27]//a[3]")
	private WebElement updateclaimstatus;

	@FindBy(xpath = "//button[@data-dismiss='modal']//span[@aria-hidden='true'][normalize-space()='×']")
	private WebElement updateclaimstatusclosebtn;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement Claimreportdocumentbackbtn;

	public WebElement getupdateclaimstatusclosebtn() {
		return updateclaimstatusclosebtn;
	}

	public WebElement getupdateclaimstatus() {
		return updateclaimstatus;
	}

	public WebElement getclaimreportdocumentsbtn() {
		return claimreportdocumentsbtn;
	}

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement claimshowbtn;

	public WebElement getClaimreportdocumentsbtn() {
		return claimreportdocumentsbtn;
	}

	public WebElement getUpdateclaimstatus() {
		return updateclaimstatus;
	}

	public WebElement getUpdateclaimstatusclosebtn() {
		return updateclaimstatusclosebtn;
	}

	public WebElement getClaimreportdocumentbackbtn() {
		return Claimreportdocumentbackbtn;
	}

	public WebElement getClaimshowbtn() {
		return claimshowbtn;
	}

	@FindBy(xpath = "//select[@id='businesstypeid']")
	private WebElement Claim_select;

	public WebElement getClaim_select() {
		return Claim_select;
	}

	@FindBy(xpath = "//select[@id='productid']")
	private WebElement Claim_productid;
	
	@FindBy(xpath = "//select[@id='filter_claim_Status_Id']")
	private WebElement Claim_Status;

	public WebElement getClaim_productid() {
		return Claim_productid;
	}

	public WebElement getClaim_Status() {
		return Claim_Status;
	}

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement Claim_orgSelect;

	public WebElement getClaim_orgSelect() {
		return Claim_orgSelect;
	}
	
	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[27]/a[3]")
	private WebElement claimupdatestatus;
	
	public WebElement getclaimupdatestatus() {
		return claimupdatestatus;
	}
	
	@FindBy(xpath = "//tbody[1]/tr[3]/td[4]/div[1]/div[1]/span[1]/span[1]/input[1]")
	private WebElement Dischargesummary;

	public WebElement getDischargesummary() {
		return Dischargesummary;
	}

	public Claimpage() {
		PageFactory.initElements(driver, this);
	}

}
