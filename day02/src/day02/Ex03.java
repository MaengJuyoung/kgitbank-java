package day02;

public class Ex03 {
	public static void main(String[] args) {
		char ch = 'A';
		int num = 5;
		int ret;
		ret = ch +num;
		System.out.println("A + 5 = "+ret);
		System.out.println("ch : "+ch);
		System.out.println("num : "+num);
		
		String str = "hello";
		System.out.println("변경 전 str : "+str);
		str = "test";
		System.out.println("변경 후 str : "+str);
	}
}
