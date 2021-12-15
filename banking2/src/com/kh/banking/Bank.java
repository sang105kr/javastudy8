package com.kh.banking;

public class Bank implements BanktIf {
	
	// ���� ������ ���¼� �ѵ�
	public static final int OPEN_ACCOUNT_LIMIT = 5;
	public static final Account[] accounts = new Account[OPEN_ACCOUNT_LIMIT];

	public static final int ACCOUNT_NUM_SIZE = 3; // ���¹�ȣ 3�ڸ�
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; // 1ȸ �Ա��ѵ�
	public static final int DEPOSIT_MONEY_LIMIT = 50_000; // ��ġ�� �ѵ�

	public static final int NOT_FOUND = -1;

	private static int cnt; // ������ ���°��� ī��Ʈ
	private static int accountNum; // ���¹�ȣ ī��Ʈ

	public Bank() {
		super();
	}

	// ���� ����
	@Override
	public Account createNewAccount(String accountName) {

		Account account = null;
		
		for (int i = 0; i < accounts.length; i++) {
			
			// ���� ������ ���¼� üũ
			if (cnt == OPEN_ACCOUNT_LIMIT) {
				throw new IllegalStateException("���� ���� ���¼� �ʰ�!");
			}

			// �������� üũ
			if (existAccountName(accountName)) {
				throw new IllegalArgumentException("���������� �����մϴ�!");
			}
			
			if (accounts[i] == null) {
				accounts[i] = new Account(accountName);
				account = accounts[i];
				cnt++;
				break;
			}
		}

		return account;
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
		cnt--;
		
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
		// 2) �Ա�
		accounts[findedIndex].deposit(accountNumber, money);
	}

	// ���
	@Override
	public void withdraw(String accountNumber, int money) {
		// 0) ���� ã��
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("���¹�ȣ�� ã�� �� �����ϴ�");
		}
		// 3)���
		accounts[findedIndex].withdraw(accountNumber, money);
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

		System.out.println("���� ���¼� : " + cnt);
		System.out.println("���� ���¼� : " + idleAccount);
	}

	// �������� üũ
	private boolean existAccountName(String accountName) {
		boolean existAccountName = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountName().equals(accountName)) {
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
