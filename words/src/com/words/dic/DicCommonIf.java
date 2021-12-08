package com.words.dic;

import java.util.Set;

public interface DicCommonIf {

	//검색
	String find(String word);

	//단어목록
	Set<String> listWords();

}