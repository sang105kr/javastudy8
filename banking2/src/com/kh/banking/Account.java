package com.kh.banking;

public class Account {
	private String accountName; // 예금주명
	private String accountNumber; // 계좌번호
	private int balance; // 잔액

	public static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호 3자리
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; // 1회 입금한도
	public static final int DEPOSIT_MONEY_LIMIT = 50_000; // 예치금 한도

	private static int accountNum; // 계좌번호 카운트


	public Account(String accountName) {
		// 계좌이름
		this.accountName = accountName;
		// 계좌번호 생성
		this.accountNumber = createAccountNumber(++accountNum);
	}

	// 입금
	public void deposit(String accountNumber, int money) {

		// 1) 1회 2만원 미만
		if (money < 0 || money >= ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1 회 2만원 입금한도 초과!!");
		}
		// 2) 예치금이 5만원 이하
		if (money > DEPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("예치금 5만원 한도 초과!!");
		}
		// 3) 입금
		balance += money;
	}

	// 출금
	public void withdraw(String accountNumber, int money) {

		// 1) 음수 체크
		if (money < 0) {
			throw new IllegalArgumentException("음수가 입력되었습니다!");
		}
		// 2) 잔액 < 출금액 체크
		if (balance < money) {
			throw new IllegalArgumentException("잔액이 모지랍니다! 차액 : " + (balance - money));
		}
		// 3)출금
		balance -= money;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "예금주명 : " + accountName + ", 계좌번호: " + accountNumber + ", 잔액 : " + balance;
	}

	// 계좌번호 생성
	private String createAccountNumber(int accountNum) {
		String zero = "";
		String number = String.valueOf(accountNum);
		for (int i = 1; i <= ACCOUNT_NUM_SIZE - number.length(); i++) {
			zero += "0";
		}

		return zero + accountNum;
	}
}
