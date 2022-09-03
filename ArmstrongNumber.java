
public class ArmstrongNumber {
public static void isArmstrongNumber(int num){
	int cube = 0;
	int r;
	int t;
	
	t = num;
	while(num>0){
		r = num%10;
		num = num/10;
		cube=cube+(r*r*r);
		if(t == cube){
			System.out.println("this is an armstrongnumber");
			
		}else{
			System.out.println("this is not an armstrongnumber");
		}
	}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
isArmstrongNumber(153);
isArmstrongNumber(371);
isArmstrongNumber(0);
	}

}
