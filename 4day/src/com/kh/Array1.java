package com.kh;

public class Array1 {

	public static void main(String[] args) {
		
		//배열 생성 : new 사용
		int[] score = new int[3];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		//배열 생성 : {}
		int[] score2 = { 10, 20, 30 };
		
		for(int i=0; i<score2.length; i++) {
			System.out.println(score2[i]);
		}
		
//	한줄에 배열 생성해야함.	
//		int[] score3;
//		score3 = {10,20,30};
		
		int[] score3;
		score3 = new int[]{10,20,30};
		
		int[] score4;					//배열 선언
		score4 = new int[3];	//배열 생성
		
		//배열 생성
		int[] score5 = new int[]{ 10, 20, 30 };
		for(int i=0; i<score5.length; i++) {
			System.out.println(score5[i]);
		}		
	}
}






