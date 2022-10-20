package com.crm.vtigertestcases.Utility2.copy;

import org.testng.annotations.Test;

public class Sample {
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = "integration")
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups = "system")
	public void test3() {
		System.out.println("test3");
	}
	

}
