package sec02.verify.exam03;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�");
			
			//1)�Ͻ����� ���¸� ���� interrupt���� �߻�
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				//e.printStackTrace();
//				break;
//			}
			
			//2)�Ͻ����� ���� �������ʰ� interruptó�� 
			//Thread�� �ν��Ͻ� �޼ҵ���
			if(this.isInterrupted()) {
				break;
			}
//			
			//3)�Ͻ����� ���� �������ʰ� interruptó��
			//Tread�� ���� �޼ҵ���
//			if(Thread.interrupted()) {
//				break;
//			}
		}
	}
}
