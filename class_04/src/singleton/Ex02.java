package singleton;
class Test02{
	int num;
	static int cnt;
	public Test02() {
		cnt++;
		System.out.println(cnt+" : 객체 생성");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		// singleton : new 객체를 하나만 만들고 생성된 공간을 공유 
		Test02 t01 = new Test02();
		Test02 t02 = t01;//new Test02();
		Test02 t03 = t02;//new Test02();
		
		t01.num = 100;
		t02.num = 200;
		t03.num = 300;
		
		System.out.println(t01+" : "+t01.num);
		System.out.println(t02+" : "+t02.num);
		System.out.println(t03+" : "+t03.num);
	}
}
