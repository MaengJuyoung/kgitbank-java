package array;

public class quiz15 {
	public static void main(String[] args) {
		// 7조 3번
		// 최댓값과 최솟값을 찾아 출력하시오
		// int[] numbers = {5, 1, 9, 3, 7, 2};
		int[] numbers = {5, 1, 9, 3, 7, 2};
		int max=numbers[0], min=numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>max) max =numbers[i];
			if (numbers[i]<min) min=numbers[i];
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}
}
