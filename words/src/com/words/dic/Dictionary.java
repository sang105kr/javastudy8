package com.words.dic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary implements DicAdminIf,DicCustomerIf {

	private Map<String,String> map = new HashMap<>();
	
	//���
	@Override
	public void put(String word, String meaning) {
		//���ϴܾ� ���� üũ�ؼ� ������ ���ܹ߻�
		dupChk(word);
		map.put(word, meaning);
	}
	
	//����
	@Override
	public void update(String word, String meaning) {
		//�ܾ �����ϴ��� üũ�ؼ� ������ ���ܹ߻�
		existChk(word);
		map.put(word, meaning);

	}
	
	//����
	@Override
	public String remove(String word) {
		existChk(word);
		return map.remove(word);
	}
	
	//�˻�
	@Override
	public String find(String word) {
		existChk(word);
		return map.get(word);
	}
	
	//�ܾ���
	@Override
	public Set<String> listWords(){
		countCkh();
		return map.keySet();
	}
	
	//��ü���
	@Override
	public Map<String,String> listAll(){
		countCkh();
		return map;
	}
	
	//��ü����
	@Override
	public void removeAll() {
		countCkh();
		map.clear();
	}

	//�ܾ� �ߺ� üũ
	private void dupChk(String word) {
		if(map.containsKey(word)) {
			throw new IllegalArgumentException("�̹� ��ϵ� �ܾ��Դϴ�");
		};
	}
	
	//�ܾ� �������� üũ		
	private void existChk(String word) {
		if(!map.containsKey(word)) {
			throw new IllegalArgumentException("ã�����ϴ� �ܾ �����ϴ�.");
		};
	}
	
	//�ܾ�� üũ
	private void countCkh() {
		if(map.size() == 0) {
			throw new IllegalStateException("��ϵ� �ܾ �����ϴ�");
		}		
	}
}





