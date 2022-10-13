package Answer26;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		double Armstrong = 0;
		double temp;
		int original = n;
		while (n > 0)
		{
			temp = n % 10;
			temp = Math.pow(temp, 3);
			Armstrong = Armstrong + temp;
			n = n/10;
		}
		if(Armstrong == original)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");

	}

}
