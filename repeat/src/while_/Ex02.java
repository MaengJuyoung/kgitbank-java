package while_;

public class Ex02 {
	public static void main(String[] args) {
		int i = 0;
		while(true) {
			i++;
			System.out.println("i : "+i);
			if (i>3) {
				break;
			}
		}
		System.out.println("다음 문장 실행!!!");
		
		for (;;) {
			System.out.println("for i : "+i);
			i++;
			if (i>5) break;
		}
	}
}
