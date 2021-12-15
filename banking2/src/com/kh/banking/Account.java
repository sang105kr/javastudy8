package com.kh.banking;

public class Account{

	private String accountName; // 예금주명
	private String accountNumber; // 계좌번호
	private int balance; // 잔액

	public static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호 3자리
	private static int accountNum; // 계좌번호 카운트

	public Account() {
		super();
	}

	private Account(String accountName) {

		this.accountName = accountName;

		// 계좌번호 생성
		this.accountNumber = createAccountNumber(++accountNum);
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
