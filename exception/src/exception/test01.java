package exception;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("인증 프로그램입니다.");
			System.out.println("90년생 이상은 '가입불가'\n89년생 이하는 '가입가능'");
			System.out.print("'A,ㅁ,ㅋ등 문자는 잘못입력'\n주민번호 입력(앞 6자리) : ");
			String input = sc.next();

			// 배열 생성 (input 문자열 길이만큼 배열 준비)
			int arr[] = new int[input.length()];
			for (int i=0; i<input.length(); i++) {
				arr[i] = input.charAt(i)-'0';		// i=0일 때, '1'-'0'=1이 됨.
			}

			if (input.length()!=6) {
				System.out.println();
				System.out.println("길이가 틀렸습니다.\n");
			}else {
				for (int i=0; i<input.length(); i++) {
					int num = arr[i];
					if (num>10) {
						System.err.println("숫자를 입력하세요!!!");
					}
				}
				System.out.println();
		
				if (arr[0]==9 || arr[0]==0 || arr[0]==1 || arr[0]==2) {
					System.out.println("가입 불가"); break;
				}else if (arr[0]<9) {
					System.out.println("가입 가능"); break;
				}
			}
		}
	}
}
