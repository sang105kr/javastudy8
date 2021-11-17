package com.kh;
/*
 * 싱글톤 : 객체를 1개만 생성하고자 할때 사용하는 디자인 패턴
 * 
 * 1. 외부에서 생성자를 호출하지 못하도록 생성자를 private로 만든다.
 * 2. 내부에서 객체를 생성하고 public static 필드가 참조하게한다.
 * 3. 외부에서 내부에서 생성된 객체를 참조하도록 public static메소드들 만든다.
 */
public class Sun {
	
	private static Sun sun = new Sun();
	
	private Sun() {
		super();
	}
	
	public static Sun getIntance() {
		return sun;
	}

}
