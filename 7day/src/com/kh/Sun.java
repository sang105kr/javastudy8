package com.kh;
/*
 * �̱��� : ��ü�� 1���� �����ϰ��� �Ҷ� ����ϴ� ������ ����
 * 
 * 1. �ܺο��� �����ڸ� ȣ������ ���ϵ��� �����ڸ� private�� �����.
 * 2. ���ο��� ��ü�� �����ϰ� public static �ʵ尡 �����ϰ��Ѵ�.
 * 3. �ܺο��� ���ο��� ������ ��ü�� �����ϵ��� public static�޼ҵ�� �����.
 */
public class Sun {
	
	private static Sun sun = new Sun();
	
	private Sun() {
		super();
	}
	
	public static Sun getIntance() {
		return sun;
	}

}
