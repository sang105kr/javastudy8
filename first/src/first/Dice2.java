package first;

public class Dice2 {

	public static void main(String[] args) {
		//System.out.println((int)(Math.random()*6)+1);
		
		int random = (int)(Math.random()*6)+1;
		System.out.println("던진 주사위수 = " + random);
		
		//random % 2 == 1
		
		//System.out.println((4 % 2) == 0);
		if(random % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
