package this_;

class Test01{
	public int num = 12345;
	public void test() {
		int num = 303030;
		System.out.println("this : "+this);
		System.out.println("this num : "+this.num);	// 자기 자신(Test01)을 찾아 간 뒤 num을 출력
		System.out.println("num : "+num);	// 자신이 포함되어 있는 지역(test())의 num을 우선시
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		System.out.println("main : "+t);
		System.out.println("main num : "+t.num);
		t.test();
	}
}
