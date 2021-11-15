package first;

public class Calculator {


	//±¸ºÐ¼±
	public static void line() {
		System.out.println("=====");
	}
	
	public static void line(int count) {
		for(int i=1; i<=count; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	//µ¡¼À
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	//»¬¼À
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	//°ö¼À
	public static int muliti(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	//³ª´°¼À
	public static double devide(int num1, int num2) {
		double result = num1 / (double)num2;
		return result;
	}
	
	public static void main(String[] args) {
		int result = sum(10,20);
		System.out.println(result);
		//System.out.println("=====================");
		line(5);
		result = minus(10,20);
		System.out.println(result);
		//System.out.println("===================");
		line(10);
		result = muliti(10, 20);
		System.out.println(result);
		//System.out.println("=============");
		line(15);
		double result2 = devide(10, 20);
		System.out.println(result2);
	}	
	
}
