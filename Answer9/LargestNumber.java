package Answer9;

public class LargestNumber {

	public static void main(String[] args) {
		int i = 25, j = 65, k = 42;
		if(i >= j && i >= k)
			System.out.println(i + " is the largest number.");
		
		else if (j >= i && j >= k)
			System.out.println(j + " is the largest number.");
		
		else
			System.out.println(k + " is the largest number.");

	}

}
