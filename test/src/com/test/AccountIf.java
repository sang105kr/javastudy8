package com.test;

public interface AccountIf {
	
	/**
	 * ���� ����
	 * ���¹�ȣ�� �Ű������� �޾� ���¸� �����Ѵ�.
	 * @param accountNumber ���¹�ȣ
	 * @throws ���� ����üũ IllegalArgumentException, �ܾ�üũ IllegalStateException
	 */
	void deleteAccount(String accountNumber);

	/**
	 * �Ա�
	 * �Աݾ��� �Ű������� �޾� �ܾ׿� �����Ѵ�. 
	 * @param money �Աݾ�
	 * @throws ���üũ, 1ȸ�Ա��ѵ� üũ, ��ġ�ݾ� üũ IllegalArgumentException
	 */
	void deposit(int money);

	/**
	 * ���
	 * ��ݾ��� �Ű������� �޾� �ܾ��� �����Ѵ�.
	 * @param money ��ݾ�
	 * @throws ���üũ, �ܾ�üũ IllegalStateException 
	 */
	void widthdraw(int money);

	/**
	 * ��ȸ(����)
	 * ���¹�ȣ�� �Ű������� �޾� ���� ������ ��ȯ�Ѵ�.
	 * @param accountNumber ���¹�ȣ
	 * @return ���³���(�����ָ�,���¹�ȣ,�ܾ�)
	 * @throws ���� �˻� ���н� IllegalArgumentException
	 */
	String showAccount(String accountNumber);

}