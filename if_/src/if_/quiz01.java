package if_;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		// 이태영(4조 1번)
		// 1에서부터 6까지의 눈을 가진 주사위를 두명이서 굴려서 승자를 정하는 게임
		// 두명이 본인의 [이름]과 [주사위 수]를 입력 
		String name1, name2;
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 사람 이름 입력 : ");
		name1 = sc.next();
		System.out.print("첫번째 사람 주사위 결과 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 사람 이름 입력 : ");
		name2 = sc.next();
		System.out.print("두번째 사람 주사위 결과 입력 : ");
		num2 = sc.nextInt();
		System.out.println("-------- 결과 ---------");
		
		if (num1>6 || num1<1 || num2>6 || num2<1) {
			System.out.println("1~6 사이의 숫자만 입력해주세요.");
		}else if (num1>num2) {
			System.out.println(name1+"님 승리");
		}else if (num1<num2) {
			System.out.println(name2+"님 승리");
		}else {
			System.out.println("무승부");
		}
	}
}
