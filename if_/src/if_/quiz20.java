package if_;

import java.util.Scanner;

public class quiz20 {
	public static void main(String[] args) {
		// 7조 2번
		// 나이를 입력하여 다음 결과 값을 출력하는 프로그램을 작성하세요.
		// 10대 : 미성년자입니다. 몇 살 뒤에 어른이 됩니다.
		// 20~90대 : 몇십대 어른입니다. , 100살 이상 존재하지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 > ");
		int age = sc.nextInt();
		int newAge = age/10*10;
		
		if (age>9 && age<20) {
			System.out.println("10대 미성년자입니다. "+(20-age)+"살 뒤에 어른이 됩니다.");
		}else if (age<100) {
			System.out.println(newAge+"대 어른입니다.");
		}else if (age>=100) {
			System.out.println("100살 이상 존재하지 않습니다.");
		}else {
			System.out.println("10살 이상, 100살 미만으로 다시 입력해주세요");
		}
		
		/* 출제자 답
		// if-else 문을 사용하여 나이를 판단합니다.
        if (age < 20) {
            System.out.println("10대 미성년자 입니다. " + (20 - age) + "살 후에 어른이 됩니다.");
        } else if (age < 30) {
            System.out.println("20대 입니다.");
        } else if (age < 40) {
            System.out.println("30대 입니다.");
        } else if (age < 50) {
            System.out.println("40대 입니다.");
        } else if (age < 60) {
            System.out.println("50대 입니다.");
        } else if (age < 70) {
            System.out.println("60대 입니다.");
        } else if (age < 80) {
            System.out.println("70대 입니다.");
        } else if (age < 90) {
            System.out.println("80대 입니다.");
        } else if (age < 100) {
            System.out.println("90대 입니다.");
        } else {
            System.out.println("100살은 존재하지 않습니다.");
        }
        */
	}
}
