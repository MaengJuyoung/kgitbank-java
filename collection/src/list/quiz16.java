package list;

import java.util.ArrayList;

public class quiz16 {
	public static void main(String[] args) {
		// 7조 2번
		// ArrayList<String> arr = new ArrayList<>();에
		// 사과, 바나나, 딸기, 오렌지를 순서대로 입력하고 순서대로 출력해보시오.

		ArrayList<String> arr = new ArrayList<>();
		arr.add("딸기");
		arr.add("바나나");
		arr.add("딸기");
		arr.add("오렌지");

		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// 작성자 답
		System.out.println();
		for (String fruit : arr) {
			System.out.println(fruit);
		}

	}
}
