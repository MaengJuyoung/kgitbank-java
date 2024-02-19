package etc;

import java.util.Date;

public class SleepClass01 {
	// Thread.sleep(num);  num/1000초 동안 멈춰주는 기능
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i+" : "+new Date());
			
			try {
				Thread.sleep(1000);	//1000 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("시작");
		long start = System.currentTimeMillis();	// 1/1000 초 단위
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("종료");
		System.out.println("사용 시간 : "+(end-start)/1000+"초");
		
	}
}
