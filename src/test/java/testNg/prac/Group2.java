package testNg.prac;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups = "integration")
	public void m2() {
		System.out.println("m2 method");
	}

}
