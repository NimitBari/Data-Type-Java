package String1;

class RemoveSpace {


	public static void main(String[] args) {
	
      String s1 = "t u t o r i a l s";
      String s2 = "";
      
      for(int i=0;i<s1.length();i++)
      {
    	  String char1 = String.valueOf(s1.charAt(i));
    	  if(!char1.equalsIgnoreCase(" "))
    	  {
    		  s2=s2 + char1;
    	  }
      }
      
      System.out.println(s2);
	}

}
