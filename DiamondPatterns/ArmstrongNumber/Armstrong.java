package ArmstrongNumber;

public class Armstrong {

	public static void main(String[] args) {
	
     int n=153,r,m=0,p;
     p=n;
     while(n>0)
     {
    	 r=n%10;
    	 m+=r*r*r;
    	 n=n/10;
     }
     if(m==p)
     {
    	 System.out.println("Given number is armstrong..");
     }
     else
     {
    	 System.out.println("Given number is not armstrong..");
     }
	}

}
