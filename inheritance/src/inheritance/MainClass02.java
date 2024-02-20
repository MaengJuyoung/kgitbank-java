package inheritance;

import java.util.ArrayList;

class TestClass02 extends ArrayList<String> {
	public void test() {
		System.out.println("test 메소드 실행");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 tc = new TestClass02();
		tc.test();
		tc.add("aaaa");
		System.out.println(tc.get(0));
	}
}
