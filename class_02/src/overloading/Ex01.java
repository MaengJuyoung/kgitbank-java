package overloading;

import java.util.ArrayList;

class TestClass01{
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n) {
		System.out.println("n을 가지고 연산합니다.");
	}
	public void sumFunc(int n, int num) {
		
		System.out.println(n+num+"입니다.");
	}
public void sumFunc(String s, String s2) {
		
		System.out.println(s+s2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc(10);
		t.sumFunc(10, 20);
		t.sumFunc("안녕", "하세요");
	}
}
