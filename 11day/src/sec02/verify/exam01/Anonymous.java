package sec02.verify.exam01;

public class Anonymous {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("�������� �մϴ�");
		}
	}; 
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("������ �մϴ�");
			}
		};
				
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}
