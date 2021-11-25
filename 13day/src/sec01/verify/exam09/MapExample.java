package sec01.verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		double avg = 0.0;
		
		int cnt = 0;
		Entry<String, Integer> mvp = null;
		
		//��ü��� ��ȸ�ϱ�
		//���� ��ü��ȸ�Ҷ��� set�� ��ȯ�� ��ȸ��.
//		Set<Entry<String, Integer>> set = map.entrySet();
//
//		for(Entry<String, Integer> ele : set) {
		for(Entry<String, Integer> ele : map.entrySet()) {
			cnt++;
			//����� ���� �о����
			//�о�� ��Ұ� �����ϱ�
			totalScore += ele.getValue();
			
			//ù��°����� ���� �ִ밪���� �����ϰ� ������
			if(cnt == 1) {
				mvp = ele;
			}else {
				if(mvp.getValue() < ele.getValue()) {					
					mvp = ele;
				}
			}
		}
		//��� : ������ �հ踦 ��Ҽ��� ������
		avg = (double)totalScore / map.size();
		//�ִ�����
		maxScore = mvp.getValue();
		//�ִ������
		name = mvp.getKey();
		
		System.out.println("���� = " + totalScore);
		System.out.println("��� = " + avg);
		System.out.println("�ְ����� = " + maxScore);
		System.out.println("�ְ������ = " + name);

	}

}






