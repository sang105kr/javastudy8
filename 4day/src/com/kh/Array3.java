package com.kh;

public class Array3 {

	public static void main(String[] args) {
		
		int row = 10;
		int col = 10;
		
		char[][] shape = new char[row][col];
		
		
		for(int i=0; i<shape.length; i++) {
			
			for(int j=0; j<shape[i].length; j++) {
				
				if(i == j || i + j == shape[i].length - 1) {
					System.out.print('*');
				}else {
					System.out.print(shape[i][j]);
				}
			}
			
			System.out.println();
		}

	}

}
