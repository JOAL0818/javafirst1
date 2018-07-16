package thread;

public class ThreadExMain1 {

	public static void main(String[] args) {
		//클래스의 run메소드 사용을 위한 인스턴스생성
		ThreadEx1 th1 = new ThreadEx1();
		//데몬스레드로 설정 - 다른스레드가 작업중이 아니면 자동종료
		th1.setDaemon(true);		
		//start()호출 -> thread시작
		th1.start();
		
		
		try {
			Thread.sleep(2000);
			//InterrupteException을 발생시킵니다.
			th1.interrupt();
			
			Thread.sleep(3000);
			System.out.println("프로그램종료");
			//프로그램종료
			//System.exit(0);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
