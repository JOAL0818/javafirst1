package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements한 클래스를 이용해서 스레드시작
		ThreadEx3 obj = new ThreadEx3();
		Thread th = new Thread(obj);
		th.start(); //thread 클래스에 있다. - thread 상속받으면 start가 있다.

	}

}
