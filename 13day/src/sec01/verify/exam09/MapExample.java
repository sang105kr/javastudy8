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
		
		//전체요소 순회하기
		//맵을 전체순회할때는 set로 변환후 순회함.
//		Set<Entry<String, Integer>> set = map.entrySet();
//
//		for(Entry<String, Integer> ele : set) {
		for(Entry<String, Integer> ele : map.entrySet()) {
			cnt++;
			//요소의 값을 읽어오기
			//읽어온 요소값 누적하기
			totalScore += ele.getValue();
			
			//첫번째요소의 값을 최대값으로 가정하고 순차비교
			if(cnt == 1) {
				mvp = ele;
			}else {
				if(mvp.getValue() < ele.getValue()) {					
					mvp = ele;
				}
			}
		}
		//평균 : 누적된 합계를 요소수로 나누기
		avg = (double)totalScore / map.size();
		//최대점수
		maxScore = mvp.getValue();
		//최대득점자
		name = mvp.getKey();
		
		System.out.println("총점 = " + totalScore);
		System.out.println("평균 = " + avg);
		System.out.println("최고점수 = " + maxScore);
		System.out.println("최고득점자 = " + name);

	}

}






