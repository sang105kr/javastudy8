package com.words;

import java.util.Map;

public interface DicAdminIf extends DicCommonIf {

	//���
	void put(String word, String meaning);

	//����
	void update(String word, String meaning);

	//����
	String remove(String word);

	//��ü���
	Map<String, String> listAll();

	//��ü����
	void removeAll();

}