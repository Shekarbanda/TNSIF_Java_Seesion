package practice_questions_assignment;

public class Matrix_Demo {
	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		//for storing values
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = i*3+j+1;
			}
		}
		//for printing matrix elements
		System.out.println("Matrix elements are :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
