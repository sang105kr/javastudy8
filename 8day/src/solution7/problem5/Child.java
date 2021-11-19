package solution7.problem5;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		//super();
		//자신의 객체를 생성
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
