package singleton;
class Test01{
	int num;
	static int cnt;
	public Test01() {
		cnt++;
		System.out.println(cnt+" : 객체 생성");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t01 = new Test01();
		Test01 t02 = new Test01();
		Test01 t03 = new Test01();
		
		t01.num = 100;
		t02.num = 200;
		t03.num = 300;
		
		System.out.println(t01+" : "+t01.num);
		System.out.println(t02+" : "+t02.num);
		System.out.println(t03+" : "+t03.num);
	}
}
