package overriding;

class Test05{
	
}

public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		// .getClass() : 해당하는 객체에 대한 자료형을 알려줌
		System.out.println("aaa".getClass());	
		System.out.println(t.getClass());
		// .toString() : 자료형 + 위치를 알려줌
		System.out.println(t.toString());
		System.out.println(t);
	}
}
