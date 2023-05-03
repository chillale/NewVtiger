package genericUtility;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	ExtentTest test;

	ExtentReports reports;

	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName() + "got passed");
	}

	public void onTestFailure(ITestResult result) {
		String path = null;
		try {
			path = BaseClass.takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(Status.FAIL, result.getMethod().getMethodName() + "got failed");
		test.log(Status.FAIL, result.getThrowable());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./ExtentReports/VtigerApp.html");
		extentSparkReporter.config().setDocumentTitle("V-tiger");
		extentSparkReporter.config().setTheme(Theme.DARK);

		reports = new ExtentReports();
		reports.attachReporter(extentSparkReporter);

		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Build", "10.3.6");
		reports.setSystemInfo("Reporter Name", "Rajesh");
		reports.setSystemInfo("Env", "Developer");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"got skipped");

	}

}
