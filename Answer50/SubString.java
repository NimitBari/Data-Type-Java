package Answer50;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String txt = "This is Bari";
    String str1 = "Bari";
    String str2 = "Khot";
    
    boolean result = txt.contains(str1);
    if(result){
    	System.out.println(str1 + " is present in the string.");
    	
    }
    else{
    	System.out.println(str1 + " is not present in the string.");
    	
    }
    result = txt.contains(str2);
    if(result){
    	System.out.println(str2 + " is present in the string");
    	
    }
    else{
    	System.out.println(str2 + " is not present in the string.");
    }
	}

}
