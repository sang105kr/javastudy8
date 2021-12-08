package com.words.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Members implements MembersIf{

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
	@Override
	public void joinMember(String id, String pw) {
		//아이디 중복체크
		if(map.containsKey(id)) {
			throw new IllegalStateException("회원 아이디로 사용할수 없습니다!");
		}
		map.put(id, pw);
	}
	
	/**
	 * 회원 인증
	 * @param id 아이디
	 * @param pw 비밀번호
	 * @return 회원인증(인증실패,관리자,일반회원)
	 */
	@Override
	public LoginChk isMember(String id, String pw) {
		LoginChk loginChk = null;
		
		//찾고자 하는 아이디가 없는경우
		if(map.get(id) == null) {
			loginChk = LoginChk.FAIL;
			return LoginChk.FAIL;
		}
		
		//관리자
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PW)) {
			loginChk = LoginChk.ADMIN;
			
		//일반회원
		}else if(map.get(id).equals(pw)) {
			loginChk = LoginChk.MEMBER;
		}
		
		return loginChk;
	}
		
	/**
	 * 회원 탈퇴
	 * @param id 아이디
	 * @param pw 비밀번호
	 * @return 탈퇴성공유무
	 */
	@Override
	public boolean outMember(String id, String pw) {
		boolean result = false;
		//회원존재하면
		if(map.get(id).equals(pw)) {
			map.remove(id);
			result = true;
		}
		return result;
	}
	
	/**
	 * 회원현황
	 */
	@Override
	public Set<Entry<String, String>> getMembers() {
		Map<String,String> map = new HashMap<>();
		map.putAll(this.map);
		map.remove(ADMIN_ID);
		return map.entrySet();
	}
}







