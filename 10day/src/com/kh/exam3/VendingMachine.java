package com.kh.exam3;

public class VendingMachine implements ForAll {

	private int money;   //�����ѵ�
	private int button;  //�����Ѹ޴�
	
	@Override
	public void fillBerverage() {
		System.out.println("���Ḧ ä���");
	}

	@Override
	public void fillMoney() {
		System.out.println("�Ž������� ä���");
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
	}

	@Override
	public void menuChoice(int button) {
		this.button = button;
	}

}
