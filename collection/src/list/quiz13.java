package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz13 {
	public static void main(String[] args) {
		// 5조 2번
		// 리스트를 활용하여 연락처 목록을 생성하는 프로그램을 만드시오
		/*1. 연락처 등록
		2. 연락처 보기
		3. 연락처 삭제
		4. 모든 연락처 보기
		5. 종료

		1 입력 시 ) 연락처의 이름과 번호를 등록. 중복된 이름 등록 시 "중복된 이름이 있습니다." 
		2 입력 시 ) 원하는 이름을 입력하면 번호를 확인할 수 있음.없는 이름 입력 시 "목록에 없습니다."
		3 입력 시 ) 원하는 이름을 입력하면 번호를 삭제할 수 있음. 없는 이름 입력 시 "목록에 없습니다."
		4 입력 시 ) 모든 이름과 번호를 확인할 수 있음	*/
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		while (true) {
			System.out.println("----------------");
			System.out.println("1. 연락처 등록\n2. 연락처 보기\n3. 연락처 삭제\n4. 모든 연락처 보기\n5. 종료");
			System.out.print("번호 선택 > ");
			int choice = sc.nextInt();
			System.out.println("----------------");
			
			if (choice==1) {
				
			}
		}
		
		

	}
}
