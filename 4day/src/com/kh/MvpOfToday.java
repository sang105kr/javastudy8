package com.kh;

public class MvpOfToday {

	public static void main(String[] args) {
		
		String[][] names = {
				{null, "���翱",  null, "�ڼ���",  null, "������", null, "�̱Թ�"},
				{"������", null,  "�����", null,  "������", null, "�ǿ���", null},
				{"������", "�谭��", "���Ѻ�", "�蹫��", "������", "�輼��", "������", "��Ҷ�"},
				{"�迵��", null,  "���¿�", null,  "������", null, "�ּ���", null},
		};

		printLine(85);
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
				if(names[i][j] == null) {
					System.out.print("���ڸ�(" + i + "," + j+ ") ");
				}else {
					System.out.print(names[i][j] + "(" + i + "," + j+ ") ");
				}
			}
			System.out.println();
		}
		printLine(85);
		
		int randomRow = (int)(Math.random() * names.length);
		int randomCol = (int)(Math.random() * names[randomRow].length);
		
		System.out.printf("������ MVP �α��α���~~~(%d,%d)\n", randomRow, randomCol  );
		if(names[randomRow][randomCol] != null) {
			System.out.println(names[randomRow][randomCol]+"�� �����մϴ�!!");
		}else {
			System.out.println("�ƽ��Ե� ������ȸ��!");
		}
	}
	
	public static void printLine(int count) {
		for(int i=1; i <= count; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
