package com.words.user;

import java.util.Set;

import com.words.dic.DicCustomerIf;

public class Customer extends User {
	
	private DicCustomerIf dictionary;
	
	public Customer(DicCustomerIf dictionary) {
		this.dictionary = dictionary;
	}
	
	//�ܾ�˻�
	public String find(String word) {
		return dictionary.find(word);
	}
	
	//�ܾ���
	public Set<String> listWords() {
		return dictionary.listWords();
	}
}
