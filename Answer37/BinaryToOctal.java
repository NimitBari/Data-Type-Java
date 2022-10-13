package Answer37;

public class BinaryToOctal {

	public static void main(String[] args) {
		long binary = 101001;
		int octal = convertBimarytoOctal(binary);
		System.out.println(binary + " in binary = " + octal + " in octal");
		

	}
	public static int convertBimarytoOctal(long binaryNumber){
		int octalNumber = 0, decimalNumber = 0, i = 0;
		
		while (binaryNumber != 0){
			decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
			++i;
			binaryNumber /= 10;
			
		}
		i = 0;
		
		while (decimalNumber != 0){
			octalNumber += (decimalNumber % 8)* i;
			decimalNumber /= 8;
			i *= 10;
		}
		return octalNumber;
	}

}
