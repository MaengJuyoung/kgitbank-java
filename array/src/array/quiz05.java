package array;

public class quiz05 {
	public static void main(String[] args) {	// 다시보기! 복붙
		// 1조 3번
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후
		// 그 값을 출력하세요			ex)	10 9 8 7 6 5 4 3 2 1
		
		int arr[] = new int[10];
		int num = arr.length;
		for (int i=0; i<arr.length; i++) {
			arr[i]=num;
			num--;
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
