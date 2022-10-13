package Answer41;

public class Largest {

	public static void main(String[] args) {
		double[] numArray = {12.3, 58.22, 78.21, 12.65, 70.2, 88.45, 99.0, 89.19 };
		double largest = numArray[0];
		
		for (double num: numArray) {
			if(largest < num)
				largest = num;
			
		}
		System.out.format("Largest element = %.2f", largest);

	}

}
