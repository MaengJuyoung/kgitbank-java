package inheritance;

class Test10{
	// private int num = 1000;	// private는 상속받아도 외부에서 접근 X
	protected int num = 1000;	// protected : 외부 접근은 제한하지만 상속받은 자식한테는 허용
}
class TestClass10 extends Test10{
	public int num = 12345;
	public void test() {
		System.out.println("num : "+num);
		System.out.println("this.num : "+this.num);
		System.out.println("super.num : "+super.num);
	}
}

public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 tc = new TestClass10();
		tc.test();
	}
}
