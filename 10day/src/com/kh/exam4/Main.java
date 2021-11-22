package com.kh.exam4;

public class Main {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
	
		Client client = new Client(vm);
		Admin admin = new Admin();
		
		client.inputMoney(10000);
		client.choiceMenu(1);
		client.fillBerverage();
		
		admin.fillBerberage(vm);
		admin.fillMoney(vm);

	}

}
