package while_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, temp;
		System.out.print("수 입력 > ");
		i = sc.nextInt();
		boolean bool = true;
		while (bool) {
			// System.out.println("while");
			temp = i%10;
			i = i/10;
			System.out.println(temp+", ");
			if (i==0) {
				// System.out.println("bool : "+bool);
				// bool = false;
				break;
			}
			System.out.println("while 종속 문장");
		}
		System.out.println("다음 문장들 실행 : "+bool);
	}
}
