package OOPConcept;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num){

	if(num<=1)
		
	{
	return false;					
	}
	for(int i=2;i<num;i++)
	{
	if(num % i == 0)
	{
	return false;
	    }			
	}
	return true;
	}
    
	
	public static void getPrimeNumbers(int num){
	for(int i = 2;i<= num;i++){
		if(isPrimeNumber(i))
		System.out.println(i+" ");
	}
	}
	public static void main(String[] args) 
	{
	 System.out.println("2 is prime number "+ isPrimeNumber(2));
	 System.out.println("3 is prime number "+ isPrimeNumber(3));
	 System.out.println("8 is prime number "+ isPrimeNumber(8));
	 System.out.println("4 is prime number "+ isPrimeNumber(4));
	 System.out.println("0 is prime number "+ isPrimeNumber(0));
	 System.out.println("-9 is prime number "+ isPrimeNumber(-9));
	 System.out.println("7 is prime number"+ isPrimeNumber(7));
	 
	 getPrimeNumbers(7);
	 getPrimeNumbers(13);
	 getPrimeNumbers(20);
	 
	}

}
