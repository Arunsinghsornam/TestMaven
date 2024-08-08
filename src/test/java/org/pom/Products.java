package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Products extends BaseClass {
	@FindBy (id="product_name")
	private WebElement pmProductName;
	
	@FindBy (id="product_des")
	private WebElement pmInsuranceProductName;
	
	@FindBy (id="pro_biz_type")
	private WebElement pmBusinessType;
	
	@FindBy (id="pro_biz_line_type")
	private WebElement pmBusinessLineType;
	
    @FindBy	(id="segmentid")
    private WebElement pmProductSegment;
    
    @FindBy (id="subsegmentid")
    private WebElement pmProductSubSegment;
	
    @FindBy (id="orgid")
    private WebElement pmOrganizationName;
    
    @FindBy (id="companyid")
    private WebElement pmInsuranceCompanyName;
	
    @FindBy (id="masterpolicynumber")
    private WebElement pmMasterPolicynumber;
    
    @FindBy (id="product_uinumber")
    private WebElement pmProductUIN;
    
    @FindBy (id="saletypeid")
    private WebElement pmProductSaleType;
    
    @FindBy (id="wallettypeid")
    private WebElement pmWalletType;
    
    @FindBy (id="masterpolicy_datetime")
    private WebElement pmMasterPolicyDatetime;
    
    @FindBy (id="masterpolicy_end_datetime")
    private WebElement pmMasterPolicyEndDatetime;
    
    @FindBy (id="loantypeid")
    private WebElement pmProductLoanType;
    
    @FindBy (id="min_suminsured")
    private WebElement pmMinimumSumInsured;
    
    @FindBy (id="max_suminsured")
    private WebElement pmMaximumSumInsured;
    
    @FindBy (id="salesPerson_Name")
    private WebElement pmSalesPersonName;
    
    @FindBy (id="salesPerson_Email")
    private WebElement pmSalesPersonEmail;
    
    @FindBy(id="paymenttype")
    private WebElement pmPaymentType;
    
    @FindBy (id="isreceipt_product")
    private WebElement pmEnableReciept;
    
    @FindBy (id="ismail_product")
    private WebElement pmEnableEmail;
    
    @FindBy (id="ismemberform_product")
    private WebElement pmMemberform;
    
    @FindBy (id="issuperadmin_product")
    private WebElement pmSuperadminBulkupload;
    
    @FindBy (id="isdgh_product")
    private WebElement pmDGHquestion;
    
    @FindBy (id="ismedicalgrid")
    private WebElement pmMedicalgrid;
    
    @FindBy (id="ispremium_decimal")
    private WebElement pmPremiumdecimalvalue;
    
    @FindBy (id="isfeature_product")
    private WebElement pmAddonfeature;
    
    @FindBy (id="isService_product")
    private WebElement pmServicebasedproduct;
    
    @FindBy (id="isLoanLinked_product")
    private WebElement pmProductLoanLinked;
    
    @FindBy (id="isCOI_create")
    private WebElement pmCOI;
    
    @FindBy (id="IsRedirect")
    private WebElement pmRedirectInsuranceportal;
    
    @FindBy (id="product_image")
    private WebElement pmProductImage;
	
    @FindBy (id="master_policy_doc")
    private WebElement pmMasterDocumentUpload;
    
    @FindBy (id="coi_terms_conditions_doc")
    private WebElement pmCOITermsDoc;
    
    @FindBy (id="quotation_doc")
    private WebElement pmQuatation;


	@FindBy (id="IsShowToOrganization") 
    private WebElement pmShowOrganization;
    
    @FindBy (id="urlpath")
    private WebElement pmRedirectURLpath;
    
    //----------------------------------------------------------------------------------------------

    @FindBy (xpath="//*[@id=\"suminsured-list\"]/tbody/tr/td[2]/textarea")
    private WebElement pmSuminsured;
    
    @FindBy (xpath="//*[@id=\"suminsured-list\"]/tbody/tr/td[8]/button")
    private WebElement pmAddSuminsured;
    
    @FindBy (xpath="//*[@id=\"suminsured-list\"]/tbody/tr/td[5]/select")
    private WebElement pmSegment;
    
    @FindBy (xpath="//*[@id=\"suminsured-list\"]/tbody/tr/td[6]/input")
    private WebElement pmSuminsuredValue; 
    
    @FindBy (xpath="//*[@id=\"suminsured-list\"]/tbody/tr/td[7]/button")
    private WebElement pmRemovesuminsured;
     
    @FindBy (xpath ="//*[@id=\"tab-5\"]/div/div/div[1]/div/button")
    private WebElement pmAddnewsuminsured;
    
    
 //--------------------------------product claim  document-------------------------------------------------------------
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmClaimform;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmPartB; 
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmDischargesummary;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmCasepaper;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmDrugchart;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmTemperaturechart;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmFinalbill;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmpaymentreciepts;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmCovid;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmReferralLetter;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmReferralLetterTreating;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmPhotoIdProposer;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmPhotoDependant;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmCancelledcheque;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmClaimIntimationForm;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmDeathCertificate;
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmMemberForm;    
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmAgeProof; 
    
    @FindBy (xpath="//div[@class='icheckbox_square-green hover']//ins[@class='iCheck-helper']")
    private WebElement pmNomineeKYC;
    
    
   //---------------------------Browse----------------------------------
    
    @FindBy (xpath="//tbody/tr[1]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseClaimform;
    
    @FindBy (xpath="//tbody/tr[2]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowsePartB;
    
    @FindBy (xpath="//tbody/tr[3]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseDischarge;
    
    @FindBy (xpath="//tbody/tr[4]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseIndoorcase;
    
    @FindBy (xpath="//tbody/tr[5]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseDrugAdminstration;
    
    @FindBy (xpath="//tbody/tr[6]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseTemperaturechart;
    
    @FindBy (xpath="//tbody/tr[7]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseFinalBill;
    
    @FindBy (xpath="//tbody/tr[8]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowsePaymentreciept;
    
    @FindBy (xpath="//tbody/tr[9]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseCovid19;
    
    @FindBy (xpath="//tbody/tr[10]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseReferralLetter;
    
    @FindBy (xpath="//tbody/tr[11]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseReferralTreatdoctor;
    
    @FindBy (xpath="//tbody/tr[12]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowsePhotoIdcardProposer;
    
    @FindBy (xpath="//tbody/tr[13]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowsePhotoIdcard;
    
    @FindBy (xpath="//tbody/tr[14]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseCancelledcheq;
    
    @FindBy (xpath="//tbody/tr[15]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseClaimintimationform;
    
    @FindBy (xpath="//tbody/tr[16]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseDeathCertificate;
    
    @FindBy (xpath="//tbody/tr[17]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseMemberform;
    
    @FindBy (xpath="//tbody/tr[18]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseAgeProof;
    
    @FindBy (xpath="//tbody/tr[19]/td[6]/div[1]/div[1]/span[1]/span[1][1]/input[1]")
    private WebElement pmBrowseNomineeKyc;
    
    public Products() {
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

	public WebElement getPmPaymentType() {
		return pmPaymentType;
	}

	public WebElement getPmEnableReciept() {
		return pmEnableReciept;
	}

	public WebElement getPmEnableEmail() {
		return pmEnableEmail;
	}

	public WebElement getPmMemberform() {
		return pmMemberform;
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

	public WebElement getPmShowOrganization() {
		return pmShowOrganization;
	}

	public WebElement getPmRedirectURLpath() {
		return pmRedirectURLpath;
	}

	public WebElement getPmSuminsured() {
		return pmSuminsured;
	}

	public WebElement getPmAddSuminsured() {
		return pmAddSuminsured;
	}

	public WebElement getPmSegment() {
		return pmSegment;
	}

	public WebElement getPmSuminsuredValue() {
		return pmSuminsuredValue;
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
    
} 


