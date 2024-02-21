package singleton;
class Test03{
	private static Test03 t;
	int num;
	private Test03() {
		System.out.println("생성자 실행");
	}
	public static Test03 객체생성메소드() {
		System.out.println("객체 생성 메소드 연동");
		System.out.println("t : "+t);
		if (t==null) {
			t = new Test03();
		}		
		return t;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		// Test03 t = new Test03();
		Test03 t01 = Test03.객체생성메소드();
		Test03 t02 = Test03.객체생성메소드();
		Test03 t03 = Test03.객체생성메소드();
		t01.num = 1000; t02.num=2000; 
		System.out.println(t01+" : "+t01.num);
		System.out.println(t02+" : "+t02.num);
		System.out.println(t03+" : "+t03.num);
		
		
	}
}
