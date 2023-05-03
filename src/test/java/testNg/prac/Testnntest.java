package testNg.prac;

import org.testng.annotations.Test;

public class Testnntest {
	@Test(priority = -1,groups = "smoke",enabled = false)
	public void m1() {
		System.out.println("m1 method executed");
	}
	@Test(priority = 1,groups = "smoke",enabled = true)
	public void m2() {
		System.out.println("m2 method executed");
	}
	@Test(priority = 2,groups = "integration")
	public void m3() {
		System.out.println("m3 method executed");
	}
	@Test(priority = 3,groups = "regression", invocationCount = 3)
	public void m4() {
		System.out.println("m4 method executed");
	}
}
