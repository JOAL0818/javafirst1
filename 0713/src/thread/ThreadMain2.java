package thread;

public class ThreadMain2 {

	public static void main(String[] args) {
		
		//스레드 생성
		ThreadEx2 th = new ThreadEx2();
		//스레드올 실행
		th.start();
		
		System.out.println("정말스레드?");
		
		
	}

}
