package Answer32;

public class AddNumber {

	public static void main(String[] args) {
		int num = 50;
		int sum = addNumber(number);
		System.out.println("Sum = " + sum);
		
	}
	public static int addNumbers(int num){
		if (num != 0)
			return num + addNumbers(num - 1);
		else
			return num;
	}

}
