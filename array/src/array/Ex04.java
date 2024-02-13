package array;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = new int[] {100, 200, 300};
		double[] dos = {1.234, 2.345, 3.456};
		String[] str = {"안녕", "하세요"};
		
		// for (int i=0; i<arr.length; i++) {}
		// for each : for (자료형 변수 : 배열명)
		for (int num : arr) {	// arr이 갖고 있는 값들을 num에 저장하겠다.
			System.out.println(num);
		}
		for (double dou : dos) {
			System.out.println(dou);
		}
		for (String s : str) {
			System.out.println(s);
		}
	}
}
