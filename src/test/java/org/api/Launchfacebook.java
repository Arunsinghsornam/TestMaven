package org.api;

import org.libglobal.BaseClass;
import org.testng.annotations.Test;

public class Launchfacebook extends BaseClass {
	
	@Test
	private void facebookLoginPage() {
		
		LaunchChromeBrowser();
		maximizeWindow();
		openAppUrl("https://www.facebook.com/login/");
	}

}
