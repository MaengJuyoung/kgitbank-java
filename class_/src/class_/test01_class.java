package class_;

import java.util.Scanner;

public class test01_class {
	// 큰 수 출력하는 메소드
	public void big() {
		Scanner input = new Scanner(System.in);
		System.out.print("큰 수를 판별할 두 수 입력 : ");
		int x = input.nextInt();
		int y = input.nextInt();
		int big;
		if(x >= y) {
			big = x;
		}else  {
			big = y;
		}
		System.out.println("둘 중 큰 수 : "+big+" 입니다.\n" );
	}
	// 짝수 홀수 판별하는 메소드
	public void isOddEven() {
		Scanner input = new Scanner(System.in);
		System.out.print("짝수 홀수 판별할 수 입력 : ");
		int x = input.nextInt();
		if (x % 2 == 0) {
			System.out.println(x+"는 짝수입니다.\n");
		} else {
			System.out.println(x+"는 홀수입니다.\n");
		}
	}
	// 3의 배수 판별하는 메소드
	public void multipleThree() {
		Scanner input = new Scanner(System.in);
		System.out.print("3의 배수여부 판별할 수 입력 : ");
		int x = input.nextInt();
		if (x % 3 == 0) {
			System.out.println(x+"는 3의 배수입니다.\n");
		} else {
			System.out.println(x+"는 3의 배수가 아닙니다.\n");
		}
	}
	// 소수 판별하는 메소드
	public void prime() {
		Scanner input = new Scanner(System.in);
		System.out.print("소수인지 판별할 수 입력 : ");
		int x = input.nextInt();
		if (x == 1) {
			System.out.println(x+"는 소수입니다.\n");
		} else if (x > 1) {
			for (int i = 2 ; i < x; i++) {
				if (x % i == 0 && x != i) {
					System.out.println(x+"는 소수가 아닙니다.\n");
					return;
				} 
			}
			System.out.println(x+"는 소수입니다.\n");
		}
	}
	// 절댓값 구하는 메소드
	public int absolute(int x) {
		if (x >= 0) {
			return x;
		} else {
			return -1*x;
		}
	}
	// 거꾸로 반환하는 메소드
	public int reverse(int x) {
		int temp = 0;
		int num = 0;
		while (true) {
			temp = x % 10; // 3 2
			x = x/10; // 12 1
			num = num*10 + temp; 
			if (x == 0) {
				break;
			}
		}
		return num;
	}
}
