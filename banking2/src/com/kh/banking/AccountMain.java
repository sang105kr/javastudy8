package com.kh.banking;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		BankIf account = new Account();
		
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!stop) {
			Account ac = null;  	        //����
			String name = null;						//�����ָ�
			String accountNumber = null;	//���¹�ȣ
			int money = 0;								//����ݾ�
			
			try {

				System.out.println("\n1.�ű� 2.���� 3.�Ա� 4.��� 5.������ȸ(����) 6.������ȸ(��ü) 0.����");
				System.out.print("�Է� > ");

				String num = scanner.next();

				switch (num) {
				case "1": // ���� ����
					System.out.println("�̸��� �Է��ϼ���");
					System.out.print("�Է� > ");
					name = scanner.next();
					ac = account.createNewAccount(name);
					if (ac != null) {
						System.out.println("���°� ���� �Ǿ����ϴ�.");
						System.out.println(ac.toString());
					}
					break;
				case "2": // ���� ����
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���");
					System.out.print("�Է� > ");
					accountNumber = scanner.next();
					ac = account.deleteAccount(accountNumber);
					if (ac != null) {
						System.out.println("���°� ���� �Ǿ����ϴ�.");
						System.out.println(ac.toString());
					}
					break;
				case "3": // �Ա�
					System.out.println("�Ա��� ���� ��ȣ�� �Է��ϼ���");
					System.out.print("�Է� > ");
					accountNumber = scanner.next();
					System.out.println("�۱��� �ݾ��� �Է��ϼ���");
					System.out.print("�Է� > ");
					money = Integer.parseInt(scanner.next());
					account.deposit(accountNumber, money);
					break;
				case "4": // ���
					System.out.println("����� ���� ��ȣ�� �Է��ϼ���");
					System.out.print("�Է� > ");
					accountNumber = scanner.next();
					System.out.println("����� �ݾ��� �Է��ϼ���");
					System.out.print("�Է� > ");
					money = Integer.parseInt(scanner.next());
					account.withdraw(accountNumber, money);
					break;
				case "5": // ���� ���� ��ȸ
					System.out.println("��ȸ�� ���� ��ȣ�� �Է��ϼ���");
					System.out.print("�Է� > ");
					accountNumber = scanner.next();
					account.printAccount(accountNumber);
					break;
				case "6": // ���� ��ü ��ȸ
					account.printAllAccount();
					break;
				case "0": // ����
					System.out.println("����Ǿ����ϴ�.");
					stop = true;
					break;
				}// end of switch

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // end of while
	} // end of main

} // end of program