package problem.q1.answer;

// City.java
// ���� �α��� ��Ÿ����

import java.util.*;

public class City {
	// ���� �̸�
	private String cityName;

	// ���� �α�
	private int population;

	// ������ �α� ������
	private double growthRate;

	// ���� �̸�, �α��� �α� �������� �о� ���δ�
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);

		// ���� �̸��� �о� ���δ�
		System.out.print("���� �̸��� �Է��ϼ���: ");
		cityName = keyboard.next();

		// ������ �α��� �о� ���δ�
		System.out.print("�α��� �Է��ϼ���: ");
		population = keyboard.nextInt();

		// �α��� ������ ���� ��� �α��� �о� ���δ�
		while (population < 0) {
			System.out.println("�α��� ������ �� ����.");
			System.out.println("�α��� �ٽ� �Է��ϼ���: ");
			population = keyboard.nextInt();
		}

		// ������ �α� �������� �о� ���δ�
		System.out.print("�α� ������(%)�� �Է��ϼ���: ");
		growthRate = keyboard.nextDouble();
	}

	// ���� �̸�, �α��� �α� �������� ����Ѵ�
	public void writeOutput() {
		System.out.println("���� = " + cityName);
		System.out.println("�α� = " + population);
		System.out.println("�α� ������ = " + growthRate + "%");
	}

	// �־��� ���� ���� ���� �α��� ����Ѵ�
	public int computeFuturePopulation(int years) {
		// ���� �α�
		double populationAmount = population;

		// ����
		int count = years;

		// �־��� ���� ���� ���� �α��� ����Ѵ�
		while ((count > 0) && (populationAmount > 0)) {
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount);
			count--;
		}

		// ���� �α��� ��ȯ�Ѵ�
		if (populationAmount > 0)
			return (int) populationAmount;
		else
			return 0;
	}

	// ���� �̸��� �־��� ������ �����Ѵ�
	public void setName(String newName) {
		cityName = newName;
	}

	// ���� �α��� �־��� ������ �����Ѵ�
	public void setPopulation(int newPopulation) {
		population = newPopulation;
	}

	// ���� �α� �������� �־��� ������ �����Ѵ�
	public void setGrowthRate(double newGrowthRate) {
		growthRate = newGrowthRate;
	}

	// ���� �̸��� ��ȯ�Ѵ�
	public String getName() {
		return cityName;
	}

	// ���� �α��� ��ȯ�Ѵ�
	public int getPopulation() {
		return population;
	}

	// ���� �α� �������� ��ȯ�Ѵ�
	public double getGrowthRate() {
		return growthRate;
	}
}
