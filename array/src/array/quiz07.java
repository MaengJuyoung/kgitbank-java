package array;

public class quiz07 {
	public static void main(String[] args) {
		// 2조 2번
		// 배열에 저장된 요소의 합과 최대값을 구하세요. int arr[] = new int [] {12, 56, 23, 39}

		int arr[] = new int [] {12, 56, 23, 39};
		int sum=0, max=arr[0];
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
			if (max<arr[i]) max=arr[i];
		}
		System.out.println("요소의 합 : "+sum);
		System.out.println("최댓값 : "+max);
		
	}
}
