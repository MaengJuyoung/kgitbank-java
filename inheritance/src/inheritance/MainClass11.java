package inheritance;

class A{
	public void a() {
		System.out.println("a 메소드 실행");
	}
}
class B extends A{	// 여러 개의 상속을 원할 시 물림식으로 상속받아야 함
	public void b() {
		System.out.println("bbbb 메소드 실행");
	}
}
class C extends B{	// 클래스는 여러개 상속 불가
	public void c() {
		System.out.println("cccc 메소드 실행");
	}
}

public class MainClass11 {	
	public static void main(String[] args) {
		C c = new C();
		c.a(); c.b(); c.c();
	}
}
