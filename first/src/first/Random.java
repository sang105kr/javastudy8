package first;

public class Random {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100)+1;
		System.out.println("(1~100)������ = " + random);
		
		//3�ǹ�� üũ
		if( random % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else{
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		//2�ǹ�� �̸鼭 3�� ������� üũ
		if( random % 2 == 0  && random % 3 == 0) {
			System.out.println("2�ǹ�� �̸鼭 3�� ���");
		}else {
			System.out.println("2�ǹ�� �̸鼭 3�� ����� �ƴѰ�");
		}

		//2�ǹ�� �̰ų� 3�� ������� üũ
		if( random % 2 == 0  || random % 3 == 0) {
			System.out.println("2�ǹ�� �̰ų� 3�ǹ��");
		}else {
			System.out.println("2�ǹ�� �̰ų� 3�ǹ���� �ƴѰ�");
		}	
		
		//2�� ����� �ƴѰ��
		if( random % 2 != 0) {
			System.out.println("2����� �ƴϴ�.");
		}else {
			System.out.println("2�����.");
		}
		
		//2�� ����� �ƴѰ��
		if( !(random % 2 == 0)) {
			System.out.println("2����� �ƴϴ�.");
		}else {
			System.out.println("2�����.");
		}		
	}

}
