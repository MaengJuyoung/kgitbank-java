package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		// 3조 2번
		// 성적부에 1등급 학생들의 이름이 나열되어 있다. 가장 앞에 "1등급" 이라는 문구를 넣고,
		// 사용자에게 이름과 점수를 3번씩 입력받아 각 학생들의 이름을 "이름+점수"로 수정하고, 루프가 끝나게 하시오.
		// *변수.add(인덱스번호, "문자열") 형식으로 원하는 위치의 인덱스번호로 값을 추가
		// *변수.contains() 의 반대는 !변수.contains()
		// 최종 출력물 = [1등급, 홍길동90, 김개똥98, 김길동95]
		
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
		
		for (int i=0; i<3; i++) {
			arr.add(sc.next());
		}
		arr.add(0, "1등급");
		System.out.println(arr);
		
		for (int i=0; ;i++) {
			System.out.print("이름을 입력하세요 >>> ");
			String name = sc.next();
			if (!arr.contains(name)) {
				System.out.println("잘못된 이름입니다.");
				i--;
				continue;	// 반복문의 시작 위치로 이동
			}
			System.out.print("점수를 입력하세요 >>>> ");
			int score = sc.nextInt();
			
			int num = arr.indexOf(name);
			arr.set(i+1, name+score);
			
			if (i==2) break; 	// 반복문 탈출
		}
		System.out.println(arr);
	}
}
