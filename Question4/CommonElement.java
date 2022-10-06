package Question4;

public class CommonElement {

	public static void main(String[] args) {
		int a1[] = {1, 5, 6, 20, 40, 80};
		int a2[] = {6, 7, 20, 80, 100};
		int a3[] = {3, 15, 20, 30, 70, 80, 120};
		int i = 0,j = 0,k = 0;
		while(i<a1.length && j<a2.length && k<a3.length)
		{
			if(a1[i]==a2[j] && a1[i]==a3[k])
			{
				System.out.println(a1[i]);
			
			}
			i++;j++;k++;
		        if(a1[i]<a2[j] && a1[i]<a3[k])
			i++;
			else if(a2[j]<a1[i] && a2[j]<a3[k])
			j++;
			else if(a3[k]<a1[i] && a3[k]<a2[j])
			k++;
		}
	}
 
}
 