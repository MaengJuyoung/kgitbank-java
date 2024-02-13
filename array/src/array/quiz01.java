package array;

import java.util.Random;

public class quiz01 {
	public static void main(String[] args) {
		// 4조 2번(이태영)
		// 배열 int asd [] = [{1,2,3},{4,5,6},{7,8,9}]을 만든후, 랜덤으로 세 숫자를 출력 후, 
		// 짝수인지 홀수인지 판단하여 출력
		// * Random rand = new Random()
		//   a1 = rand.nextInt(3);
		int n1, n2;
		Random rand = new Random();
		int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=1; i<=3; i++) {
			n1 = rand.nextInt(3);
			n2 = rand.nextInt(3);
			if (arr[n1][n2]%2==0) {
				System.out.println("짝수 : "+arr[n1][n2]);
			}else {
				System.out.println("홀수 : "+arr[n1][n2]);
			}
		}
		
		
	}
}
