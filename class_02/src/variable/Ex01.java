package variable;

class Test01{
	public int test1() {
		int num = 100;		// 지역변수
		System.out.println("test1 : "+num);
		return num;
	}
	public void test2(int num) {
		 System.out.println("test2 : "+num);	// num이 다른 지역에 있으므로 그냥은 사용 불가
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		int n = t.test1();
		t.test2(n);
		
		/*
		String name = "홍길동";
		if(true) {
			String n = "1111";
			name = "김개똥";
		}
		// System.out.println(n);		// n이 if문에서 초기화됐으므로 if문 안에서만 사용사능
		System.out.println(name);	*/
	}
}
