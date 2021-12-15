package com.kh.banking;

public class Account implements AccountIf {

	private String accountName; // �����ָ�
	private String accountNumber; // ���¹�ȣ
	private int balance; // �ܾ�

	// ���� ������ ���¼� �ѵ�
	public static final int OPEN_ACCOUNT_LIMIT = 5;
	public static final Account[] accounts = new Account[OPEN_ACCOUNT_LIMIT];

	public static final int ACCOUNT_NUM_SIZE = 3; // ���¹�ȣ 3�ڸ�
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; // 1ȸ �Ա��ѵ�
	public static final int DEPOSIT_MONEY_LIMIT = 50_000; // ��ġ�� �ѵ�

	public static final int NOT_FOUND = -1;

	private static int cnt; // ������ ���°��� ī��Ʈ
	private static int accountNum; // ���¹�ȣ ī��Ʈ

	public Account() {
		super();
	}

	private Account(String accountName) {
		// ���� ������ ���¼� üũ
		if (cnt == OPEN_ACCOUNT_LIMIT) {
			throw new IllegalStateException("���� ���� ���¼� �ʰ�!");
		}

		// �������� üũ
		if (existAccountName(accountName)) {
			throw new IllegalArgumentException("���������� �����մϴ�!");
		}

		this.accountName = accountName;

		// ���¹�ȣ ����
		this.accountNumber = createAccountNumber(++accountNum);
		accounts[cnt++] = this;
	}

	// ���� ����
	@Override
	public Account createNewAccount(String name) {

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = new Account(name);
				return accounts[i];
			}
		}

		return null;
	}

	// ���� ����
	@Override
	public Account deleteAccount(String accountNumber) {

		// 0) ���� ã��
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("���¹�ȣ�� ã�� �� �����ϴ�");
		}
		
		// 1)�ܾ��� ���� üũ
		if (accounts[findedIndex].getBalance() > 0) {
			throw new IllegalStateException("�ܾ� : " + accounts[findedIndex].getBalance() + " ���� �ֽ��ϴ�.");
		}
		
		// 2)���� ����
		Account delAccount = accounts[findedIndex];
		accounts[findedIndex] = null;
		
		return delAccount;
	}

	// �Ա�
	@Override
	public void deposit(String accountNumber, int money) {

		// 0) ���� ã��
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("���¹�ȣ�� ã�� �� �����ϴ�");
		}
		// 1) 1ȸ 2���� �̸�
		if (money < 0 || money >= ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1 ȸ 2���� �Ա��ѵ� �ʰ�!!");
		}
		// 2) ��ġ���� 5���� ����
		if (accounts[findedIndex].getBalance() + money > DEPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("��ġ�� 5���� �ѵ� �ʰ�!!");
		}
		// 3) �Ա�
		accounts[findedIndex].balance += money;
	}

	// ���
	@Override
	public void withdraw(String accountNumber, int money) {
		// 0) ���� ã��
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("���¹�ȣ�� ã�� �� �����ϴ�");
		}
		// 1) ���� üũ
		if (money < 0) {
			throw new IllegalArgumentException("������ �ԷµǾ����ϴ�!");
		}
		// 2) �ܾ� < ��ݾ� üũ
		if (accounts[findedIndex].getBalance() < money) {
			throw new IllegalArgumentException("�ܾ��� �������ϴ�! ���� : " + (accounts[findedIndex].getBalance() - money));
		}
		// 3)���
		accounts[findedIndex].balance -= money;
	}

	// ��ȸ
	@Override
	public void printAccount(String accountNumber) {
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		System.out.println(accounts[findedIndex]);
	}

	// ��ü��ȸ
	@Override
	public void printAllAccount() {

		int idleAccount = 0; // ���ް���

		for (Account account : accounts) {
			if (account == null) {
				idleAccount++;
				continue;
			} else {
				System.out.println(account);
			}
		}

		System.out.println("���� ���¼� : " + idleAccount);
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

	// �������� üũ
	private boolean existAccountName(String accountName) {
		boolean existAccountName = false;
		for (int i = 0; i < cnt; i++) {
			if (accounts[i].accountName.equals(accountName)) {
				existAccountName = true;
				break;
			}
		}
		return existAccountName;
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

	// ���¹�ȣ �ε��� ã��, ������ NOT_FOUND (-1)��ȯ
	private int findedIndexByAccountNumber(String accountNumber) {

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null)
				continue;
			if (accounts[i].getAccountNumber().equals(accountNumber)) {
				return i;
			}
		}
		return NOT_FOUND;
	}

}
