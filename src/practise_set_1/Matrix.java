package practise_set_1;

public class Matrix {
	
	
	private int[][] matrix = {{2,2,2}, {1, 2, 2}, {1,2,0}};
	
	public static void main(String[] args) {
		Matrix object = new Matrix();
		object.check();
	}
	
	private void check() {
		printMatrix();
		//String resultFromSameRowValue = chekForSameRowValue();
		//System.out.println("Result found " + resultFromSameRowValue);
		//String resultFromSameColumnValue = checkForSameColumnValues();
		//System.out.println("Result found for column checking " + resultFromSameColumnValue);
		//String resultForFirstDiagonalValue = checkForSameFirstDiagonalValues();
		//System.out.println("Result For First Diagonal Checking: " + resultForFirstDiagonalValue);
		String resultForSecondDiagonalValue = checkForSameSecondDiagonalValue();
		System.out.println("Result For Second Diagonal Checking: " + resultForSecondDiagonalValue);
	}
	
	private void printMatrix() {
		for(int row=0; row<3; row++) {
			for(int col=0; col<3; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	private String chekForSameRowValue() {
		String res = "";
		for(int r=0; r<3; r++) {
			int v = matrix[r][0];
			if(v != matrix[r][1]) {
				System.out.println("Not same");
				continue;
			}else if(v != matrix[r][2]) {
				System.out.println("Not Same");
				continue;
			}
			System.out.println("Same Value for " + r + " no Row and value is : " + v);
			res += v;
		}
		if(res.isEmpty()) {
			return "-1";
		}
		return res;
	}
	
	private String checkForSameColumnValues() {
		String res = "";
		for(int c=0; c<3; c++) {
			int v = matrix[0][c];
			if(v != matrix[1][c]) {
				System.out.println("Not same");
				continue;
			}else if(v != matrix[2][c]) {
				System.out.println("Not same");
				continue;
			}
			System.out.println("Same Value for " + c + " no Col and value is : " + v);
			res += v;
		}
		if(res.isEmpty()) {
			return "-1";
		}
		return res;
	}
	
	private String checkForSameFirstDiagonalValues() {
		String res = "";
		int value = 0;
		for(int i=0; i<2; i++) {
			value = matrix[i][i];
			if(value != matrix[i+1][i+1]) {
				System.out.println("Not Same");
				return "-1";
			}else {
				res = Integer.toString(value);
			}
		}
		return res;
	}
	
	private String checkForSameSecondDiagonalValue() {
		String res = "";
		int value = 0;
		int column = 2;
		for(int i=0; i<2; i++) {
			value = matrix[i][column];
			if(value != matrix[i+1][column-1]) {
				System.out.println("Not Same");
				return "-1";
			}else {
				res = Integer.toString(value);
			}
			column--;
			
		}
		return res;
	}
	
}














