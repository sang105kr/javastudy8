package com.words.user;

import java.util.Map;
import java.util.Set;

import com.words.dic.DicAdminIf;

public class Admin extends User {

	private DicAdminIf dictionary;
	
	public Admin(DicAdminIf dictionary) {
		this.dictionary = dictionary;
	}
	
	//등록
	public void put(String word,String meaning) {
		dictionary.put(word, meaning);
	}
	
	//수정
	public void udate(String word,String meaning) {
		dictionary.update(word, meaning);
	}
	
	//삭제
	public void remove(String word) {
		dictionary.remove(word);
	}
	
	//검색
	public String find(String word) {
		return dictionary.find(word);
	}
	
	//단어목록
	public Set<String> listWords() {
		return dictionary.listWords();
	}
	
	//전체목록
	public Map<String,String> listAll(){
		return dictionary.listAll();
	}
	
	//전체삭제
	public void removeAll() {
		dictionary.removeAll();
	}

}
