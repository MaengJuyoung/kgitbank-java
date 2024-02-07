package day02;

public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		int num = ch;			// 자동형변환
		System.out.println(num);
		char ch02 = (char)num;	//강제형변환
		System.out.println(ch02);
		
		double d = 1.111;
		float f = (float)1.111;	//강제형변환 방법1
		float f1 = 1.111f;		//강제형변환 방법2
	}
}
