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

	private MembersIf members;				//ȸ��
	private Dictionary dictionary;		//����
	private Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		super();
		this.members = new Members();
		this.dictionary =  new Dictionary();
	}
	
	//�ʱ�޴�
	public void initMenu() {
		String choiceNum = null;
		String id = null;
		String pw = null;
		boolean stop = false;
		
		while(!stop) {
			try {
				System.out.println("1.�α��� 2.���� 0.����");
				System.out.print("���� > ");
				choiceNum = scanner.nextLine();
				switch (choiceNum) {
				case "1": //�α���
					System.out.print("ID : ");
					id = scanner.nextLine();
					System.out.print("Pw : ");
					pw = scanner.nextLine();
					
					LoginChk loginChk = members.isMember(id, pw);
					
					switch (loginChk) {
					case ADMIN: //������
						adminMenu();
						break;
					case MEMBER://ȸ��
						customerMenu();
						break;
					case FAIL:	//��������
						System.out.println("���̵� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
						continue;
					default:
						break;
					}
					
					break;
				case "2": //����
					System.out.print("ID : ");
					id = scanner.nextLine();
					System.out.print("Pw : ");
					pw = scanner.nextLine();
					
					members.joinMember(id, pw);
					System.out.println("ȸ������ �Ǿ����ϴ�.");
					
					break;
				case "0": //����	
					stop = true;
					System.out.println("���α׷� ����!");
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
	
	//�����ڿ�޴�
	public void adminMenu() {
		Admin admin = new Admin(dictionary,members);
		
		boolean stop = false;
		String choiceNum = null;		//���õ� �޴���ȣ
		String word = null;					//�ܾ�
		String meaning = null;			//�ǹ�
				
		while(!stop) {
			try {
				System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 7.��ü���� 8.ȸ������ 0.�α׾ƿ� ");
				System.out.print("���� > ");
				choiceNum = scanner.nextLine();
				
				switch (choiceNum) {
				case "1": //���
					System.out.print("�ܾ� > ");
					word = scanner.nextLine();
					System.out.print("�ǹ� > ");
					meaning = scanner.nextLine();
					admin.put(word, meaning);
					break;
				case "2":	//����
					System.out.print("�ܾ� > ");
					word = scanner.nextLine();
					System.out.print("�ǹ� > ");
					meaning = scanner.nextLine();
					admin.udate(word, meaning);
					break;
				case "3": //�˻�
					System.out.print("�ܾ� > ");
					word = scanner.nextLine();
					System.out.println("�� > " + admin.find(word));
					break;
				case "4": //����
					System.out.print("�ܾ� > ");
					word = scanner.nextLine();
					admin.remove(word);
					break;
				case "5": //�ܾ���
					System.out.println("�ܾ��� > ");
					for(String w : admin.listWords()) {
						System.out.println(w);
					};
					break;
				case "6": //�ܾ���ü���
					System.out.println("��ü��� > ");
					Set<Entry<String,String>> set = admin.listAll().entrySet();
					for(Entry<String,String> entry : set ) {
						System.out.println(entry.getKey() + "-" + entry.getValue());
					}				
					break;
				case "7":
					admin.removeAll();
					System.out.println("��ü ���� �Ǿ����ϴ�.");
					break;
				case "8":
					System.out.println("ȸ����Ȳ >");
					admin.getMembers();
					break;
				case "0": //�α׾ƿ�
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
	
	//����ڸ޴�
	public void customerMenu() {
		
		Customer customer = new Customer(dictionary);
		
		boolean stop = false;
		String choiceNum = null;		//���õ� �޴���ȣ
		String word = null;					//�ܾ�
		String meaning = null;			//�ǹ�
		
		while(!stop) {
			try {
				System.out.println("1.�˻� 2.�ܾ��� 0.�α׾ƿ�");
				System.out.print("���� > ");
				choiceNum = scanner.nextLine();
				
				switch (choiceNum) {
				case "1": //�˻�			
					System.out.print("�ܾ� > ");
					word = scanner.nextLine();
					System.out.println("�� > " + customer.find(word));				
					break;
				case "2": //�ܾ���
					System.out.println("�ܾ��� > ");
					for(String w : customer.listWords()) {
						System.out.println(w);
					};				
					break;
				case "0": //�α׾ƿ�
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
















