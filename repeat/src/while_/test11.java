package while_;

public class test11 {
	public static void main(String[] args) {	// 이중 반복문
		// 1~1000까지의 수 중 완전수를 구하여라. ex ) 6=1+2+3
		
		for (int i=1; i<=1000; i++) {
			int sum=0;
			for (int j=1; j<i; j++) {
				if (i%j==0) {
					sum+=j;	
				}
			}
			if (i==sum) System.out.println(i);
		}
	}
}
