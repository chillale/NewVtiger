package com.extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports {
	ExtentSparkReporter reporter;
	com.aventstack.extentreports.ExtentReports reports;
	ExtentTest test;
	
	@Test
	public void createReport() {
		//setting the path and setting the document title and colour
		reporter = new ExtentSparkReporter("./ExtentReports/Sdet19.html");
		reporter.config().setDocumentTitle("flipkart");
		reporter.config().setTheme(Theme.DARK);
		
		reports = new com.aventstack.extentreports.ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Browser", "firefox");
		reports.setSystemInfo("Build", "10.3.2");
		reports.setSystemInfo("Reporter Name", "Sravan chillale");
		reports.setSystemInfo("Env", "testing");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		test = reports.createTest("Sravan Facebook");
		reports.flush();
		
	}

}
