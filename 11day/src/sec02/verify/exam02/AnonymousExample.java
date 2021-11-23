package sec02.verify.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.run();
		anonymous.method1();
		anonymous.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("테스트를 합니다");
			}
		});
	}

}
