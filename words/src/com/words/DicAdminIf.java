package com.words;

import java.util.Map;

public interface DicAdminIf extends DicCommonIf {

	//등록
	void put(String word, String meaning);

	//수정
	void update(String word, String meaning);

	//삭제
	String remove(String word);

	//전체목록
	Map<String, String> listAll();

	//전체삭제
	void removeAll();

}