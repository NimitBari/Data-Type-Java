package Answer10;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2021;
		
		String result = ((year % 4 ==0 && year % 100 != 0)? "is a leap year.": (year % 400 == 0) ? "is a leap year.": "is not a leap year.");
		System.out.println(year + " " + result);
	

	}

}
