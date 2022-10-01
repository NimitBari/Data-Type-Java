package question10;

public class OddEvenArray {

	public static void main(String[] args) {
    int a[] = {1,4,8,6,5,3,2};
    System.out.println("Odd Number:");
    for(int i = 0;i<a.length; i++){
    	if(a[i]%2!= 0){
    		System.out.println(a[i]);
    	}
    }
    System.out.println("Even Number:");
    for(int i=0;i<a.length;i++){
    	if(a[i]%2==0){
    		System.out.println();
    	}
    }
	}

}
