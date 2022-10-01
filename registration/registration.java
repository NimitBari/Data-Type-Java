package registration;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class registration {
		
		private static final int randomString = 0;
		private static final int strNumber = 0;
		private static final char[] strEmailId = null;


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
	
	public void givenList_shouldReturnARandomElement(){
		java.util.List<Integer> givenList = Arrays.asList(1, 2, 3, 28);
	Random rand = new Random();
	Integer randomElement = givenList.get(rand.nextInt(givenList.size()));
	System.out.println(randomElement);
	}
	String strValue = "QWERTYUIOPASDFGHJKLZXCVBNM";
	 String strEmailID = randomString + strNumber + "@gmail.com";
	
	
		
		public static void givenList_shouldReturnARandomElement1(){
		List<Integer> givenList = Arrays.asList(19, 26, 27,28);
		Random rand = new Random();
		int randomElement = givenList.get(rand.nextInt(givenList.size()));
	    System.out.println(randomElement);
		}
	
	
	
	
	
	
	

		public static void main(String[] args) {
		
		System.out.println("First name is : "+getRandomStrings1()+"");	
		//System.out.println(getRandomStrings1());
		System.out.println("Last name is : "+getRandomStrings()+"");
		//System.out.println(getRandomStrings());
		System.out.println("Mobile no is : "+randomMobileNumber());
		System.out.println("EmailId is : "+getRandomStrings1()+"@gamil.com");
		System.out.println("Date of birth :"+getRandomStrings1()+"");
		
		}




	}


