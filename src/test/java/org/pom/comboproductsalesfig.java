package org.pom;
import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class comboproductsalesfig extends BaseClass {

	@FindBy(xpath = "//body/div[@id='wrapper']/nav[@role='navigation']/div[@class='sidebar-collapse']/ul[@id='side-menu']/li[3]/a[1]")
	private WebElement Salesmenuitem;
	
	@FindBy(xpath = "//a[normalize-space()='Product Segments']")
	private WebElement ProductSegmentsmenuitem;
	
	@FindBy(xpath = "//div[@class='tile-stats pro_tile_15']")
	private WebElement ProductSegmentComboproduct;
	
	@FindBy(xpath = "//div[@class='tile-stats pro_tile_002G']")
	private WebElement ProductSegmentGroup;
	
	@FindBy(xpath = "//div[@id='page-wrapper']//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")
	private WebElement Productviewplans;
	
	@FindBy(xpath = "//a[normalize-space()='Bulk Upload']")
	private WebElement Bulkupload;
	
	@FindBy(xpath = "//input[@id='excelfile']")
	private WebElement browsecomboexcel;

	public WebElement getSalesmenuitem() {
		return Salesmenuitem;
	}

	public WebElement getProductSegmentsmenuitem() {
		return ProductSegmentsmenuitem;
	}

	public WebElement getProductSegmentComboproduct() {
		return ProductSegmentComboproduct;
	}

	public WebElement getProductSegmentGroup() {
		return ProductSegmentGroup;
	}

	public WebElement getProductviewplans() {
		return Productviewplans;
	}

	public WebElement getBulkupload() {
		return Bulkupload;
	}

	public WebElement getBrowsecomboexcel() {
		return browsecomboexcel;
	}
	
	
	
}
