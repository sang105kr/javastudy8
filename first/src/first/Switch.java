package first;

public class Switch {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		
		System.out.println("number="+number);

		number = 1;
		
		switch(number){
		case 1:
			System.out.println("����="+number);
//			break;
		case 2:
			System.out.println("����="+number);
//			break;
		case 3:
			System.out.println("����="+number);
			break;
		case 4:
			System.out.println("����="+number);
			break;
		case 5:
			System.out.println("����="+number);
			break;
		default:
			System.out.println("1~5�� ���ڰ� �ƴ� ��");
			break;
		}
		
	}

}
