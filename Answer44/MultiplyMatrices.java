package Answer44;

public class MultiplyMatrices {

	public static void main(String[] args) {
		int r1 = 5, c1 = 7;
		int r2 = 7, c2 = 5;
		int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
		int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
		
		int[][] product = new int[r1][r2];
		for(int i = 0; i < r1; i++){
			for (int j = 0; j < c2; j++){
				for (int k = 0; k < c1; k++){
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		
		System.out.println("Multiplication of two matrices is: ");
		for(int[] row : product){
			for (int column : row){
				System.out.print(column + "   ");
				
			}
			System.out.println();
		}

	}

}
