package com.kh.banking;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		BanktIf bank = new Bank();
		
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!stop) {
			Account ac = null;  	        //계좌
			String accountName = null;						//예금주명
			String accountNumber = null;	//계좌번호
			int money = 0;								//입출금액
			
			try {

				System.out.println("\n1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 0.종료");
				System.out.print("입력 > ");

				String num = scanner.next();

				switch (num) {
				case "1": // 계좌 개설
					System.out.println("이름을 입력하세요");
					System.out.print("입력 > ");
					accountName = scanner.next();
					ac = bank.createNewAccount(accountName);
					if (ac != null) {
						System.out.println("계좌가 생성 되었습니다.");
						System.out.println(ac.toString());
					}
					break;
				case "2": // 계좌 폐지
					System.out.println("폐지할 계좌 번호를 입력하세요");
					System.out.print("입력 > ");
					accountNumber = scanner.next();
					ac = bank.deleteAccount(accountNumber);
					if (ac != null) {
						System.out.println("계좌가 폐지 되었습니다.");
						System.out.println(ac.toString());
					}
					break;
				case "3": // 입금
					System.out.println("입금할 계좌 번호를 입력하세요");
					System.out.print("입력 > ");
					accountNumber = scanner.next();
					System.out.println("송금할 금액을 입력하세요");
					System.out.print("입력 > ");
					money = Integer.parseInt(scanner.next());
					bank.deposit(accountNumber, money);
					break;
				case "4": // 출금
					System.out.println("출금할 계좌 번호를 입력하세요");
					System.out.print("입력 > ");
					accountNumber = scanner.next();
					System.out.println("출금할 금액을 입력하세요");
					System.out.print("입력 > ");
					money = Integer.parseInt(scanner.next());
					bank.withdraw(accountNumber, money);
					break;
				case "5": // 계좌 개별 조회
					System.out.println("조회할 계좌 번호를 입력하세요");
					System.out.print("입력 > ");
					accountNumber = scanner.next();
					bank.printAccount(accountNumber);
					break;
				case "6": // 계좌 전체 조회
					bank.printAllAccount();
					break;
				case "0": // 종료
					System.out.println("종료되었습니다.");
					stop = true;
					break;
				}// end of switch

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // end of while
	} // end of main

} // end of program
