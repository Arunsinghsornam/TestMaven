package org.pom;
import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductManagement extends BaseClass {

	// ==============products===============//
	@FindBy(xpath = "//select[@id='premiumcaltypeid']")
	private WebElement PmPremiumCalclution;

	public WebElement getPmPremiumCalclution() {
		return PmPremiumCalclution;
	}

	@FindBy(xpath = "//span[normalize-space()='Product Management']")
	private WebElement productManagement;

	@FindBy(xpath = "//a[normalize-space()='Products']")
	private WebElement pmProducts;

	@FindBy(id = "product_name")
	private WebElement pmProductName;

	@FindBy(xpath = "//a[normalize-space()='Published Products']")
	private WebElement pmPublishedProduct;

	@FindBy(xpath = "//a[normalize-space()='Expired Products']")
	private WebElement pmExpiredProducts;

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/div[1]/div/ol/li[1]/a")
	private WebElement pmProductHomeButton;

	@FindBy(xpath = "//*[@id=\"btn_AddProduct\"]")
	private WebElement pmNewProduct;

	@FindBy(xpath = "//*[@id=\"pageactions\"]/div/a[2]")
	private WebElement pmProductExpandButton;

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a")
	private WebElement pmLogoutButton;

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[2]/a")
	private WebElement pmHelpButton;

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[1]/nav/div/a")
	private WebElement pmMinimalizeButton;

	@FindBy(id = "reportTable_next")
	private WebElement pmProductNextButton;

	@FindBy(id = "reportTable_previous")
	private WebElement pmProductPreviousButton;

	@FindBy(xpath = "//*[@id=\"tab-0\"]/div/div[1]/div[1]/div/a/i")
	private WebElement pmProductFilterButton;

	@FindBy(id = "btn_filter")
	private WebElement pmProductApplyFilter;

	@FindBy(id = "btn_filter_clear")
	private WebElement pmProductResetFilterButton;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/ul/li[1]/a")
	private WebElement pmProductDetails;

	@FindBy(xpath = "/html/body/div[2212]/div[7]/button[2]")
	private WebElement pmProductConfirmButton;

	@FindBy(xpath = "//button[@class='cancel']")
	private WebElement pmProductCancelButton;

	public WebElement getPmProductConfirmButton() {
		return pmProductConfirmButton;
	}

	public WebElement getPmProductCancelButton() {
		return pmProductCancelButton;
	}

	public WebElement getPmProductMemberform() {
		return pmProductMemberform;
	}

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/ul/li[5]/a")
	private WebElement pmProductCoverage;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/ul/li[6]/a")
	private WebElement pmProductSumInsured;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/ul/li[7]/a")
	private WebElement pmProductClaimDocuments;

	@FindBy(xpath = "//*[@id=\"alertsettings_tab\"]")
	private WebElement pmProductAlert;

	@FindBy(id = "product_des")
	private WebElement pmInsuranceProductName;

	@FindBy(id = "pro_biz_type")
	private WebElement pmBusinessType;

	@FindBy(id = "pro_biz_line_type")
	private WebElement pmBusinessLineType;

	@FindBy(id = "segmentid")
	private WebElement pmProductSegment;

	@FindBy(id = "subsegmentid")
	private WebElement pmProductSubSegment;

	@FindBy(id = "orgid")
	private WebElement pmOrganizationName;

	@FindBy(id = "companyid")
	private WebElement pmInsuranceCompanyName;

	@FindBy(id = "masterpolicynumber")
	private WebElement pmMasterPolicynumber;

	@FindBy(id = "product_uinumber")
	private WebElement pmProductUIN;

	@FindBy(id = "saletypeid")
	private WebElement pmProductSaleType;

	@FindBy(id = "wallettypeid")
	private WebElement pmWalletType;

	@FindBy(id = "masterpolicy_datetime")
	private WebElement pmMasterPolicyDatetime;

	@FindBy(id = "masterpolicy_end_datetime")
	private WebElement pmMasterPolicyEndDatetime;

	@FindBy(id = "loantypeid")
	private WebElement pmProductLoanType;

	@FindBy(id = "min_suminsured")
	private WebElement pmMinimumSumInsured;

	@FindBy(id = "max_suminsured")
	private WebElement pmMaximumSumInsured;

	@FindBy(id = "salesPerson_Name")
	private WebElement pmSalesPersonName;

	@FindBy(id = "salesPerson_Email")
	private WebElement pmSalesPersonEmail;

	@FindBy(id = "isreceipt_product")
	private WebElement pmEnableReciept;

	@FindBy(id = "ismail_product")
	private WebElement pmEnableEmail;

	@FindBy(id = "ismemberform_product")
	private WebElement pmProductMemberform;

	@FindBy(id = "issuperadmin_product")
	private WebElement pmSuperadminBulkupload;

	@FindBy(id = "isdgh_product")
	private WebElement pmDGHquestion;

	@FindBy(id = "ismedicalgrid")
	private WebElement pmMedicalgrid;

	@FindBy(id = "ispremium_decimal")
	private WebElement pmPremiumdecimalvalue;

	@FindBy(id = "isfeature_product")
	private WebElement pmAddonfeature;

	@FindBy(id = "isService_product")
	private WebElement pmServicebasedproduct;

	@FindBy(id = "isLoanLinked_product")
	private WebElement pmProductLoanLinked;

	@FindBy(id = "isCOI_create")
	private WebElement pmCOI;

	@FindBy(id = "IsRedirect")
	private WebElement pmRedirectInsuranceportal;

	@FindBy(id = "product_image")
	private WebElement pmProductImage;

	@FindBy(id = "master_policy_doc")
	private WebElement pmMasterDocumentUpload;

	@FindBy(id = "coi_terms_conditions_doc")
	private WebElement pmCOITermsDoc;

	@FindBy(id = "quotation_doc")
	private WebElement pmQuatation;

	@FindBy(id = "urlpath")
	private WebElement pmRedirectURLpath;

	// ----------------------ExpiredProducts---------------------------

	@FindBy(xpath = "//div[@id='tab-1']//i[@class='fa fa-chevron-up']")
	private WebElement pmExpiredfilterarrowbutton;

	public WebElement getpmExpiredfilterarrowbutton() {
		return pmExpiredfilterarrowbutton;
	}

	@FindBy(xpath = "//select[@id='exorgid']")
	private WebElement pmExpiredorgfilter;

	public WebElement getpmExpiredorgfilter() {
		return pmExpiredorgfilter;
	}

	@FindBy(xpath = "//select[@id='exinscompanyid']")
	private WebElement pmExpiredinsfilter;

	public WebElement getpmExpiredinsfilter() {
		return pmExpiredinsfilter;
	}

	@FindBy(xpath = "//select[@id='exsegmentid']")
	private WebElement pmExpiredsegmentfilter;

	public WebElement getpmExpiredsegmentfilter() {
		return pmExpiredsegmentfilter;
	}

	@FindBy(xpath = "//select[@id='exbusinesstypeid']")
	private WebElement pmExpiredbusinesstypefilter;

	public WebElement getpmExpiredbusinesstypefilter() {
		return pmExpiredbusinesstypefilter;
	}

	@FindBy(xpath = "//a[@id='btn_filter2']")
	private WebElement pmExpiredFilterApplybttn;

	public WebElement getpmExpiredApplybttn() {
		return pmExpiredFilterApplybttn;
	}

	@FindBy(xpath = "//a[@id='btn_filter2_clear']")
	private WebElement pmExpiredFilterResetbtn;

	public WebElement getpmExpiredFilterResetbtn() {
		return pmExpiredFilterResetbtn;
	}

	// ==========Templates=========//

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/ul/li[3]/a")
	private WebElement pmProductTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[1]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductCOIHeader;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductCOITextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[2]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductCOITemplate;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductCOITemplateTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[3]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductFooter;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[3]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductFooterTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[4]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductCOIEmail;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[4]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductCOIEmailTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[5]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductCOISMSTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[5]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductCOISMSTextBox;

	@FindBy(css = "body > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > i:nth-child(1)")
	private WebElement pmProductCOIReciptTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[6]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductCOIReciptTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[7]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductReciptPDFTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[7]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductReciptPDFTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[8]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductMemberFormTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[8]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductMemberFormTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[9]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductLTRFFormTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[9]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductLTRFFormTextBox;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[10]/div/div[2]/div[1]/div/a/i")
	private WebElement pmProductHealthCardTemplates;

	@FindBy(xpath = "//*[@id=\"tab-2\"]/div/div/div[10]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductHealthCardTextBox;

	// =============================================//

	@FindBy(xpath = "//*[@id=\"product_save\"]")
	private WebElement pmProductSaveButton;

	@FindBy(xpath = "//*[@id=\"pageactions\"]/div/a[1]")
	private WebElement pmProductBackButton;

	// ===========FAQ=========//

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/ul/li[4]/a")
	private WebElement pmProductFAQ;

	@FindBy(xpath = "//*[@id=\"tab-3\"]/div/div/div[1]/div/div/div/div/div/label/div/ins")
	private WebElement pmProductShowFAQ;

	@FindBy(xpath = "//*[@id=\"tab-3\"]/div/div/div[2]/div/div/div[1]/div/a/i")
	private WebElement pmProductShowFAQTemplates;

	@FindBy(xpath = "//*[@id=\"tab-3\"]/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")
	private WebElement pmProductShowFAQTextBox;

	@FindBy(xpath = "//*[@id=\"tab-3\"]/div/div/div[3]/div/div/div/div/div/label/div/ins")
	private WebElement pmProductShowKeyBenifits;

	@FindBy(css = "div[class='ibox float-e-margins'] div[role='textbox']")
	private WebElement pmProductShowKeyBenifitTextbox;

	@FindBy(xpath = "//*[@id=\"tab-3\"]/div/div/div[4]/div/div/div[1]/div/a/i")
	private WebElement pmProductShowKeyTemplates;

//=================Product Coverage=========================//	

	@FindBy(xpath = "//*[@id=\"btnaddfeaturerow\"]")
	private WebElement pmProductCoverageAddNew;

	@FindBy(xpath = "//*[@id=\"features-list\"]/tbody/tr/td[2]/textarea")
	private WebElement pmProductCoverageTitle;

	@FindBy(xpath = "//*[@id=\"features-list\"]/tbody/tr/td[3]/textarea")
	private WebElement pmProductCoverageValue;

	@FindBy(xpath = "//*[@id=\"features-list\"]/tbody/tr[2]/td[4]/button")
	private WebElement pmProductCoverageDelete;

//========================Alert Setting======================================//

	@FindBy(xpath = "//*[@id=\"btnaddrow\"]")
	private WebElement pmProductAlertSettingAddNew;

	@FindBy(xpath = "//*[@id=\"alertsetting_name\"]")
	private WebElement pmProductAlertSettingName;

	@FindBy(xpath = "//*[@id=\"alertsetting_designation\"]")
	private WebElement pmProductAlertSettingDesignation;

	@FindBy(xpath = "//*[@id=\"alertsetting_email\"]")
	private WebElement pmProductAlertSettingEmail;

	@FindBy(xpath = "//*[@id=\"alertsetting_mobileno\"]")
	private WebElement pmProductAlertSettingMobileNum;

	@FindBy(xpath = "//tbody/tr/td[@class='alerttype i-checks']/div[1]/ins[1]")
	private WebElement pmProductAlertSettingRenewal;

	@FindBy(xpath = "//tbody/tr/td[@class='alerttype i-checks']/div[2]/ins[1]")
	private WebElement pmProductAlertSettingClaim;

	@FindBy(xpath = "//*[@id=\"alertsettings-list\"]/tbody/tr[2]/td[7]/button")
	private WebElement pmProductAlertSettingRemove;

	// ======================suminsured=================//

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/ul/li[6]/a")
	private WebElement pmSuminsured;

	@FindBy(xpath = "//*[@id=\"suminsured-list\"]/tbody/tr/td[8]/button")
	private WebElement pmAddSumAssured;

	@FindBy(xpath = "//*[@id=\"suminsured-list\"]/tbody/tr/td[5]/select")
	private WebElement pmSumInsuredSegment;

	@FindBy(xpath = "//textarea[@class='form-control numericallow suminsured_value']")
	private WebElement pmSuminsuredText;

	@FindBy(xpath = "//*[@id=\"suminsured-list\"]/tbody/tr/td[6]/input")
	private WebElement pmSumInsuredSegmentText;

	@FindBy(xpath = "//*[@id=\"suminsured-list\"]/tbody/tr/td[7]/button")
	private WebElement pmSumInsuredSegmentRemove;

	@FindBy(xpath = "//*[@id=\"suminsured-list\"]/tbody/tr/td[7]/button")
	private WebElement pmRemovesuminsured;

	@FindBy(xpath = "//*[@id=\"tab-5\"]/div/div/div[1]/div/button")
	private WebElement pmAddnewsuminsured;

	// --------------------------------product claim
	// document-------------------------------------------------------------

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement pmClaimform;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmPartB;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmDischargesummary;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement pmCasepaper;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmDrugchart;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmTemperaturechart;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement pmFinalbill;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement pmpaymentreciepts;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmCovid;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmReferralLetter;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[11]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmReferralLetterTreating;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[12]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmPhotoIdProposer;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[13]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmPhotoDependant;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[14]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmCancelledcheque;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[15]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmClaimIntimationForm;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[16]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmDeathCertificate;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[17]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmMemberForm;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[18]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmAgeProof;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[5]/div[1]/div[1]/label[1]/div[1]/ins[1]")
	private WebElement pmNomineeKYC;

	// ---------------------------Browse----------------------------------

	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseClaimform;

	@FindBy(xpath = "//tbody/tr[2]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowsePartB;

	@FindBy(xpath = "//tbody/tr[3]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseDischarge;

	@FindBy(xpath = "//tbody/tr[4]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseIndoorcase;

	@FindBy(xpath = "//tbody/tr[5]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseDrugAdminstration;

	@FindBy(xpath = "//tbody/tr[6]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseTemperaturechart;

	@FindBy(xpath = "//tbody/tr[7]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseFinalBill;

	@FindBy(xpath = "//tbody/tr[8]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowsePaymentreciept;

	@FindBy(xpath = "//tbody/tr[9]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseCovid19;

	@FindBy(xpath = "//tbody/tr[10]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseReferralLetter;

	@FindBy(xpath = "//tbody/tr[11]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseReferralTreatdoctor;

	@FindBy(xpath = "//tbody/tr[12]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowsePhotoIdcardProposer;

	@FindBy(xpath = "//tbody/tr[13]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowsePhotoIdcard;

	@FindBy(xpath = "//tbody/tr[14]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseCancelledcheq;

	@FindBy(xpath = "//tbody/tr[15]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseClaimintimationform;

	@FindBy(xpath = "//tbody/tr[16]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseDeathCertificate;

	@FindBy(xpath = "//tbody/tr[17]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseMemberform;

	@FindBy(xpath = "//tbody/tr[18]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseAgeProof;

	@FindBy(xpath = "//tbody/tr[19]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
	private WebElement pmBrowseNomineeKyc;

	@FindBy(xpath = "//label[normalize-space()='Offline']")
	private WebElement pmPaymentOfflineType;

	@FindBy(xpath = "//label[normalize-space()='Online']")
	private WebElement pmPaymentOnlineType;

	@FindBy(css = "div[id='isindividualpremiumcalcultion_check'] ins[class='iCheck-helper']")
	private WebElement pmShowProductOrg;

	public WebElement getPmShowProductOrg() {
		return pmShowProductOrg;
	}

	public WebElement getPmPaymentOfflineType() {
		return pmPaymentOfflineType;
	}

	public WebElement getPmPaymentOnlineType() {
		return pmPaymentOnlineType;
	}

	public ProductManagement() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPmProductName() {
		return pmProductName;
	}

	public WebElement getPmInsuranceProductName() {
		return pmInsuranceProductName;
	}

	public WebElement getPmBusinessType() {
		return pmBusinessType;
	}

	public WebElement getPmBusinessLineType() {
		return pmBusinessLineType;
	}

	public WebElement getPmProductSegment() {
		return pmProductSegment;
	}

	public WebElement getPmProductSubSegment() {
		return pmProductSubSegment;
	}

	public WebElement getPmOrganizationName() {
		return pmOrganizationName;
	}

	public WebElement getPmInsuranceCompanyName() {
		return pmInsuranceCompanyName;
	}

	public WebElement getPmMasterPolicynumber() {
		return pmMasterPolicynumber;
	}

	public WebElement getPmProductUIN() {
		return pmProductUIN;
	}

	public WebElement getPmProductSaleType() {
		return pmProductSaleType;
	}

	public WebElement getPmWalletType() {
		return pmWalletType;
	}

	public WebElement getPmMasterPolicyDatetime() {
		return pmMasterPolicyDatetime;
	}

	public WebElement getPmMasterPolicyEndDatetime() {
		return pmMasterPolicyEndDatetime;
	}

	public WebElement getPmProductLoanType() {
		return pmProductLoanType;
	}

	public WebElement getPmMinimumSumInsured() {
		return pmMinimumSumInsured;
	}

	public WebElement getPmMaximumSumInsured() {
		return pmMaximumSumInsured;
	}

	public WebElement getPmSalesPersonName() {
		return pmSalesPersonName;
	}

	public WebElement getPmSalesPersonEmail() {
		return pmSalesPersonEmail;
	}

	public WebElement getPmEnableReciept() {
		return pmEnableReciept;
	}

	public WebElement getPmEnableEmail() {
		return pmEnableEmail;
	}

	public WebElement getpmProductMemberform() {
		return pmProductMemberform;
	}

	public WebElement getPmSuperadminBulkupload() {
		return pmSuperadminBulkupload;
	}

	public WebElement getPmDGHquestion() {
		return pmDGHquestion;
	}

	public WebElement getPmMedicalgrid() {
		return pmMedicalgrid;
	}

	public WebElement getPmPremiumdecimalvalue() {
		return pmPremiumdecimalvalue;
	}

	public WebElement getPmAddonfeature() {
		return pmAddonfeature;
	}

	public WebElement getPmServicebasedproduct() {
		return pmServicebasedproduct;
	}

	public WebElement getPmProductLoanLinked() {
		return pmProductLoanLinked;
	}

	public WebElement getPmCOI() {
		return pmCOI;
	}

	public WebElement getPmRedirectInsuranceportal() {
		return pmRedirectInsuranceportal;
	}

	public WebElement getPmProductImage() {
		return pmProductImage;
	}

	public WebElement getPmMasterDocumentUpload() {
		return pmMasterDocumentUpload;
	}

	public WebElement getPmCOITermsDoc() {
		return pmCOITermsDoc;
	}

	public WebElement getPmQuatation() {
		return pmQuatation;
	}

	public WebElement getPmRedirectURLpath() {
		return pmRedirectURLpath;
	}

	public WebElement getpmSuminsured() {
		return pmSuminsured;
	}

	public WebElement getPmSuminsured() {
		return pmSuminsured;
	}

	public WebElement getPmAddSumAssured() {
		return pmAddSumAssured;
	}

	public WebElement getPmSumInsuredSegment() {
		return pmSumInsuredSegment;
	}

	public WebElement getPmSuminsuredText() {
		return pmSuminsuredText;
	}

	public WebElement getPmSumInsuredSegmentText() {
		return pmSumInsuredSegmentText;
	}

	public WebElement getPmSumInsuredSegmentRemove() {
		return pmSumInsuredSegmentRemove;
	}

	public WebElement getpmSuminsuredText() {
		return pmSuminsuredText;
	}

	public WebElement getPmRemovesuminsured() {
		return pmRemovesuminsured;
	}

	public WebElement getPmAddnewsuminsured() {
		return pmAddnewsuminsured;
	}

	public WebElement getPmClaimform() {
		return pmClaimform;
	}

	public WebElement getPmPartB() {
		return pmPartB;
	}

	public WebElement getPmDischargesummary() {
		return pmDischargesummary;
	}

	public WebElement getPmCasepaper() {
		return pmCasepaper;
	}

	public WebElement getPmDrugchart() {
		return pmDrugchart;
	}

	public WebElement getPmTemperaturechart() {
		return pmTemperaturechart;
	}

	public WebElement getPmFinalbill() {
		return pmFinalbill;
	}

	public WebElement getPmpaymentreciepts() {
		return pmpaymentreciepts;
	}

	public WebElement getPmCovid() {
		return pmCovid;
	}

	public WebElement getPmReferralLetter() {
		return pmReferralLetter;
	}

	public WebElement getPmReferralLetterTreating() {
		return pmReferralLetterTreating;
	}

	public WebElement getPmPhotoIdProposer() {
		return pmPhotoIdProposer;
	}

	public WebElement getPmPhotoDependant() {
		return pmPhotoDependant;
	}

	public WebElement getPmCancelledcheque() {
		return pmCancelledcheque;
	}

	public WebElement getPmProducts() {
		return pmProducts;
	}

	public WebElement getPmPublishedProduct() {
		return pmPublishedProduct;
	}

	public WebElement getPmExpiredProducts() {
		return pmExpiredProducts;
	}

	public WebElement getPmProductHomeButton() {
		return pmProductHomeButton;
	}

	public WebElement getPmNewProduct() {
		return pmNewProduct;
	}

	public WebElement getPmProductExpandButton() {
		return pmProductExpandButton;
	}

	public WebElement getPmLogoutButton() {
		return pmLogoutButton;
	}

	public WebElement getPmHelpButton() {
		return pmHelpButton;
	}

	public WebElement getPmMinimalizeButton() {
		return pmMinimalizeButton;
	}

	public WebElement getPmProductNextButton() {
		return pmProductNextButton;
	}

	public WebElement getPmProductPreviousButton() {
		return pmProductPreviousButton;
	}

	public WebElement getPmProductFilterButton() {
		return pmProductFilterButton;
	}

	public WebElement getPmProductApplyFilter() {
		return pmProductApplyFilter;
	}

	public WebElement getPmProductResetFilterButton() {
		return pmProductResetFilterButton;
	}

	public WebElement getPmProductDetails() {
		return pmProductDetails;
	}

	public WebElement getPmProductTemplates() {
		return pmProductTemplates;
	}

	public WebElement getPmProductFAQ() {
		return pmProductFAQ;
	}

	public WebElement getPmProductCoverage() {
		return pmProductCoverage;
	}

	public WebElement getPmProductSumInsured() {
		return pmProductSumInsured;
	}

	public WebElement getPmProductClaimDocuments() {
		return pmProductClaimDocuments;
	}

	public WebElement getPmProductAlert() {
		return pmProductAlert;
	}

	public WebElement getPmProductCOIHeader() {
		return pmProductCOIHeader;
	}

	public WebElement getPmProductCOITextBox() {
		return pmProductCOITextBox;
	}

	public WebElement getPmProductCOITemplate() {
		return pmProductCOITemplate;
	}

	public WebElement getPmProductCOITemplateTextBox() {
		return pmProductCOITemplateTextBox;
	}

	public WebElement getPmProductFooter() {
		return pmProductFooter;
	}

	public WebElement getPmProductFooterTextBox() {
		return pmProductFooterTextBox;
	}

	public WebElement getPmProductCOIEmail() {
		return pmProductCOIEmail;
	}

	public WebElement getPmProductCOIEmailTextBox() {
		return pmProductCOIEmailTextBox;
	}

	public WebElement getPmProductCOISMSTemplates() {
		return pmProductCOISMSTemplates;
	}

	public WebElement getPmProductCOISMSTextBox() {
		return pmProductCOISMSTextBox;
	}

	public WebElement getPmProductCOIReciptTemplates() {
		return pmProductCOIReciptTemplates;
	}

	public WebElement getPmProductCOIReciptTextBox() {
		return pmProductCOIReciptTextBox;
	}

	public WebElement getPmProductReciptPDFTemplates() {
		return pmProductReciptPDFTemplates;
	}

	public WebElement getPmProductReciptPDFTextBox() {
		return pmProductReciptPDFTextBox;
	}

	public WebElement getPmProductMemberFormTemplates() {
		return pmProductMemberFormTemplates;
	}

	public WebElement getPmProductMemberFormTextBox() {
		return pmProductMemberFormTextBox;
	}

	public WebElement getPmProductLTRFFormTemplates() {
		return pmProductLTRFFormTemplates;
	}

	public WebElement getPmProductLTRFFormTextBox() {
		return pmProductLTRFFormTextBox;
	}

	public WebElement getPmProductHealthCardTemplates() {
		return pmProductHealthCardTemplates;
	}

	public WebElement getPmProductHealthCardTextBox() {
		return pmProductHealthCardTextBox;
	}

	public WebElement getPmProductSaveButton() {
		return pmProductSaveButton;
	}

	public WebElement getPmProductBackButton() {
		return pmProductBackButton;
	}

	public WebElement getPmProductShowFAQ() {
		return pmProductShowFAQ;
	}

	public WebElement getPmProductShowFAQTemplates() {
		return pmProductShowFAQTemplates;
	}

	public WebElement getPmProductShowFAQTextBox() {
		return pmProductShowFAQTextBox;
	}

	public WebElement getPmProductShowKeyBenifits() {
		return pmProductShowKeyBenifits;
	}

	public WebElement getPmProductShowKeyTemplates() {
		return pmProductShowKeyTemplates;
	}

	public WebElement getPmProductShowKeyBenifitTextbox() {
		return pmProductShowKeyBenifitTextbox;
	}

	public WebElement getPmProductCoverageAddNew() {
		return pmProductCoverageAddNew;
	}

	public WebElement getPmProductCoverageTitle() {
		return pmProductCoverageTitle;
	}

	public WebElement getPmProductCoverageValue() {
		return pmProductCoverageValue;
	}

	public WebElement getPmProductCoverageDelete() {
		return pmProductCoverageDelete;
	}

	public WebElement getPmProductAlertSettingAddNew() {
		return pmProductAlertSettingAddNew;
	}

	public WebElement getPmProductAlertSettingName() {
		return pmProductAlertSettingName;
	}

	public WebElement getPmProductAlertSettingDesignation() {
		return pmProductAlertSettingDesignation;
	}

	public WebElement getPmProductAlertSettingEmail() {
		return pmProductAlertSettingEmail;
	}

	public WebElement getPmProductAlertSettingMobileNum() {
		return pmProductAlertSettingMobileNum;
	}

	public WebElement getPmProductAlertSettingRenewal() {
		return pmProductAlertSettingRenewal;
	}

	public WebElement getPmProductAlertSettingClaim() {
		return pmProductAlertSettingClaim;
	}

	public WebElement getPmProductAlertSettingRemove() {
		return pmProductAlertSettingRemove;
	}

	public WebElement getPmClaimIntimationForm() {
		return pmClaimIntimationForm;
	}

	public WebElement getPmDeathCertificate() {
		return pmDeathCertificate;
	}

	public WebElement getPmMemberForm() {
		return pmMemberForm;
	}

	public WebElement getPmAgeProof() {
		return pmAgeProof;
	}

	public WebElement getPmNomineeKYC() {
		return pmNomineeKYC;
	}

	public WebElement getPmBrowseClaimform() {
		return pmBrowseClaimform;
	}

	public WebElement getPmBrowsePartB() {
		return pmBrowsePartB;
	}

	public WebElement getPmBrowseDischarge() {
		return pmBrowseDischarge;
	}

	public WebElement getPmBrowseIndoorcase() {
		return pmBrowseIndoorcase;
	}

	public WebElement getPmBrowseDrugAdminstration() {
		return pmBrowseDrugAdminstration;
	}

	public WebElement getPmBrowseTemperaturechart() {
		return pmBrowseTemperaturechart;
	}

	public WebElement getPmBrowseFinalBill() {
		return pmBrowseFinalBill;
	}

	public WebElement getPmBrowsePaymentreciept() {
		return pmBrowsePaymentreciept;
	}

	public WebElement getPmBrowseCovid19() {
		return pmBrowseCovid19;
	}

	public WebElement getPmBrowseReferralLetter() {
		return pmBrowseReferralLetter;
	}

	public WebElement getPmBrowseReferralTreatdoctor() {
		return pmBrowseReferralTreatdoctor;
	}

	public WebElement getPmBrowsePhotoIdcardProposer() {
		return pmBrowsePhotoIdcardProposer;
	}

	public WebElement getPmBrowsePhotoIdcard() {
		return pmBrowsePhotoIdcard;
	}

	public WebElement getPmBrowseCancelledcheq() {
		return pmBrowseCancelledcheq;
	}

	public WebElement getPmBrowseClaimintimationform() {
		return pmBrowseClaimintimationform;
	}

	public WebElement getPmBrowseDeathCertificate() {
		return pmBrowseDeathCertificate;
	}

	public WebElement getPmBrowseMemberform() {
		return pmBrowseMemberform;
	}

	public WebElement getPmBrowseAgeProof() {
		return pmBrowseAgeProof;
	}

	public WebElement getPmBrowseNomineeKyc() {
		return pmBrowseNomineeKyc;
	}

	@FindBy(xpath = "//input[@id='salesPerson_MobileNo']")
	private WebElement pmSalesPersonNum;

	@FindBy(xpath = "//div[@class='ibox float-e-margins']//div[@role='textbox']")
	private WebElement pmProductCOIHeaderText;

	public WebElement getPmProductCOIHeaderText() {
		return pmProductCOIHeaderText;
	}

	public WebElement getPmSalesPersonNum() {
		return pmSalesPersonNum;
	}

	// ============Product Plan methods============//

	@FindBy(xpath = "//span[normalize-space()='Product Management']")
	private WebElement ProductManagement;

	@FindBy(xpath = "//a[normalize-space()='Pending For Approval']")
	private WebElement PendingApproval;

	// ======================================//Filters//====================================

	@FindBy(xpath = "//a[@class='collapse-link']")
	private WebElement FiltersArrowbtn;

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement OrganizationFilter;

	@FindBy(xpath = "//select[@id='inscompanyid']")
	private WebElement InsurancecompanyFilter;

	public WebElement getInsurancecompanyFilter() {
		return InsurancecompanyFilter;
	}

	public WebElement getSegmentFilter() {
		return SegmentFilter;
	}

	public WebElement getBusinessTypeFilter() {
		return BusinessTypeFilter;
	}

	public WebElement getTextsearchbox() {
		return Textsearchbox;
	}

	public WebElement getFilterResetbtn() {
		return FilterResetbtn;
	}

	@FindBy(xpath = "//select[@id='segmentid']")
	private WebElement SegmentFilter;

	@FindBy(xpath = "//select[@id='businesstypeid']")
	private WebElement BusinessTypeFilter;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement Textsearchbox;

	@FindBy(id = "btn_filter")
	private WebElement FilterApplybtn;

	@FindBy(xpath = "//a[@id='btn_filter_clear']")
	private WebElement FilterResetbtn;

	// plans

	@FindBy(xpath = "//td[text()='MPN300']//following-sibling::td[5]//a[2]")
	private WebElement Plansbtn;

	@FindBy(xpath = "//div[@class='ibox-title']//a[1]")
	private WebElement NewProductplan;

	@FindBy(id = "productplan_name")
	private WebElement PPProductplanName;

	@FindBy(id = "productplan_premiumtho")
	private WebElement PPTenuredays;

	@FindBy(id = "productplan_Adults")
	private WebElement PPMaxnoAdults;

	@FindBy(id = "productplan_Childs")
	private WebElement PPMaxnoChilds;

	@FindBy(id = "productplan_Childsage")
	private WebElement PPMaxageChilds;

	@FindBy(id = "productplan_maxage")
	private WebElement PPMaxageInsured;

	@FindBy(id = "productplan_des")
	private WebElement PPInsuranceplanName;

	@FindBy(id = "lifecovertypeid")
	private WebElement PPLifecoverType;

	@FindBy(id = "covertypeid")
	private WebElement PPCoverType;

	@FindBy(id = "//div[@class='iradio_square-green hover']//ins[@class='iCheck-helper']")
	private WebElement PPGenderMale;

	@FindBy(id = "//div[@class='iradio_square-green hover']//ins[@class='iCheck-helper']")
	private WebElement PPGenederFemale;

	@FindBy(id = "//div[@class='iradio_square-green hover']//ins[@class='iCheck-helper']")
	private WebElement PPGenderBoth;

	@FindBy(xpath = "//label[normalize-space()='Do you want Duplicate Loan Account Number?']")
	private WebElement PPDuplicateLAN;

	@FindBy(xpath = "//label[normalize-space()='Do you want Authorization Letter?']")
	private WebElement PPAuthLetter;

	@FindBy(xpath = "//label[normalize-space()='Do you want Send OTP to nominee?']")
	private WebElement PPNomineeOTP;

	@FindBy(xpath = "//div[@id='iszeroPremium_check']//div[@class='i-checks']//div[1]")
	private WebElement PPZeroPremium;

	@FindBy(xpath = "//label[normalize-space()='Is GST Applicable']")
	private WebElement PPGST;

	@FindBy(id = "gst_per")
	private WebElement PPGSTText;

	// Template

	@FindBy(xpath = "//a[normalize-space()='Templates']")
	private WebElement PPtemplates;

	@FindBy(xpath = "//*[@id=\"tab-1\"]/div/div/div[1]/div/div/div[1]/div/a/i")
	private WebElement PPSalespitchExpand;

	@FindBy(xpath = "//div[@class='ibox float-e-margins']//div[@role='textbox']")
	private WebElement PPSalespitchtextbox;

	@FindBy(xpath = "//*[@id=\"tab-1\"]/div/div/div[2]/div/div/div[1]/div/a/i")
	private WebElement PPNotcoveredExpand;

	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='page-wrapper']/div/div[@class='wrapper wrapper-content']/div[@class='row']/div[@class='col-lg-12']/div[@id='ibox1']/div[@class='ibox-content']/div[@class='tabs-container']/div[@class='tab-content']/div[@id='tab-1']/div[@class='panel-body']/div[@class='form-horizontal box_background']/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[2]")
	private WebElement PPNotcoveredtextbox;

	@FindBy(xpath = "//div[@class='tabs-container']//div[3]//div[1]//div[1]//div[1]//div[1]//a[1]//i[1]")
	private WebElement PPPolicycoverageExpand;

	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='page-wrapper']/div/div[@class='wrapper wrapper-content']/div[@class='row']/div[@class='col-lg-12']/div[@id='ibox1']/div[@class='ibox-content']/div[@class='tabs-container']/div[@class='tab-content']/div[@id='tab-1']/div[@class='panel-body']/div[@class='form-horizontal box_background']/div[3]/div[1]/div[1]/div[2]/div[3]/div[3]/div[2]")
	private WebElement PPPolicycoveragetextbox;

	@FindBy(xpath = "//body//div[@id='wrapper']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//i[1]")
	private WebElement PPAuthorizationLetterExpand;

	@FindBy(xpath = "//*[@id=\"tab-1\"]/div/div/div[4]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement PPAuthorizationLettertextbox;

	// PlanCoverage

	@FindBy(xpath = "//a[normalize-space()='Plan Coverage']")
	private WebElement PPPlanCoverage;

	// Premium chart

	@FindBy(xpath = "//a[normalize-space()='Premium Chart']")
	private WebElement PPPremumchart;

	@FindBy(id = "//select[@id='noOfrows']")
	private WebElement PPSelectrows;

	@FindBy(xpath = "//button[@class='btn btn-light btn-sm']")
	private WebElement PPAddRows;

	@FindBy(xpath = "//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
	private WebElement PPTransactionFee;

	@FindBy(xpath = "//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
	private WebElement PPTransactionFeebypercentage;

	@FindBy(xpath = "//input[@class='form-control numericallow permium_value min_age']")
	private WebElement PPMinage;

	@FindBy(xpath = "//input[@class='form-control numericallow permium_value max_age']")
	private WebElement PPmaxage;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	private WebElement PPPrem1;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/input[1]")
	private WebElement PPPrem2;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/input[1]")
	private WebElement PPPrem3;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/input[1]")
	private WebElement PPPrem4;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/input[1]")
	private WebElement PPPrem5;

	// ----MemberRelation----

	@FindBy(xpath = "//a[normalize-space()='Plan RelationShips']")
	private WebElement PPRelations;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[1]/label/div/ins")
	private WebElement PPMFather;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[2]/label/div/ins")
	private WebElement PPMMother;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[3]/label/div/ins")
	private WebElement PPMSpouse;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[4]/label/div/ins")
	private WebElement PPMSon;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[5]/label/div/ins")
	private WebElement PPMDaughter;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[6]/label/div/ins")
	private WebElement PPMMotherinLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[7]/label/div/ins")
	private WebElement PPMFatherinLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[8]/label/div/ins")
	private WebElement PPMSelf;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[9]/label/div/ins")
	private WebElement PPMBrother;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[10]/label/div/ins")
	private WebElement PPMSister;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[11]/label/div/ins")
	private WebElement PPMSoninLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[12]/label/div/ins")
	private WebElement PPMDaughterinLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[13]/label/div/ins")
	private WebElement PPMUncle;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[14]/label/div/ins")
	private WebElement PPMAunt;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[15]/label/div/ins")
	private WebElement PPMNiece;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[16]/label/div/ins")
	private WebElement PPMNephew;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[17]/label/div/ins")
	private WebElement PPMGrandParents;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[18]/label/div/ins")
	private WebElement PPMGrandChildren;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[19]/label/div/ins")
	private WebElement PPMHUF;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[20]/label/div/ins")
	private WebElement PPMNominee;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[21]/label/div/ins")
	private WebElement PPMOthers;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[22]/label/div/ins")
	private WebElement PPMWIFE;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[23]/label/div/ins")
	private WebElement PPMHusband;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[1]/div/div/div[2]/div[24]/label/div/ins")
	private WebElement PPMNotupdated;

	// -------------NomineeRelation

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[1]/label/div/ins")
	private WebElement PPNFather;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[2]/label/div/ins")
	private WebElement PPNMother;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[3]/label/div/ins")
	private WebElement PPNSpouse;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[4]/label/div/ins")
	private WebElement PPNSon;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[5]/label/div/ins")
	private WebElement PPNDaughter;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[6]/label/div/ins")
	private WebElement PPNMotherinLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[7]/label/div/ins")
	private WebElement PPNFatherinLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[8]/label/div/ins")
	private WebElement PPNSelf;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[9]/label/div/ins")
	private WebElement PPNBrother;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[10]/label/div/ins")
	private WebElement PPNSister;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[11]/label/div/ins")
	private WebElement PPNSoninLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[12]/label/div/ins")
	private WebElement PPNDaughterinLaw;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[13]/label/div/ins")
	private WebElement PPNUncle;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[14]/label/div/ins")
	private WebElement PPNAunt;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[15]/label/div/ins")
	private WebElement PPNNiece;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[16]/label/div/ins")
	private WebElement PPNNephew;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[17]/label/div/ins")
	private WebElement PPNGrandparents;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[18]/label/div/ins")
	private WebElement PPNGrandChildren;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[19]/label/div/ins")
	private WebElement PPNHuf;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[20]/label/div/ins")
	private WebElement PPNNominee;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[21]/label/div/ins")
	private WebElement PPNOthers;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[22]/label/div/ins")
	private WebElement PPNWife;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[23]/label/div/ins")
	private WebElement PPNHusband;

	@FindBy(xpath = "//*[@id=\"tab-4\"]/div/div[2]/div/div/div[2]/div[24]/label/div/ins")
	private WebElement PPNNotupdated;

	@FindBy(xpath = "//button[@id='productplan_save']")
	private WebElement PPSave;

	public WebElement getPendingApproval() {
		return PendingApproval;
	}

	public WebElement getPlansbtn() {
		return Plansbtn;
	}

	public WebElement getNewProductplan() {
		return NewProductplan;
	}

	public WebElement getPPProductplanName() {
		return PPProductplanName;
	}

	public WebElement getPPTenuredays() {
		return PPTenuredays;
	}

	public WebElement getPPMaxnoAdults() {
		return PPMaxnoAdults;
	}

	public WebElement getPPMaxnoChilds() {
		return PPMaxnoChilds;
	}

	public WebElement getPPMaxageChilds() {
		return PPMaxageChilds;
	}

	public WebElement getPPMaxageInsured() {
		return PPMaxageInsured;
	}

	public WebElement getPPInsuranceplanName() {
		return PPInsuranceplanName;
	}

	public WebElement getPPLifecoverType() {
		return PPLifecoverType;
	}

	public WebElement getPPCoverType() {
		return PPCoverType;
	}

	public WebElement getPPGenderMale() {
		return PPGenderMale;
	}

	public WebElement getPPGenederFemale() {
		return PPGenederFemale;
	}

	public WebElement getPPGenderBoth() {
		return PPGenderBoth;
	}

	public WebElement getPPDuplicateLAN() {
		return PPDuplicateLAN;
	}

	public WebElement getPPAuthLetter() {
		return PPAuthLetter;
	}

	public WebElement getPPNomineeOTP() {
		return PPNomineeOTP;
	}

	public WebElement getPPZeroPremium() {
		return PPZeroPremium;
	}

	public WebElement getPPGST() {
		return PPGST;
	}

	public WebElement getPPGSTText() {
		return PPGSTText;

	}

	public WebElement getPPtemplates() {
		return PPtemplates;
	}

	public WebElement getPPSalespitchExpand() {
		return PPSalespitchExpand;
	}

	public WebElement getPPSalespitchtextbox() {
		return PPSalespitchtextbox;
	}

	public WebElement getPPNotcoveredExpand() {
		return PPNotcoveredExpand;
	}

	public WebElement getPPNotcoveredtextbox() {
		return PPNotcoveredtextbox;
	}

	public WebElement getPPPolicycoverageExpand() {
		return PPPolicycoverageExpand;
	}

	public WebElement getPPPolicycoveragetextbox() {
		return PPPolicycoveragetextbox;
	}

	public WebElement getPPAuthorizationLetterExpand() {
		return PPAuthorizationLetterExpand;
	}

	public WebElement getPPAuthorizationLettertextbox() {
		return PPAuthorizationLettertextbox;
	}

	public WebElement getPPPlanCoverage() {
		return PPPlanCoverage;
	}

	public WebElement getPPPremumchart() {
		return PPPremumchart;
	}

	public WebElement getPPSelectrows() {
		return PPSelectrows;
	}

	public WebElement getPPAddRows() {
		return PPAddRows;
	}

	public WebElement getPPTransactionFee() {
		return PPTransactionFee;
	}

	public WebElement getPPTransactionFeebypercentage() {
		return PPTransactionFeebypercentage;
	}

	public WebElement getPPMinage() {
		return PPMinage;
	}

	public WebElement getPPmaxage() {
		return PPmaxage;
	}

	public WebElement getPPPrem1() {
		return PPPrem1;
	}

	public WebElement getPPPrem2() {
		return PPPrem2;
	}

	public WebElement getPPPrem3() {
		return PPPrem3;
	}

	public WebElement getPPPrem4() {
		return PPPrem4;
	}

	public WebElement getPPPrem5() {
		return PPPrem5;
	}

	public WebElement getPPRelations() {
		return PPRelations;
	}

	public WebElement getPPMFather() {
		return PPMFather;
	}

	public WebElement getPPMMother() {
		return PPMMother;
	}

	public WebElement getPPMSpouse() {
		return PPMSpouse;
	}

	public WebElement getPPMSon() {
		return PPMSon;
	}

	public WebElement getPPMDaughter() {
		return PPMDaughter;
	}

	public WebElement getPPMMotherinLaw() {
		return PPMMotherinLaw;
	}

	public WebElement getPPMFatherinLaw() {
		return PPMFatherinLaw;
	}

	public WebElement getPPMSelf() {
		return PPMSelf;
	}

	public WebElement getPPMBrother() {
		return PPMBrother;
	}

	public WebElement getPPMSister() {
		return PPMSister;
	}

	public WebElement getPPMSoninLaw() {
		return PPMSoninLaw;
	}

	public WebElement getPPMDaughterinLaw() {
		return PPMDaughterinLaw;
	}

	public WebElement getPPMUncle() {
		return PPMUncle;
	}

	public WebElement getPPMAunt() {
		return PPMAunt;
	}

	public WebElement getPPMNiece() {
		return PPMNiece;
	}

	public WebElement getPPMNephew() {
		return PPMNephew;
	}

	public WebElement getPPMGrandParents() {
		return PPMGrandParents;
	}

	public WebElement getPPMGrandChildren() {
		return PPMGrandChildren;
	}

	public WebElement getPPMHUF() {
		return PPMHUF;
	}

	public WebElement getPPMNominee() {
		return PPMNominee;
	}

	public WebElement getPPMOthers() {
		return PPMOthers;
	}

	public WebElement getPPMWIFE() {
		return PPMWIFE;
	}

	public WebElement getPPMHusband() {
		return PPMHusband;
	}

	public WebElement getPPMNotupdated() {
		return PPMNotupdated;
	}

	public WebElement getPPNFather() {
		return PPNFather;
	}

	public WebElement getPPNMother() {
		return PPNMother;
	}

	public WebElement getPPNSpouse() {
		return PPNSpouse;
	}

	public WebElement getPPNSon() {
		return PPNSon;
	}

	public WebElement getPPNDaughter() {
		return PPNDaughter;
	}

	public WebElement getPPNMotherinLaw() {
		return PPNMotherinLaw;
	}

	public WebElement getPPNFatherinLaw() {
		return PPNFatherinLaw;
	}

	public WebElement getPPNSelf() {
		return PPNSelf;
	}

	public WebElement getPPNBrother() {
		return PPNBrother;
	}

	public WebElement getPPNSister() {
		return PPNSister;
	}

	public WebElement getPPNSoninLaw() {
		return PPNSoninLaw;
	}

	public WebElement getPPNDaughterinLaw() {
		return PPNDaughterinLaw;
	}

	public WebElement getPPNUncle() {
		return PPNUncle;
	}

	public WebElement getPPNAunt() {
		return PPNAunt;
	}

	public WebElement getPPNNiece() {
		return PPNNiece;
	}

	public WebElement getPPNNephew() {
		return PPNNephew;
	}

	public WebElement getPPNGrandparents() {
		return PPNGrandparents;
	}

	public WebElement getPPNGrandChildren() {
		return PPNGrandChildren;
	}

	public WebElement getPPNHuf() {
		return PPNHuf;
	}

	public WebElement getPPNNominee() {
		return PPNNominee;
	}

	public WebElement getPPNOthers() {
		return PPNOthers;
	}

	public WebElement getPPNWife() {
		return PPNWife;
	}

	public WebElement getPPNHusband() {
		return PPNHusband;
	}

	public WebElement getPPNNotupdated() {
		return PPNNotupdated;
	}

	// Filters

	public WebElement getFiltersArrowbtn() {
		return FiltersArrowbtn;
	}

	public WebElement getOrganizationFilter() {
		return OrganizationFilter;
	}

	public WebElement getOrganizationsearchbox() {
		return Textsearchbox;
	}

	public WebElement getFilterApplybtn() {
		return FilterApplybtn;
	}

	public WebElement getPPsave() {
		return PPSave;
	}

//==============waiting for approval===============//

	@FindBy(xpath = "//a [text()='Waiting For Approval']")
	private WebElement waitingForApproval;

	// ...Approval Product List (page) ...//

	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiInputBase-colorPrimary css-16c50h-MuiInputBase-root-MuiTablePagination-select']")
	private WebElement aplRowsPerPage;

	@FindBy(xpath = "//li[normalize-space()='10']")
	private WebElement aplRowsperpages10Rows;

	@FindBy(xpath = "//li[normalize-space()='50']")
	private WebElement aplRowsPerPage50Rows;

	@FindBy(xpath = "//li[normalize-space()='500']")
	private WebElement aplRowsPerPage500Rows;

	@FindBy(xpath = "//li[normalize-space()='1000']")
	private WebElement aplRowsPerPage1000Rows;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[3]/button[2]")
	private WebElement aplNextList;

	@FindBy(css = "#root > div > div > div > div > div.MuiTablePagination-root.css-jtlhu6-MuiTablePagination-root > div > div.MuiTablePagination-actions > button:nth-child(1) > svg")
	private WebElement aplPreviousList;

	@FindBy(xpath = "//*[@id=\"product_details\"]")
	private WebElement aplviewProductDetails;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement PendingforApprovalEditbackbtn;

	public WebElement getPendingforApprovalEditbackbtn() {
		return PendingforApprovalEditbackbtn;
	}

	public WebElement getAplRowsPerPage() {
		return aplRowsPerPage;
	}

	public WebElement getAplRowsperpages10Rows() {
		return aplRowsperpages10Rows;
	}

	public WebElement getAplRowsPerPage50Rows() {
		return aplRowsPerPage50Rows;
	}

	public WebElement getAplRowsPerPage500Rows() {
		return aplRowsPerPage500Rows;
	}

	public WebElement getAplRowsPerPage1000Rows() {
		return aplRowsPerPage1000Rows;
	}

	public WebElement getAplNextList() {
		return aplNextList;
	}

	public WebElement getAplPreviousList() {
		return aplPreviousList;
	}

	public WebElement getProductManagement() {
		return productManagement;
	}

	public WebElement getWaitingForApproval() {
		return waitingForApproval;
	}

	public WebElement getAplviewProductDetails() {
		return aplviewProductDetails;
	}

	// ...Product Details page and COI numbers..///

	@FindBy(css = "#root > div > div > div > div > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation1.MuiAccordion-root.MuiAccordion-rounded.MuiAccordion-gutters.css-1elwnq4-MuiPaper-root-MuiAccordion-root > div.MuiButtonBase-root.MuiAccordionSummary-root.MuiAccordionSummary-gutters.css-sh22l5-MuiButtonBase-root-MuiAccordionSummary-root > div.MuiAccordionSummary-expandIconWrapper.css-yw020d-MuiAccordionSummary-expandIconWrapper > svg")
	private WebElement productDetailsHideOpenArrowButton;

	@FindBy(xpath = "#root > div > div > div > div > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation1.MuiAccordion-root.MuiAccordion-rounded.Mui-expanded.MuiAccordion-gutters.css-1elwnq4-MuiPaper-root-MuiAccordion-root > div.MuiCollapse-root.MuiCollapse-vertical.MuiCollapse-entered.css-pwcg7p-MuiCollapse-root > div > div > div > div > div.MuiGrid-root.MuiGrid-container.css-1qjcmlb-MuiGrid-root > button")
	private WebElement productDetailsCoiNumbers;

	@FindBy(xpath = "//*[@id=\"modal-modal-title\"]/button/span")
	private WebElement closeCoiNumberPopup;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement coiNumberpopupOk;

	public WebElement getProductDetailsHideOpenArrowButton() {
		return productDetailsHideOpenArrowButton;
	}

	public WebElement getProductDetailsCoiNumbers() {
		return productDetailsCoiNumbers;
	}

	public WebElement getCloseCoiNumberPopup() {
		return closeCoiNumberPopup;
	}

	public WebElement getCoiNumberpopupOk() {
		return coiNumberpopupOk;
	}

	// ...Product Coverages.....//

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[3]/div/div[1]")
	private WebElement ProductCoveragesArrowButton;

	public WebElement getProductCoveragesArrowButton() {
		return ProductCoveragesArrowButton;
	}

	// ...Product Sum Insured/Tenure....//

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]")
	private WebElement productSumInsuredTenureArrowButton;

	public WebElement getProductSumInsuredTenureArrowButton() {
		return productSumInsuredTenureArrowButton;
	}

	// ....Product Claim Documents....//

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")
	private WebElement productClaimDocumentsArrowButton;

	public WebElement getProductClaimDocumentsArrowButton() {
		return productClaimDocumentsArrowButton;
	}

	// ....Product Templates......//

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]")
	private WebElement productTemplatesArrowButton;

	@FindBy(xpath = "//tbody/tr/td[1]/button[1]")
	private WebElement ptCoiHeaderView;

	@FindBy(xpath = "//*[@id=\"transition-modal-title\"]/button/span")
	private WebElement ptClosepopupView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[6]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/button")
	private WebElement ptCoiTemplateHtmlView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[3]/button")
	private WebElement ptCoiFooterView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[4]/button")
	private WebElement ptKeyBenifitsHtmlView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[5]/button")
	private WebElement ptFaqHtmlView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[6]/button")
	private WebElement ptCoiEmailTemplateView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[7]/button")
	private WebElement ptCoiSmsTemplateView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[8]/button")
	private WebElement ptMemberFormHtmlTemplateView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[9]/button")
	private WebElement ptLtrfFormView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[10]/button")
	private WebElement ptReceiptTemplateView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[11]/button")
	private WebElement ptReceiptDocTemplateView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[12]/button")
	private WebElement ptCheckListTemplateView;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[13]/button")
	private WebElement ptHealthCardTemplateView;

	public WebElement getProductTemplatesArrowButton() {
		return productTemplatesArrowButton;
	}

	public WebElement getPtCoiHeaderView() {
		return ptCoiHeaderView;
	}

	public WebElement getPtClosepopupView() {
		return ptClosepopupView;
	}

	public WebElement getPtCoiTemplateHtmlView() {
		return ptCoiTemplateHtmlView;
	}

	public WebElement getPtCoiFooterView() {
		return ptCoiFooterView;
	}

	public WebElement getPtKeyBenifitsHtmlView() {
		return ptKeyBenifitsHtmlView;
	}

	public WebElement getPtFaqHtmlView() {
		return ptFaqHtmlView;
	}

	public WebElement getPtCoiEmailTemplateView() {
		return ptCoiEmailTemplateView;
	}

	public WebElement getPtCoiSmsTemplateView() {
		return ptCoiSmsTemplateView;
	}

	public WebElement getPtMemberFormHtmlTemplateView() {
		return ptMemberFormHtmlTemplateView;
	}

	public WebElement getPtLtrfFormView() {
		return ptLtrfFormView;
	}

	public WebElement getPtReceiptTemplateView() {
		return ptReceiptTemplateView;
	}

	public WebElement getPtReceiptDocTemplateView() {
		return ptReceiptDocTemplateView;
	}

	public WebElement getPtCheckListTemplateView() {
		return ptCheckListTemplateView;
	}

	public WebElement getPtHealthCardTemplateView() {
		return ptHealthCardTemplateView;
	}

	// ...Product Alert Settings....//

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[7]/div/div[1]")
	private WebElement productAlertSettingsArrowButton;

	public WebElement getProductAlertSettingsArrowButton() {
		return productAlertSettingsArrowButton;
	}

	// ....Product Plans....//

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]")
	private WebElement productPlansArrowbutton;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[8]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]")
	private WebElement ppPlan1DetailsArrowButton;

	@FindBy(xpath = "//button[normalize-space()='Premium Chart']")
	private WebElement ppPlanPremiumChartView;

	@FindBy(xpath = "//button[normalize-space()='Sales Pitch Template']")
	private WebElement ppPlanSalesPitchTemplateView;

	@FindBy(xpath = "//button[normalize-space()='Not Covered Template']")
	private WebElement ppPlanNotCoveredTemplateView;

	@FindBy(xpath = "//button[normalize-space()='Policy Coverage Template']")
	private WebElement ppPlanPolicyCoverageTemplateView;

	@FindBy(xpath = "//span[normalize-space()='×']")
	private WebElement popupViewCloseBtn;

	public WebElement getPpPlanSalesPitchTemplateView() {
		return ppPlanSalesPitchTemplateView;
	}

	public WebElement getPpPlanNotCoveredTemplateView() {
		return ppPlanNotCoveredTemplateView;
	}

	public WebElement getPpPlanPolicyCoverageTemplateView() {
		return ppPlanPolicyCoverageTemplateView;
	}

	public WebElement getPopupViewCloseBtn() {
		return popupViewCloseBtn;
	}

	@FindBy(xpath = "//span[@aria-hidden='true']")
	private WebElement ppClosePlanPremiumChartView;

	@FindBy(xpath = "//b[normalize-space()='Plan Templates']")
	private WebElement ppPlanTemplatesArrrowbutton;

	@FindBy(xpath = "(//button[normalize-space()='View'])[14]")
	private WebElement ppAuthorizationLetterTemplateView;

	@FindBy(xpath = "//span[normalize-space()='×']")
	private WebElement ppCloseAuthorizationLettetTemplateView;

	@FindBy(xpath = "//b[normalize-space()='Plan Coverages']")
	private WebElement ppPlanCoveragesArrowButton;

	@FindBy(xpath = "//b[normalize-space()='Plan Relationships']")
	private WebElement ppPlanRelationships;

	@FindBy(xpath = "//b[normalize-space()='Plan Nominee Relationships']")
	private WebElement ppPlanNomineeRelationships;

	public WebElement getProductPlansArrowbutton() {
		return productPlansArrowbutton;
	}

	public WebElement getPpPlan1DetailsArrowButton() {
		return ppPlan1DetailsArrowButton;
	}

	public WebElement getPpPlanPremiumChartView() {
		return ppPlanPremiumChartView;
	}

	public WebElement getPpClosePlanPremiumChartView() {
		return ppClosePlanPremiumChartView;
	}

	public WebElement getPpPlanTemplatesArrrowbutton() {
		return ppPlanTemplatesArrrowbutton;
	}

	public WebElement getPpAuthorizationLetterTemplateView() {
		return ppAuthorizationLetterTemplateView;
	}

	public WebElement getPpCloseAuthorizationLettetTemplateView() {
		return ppCloseAuthorizationLettetTemplateView;
	}

	public WebElement getPpPlanCoveragesArrowButton() {
		return ppPlanCoveragesArrowButton;
	}

	public WebElement getPpPlanRelationships() {
		return ppPlanRelationships;
	}

	public WebElement getPpPlanNomineeRelationships() {
		return ppPlanNomineeRelationships;
	}

	// ...Cancel And Approve....//

	@FindBy(xpath = "//button[@id='send_comments']")
	private WebElement cancelButton;

	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement cancelButtonClickNo;

	@FindBy(xpath = "//button[normalize-space()='Send']")
	private WebElement cancelButtonClickSendComment;

	@FindBy(xpath = "//button[@id='product_approve']")
	private WebElement approveButton;

	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement approveButtonClickNo;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement approveButtonClickYes;

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getCancelButtonClickNo() {
		return cancelButtonClickNo;
	}

	public WebElement getCancelButtonClickSendComment() {
		return cancelButtonClickSendComment;
	}

	public WebElement getApproveButton() {
		return approveButton;
	}

	public WebElement getApproveButtonClickNo() {
		return approveButtonClickNo;
	}

	public WebElement getApproveButtonClickYes() {
		return approveButtonClickYes;
	}

	// =============pending for publishing=============//
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[4]/ul/li[1]/a")
	private WebElement getPendingPublish;

	public WebElement getGetPendingPublish() {
		return getPendingPublish;
	}

	// Approved Products
	@FindBy(xpath = "//*[@id=\"tab-1\"]/div/div[1]/div[1]/div/a/i")
	private WebElement getFilter;

	@FindBy(xpath = "//*[@id=\"select2-orgid-container\"]")
	private WebElement organization_Select;

	@FindBy(id = "btn_filter")
	private WebElement productApplyButton;

	@FindBy(xpath = "//*[@id=\"filterreportTable_length\"]/label/select")
	private WebElement prodShowSelect;

	@FindBy(xpath = "//table[@id=\"reportTable\"]/tbody/tr[1]/td[14]/a[1]")
	private WebElement prodEdit;
	@FindBy(xpath = "//*[@id=\"filterreportTable_wrapper\"]/div/div[2]/button/span")
	private WebElement prodExcel;
	@FindBy(xpath = "//*//table[@id=\"reportTable\"]/tbody/tr[1]/td[14]/a[2]")
	private WebElement prodplans;
	@FindBy(xpath = "//table[@id=\"reportTable\"]/tbody/tr[1]/td[14]/a[3]")
	private WebElement prodCOINumber;
	@FindBy(xpath = "//*[@id=\"pageactions\"]/div/a")
	private WebElement prodMaxScreen;
	@FindBy(xpath = "//*[@id=\"reportTable_paginate\"]/span/a[1]")
	private WebElement prodPreview;
	@FindBy(xpath = "//*[@id=\"reportTable_next\"]")
	private WebElement prodNextButton;

	@FindBy(id = "btn_filter_clear")
	private WebElement prodReset;

	public WebElement getOrganization_Select() {
		return organization_Select;
	}

	public WebElement getGetFilter() {
		return getFilter;
	}

	public WebElement getProductApplyButton() {
		return productApplyButton;
	}

	public WebElement getProdShowSelect() {
		return prodShowSelect;
	}

	public WebElement getProdEdit() {
		return prodEdit;
	}

	public WebElement getProdExcel() {
		return prodExcel;
	}

	public WebElement getProdplans() {
		return prodplans;
	}

	public WebElement getProdCOINumber() {
		return prodCOINumber;
	}

	public WebElement getProdMaxScreen() {
		return prodMaxScreen;
	}

	public WebElement getProdPreview() {
		return prodPreview;
	}

	public WebElement getProdNextButton() {
		return prodNextButton;
	}

	public WebElement getProdReset() {
		return prodReset;
	}

	// Delete button and Yes,No conformation
	@FindBy(xpath = "//*[@id=\"filterreportTable\"]/tbody/tr[1]/td[14]/a[4]")
	private WebElement prodDelete;
	@FindBy(id = "detele_product")
	private WebElement prodDeleteConformation_yes;
	@FindBy(xpath = "//*[@id=\"detele_products\"]/div/div/div[3]/button[1]")
	private WebElement prodDeleteConformation_No;

	public WebElement getProdDelete() {
		return prodDelete;
	}

	public WebElement getProdDeleteConformation_yes() {
		return prodDeleteConformation_yes;
	}

	public WebElement getProdDeleteConformation_No() {
		return prodDeleteConformation_No;
	}

	// Publish button and Yes,No conformation

	@FindBy(xpath = "//*[@id=\"filterreportTable\"]/tbody/tr[1]/td[14]/a[5]")
	private WebElement prodPublish_Buttton;

	@FindBy(xpath = "/html/body/div[4]/div[7]/button[1]")
	private WebElement publishConformtio_No;
	@FindBy(xpath = "/html/body/div[4]/div[7]/button[2]")
	private WebElement publishConformtio_Yes;

	public WebElement getProdPublish_Buttton() {
		return prodPublish_Buttton;
	}

	public WebElement getPublishConformtio_No() {
		return publishConformtio_No;
	}

	public WebElement getPublishConformtio_Yes() {
		return publishConformtio_Yes;
	}

	@FindBy(xpath = "//*[@id=\"select2-orgid-container\"]")
	private WebElement Organization_ProductPublish;

	@FindBy(xpath = "//*[@id=\"select2-inscompanyid-container\"]")
	private WebElement InsuranceCompany_ProductPublish;

	@FindBy(xpath = "//*[@id=\"select2-segmentid-container\"]")
	private WebElement Segment_ProductPublish;

	@FindBy(xpath = "//*[@id=\"select2-businesstypeid-container\"]")
	private WebElement BussinessType_ProductPublish;

	public WebElement getBussinessType_ProductPublish() {
		return BussinessType_ProductPublish;
	}

	public WebElement getSegment_ProductPublish() {
		return Segment_ProductPublish;
	}

	public WebElement getInsuranceCompany_ProductPublish() {
		return InsuranceCompany_ProductPublish;
	}

	public WebElement getOrganization_ProductPublish() {
		return Organization_ProductPublish;
	}

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement Organization_ProductPublish_Textbox;

	public WebElement getPPSave() {
		return PPSave;
	}

	public WebElement getOrganization_ProductPublish_Textbox() {
		return Organization_ProductPublish_Textbox;
	}

	@FindBy(xpath = "//a[normalize-space()='Pending For Publishing Combo']")
	private WebElement pm_PendingForPublishingCombo;

	@FindBy(xpath = "//a[normalize-space()='Pending For Approval Combo']")
	private WebElement pm_PendingForApprovalCombo;

	@FindBy(xpath = "//a[normalize-space()='Combo Products']")
	private WebElement pm_comboProduct;

	public WebElement getPm_comboProduct() {
		return pm_comboProduct;
	}

	public WebElement getPm_PendingForPublishingCombo() {
		return pm_PendingForPublishingCombo;
	}

	public WebElement getPm_PendingForApprovalCombo() {
		return pm_PendingForApprovalCombo;
	}

	// ..........After Click New Combo Product.........//

	@FindBy(xpath = "//a[@id='btn_AddProduct']")
	private WebElement pm_cp_NewComboProduct;

	@FindBy(xpath = "//input[@id='product_name']")
	private WebElement pm_cp_ProductName;

	@FindBy(xpath = "//textarea[@id='product_des']")
	private WebElement pm_cp_InsuranceProductName;

	@FindBy(xpath = "//select[@id='saletypeid']")
	private WebElement pm_cp_ProductSaleTypeSelect;

	@FindBy(xpath = "//select[@id='orgid']")
	private WebElement pm_cp_OrganizationSelect;

	@FindBy(xpath = "//select[@id='productid']")
	private WebElement pm_cp_ProductsSelect;

	@FindBy(xpath = "//select[@id='product_priority']")
	private WebElement pm_cp_PriorityofIssuanceSelect;

	@FindBy(xpath = "//button[@id='addproduct_btn']")
	private WebElement pm_cp_AddtoComboBtn;

	@FindBy(xpath = "//label[normalize-space()='Do you want to show this Product to Organization?']")
	private WebElement pm_cp_DoyouwanttoshowthisProducttoOrganization;

	@FindBy(xpath = "//label[normalize-space()='Do you want to enable Super Admin Bulk Upload for this Combo Product?']")
	private WebElement pm_cp_DoyouwanttoenableSuperAdminBulkUploadforthisComboProduct;

	@FindBy(xpath = "//button[contains(@class,'remove')]")
	private WebElement pm_cp_RemoveBtn;

	@FindBy(xpath = "//input[@id='product_image']")
	private WebElement pm_cp_ProductImageUploadInJpg;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement pm_cp_ComboCOITemplateArrowBtn;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/div[10]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pm_cp_ComboCOITemplateTextBox;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/a[1]")
	private WebElement pm_cp_ReceiptEmailTemplateArrowBtn;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/div[11]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pm_cp_ReceiptEmailTemplateTextBox;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[12]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement pm_cp_ReceiptPDFTemplateArrowBtn;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/div[12]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pm_cp_ReceiptPDFTemplateTextBox;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[13]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement pm_cp_ComboCOIEmailTemplateArrowBtn;

	@FindBy(xpath = "//*[@id=\"ibox1\"]/div[2]/div[2]/div[13]/div/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement pm_cp_ComboCOIEmailTemplateTextBox;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement pm_cp_BackBtn;

	@FindBy(xpath = "//button[@id='product_save']")
	private WebElement pm_cp_SaveBtn;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement pm_publishproduct_show;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement pm_publishproduct_excel;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/a[2]")
	private WebElement pm_publishproduct_unpublic;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement pm_pendingforapproval_show;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement pm_pendingforapproval_Excel;

	@FindBy(xpath = "//div[@id='tab-1']//i[@class='fa fa-chevron-up']")
	private WebElement pm_product_external_filter;

	public WebElement getPm_product_external_filter() {
		return pm_product_external_filter;
	}

	@FindBy(xpath = "//span[@id='select2-exorgid-container']")
	private WebElement pm_product_external_organization;

	@FindBy(xpath = "//span[@id='select2-exinscompanyid-container']")
	private WebElement pm_product_external_InsuranceCompany;

	@FindBy(xpath = "//span[@id='select2-exsegmentid-container']")
	private WebElement pm_product_external_Segment;

	@FindBy(xpath = "//span[@id='select2-exbusinesstypeid-container']")
	private WebElement pm_product_external_Bussiness;

	@FindBy(xpath = "//a[@id='btn_filter2']")
	private WebElement pm_product_external_Apply;

	@FindBy(xpath = "//a[@id='btn_filter2_clear']")
	private WebElement pm_product_external_Reset;

	@FindBy(xpath = "//select[@name='expiredreportTable_length']")
	private WebElement pm_product_external_Show;

	@FindBy(xpath = "//div[@id='expiredreportTable_wrapper']//div//span[contains(text(),'Excel')]")
	private WebElement pm_product_external_Excel;

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement pm_combo_Show;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement pm_combo_Excel;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/a[2]")
	private WebElement pm_combo_unpublish;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement pm_combo_cancel;

	public WebElement getPm_combo_cancel() {
		return pm_combo_cancel;
	}

	public WebElement getPm_combo_unpublish() {
		return pm_combo_unpublish;
	}

	public WebElement getPm_combo_Excel() {
		return pm_combo_Excel;
	}

	public WebElement getPm_combo_Show() {
		return pm_combo_Show;
	}

	public WebElement getPm_product_external_Excel() {
		return pm_product_external_Excel;
	}

	public WebElement getPm_product_external_Show() {
		return pm_product_external_Show;
	}

	public WebElement getPm_product_external_Reset() {
		return pm_product_external_Reset;
	}

	public WebElement getPm_product_external_Apply() {
		return pm_product_external_Apply;
	}

	public WebElement getPm_product_external_Bussiness() {
		return pm_product_external_Bussiness;
	}

	public WebElement getPm_product_external_Segment() {
		return pm_product_external_Segment;
	}

	public WebElement getPm_product_external_InsuranceCompany() {
		return pm_product_external_InsuranceCompany;
	}

	public WebElement getPm_product_external_organization() {
		return pm_product_external_organization;
	}

	public WebElement getPm_pendingforapproval_show() {
		return pm_pendingforapproval_show;
	}

	public WebElement getPm_pendingforapproval_Excel() {
		return pm_pendingforapproval_Excel;
	}

	public WebElement getPm_pebdingforapproval_show() {
		return pm_pendingforapproval_show;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement pm_publishproduct_unpublish_conformation;

	public WebElement getPm_publishproduct_unpublish_conformation() {
		return pm_publishproduct_unpublish_conformation;
	}

	public WebElement getPm_publishproduct_unpublic() {
		return pm_publishproduct_unpublic;
	}

	public WebElement getPm_publishproduct_excel() {
		return pm_publishproduct_excel;
	}

	public WebElement getPmExpiredfilterarrowbutton() {
		return pmExpiredfilterarrowbutton;
	}

	public WebElement getPmExpiredorgfilter() {
		return pmExpiredorgfilter;
	}

	public WebElement getPmExpiredinsfilter() {
		return pmExpiredinsfilter;
	}

	public WebElement getPmExpiredsegmentfilter() {
		return pmExpiredsegmentfilter;
	}

	public WebElement getPmExpiredbusinesstypefilter() {
		return pmExpiredbusinesstypefilter;
	}

	public WebElement getPmExpiredFilterApplybttn() {
		return pmExpiredFilterApplybttn;
	}

	public WebElement getPmExpiredFilterResetbtn() {
		return pmExpiredFilterResetbtn;
	}

	public WebElement getPm_publishproduct_show() {
		return pm_publishproduct_show;
	}

	public WebElement getPm_cpEdit() {
		return pm_cpEdit;
	}

	public WebElement getPm_cp_ProductName() {
		return pm_cp_ProductName;
	}

	public WebElement getPm_cp_InsuranceProductName() {
		return pm_cp_InsuranceProductName;
	}

	public WebElement getPm_cp_ProductSaleTypeSelect() {
		return pm_cp_ProductSaleTypeSelect;
	}

	public WebElement getPm_cp_NewComboProduct() {
		return pm_cp_NewComboProduct;
	}

	public WebElement getPm_cp_OrganizationSelect() {
		return pm_cp_OrganizationSelect;
	}

	public WebElement getPm_cp_ProductsSelect() {
		return pm_cp_ProductsSelect;
	}

	public WebElement getPm_cp_PriorityofIssuanceSelect() {
		return pm_cp_PriorityofIssuanceSelect;
	}

	public WebElement getPm_cp_AddtoComboBtn() {
		return pm_cp_AddtoComboBtn;
	}

	public WebElement getPm_cp_DoyouwanttoshowthisProducttoOrganization() {
		return pm_cp_DoyouwanttoshowthisProducttoOrganization;
	}

	public WebElement getPm_cp_DoyouwanttoenableSuperAdminBulkUploadforthisComboProduct() {
		return pm_cp_DoyouwanttoenableSuperAdminBulkUploadforthisComboProduct;
	}

	public WebElement getPm_cp_RemoveBtn() {
		return pm_cp_RemoveBtn;
	}

	public WebElement getPm_cp_ProductImageUploadInJpg() {
		return pm_cp_ProductImageUploadInJpg;
	}

	public WebElement getPm_cp_ComboCOITemplateArrowBtn() {
		return pm_cp_ComboCOITemplateArrowBtn;
	}

	public WebElement getPm_cp_ReceiptEmailTemplateArrowBtn() {
		return pm_cp_ReceiptEmailTemplateArrowBtn;
	}

	public WebElement getPm_cp_ReceiptPDFTemplateArrowBtn() {
		return pm_cp_ReceiptPDFTemplateArrowBtn;
	}

	public WebElement getPm_cp_ComboCOIEmailTemplateArrowBtn() {
		return pm_cp_ComboCOIEmailTemplateArrowBtn;
	}

	public WebElement getPm_cp_ComboCOITemplateTextBox() {
		return pm_cp_ComboCOITemplateTextBox;
	}

	public WebElement getPm_cp_ReceiptEmailTemplateTextBox() {
		return pm_cp_ReceiptEmailTemplateTextBox;
	}

	public WebElement getPm_cp_ReceiptPDFTemplateTextBox() {
		return pm_cp_ReceiptPDFTemplateTextBox;
	}

	public WebElement getPm_cp_ComboCOIEmailTemplateTextBox() {
		return pm_cp_ComboCOIEmailTemplateTextBox;
	}

	public WebElement getPm_cp_BackBtn() {
		return pm_cp_BackBtn;
	}

	public WebElement getPm_cp_SaveBtn() {
		return pm_cp_SaveBtn;
	}

	// ....After Click Edit Button........//

	@FindBy(xpath = "//label[@id='copycheck']")
	private WebElement pm_cp_Doyouwanttocopyallplans;

	@FindBy(xpath = "//button[@id='productcopy_save']")
	private WebElement pm_cp_CopyBtn;

	public WebElement getPm_cp_Doyouwanttocopyallplans() {
		return pm_cp_Doyouwanttocopyallplans;
	}

	public WebElement getPm_cp_CopyBtn() {
		return pm_cp_CopyBtn;
	}

	// ...after Click plans Button.......//

	@FindBy(xpath = "//a[normalize-space()='Plans']")
	private WebElement pm_cp_PlansByn;

	public WebElement getPm_cp_PlansByn() {
		return pm_cp_PlansByn;
	}

	@FindBy(xpath = "//div[@class='ibox-title']//a[1]")
	private WebElement pm_cp_NewProductPlanBtn;

	@FindBy(xpath = "//input[@id='productplan_name']")
	private WebElement pm_cp_ProductPlanName;

	@FindBy(xpath = "//textarea[@id='productplan_des']")
	private WebElement pm_cp_InsurancePlanName;

	@FindBy(xpath = "//select[@id='productplanid']")
	private WebElement pm_cp_ProductPlans;

	@FindBy(xpath = "//button[@id='addproductplan_btn']")
	private WebElement pm_cp_AddtoComboPlans;

	@FindBy(xpath = "//button[@id='productplan_save']")
	private WebElement pm_cp_productplanSaveBtn;

	public WebElement getPm_cp_NewProductPlanBtn() {
		return pm_cp_NewProductPlanBtn;
	}

	public WebElement getPm_cp_ProductPlanName() {
		return pm_cp_ProductPlanName;
	}

	public WebElement getPm_cp_InsurancePlanName() {
		return pm_cp_InsurancePlanName;
	}

	public WebElement getPm_cp_ProductPlans() {
		return pm_cp_ProductPlans;
	}

	public WebElement getPm_cp_AddtoComboPlans() {
		return pm_cp_AddtoComboPlans;
	}

	public WebElement getPm_cp_productplanSaveBtn() {
		return pm_cp_productplanSaveBtn;
	}

	// ........After Click UnPublish And Publish Button.....//

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement pm_cp_CancelBtn;

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement pm_cp_pubyesBtn;

	public WebElement getPm_cp_CancelBtn() {
		return pm_cp_CancelBtn;
	}

	public WebElement getPm_cp_pubyesBtn() {
		return pm_cp_pubyesBtn;
	}

	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement pm_cp_NoBtn;

	@FindBy(xpath = "//button[@id='detele_product']")
	private WebElement pm_cp_yesBtn;

	public WebElement getPm_cp_NoBtn() {
		return pm_cp_NoBtn;
	}

	public WebElement getPm_cp_yesBtn() {
		return pm_cp_yesBtn;
	}

	// common for all Combo modules........//

	@FindBy(xpath = "//select[@name='reportTable_length']")
	private WebElement pm_cp_ShowSelect;

	@FindBy(xpath = "//span[normalize-space()='Excel']")
	private WebElement pm_cp_EntiresDataDownloadInExcel;

	@FindBy(xpath = "//a[@class='fullscreen-link btn btn-default']")
	private WebElement pm_cp_ExpandFullScreenBtn;

	public WebElement getPm_cp_ShowSelect() {
		return pm_cp_ShowSelect;
	}

	public WebElement getPm_cp_EntiresDataDownloadInExcel() {
		return pm_cp_EntiresDataDownloadInExcel;
	}

	public WebElement getPm_cp_ExpandFullScreenBtn() {
		return pm_cp_ExpandFullScreenBtn;
	}

	// ---------- combonewproductedit ----------//

	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]")
	private WebElement pm_cpEdit;

	public WebElement getpm_cpEdit() {
		return pm_cpEdit;

	}

	@FindBy(xpath = "//table[@id='reportTable']//tr[1]//td[8]//a[2]")
	private WebElement pm_cp_comboapprovedplanbtn;

	public WebElement getpm_cp_comboapprovedplanbtn() {
		return pm_cp_comboapprovedplanbtn;
	}

	// ---------- PendingforApproval ----------//
	@FindBy(xpath = "//*[@id=\"reportTable\"]/tbody/tr[113]/td[14]/a[4]")
	private WebElement pendingforapproval_delete;

	public WebElement getPendingforapproval_delete() {
		return pendingforapproval_delete;
	}

	@FindBy(xpath = "//button[@id='detele_product']")
	private WebElement pendingforApproval_delete_yes;

	public WebElement getPendingforApproval_delete_yes() {
		return pendingforApproval_delete_yes;
	}

	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement pendingforApproval_delete_No;

	public WebElement getPendingforApproval_delete_No() {
		return pendingforApproval_delete_No;
	}

	// ----------------combo product-----------------------//

	@FindBy(xpath = "//input[@id='product_name']")
	private WebElement combo_productName;

	@FindBy(xpath = "//textarea[@id='product_des']")
	private WebElement combo_InsuranceProductName;

	@FindBy(xpath = "//span[@id='select2-saletypeid-container']")
	private WebElement combo_ProductSaleType;

	@FindBy(xpath = "//span[@id='select2-orgid-container']")
	private WebElement combo_Organization;

	@FindBy(xpath = "//span[@id='select2-productid-container']")
	private WebElement combo_Products;

	@FindBy(xpath = "//button[@id='addproduct_btn']")
	private WebElement combo_AddtoCombo;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement combo_ComboCOITemplet;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[11]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement combo_ReceiptEmailTemplate;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[12]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement combo_ReceiptPDFTemplate;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[13]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement combo_COIEmailTemplate;

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement combo_Back;

	public WebElement getCombo_Back() {
		return combo_Back;
	}

	public WebElement getCombo_COIEmailTemplate() {
		return combo_COIEmailTemplate;
	}

	public WebElement getCombo_ReceiptPDFTemplate() {
		return combo_ReceiptPDFTemplate;
	}

	public WebElement getCombo_ReceiptEmailTemplate() {
		return combo_ReceiptEmailTemplate;
	}

	public WebElement getCombo_ComboCOITemplet() {
		return combo_ComboCOITemplet;
	}

	public WebElement getCombo_AddtoCombo() {
		return combo_AddtoCombo;
	}

	@FindBy(xpath = "//div[@class='input-group']//span[@class='select2 select2-container select2-container--default']")
	private WebElement combo_PriorityofIssuance;

	public WebElement getCombo_PriorityofIssuance() {
		return combo_PriorityofIssuance;
	}

	public WebElement getCombo_Products() {
		return combo_Products;
	}

	public WebElement getCombo_Organization() {
		return combo_Organization;
	}

	public WebElement getCombo_ProductSaleType() {
		return combo_ProductSaleType;
	}

	public WebElement getCombo_InsuranceProductName() {
		return combo_InsuranceProductName;
	}

	public WebElement getCombo_productName() {
		return combo_productName;
	}

	@FindBy(xpath = "//div[@class='ibox-title']//a[2]")
	private WebElement pm_productplans_backbutton;

	public WebElement getpm_productplans_backbutton() {
		return pm_productplans_backbutton;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[3]")
	private WebElement pm_cp_deletebutton;

	public WebElement getpm_cp_deletebutton() {
		return pm_cp_deletebutton;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[4]")
	private WebElement pm_cp_publishbutton;

	public WebElement getpm_cp_publishbutton() {
		return pm_cp_publishbutton;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]")
	private WebElement pm_plantemplates_viewbutton;

	public WebElement getpm_plantemplates_viewbutton() {
		return pm_plantemplates_viewbutton;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[3]/h2[1]/button[1]/span[1]")
	private WebElement pm_plantemplates_viewbuttonclose;

	public WebElement getpm_plantemplates_viewbuttonclose() {
		return pm_plantemplates_viewbuttonclose;
	}

	@FindBy(xpath = "//b[normalize-space()='Plan Templates']")
	private WebElement pm_productviewplantemplates;

	public WebElement getpm_productviewplantemplates() {
		return pm_productviewplantemplates;
	}

	@FindBy(xpath = "//b[normalize-space()='Plan Coverages']")
	private WebElement pm_productviewplancoverages;

	public WebElement getpm_productviewplancoverages() {
		return pm_productviewplancoverages;
	}

	@FindBy(xpath = "//b[normalize-space()='Product Plans']")
	private WebElement pm_productviewproductplan;

	public WebElement getpm_productviewproductplan() {
		return pm_productviewproductplan;
	}

	@FindBy(xpath = "//a[@id='COINumbers_tab']")
	private WebElement pm_productcoinumberstab;

	public WebElement getpm_productcoinumberstab() {
		return pm_productcoinumberstab;
	}

	@FindBy(xpath = "//a[normalize-space()='Tenure(In Months)']")
	private WebElement pm_Tenuretab;

	public WebElement getpm_Tenuretab() {
		return pm_Tenuretab;
	}

	@FindBy(xpath = "//a[normalize-space()='Templates']")
	private WebElement pm_Templatestab;

	public WebElement getpm_Templatestab() {
		return pm_Templatestab;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/a[2]")
	private WebElement pm_premiumchart;

	public WebElement getpm_premiumchart() {
		return pm_premiumchart;
	}

	@FindBy(xpath = "//a[normalize-space()='Plan RelationShips']")
	private WebElement pm_planrelationship;

	public WebElement getpm_planrelationship() {
		return pm_planrelationship;
	}

	@FindBy(xpath = "//a[normalize-space()='Product Plans Details']")
	private WebElement pm_productplanlistbutton;

	public WebElement getpm_productplanlistbutton() {
		return pm_productplanlistbutton;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/a[3]")
	private WebElement pm_productplandeletebtn;

	public WebElement getpm_productplandeletebtn() {
		return pm_productplandeletebtn;
	}

	@FindBy(xpath = "//div[@id='detele_productplans']//button[@type='button'][normalize-space()='No']")
	private WebElement pm_productplandeleteconformationnobtn;

	public WebElement getpm_productplandeleteconformationnobtn() {
		return pm_productplandeleteconformationnobtn;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[14]/a[3]")
	private WebElement pm_productplancoibtn;

	public WebElement getpm_productplancoibtn() {
		return pm_productplancoibtn;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[14]/a[4]")
	private WebElement pm_produtlistdeletebtn;

	public WebElement getpm_produtlistdeletebtn() {
		return pm_produtlistdeletebtn;
	}

	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement pm_produtlistdeleteconformationnobtn;

	public WebElement getpm_produtlistdeleteconformationnobtn() {
		return pm_produtlistdeleteconformationnobtn;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[14]/a[5]")
	private WebElement pm_produtlistpublishbtn;

	public WebElement getpm_produtlistpublishbtn() {
		return pm_produtlistpublishbtn;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]")
	private WebElement productplanseditbutton;

	public WebElement getproductplanseditbutton() {
		return productplanseditbutton;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[14]/a[2]")
	private WebElement Approvedproductslistplanbutton;

	public WebElement getApprovedproductslistplanbutton() {
		return Approvedproductslistplanbutton;
	}

	@FindBy(xpath = "//a[normalize-space()='Plan Coverage']")
	private WebElement pm_productplanviewplancoverages;

	public WebElement getpm_productplanviewplancoverages() {
		return pm_productplanviewplancoverages;
	}

	@FindBy(xpath = "//a[contains(text(),'Premium Chart')]")
	private WebElement pm_productplanpremiumcharttab;

	public WebElement getpm_productplanpremiumcharttab() {
		return pm_productplanpremiumcharttab;
	}

	@FindBy(xpath = "//a[normalize-space()='Premium Chart']")
	private WebElement Newproductplanpm_premiumchart;

	public WebElement getNewproductplanpm_premiumchart() {
		return Newproductplanpm_premiumchart;
	}

	@FindBy(xpath = "//a[@href='/home']")
	private WebElement pmviewproductdetailshomebutton;

	public WebElement getpmviewproductdetailshomebutton() {
		return pmviewproductdetailshomebutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Product Coverages']")
	private WebElement pmviewproductdetailsproductcoveragesarrowbutton;

	public WebElement getpmviewproductdetailsproductcoveragesarrowbutton() {
		return pmviewproductdetailsproductcoveragesarrowbutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Product Sum Insured/Tenure']")
	private WebElement pmviewproductdetailsproductsuminsuredarrowbutton;

	public WebElement getpmviewproductdetailsproductsuminsuredarrowbutton() {
		return pmviewproductdetailsproductsuminsuredarrowbutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Product Claim Documents']")
	private WebElement pmviewproductclaimdocumentsarrowbutton;

	public WebElement getpmviewproductclaimdocumentsarrowbutton() {
		return pmviewproductclaimdocumentsarrowbutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Product Templates']")
	private WebElement pmviewproducttemplatessarrowbutton;

	public WebElement getpmviewproducttemplatessarrowbutton() {
		return pmviewproducttemplatessarrowbutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Product Alert Settings']")
	private WebElement pmviewproductalertsettingssarrowbutton;

	public WebElement getpmviewproductalertsettingssarrowbutton() {
		return pmviewproductalertsettingssarrowbutton;
	}

	@FindBy(xpath = "//button[normalize-space()='Premium Chart']")
	private WebElement pmviewproductplanspremiumchartbutton;

	public WebElement getpmviewproductplanspremiumchartbutton() {
		return pmviewproductplanspremiumchartbutton;
	}

	@FindBy(xpath = "//label[normalize-space()='Do you want to enable the Receipt?']")
	private WebElement pmEnableReceipt;

	public WebElement getpmEnableReceipt() {
		return pmEnableReceipt;
	}

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement pmviewproductdetailsnocoiwarningbutton;

	public WebElement getpmviewproductdetailsnocoiwarningbutton() {
		return pmviewproductdetailsnocoiwarningbutton;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/a[1]")
	private WebElement pmExpiredviewbutton;

	public WebElement getpmExpiredviewbutton() {
		return pmExpiredviewbutton;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[14]/a[1]")
	private WebElement pmpublishedproductviewbutton;

	public WebElement getpmpublishedproductviewbutton() {
		return pmpublishedproductviewbutton;
	}

	@FindBy(xpath = "//button[normalize-space()='COI Numbers']")
	private WebElement pmviewproductdetailscoibutton;

	public WebElement getpmviewproductdetailscoibutton() {
		return pmviewproductdetailscoibutton;
	}

	@FindBy(xpath = "//span[@aria-hidden='true']")
	private WebElement pmviewproductdetailscoiclosebutton;

	public WebElement getpmviewproductdetailscoiclosebutton() {
		return pmviewproductdetailscoiclosebutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Plan Name :']")
	private WebElement pmviewproductplansnamearrowbutton;

	public WebElement getpmviewproductplansnamearrowbutton() {
		return pmviewproductplansnamearrowbutton;
	}

	@FindBy(xpath = "//span[@aria-hidden='true']")
	private WebElement pmviewproductplanspremiumchartclosebutton;

	public WebElement getpmviewproductplanspremiumchartclosebutton() {
		return pmviewproductplanspremiumchartclosebutton;
	}

	@FindBy(xpath = "//b[normalize-space()='Plan Relationships']")
	private WebElement pmviewproductplansrelationships;

	public WebElement getpmviewproductplansrelationships() {
		return pmviewproductplansrelationships;
	}

	@FindBy(xpath = "//b[normalize-space()='Plan Nominee Relationships']")
	private WebElement pmviewproductplansnomineerelationships;

	public WebElement getpmviewproductplansnomineerelationships() {
		return pmviewproductplansnomineerelationships;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[14]/a[2]")
	private WebElement pmpublishedproductunpublishbutton;

	public WebElement getpmpublishedproductunpublishbutton() {
		return pmpublishedproductunpublishbutton;
	}

	@FindBy(xpath = "//select[@name='expiredreportTable_length']")
	private WebElement pmExpiredshowbutton;

	public WebElement getpmExpiredshowbutton() {
		return pmExpiredshowbutton;
	}

	@FindBy(xpath = "//div[@id='expiredreportTable_wrapper']//div//button[@type='button']")
	private WebElement pmExpiredexcelbutton;

	public WebElement getpmExpiredexcelbutton() {
		return pmExpiredexcelbutton;
	}

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement pmyes;

	@FindBy(xpath = "//button[@class='cancel']")
	private WebElement pmNo;

	public WebElement getPm_cp_comboapprovedplanbtn() {
		return pm_cp_comboapprovedplanbtn;
	}

	public WebElement getPm_productplans_backbutton() {
		return pm_productplans_backbutton;
	}

	public WebElement getPm_cp_deletebutton() {
		return pm_cp_deletebutton;
	}

	public WebElement getPm_cp_publishbutton() {
		return pm_cp_publishbutton;
	}

	public WebElement getPm_plantemplates_viewbutton() {
		return pm_plantemplates_viewbutton;
	}

	public WebElement getPm_plantemplates_viewbuttonclose() {
		return pm_plantemplates_viewbuttonclose;
	}

	public WebElement getPm_productviewplantemplates() {
		return pm_productviewplantemplates;
	}

	public WebElement getPm_productviewplancoverages() {
		return pm_productviewplancoverages;
	}

	public WebElement getPm_productviewproductplan() {
		return pm_productviewproductplan;
	}

	public WebElement getPm_productcoinumberstab() {
		return pm_productcoinumberstab;
	}

	public WebElement getPm_Tenuretab() {
		return pm_Tenuretab;
	}

	public WebElement getPm_Templatestab() {
		return pm_Templatestab;
	}

	public WebElement getPm_premiumchart() {
		return pm_premiumchart;
	}

	public WebElement getPm_planrelationship() {
		return pm_planrelationship;
	}

	public WebElement getPm_productplanlistbutton() {
		return pm_productplanlistbutton;
	}

	public WebElement getPm_productplandeletebtn() {
		return pm_productplandeletebtn;
	}

	public WebElement getPm_productplandeleteconformationnobtn() {
		return pm_productplandeleteconformationnobtn;
	}

	public WebElement getPm_productplancoibtn() {
		return pm_productplancoibtn;
	}

	public WebElement getPm_produtlistdeletebtn() {
		return pm_produtlistdeletebtn;
	}

	public WebElement getPm_produtlistdeleteconformationnobtn() {
		return pm_produtlistdeleteconformationnobtn;
	}

	public WebElement getPm_produtlistpublishbtn() {
		return pm_produtlistpublishbtn;
	}

	public WebElement getProductplanseditbutton() {
		return productplanseditbutton;
	}

	public WebElement getPm_productplanviewplancoverages() {
		return pm_productplanviewplancoverages;
	}

	public WebElement getPm_productplanpremiumcharttab() {
		return pm_productplanpremiumcharttab;
	}

	public WebElement getPmviewproductdetailshomebutton() {
		return pmviewproductdetailshomebutton;
	}

	public WebElement getPmviewproductdetailsproductcoveragesarrowbutton() {
		return pmviewproductdetailsproductcoveragesarrowbutton;
	}

	public WebElement getPmviewproductdetailsproductsuminsuredarrowbutton() {
		return pmviewproductdetailsproductsuminsuredarrowbutton;
	}

	public WebElement getPmviewproductclaimdocumentsarrowbutton() {
		return pmviewproductclaimdocumentsarrowbutton;
	}

	public WebElement getPmviewproducttemplatessarrowbutton() {
		return pmviewproducttemplatessarrowbutton;
	}

	public WebElement getPmviewproductalertsettingssarrowbutton() {
		return pmviewproductalertsettingssarrowbutton;
	}

	public WebElement getPmviewproductplanspremiumchartbutton() {
		return pmviewproductplanspremiumchartbutton;
	}

	public WebElement getPmEnableReceipt() {
		return pmEnableReceipt;
	}

	public WebElement getPmviewproductdetailsnocoiwarningbutton() {
		return pmviewproductdetailsnocoiwarningbutton;
	}

	public WebElement getPmExpiredviewbutton() {
		return pmExpiredviewbutton;
	}

	public WebElement getPmpublishedproductviewbutton() {
		return pmpublishedproductviewbutton;
	}

	public WebElement getPmviewproductdetailscoibutton() {
		return pmviewproductdetailscoibutton;
	}

	public WebElement getPmviewproductdetailscoiclosebutton() {
		return pmviewproductdetailscoiclosebutton;
	}

	public WebElement getPmviewproductplansnamearrowbutton() {
		return pmviewproductplansnamearrowbutton;
	}

	public WebElement getPmviewproductplanspremiumchartclosebutton() {
		return pmviewproductplanspremiumchartclosebutton;
	}

	public WebElement getPmviewproductplansrelationships() {
		return pmviewproductplansrelationships;
	}

	public WebElement getPmviewproductplansnomineerelationships() {
		return pmviewproductplansnomineerelationships;
	}

	public WebElement getPmpublishedproductunpublishbutton() {
		return pmpublishedproductunpublishbutton;
	}

	public WebElement getPmExpiredshowbutton() {
		return pmExpiredshowbutton;
	}

	public WebElement getPmExpiredexcelbutton() {
		return pmExpiredexcelbutton;
	}

	public WebElement getPmyes() {
		return pmyes;
	}

	public WebElement getPmNo() {
		return pmNo;
	}

	@FindBy(xpath = "//input[@id='product_image']")
	private WebElement combo_product_image;

	public WebElement getCombo_product_image() {
		return combo_product_image;
	}

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[11]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement combo_RepEmail_Tmp_Text;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[12]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement combo_RepPdf_Tmp_Text;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[13]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]")
	private WebElement combo_coiEmail_Tmp_Text;

	public WebElement getCombo_RepEmail_Tmp_Text() {
		return combo_RepEmail_Tmp_Text;
	}

	public WebElement getCombo_RepPdf_Tmp_Text() {
		return combo_RepPdf_Tmp_Text;
	}

	public WebElement getCombo_coiEmail_Tmp_Text() {
		return combo_coiEmail_Tmp_Text;
	}

	@FindBy(xpath = "//label[normalize-space()='Do you want to enable the Receipt?']")
	private WebElement pmDoyouwanttoenabletheReceipt;

	@FindBy(xpath = "//label[normalize-space()='Do you want to Enable the Email?']")
	private WebElement pmDoyouwanttoEnabletheEmail;

	@FindBy(xpath = "//label[normalize-space()='Do you want Super Admin Bulk Upload?']")
	private WebElement pmDoyouwantSuperAdminBulkUpload;

	@FindBy(xpath = "//label[normalize-space()='Do you want to enable the Add on Feature?']")
	private WebElement pmDoyouwanttoenabletheAddonFeature;

	@FindBy(xpath = "//label[normalize-space()='Do you want this product as service based product']")
	private WebElement pmDoyouwantthisproductasservicebasedproduct;

	@FindBy(xpath = "//label[normalize-space()='Do you want to show this Product to Organization?']")
	private WebElement pmDoyouwanttoshowthisProducttoOrganization;

	@FindBy(xpath = "//label[normalize-space()='Do you want Redirect to this Product to Insurance Portal?']")
	private WebElement pmDoyouwantRedirecttothisProducttoInsurancePortal;

	@FindBy(xpath = "//label[normalize-space()='Do you want Show Premium in Decimal value? (eg:- 305.45)']")
	private WebElement pmDoyouwantShowPremiuminDecimalvalue;

	@FindBy(xpath = "//label[normalize-space()='Do you want Member Form (*Select for only GLPP Products)']")
	private WebElement pmDoyouwantMemberForm;

	@FindBy(xpath = "//label[normalize-space()='Do you want DGH Questionnaires?(*Select for only GLPP Products)']")
	private WebElement pmDoyouwantDGHQuestionnaires;

	@FindBy(xpath = "//label[normalize-space()='Do you want create COI and Send mail?(*Select for only HouseHolder Products)']")
	private WebElement pmDoyouwantcreateCOIandSendmail;

	@FindBy(xpath = "//label[normalize-space()='Do you want to Enable Medical Grid? (*Select for only GLPP Products)']")
	private WebElement pmDoyouwanttoEnableMedicalGrid;

	@FindBy(xpath = "//label[normalize-space()='Is this Product is Loan Linked?(*Select for only HouseHolder Products)']")
	private WebElement pmIsthisProductisLoanLinked;

	public WebElement getPmDoyouwanttoenabletheReceipt() {
		return pmDoyouwanttoenabletheReceipt;
	}

	public WebElement getPmDoyouwanttoEnabletheEmail() {
		return pmDoyouwanttoEnabletheEmail;
	}

	public WebElement getPmDoyouwantSuperAdminBulkUpload() {
		return pmDoyouwantSuperAdminBulkUpload;
	}

	public WebElement getPmDoyouwanttoenabletheAddonFeature() {
		return pmDoyouwanttoenabletheAddonFeature;
	}

	public WebElement getPmDoyouwantthisproductasservicebasedproduct() {
		return pmDoyouwantthisproductasservicebasedproduct;
	}

	public WebElement getPmDoyouwanttoshowthisProducttoOrganization() {
		return pmDoyouwanttoshowthisProducttoOrganization;
	}

	public WebElement getPmDoyouwantRedirecttothisProducttoInsurancePortal() {
		return pmDoyouwantRedirecttothisProducttoInsurancePortal;
	}

	public WebElement getPmDoyouwantShowPremiuminDecimalvalue() {
		return pmDoyouwantShowPremiuminDecimalvalue;
	}

	public WebElement getPmDoyouwantMemberForm() {
		return pmDoyouwantMemberForm;
	}

	public WebElement getPmDoyouwantDGHQuestionnaires() {
		return pmDoyouwantDGHQuestionnaires;
	}

	public WebElement getPmDoyouwantcreateCOIandSendmail() {
		return pmDoyouwantcreateCOIandSendmail;
	}

	public WebElement getPmDoyouwanttoEnableMedicalGrid() {
		return pmDoyouwanttoEnableMedicalGrid;
	}

	public WebElement getPmIsthisProductisLoanLinked() {
		return pmIsthisProductisLoanLinked;
	}

	@FindBy(xpath = "//*[@id=\"alertsettings-list\"]/tbody/tr/td[6]/div[2]/ins")
	private WebElement pmClaim;
//-------------------------------------

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	private WebElement Searchbox;

	@FindBy(xpath = "//tbody/tr[1]/td[14]/a[5]")
	private WebElement SendforApproval;

	@FindBy(xpath = "//a[normalize-space()='Pending For Publishing']")
	private WebElement pendingforpublish;

	public WebElement getPendingforpublish() {
		return pendingforpublish;
	}

	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement SendforApproval_Ok;

	@FindBy(xpath = "//tbody/tr[1]/td[14]/a[2]")
	private WebElement Plansbtn_button;

	public WebElement getPlansbtn_button() {
		return Plansbtn_button;
	}

	public WebElement getSendforApproval_Ok() {
		return SendforApproval_Ok;
	}

	public WebElement getSendforApproval() {
		return SendforApproval;
	}

	public WebElement getSearchbox() {
		return Searchbox;
	}

	@FindBy(xpath = "//div[@class='css-1rvb0xg-MuiStack-root']//p[@class='MuiTypography-root MuiTypography-body1 css-w48hay-MuiTypography-root']")
	private WebElement ppPlan1DetailsArrowButton1;

	public WebElement getPpPlan1DetailsArrowButton1() {
		return ppPlan1DetailsArrowButton1;
	}

	public WebElement getPmClaim() {
		return pmClaim;
	}

	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement pmuploadExcel;

	public WebElement getPmuploadExcel() {
		return pmuploadExcel;
	}

	@FindBy(xpath = "//select[@id='plantypeid']")
	private WebElement pmselectplantype;

	public WebElement getPmselectplantype() {
		return pmselectplantype;
	}

	@FindBy(xpath = "//a[@id='premium_chart']")
	private WebElement pmeditPremiumChat;

	@FindBy(xpath = "//a[@id='hh_structure']")
	private WebElement pmeditStructureCoverage;

	@FindBy(xpath = "//select[@id='state_id']")
	private WebElement pmeditStateSelect;

	@FindBy(xpath = "//input[@class='form-control numericallow gst_presentage']")
	private WebElement pmeditPremiumGST;

	@FindBy(xpath = "//input[@placeholder='Terrorism Premium']")
	private WebElement pmeditTerrorismPremium;

	@FindBy(xpath = "//label[normalize-space()='Calculate Terrorism Premium']")
	private WebElement pmeditCalculateTerrorismPremium;

	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement pmeditStructureTitle;

	@FindBy(xpath = "//input[@placeholder='Description']")
	private WebElement pmeditStructureDescription;

	@FindBy(xpath = "//input[@class='form-control decimalallow coverage_plan']")
	private WebElement pmeditStructureValue;

	@FindBy(xpath = "//*[@id=\"premiumchart_save\"]")
	private WebElement pmeditpremiumchatsavebtn;

	@FindBy(xpath = "//*[@id=\"hhcoverage_save\"]")
	private WebElement pmeditStructureCoveragesavebtn;

	@FindBy(xpath = "(//input[@placeholder='Title'])[2]")
	private WebElement pmeditContenttitle;

	@FindBy(xpath = "(//input[@placeholder='Description'])[2]")
	private WebElement pmeditContentDescription;

	@FindBy(xpath = "(//input[@placeholder='Value'])[3]")
	private WebElement pmeditContentValue;

	@FindBy(xpath = "//b[normalize-space()='House Holder Structure and Coverages']")
	private WebElement pmeditHouseHolderStructureandCoveragesArrowbtn;

	public WebElement getPmeditHouseHolderStructureandCoveragesArrowbtn() {
		return pmeditHouseHolderStructureandCoveragesArrowbtn;
	}

	public WebElement getPmeditContenttitle() {
		return pmeditContenttitle;
	}

	public WebElement getPmeditContentDescription() {
		return pmeditContentDescription;
	}

	public WebElement getPmeditContentValue() {
		return pmeditContentValue;
	}

	public WebElement getPmeditpremiumchatsavebtn() {
		return pmeditpremiumchatsavebtn;
	}

	public WebElement getPmeditStructureCoveragesavebtn() {
		return pmeditStructureCoveragesavebtn;
	}

	public WebElement getPmeditStructureTitle() {
		return pmeditStructureTitle;
	}

	public WebElement getPmeditStructureDescription() {
		return pmeditStructureDescription;
	}

	public WebElement getPmeditStructureValue() {
		return pmeditStructureValue;
	}

	public WebElement getPmeditPremiumChat() {
		return pmeditPremiumChat;
	}

	public WebElement getPmeditStructureCoverage() {
		return pmeditStructureCoverage;
	}

	public WebElement getPmeditStateSelect() {
		return pmeditStateSelect;
	}

	public WebElement getPmeditPremiumGST() {
		return pmeditPremiumGST;
	}

	public WebElement getPmeditTerrorismPremium() {
		return pmeditTerrorismPremium;
	}

	public WebElement getPmeditCalculateTerrorismPremium() {
		return pmeditCalculateTerrorismPremium;
	}

	@FindBy(xpath = "//select[@id='premiumcaltypeid']")
	private WebElement pmpremiumcaltype;

	public WebElement getPmpremiumcaltype() {
		return pmpremiumcaltype;
	}

	// -----------------------shopkeeper

	@FindBy(xpath = "//select[@id='premiumcaltypeid']")
	private WebElement premiumcaltypeid;

	@FindBy(xpath = "//a[@class='btn btn-success btn-xs']")
	private WebElement Edit_plan;

	public WebElement getEdit_plan() {
		return Edit_plan;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Premium %']")
	private WebElement premium_chart;

	@FindBy(xpath = "//button[@id='premiumchart_save']")
	private WebElement premiumchart_save;

	public WebElement getPremiumchart_save() {
		return premiumchart_save;
	}

	public WebElement getPremium_chart() {
		return premium_chart;
	}

	@FindBy(xpath = "//input[@class='form-control decimalallow coverage_plan']")
	private WebElement Pmedit_Value;

	public WebElement getPmedit_Value() {
		return Pmedit_Value;
	}

	@FindBy(xpath = "//button[@id='hhcoverage_save']")
	private WebElement hhcoverage_save;

	public WebElement getHhcoverage_save() {
		return hhcoverage_save;
	}

	@FindBy(xpath = "//select[@id='plantypeid']")
	private WebElement plantypeid;

	public WebElement getPlantypeid() {
		return plantypeid;
	}

	public WebElement getPremiumcaltypeid() {
		return premiumcaltypeid;
	}

	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement Structurecoveragetitle;

	@FindBy(xpath = "//input[@placeholder='Description']")
	private WebElement Structurecoveragedescription;

	@FindBy(xpath = "//input[@class='form-control decimalallow coverage_plan']")
	private WebElement StructureValue;

	@FindBy(xpath = "//button[@id='hhcoverage_save']")
	private WebElement Structurecoveragessave;

	public WebElement getStructurecoveragetitle() {
		return Structurecoveragetitle;
	}

	public WebElement getStructurecoveragedescription() {
		return Structurecoveragedescription;
	}

	public WebElement getStructureValue() {
		return StructureValue;
	}

	public WebElement getStructurecoveragessave() {
		return Structurecoveragessave;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Premium %']")
	private WebElement premiumvalue;

	public WebElement getpremiumvalue() {
		return premiumvalue;
	}

	@FindBy(xpath = "//button[@id='premiumchart_save']")
	private WebElement Premiumchartsave;

	public WebElement getPremiumchartsave() {
		return Premiumchartsave;
	}

	@FindBy(xpath = "//select[@id='plantypeid']")
	private WebElement selectplantype;

	public WebElement getselectplantype() {
		return selectplantype;
	}

	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement uploadcoinumbers;

	public WebElement getuploadcoinumbers() {
		return uploadcoinumbers;
	}

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement coiuploadbackbutton;

	public WebElement getcoiuploadbackbutton() {
		return coiuploadbackbutton;
	}

	// -----------------------------Questinnaire-------------------------
	@FindBy(xpath = "//button[@id='btnaddquestionnairerow']")
	private WebElement Questinnaire_add_btn;
	@FindBy(xpath = "//a[@id='questinnaire_tab']")
	private WebElement Questinnaire;

	@FindBy(xpath = "//textarea[@class='questionnaire_value']")
	private WebElement Questinnaire_value;
	@FindBy(xpath = "//td[@class='answervalue']//div[@class='icheckbox_square-green']")
	private WebElement Questinnaire_AnsValue;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement Questinnaire_remove;

	@FindBy(xpath = "//button[@id='btnaddquestionnairerow_covid']")
	private WebElement Questinnaire_covid_addbtn;
	@FindBy(xpath = "//textarea[@class='covidquestionnaire_value']")
	private WebElement Questinnaire_covid_inputbox;
	@FindBy(xpath = "//td[contains(@class,'covidanswervalue')]//div[contains(@class,'icheckbox_square-green')]")
	private WebElement Questinnaire_covid_ansValue;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[8]/div[1]/div[1]/div[2]/div[1]/table[2]/tbody[1]/tr[1]/td[4]/button[1]")
	private WebElement Questinnaire_covid_removebtn;
	@FindBy(xpath = "//button[contains(@onclick,'return addrows();')]")
	private WebElement AddRows;
	@FindBy(xpath = "//input[@class='form-control numericallow permium_value min_age']")
	private WebElement MedicalCard_minAge;
	@FindBy(xpath = "//input[@class='form-control numericallow permium_value max_age']")
	private WebElement MedicalCard_maxAge;

	@FindBy(xpath = "//input[@class='form-control numericallow permium_value min_suminsured']")
	private WebElement MedicalCard_min_sumInsured;
	@FindBy(xpath = "//input[@class='form-control numericallow permium_value max_suminsured']")
	private WebElement MedicalCard_max_sumInsured;
	@FindBy(xpath = "//input[@class='form-control medicaltests alphanumericwithslash']")
	private WebElement MedicalCard_Test;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[8]/div[1]/div[2]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement MedicalCard_checkboxOne;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[8]/div[1]/div[2]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement MedicalCard_checkboxTwo;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[8]/div[1]/div[2]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement MedicalCard_checkboxThree;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[8]/div[1]/div[2]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/div[1]/label[1]/div[1]")
	private WebElement MedicalCard_checkboxFour;

	public WebElement getQuestinnaire_add_btn() {
		return Questinnaire_add_btn;
	}

	public WebElement getQuestinnaire() {
		return Questinnaire;
	}

	public WebElement getQuestinnaire_value() {
		return Questinnaire_value;
	}

	public WebElement getQuestinnaire_AnsValue() {
		return Questinnaire_AnsValue;
	}

	public WebElement getQuestinnaire_remove() {
		return Questinnaire_remove;
	}

	public WebElement getQuestinnaire_covid_addbtn() {
		return Questinnaire_covid_addbtn;
	}

	public WebElement getQuestinnaire_covid_inputbox() {
		return Questinnaire_covid_inputbox;
	}

	public WebElement getQuestinnaire_covid_ansValue() {
		return Questinnaire_covid_ansValue;
	}

	public WebElement getQuestinnaire_covid_removebtn() {
		return Questinnaire_covid_removebtn;
	}

	public WebElement getAddRows() {
		return AddRows;
	}

	public WebElement getMedicalCard_minAge() {
		return MedicalCard_minAge;
	}

	public WebElement getMedicalCard_maxAge() {
		return MedicalCard_maxAge;
	}

	public WebElement getMedicalCard_min_sumInsured() {
		return MedicalCard_min_sumInsured;
	}

	public WebElement getMedicalCard_max_sumInsured() {
		return MedicalCard_max_sumInsured;
	}

	public WebElement getMedicalCard_Test() {
		return MedicalCard_Test;
	}

	public WebElement getMedicalCard_checkboxOne() {
		return MedicalCard_checkboxOne;
	}

	public WebElement getMedicalCard_checkboxTwo() {
		return MedicalCard_checkboxTwo;
	}

	public WebElement getMedicalCard_checkboxThree() {
		return MedicalCard_checkboxThree;
	}

	public WebElement getMedicalCard_checkboxFour() {
		return MedicalCard_checkboxFour;
	}

	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement Coi_excel;

	public WebElement getCoi_excel() {
		return Coi_excel;
	}

	@FindBy(xpath = "//select[@id='premiumcaltypeid']")
	private WebElement premiumcalculationtype;

	public WebElement getpremiumcalculationtype() {
		return premiumcalculationtype;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Premium']")
	private WebElement premvalue;

	public WebElement getpremvalue() {
		return premvalue;
	}

	@FindBy(xpath = "//div[@class='ibox-title']//a[1]")
	private WebElement NewProductPlan;

	public WebElement getNewProductPlan() {
		return NewProductPlan;
	}

	@FindBy(xpath = "//input[@id='productplan_premiumtho']")
	private WebElement corporate_TenurDays;

	public WebElement getCorporate_TenurDays() {
		return corporate_TenurDays;
	}

	@FindBy(xpath = "//a[@id='tpa-det']")
	private WebElement TPAdetails;
	@FindBy(xpath = "//select[@id='tpa']")
	private WebElement TPA_select;
	@FindBy(xpath = "//input[@placeholder='TPA%']")
	private WebElement TPA_Percantage;
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement TPA_Name;
	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	private WebElement TPA_mobile;
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement TPA_Email;

	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement combo_Filter;

	public WebElement getCombo_Filter() {
		return combo_Filter;
	}

	public WebElement getTPAdetails() {
		return TPAdetails;
	}

	public WebElement getTPA_select() {
		return TPA_select;
	}

	public WebElement getTPA_Percantage() {
		return TPA_Percantage;
	}

	public WebElement getTPA_Name() {
		return TPA_Name;
	}

	public WebElement getTPA_mobile() {
		return TPA_mobile;
	}

	public WebElement getTPA_Email() {
		return TPA_Email;
	}
	
	@FindBy (xpath="//a[normalize-space()='Product Coverage']")
    private WebElement pmproductcoveragertab;
	
	public WebElement getpmproductcoveragertab() {
		return pmproductcoveragertab;
	}
	
	@FindBy (xpath="//button[normalize-space()='COI Numbers']")
    private WebElement productdetailscoinumbers;
	
	public WebElement getproductdetailscoinumbers() {
		return productdetailscoinumbers;
	}
	//...................TPA............................//

	@FindBy (xpath="//select[@id='tpa']")
	private WebElement pmTPAselect;

	@FindBy (xpath="//input[@placeholder='TPA%']")
	private WebElement pmTPAPercentage;

	@FindBy (xpath="//input[@placeholder='Name']")
	private WebElement pmTPAcontactname;

	@FindBy (xpath="//input[@placeholder='Mobile No']")
	private WebElement pmTPAcontactmobile;

	@FindBy (xpath="//input[@placeholder='Email']")
	private WebElement pmTPAcontactemail;

	public WebElement getPmTPAselect() {
		return pmTPAselect;
	}

	public WebElement getPmTPAPercentage() {
		return pmTPAPercentage;
	}

	public WebElement getPmTPAcontactname() {
		return pmTPAcontactname;
	}

	
	@FindBy (xpath="//input[@value='Add']")
    private WebElement Addnew;
	
	public WebElement getAddnew() {
		return Addnew;
	}


	public WebElement getPmTPAcontactmobile() {
		return pmTPAcontactmobile;
	}

	public WebElement getPmTPAcontactemail() {
		return pmTPAcontactemail;
	}

}
