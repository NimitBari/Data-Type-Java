package Answer39;

public class Power {

	public static void main(String[] args) {
		int base = 5, powerRaised = 9; 
		int result = power(base, powerRaised);
		
		System.out.println(base + "^" + powerRaised + "=" + result);
		

	}
	public static int power(int base, int powerRaised){
		if (powerRaised != 0){
			
			return (base * power(base, powerRaised - 1));
			
		}
		else{
			return 1;
		}
	}

}
