
//package&import 실습
package packageimport;

//Scanner 클래스는 패키지 이름을 생략하고 사용할 수 있도록 해줍니다.
import java.util.Scanner;

//java.util패키지의 모든 클래스는 패키지 이름을 생략하고 사용할 수 있도록 해줍니다.
import java.util.*;
import java.sql.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close(); //이렇게 불러오는 순간 자동으로 import문장이 생긴다.
		
		//Date date = new Date(); // Date 클래스는 java.util패키지에도 있고 java.sql 패키지에도 있기 때문에 오류가 났다.
								// └여러패키지에 존재하는 클래스의 경우는 반드시 구체적으로 import를 해야합니다.(클래스까지 자세하게 적어줘야한다.) 		
	}
}