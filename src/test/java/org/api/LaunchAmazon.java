package org.api;

import org.libglobal.BaseClass;
import org.testng.annotations.Test;

public class LaunchAmazon extends BaseClass{
@Test	
private void amazonHomePAge() {
	LaunchChromeBrowser();
	maximizeWindow();
	openAppUrl("https://www.amazon.in");

}

}
