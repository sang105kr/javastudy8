package Inheritance;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.age = 30;
		s1.smile();
		s1.eat();
		s1.study();
		
		Student s2 = new Student();
		s2.name = "ȫ���";
		s2.age = 20;
		s2.smile();
		s2.eat();
		s2.study();
		
		
	}

}
