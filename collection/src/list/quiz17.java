package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz17 {
	public static void main(String[] args) {
		// 7조 3번
		// 입력받은 문자열을 ArrayList<String>에 저장하고, 
		// 입력이 끝나면 exit를 눌러 저장된 문자열을 출력하시오.

		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("문자열을 입력하세요 >> ");
			String str = sc.next();
			arr.add(str);
			if (str.equals("exit")) {
				System.out.println("-----입력 끝-----");
				for (int i=0; i<arr.size(); i++) {
					System.out.println(arr.get(i));
				}
				break;
			}
		}

		/* 출제자 답
		ArrayList<String> arr = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		String input;

		System.out.println("문자열을 입력하세요 (종료하려면 'exit'를 입력하세요):");

		while (true) {
			input = scanner.nextLine();

			if (input.equals("exit")) {
				break;
			}

			// 입력된 문자열을 ArrayList에 추가
			arr.add(input);
		}

		// ArrayList의 모든 요소 출력
		System.out.println("입력된 문자열:");
		for (String str : arr) {
			System.out.println(str);
		}
		*/
	}
}
