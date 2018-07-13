package datastructrue;

import java.util.HashMap;

public class MapMain3 {

	public static void main(String[] args) {
		//프로야구 팀 별 선수명단을 배열로 만든다.
		String [] kia = {"윤석민","안치홍","김선빈"};
		String [] hanhwa = {"권혁","정근우"};
		String [] lotte = {"레일리","이대호"};
	
		HashMap<String, Object>map1=new HashMap<>();
		map1.put("team","기아");
		map1.put("data",kia);
		
		HashMap<String, Object>map2=new HashMap<>();
		map2.put("team","한화");
		map2.put("data",hanhwa);
		
		HashMap<String, Object>map3=new HashMap<>();
		map3.put("team","롯데");
		map3.put("data",lotte);
			
		String [] nc = {"박석민","이재학"};
		HashMap<String, Object>map4=new HashMap<>();
		map4.put("team","NC");
		map4.put("data",nc);
		
		//HashMap의 배열
		HashMap[] players = {map1,map2,map3,map4};
		
		for(int i=0; i<players.length;i=i+1) {
			HashMap temp = players[i];
			//팀이름 출력
			System.out.print(temp.get("team")+":"+"\t");
			//선수명단 가져오기(저장할때는 반드시 형변환해라, 출력할때는 안해도 되지만)
			//출력을 할때는 get한 데이터를 형변환하지 않지만
			//저장을 하거나 사용을 할때는 원래의 자료형으로 강제형변환해서 사용
			String[] imsi=(String[])temp.get("data");
			for(int j=0; j<imsi.length;j=j+1) {
				System.out.print(imsi[j]+"\t");
			}
			System.out.println("");
		}
		
	}

}
