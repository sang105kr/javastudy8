package sec02.verify.exam03;
/**
 * ���ѷ��� ������ interrupt�� ����ؼ� ������Ű�� ���
 * @author mypc
 *
 */
public class ThreadExample {

	public static void main(String[] args) {

			Thread thread = new MovieThread();
			thread.start();
			
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			thread.interrupt();
	}

}
