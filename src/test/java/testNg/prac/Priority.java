package testNg.prac;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
	public void a() {
		System.out.println("a method executed");
	}
	@Test(dependsOnMethods = "c")
	public void b() {
		System.out.println("b method executed");
	}
	@Test(priority = 3)
	public void c() {
		System.out.println("c method executed");
	}
	@Test(priority = 2)
	public void d() {
		System.out.println("d method executed");
	}
	@Test(dependsOnMethods = "a")
	public void e() {
		System.out.println("e method executed");
	}

}
