package RegistrationForm;

public class UserRegistrationPage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Utilities e1,e2,e3,e4,e5;
      e1 = new   Utilities();
      e2 = new   Utilities("Nimit");
      e3 = new   Utilities("9960638873");
      e4 = new   Utilities("05/04/1999");
      e5 = new   Utilities("nimit1bari@gmail.com");
      
      e1.setfirstname("Nimit");
      e2.setlastname("Bari");
      e3.setMobilenumber("9960638873");
      e4.setDateofbirth("05/04/1999");
      e5.setEmailid("nimit1bari@gmail.com");
      
     System.out.println(e1.getfirstname());
     System.out.println(e2.getlastname());
     System.out.println(e3.mobilenumber);
     System.out.println(e4.Dateofbirth);
     System.out.println(e5.Emailid);
     
     
	}

}
