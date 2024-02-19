package while_;

public class test07 {
	public static void main(String[] args) {	// 다중 반복문
		// 구구단 만들기
		int result;
		
		/*
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				result = i*j;
				System.out.println(i+" X "+j+" = "+result);
			}
			System.out.println("------------");
		}
		*/
		
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				result = j*i;
				System.out.print(j+" X "+i+" = "+result+"\t");
			}
			System.out.println();
		}
	}
}
