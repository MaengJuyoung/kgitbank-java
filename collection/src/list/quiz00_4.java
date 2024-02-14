package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class quiz00_4 {
	public static void main(String[] args) {
		// 4조 2번
		// 배열 사이즈를 입력받은 후 해당 크기만큼 자연수를 입력받아 ArrayList에 넣어준다.
		// 1. 입력받은 수들의 평균(average)을 구하시오
		// 2. 배열을 오름차순으로 정리하여 중앙값(median)을 구하시오.
		// ArrayList명.sort(Comparator.naturalOrder()); 를 이용하여 오름차순으로 정렬.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 사이즈 입력 >> ");
		int num = sc.nextInt();
		
		ArrayList<Integer> numbers = new ArrayList<>();

		int sum=0, average=0, median=0;

		System.out.print(num+"개의 숫자 입력 >>> ");
		for(int i=0; i<num; i++) {
			numbers.add(sc.nextInt());
		}

		// 평균값 average
		for(int i=0; i<numbers.size(); i++) {
			sum += numbers.get(i);
			average = sum/numbers.size();
		}

		// 오름차순 정렬
		numbers.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : "+numbers);
		
		// 중앙값 median
		int index = numbers.size()/2;
		if(numbers.size()%2==0){
			median = (numbers.get(index-1) + numbers.get(index))/2;
		}
		else {
			median = numbers.get(index);
		}

		// 출력
		System.out.println("평균 : "+average);
		System.out.println("중앙값 : "+median);
	}
}
