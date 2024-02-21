package upcasting;
class Test{}
public class Ex03 {
	public static void main(String[] args) {
		Object num = 100;		// int num = 100;
		Object name = "홍길동";	// String name = "홍길동";
		Object t = new Object();
		// System.out.println(num);
		System.out.println(num.getClass());
		// System.out.println(name);
		System.out.println(name.getClass());
		
		int a = 100 + (int)num;	// num의 자료형이 Object이므로 형 변환을 해줘야함
		System.out.println(a);
	}
}
