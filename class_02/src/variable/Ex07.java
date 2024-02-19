package variable;

class Test07{
	public static final String KOREA = "대한민국";
	public static int num;
	static {
		num = 12345;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		// final String KOREA = "대한민국";
		// KOREA = "미국";
		System.out.println(Test07.KOREA);	// static 접근 시 클래스명으로 접근
		System.out.println(Test07.num);
		
		Test07 t = new Test07();
		System.out.println(t.KOREA);	// 객체로도 접근가능하나 경고발생
	}
}
