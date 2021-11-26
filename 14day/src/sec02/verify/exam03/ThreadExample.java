package sec02.verify.exam03;
/**
 * 무한루프 쓰레드 interrupt를 사용해서 중지시키는 방법
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
