package OOPConcept;

public class Car {

	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car a = new Car();
	Car b = new Car();
	
	a.mod = 2015;
	a.wheel = 4;
	
     b.mod = 2014;
	 b.wheel = 4;
	 
	 System.out.println(a.mod);
	 System.out.println(b.wheel);
	 System.out.println(a.wheel);
	}

}
