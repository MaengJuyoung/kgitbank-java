package variable;

public class StaticTest05 {
	// static 변수 : 다른 많은 파일에서 필요로 하는 경우 사용
	public static String URL = "c://공유폴더//접근한다";	// static변수는 대문자 많이 사용
	// instance 변수 : 클래스 내부의 많은 메소드에서 필요로 하는 경우 사용
	public String url_1 = "c://공유폴더//접근한다";
	public void test1() {
		// 지역변수 : 메소드 안에서 일회성으로 어떠한 연산을 할 때 사용
		int num;
	}
}
