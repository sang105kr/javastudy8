package sec02.verify.exam03;

public class MovieThread2 extends Thread {
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			if(stop == true) {
				break;
			}
			System.out.println("동영상을 재생합니다");
		}
	}
}
