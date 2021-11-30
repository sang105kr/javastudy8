package com.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary implements DicAdminIf,DicCustomerIf {

	private Map<String,String> map = new HashMap<>();
	
	//등록
	@Override
	public void put(String word, String meaning) {
		map.put(word, meaning);
	}
	
	//수정
	@Override
	public void update(String word, String meaning) {
		if(map.containsKey(word)) {
			map.put(word, meaning);
		}
	}
	
	//삭제
	@Override
	public String remove(String word) {
		return map.remove(word);
	}
	
	//검색
	@Override
	public String find(String word) {
		String meaning = map.get(word);
		if(meaning == null) {
			throw new IllegalArgumentException("찾고자하는 단어가 없습니다.");
		}
		return meaning;
	}
	
	//단어목록
	@Override
	public Set<String> listWords(){
		if(map.size() == 0) {
			throw new IllegalStateException("등록된 단어가 없습니다");
		}
		return map.keySet();
	}
	
	//전체목록
	@Override
	public Map<String,String> listAll(){
		if(map.size() == 0) {
			throw new IllegalStateException("등록된 단어가 없습니다");
		}		
		return map;
	}
	
	//전체삭제
	@Override
	public void removeAll() {
		map.clear();
	}
			
}





