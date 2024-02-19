package string;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println("lenght : "+str.length());
		System.out.println("charAt(1) : "+str.charAt(1));	// str.charAt(1) : 1번째 값 가져오기
		
		System.out.println(str.charAt(0) == 't');		// 문자 하나는 charAt 사용
		System.out.println(str.charAt(0) != 't');		
		System.out.println(str.equals("aaaa"));			// 문자열은 equals 사용
		
		String jumin = "000118";
		if (jumin.length()==6) {
			int i=0;
			for(; i<jumin.length(); i++) {
				if(jumin.charAt(i)<'0' || jumin.charAt(i)>'9') {
					System.out.println("숫자를 입력하세요");
					break;
				}
			}
			if (i == jumin.length()) {
				System.out.println("주민번호 뒷자리를 입력하세요!");
			}
		}else {
			System.out.println("길이가 잘못됨!");
		}
		
		
		System.out.println("------------------------");
		int i=0;
		for (; i<6;i++) {
			if (i==5) break;
		}
		System.out.println("i : "+i);
	}
}
