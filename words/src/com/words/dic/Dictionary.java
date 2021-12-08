package com.words.dic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary implements DicAdminIf,DicCustomerIf {

	private Map<String,String> map = new HashMap<>();
	
	//등록
	@Override
	public void put(String word, String meaning) {
		//동일단어 유무 체크해서 있으면 예외발생
		dupChk(word);
		map.put(word, meaning);
	}
	
	//수정
	@Override
	public void update(String word, String meaning) {
		//단어가 존재하는지 체크해서 없으면 예외발생
		existChk(word);
		map.put(word, meaning);

	}
	
	//삭제
	@Override
	public String remove(String word) {
		existChk(word);
		return map.remove(word);
	}
	
	//검색
	@Override
	public String find(String word) {
		existChk(word);
		return map.get(word);
	}
	
	//단어목록
	@Override
	public Set<String> listWords(){
		countCkh();
		return map.keySet();
	}
	
	//전체목록
	@Override
	public Map<String,String> listAll(){
		countCkh();
		return map;
	}
	
	//전체삭제
	@Override
	public void removeAll() {
		countCkh();
		map.clear();
	}

	//단어 중복 체크
	private void dupChk(String word) {
		if(map.containsKey(word)) {
			throw new IllegalArgumentException("이미 등록된 단어입니다");
		};
	}
	
	//단어 존재유무 체크		
	private void existChk(String word) {
		if(!map.containsKey(word)) {
			throw new IllegalArgumentException("찾고자하는 단어가 없습니다.");
		};
	}
	
	//단어갯수 체크
	private void countCkh() {
		if(map.size() == 0) {
			throw new IllegalStateException("등록된 단어가 없습니다");
		}		
	}
}





