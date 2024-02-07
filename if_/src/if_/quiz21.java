package if_;

public class quiz21 {
	public static void main(String[] args) {	// 복습! 출제자 답 그대로 복사
		// 7조 3번
		// 1. 각각의 문자열 2진수를 정수로 형변환하여 num1...4 변수에 대입하시오.[integer...]
		// 2. 형변환한 2진수를 출력하시오.
		// 2. 정수형 변수 result1과 result2를 만드시오
		// 3. result1에 num1과 num2를 &(AND) 연산자로 계산하여 대입하시오.
		// 4. result1에 num3과 num4를 |(or)  연산자로 계산하여 대입하시오.
		// 5. if문을 사용하여 result1과 result2의 크기를 비교하여 큰 수, 작은 수로 출력하시오.

		String ezinsu1 = "00001111";
		String ezinsu2 = "00000011";
		String ezinsu3 = "00010011";
		String ezinsu4 = "00011100";

		int num1 = Integer.parseInt(ezinsu1, 2);
		int num2 = Integer.parseInt(ezinsu2, 2);
		int num3 = Integer.parseInt(ezinsu3, 2);
		int num4 = Integer.parseInt(ezinsu4, 2);

		System.out.println("첫번째 형변환한 2진수: " + num1);
		System.out.println("두번째 형변환한 2진수: " + num2);
		System.out.println("세번째 형변환한 2진수: " + num3);
		System.out.println("네번째 형변환한 2진수: " + num4);

		System.out.println();

		int result1 = num1 & num2;	// 00000011 = 1+2
		int result2 = num3 | num4;	// 00011111 = 1+2+4+8+16

		System.out.println("num1 & num2 = "+result1);
		System.out.println("num3 | num4 = "+result2);

		System.out.println();

		if (result1 > result2) {
			System.out.println(result1 + "은 큰 수입니다.");
			System.out.println(result2 + "은 작은 수입니다.");
		} else if (result1 < result2) {
			System.out.println(result2 + "은 큰 수입니다.");
			System.out.println(result1 + "은 작은 수입니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}
	}
}

