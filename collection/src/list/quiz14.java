package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz14 {
	public static void main(String[] args) {	// 2조 1번과 동일하여 복붙
		// 5조 3번
		// 5명의 사람 이름을 입력 받아서 ArrayList에 저장한 후	이들 중 '김'씨 성을 가진 사람 모두 출력

		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<>();
		
		for(int i = 1; i < 6; i++) {
			System.out.print(i + "번째 사람의 이름을 입력하세요 : ");
			String name = input.nextLine();
			nameList.add(name);
		}
		
		System.out.println("김씨 성을 가진 사람들");
		
		for(int i = 0; i < 5; i++) {
			if(nameList.get(i).charAt(0) == '김') {
				System.out.println(nameList.get(i));
			}
		}
	}
}
