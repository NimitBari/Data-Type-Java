package Answer20;

public class Countnumofdigit {

	public static void main(String[] args) {
		int count = 0, num = 00120657;
		while(num != 0){
			num /= 10;
			++count;
		}
		System.out.println("Number of digits: " + count);
			

	}

}
