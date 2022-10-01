package PalindromeNumber;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String x = "1452541";
    int i = 0, j = x.length() - 1;
    while(i < j)
    {
    	if(x.charAt(i) != x.charAt(j))
    	{
    		System.out.println("Not palindrome");
    		System.exit(0);
    	}
    	i++;
    	j--;
    }
    System.out.println("palindrome");
	}

}
