package for_;

public class quiz21 {
	public static void main(String[] args) {
		// 7조 3번
		// [보기]의 별 트리를 만드세요
		//[보기]	  *     중첩 for문을 사용하여 완성하시오
		//	     ***
		//	    *****
		//	   *******
		//	  *********  
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
