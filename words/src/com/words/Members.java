package com.words;

import java.util.HashMap;
import java.util.Map;

public class Members {

	private Map<String,String> map = new HashMap<>();
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "1234";
	
	public Members() {
		map.put(ADMIN_ID, ADMIN_PW);
	}
	
	
	/**
	 * ȸ�� ����
	 * @param id ȸ�� ���̵�
	 * @param pw ȸ�� ��й�ȣ
	 */
	public void joinMember(String id, String pw) {
		//���̵� �ߺ�üũ
		if(map.containsKey(id)) {
			throw new IllegalStateException("ȸ�� ���̵�� ����Ҽ� �����ϴ�!");
		}
		map.put(id, pw);
	}
	
	//ȸ�� ����
	public boolean isMember(String id, String pw) {
		boolean isMember = false;
		if(map.get(id).equals(pw)) {
			isMember = true;
		}
		return isMember;
	}
		
	//ȸ�� Ż��
}







