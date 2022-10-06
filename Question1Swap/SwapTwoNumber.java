package Question1Swap;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		
		System.out.println("Number before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Number after swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
