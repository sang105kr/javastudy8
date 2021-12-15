package com.kh.banking;

public interface AccountIf {
	//신규
	public Account createNewAccount(String name);

	// 폐지
	public Account deleteAccount(String accountNumber);

	// 입금
	public void deposit(String accountNumber, int money);

	// 출금
	public void withdraw(String accountNumber, int money);

	// 조회
	public void printAccount(String accountNumber);

	// 전체 조회
	public void printAllAccount();
}
