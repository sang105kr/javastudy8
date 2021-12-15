package com.kh.banking;

public class Account implements AccountIf {

	private String accountName; // 예금주명
	private String accountNumber; // 계좌번호
	private int balance; // 잔액

	// 개설 가능한 계좌수 한도
	public static final int OPEN_ACCOUNT_LIMIT = 5;
	public static final Account[] accounts = new Account[OPEN_ACCOUNT_LIMIT];

	public static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호 3자리
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; // 1회 입금한도
	public static final int DEPOSIT_MONEY_LIMIT = 50_000; // 예치금 한도

	public static final int NOT_FOUND = -1;

	private static int cnt; // 개설된 계좌갯수 카운트
	private static int accountNum; // 계좌번호 카운트

	public Account() {
		super();
	}

	private Account(String accountName) {
		// 개설 가능한 계좌수 체크
		if (cnt == OPEN_ACCOUNT_LIMIT) {
			throw new IllegalStateException("개설 가능 계좌수 초과!");
		}

		// 동명이인 체크
		if (existAccountName(accountName)) {
			throw new IllegalArgumentException("동명이인이 존재합니다!");
		}

		this.accountName = accountName;

		// 계좌번호 생성
		this.accountNumber = createAccountNumber(++accountNum);
		accounts[cnt++] = this;
	}

	// 계좌 생성
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

	// 계좌 폐지
	@Override
	public Account deleteAccount(String accountNumber) {

		// 0) 계좌 찾기
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("계좌번호를 찾을 수 없습니다");
		}
		
		// 1)잔액이 유무 체크
		if (accounts[findedIndex].getBalance() > 0) {
			throw new IllegalStateException("잔액 : " + accounts[findedIndex].getBalance() + " 남아 있습니다.");
		}
		
		// 2)계좌 폐지
		Account delAccount = accounts[findedIndex];
		accounts[findedIndex] = null;
		
		return delAccount;
	}

	// 입금
	@Override
	public void deposit(String accountNumber, int money) {

		// 0) 계좌 찾기
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("계좌번호를 찾을 수 없습니다");
		}
		// 1) 1회 2만원 미만
		if (money < 0 || money >= ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1 회 2만원 입금한도 초과!!");
		}
		// 2) 예치금이 5만원 이하
		if (accounts[findedIndex].getBalance() + money > DEPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("예치금 5만원 한도 초과!!");
		}
		// 3) 입금
		accounts[findedIndex].balance += money;
	}

	// 출금
	@Override
	public void withdraw(String accountNumber, int money) {
		// 0) 계좌 찾기
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		if (findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("계좌번호를 찾을 수 없습니다");
		}
		// 1) 음수 체크
		if (money < 0) {
			throw new IllegalArgumentException("음수가 입력되었습니다!");
		}
		// 2) 잔액 < 출금액 체크
		if (accounts[findedIndex].getBalance() < money) {
			throw new IllegalArgumentException("잔액이 모지랍니다! 차액 : " + (accounts[findedIndex].getBalance() - money));
		}
		// 3)출금
		accounts[findedIndex].balance -= money;
	}

	// 조회
	@Override
	public void printAccount(String accountNumber) {
		int findedIndex = findedIndexByAccountNumber(accountNumber);
		System.out.println(accounts[findedIndex]);
	}

	// 전체조회
	@Override
	public void printAllAccount() {

		int idleAccount = 0; // 유휴계좌

		for (Account account : accounts) {
			if (account == null) {
				idleAccount++;
				continue;
			} else {
				System.out.println(account);
			}
		}

		System.out.println("유휴 계좌수 : " + idleAccount);
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
		return "예금주명 : " + accountName + ", 계좌번호: " + accountNumber + ", 잔액 : " + balance;
	}

	// 동명이인 체크
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

	// 계좌번호 생성
	private String createAccountNumber(int accountNum) {
		String zero = "";
		String number = String.valueOf(accountNum);
		for (int i = 1; i <= ACCOUNT_NUM_SIZE - number.length(); i++) {
			zero += "0";
		}

		return zero + accountNum;
	}

	// 계좌번호 인덱스 찾기, 없으면 NOT_FOUND (-1)반환
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
