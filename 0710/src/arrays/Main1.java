package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		//문자열 배열생성
		String[] subject= {"Java","Oracle","Web Front End","Web Back End Java","Android","iOS"};
		//Oracle의 위치를 검색하고 싶다.
		
		int idx=Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);
		
		int jdx=Arrays.binarySearch(subject, "IOS");
		System.out.println(jdx);   //why -1이 나오냐? 5가 나와야지! -> 친구들이 정렬이 안돼있잖아  -> 정렬 sort메소드이용
		
		
		//subject 정렬 
		Arrays.sort(subject);
	
		//정렬하고 위치 검색하니 제대로 나온다 
		int kdx=Arrays.binarySearch(subject, "iOS");   
		System.out.println(kdx);	//소문자니까 가장 뒤에 있고 그래서 5다.
		System.out.println("");
		
		
		
		//배열의 데이터 전부출력
		for(int i=0;i<subject.length;i=i+1) {
			System.out.println(subject[i]);
		}
		
		System.out.println("");
		//배열의 데이터 전부출력 (Fast Enumeration = for -each사용)
		for(String temp: subject) {
			System.out.println(temp);
		}
		
	}
}
