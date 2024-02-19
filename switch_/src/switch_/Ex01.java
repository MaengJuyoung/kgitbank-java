package switch_;

public class Ex01 {
	public static void main(String[] args) {
		int select = 1;
		switch (select) {
		case 1: 
			System.out.println("1입력"); 
			select=222;
			break;
		case 2: System.out.println("2입력"); break;
		default: System.out.println("1,2 제외한 값");
		}
		System.out.println("다음 문장들 실행!!!");
		System.out.println();
		
		if (select==1) {
			System.out.println(1111);
		}else if (select==2) {
			System.out.println(2222);
		}else {
			System.out.println("그 외의 값");
		}
	}
}
