package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		// if (num%2==0) {}
		// else 
		switch (num%2) {
		case 0: System.out.println("입력 값은 짝수");break;
		case 1: System.out.println("홀수"); break;
		}
		System.out.println("다음 문장들 실행!!!");
	}
}
