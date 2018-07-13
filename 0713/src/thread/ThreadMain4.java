package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 클래스의 인스턴스
		ThreadEx4 obj1 = new ThreadEx4("스뤠드1");
		ThreadEx4 obj2 = new ThreadEx4("스뤠드2");
		
		//스레드생성
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		//스레드의 우선순위 변경
		th1.setPriority(Thread.MIN_PRIORITY); //가장 낮은 우선순위
		th2.setPriority(Thread.MAX_PRIORITY); //가장 높은 우선순위
				
		//스레드시작
		th1.start();
		th2.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th1.interrupt();
		
		
		
		

	}

}
