package array;

public class quiz06_2 {
	public static void main(String[] args) {	// 다시보기! 복붙
		// 2조 1번
		// 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
		/*
		1+1+1+1
		1+1+2
		1+2+1
		2+1+1
		2+2
		1+3
		3+1
		정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.*/
		
		// https://www.acmicpc.net/problem/9095

	}
}

//백준에 제출할때는 반드시 클래스명이 Main이여야 합니다.
//패키지도 제외해야합니다.
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 정수 1일때  ==> 1                				1개
		// 정수 2일때  ==> (1, 1) , (2)     				2개
		// 정수 3일때  ==> (1, 1, 1), (2, 1), (1, 2) (3)    4개
		// 정수 4일때  ==> (1, 1, 1, 1), (2, 1, 1), 
		//		(1, 2, 1), (1, 1, 2), (3, 1), (1, 3), (2, 2) 7개
		
		// 정수 5일때  ==> ....                              13개
		// 정수 6일때  ==> ....                      		 24개
		
		Scanner s = new Scanner(System.in);

		int dp[] = new int[13];

		int total[] = new int[500];

		boolean con = false;
		
		// 테스트케이스의 개수
		int Time = 0;
		int a = 0;
		
		int check = 0;
		
		Time = s.nextInt();
		a = Time;

		// 초기화
		for (int i = 0; i < 13; i++)
			dp[i] = 0;
		
		if(Time > 0)
			con = true;

		while (con) 
		{
			Time--;
			if(Time == 0)
				con = false;
			int n;
			n = s.nextInt();
			for (int i = 1; i <= n; i++) 
			{
				if (i == 1)
					dp[i] = 1;
				else if (i == 2)
					dp[i] = 2;
				else if (i == 3)
					dp[i] = 4;		
				else
					// 예시) 정수 4일때 = 정수 3일때 + 정수 2일때 + 정수 1일때 
					dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
			total[check] = dp[n];
			check++;
		}

		for (int i = 0; i < a; i++) 
		{
			System.out.println(total[i]);
		}


	}

}*/
