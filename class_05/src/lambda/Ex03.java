package lambda;

interface Test03{
	public void test(int num, String msg);
}

public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03() {
			
			@Override
			public void test(int num, String msg) {
				System.out.println("num : "+num);
				System.out.println("msg : "+msg);
			}
		};
		t.test(100, "안녕하세요");
		
		System.out.println("---- 람다식 ----");
		Test03 t02 = (n,s) -> {
			System.out.println("n : "+n);
			System.out.println("s : "+s);
		};
		t02.test(500, "연습");
	}
}
