package question6;

public class RepeatTwice1 {

	public static void main(String[] args) {
		
    String str = "welcome";
    StringBuilder new_str = new StringBuilder();
    for (int i = 0;i<str.length();i++){
    	new_str.append(str.charAt(i));
    	new_str.append(str.charAt(i));
    }
    System.out.println("The given string is:"+str);
    System.out.println("The new string is:"+new_str);
	}

}
