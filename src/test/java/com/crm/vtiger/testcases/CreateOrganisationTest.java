package com.crm.vtiger.testcases;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePageClass;

public class CreateOrganisationTest extends BaseClass {
	@Test
	public void createOrganisationTest() {
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.orgB();

		driver.findElement(By.linkText("Testyantra")).click();
		String data = driver.findElement(By.xpath("//span[text()='[ ACC1 ] Testyantra -  Organization Information']")).getText();
		String data1 = "Testyantra";
		String[] arr = data.split(" ");
		String value = arr[0];
		String value1 = arr[1];
		String value2 = arr[2];
		String valu2=arr[3];
		String value3 = arr[4];
		String value5= arr[5];
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value5);
		Assert.assertEquals(data1, valu2);
	}

}
