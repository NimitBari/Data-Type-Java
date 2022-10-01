package Question11;

import java.util.Arrays;

public class SecondLargest {
    static void print2largest(int array[] ,int array_size)
    {
     int i, first, second;
     if (array_size < 2)
     {
    	 System.out.printf(" Invalid Input ");
    	 return;
     }
     Arrays.sort(array);
     for (i = array_size - 2; i >= 0; i--)
     {
    	 if (array[i] != array[array_size - 1])
    	 {
    		 System.out.printf("The second largest" + "element is %d\n" , array[i]);
    		 return;
    	 }
     }
     System.out.printf("There is no second" +"largest element\n");
     
     
     
    }
	public static void main(String[] args) {
		int array[] = {35, 1, 12, 10, 1, 34};
		int n = array.length;
		print2largest(array , n);

	}

}
