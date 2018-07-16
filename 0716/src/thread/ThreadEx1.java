package thread;

public class ThreadEx1 extends Thread {
	//스레드로 동작할 메소드
	public void run(){
		//1초마다 Thread라는 글자를 10번출력
		for(int i=0;i<10;i++) {
			System.out.println("Thread");
			try {
				//1초씩 대기하는 메소드
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드종료");
				//스레드를 강제로 종료할 수 있도록 예외가 발생하면 run메소드를 종료.
				return;
				//실무에서는 항상 들어가야한다. - 언제든지 필요하면 종료할 수 있도록.
			}
		}
		
		
		
	}
	
}
