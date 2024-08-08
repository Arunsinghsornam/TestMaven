package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchSelect extends BaseClass {
	@FindBy (xpath="//select[@id='branchId']")
	private WebElement selectBranch;
 
	public WebElement getSelectBranch() {
		return selectBranch;
	}
	public BranchSelect() {
		PageFactory.initElements(driver, this);
	}

}
