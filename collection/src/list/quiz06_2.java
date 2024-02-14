package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz06_2 {
	public static void main(String[] args) {	// 다시보기
		// 2조 1번
		// 5명의 사람 이름을 입력 받아서 ArrayList에 저장한 후에 이들 중 '김'씨 성을 가진 사람을 모두 출력하시오.
		// + 김씨 성을 가진 사람이 몇 명인지 출력하시오.
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		System.out.print("5명의 이름 입력 >> ");
		for (int i=0; i<5; i++) {
			name.add(sc.next());
		}
		
		System.out.println("성이 '김'인 분의 이름을 모두 출력합니다.");
		int count=0;
		for (int i=0; i<5; i++) {
			String names = name.get(i); // 배열의 값(이름)을 변수에 저장
            if (names.startsWith("김")) { // 만약 "김"으로 시작한다면, 
                count++; // 인덱스는 +1
                System.out.printf("[%s]\t",name.get(i)); // 이름이 출력됨
            }
		}
		 System.out.println();
	        System.out.println("김씨 성을 가진 분은 모두 " + count + " 명 입니다.");
	}
}
