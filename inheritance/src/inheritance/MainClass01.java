package inheritance;

import java.util.ArrayList;

class TestClass01{
	ArrayList arr;
	public TestClass01() {
		arr = new ArrayList<>();
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 tc = new TestClass01();
		tc.arr.add(111);
		tc.arr.add("data add");
		System.out.println(tc.arr.get(0));
		System.out.println(tc.arr.get(1));
		
	}
}
