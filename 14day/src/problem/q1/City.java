package problem.q1;

// �ǽ� 7.2: City.java
// ���ø� ��Ÿ����

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
		// �α��� ������ ���� ��� �α��� �о� ���δ�
		// ���⿡ �ڵ带 �����ϼ���

		// ������ �α� �������� �о� ���δ�
		// ���⿡ �ڵ带 �����ϼ���
	}

	// ���� �̸�, �α��� �α� �������� ����Ѵ�
	public void writeOutput() {
		// ���⿡ �ڵ带 �����ϼ���
	}

	// �־��� ���� ���� ���� �α��� ����Ѵ�
	public int computeFuturePopulation(int years) {
		// ���� �α�
		double populationAmount = population;

		// ����
		int count = years;

		// �־��� ���� ���� ���� �α��� ����Ѵ�
		// ���⿡ �ڵ带 �����ϼ���

		// ���� �α��� ��ȯ�Ѵ�
		// ���⿡ �ڵ带 �����ϼ���
	}

	// ���� �̸��� �־��� ������ �����Ѵ�
	public void setName(String newName) {
		cityName = newName;
	}

	// ���� �α��� �־��� ������ �����Ѵ�
	public void setPopulation(int newPopulation) {
		// ���⿡ �ڵ带 �����ϼ���
	}

	// ���� �α� �������� �־��� ������ �����Ѵ�
	public void setGrowthRate(double newGrowthRate) {
		// ���⿡ �ڵ带 �����ϼ���
	}

	// ���� �̸��� ��ȯ�Ѵ�
	public String getName() {
		return cityName;
	}

	// ���� �α��� ��ȯ�Ѵ�
	public int getPopulation() {
		// ���⿡ �ڵ带 �����ϼ���
	}

	// ���� �α� �������� ��ȯ�Ѵ�
	public double getGrowthRate() {
		// ���⿡ �ڵ带 �����ϼ���
	}
}
