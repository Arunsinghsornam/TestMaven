package org.api;

import org.libglobal.BaseClass;
import org.testng.annotations.Test;

public class LaunchBrowser extends BaseClass{
	
@Test
private void openBrowser() {
	LaunchChromeBrowser();
	maximizeWindow();
	openAppUrl("https://www.google.co.in/");

}
}
