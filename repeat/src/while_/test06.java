package while_;

public class test06 {
	public static void main(String[] args) {
		// 4, 6으로 나누었을 때 나머지가 1인수의 합 구하기
		int sum=0, n;
		for (n=1; n<=1000; n++) {
			if (n%4==1 && n%6==1) {
				sum +=n;
			}
		}
		System.out.println("합 : "+sum );
	}
}
