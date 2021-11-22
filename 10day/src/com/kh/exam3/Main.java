package com.kh.exam3;

public class Main {

	public static void main(String[] args) {
	
		Client client = new Client();
		Admin admin = new Admin();
		
		VendingMachine vm = new VendingMachine();
		
		client.inputMoney(vm, 10000);
		client.choiceMenu(vm, 1);
		
		admin.fillBerberage(vm);
		admin.fillMoney(vm);

	}

}
