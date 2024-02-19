package constructor;

class TestClass01{
	public TestClass01() {
		System.out.println("생성자 실행");
	}
	public void test() {
		System.out.println("test 호출");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		// t.test();
	}
}
