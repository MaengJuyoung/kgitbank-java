package interface_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Testin{
	// 인터페이스에서 만들어지는 변수는 무조건 static final로 만들어짐
	public int num = 1000;
	public static final String msg = "내용";
	public final String msg1 = "내용";
	public static String msg2 = "내용";
}

public class Ex08 {
	public int num = 1000;
	public final int num1 = 1000;
	public static int num2 = 1000;
	public static final int num3 = 1000;
	public static void main(String[] args) {
		System.out.println(Testin.num);
		// Testin.num = 4567;
		List<String> arr = new ArrayList<>();
		Map<String, String> m = new HashMap<>();
	}
}
