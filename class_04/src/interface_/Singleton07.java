package interface_;

public class Singleton07 {
	private static TestInt07 t;
	private Singleton07() {};
	public static TestInt07 getInstance() {
		if (t ==null) {
			t = new TestClass07();	// 이 부분만 변경하면 됌. _1
		}
		return t;
	}
}
