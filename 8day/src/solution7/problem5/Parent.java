package solution7.problem5;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		//super(); 부모객체 생성
		//자신의 객체를 생성
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
