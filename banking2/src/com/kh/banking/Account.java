package com.kh.banking;

public class Account{

	private String accountName; // �����ָ�
	private String accountNumber; // ���¹�ȣ
	private int balance; // �ܾ�

	public static final int ACCOUNT_NUM_SIZE = 3; // ���¹�ȣ 3�ڸ�
	private static int accountNum; // ���¹�ȣ ī��Ʈ

	public Account() {
		super();
	}

	private Account(String accountName) {

		this.accountName = accountName;

		// ���¹�ȣ ����
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
		return "�����ָ� : " + accountName + ", ���¹�ȣ: " + accountNumber + ", �ܾ� : " + balance;
	}

	// ���¹�ȣ ����
	private String createAccountNumber(int accountNum) {
		String zero = "";
		String number = String.valueOf(accountNum);
		for (int i = 1; i <= ACCOUNT_NUM_SIZE - number.length(); i++) {
			zero += "0";
		}

		return zero + accountNum;
	}

}
