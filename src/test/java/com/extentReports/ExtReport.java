package com.extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtReport {
	ExtentSparkReporter extentSparkReporter;
	ExtentReports reports;
	ExtentTest test;
	@Test
	public void extentReport() {
		extentSparkReporter = new ExtentSparkReporter("./ExtentReport/sde1.html");
		extentSparkReporter.config().setDocumentTitle("Satish");
		extentSparkReporter.config().setTheme(Theme.DARK);
		
		reports = new ExtentReports();
		reports.attachReporter(extentSparkReporter);
		
		reports.setSystemInfo("browser", "chrome");
		reports.setSystemInfo("Build", "10.2");
		reports.setSystemInfo("reportername", "satish");
		reports.setSystemInfo("env", "testing");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		test=reports.createTest("Satish Facebook");
		reports.flush();
		
	}
	

}
