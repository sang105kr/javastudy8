package com.words.user;

import java.util.Set;

import com.words.dic.DicCustomerIf;

public class Customer extends User {
	
	private DicCustomerIf dictionary;
	
	public Customer(DicCustomerIf dictionary) {
		this.dictionary = dictionary;
	}
	
	//단어검색
	public String find(String word) {
		return dictionary.find(word);
	}
	
	//단어목록
	public Set<String> listWords() {
		return dictionary.listWords();
	}
}
