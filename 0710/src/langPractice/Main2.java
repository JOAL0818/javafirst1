package langPractice;

import java.util.ArrayList;
import java.util.HashMap;
enum GENDER{			//묶는게 안묶는거 보다는 낫다.
	MAN,WOMAN;
}

public class Main2 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();  //ArrayList <String> al = new ArrayList(); - 이것도 가능
		ArrayList <Integer> bl = new ArrayList<Integer>();  //int로 쓰면 에러난다. 
		HashMap<String,String>hm=new HashMap<String,String>(); //HashMap<String,String>hm=new HashMap(); - 이것도 가능
	
	
		//0이면 남자 1이면 여자 - 설문조사할때 이런식으로 데이터를 만든다.
		int gender=1;
		if(gender==0) {
			
		}
		else {
			
		}
		
		final int MAN=0;
		final int WOMAN=1;    //이것들을 묶고 싶다. 배열을 사용하지 않고 enum사용 
		
		if(gender==MAN) {
			
		}
		else {
			
		}
		
	}

}
