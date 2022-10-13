package Answer23;

public class PalindromeNumber {

	public static void main(String[] args) {
		String x = "54";
		int i = 0, j = x.length() - 1;
		while(i < j)
		{
			if(x.charAt(i) != x.charAt(j))
			{
				System.out.println("Not a palindrome Number");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Palindrome Number");
		

	}

}
