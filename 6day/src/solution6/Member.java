package solution6;
/*
 * ȸ��
 */
public class Member extends Object{
	String name;			//�̸�
	String id;				//���̵�
	String password; 	//�н�����
	int age;					//����
	
	public Member() {
		super();
	}
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void smile() {
		System.out.println(name+"�� ����");
	}
}
