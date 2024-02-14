package string;

public class Ex01 {
	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "test";
		String str3 = new String("test init");
		System.out.println("str3 : "+str3);
		String s1 = str3.toUpperCase(); 	// toUpperCase() : 모두 대문자로 변경
		System.out.println("s1 : "+s1);
		String s2 = s1.toLowerCase();		// toLowerCase() : 모두 소문자로 변경
		System.out.println("s2 : "+s2);
		
		str3 = "JaVa"; 	// java Java
		if (str3.toLowerCase().equals("java")) {
			System.out.println("수강 과목은 자바군요!");
		}else {
			System.out.println("다르다!!!");
		}
	}
}
