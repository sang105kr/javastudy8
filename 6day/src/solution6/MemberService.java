package solution6;

public class MemberService {
	
	//�α���
	public boolean login(String id,String password) {
		boolean result = false;
		
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}
		
		return result;
	}
	
	//�α׾ƿ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
