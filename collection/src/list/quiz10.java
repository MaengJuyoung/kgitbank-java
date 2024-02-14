package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz10 {
	public static void main(String[] args) {
		// 1조 1번
		// 사용자에게 5번입력 받고  5번입력받은 문자열들을 붙여서 한번에 출력하세요 
		// (String 클래스의 .concat() 이용)
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.print("문자열 5개를 입력하세요 > ");
		for (int i=0; i<5; i++) {
			arr.add(sc.next());
		}
		String tmp="";
		for (int i=0; i<arr.size(); i++) {
			String concatStr = tmp.concat(arr.get(i));		// concat :
			tmp = concatStr;
		}
		System.out.println(tmp);
		
	}
}
