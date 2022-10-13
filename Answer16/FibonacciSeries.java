package Answer16;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 200, firstTerm = 0, secondTerm = 1;
		System.out.println("FibonacciSeries Upto " + n + ": ");
		
		while (firstTerm <= n){
			System.out.print(firstTerm + ", ");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
