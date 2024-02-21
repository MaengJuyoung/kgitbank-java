package abstract_;
abstract class Test01{
	public abstract void speed();	// 추상 메소드
	public void myBreak() {
		System.out.println("멈춤 기능");
	}
}
class TestClass01 extends Test01{
	public void speed() {	// 추상 메소드 구현
		System.out.println("2025");
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.speed(); t.myBreak(); t.autoSystem();
		
	}
}
