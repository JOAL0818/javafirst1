package datastructrue;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		//이름과 나이 및 소속회사를 저장하는  Map을 생성
		HashMap<String, Object>map = new HashMap<>();
		map.put("이름","아이린");
		map.put("age","28");
		map.put("company","SM");
		
		//전체를 한꺼번에 출력 - toString이 저장돼있기때문에 가능하다!
		System.out.println(map);
		
		System.out.println("========================");
		
		//순서에 상관없이 항목별로 출력
		Set<String>keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+":"+map.get(key)); //key안쓰면,key대신에 이름/age.. 이런걸 다 적어줘야한다.
			
		}
		

	}

}
