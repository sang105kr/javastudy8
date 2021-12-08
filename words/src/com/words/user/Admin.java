package com.words.user;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.words.dic.DicAdminIf;
import com.words.member.MembersIf;

public class Admin extends User {

	private DicAdminIf dictionary;
	private MembersIf members;
	
	public Admin(DicAdminIf dictionary, MembersIf members) {
		this.dictionary = dictionary;
		this.members = members;
	}
	
	//ȸ����Ȳ
	public void getMembers() {
		for(Entry<String,String> entry : members.getMembers()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
	
	//���
	public void put(String word,String meaning) {
		dictionary.put(word, meaning);
	}
	
	//����
	public void udate(String word,String meaning) {
		dictionary.update(word, meaning);
	}
	
	//����
	public void remove(String word) {
		dictionary.remove(word);
	}
	
	//�˻�
	public String find(String word) {
		return dictionary.find(word);
	}
	
	//�ܾ���
	public Set<String> listWords() {
		return dictionary.listWords();
	}
	
	//��ü���
	public Map<String,String> listAll(){
		return dictionary.listAll();
	}
	
	//��ü����
	public void removeAll() {
		dictionary.removeAll();
	}

}
