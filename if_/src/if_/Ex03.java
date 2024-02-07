package if_;

public class Ex03 {
	public static void main(String[] args) {
		int num = 15;
		if (num%2==0) {
			System.out.println("num은 짝수이다.");
			System.out.println("num은 2의 배수이다.");
		}
		System.out.println("다음 문장");
		if (num%2!=0) {
			System.out.println("num은 홀수이다.");
			System.out.println("num은 2의 배수가 아니다.");
		}
		System.out.println("다음 문장들 실행");
	}
}
