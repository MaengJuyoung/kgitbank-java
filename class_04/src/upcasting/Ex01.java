package upcasting;

class A01{
	public void test() {System.out.println("aaaaa");}
}
class B01 extends A01{
	public void test() {System.out.println("bbbbb");}
}
class C01 extends A01{
	public void test() {System.out.println("ccccc");}
}

public class Ex01 {
	public static void main(String[] args) {
		/* 
		int n = (int)1.11; 		
		// 형 변환 (casting)
		// - upcasting : 자식에서 부모로 형 변환
		// - downcasting : 부모에서 자식으로 형 변환 
		*/
		
		A01 a;
		a = new B01(); a.test();
		a = new C01(); a.test();	// 업캐스팅
		/*
		B01 b;
		C01 c;
		b = new B01(); b.test();
		c = new C01(); c.test();
		*/
		
	}
}
