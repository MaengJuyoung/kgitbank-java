package array;

public class quiz03_1 {
	public static void main(String[] args) {
		// 1조 1번
		// arr = {"a","b","c","d","e"}; 를 역순으로 다시 배열에 저장하고 출력하세요
		// arrayName.clone() 메소드 이용
		
		String arr[] = new String[] {"a","b","c","d","e"};
		String brr[] = arr.clone();
		for (int i=0; i<arr.length; i++) {
			arr[i] = brr[(arr.length-1)-i];
			System.out.print(arr[i]+" ");
		}
		
	}
}
