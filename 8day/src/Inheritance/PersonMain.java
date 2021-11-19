package Inheritance;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		
		Student s1 = new Student();
		s1.name = "È«±æµ¿";
		s1.age = 30;
		s1.smile();
		s1.eat();
		s1.study();
		
		Student s2 = new Student();
		s2.name = "È«±æ¼ø";
		s2.age = 20;
		s2.smile();
		s2.eat();
		s2.study();
		
		
	}

}
