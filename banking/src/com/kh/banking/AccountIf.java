package com.kh.banking;

public interface AccountIf {
	//�ű�
	Account createNewAccount(String accountName);

	// ����
	Account deleteAccount(String accountNumber);

	// �Ա�
	void deposit(String accountNumber, int money);

	// ���
	void withdraw(String accountNumber, int money);

	// ���� ��ȸ
	void printAccount(String accountNumber);

	// ��ü ��ȸ
	void printAllAccount();
}
