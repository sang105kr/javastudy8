package com.kh.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		
		//등록
		map.put("person","사람");
		map.put("student","학생");
		map.put("teacher","선생님");
		
		//전체조회
		Set<Entry<String, String>> set = map.entrySet();
		wordList(set);
		
		//단어조회
		String meaning = map.get("person");
		System.out.println(meaning);
		
		//단어삭제
		map.remove("teacher");
		wordList(set);
		
		//단어수정
		String keyworkd = "student";
		meaning = "학생(수정)";
		if(map.containsKey(keyworkd)) {
			map.put(keyworkd, meaning);
		}
		wordList(set);
		
		//단어목록 추출
		Set<String> words = map.keySet();
		for(String word : words) {
			System.out.printf("%s \t",word);
		}
		System.out.println();
		
	}

	private static void wordList(Set<Entry<String, String>> set) {
		for(Entry<String, String> ele : set) {
			String key = ele.getKey();
			String value = ele.getValue();
			System.out.printf("단어:%s, 의미:%s \n", key, value);
		}
	}
}
