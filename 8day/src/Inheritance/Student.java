package Inheritance;

public class Student extends Person {
	
	int hakbun;
	
	public Student() {
		//super();
	}
	
	public Student(String name, int age) {
		super(name,age);
	}
		
	public void study() {
		System.out.println("�����ϴ�");
	}

	@Override
	protected void eat() {
		super.eat();
		System.out.println("�� �Դ´�");
	}
}
