package com.kh.exam7;

public class TryCatchFinally {

	public static void main(String[] args) {

			String[] strArray = { "10", "2a" };
			int value = 0;
			
			for(int i=0; i<=2; i++ ) {
				
				try {
					value = Integer.parseInt(strArray[i]);
				} catch (ArrayIndexOutOfBoundsException e) { 
					System.out.println("�ε����� �ʰ�����");
			  } catch (NumberFormatException e) {
					System.out.println("���ڷ� ��Ȱ�� �� ����");
				} finally {
					System.out.println(value);
				}
			}
	}
}
