package getTitleAfterClickingonTab;

 class A {
	int i=10;// casting 
	double d=i;// widening 

	double d1= 20;
	int i1=(int) d1;// narrowing 
	public void show1() {
		System.out.println("Show by A");
	}
}

class B extends A{
	public void show2() {
		System.out.println("Show by B");
	}
	
}

public class C {
	public static void main(String[] args) {
		A a= new B();// upcasting 
		a.show1();
		A obj = new B();// upcasting 
		
		B obj1= (B)obj;// downcasting 
		obj1.show2();
	}
}
