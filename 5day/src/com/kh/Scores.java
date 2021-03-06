package com.kh;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		int[] student = null;
		
		do {
		
			printLine(80);
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			printLine(80);
			System.out.print("선택 >> "); 
			//String choiceNumber = scanner.nextLine();
			
			switch(scanner.nextLine()) {
			case "1": //학생수 입력
				System.out.print("학생수 > ");
				int studentCount = Integer.parseInt(scanner.nextLine());
				student = new int[studentCount];
				break;
				
			case "2": //점수 입력
				
				if(student == null) {
					System.out.println("먼저 학생수를 입력해주세요");
					continue;
				}
				for(int i=0; i< student.length; i++) {
					System.out.print("점수" + (i+1) + " > ");
					student[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
				
			case "3": //점수 조회
				if(student == null) {
					System.out.println("먼저 학생수를 입력해주세요");
					continue;
				}
				
				for(int i=0; i< student.length; i++) {
					System.out.println("score[" + i + "]=" + student[i]);
				}				
				break;
				
			case "4": //점수 분석
				if(student == null) {
					System.out.println("먼저 학생수를 입력해주세요");
					continue;
				}
				
				System.out.println("최고점수 : " + maxScore(student));
				System.out.println("최저점수 : " + minScore(student));
				System.out.println("평균 : " + avg(student));
				
				break;
			case "5":
				stop = true;
				break;
			default : 
					continue;
			}
			
			
		}while(!stop);
		
		System.out.println("프로그램 종료!!");
		
	}
	
	//최고점수
	private static int maxScore(int[] scores) {
		int max = scores[0];
		for(int i=1; i<scores.length; i++) {
			if( scores[i] > max) {
				max = scores[i];
			}
		}		
		return max;
	}
	//최저점수
	private static int minScore(int[] scores) {
		int min = scores[0];
		for(int i=1; i<scores.length; i++) {
			if( scores[i] < min) {
				min = scores[i];
			}
		}		
		return min;
	}
	//평균
	private static double avg(int[] scores) {
		double avg = 0.0;
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum / (double)scores.length;
		
		return avg;
	}
	
	//라인 출력
	public static void printLine(int count) {
		for(int i=1; i<=count ;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
