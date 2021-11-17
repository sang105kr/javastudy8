package solution6;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		String selectedNumber = null;
		String id = null;
		String pw = null;
		boolean loginOk = false;
		LoginChk result = null;
		
		while(!stop) {
			System.out.println("1.로그인 2.로그아웃 3.종료");
			System.out.print("선택>");
			selectedNumber = scanner.nextLine();
			
			switch(selectedNumber) {
			case "0": //종료
				stop = true; continue;
			case "1": //로그인
				if(loginOk) {
					System.out.println("이미로그인 하셨습니다.");
					continue;
				}
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();
				
				result = memberService.login(id, pw);				
				
				if(result == LoginChk.OK) { //성공
					loginOk = true;
					System.out.println("로그인 되었습니다.");
				}else if(result == LoginChk.NOK){//실패
					loginOk = false;
					System.out.println("id 또는 password가 올바르지 않습니다");
				}else if(result == LoginChk.FAIL) {//3번실패
					loginOk = false;	
					stop = true;
					System.out.println("로그인 3번 실패했습니다!");
				}
				
				break;
			case "2": //로그아웃
				if(loginOk) {
					memberService.logout(id);
					loginOk = false;
				}else {
					System.out.println("로그인하지 않은 상태입니다!");
				}
				break;
			default:
					continue;
			}
			
		}
		System.out.println("프로그램종료!");
	}
}
