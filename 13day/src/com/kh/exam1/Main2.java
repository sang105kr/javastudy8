package com.kh.exam1;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		
		Set<String> setA = new HashSet<>();
		Set<String> setB = new HashSet<>();
		
		setA.add(new String("사과"));
		setA.add(new String("바나나"));
		setA.add(new String("딸기"));
		setA.add(new String("배"));
		System.out.println(setA);
		
		setB.add(new String("배추"));
		setB.add(new String("무우"));
		setB.add(new String("깻잎"));
		setB.add(new String("배"));
		
		//합집합
//		setA.addAll(setB);
//		System.out.println(setA);
		
		//교집합
//		setA.retainAll(setB);
//		System.out.println(setA);
		
		//차집합
//		setA.removeAll(setB);
//		System.out.println(setA);

	}

}
