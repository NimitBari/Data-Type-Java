package Question7;

public class RemoveSpaces {

 public static void remove(String str){
	 String newstr = str.replaceAll("\\s" , "");
	System.out.println(newstr); 
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "n  i m    i  t b a  r  i";
		remove(str);
	}} 