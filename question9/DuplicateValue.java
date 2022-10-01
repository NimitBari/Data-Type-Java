package question9;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]array = new int[]{3, 5, 4, 2, 6, 5, 9, 8, 1, 3, 9, 2};
     System.out.println("Duplicate Value in given array");
     for(int i = 0; i <array.length; i++){
    	 for(int j = i + 1; j <array.length;j++){
    		if(array[i]==array[j])
    			System.out.println(array[j]);
    	 }
     }
	}

}
