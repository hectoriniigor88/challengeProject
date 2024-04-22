package tests;


import org.testng.annotations.Test;

import config.WebDriverSetup;
import pages.MainPage;

public class TestCases extends WebDriverSetup {
	
	
	 @Test
     public void searchGithubAccount() {
       MainPage mainPage = new MainPage(driver); 
       mainPage.searchGithubAccount("Hector");
       mainPage.clickFirstRepo();
       mainPage.clickSecondRepo();
       mainPage.clickThirdRepo();
       mainPage.clickFourthRepo();
       mainPage.clickFifthhRepo();
       mainPage.clickSixthRepo();
	 }
       
	 @Test
	 public void verifyElementHeaderIsPresentInMainPage() {
	     MainPage mainPage = new MainPage(driver);
		 mainPage.validateHeaderElement(); 
	 }

}

