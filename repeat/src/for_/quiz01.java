package for_;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		// 4조 2번(이태영)
		// 사각형 만들기. 가로 세로 길이를 입력받아 사각형을 만드시오 ( * = 1 )
		// 가로또는 세로길이를 1이하로 작성시 다시 길이를 입력하도록 작성
		// * continue = 아래를 실행하지않고 해당 반복문으로 다시 넘어감.
		// ex) 
		/*
		 * 가로 세로 길이 입력 : 1 1 
		 * 가로, 세로 2이상 입력해주세요 
		 * 가로 세로 길이 입력 : 1 2 
		 * 가로, 세로 2이상 입력해주세요 
		 * 가로 세로 길이 입력 : 6 6
		 ******
		 *	  *
		 *    *
		 *    * 
		 ******
		 */
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		while (true) {
			System.out.print("가로 세로 길이 입력 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			if (a<2 || b<2) {
				System.out.println("가로, 세로 2이상 입력해주세요 >>");
				continue;
			}
			for (int i=0; i<b; i++) {
				for (int j=0; j<a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		}
		
		/* 출제자 정답
		Scanner sc = new Scanner(System.in);
		int width = 0, height = 0;

		while (true) {
			System.out.print("가로 세로 길이 입력 : ");
			width = sc.nextInt();
			height = sc.nextInt();
			if ((width<2)||(height<2)) {
				System.out.println("가로, 세로 2이상 입력해주세요");
				continue;
			}

			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}
			System.out.println();
			for (int j = 1; j <= height-2; j++) {
				System.out.print("*");
				for (int k = 1; k <= width-2; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}
			break;
		}
		*/
	}
}
