package for_;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		// 4조 3번(오승민)
		// 두 수를 입력하여 입력한 작은 수 부터 큰 수까지 1씩 늘어나게 만드시오
		int a, b, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a>b) {
			max=a; min=b;
		}else {
			max=b; min=a;
		}
		for (int i=min; i<=max; i++) {
			System.out.println(i);
		}
	}
}
