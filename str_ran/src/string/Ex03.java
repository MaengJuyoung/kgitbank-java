package string;

public class Ex03 {
	public static void main(String[] args) {
		String str = "test	";
		System.out.println("str : "+str);
		System.out.println(str.equals("test"));
		
		String result = str.trim();		// trim() : 양쪽 공백 삭제
		System.out.println("result : "+result);
		System.out.println(result.equals("test"));
		
		String addr = "05214 노원구 동일로4567";
		System.out.println(addr);
		
		String[] split = addr.split(" "); 	// split() : 문자열을 () 안의 문자를 기준으로 나누어 배열에 담아줌
		for (int i=0; i<split.length; i++) {
			System.out.println(i+"."+split[i]);
		}
		
		String phone = "010-1234-1234";
		String rep = phone.replace("-", " ");	// replace("변경 전", "변경 후")
		System.out.println("rep : "+rep);
		
		phone = "1234";
		int num = Integer.parseInt(phone);
		System.out.println(num+100);
		String s = num+"";
		System.out.println(s+100);
	}
}
