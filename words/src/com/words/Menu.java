package com.words;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);
	
	//�ʱ�޴�
	public void initMenu() {
		String choiceNum = null;
		String id = null;
		String pw = null;
		
		System.out.println("1.�α��� 2.���� 0.����");
		System.out.print("���� > ");
		choiceNum = scanner.nextLine();
		switch (choiceNum) {
		case "1": //�α���
			System.out.print("ID : ");
			id = scanner.nextLine();
			System.out.print("Pw : ");
			pw = scanner.nextLine();
			
			break;
		case "2": //����
			
			break;
		case "3": //����	
			System.exit(0);
			break;

		default:
			break;
		}		
	}
	
	//�����ڿ�޴�
	public void adminMenu() {
		System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 7.��ü���� 0.�α׾ƿ� ");	
	}
	
	//����ڸ޴�
	public void customerMenu() {
		System.out.println("1.�˻� 2.�ܾ��� 0.�α׾ƿ�");
	}
}
