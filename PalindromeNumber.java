
public class PalindromeNumber {
public static void isPalindromeNumber(int num){
	System.out.println("given number is "+ num);
	int r = 0;
	int sum = 0;
	int t;
	t = num;
	
	while(num>0){
		r = num%10;
		sum = (sum*10)+r;
		num = num/10;
if(t==sum){
	System.out.println("palindromenumber");
}else
	System.out.println("not palindromenumber");

	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
isPalindromeNumber(151);
isPalindromeNumber(644);
isPalindromeNumber(23);
isPalindromeNumber(112255);
isPalindromeNumber(77895);
	}

}
