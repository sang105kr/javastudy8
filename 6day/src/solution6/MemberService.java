package solution6;

public class MemberService {
	
	//로그인
	public boolean login(String id,String password) {
		boolean result = false;
		
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}
		
		return result;
	}
	
	//로그아웃
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
