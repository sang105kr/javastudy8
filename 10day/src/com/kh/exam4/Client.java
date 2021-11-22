package com.kh.exam4;

public class Client extends Person {
	private ForCustomer forCustomer;
	
	public Client(ForCustomer forCustomer) {
		this.forCustomer = forCustomer;
	}
	
	//���Ǳ⿡ ���� �����ϱ�
	void inputMoney(int money) {
		forCustomer.inputMoney(money);
	}
	//�޴�����
	void choiceMenu(int button) {
		forCustomer.menuChoice(button);
	}
	
	//����ä���
	void fillBerverage() {
		if(forCustomer instanceof VendingMachine) {
			VendingMachine vm = (VendingMachine)forCustomer;
			vm.fillBerverage();
		}
	}
}
