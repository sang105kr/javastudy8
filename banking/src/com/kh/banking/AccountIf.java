package com.kh.banking;

public interface AccountIf {
	//신규
	Account createNewAccount(String accountName);

	// 폐지
	Account deleteAccount(String accountNumber);

	// 입금
	void deposit(String accountNumber, int money);

	// 출금
	void withdraw(String accountNumber, int money);

	// 개별 조회
	void printAccount(String accountNumber);

	// 전체 조회
	void printAllAccount();
}
