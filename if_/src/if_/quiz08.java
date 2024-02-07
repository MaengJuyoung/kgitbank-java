package if_;

import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		// 2조 3번
		// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 > ");
		year = sc.nextInt();
		
		if (year>=1 && year<=4000) {
			if ((year%4==0 && year%100!=0) || year%400==0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			System.out.println("1~4000 사이를 입력하세요");
		}
		
		/* 작성자 답
		 if(!(1 <= year && year <= 4000))
		{
			System.out.println("1~4000사이를 입력하세요");
		}
		else if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		 */
		
	}
}
