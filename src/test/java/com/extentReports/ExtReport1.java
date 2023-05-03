package com.extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtReport1 {
	ExtentSparkReporter extentSparkReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	@Test
	public void extReport() {
		extentSparkReporter = new ExtentSparkReporter("./ExtentReport/ExReport.html");
		extentSparkReporter.config().setDocumentTitle("Vamsi");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		
		extentReports.setSystemInfo("Browser", "firefox");
		extentReports.setSystemInfo("Build", "5.44.5");
		extentReports.setSystemInfo("Reporter Name", "Vamsi");
		extentReports.setSystemInfo("Environment", "Developing");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
	    extentTest=extentReports.createTest("Vamsi Facebook");
	    extentReports.flush();
		
		
		
	}

}
