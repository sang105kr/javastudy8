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
	 * 회원 가입
	 * @param id 회원 아이디
	 * @param pw 회원 비밀번호
	 */
	public void joinMember(String id, String pw) {
		//아이디 중복체크
		if(map.containsKey(id)) {
			throw new IllegalStateException("회원 아이디로 사용할수 없습니다!");
		}
		map.put(id, pw);
	}
	
	//회원 인증
	public boolean isMember(String id, String pw) {
		boolean isMember = false;
		if(map.get(id).equals(pw)) {
			isMember = true;
		}
		return isMember;
	}
		
	//회원 탈퇴
}







