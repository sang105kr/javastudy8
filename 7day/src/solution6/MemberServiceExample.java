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
			System.out.println("1.�α��� 2.�α׾ƿ� 3.����");
			System.out.print("����>");
			selectedNumber = scanner.nextLine();
			
			switch(selectedNumber) {
			case "0": //����
				stop = true; continue;
			case "1": //�α���
				if(loginOk) {
					System.out.println("�̷̹α��� �ϼ̽��ϴ�.");
					continue;
				}
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();
				
				result = memberService.login(id, pw);				
				
				if(result == LoginChk.OK) { //����
					loginOk = true;
					System.out.println("�α��� �Ǿ����ϴ�.");
				}else if(result == LoginChk.NOK){//����
					loginOk = false;
					System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
				}else if(result == LoginChk.FAIL) {//3������
					loginOk = false;	
					stop = true;
					System.out.println("�α��� 3�� �����߽��ϴ�!");
				}
				
				break;
			case "2": //�α׾ƿ�
				if(loginOk) {
					memberService.logout(id);
					loginOk = false;
				}else {
					System.out.println("�α������� ���� �����Դϴ�!");
				}
				break;
			default:
					continue;
			}
			
		}
		System.out.println("���α׷�����!");
	}
}
