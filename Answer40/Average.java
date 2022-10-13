package Answer40;

public class Average {

	public static void main(String[] args) {
		double[] numArray = {20.34, 45.6, 45.3, 67.5, -45.7 };
		double sum = 0.0;
		
		for (double num: numArray){
			sum += num;
			
		}
		
		double average = sum / numArray.length;
		System.out.format("The average is: %.2f", average);
	
		
				
		

	}

}
