package com.kh;

import java.util.Scanner;

/*
 * 국,영,수 3과목의 점수를 입력받아서 총첨, 평균을 구하는 프로그램을 작성하시오.
 *   
 */
public class Average {

	public static void main(String[] args) {

		int sum = 0;  		// 총점
		double avg = 0.0; 	//평균
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국,영,수 3과목 점수를 입력받아 평균구하는 프로그램입니다.");
		System.out.print("국어점수 : ");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수 : ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수 : ");
		int math = Integer.parseInt(scanner.nextLine());
		
		sum = kor + eng + math;
		avg = (double)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
