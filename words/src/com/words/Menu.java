package com.words;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);
	
	//초기메뉴
	public void initMenu() {
		String choiceNum = null;
		String id = null;
		String pw = null;
		
		System.out.println("1.로그인 2.가입 0.종료");
		System.out.print("선택 > ");
		choiceNum = scanner.nextLine();
		switch (choiceNum) {
		case "1": //로그인
			System.out.print("ID : ");
			id = scanner.nextLine();
			System.out.print("Pw : ");
			pw = scanner.nextLine();
			
			break;
		case "2": //가입
			
			break;
		case "3": //종료	
			System.exit(0);
			break;

		default:
			break;
		}		
	}
	
	//관리자용메뉴
	public void adminMenu() {
		System.out.println("1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 7.전체삭제 0.로그아웃 ");	
	}
	
	//사용자메뉴
	public void customerMenu() {
		System.out.println("1.검색 2.단어목록 0.로그아웃");
	}
}
