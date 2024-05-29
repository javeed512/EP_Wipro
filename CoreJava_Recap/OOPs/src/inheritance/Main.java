package inheritance;

public class Main {

	public static void main(String[] args) {


		Parent parent = new Parent();
		
			parent.m1();
		
		
		//Object  o = new Object();
		
		//Parent p = new Parent();
		
		Child c  = new Child();
		
		  c.m1();
		  
		  c.toString();
		
		//Object o1 = new Parent(); // Runtime Polymorphism
		
		Parent p1 = new Child(); // Runtime Polymorphism
		
				Child c1	=  (Child) p1;
		
			p1.m1();
		

	}

}
