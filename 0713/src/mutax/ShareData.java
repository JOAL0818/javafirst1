package mutax;

import java.util.ArrayList;

public class ShareData {
	//저장공간을 생성
	public static ArrayList<Character>list = new ArrayList<>();
	
	//데이터를 저장하는 메소드
	public synchronized void save(char ch) {
		if(list.size()==1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		list.add(ch);
		System.out.println(ch+"를 저장했습니다.");
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//리스트에서 하나를 꺼내서 출력하는 메소드
	public synchronized void get() {
		if(list.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		char ch = list.remove(0);
		System.out.println(ch+"를 소비했습니다.");
		notifyAll();
	}		
}
