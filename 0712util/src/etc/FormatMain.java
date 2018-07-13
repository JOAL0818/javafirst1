package etc;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		Date date = new Date();
		int money =6570000;
		
		//0000년 00월 00일 00요일 00시 00분 00초
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 EEE a hh시mm분ss초");
		String msg = sdf.format(date);
		System.out.println(msg);

		// \6,570,000로 출력
		DecimalFormat df = new DecimalFormat("\u00A4 #,##0");
		msg = df.format(money);
		System.out.println(msg);
		
	}

}
