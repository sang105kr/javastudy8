package com.kh.account;

public interface AccountIf {

	void initMenu();
	/**
	 * 계좌생성
	 * @param name
	 */
	void createAccount(String name);
	/**
	 * 계좌폐지
	 * @param accountNumber
	 */
	void deleteAccount(String accountNumber);
	/**
	 * 입금
	 * @param money
	 */
	void deposit(int money);
	/**
	 * 출금
	 * @param money
	 */
	void widthdraw(int money);
	
	/**
	 * 계좌조회(개별)
	 * @param accountNumber
	 * @return
	 */
	String showAccount(String accountNumber);
	
	/**
	 * 계좌조회(전체)
	 * @return
	 */
	String showAccountAll();
}
