package solution6;

public class MemberService {
	
	private int failCount;
	
	//로그인
	public int login(String id,String password) {
		int result = 0; //실패
		
		if(id.equals("hong") && password.equals("12345")) {
			result = 1;   //성공
			failCount = 0;
		}else {
			if(++failCount == 3) { 
				result = -1; //3번실패한경우
			}else {
				result = 0;  //실패				
			}
		}
		
		return result;
	}
	
	//로그아웃
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
