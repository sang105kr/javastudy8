package com.kh.account;

public interface AccountIf {

	void initMenu();
	/**
	 * ���»���
	 * @param name
	 */
	void createAccount(String name);
	/**
	 * ��������
	 * @param accountNumber
	 */
	void deleteAccount(String accountNumber);
	/**
	 * �Ա�
	 * @param money
	 */
	void deposit(int money);
	/**
	 * ���
	 * @param money
	 */
	void widthdraw(int money);
	
	/**
	 * ������ȸ(����)
	 * @param accountNumber
	 * @return
	 */
	String showAccount(String accountNumber);
	
	/**
	 * ������ȸ(��ü)
	 * @return
	 */
	String showAccountAll();
}
