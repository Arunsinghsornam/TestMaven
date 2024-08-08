package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class endorsementchecker extends BaseClass{
	//-----------------------------endorsement--------------------
			@FindBy(xpath="//span[normalize-space()='Endorsement']")
			private WebElement endorsement;
		//--------------------pendingList--------------------
			@FindBy(xpath="//a[normalize-space()='Pending List']")
			private WebElement endPendingList;
			
			@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
			private WebElement endPendingListView;
			
			@FindBy(xpath="//input[@aria-label='controlled']")
			private WebElement endPendingListViewCheckBox;
			
			@FindBy(xpath="//button[normalize-space()='Reject']")
			private WebElement endPendingListViewReject;
			
			@FindBy(xpath="//input[@id='filled-required']")
			private WebElement endPendingListViewRejectCommentBox;
			
			@FindBy(xpath="//button[normalize-space()='close']")
			private WebElement endPendingListViewRejectCommentBoxClose;
			
			@FindBy(xpath="//button[normalize-space()='Approve']")
			private WebElement endPendingListViewApproveBox;
			
			@FindBy(xpath="//input[@id='filled-required']")
			private WebElement endPendingListViewApproveCommentBox;
			
			@FindBy(xpath="//button[normalize-space()='close']")
			private WebElement endPendingListViewApproveCommentBoxClose;
			
			@FindBy(xpath="//button[normalize-space()='Back']")
			private WebElement endPendingListBackButton;
			
			@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
			private WebElement endPendingListHistory;
			
			@FindBy (xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
			private WebElement endPendingHistoryView;
			@FindBy(xpath="//button[normalize-space()='Back']")
			private WebElement endPendingHistoryVieBackButton;
			//--------------------Approved List----------------------
			
			@FindBy(xpath="//a[normalize-space()='Approved List']")
			private WebElement endApprovedList;
			
			@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
			private WebElement endApprovedListView;
			
			@FindBy(xpath="//button[normalize-space()='Back']")
			private WebElement endApprovedListViewBackButton;
			
			@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
			private WebElement endApprovedListHistory;
			
			@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
			private WebElement endApprovedListHistoryView;
			
			@FindBy(xpath="//button[normalize-space()='Back']")
			private WebElement endApprovedListHistoryViewBackButton;
			//-------------------------------RejectedList---------------
			
			@FindBy(xpath="//a[normalize-space()='Rejected List']")
			private WebElement endRejectList;
			
			@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
			private WebElement endRejectListView;
			
			@FindBy(xpath="//button[normalize-space()='Back']")
			private WebElement endRejectListBackButton;
			
			@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
			private WebElement endRejectListHistory;
			
			@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
			private WebElement endRejectListHistoryView;
			
			@FindBy(xpath="//button[normalize-space()='Back']")
			private WebElement endRejectListHistoryViewBackButton;
			
			
			


			public WebElement getEndorsement() {
				return endorsement;
			}

			public WebElement getEndPendingList() {
				return endPendingList;
			}

			public WebElement getEndPendingListView() {
				return endPendingListView;
			}

			public WebElement getEndPendingListViewCheckBox() {
				return endPendingListViewCheckBox;
			}

			public WebElement getEndPendingListViewReject() {
				return endPendingListViewReject;
			}

			public WebElement getEndPendingListViewRejectCommentBox() {
				return endPendingListViewRejectCommentBox;
			}

			public WebElement getEndPendingListViewRejectCommentBoxClose() {
				return endPendingListViewRejectCommentBoxClose;
			}

			public WebElement getEndPendingListViewApproveBox() {
				return endPendingListViewApproveBox;
			}

			public WebElement getEndPendingListViewApproveCommentBox() {
				return endPendingListViewApproveCommentBox;
			}

			public WebElement getEndPendingListViewApproveCommentBoxClose() {
				return endPendingListViewApproveCommentBoxClose;
			}

			public WebElement getEndPendingListBackButton() {
				return endPendingListBackButton;
			}

			public WebElement getEndPendingListHistory() {
				return endPendingListHistory;
			}

			public WebElement getEndPendingHistoryView() {
				return endPendingHistoryView;
			}

			public WebElement getEndPendingHistoryVieBackButton() {
				return endPendingHistoryVieBackButton;
			}

			public WebElement getEndApprovedList() {
				return endApprovedList;
			}

			public WebElement getEndApprovedListView() {
				return endApprovedListView;
			}

			public WebElement getEndApprovedListViewBackButton() {
				return endApprovedListViewBackButton;
			}
			public WebElement getEndApprovedListHistory() {
				return endApprovedListHistory;
			}

			public WebElement getEndApprovedListHistoryView() {
				return endApprovedListHistoryView;
			}
			public WebElement getEndApprovedListHistoryViewBackButton() {
				return endApprovedListHistoryViewBackButton;
			}

			public WebElement getEndRejectList() {
				return endRejectList;
			}

			public WebElement getEndRejectListView() {
				return endRejectListView;
			}

			public WebElement getEndRejectListBackButton() {
				return endRejectListBackButton;
			}

			public WebElement getEndRejectListHistory() {
				return endRejectListHistory;
			}

			public WebElement getEndRejectListHistoryView() {
				return endRejectListHistoryView;
			}

			public WebElement getEndRejectListHistoryViewBackButton() {
				return endRejectListHistoryViewBackButton;
			}

			public endorsementchecker() {
				
				PageFactory.initElements(driver,this);

			}
}
