package com.kh;
/*
 * ���ڿ� �񱳴� == (x)
 * equals()�޼ҵ� ����Ұ�!!
 */
public class Equal {

	public static void main(String[] args) {
		String name = "ȫ�浿";		
		String name2 = "ȫ�浿";
		
		if(name == name2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(name.equals(name2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		
		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");
		
		if(name3 == name4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(name3.equals(name4)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}		
	}
}
