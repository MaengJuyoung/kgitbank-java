package if_;

import java.util.Scanner;

public class quiz09 {
	public static void main(String[] args) {
		// 2조 4번
		// 현재 년도와 나이를 입력한 후 태어난 년대를 구합니다. 
		Scanner sc = new Scanner(System.in);
		int age, year, birth, a;
		
		System.out.print("현재 년도를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		birth = year - age + 1;
		a = (birth / 10) *10;
		
		if (a>0) {
			System.out.println(a+"년 대에 태어났습니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		/* 문제 만든이의 답
		 if ((birth / 10) *10 == 2000) {
			System.out.println("2000년대에 태어났습니다.");
		}else if ((birth / 10) * 10 == 1990) {
			System.out.println("1990년대에 태어났습니다.");
		}else if ((birth / 10) * 10 == 1980) {
			System.out.println("1980년대에 태어났습니다.");
		}else {
			System.out.println("1970년대에 태어났습니다.");
		}
		sc.close();
		 */
		
	}
}