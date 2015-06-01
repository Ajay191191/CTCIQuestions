package com.chapter1;

public class Problem7 {

	public static int[][] processMatrix(int[][] matrix){
		
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]==0){
					rows[i]=1;
					columns[i]=1;
				}
			}
		}
		
		matrix = Problem7.replaceRow(matrix, rows);
		matrix = Problem7.replaceColumns(matrix, columns);
		return matrix;
	}
	
	private static int[][] replaceRow(int[][] matrix,int[] row){
		
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(row[i]==1)
					matrix[i][j]=0;
			}
		}
		
		return matrix;
	}
	
	private static int[][] replaceColumns(int[][] matrix,int[] column){
		
		for (int i = 0; i < column.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(column[i]==1)
					matrix[j][i]=0;
			}
		}
		
		return matrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		matrix = Problem7.processMatrix(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
