package Answer31;

public class SwitchCase {

	public static void main(String[] args) {
     int num1 = 10, num2 = 30;
     String operation = "Add";
     
     switch (operation){
     case "Add":
    	 System.out.println(num1 + num2);
    	 break;
     case "Mul":
     System.out.println(num1 * num2);
     break;
     case "Sub":
    	 System.out.println(num1 - num2);
    	 break;
     case "Div":
    	 System.out.println(num1 / num2);
    	 break;
    	 default:
    		 System.out.println("Enter valid operation");
     }

	}

}
