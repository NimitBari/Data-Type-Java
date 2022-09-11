package RegistrationPage;

import java.util.Scanner;

public class First {


	public static void main(String[] args)

	{
		String firstName,
		lastName;
		
       @SuppressWarnings("resource")
	Scanner scanner1 = new Scanner(System.in );
       System.out.print("Enter your first name :");
       firstName = scanner1.nextLine();
       
       System.out.print("Enter your last name :");
       lastName = scanner1.nextLine();
       System.out.print("Your first name is " + firstName + " and your last name is "+ lastName);
      
      System.out.print("Enter Your Mobile Number : ");
      String Mobilenumber = scanner1.nextLine();
       
       System.out.print("Enter your Date of birth :");
       String DateOfBirth = scanner1.nextLine();
       
    
	}

}
