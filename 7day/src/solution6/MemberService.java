package solution6;

public class MemberService {
	
	private int failCount;										//로긴실패회수카운터
	private final String ID = "hong";					//아이디
	private final String PASSWORD = "12345";	//비밀번호
	
	//로그인
	public LoginChk login(String id,String password) {
		LoginChk result = null;
		
		if(id.equals(ID) && password.equals(PASSWORD)) {
			result = LoginChk.OK;   //성공
			failCount = 0;
		}else {
			if(++failCount == 3) { 
				result = LoginChk.FAIL; //3번실패한경우
			}else {
				result = LoginChk.NOK;  //실패				
			}
		}
		
		return result;
	}
	
	//로그아웃
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
