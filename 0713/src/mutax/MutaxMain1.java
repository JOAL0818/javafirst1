package mutax;

public class MutaxMain1 {

	public static void main(String[] args) {
		Mutax mutax=new Mutax();
		Thread th1 = new Thread(mutax);
		th1.start();
		Thread th2 = new Thread(mutax);
		th2.start();
	
		
		//25초 후에 mutax의 result 값 확인
		try {
			Thread.sleep(25000);
			System.out.println(mutax.getResult());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
