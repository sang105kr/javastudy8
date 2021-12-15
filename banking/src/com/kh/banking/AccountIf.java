package com.kh.banking;

public interface AccountIf {
	//�ű�
	public Account createNewAccount(String name);

	// ����
	public Account deleteAccount(String accountNumber);

	// �Ա�
	public void deposit(String accountNumber, int money);

	// ���
	public void withdraw(String accountNumber, int money);

	// ��ȸ
	public void printAccount(String accountNumber);

	// ��ü ��ȸ
	public void printAllAccount();
}
