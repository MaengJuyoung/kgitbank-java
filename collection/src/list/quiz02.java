package list;

import java.util.Random;

public class quiz02 {
	public static void main(String[] args) {
		// 4조 3번 (오승민)
		// 1~45까지의 6자리의 숫자를 랜덤으로 출력하여 로또 번호 만들기
		// 로또 번호는 중복하여 나오지 않으니 중복이 나오지 않게 해야 합니다.
		// 번호 출력 후 오름차순으로 정렬해주기
		// ex ) 45,12 , 7 ,43,42,40 이 출력되면
		// 		7, 12, 40,42,43,45 로 오름차순 정렬 

		Random ran = new Random();
		int lotto[] = new int[6];

		for (int i=0; i<lotto.length; i++) {
			lotto[i]=ran.nextInt(45)+1;
			for (int j=0; j<i; j++) {// 중복 제거
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}

		System.out.print("로또 번호 : ");
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}

		// 오름차순 정렬
		for  (int i=0; i<lotto.length; i++) {
			for (int j=0; j<i; j++) {
				if (lotto[j]>lotto[i]) {
					int tmp = 0;
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.print("\n오름차순 정렬 > ");
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}


		/* 출제자 답 ! import java.util.Random; 미 사용시

		int[] lotto = new int[6];

		for(int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;

			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; 
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		int temp = 0;   
		for(int i = 0; i < lotto.length; i++) {

			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i] < lotto[j]) { //오름차순
					temp = lotto[i];   

					lotto[i] = lotto[j];   

					lotto[j] = temp;   
				}
			}
		}

		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		*/
	}
}
