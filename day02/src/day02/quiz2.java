package day02;

import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		double height, stWeight, weight, obesity;
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 > ");
		height=sc.nextDouble();
		stWeight=(height-100)*0.9;
		System.out.println("표준 체중은 "+stWeight+"입니다.");
		System.out.println();
		
		System.out.print("키를 입력하세요 > ");
		height=sc.nextDouble();
		System.out.print("현재 체중를 입력하세요 > ");
		weight=sc.nextDouble();
		stWeight=(height-100)*0.9;
		obesity=(weight/stWeight)*100;
		System.out.printf("표준 체중은 %.1f이고 비만도는 %.2f입니다.", stWeight, obesity);
	}
}
