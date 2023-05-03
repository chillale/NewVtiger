package testNg.prac;

import org.testng.annotations.Test;

public class Groups {
	@Test(dependsOnMethods = "c")
	public void a() {
		System.out.println("a group1");
	}
	@Test(dependsOnMethods = "a")
	public void b() {
		System.out.println("b group2");
	}
	@Test(dependsOnMethods = "d")
	public void c() {
		System.out.println("c group1");
	}
	@Test(dependsOnMethods = "e")
	public void d() {
		System.out.println("d group2");
	}
	@Test(priority = 1)
	public void e() {
		System.out.println("e group1");
	}
	@Test(dependsOnMethods = "c")
	public void f() {
		System.out.println("f group2");
	}

}
