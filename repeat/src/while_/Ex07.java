package while_;

public class Ex07 {
	public static void main(String[] args) {
		String n1 = null, n2="test";
		int num = 1000;
		// System.out.println(n1.equals(n2)); 	null값을 가지고 있을 시 equals기능 사용 불가
		System.out.println(n2.equals(n1));		// n2는 값을 가지고 있으므로 equals 사용 가능
		if (n1==null) {
			System.out.println("n1 입력하세요 > ");
		}else {
			if(n1.equals(n2)) {
				System.out.println("두 문자열은 같다.");
			}else {
				System.out.println("두 문자열은 다르다");
			}
		}
	}
}
