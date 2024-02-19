package if_;

import java.util.Scanner;

public class quiz14 {
	public static void main(String[] args) {
		// 5조 2번
		// 600kg을 담을 수 있는 컨테이너에 물건을 모두 실으려고 한다. A가 세 물건을 실을 때, 
		// 세 물건의 무게를 입력 받고 세 물건의 무게 총합과 남은 무게, "가장 무거운 무게는 ~kg
		// 입니다"를 출력하시오. 600kg 초과될 경우 "무게가 600kg를 초과하였습니다. 
		// ~kg을 제외하시오" 메세지를 출력하시오
		
		int n1, n2, n3, sum, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("세 물건의 무게를 입력하시오 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		sum = n1+n2+n3;
		
		if (n1>n2) max = n1;
		else max = n2;
		if (max<n3) max = n3;
		
		System.out.println();
		System.out.println("세 물건의 무게 총합은 "+sum+"kg 입니다.");
		if (sum>600) {
			System.out.println("무게가 600kg을 초과하였습니다.");
			System.out.println((sum-600)+"kg을 제외하십시오.");
		}else System.out.println("남은 무게는 "+(600-sum)+"kg 입니다.");
		System.out.println("가장 무거운 무게는 "+max+"kg 입니다.");
		
		/* 출제자 답
		Scanner input = new Scanner(System.in);
		int w1 = 0, w2 = 0, w3 = 0;
		int sum = 0, remain = 0;
				
		System.out.println("무게를 입력하시오 : ");
		w1 = input.nextInt();
		w2 = input.nextInt();
		w3 = input.nextInt();
				
		sum = w1 + w2 + w3 ;
		remain = 600 - sum;
				
				
		if (sum > 600) {
			remain = sum - 600;
			System.out.println("무게가 600kg를 초과하였습니다.");
			System.out.println(remain + "kg을 제외하시오");
		}
		else if (w1 > w2 && w1 > w3) {
			System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
			System.out.println("남은 무게는 " + remain + "kg 입니다.");
			System.out.println("가장 무거운 물건은 " + w1 + "kg 입니다");
		}
		else if (w2 > w1 && w2 > w3) {
			System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
			System.out.println("남은 무게는 " + remain + "kg 입니다.");
			System.out.println("가장 무거운 물건은 " + w2 + "kg 입니다");
		}
		else {
			System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
			System.out.println("남은 무게는 " + remain + "kg 입니다.");
			System.out.println("가장 무거운 물건은 " + w3 + "kg 입니다");
		}
		*/
	}
}
