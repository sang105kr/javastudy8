package first;

public class MemberGrade {
	public static void main(String[] args) {
		char grade = 'B';

		// ���� if��
		if (grade == 'B' || grade == 'b') {
			System.out.println("�Ϲ�ȸ��");
			if (grade == 'B') {
				System.out.println("�빮�� B");
			} else {
				System.out.println("�ҹ��� b");
			}

		} else if (grade == 'A' || grade == 'a') {
			System.out.println("���ȸ��");
		} else {
			System.out.println("ȸ������� �����ϴ�.");
		}

		// switch��
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			switch (grade) {
			case 'B':
				System.out.println("�빮�� B");
				break;
			case 'b':
				System.out.println("�ҹ��� b");
				break;
			}
			break;
		default:
			System.out.println("ȸ������� �����ϴ�.");
		}// end of switch
	}// end of main
}
