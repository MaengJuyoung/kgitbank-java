package lambda;

interface Test02{
	public void test();
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			
			@Override
			public void test() {
				System.out.println("test 실행");
			}
		};
		t.test();
		System.out.println("---- 람다 ----");
		Test02 t02 = () -> System.out.println("test 실행 222");
		// Test02안에 있는 test()메소드에 sysout 내용을 넣겠다. 는 문장임.
		// 단 메소드가 두개이상일 때에는 위 람다식을 사용할 수 없음. 하나여야 사용 가능!
		t02.test();
	}
}
