package sec02.verify.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		
		Worker worker = new Worker() {
			@Override
			public void start() {
				System.out.println("�׽�Ʈ�� �մϴ�.");
			}
		};
		
		anony.method2(worker);

	}

}
