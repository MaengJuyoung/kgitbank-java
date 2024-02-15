package class_;

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 tc = new TestClass01();
		tc.name = "홍길동";
		tc.age = 20;
		System.out.println("이름 : "+tc.name);
		System.out.println("나이 : "+tc.age);
	}
}
