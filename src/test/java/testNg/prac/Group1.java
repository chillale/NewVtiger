package testNg.prac;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "regression")
	public void m1() {
		System.out.println("m1 method");
	}

}
