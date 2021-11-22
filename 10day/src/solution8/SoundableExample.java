package solution8;

public class SoundableExample {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
