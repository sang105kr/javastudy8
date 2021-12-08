package com.words.member;

import java.util.Map.Entry;
import java.util.Set;

public interface MembersIf {

	/**
	 * ȸ�� ����
	 * @param id ȸ�� ���̵�
	 * @param pw ȸ�� ��й�ȣ
	 */
	void joinMember(String id, String pw);

	/**
	 * ȸ�� ����
	 * @param id ���̵�
	 * @param pw ��й�ȣ
	 * @return ȸ������(��������,������,�Ϲ�ȸ��)
	 */
	LoginChk isMember(String id, String pw);

	/**
	 * ȸ�� Ż��
	 * @param id ���̵�
	 * @param pw ��й�ȣ
	 * @return Ż�𼺰�����
	 */
	boolean outMember(String id, String pw);
	
	/**
	 * ȸ�� ��Ȳ
	 * @return
	 */
	Set<Entry<String,String>> getMembers();

}