package solution7.problem5;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		//super(); �θ�ü ����
		//�ڽ��� ��ü�� ����
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
