package etc;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String msg ="나는 조아라입니다.";
		
		//msg를 공백단위로 분할해서 출력
		//1-split메소드이용
		String[] ar = msg.split(" ");
		for(String token:ar) {
			System.out.println(token);
		}		
		//2-StringTokenizer이용
		StringTokenizer st = new StringTokenizer(msg," ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		
		
		String data ="90,90,20,60";
		
		//data를 , 단위로 분할해서 합계구하기
		//1-split메소드이용
		String[] tokens = data.split(",");  // 특수한 기호들은 앞에 \\을 붙여줘야한다. 예).
		int sum=0;
		for(String token:tokens) {
			sum = sum +Integer.parseInt(token);
		}
		System.out.println("합계:"+sum);
		
					
	}

}
