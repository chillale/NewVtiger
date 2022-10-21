package com.crm.vtiger.testcases;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePageClass;

public class CreateOrganisationTest extends BaseClass {
	@Test(groups = "regression")
	public void createOrganisationTest() {
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.orgB();

		driver.findElement(By.linkText("Testyantra")).click();
		String data = driver.findElement(By.xpath("//span[text()='[ ACC1 ] Testyantra -  Organization Information']")).getText();
		String data1 = "Testyantra";
		String[] arr = data.split(" ");
		String valu2=arr[3];
		Assert.assertEquals(data1, valu2);
	}

}
