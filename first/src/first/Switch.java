package first;

public class Switch {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		
		System.out.println("number="+number);

		number = 1;
		
		switch(number){
		case 1:
			System.out.println("숫자="+number);
//			break;
		case 2:
			System.out.println("숫자="+number);
//			break;
		case 3:
			System.out.println("숫자="+number);
			break;
		case 4:
			System.out.println("숫자="+number);
			break;
		case 5:
			System.out.println("숫자="+number);
			break;
		default:
			System.out.println("1~5의 숫자가 아닌 값");
			break;
		}
		
	}

}
