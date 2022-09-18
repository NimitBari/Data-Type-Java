package registration;

import java.util.Random;

public class registration {
		
		public static String getRandomStrings1(){
			
			String strValue = "QWERTYUIOPASDFGHJKLZXCVBNM";
			
			int length = 5;
			String randomString = "Nimit";
			for (int index = 0; index < length; index++){
				int rnum = (int) Math.floor((Math.random() * strValue.length()));
				randomString += strValue.substring(rnum, rnum + 1);
			
			}
			return randomString;

		}
			public static String getRandomStrings(){
				
				String strValue = "QWERTYUIOPASDFGHJKLZXCVBNM";
				
				int length = 4;
				String randomString = "Bari";
				for (int index = 0; index < length; index++){
					int rnum = (int) Math.floor((Math.random() * strValue.length()));
					randomString += strValue.substring(rnum, rnum + 1);
				
				}
				return randomString;
		
			}
	public static long randomMobileNumber(){
		Random random = new Random();
		int x = random.nextInt(100000000);
		
		String strNum = "91" + String.valueOf(x);
		long lngNumber = Long.parseLong(strNum);
		return (lngNumber);
	}		
			

	public static void main(String[] args) {
	
	System.out.println("First name is : "+getRandomStrings1()+"");	
	//System.out.println(getRandomStrings1());
	System.out.println("Last name is : "+getRandomStrings()+"");
	//System.out.println(getRandomStrings());
	System.out.println("Mobile no is : "+randomMobileNumber());
	
	}}












