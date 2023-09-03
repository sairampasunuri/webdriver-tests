package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.LoginPage;

public class TC003_JustLoginsainewbranch extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Login";
		testDescription ="Login to sainewbrach Leaftaps";
		authors="Sairam new branch";
		category ="DevOps branch sainew branch";
		excelFileName="Login Second";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin();

	}

}
