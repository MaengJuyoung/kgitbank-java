package interface_;

interface A01{
	public void test1();
}
interface B01{
	public void test1();
}
class Class01{ }
class Class02{ }
public class Ex01 extends Class01 implements A01, B01{
	public static void main(String[] args) {
		
	}

	@Override
	public void test1() {
		// A01 메소드의 내용이 없으므로 상속받는 부분에서 반드시 실체화를 해주어야 함!
		
	}
}
