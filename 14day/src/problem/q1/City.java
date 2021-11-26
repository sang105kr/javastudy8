package problem.q1;

// 실습 7.2: City.java
// 도시를 나타낸다

import java.util.*;

public class City {
	// 도시 이름
	private String cityName;

	// 도시 인구
	private int population;

	// 도시의 인구 증가율
	private double growthRate;

	// 도시 이름, 인구와 인구 증가율을 읽어 들인다
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);

		// 도시 이름을 읽어 들인다
		System.out.print("도시 이름을 입력하세요: ");
		cityName = keyboard.next();

		// 도시의 인구를 읽어 들인다
		// 인구가 음수인 동안 계속 인구를 읽어 들인다
		// 여기에 코드를 삽입하세요

		// 도시의 인구 증가율을 읽어 들인다
		// 여기에 코드를 삽입하세요
	}

	// 도시 이름, 인구와 인구 증가율을 출력한다
	public void writeOutput() {
		// 여기에 코드를 삽입하세요
	}

	// 주어진 연도 후의 예상 인구를 계산한다
	public int computeFuturePopulation(int years) {
		// 예상 인구
		double populationAmount = population;

		// 연도
		int count = years;

		// 주어진 연도 후의 예상 인구를 계산한다
		// 여기에 코드를 삽입하세요

		// 예상 인구를 반환한다
		// 여기에 코드를 삽입하세요
	}

	// 도시 이름을 주어진 값으로 변경한다
	public void setName(String newName) {
		cityName = newName;
	}

	// 도시 인구를 주어진 값으로 변경한다
	public void setPopulation(int newPopulation) {
		// 여기에 코드를 삽입하세요
	}

	// 도시 인구 증가율을 주어진 값으로 변경한다
	public void setGrowthRate(double newGrowthRate) {
		// 여기에 코드를 삽입하세요
	}

	// 도시 이름을 반환한다
	public String getName() {
		return cityName;
	}

	// 도시 인구를 반환한다
	public int getPopulation() {
		// 여기에 코드를 삽입하세요
	}

	// 도시 인구 증가율을 반환한다
	public double getGrowthRate() {
		// 여기에 코드를 삽입하세요
	}
}
