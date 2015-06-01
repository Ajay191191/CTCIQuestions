package com.chapter1;

public class Problem6 {
	public static int[][] rotateMatrix(int [][]matrix){
		int rotatedMatrix[][] = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < rotatedMatrix.length; i++) {
			for (int j = 0; j < rotatedMatrix.length; j++) {
				rotatedMatrix[j][rotatedMatrix.length-i-1] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] rotatedMatrix = Problem6.rotateMatrix(matrix);
		
		for (int i = 0; i < rotatedMatrix.length; i++) {
			for (int j = 0; j < rotatedMatrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < rotatedMatrix.length; i++) {
			for (int j = 0; j < rotatedMatrix.length; j++) {
				System.out.print(rotatedMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
