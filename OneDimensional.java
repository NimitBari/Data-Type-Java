package Array;

public class OneDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 20;
i = 10;

int i1[] = new int[4];
i1[0] = 10;
i1[1] = 20;
i1[2] = 30;
i1[3] = 40;
System.out.println((i1[2]));

System.out.println((i1[3]));		
		
		
System.out.println(i1.length);		
		
for(int j = 0;j<i1.length;j++){
	System.out.println(i1[j]);
}
		
		
double d[] = new double [2];
d[0] = 12.33;
d[1] = 13.44;
System.out.println(d[1]);
		
char c[] = new char[2];
c[0] = 'd';
c[1] = 2;
System.out.println(c[0]);

boolean b[] = new boolean[2];
b[0] = false;
b[1] = true;
System.out.println(b[1]);

String s[] = new String[3];
s[0] = "Test";
s[1] = "Hello";
s[2] = "World";
System.out.println(s.length);
System.out.println(s[1]);

Object ob[] = new Object[6];
ob[0] = "Tom";
ob[1] = "152";
ob[2] = "14.89";
ob[3] = "5/4/1999";
ob[4] = "M";
ob[5] = "Australia";
System.out.println(ob[5]);
System.out.println(ob.length); 

	
}
		
		
		
		
		
		
		
		
		
	}

}
