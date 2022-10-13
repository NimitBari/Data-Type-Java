package Answer30;

public class Factorofanumber {

	public static void main(String[] args) {
		int number = 70;
		System.out.print("Factor of " + number + " are: ");
		
		for (int i = 1; i <= number; ++i){
			
			if (number % i == 0){
				System.out.print(i + " ");
			}
		}

	}

}
