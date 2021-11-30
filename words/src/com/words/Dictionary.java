package com.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary implements DicAdminIf,DicCustomerIf {

	private Map<String,String> map = new HashMap<>();
	
	//���
	@Override
	public void put(String word, String meaning) {
		map.put(word, meaning);
	}
	
	//����
	@Override
	public void update(String word, String meaning) {
		if(map.containsKey(word)) {
			map.put(word, meaning);
		}
	}
	
	//����
	@Override
	public String remove(String word) {
		return map.remove(word);
	}
	
	//�˻�
	@Override
	public String find(String word) {
		String meaning = map.get(word);
		if(meaning == null) {
			throw new IllegalArgumentException("ã�����ϴ� �ܾ �����ϴ�.");
		}
		return meaning;
	}
	
	//�ܾ���
	@Override
	public Set<String> listWords(){
		if(map.size() == 0) {
			throw new IllegalStateException("��ϵ� �ܾ �����ϴ�");
		}
		return map.keySet();
	}
	
	//��ü���
	@Override
	public Map<String,String> listAll(){
		if(map.size() == 0) {
			throw new IllegalStateException("��ϵ� �ܾ �����ϴ�");
		}		
		return map;
	}
	
	//��ü����
	@Override
	public void removeAll() {
		map.clear();
	}
			
}





