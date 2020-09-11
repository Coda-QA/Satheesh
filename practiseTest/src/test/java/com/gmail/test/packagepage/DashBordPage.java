package com.gmail.test.packagepage;

import net.thucydides.core.annotations.Step;

public class DashBordPage {
	GuviDashBoardPage dashboard;

	@Step
	public void VerifyAdminLogin(){
		dashboard.loginverfied();
		
	}
}
