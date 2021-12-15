package com.kh.account;

public class Account implements AccountIf {
	
	private String accountName;		//예금주명
	private String accountNumber; //계좌번호
	private int balance;					//잔액
	
	//개설 가능한 계좌수 한도
	public static final int OPEN_ACCOUNT_LIMIT = 5;
	public static final Account[] accounts 
		= new Account[OPEN_ACCOUNT_LIMIT];
	public static final int ACCOUNT_NUM_SIZE = 3; //계좌번호 3자리
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; //1회 입금한도
	public static final int DEPOSIT_MONEY_LIMIT = 50_000;  //예치금 한도
	
	public static final int NOT_FOUND = -1;
	
	private static int cnt;					//개설된 계좌갯수 카운트
	private static int accountNum;	//계좌번호 카운트
	
	public Account() {}
	
	private Account(String accountName) {
		this.accountName = accountName;
		
		//개설 가능한 계좌수 체크
		if(cnt == OPEN_ACCOUNT_LIMIT) {
			throw new IllegalStateException("개설 가능 계좌수 초과!");
		}
		
		//동명이인 체크		
		if(existAccountName(accountName)) {
			throw new IllegalArgumentException("동명이인이 존재합니다!");
		}
		
		this.accountName = accountName;
		
		//계좌번호 생성
		this.accountNumber = createAccountNumber(++accountNum);
		accounts[cnt++] = this;
	}
	
	@Override
	public void initMenu() {
		
		
	}
	
	/**
	 * 계좌생성
	 */
	@Override
	public void createAccount(String name) {
		new Account(name);
	}

	/**
	 * 계좌 폐지
	 * 계좌번호를 매개값으로 받아 계좌를 폐지한다.
	 * @param accountNumber 계좌번호
	 * @throws 계좌 유무체크 IllegalArgumentException, 잔액체크 IllegalStateException
	 */
	@Override
	public void deleteAccount(String accountNumber) {
		//계좌가 있는지 체크
		int index = findIndex(accountNumber);
		//잔액체크
		if(accounts[index].balance > 0) {
			throw new IllegalStateException("잔액이 존재합니다 :" + accounts[index].balance);
		}
		
		for(int i=index ; i<cnt-1; i++) {
			accounts[i] = accounts[i+1];
		}
		accounts[cnt-1] = null;
		cnt--;
	}

	/**
	 * 입금
	 * 입금액을 매개값으로 받아 잔액에 누적한다. 
	 * @param money 입금액
	 * @throws 양수체크, 1회입금한도 체크, 예치금액 체크 IllegalArgumentException
	 */
	@Override
	public void deposit(int money) {
		//양수인지 체크
		if(!isPositiveMoney(money)) return;
		
		//1회 입금한도 체크 
		if(money >= ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1회 입금한도 초과 : " + ONE_TIME_MONEY_LIMIT );
		}
		//예치금액 체크
		if(balance + money > DEPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("예치금 한도 초과 : " + DEPOSIT_MONEY_LIMIT );
		}
		balance += money;
	}	
	
	/**
	 * 출금
	 * 출금액을 매개값으로 받아 잔액을 감액한다.
	 * @param money 출금액
	 * @throws 양수체크, 잔액체크 IllegalStateException 
	 */
	@Override
	public void widthdraw(int money) {
		//양수인지체크
		if(!isPositiveMoney(money)) return;
		//출금액이 잔액보다큰지
		if(money > balance) {
			throw new IllegalStateException("잔액 부족! 잔액:"+balance+", 출금액:"+money);
		}
		balance -= money;
	}

	@Override
	public String showAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAccountAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = (accountName == null) ? 0 : accountName.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sameAccount = false;
		if(obj instanceof Account) {
			if(this.accountName.equals(((Account)obj).accountName)) {
				sameAccount = true;
			}
		}
		return sameAccount;
	}

	@Override
	public String toString() {
		return "계좌 [예금주 : " + accountName + 
					 ", 계좌번호 : " + accountNumber + 
					 ", 잔액 : " + balance + "]";
	}
	
	//계좌번호 순차생성 001,002,..999
	private boolean existAccountName(String accountName) {
		boolean existAccountName = false;
		for(int i=0; i<cnt; i++) {
			if(accounts[i].accountName.equals(accountName)) {
				existAccountName = true;
				break;
			}
		}
		return existAccountName;
	}

	//양수값체크
	private boolean isPositiveMoney(int money) {
		boolean isPositiveMoney = true;
		if(money < 0) {
			isPositiveMoney = false;
			throw new IllegalArgumentException("마이너스 입금 시도!");
		}
		return isPositiveMoney;
	}
	
	//계좌번호 생성
	private String createAccountNumber(int accountNum) {
		String zero = "";
		String number = String.valueOf(accountNum);
		for(int i=1; i<=ACCOUNT_NUM_SIZE-number.length(); i++) {
			zero += "0";
		}
		
		return zero + accountNum;
	}
	
	//계좌번호로 인덱스 찾기
	private static int findIndex(String accountNumber) {
		
		int findedIndex = NOT_FOUND;
		for(int i=0; i<cnt; i++) {
			if(accounts[i].accountNumber.equals(accountNumber)) {
				findedIndex = i;
				break;
			}
		}
		if(findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("계좌정보가 없습니다!");
		}
		return findedIndex;
	}
}
