package testNg.prac;

import org.testng.annotations.Test;

public class InvocationClass {
	@Test(invocationCount = 2)
	public void invocation() {
		System.out.println("hello it is invocation");
	}

}
