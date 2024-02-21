package interface_;

class A04{
	public void aaa() { }
}
class B04 extends A04{
	public void aaa() { }
	public void bbb() { }
	public void ccc() { }
}

public class Ex04 {
	public static void main(String[] args) {
		A04 b = new B04();		// 업캐스팅 시
		// 업캐스팅의 단점 : 부모가 가지고 있는 메소드만 보이고 자식이 가지고 있는 메소드는 보이지 않음. 
		
		
	}
}
