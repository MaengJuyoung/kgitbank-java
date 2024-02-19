package constructor;

import java.util.ArrayList;

class TestClass04{
	public TestClass04(int num) {
		System.out.println("매개변수 받는 생성자");
	}
	public TestClass04(){	// 기본생성자를 만들어두어야 에러 발생하지 않음
		System.out.println("기본 생성자 실행");
	}
	public void test() {
		System.out.println("test 호출");
	}
	public void test(int num) {
		System.out.println(num+" test 호출");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test(); t.test(100);
		TestClass04 t2 = new TestClass04(1000);
		
		ArrayList arr = new ArrayList<>();
		String s = new String();
		String s1 = new String("값 전달");
	}
}
