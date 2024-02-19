package for_;

public class quiz14 {
	public static void main(String[] args) {
		// 5조 2번
		// 100부터 500사이의 암스트롱수를 구하는 프로그램을 작성해보자.
		// 암스트롱 수 : 3자리 숫자로 구성되는 수로 각 자릿수에 있는 숫자의 세제곱의 합이 자신과 같은 수

		int n1, n2, n3;
		for (int i=100; i<500; i++) {
			n1 = i/100;
			n2 = (i%100)/10;
			n3 = i%10;
			if (n1*n1*n1+n2*n2*n2+n3*n3*n3==i) {
				System.out.print(i+" ");
			}
		}
	}
}
