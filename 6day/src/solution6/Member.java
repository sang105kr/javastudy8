package solution6;
/*
 * 회원
 */
public class Member extends Object{
	String name;			//이름
	String id;				//아이디
	String password; 	//패스워드
	int age;					//나이
	
	public Member() {
		super();
	}
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void smile() {
		System.out.println(name+"가 웃다");
	}
}
