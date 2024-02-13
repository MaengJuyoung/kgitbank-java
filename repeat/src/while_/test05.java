package while_;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		//약수 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 >>> ");
		int num = sc.nextInt();
		System.out.print("약수 : ");
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
