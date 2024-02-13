package while_;

public class Ex01 {
	public static void main(String[] args) {
		int i=1, sum=0;
		// while (i<=10) {
		for ( ; i<=10; ) {
			System.out.println(i);
			sum +=i;
			i++;
		}
		System.out.println("sum = "+sum);
		System.out.println("다음 문장들 실행!!!");
	}
}
