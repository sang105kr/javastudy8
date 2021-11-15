package first;

public class MemberGrade {
	public static void main(String[] args) {
		char grade = 'B';

		// 다중 if문
		if (grade == 'B' || grade == 'b') {
			System.out.println("일반회원");
			if (grade == 'B') {
				System.out.println("대문자 B");
			} else {
				System.out.println("소문자 b");
			}

		} else if (grade == 'A' || grade == 'a') {
			System.out.println("우수회원");
		} else {
			System.out.println("회원등급이 없습니다.");
		}

		// switch문
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			switch (grade) {
			case 'B':
				System.out.println("대문자 B");
				break;
			case 'b':
				System.out.println("소문자 b");
				break;
			}
			break;
		default:
			System.out.println("회원등급이 없습니다.");
		}// end of switch
	}// end of main
}
