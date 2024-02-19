package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz11 {
	public static void main(String[] args) {
		// 1조 3번
		// 유저 관리 프로그램 작성
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();

		while (true) {
			System.out.println("---- 유저 관리 프로그램 ----");
			System.out.println("1. 유저 정보 입력\n2. 유저 정보 검색\n3. 유저 정보 수정\n4. 유저 정보 삭제\n5. 종료");
			System.out.print("번호를 선택해주세요 > ");
			int choice = sc.nextInt();
			System.out.println("-----------------------");

			if (choice==1) {
				System.out.print("이름 입력\t >> ");
				arr.add(sc.next());
				System.out.print("아이디 입력\t >> ");
				arr.add(sc.next());
				System.out.print("패스워드 입력>> ");
				arr.add(sc.next());
				System.out.print("나이 입력\t >> ");
				arr.add(sc.next());
				System.out.print("주소 입력\t >> ");
				arr.add(sc.next());
			}else if (choice==2) {
				System.out.print("이름 검색\t >>> ");
				String name = sc.next();
				System.out.println();
				if (arr.contains(name)) {
					int index = arr.indexOf(name);
					System.out.println("이름\t : "+arr.get(index));
					System.out.println("아이디\t : "+arr.get(index+1));
					System.out.println("패스워드\t : "+arr.get(index+2));
					System.out.println("나이\t : "+arr.get(index+3));
					System.out.println("주소\t : "+arr.get(index+4));
				}else {
					System.out.println("이름이 존재하지 않습니다.");
				}
			}else if (choice==3) {
				System.out.print("이름 검색\t >>> ");
				String name = sc.next();
				System.out.println();
				if (arr.contains(name)) {
					int index = arr.indexOf(name);
					System.out.print("이름 입력\t >> ");
					arr.set(index, sc.next());
					System.out.print("아이디 입력\t >> ");
					arr.add(index+1, sc.next());
					System.out.print("패스워드 입력>> ");
					arr.add(index+2, sc.next());
					System.out.print("나이 입력\t >> ");
					arr.add(index+3, sc.next());
					System.out.print("주소 입력\t >> ");
					arr.add(index+4, sc.next());
				}else {
					System.out.println("이름이 존재하지 않습니다.");
				}
			}else if (choice==4) {
				System.out.print("이름 검색\t >>> ");
				String name = sc.next();
				if (arr.contains(name)) {
					int index = arr.indexOf(name);
					String rm = arr.get(index);
					for (int i=0; i<5;i++) {
						arr.remove(index+i);
					}
					System.out.println(rm+"님 정보가 삭제되었습니다.");
				}else {
					System.out.println("이름이 존재하지 않습니다.");
				}
			}else if (choice==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}



	}
}
