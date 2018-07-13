package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

public class LogMain {

	public static void main(String[] args) {
		//로그파일의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\Users\\503-01\\Documents\\조아라\\from공유폴더\\log.txt");
		HashSet<String> set = new HashSet<String>();
		try {
			//파일의 내용을 읽을 Scanner 인스턴스 생성
			Scanner sc = new Scanner(f);
			
			//합계를 저장할 변수를 생성
			int sum = 0;
			//읽을 다음줄이 있을 때까지 수행
			while(sc.hasNextLine()) {
				//System.out.println(sc.nextLine());
				//한줄읽기
				String temp = sc.nextLine();
				//공백으로 분할하기
				String[] ar = temp.split(" ");
				
				//10번째 데이터 확인
				System.out.println(ar[9]);		
				//10번째 문자열을 정수로 변환해서 sum에 더하기
				sum = sum +Integer.parseInt(ar[9]);
			}
			System.out.println("트래픽합계:"+sum);
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
