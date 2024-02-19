package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass01 {
	public static void main(String[] args) {
		// 날짜 얻어오는 기능
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat si = 
				new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String s = si.format(time);	// 위에 쓴 형식으로 포매팅하여 String 값으로 리턴
		System.out.println(s);
		
		System.out.println("--------------------------------");
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(si.format(date));
	}
}
