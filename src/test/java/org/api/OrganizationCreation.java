package org.api;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.libglobal.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.pom.OrganizationManagement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrganizationCreation  extends BaseClass{
	static String url1 = "https://test.miwisa.in";
	static String orgName = "";
	static String orgKey = "";
	static String idOrg = "";
	static String zoneId = "";
	static String regionId = "";
	static String branchId = "";
	static String empcode = "";
	static String empId = "";
	
	
	@Test
	private void superAdminlogIn() throws InterruptedException {
		LaunchChromeBrowser();
		maximizeWindow();
		elementWait();
		openAppUrl("https://test.miwisa.in/Security/AdminLogin");
		long startTime = System.currentTimeMillis();
		LoginPage lp = new LoginPage();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lp.getUserName().sendKeys("Testsuperadmin@micronsure.com");
		lp.getUserPassWord().sendKeys("Testadmin2@23");
		lp.getLogInButton().click();
		Thread.sleep(5000);
		WebElement okButton = driver.findElement(By.xpath("//button[normalize-space()='Ok']"));
		okButton.click();
		Thread.sleep(5000);
	}
 
	@Test(dependsOnMethods="superAdminlogIn")
	private void organizationCreation() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		for (int i = 0; i < 1; i++) {
			OrganizationManagement or = new OrganizationManagement();
			or.getOrgManagement().click();
			Thread.sleep(1000);
			or.getOrganizations().click();
			Thread.sleep(1000);
			or.getAddUser().click();
			Thread.sleep(1000);
			selectByIndex(or.getSelectBusinessType(), 3);
			orgName = "Test" + new Random().nextInt(10000);
			orgKey = "Test" + new Random().nextLong(1000);
			String site = "www.test.com";
			String Email = "test@gmail.com";
			String mobile = "8309335460";
			String desc = "Test Describtion--" + new Random().nextLong(1000);
			String Address = "Test Address--" + new Random().nextLong(1000);
			String AlterEmail = "test@gmail.com,test01@gmail.com";
			String pincode = "506" + new Random().nextLong(1000);
			String logo = "C:\\Users\\ArunSingh\\Downloads\\download.jpg";
			or.getOrganizationName().sendKeys(orgName);
			or.getOrganizationKey().sendKeys(orgKey);
			or.getOrganizationLink().sendKeys(site);
			or.getOrganizationEmail().sendKeys(Email);
			or.getOrganizationNumber().sendKeys(mobile);
			or.getOrganizationDescription().sendKeys(desc);
			or.getOrganizationAddress().sendKeys(Address);
			or.getAlternateEmail().sendKeys(AlterEmail);
			or.getPincode().sendKeys("506303");
			or.getMultiBranchRadioButton().click();
			or.getLogo().sendKeys(logo);
 
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", or.getSaveButton());
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", or.getOrg_conformbutton());
			//screenShot();
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", or.getOrg_conform_emailsend());
 
			try {
				Connection con = DriverManager.getConnection(
						"jdbc:sqlserver://miwisadb-2.cxebotchjdqu.ap-south-1.rds.amazonaws.com:1433;database=micronsure_test;user=MNsure_Test_Read;password=R3ad#2022!@Test;encrypt=true;trustServerCertificate=true;loginTimeout=30;");
				Statement stmt = con.createStatement();
				String s = "SELECT top 1 * FROM ORGANIZATIONS order by id  desc;";
				String s1 = "select * from Organizations where OrganizationKey ='" + orgKey + "'";
				System.out.println("Org Key " + orgKey);
				ResultSet rs = stmt.executeQuery(s1);
				int count = 0;
				while (rs.next()) {
					count++;
					int orgID = rs.getInt("Id");
					System.out.println("Org Name " + orgName);
					idOrg = String.valueOf(orgID);
					System.out.println("Organization Creation Sucessfully And OrganizationId is  " + idOrg);
				}
				con.close();
			} catch (SQLException e) {
				System.out.println("oops there is a error");
				e.printStackTrace();
			}
		}
	}
 
	// =====================Zone===================================
	@Test(dependsOnMethods="organizationCreation")
	private void zoneCreation() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OrganizationManagement or = new OrganizationManagement();
		Thread.sleep(2000);
		String zoneName = "Test-SouthZone" + new Random().nextLong(1000);
		String description1 = "Test-description1" + new Random().nextLong(1000);
		String contactName = "Test-contactName" + new Random().nextLong(1000);
		String contactNumber = "8309335460";
		String contactEmail = "test@gmail.com";
		String zoneCode = "Test-ZoneCode" + new Random().nextLong();
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", or.getAddNewZone());
		Thread.sleep(2000);
		or.getZoneName().sendKeys(zoneName);
		Thread.sleep(2000);
		or.getZoneDescribtion().sendKeys(description1);
		Thread.sleep(2000);
		or.getZoneCode().sendKeys(zoneCode);
		Thread.sleep(2000);
		or.getZoneContactName().sendKeys(contactName);
		Thread.sleep(2000);
		or.getZoneContactEmail().sendKeys(contactEmail);
		Thread.sleep(2000);
		or.getZoneContactNumber().sendKeys(contactNumber);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", or.getOrg_zoneSave());
		Thread.sleep(8000);
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://miwisadb-2.cxebotchjdqu.ap-south-1.rds.amazonaws.com:1433;database=micronsure_test;user=MNsure_Test_Read;password=R3ad#2022!@Test;encrypt=true;trustServerCertificate=true;loginTimeout=30;");
			Statement stmt = con.createStatement();
			String s = "SELECT top 1 *FROM Zones WHERE ORGANIZATIONID='" + idOrg + "' ORDER BY ID DESC";
			ResultSet rs = stmt.executeQuery(s);
			int count = 0;
			while (rs.next()) {
				count++;
				int idZone = rs.getInt("Id");
				zoneId = String.valueOf(idZone);
				System.out.println("Zone Created sucessfully and the Zone id is = " + zoneId);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("oops there is a error");
			e.printStackTrace();
		}
	}
 
//============== region ================================================
	@Test(dependsOnMethods="zoneCreation")
	private void regionCreation() throws Throwable {
 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OrganizationManagement or = new OrganizationManagement();
 
		Thread.sleep(2000);
		String regionName = "Test-SouthZone" + new Random().nextLong(1000);
		String regiondescription = "Test-description1" + new Random().nextLong(1000);
		String regioncontactName = "Test-contactName" + new Random().nextLong(1000);
		String regioncontactNumber = "8309335460";
		String regioncontactEmail = "test@gmail.com";
		String regionCode = "Test-regionCode" + new Random().nextLong();
		Thread.sleep(2000);
		Thread.sleep(3000);
		Assert.assertTrue(or.getOrg_AddNewRegion().isEnabled());
		js.executeScript("arguments[0].click();", or.getOrg_AddNewRegion());
		Thread.sleep(3000);
		or.getOrg_regionname().sendKeys(regionName);
		Thread.sleep(3000);
		or.getRegionDes().sendKeys(regiondescription);
		or.getOrg_regioncode().sendKeys(regionCode);
		Thread.sleep(3000);
		selectByIndex(or.getOrg_regionzonedropdown(), 1);
		Thread.sleep(3000);
		or.getOrg_regioncontactName().sendKeys(regioncontactName);
		Thread.sleep(3000);
		or.getRegionContactNumber().sendKeys(regioncontactNumber);
		Thread.sleep(3000);
		or.getRegionContactEmail().sendKeys(regioncontactEmail);
		Thread.sleep(2000);
		or.getOrg_regionsave().click();
		Thread.sleep(5000);
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://miwisadb-2.cxebotchjdqu.ap-south-1.rds.amazonaws.com:1433;database=micronsure_test;user=MNsure_Test_Read;password=R3ad#2022!@Test;encrypt=true;trustServerCertificate=true;loginTimeout=30;");
			Statement stmt = con.createStatement();
			String s = "select top 1 * from Regions where ZoneId='" + zoneId + "'ORDER BY ID DESC";
 
			ResultSet rs = stmt.executeQuery(s);
			int count = 0;
			while (rs.next()) {
				count++;
				int idRegion = rs.getInt("Id");
				regionId = String.valueOf(idRegion);
				System.out.println("Region Created sucessfully and the Region id is = " + regionId);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("oops there is a error");
			e.printStackTrace();
		}
	}
 
//==================Branch==========================
	@Test(dependsOnMethods = "regionCreation")
	
	private void branchCreation() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OrganizationManagement or = new OrganizationManagement();
 
		Thread.sleep(2000);
		or.getOrgManagement().click();
		Thread.sleep(2000);
		or.getBranches().click();
		Thread.sleep(2000);
		or.getAddNewBranch().click();
 
		Thread.sleep(2000);
		String branchName = "Test-Southbranch" + new Random().nextLong(1000);
		String branchcontactName = "Test-contactName" + new Random().nextLong(1000);
		String branchcontactNumber = "8309335460";
		String branchcontactEmail = "test@gmail.com";
		String branchCode = "Test-branchCode" + new Random().nextLong();
		String branchpincode = "506" + new Random().nextLong(1000);
		String branchAddress = "Test Address--" + new Random().nextLong(1000);
 
		Thread.sleep(3000);
		or.getBranchName().sendKeys(branchName);
 
		Thread.sleep(3000);
		or.getBranchCode().sendKeys(branchCode);
 
		Thread.sleep(3000);
		selectByVisibleText(or.getBranchSelectOrg(), orgName);
 
		Thread.sleep(3000);
		selectByIndex(or.getBranchSelectZone(), 1);
 
		Thread.sleep(3000);
		selectByIndex(or.getBranchSelectRegion(), 1);
 
		Thread.sleep(3000);
		or.getBranchConName().sendKeys(branchcontactName);
 
		Thread.sleep(3000);
		or.getBranchConNum().sendKeys(branchcontactNumber);
 
		Thread.sleep(3000);
		or.getBranchConEmail().sendKeys(branchcontactEmail);
 
		Thread.sleep(3000);
		or.getBranchPincode().sendKeys(branchpincode);
 
		Thread.sleep(3000);
		or.getBranchAddress().sendKeys(branchAddress);
		Thread.sleep(3000);
		or.getBranchSaveButton().click();
		Thread.sleep(3000);
 
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://miwisadb-2.cxebotchjdqu.ap-south-1.rds.amazonaws.com:1433;database=micronsure_test;user=MNsure_Test_Read;password=R3ad#2022!@Test;encrypt=true;trustServerCertificate=true;loginTimeout=30;");
			Statement stmt = con.createStatement();
			String s = "select * from branches where regionid='" + regionId + "'";
			ResultSet rs = stmt.executeQuery(s);
			int count = 0;
			while (rs.next()) {
				count++;
				int idBranch = rs.getInt("Id");
				branchId = String.valueOf(idBranch);
				System.out.println(
						"============================Branch Created sucessfully and the Branch id is = " + branchId);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("oops there is a error");
			e.printStackTrace();
		}
 
		Thread.sleep(4000);
	}
 
//======================Employee=================
	@Test(dependsOnMethods = "branchCreation")
	private void employeeCreation() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		OrganizationManagement or = new OrganizationManagement();
 
		or.getOrgManagement().click();
		Thread.sleep(4000);
		or.getEmployees().click();
		Thread.sleep(4000);
		or.getAddNewEmployees().click();
 
		String empFirstName = "Test-firstName" + new Random().nextLong(1000);
		String empLastName = "Test-lastName" + new Random().nextLong(1000);
		String empMobile = "8309335460";
		String empEmail = "test@gmail.com";
		empcode = "Test" + new Random().nextInt();
 
		or.getEmployeeCode().sendKeys(empcode);
		Thread.sleep(3000);
		or.getEmployeeFirstName().sendKeys(empFirstName);
		Thread.sleep(3000);
		or.getEmployeeLastName().sendKeys(empLastName);
		Thread.sleep(3000);
		or.getEmployeeMobNum().sendKeys(empMobile);
		Thread.sleep(3000);
		or.getEmployeeEmail().sendKeys(empEmail);
		Thread.sleep(3000);
 
		WebElement employe = driver.findElement(By.xpath("//select[@id='emp_orgid']"));
		selectByVisibleText(employe, orgName);
		Thread.sleep(5000);
 
		WebElement employee1 = driver.findElement(By.xpath("//select[@id='emp_branchid']"));
		selectByIndex(employee1, 1);
		Thread.sleep(3000);
 
		WebElement employe11 = driver.findElement(By.xpath("//select[@id='emp_role_id']"));
		selectByVisibleText(employe11, "Head Office Staff");
		Thread.sleep(3000);
 
		WebElement employe2 = driver.findElement(By.xpath("//select[@id='emp_reporting_to']"));
		selectByIndex(employe2, 1);
		Thread.sleep(2000);
		or.getEmployeeSaveButton().click();
		Thread.sleep(5000);
 
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://miwisadb-2.cxebotchjdqu.ap-south-1.rds.amazonaws.com:1433;database=micronsure_test;user=MNsure_Test_Read;password=R3ad#2022!@Test;encrypt=true;trustServerCertificate=true;loginTimeout=30;");
			Statement stmt = con.createStatement();
			String s = "SELECT top 1 *FROM Employees WHERE ORGANIZATIONID='" + idOrg + "' ORDER BY ID DESC";
			ResultSet rs = stmt.executeQuery(s);
			int count = 0;
			while (rs.next()) {
				count++;
				int idZone = rs.getInt("Id");
				empId = String.valueOf(idZone);
				System.out.println(
						"=================================Employee Created sucessfully and the Employee id is = "
								+ empId);
			}
			con.close();
		} catch (SQLException e1) {
			System.out.println("oops there is a error");
			e1.printStackTrace();
		}
		driver.quit();
	}

}
