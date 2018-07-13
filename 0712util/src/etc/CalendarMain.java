package etc;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("본인의 이름과 생년월일을 입력해주세요");
		System.out.println("예)조아라 1990-01-01");
		
		String name = sc.next();
		String birth =sc.next();
		
		int year,month,day;
		long gap=0;
		
		String[] ar=birth.split("-");
		for(String token:ar) {
			year=Integer.parseInt(ar[0]);
			month=Integer.parseInt(ar[1]);
			day=Integer.parseInt(ar[2]);
			
			Calendar birthDay = Calendar.getInstance();
			birthDay.set(Calendar.YEAR,year);
			birthDay.set(Calendar.MONTH,month-1);
			birthDay.set(Calendar.DAY_OF_MONTH,day);
			
			Date date = new Date(birthDay.getTimeInMillis());
			
			Calendar toDay = Calendar.getInstance();
			gap = toDay.getTimeInMillis() - birthDay.getTimeInMillis();
				
						
		}
		System.out.println(name+"가 태어난지 \""+(gap/24/60/60/1000)+"\"일째 되는 날 입니다.");
		sc.close();
			
		
	}

}


/*package etc;

import java.sql.Date;
import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		//1990년 8월 18일을 Calendar객체로 만들기
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR,1990);
		birthDay.set(Calendar.MONTH,7);
		birthDay.set(Calendar.DAY_OF_MONTH,18);
		
		Date date = new Date(birthDay.getTimeInMillis());
		
		Calendar toDay = Calendar.getInstance();
		long gap = toDay.getTimeInMillis() - birthDay.getTimeInMillis();
		System.out.println("태어난지 "+(gap/24/60/60/1000)+"일째 되는 날 입니다.");
	}

}*/
