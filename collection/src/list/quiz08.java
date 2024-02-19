package list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		// 2조 3번
		// 랜덤값의 범위를 지정 (1~입력값),	랜덤값 발생할 횟수 지정, 발생된 랜덤값을 ArrayList 에 저장
		// 각 수의 처음 한자리를 출력
		/*출력 내용 : 
		랜덤 값의 범위 지정 : 50
		랜덤 값 발생 횟수 지정 : 6
		5, 2, 8, 3, 1, 1
		발생된 랜덤 값 [5, 21, 8, 38, 18, 13]*/
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("랜덤 값의 범위 지정 : ");
		int num = sc.nextInt();
		System.out.print("랜덤 값 발생 횟수 지정 : ");
		int count = sc.nextInt();

		System.out.println();
		System.out.print("각 수의 앞자리 : ");
		ArrayList<Integer> random = new ArrayList<>();
		for (int i=0; i<count; i++) {
			random.add(ran.nextInt(num-1)+1);
			String str = random.get(i)+"";
			System.out.print(str.charAt(0)+" ");
		}
		System.out.println();
		System.out.println("발생된 랜덤 값 "+random);
	}
}
