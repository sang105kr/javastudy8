package com.kh.exam4;

public class Client extends Person {
	private ForCustomer forCustomer;
	
	public Client(ForCustomer forCustomer) {
		this.forCustomer = forCustomer;
	}
	
	//자판기에 현금 투입하기
	void inputMoney(int money) {
		forCustomer.inputMoney(money);
	}
	//메뉴선택
	void choiceMenu(int button) {
		forCustomer.menuChoice(button);
	}
	
	//음료채우기
	void fillBerverage() {
		if(forCustomer instanceof VendingMachine) {
			VendingMachine vm = (VendingMachine)forCustomer;
			vm.fillBerverage();
		}
	}
}
