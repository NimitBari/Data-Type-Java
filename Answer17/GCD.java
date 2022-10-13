package Answer17;

public class GCD {

	public static void main(String[] args) {
		int n1 = 55, n2 = 225;
		
		while(n1 != n2){
			
			if(n1 > n2){
				n1 -=n2;
			
			}
			else{
				n2 -= n1;
			}
		}
		System.out.println("GCD: " + n1);

	}

}
