package exception;

class Test06{
	public void test1() {
		System.out.println(11111);
		test2();
	}
	public void test2() {
		System.out.println(22222);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Ex06 {		// 예외 전가
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.test1();
		// Thread.sleep(1000);
	}
}
