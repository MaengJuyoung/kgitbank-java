package array;

public class quiz14 {
	public static void main(String[] args) {
		// 7조 2번
		// 두수의 합을 구하시오
		// int a[] = new int[] {10, 100, 1000, 10000, 100000};
		// int b[] = new int[] {90, 900, 9000, 90000, 900000};
		int a[] = new int[] {10, 100, 1000, 10000, 100000};
		int b[] = new int[] {90, 900, 9000, 90000, 900000};
		int sum = 0;
		
		for (int i=0; i<a.length; i++) {
			for (i=0; i<b.length; i++) {
				sum += a[i]+b[i];
				System.out.println("두 수의 합 = "+sum);
				sum=0;
			}
		}		
	}
}
