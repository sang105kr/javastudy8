package com.kh;

import java.util.Scanner;

/*
 * ��,��,�� 3������ ������ �Է¹޾Ƽ� ��÷, ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *   
 */
public class Average {

	public static void main(String[] args) {

		int sum = 0;  		// ����
		double avg = 0.0; 	//���
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��,��,�� 3���� ������ �Է¹޾� ��ձ��ϴ� ���α׷��Դϴ�.");
		System.out.print("�������� : ");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.print("�������� : ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.print("�������� : ");
		int math = Integer.parseInt(scanner.nextLine());
		
		sum = kor + eng + math;
		avg = (double)sum / 3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
	}

}
