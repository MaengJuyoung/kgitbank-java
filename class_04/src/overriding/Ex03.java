package overriding;

final class Test03{
	public void test() {
		System.out.println("test03의 test 기능");
	}
}
class TestClass03 {
	Test03 t = new Test03();
	public void test() {
		System.out.println("class03 test기능");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}
}
