package day02;

import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		int year, birth, age;
		Scanner sc = new Scanner(System.in);
		System.out.print("올해의 년도를 4자리로 입력하세요 > ");
		year = sc.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요 > ");
		birth = sc.nextInt();
		age = year - birth + 1;
		System.out.printf("당신의 나이는 %d살 입니다.", age);
		System.out.println();
		
		double n1, n2;
		System.out.println();
		System.out.print("첫 번째 물건의 무게를 입력하시오 > ");
		n1 = sc.nextDouble();
		System.out.print("두 번째 물건의 무게를 입력하시오 > ");
		n2 = sc.nextDouble();
		System.out.println();
		System.out.println("현재 엘리베이터의 허용 무게는 "+(600-n1-n2)+"kg 입니다.");
	}
}
