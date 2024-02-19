package variable;

class Test06{
	public static int su;
	
	public void test() {
		su = 1234;
	}
	
	public static int num;
	public static void test2() {
		num = 123;
	}
}

public class Ex06 {
	static int num;
	public static void main(String[] args) {
		test1();
		num = 123;
		
	}
	public static void test1() {
		num = 123;
		System.out.println(num);
	}
}
