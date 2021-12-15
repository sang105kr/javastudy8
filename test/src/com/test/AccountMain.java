package com.test;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		do {
			System.out.println("================================================");
			System.out.println("1.�ű� 2.���� 3.�Ա� 4.��� 5.��ȸ(����) 6.��ȸ(��ü) 7.����");
			System.out.println("================================================");
			System.out.print("���� >> ");
			String choice = scanner.nextLine();

			String accountName = ""; // �����ָ�
			String accountNumber = ""; // ���¹�ȣ
			int money = 0; // ����ݾ�
			AccountIf account = null; // ����

			try {
				switch (choice) {
				case "1":
					System.out.print("�����ָ� : ");
					accountName = scanner.nextLine();
					if (accountName.trim().length() == 0) {
						continue;
					}
					account = new Account(accountName);
					System.out.println(account);
					break;
				case "2":
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.print("�����Ͻðڽ��ϱ�?(Y/N)");
					if(scanner.nextLine().equalsIgnoreCase("y")) {
						account.deleteAccount(accountNumber);
					}
					break;
				case "3":
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.print("�Աݾ� : ");
					money = Integer.parseInt(scanner.nextLine());
					account.deposit(money);
					break;
				case "4":
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.print("��ݾ� : ");
					money = Integer.parseInt(scanner.nextLine());
					account.widthdraw(money);
					break;
				case "5":
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.println(account.showAccount(accountNumber));
					break;
				case "6":
					System.out.println(Account.showAccountAll());
					break;
				case "7":
					stop = true;
					break;

				default:
					break;
				}//end of switch

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}// end of try~catch
			
		} while (!stop);

		System.out.println("���α׷� ����!");
	}// end of main

}
