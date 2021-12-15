package com.kh.banking;

public class Account {
	private String accountName; // �����ָ�
	private String accountNumber; // ���¹�ȣ
	private int balance; // �ܾ�

	public static final int ACCOUNT_NUM_SIZE = 3; // ���¹�ȣ 3�ڸ�
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; // 1ȸ �Ա��ѵ�
	public static final int DEPOSIT_MONEY_LIMIT = 50_000; // ��ġ�� �ѵ�

	private static int accountNum; // ���¹�ȣ ī��Ʈ


	public Account(String accountName) {
		// �����̸�
		this.accountName = accountName;
		// ���¹�ȣ ����
		this.accountNumber = createAccountNumber(++accountNum);
	}

	// �Ա�
	public void deposit(String accountNumber, int money) {

		// 1) 1ȸ 2���� �̸�
		if (money < 0 || money >= ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1 ȸ 2���� �Ա��ѵ� �ʰ�!!");
		}
		// 2) ��ġ���� 5���� ����
		if (money > DEPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("��ġ�� 5���� �ѵ� �ʰ�!!");
		}
		// 3) �Ա�
		balance += money;
	}

	// ���
	public void withdraw(String accountNumber, int money) {

		// 1) ���� üũ
		if (money < 0) {
			throw new IllegalArgumentException("������ �ԷµǾ����ϴ�!");
		}
		// 2) �ܾ� < ��ݾ� üũ
		if (balance < money) {
			throw new IllegalArgumentException("�ܾ��� �������ϴ�! ���� : " + (balance - money));
		}
		// 3)���
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
