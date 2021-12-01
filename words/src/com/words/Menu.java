package com.words;

import java.util.Scanner;

public class Menu {

	private Members members = new Members();
	private Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		super();
	}
	
	//�ʱ�޴�
	public void initMenu() {
		String choiceNum = null;
		String id = null;
		String pw = null;
		boolean stop = false;
		
		while(!stop) {
			System.out.println("1.�α��� 2.���� 0.����");
			System.out.print("���� > ");
			choiceNum = scanner.nextLine();
			switch (choiceNum) {
			case "1": //�α���
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("Pw : ");
				pw = scanner.nextLine();
				
				LoginChk loginChk = members.isMember(id, pw);
				
				switch (loginChk) {
				case ADMIN: //������
					adminMenu();
					break;
				case MEMBER://ȸ��
					customerMenu();
					break;
				case FAIL:	//��������
					continue;
				default:
					break;
				}
				
				break;
			case "2": //����
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("Pw : ");
				pw = scanner.nextLine();
				
				members.joinMember(id, pw);
				System.out.println("ȸ������ �Ǿ����ϴ�.");
				
				break;
			case "0": //����	
				stop = true;
				System.exit(0);
				break;
	
			default:
				break;
			}	// end of switch
		} // end of while	
	} // end of initMenu()
	
	//�����ڿ�޴�
	public void adminMenu() {
		System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 7.��ü���� 0.�α׾ƿ� ");	
	}
	
	//����ڸ޴�
	public void customerMenu() {
		System.out.println("1.�˻� 2.�ܾ��� 0.�α׾ƿ�");
	}
}
