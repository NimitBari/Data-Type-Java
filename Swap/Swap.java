package Swap;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a = 1, b = 20;
   System.out.println("Before Swap"+a+""+b);
   a = a+b;
   b = a-b;
   a = a-b;
   System.out.println("After Swap"+a+""+b);
	}

}
