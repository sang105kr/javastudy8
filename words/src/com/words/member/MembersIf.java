package com.words.member;

import java.util.Map.Entry;
import java.util.Set;

public interface MembersIf {

	/**
	 * 회원 가입
	 * @param id 회원 아이디
	 * @param pw 회원 비밀번호
	 */
	void joinMember(String id, String pw);

	/**
	 * 회원 인증
	 * @param id 아이디
	 * @param pw 비밀번호
	 * @return 회원인증(인증실패,관리자,일반회원)
	 */
	LoginChk isMember(String id, String pw);

	/**
	 * 회원 탈퇴
	 * @param id 아이디
	 * @param pw 비밀번호
	 * @return 탈퇴성공유무
	 */
	boolean outMember(String id, String pw);
	
	/**
	 * 회원 현황
	 * @return
	 */
	Set<Entry<String,String>> getMembers();

}