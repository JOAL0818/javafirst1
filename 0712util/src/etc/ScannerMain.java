package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 한줄을 입력받아서 출력
		Scanner sc = new Scanner(System.in) ;
		System.out.println("이름입력");
		//String msg = sc.nextLine();	//한 줄을 입력받는 개체
		String msg = sc.next();  	//공백단위로 구분해서 입력받기
		System.out.println(msg);
		
		//스캐너를 사용하면 마지막에 닫아주어야한다.
		sc.close();
		
		
		//문자열로부터 받기
		sc=new Scanner("Helllo Java");
		System.out.println(sc.next());
		System.out.println(sc.next());
		
		
		//File 객체만들기
		File f = new File("C:\\Users\\503-01\\Documents\\조아라\\from공유폴더\\0702.txt");
		try {
			sc=new Scanner(f);
			
			//데이터가 있을때까지 읽기
			//파일은 있는데 내용을 못읽는 경우는 2가지 
			//1)구분문자가 없는경우 
			//2)한글인코딩이 서로다른경우 : 글자가 깨지는 것이 아닌 Scanner가 읽지를 못한다.
			//   └ 공백문자를 찾아야하는데 인코딩이 다르면 공백문자의 인코딩 갓이 달라서 읽지를 못한다. 
			//그래서 스캐너로는 파일읽는걸 잘 안한다. 
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
