package day02;

public class Ex02 {
	public static void main(String[] args) {
		int number = 123;
		System.out.println("변경 전 num : "+number);
		number = 100;
		System.out.println("변경 후 num : "+number);
		number = number + 200;
		System.out.println("변경 후 num : "+number);
	}
}
