package Answer25;

public class Primrnumberbetweentwonumber {
   public static int isprime(int n)
   {
	for (int i = 2; i <= Math.sqrt(n); i++){
		if(n%i == 0){
			return -1;
		}
	}
	return 1;
   }
	public static void main(String[] args) {
		
   for (int i = 1; i <= 100; i++)
   {
	   if(i == 1)continue;
	   if(isprime(i) == 1)
	   {
		   System.out.println(i+" ");
	   }
   }
	}

}
