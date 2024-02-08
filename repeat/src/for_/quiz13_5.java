package for_;

public class quiz13_5 {
	public static void main(String[] args) {
		// 5조 1번
		// 1부터 시작해 홀수의 합을 구하시오, 
		// 단) 합이 10000을 넘지 않는 마지막 홀수값을 구하시오
		
		int sum=0;
		int i=0;
		while (true) {
			if (i%2==1) {
				sum+=i;
			}
			if (sum>10000) {
				sum-=i;
				i=i-2;
				break;
			}
			++i;
		}
		System.out.println(sum);
		System.out.println(i);
		
		/* 출제자 답
		int sum = 0, i;
		for(i=1; sum<10000; i++) {
			if(i % 2 == 1) 
				 sum += i;
		}
		i--;
		System.out.println("마지막에 더해진 홀수: " + i);
		System.out.println("마지막에 더해진 합: " + sum);*/
	}
}
