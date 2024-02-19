package set_get;

class Test01{
	private int num = 12345;	// private : 외부 접근은 제한하지만 내부에서는 접근 가능
	public void test(int n) {	// private를 외부에서 이용하기 위해 test()메소드를 이용
		num = n;		// 값을 저장하는 메소드
	}
	public int test2() {
		return num;		// 값을 꺼내오는 메소드
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test(1000);
		System.out.println(t.test2());
	}
}
