package com.words.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.words.dic.Dictionary;
import com.words.member.LoginChk;
import com.words.member.Members;
import com.words.member.MembersIf;
import com.words.user.Admin;
import com.words.user.Customer;

public class Menu {

	private MembersIf members;				//회원
	private Dictionary dictionary;		//사전
	private Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		super();
		this.members = new Members();
		this.dictionary =  new Dictionary();
	}
	
	//초기메뉴
	public void initMenu() {
		String choiceNum = null;
		String id = null;
		String pw = null;
		boolean stop = false;
		
		while(!stop) {
			try {
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
						System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
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
					System.out.println("프로그램 종료!");
					System.exit(0);
					break;

				default:
					break;
				}	// end of switch
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // end of while	
	} // end of initMenu()
	
	//관리자용메뉴
	public void adminMenu() {
		Admin admin = new Admin(dictionary,members);
		
		boolean stop = false;
		String choiceNum = null;		//선택된 메뉴번호
		String word = null;					//단어
		String meaning = null;			//의미
				
		while(!stop) {
			try {
				System.out.println("1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 7.전체삭제 8.회원정보 0.로그아웃 ");
				System.out.print("선택 > ");
				choiceNum = scanner.nextLine();
				
				switch (choiceNum) {
				case "1": //등록
					System.out.print("단어 > ");
					word = scanner.nextLine();
					System.out.print("의미 > ");
					meaning = scanner.nextLine();
					admin.put(word, meaning);
					break;
				case "2":	//수정
					System.out.print("단어 > ");
					word = scanner.nextLine();
					System.out.print("의미 > ");
					meaning = scanner.nextLine();
					admin.udate(word, meaning);
					break;
				case "3": //검색
					System.out.print("단어 > ");
					word = scanner.nextLine();
					System.out.println("뜻 > " + admin.find(word));
					break;
				case "4": //삭제
					System.out.print("단어 > ");
					word = scanner.nextLine();
					admin.remove(word);
					break;
				case "5": //단어목록
					System.out.println("단어목록 > ");
					for(String w : admin.listWords()) {
						System.out.println(w);
					};
					break;
				case "6": //단어전체목록
					System.out.println("전체목록 > ");
					Set<Entry<String,String>> set = admin.listAll().entrySet();
					for(Entry<String,String> entry : set ) {
						System.out.println(entry.getKey() + "-" + entry.getValue());
					}				
					break;
				case "7":
					admin.removeAll();
					System.out.println("전체 삭제 되었습니다.");
					break;
				case "8":
					System.out.println("회원현황 >");
					admin.getMembers();
					break;
				case "0": //로그아웃
					stop = true;
					break;
	
				default:
					break;
				}//end of switch
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}// end of try~catch
		}// end of while()
	}//end of adminMenu()
	
	//사용자메뉴
	public void customerMenu() {
		
		Customer customer = new Customer(dictionary);
		
		boolean stop = false;
		String choiceNum = null;		//선택된 메뉴번호
		String word = null;					//단어
		String meaning = null;			//의미
		
		while(!stop) {
			try {
				System.out.println("1.검색 2.단어목록 0.로그아웃");
				System.out.print("선택 > ");
				choiceNum = scanner.nextLine();
				
				switch (choiceNum) {
				case "1": //검색			
					System.out.print("단어 > ");
					word = scanner.nextLine();
					System.out.println("뜻 > " + customer.find(word));				
					break;
				case "2": //단어목록
					System.out.println("단어목록 > ");
					for(String w : customer.listWords()) {
						System.out.println(w);
					};				
					break;
				case "0": //로그아웃
					stop = true;
					break;

				default:
					break;
				}//end of switch	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}// end of while()
	}//end of customerMenu()
}//end of main()
















