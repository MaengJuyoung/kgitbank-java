package for_;

public class quiz19_7 {
	public static void main(String[] args) {
		// 7조 1번
		// 1부터 100까지의 짝수 합을 구하시오 [변수명 Psum]
		// 1부터 100까지의 홀수 합을 구하시오 [변수명 Hsum]

		int i=0, Psum=0, Hsum=0;
		while(i<=100) {
			i++;
			if (i%2==0) {
				Psum+=i;
			}else {
				Hsum+=i;
			}
		}
		System.out.println("짝수 합 : "+Psum+", 홀수 합 : "+Hsum);

		/* 출제자 답
		int Psum = 0;
		int Hsum = 0;

		for(int i=0 ; i<=100 ; i++) {
			if(i % 2 == 0) {
				Psum += i;
			} else {
				Hsum += i;
			}
		}

		System.out.println("짝수의 합 : " + Psum);
		System.out.println("홀수의 합 : " + Hsum);
		*/
	}
}
