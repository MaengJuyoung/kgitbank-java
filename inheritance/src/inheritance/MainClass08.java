package inheritance;

class Test08{
	public Test08(String s) {
		System.out.println(s+" 부모 생성자 실행!!!");
	}
}
class TestClass08 extends Test08{
	public TestClass08() {
		super("값 전달");	// super는 무조건 생성자 첫 번째 줄에 들어가야 함. 
		System.out.println("자식 생성자 실행!!!");
	}
}

public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 tc = new TestClass08();
	}
}
