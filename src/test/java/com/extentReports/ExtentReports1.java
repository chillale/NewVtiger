package com.extentReports;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports1 {
	ExtentSparkReporter reporter;
	com.aventstack.extentreports.ExtentReports reports;
	ExtentTest test;

	@Test
	public void createReport() throws Throwable {
		// setting the path and setting the document title and colour
		reporter = new ExtentSparkReporter("./ExtentReports/Sdet11.html");
		reporter.config().setDocumentTitle("Facebook");
		reporter.config().setTheme(Theme.DARK);

		reports = new com.aventstack.extentreports.ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("Browser", "firefox");
		reports.setSystemInfo("Build", "10.3.2");
		reports.setSystemInfo("Reporter Name", "Sravan chillale");
		reports.setSystemInfo("Env", "testing");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://Facebook.com");

		test = reports.createTest("Sravan Facebook");
		TakesScreenshot takeScreenshort = (TakesScreenshot) driver;
		File source = takeScreenshort.getScreenshotAs(OutputType.FILE);
		String path = "./Screenshot/Fb.png";
		File destination = new File(path);
		Files.copy(source, destination);
		test.addScreenCaptureFromPath(path);
		Assert.assertEquals(true, true);

	}

	@AfterSuite
	public void as() {
		reports.flush();
	}
}
