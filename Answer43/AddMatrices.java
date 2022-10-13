package Answer43;

public class AddMatrices {

	public static void main(String[] args) {
		int row = 2, columns = 3;
		int[][] firstMatrix = { {5, 9, 6}, {5, 2, 3} };
		int[][] secondMatrix = { {-5, 1, 0}, {8, 3, 4} };
		
		
		int[][] sum = new int[row][columns];
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++){
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("Sum of two matrices is: ");
		for(int[] rows : sum){
			for (int column : rows){
				System.out.print(column + "    ");
				
			}
			System.out.println();
		}

	}

}
