package variable;

class Test04{
	public int num;		// 인스턴스 변수
	public static String msg = "연습";	
}

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("변경 전 : "+Test04.msg);
		Test04.msg = "1111";
		System.out.println("변경 후 : "+Test04.msg);
		
		Test04 t = new Test04();
		t.num = 100;
		
		
	}
}
