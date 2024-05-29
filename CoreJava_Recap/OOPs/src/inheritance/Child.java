package inheritance;

public class Child extends Parent {
	
	public Child() {
		
		System.out.println("Child class object is created..");
		
	}
	
	
	public  void m2() {
		
		System.out.println("m2() from Child");
		
	}
	
	@Override
	public String  m1() {
		
		System.out.println("m1() from child class");
		
		return "hi";
		
	}
	

}
