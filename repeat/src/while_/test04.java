package while_;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		// 최소 공배수와 최대 공약수 구하기
		int n1, n2, max, min, gcm=0, lcm=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 >>> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1>n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		
		for (int i=1; i<max; i++) {
			if (n1%i==0 && n2%i==0) {
				gcm = i;
				lcm = gcm*(n1/i)*(n2/i);
			}
			
		}
		System.out.println("최대공약수 : "+gcm);
		System.out.println("최소공배수 : "+lcm);
	}
}
