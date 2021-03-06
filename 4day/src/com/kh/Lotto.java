package com.kh;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		boolean stop = false;		
		int count = 0;
		
		while(!stop) {	
			int num = (int)(Math.random() * 45) + 1;
			
			//중복체크로직!
			if( dupChk(lotto, num) && count != 0 ) {
				continue;
			}
					
			lotto[count++] = num;
			//count++;
			
			//무한루프 빠져나오는 조건 : 
			if(count == 6) {
				stop = true;
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.printf(lotto[i] + " ");
		}	
	}
	
	//배열내 중복체크
	public static boolean dupChk(int[] lotto, int num ) {
		boolean result = false;
		
		for(int i=0; i<lotto.length; i++) {
			if( lotto[i] == num) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
