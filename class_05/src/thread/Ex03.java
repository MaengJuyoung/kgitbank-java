package thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("문자가 날라왔습니다!!!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true);
		// setDaemon :  현재 Thread로 동작하고 있는 메소드를 메인이 종료될 때 같이 종료시키는 메소드
		a.start();
		
		while(true) {
			System.out.println("문자열 입력 : ");
			str = sc.next();
			System.out.println("입력한 값 : "+str);
			if (str.equals("end")) {
				System.out.println("종료합니다");
				break;
			}
		}
		System.out.println("main이 종료됩니다!!!");
	}
}
