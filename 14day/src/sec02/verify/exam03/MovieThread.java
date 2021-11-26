package sec02.verify.exam03;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다");
			
			//1)일시정지 상태를 만들어서 interrupt예외 발생
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				//e.printStackTrace();
//				break;
//			}
			
			//2)일시정지 상태 만들지않고 interrupt처리 
			//Thread의 인스턴스 메소드사용
			if(this.isInterrupted()) {
				break;
			}
//			
			//3)일시정지 상태 만들지않고 interrupt처리
			//Tread의 정적 메소드사용
//			if(Thread.interrupted()) {
//				break;
//			}
		}
	}
}
