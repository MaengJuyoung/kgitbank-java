package ran;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.println(Math.random());		// Math.random() : 0.001 ~ 0.999 사이 값 생성
		}
		System.out.println("--------");
		for (int i=0; i<5; i++) {
			double dou = Math.random()*3;	// 0.001~2.999 값 생성 
			System.out.println((int)dou);
		}
		System.out.println("========");
		Random r = new Random();
		for (int i=0; i<5; i++) {
			int num = r.nextInt(3); 		// 0~2 값 생성
			System.out.println(num);
		}
		
		Random rd = new Random();		// 로또
		int num[] = new int[6];
		for (int i=0; i<6; i++) {
			num[i] = rd.nextInt(45)+1;	
			for (int j=0; j<i; j++) {
				if (num[i]==num[j]) {
					i--;
				}
			}
		}
		System.out.println("\n로또 생성");
		for (int i=0; i<6; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
