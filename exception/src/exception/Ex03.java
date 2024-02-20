package exception;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		try {
			int n1=10, n2=2;
			System.out.println(n1/n2);
			
			ArrayList<String> arr = new ArrayList<>();
			arr.add("111");		// 0
			arr.add("222");		// 1
			arr.add("333");		// 2
			for (int i=0; i<=arr.size(); i++) {
				System.out.println(arr.get(i));
			}
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("문제 발생 : "+e);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음!!!");
		}
		System.out.println("다음 문장들 이어서 진행!!!");
	}
}
