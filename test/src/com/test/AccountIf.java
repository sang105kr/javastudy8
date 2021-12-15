package com.test;

public interface AccountIf {
	
	/**
	 * 계좌 폐지
	 * 계좌번호를 매개값으로 받아 계좌를 폐지한다.
	 * @param accountNumber 계좌번호
	 * @throws 계좌 유무체크 IllegalArgumentException, 잔액체크 IllegalStateException
	 */
	void deleteAccount(String accountNumber);

	/**
	 * 입금
	 * 입금액을 매개값으로 받아 잔액에 누적한다. 
	 * @param money 입금액
	 * @throws 양수체크, 1회입금한도 체크, 예치금액 체크 IllegalArgumentException
	 */
	void deposit(int money);

	/**
	 * 출금
	 * 출금액을 매개값으로 받아 잔액을 감액한다.
	 * @param money 출금액
	 * @throws 양수체크, 잔액체크 IllegalStateException 
	 */
	void widthdraw(int money);

	/**
	 * 조회(개별)
	 * 계좌번호를 매개값으로 받아 계좌 내역을 반환한다.
	 * @param accountNumber 계좌번호
	 * @return 계좌내역(예금주명,계좌번호,잔액)
	 * @throws 계좌 검색 실패시 IllegalArgumentException
	 */
	String showAccount(String accountNumber);

}