package com.test;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		do {
			System.out.println("================================================");
			System.out.println("1.신규 2.폐지 3.입금 4.출금 5.조회(개별) 6.조회(전체) 7.종료");
			System.out.println("================================================");
			System.out.print("선택 >> ");
			String choice = scanner.nextLine();

			String accountName = ""; // 예금주명
			String accountNumber = ""; // 계좌번호
			int money = 0; // 입출금액
			AccountIf account = null; // 계좌

			try {
				switch (choice) {
				case "1":
					System.out.print("예금주명 : ");
					accountName = scanner.nextLine();
					if (accountName.trim().length() == 0) {
						continue;
					}
					account = new Account(accountName);
					System.out.println(account);
					break;
				case "2":
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.print("폐지하시겠습니까?(Y/N)");
					if(scanner.nextLine().equalsIgnoreCase("y")) {
						account.deleteAccount(accountNumber);
					}
					break;
				case "3":
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.print("입금액 : ");
					money = Integer.parseInt(scanner.nextLine());
					account.deposit(money);
					break;
				case "4":
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					account = Account.findAccount(accountNumber);
					System.out.print("출금액 : ");
					money = Integer.parseInt(scanner.nextLine());
					account.widthdraw(money);
					break;
				case "5":
					System.out.print("계좌번호 : ");
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

		System.out.println("프로그램 종료!");
	}// end of main

}
