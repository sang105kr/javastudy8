package problem.q1.answer;

// CityDriver.java
// City ��ü�� ����� �̿��Ѵ�

import java.util.*;

public class CityDriver {
	public static void main(String[] args) {
		// City ��ü ���� ����
		City aCity;

		// ���� �α�
		int newPopulation;

		// ����
		int years = 10;

		Scanner keyboard = new Scanner(System.in);

		// ��� ����
		boolean again = true;

		// ����ڰ� ����ϱ⸦ ���ϴ� ���� ������ 10�� �� ���� �α��� ����Ѵ�
		while (again) {
			// City ��ü�� �����ϰ� aCity�� ����Ű�� �Ѵ�
			aCity = new City();

			// aCity�� ���� �̸�, �α��� �α� �������� �о� ���δ�
			aCity.readInput();

			// aCity�� ���� �̸�, �α��� �α� �������� ����Ѵ�
			aCity.writeOutput();

			// aCity�� 10�� �� �α��� ����Ѵ�
			newPopulation = aCity.computeFuturePopulation(years);

			// aCity�� ���� �α��� ����Ѵ�
			System.out.println(years + "�� ���� �α�: " + newPopulation);

			// ��� ���θ� �Է� �޴´�
			System.out.print("����ϱ⸦ ���ϼ���(true Ȥ�� false)?: ");
			again = keyboard.nextBoolean();
		}
	}
}