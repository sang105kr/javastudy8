package solution6;

public class MemberService {
	
	private int failCount;										//�α����ȸ��ī����
	private final String ID = "hong";					//���̵�
	private final String PASSWORD = "12345";	//��й�ȣ
	
	//�α���
	public LoginChk login(String id,String password) {
		LoginChk result = null;
		
		if(id.equals(ID) && password.equals(PASSWORD)) {
			result = LoginChk.OK;   //����
			failCount = 0;
		}else {
			if(++failCount == 3) { 
				result = LoginChk.FAIL; //3�������Ѱ��
			}else {
				result = LoginChk.NOK;  //����				
			}
		}
		
		return result;
	}
	
	//�α׾ƿ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
