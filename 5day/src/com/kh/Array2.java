package com.kh;

public class Array2 {

	public static void main(String[] args) {

		String[][] array = new String[3][];
		
		array[0] = new String[3];
		array[1] = new String[2];
		array[2] = new String[4];
		
		//배열에 값을 할당
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = "*";
			}
		}
				
		//배열에 값을 읽어오기
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
