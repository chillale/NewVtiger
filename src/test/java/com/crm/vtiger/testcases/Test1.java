package com.crm.vtiger.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
	}

}
