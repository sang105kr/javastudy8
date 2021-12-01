package com.words;

import java.util.Scanner;

public class Menu {

	private Members members = new Members();
	private Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		super();
	}
	
	//초기메뉴
	public void initMenu() {
		String choiceNum = null;
		String id = null;
		String pw = null;
		boolean stop = false;
		
		while(!stop) {
			System.out.println("1.로그인 2.가입 0.종료");
			System.out.print("선택 > ");
			choiceNum = scanner.nextLine();
			switch (choiceNum) {
			case "1": //로그인
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("Pw : ");
				pw = scanner.nextLine();
				
				LoginChk loginChk = members.isMember(id, pw);
				
				switch (loginChk) {
				case ADMIN: //관리자
					adminMenu();
					break;
				case MEMBER://회원
					customerMenu();
					break;
				case FAIL:	//인증실패
					continue;
				default:
					break;
				}
				
				break;
			case "2": //가입
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("Pw : ");
				pw = scanner.nextLine();
				
				members.joinMember(id, pw);
				System.out.println("회원가입 되었습니다.");
				
				break;
			case "0": //종료	
				stop = true;
				System.exit(0);
				break;
	
			default:
				break;
			}	// end of switch
		} // end of while	
	} // end of initMenu()
	
	//관리자용메뉴
	public void adminMenu() {
		System.out.println("1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 7.전체삭제 0.로그아웃 ");	
	}
	
	//사용자메뉴
	public void customerMenu() {
		System.out.println("1.검색 2.단어목록 0.로그아웃");
	}
}
