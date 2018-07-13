package mutax;

public class Mutax implements Runnable {
	private int result;
	private int idx;
	
	//합계구하는 메소드
	//첫번째 해결 : 메소드의 결과형 앞에 synchronized를 추가 
	// └ 여러개의 스레드가 동시에 호출하더라도 하나의 수행이 종료된 후, 메소드 호출.
	private  void sum() {
		 for(int i=0;i<10000;i++) {
			 //두번째 해결법 : synchronized(공유자원){ }으로 감싸
			 //자신이 가지고 있는 자원을 사용할때 이 코드 영역은 동기적으로 동작하도록해주는 설정
			 synchronized(this) {
			 idx=idx+1;
			 try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 result = result + idx;
			 }
		 }		
	}
	
	
	@Override
	public void run() {
		sum();
	}
	
	//result 값을 리턴해주는 메소드 -result 값을 확인해주기위해서
	public int getResult() {
		return result;
	}
}
