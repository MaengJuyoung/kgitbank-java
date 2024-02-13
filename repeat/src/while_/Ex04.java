package while_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum=0;
		while(true) {
			System.out.print("1 ~ 10 사이 수 입력 > ");
			i = sc.nextInt();
			if (i>0 && i<=10) {
				break;
			}else if (i<=0 || i>10) {
				System.out.println("범위를 벗어남. 다시 입력");
				System.out.println();
				continue;
			}
			System.out.println("while 다시 실행...");
		}
		for (int k=1; k<=i; k++ ){
			sum +=k;
		}
		System.out.println("0~"+i+"까지의 합 : "+sum);
	}
}
