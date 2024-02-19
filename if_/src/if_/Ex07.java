package if_;

public class Ex07 {
	public static void main(String[] args) {
		int num = 150;
		if (num>0) {
			if (num<100) {
				System.out.println("num은 100보다 작은 양수");
			}else {
				System.out.println("num은 100보다 큰 양수");
			}
		}else {
			System.out.println("음수입니다.");
		}
		System.out.println("다음 문장들 실행!!!");
	}
}
