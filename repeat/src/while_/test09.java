package while_;

public class test09 {
	public static void main(String[] args) {	// 다중 반복문
		/* 단일 반복문
		for (int i=1; i<=25; i++) {
			if (i%5==1) System.out.println();
			System.out.print(i+"\t");
		}
		*/
		
		for (int i=1; i<25; i+=5) {
			for (int j=0; j<5; j++) {
				System.out.print(i+j+"\t");
			}
			System.out.println();
		}
	}
}
