package com.kh;

public class MvpOfToday {

	public static void main(String[] args) {
		
		String[][] names = {
				{null, "김재엽",  null, "박성모",  null, "박현근", null, "이규민"},
				{"배지희", null,  "유기상", null,  "최재훈", null, "권영경", null},
				{"이준혁", "김강현", "이한봄", "김무년", "전은우", "김세영", "정윤혜", "김소라"},
				{"김영빈", null,  "하태우", null,  "조세령", null, "최수빈", null},
		};

		printLine(85);
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
				if(names[i][j] == null) {
					System.out.print("빈자리(" + i + "," + j+ ") ");
				}else {
					System.out.print(names[i][j] + "(" + i + "," + j+ ") ");
				}
			}
			System.out.println();
		}
		printLine(85);
		
		int randomRow = (int)(Math.random() * names.length);
		int randomCol = (int)(Math.random() * names[randomRow].length);
		
		System.out.printf("오늘의 MVP 두구두구두~~~(%d,%d)\n", randomRow, randomCol  );
		if(names[randomRow][randomCol] != null) {
			System.out.println(names[randomRow][randomCol]+"님 축하합니다!!");
		}else {
			System.out.println("아쉽게도 다음기회에!");
		}
	}
	
	public static void printLine(int count) {
		for(int i=1; i <= count; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
