package solution6;

public class MemberService {
	
	private int failCount;
	
	//�α���
	public int login(String id,String password) {
		int result = 0; //����
		
		if(id.equals("hong") && password.equals("12345")) {
			result = 1;   //����
			failCount = 0;
		}else {
			if(++failCount == 3) { 
				result = -1; //3�������Ѱ��
			}else {
				result = 0;  //����				
			}
		}
		
		return result;
	}
	
	//�α׾ƿ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
