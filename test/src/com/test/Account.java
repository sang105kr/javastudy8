package com.test;

public class Account implements AccountIf{
	private String accountName;		//�����ָ�
	private String accountNumber; //���¹�ȣ
	private int balance;					//�ܾ�
	
	//���� ������ ���¼� �ѵ�
	public static final int OPEN_ACCOUNT_LIMIT = 5;
	public static final Account[] accounts 
		= new Account[OPEN_ACCOUNT_LIMIT];
	public static final int ACCOUNT_NUM_SIZE = 3; //���¹�ȣ 3�ڸ�
	public static final int ONE_TIME_MONEY_LIMIT = 20_000; //1ȸ �Ա��ѵ�
	public static final int DEPOSIT_MONEY_LIMIT = 50_000;  //��ġ�� �ѵ�
	
	public static final int NOT_FOUND = -1;
	
	private static int cnt;					//������ ���°��� ī��Ʈ
	private static int accountNum;	//���¹�ȣ ī��Ʈ

	
	/**
	 * ���� ����
	 * ���¹�ȣ�� �Ű������� �޾� ���¸� �����Ѵ�.
	 * @param accountName �����ָ�
	 * @throws �������� ���¼� �ʰ��� IllegalStateException
	 *         �������� ����� IllegalArgumentException
	 */
	public Account(String accountName) {
		
		//���� ������ ���¼� üũ
		if(cnt == OPEN_ACCOUNT_LIMIT) {
			throw new IllegalStateException("���� ���� ���¼� �ʰ�!");
		}
		
		//�������� üũ		
		if(existAccountName(accountName)) {
			throw new IllegalArgumentException("���������� �����մϴ�!");
		}
		
		this.accountName = accountName;
		
		//���¹�ȣ ����
		this.accountNumber = createAccountNumber(++accountNum);
		accounts[cnt++] = this;
	}

	/**
	 * ���� ����
	 * ���¹�ȣ�� �Ű������� �޾� ���¸� �����Ѵ�.
	 * @param accountNumber ���¹�ȣ
	 * @throws ���� ����üũ IllegalArgumentException, �ܾ�üũ IllegalStateException
	 */
	@Override
	public void deleteAccount(String accountNumber) {
		//���°� �ִ��� üũ
		int index = findIndex(accountNumber);
		//�ܾ�üũ
		if(accounts[index].balance > 0) {
			throw new IllegalStateException("�ܾ��� �����մϴ� :" + accounts[index].balance);
		}
		
		for(int i=index ; i<cnt-1; i++) {
			accounts[i] = accounts[i+1];
		}
		accounts[cnt-1] = null;
		cnt--;
	}
	
	/**
	 * �Ա�
	 * �Աݾ��� �Ű������� �޾� �ܾ׿� �����Ѵ�. 
	 * @param money �Աݾ�
	 * @throws ���üũ, 1ȸ�Ա��ѵ� üũ, ��ġ�ݾ� üũ IllegalArgumentException
	 */
	@Override
	public void deposit(int money) {
		//������� üũ
		if(!isPositiveMoney(money)) return;
		
		//1ȸ �Ա��ѵ� üũ 
		if(money >= ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1ȸ �Ա��ѵ� �ʰ� : " + ONE_TIME_MONEY_LIMIT );
		}
		//��ġ�ݾ� üũ
		if(balance + money > DEPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("��ġ�� �ѵ� �ʰ� : " + DEPOSIT_MONEY_LIMIT );
		}
		balance += money;
	}	
	
	/**
	 * ���
	 * ��ݾ��� �Ű������� �޾� �ܾ��� �����Ѵ�.
	 * @param money ��ݾ�
	 * @throws ���üũ, �ܾ�üũ IllegalStateException 
	 */
	@Override
	public void widthdraw(int money) {
		//�������üũ
		if(!isPositiveMoney(money)) return;
		//��ݾ��� �ܾ׺���ū��
		if(money > balance) {
			throw new IllegalStateException("�ܾ� ����! �ܾ�:"+balance+", ��ݾ�:"+money);
		}
		balance -= money;
	}
	
	/**
	 * ��ȸ(����)
	 * ���¹�ȣ�� �Ű������� �޾� ���� ������ ��ȯ�Ѵ�.
	 * @param accountNumber ���¹�ȣ
	 * @return ���³���(�����ָ�,���¹�ȣ,�ܾ�)
	 * @throws ���� �˻� ���н� IllegalArgumentException
	 */
	@Override
	public String showAccount(String accountNumber) {
		
		return accounts[findIndex(accountNumber)].toString();
	}
	
	/**
	 * ��ȸ(��ü)
	 * ���� ��ü������ ��ȯ�Ѵ�.
	 * @return ���� ��ü����
	 * @throws ������ ���°� ���°�� IllegalStateException
	 */
	public static String showAccountAll() {
		if(cnt == 0) {
			throw new IllegalStateException("������ ���°� �����ϴ�.");
		}
		String str = "";
		for(AccountIf account: accounts) {
			if(account != null) {
				str += account.toString() + "\n";
			}
		}
		return str;
	}
	
	/**
	 * ���°˻�
	 * ���¹�ȣ�� �Ű������� �޾� ���¸� ��ȯ�Ѵ�.
	 * @param accountNumber ���¹�ȣ
	 * @return ����
	 * @throws ���� �˻� ���н� IllegalArgumentException
	 */
	public static AccountIf findAccount(String accountNumber) {
		
		return accounts[findIndex(accountNumber)];
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
		return "���� [������ : " + accountName + 
					 ", ���¹�ȣ : " + accountNumber + 
					 ", �ܾ� : " + balance + "]";
	}
	
	//�������� üũ
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

	//�����üũ
	private boolean isPositiveMoney(int money) {
		boolean isPositiveMoney = true;
		if(money < 0) {
			isPositiveMoney = false;
			throw new IllegalArgumentException("���̳ʽ� �Ա� �õ�!");
		}
		return isPositiveMoney;
	}
	
	//���¹�ȣ ����
	private String createAccountNumber(int accountNum) {
		String zero = "";
		String number = String.valueOf(accountNum);
		for(int i=1; i<=ACCOUNT_NUM_SIZE-number.length(); i++) {
			zero += "0";
		}
		
		return zero + accountNum;
	}
	
	//���¹�ȣ�� �ε��� ã��
	private static int findIndex(String accountNumber) {
		
		int findedIndex = NOT_FOUND;
		for(int i=0; i<cnt; i++) {
			if(accounts[i].accountNumber.equals(accountNumber)) {
				findedIndex = i;
				break;
			}
		}
		if(findedIndex == NOT_FOUND) {
			throw new IllegalArgumentException("���������� �����ϴ�!");
		}
		return findedIndex;
	}
}
