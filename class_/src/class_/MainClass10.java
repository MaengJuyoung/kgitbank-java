package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 t = new TestClass10();
		int[] a = t.test1();
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		
		HashMap<String, String> m = t.test2(arr, 100, "문자열");
		System.out.println("main 출력");
		System.out.println(m.get("키1"));
		System.out.println(m.get("키2"));
		
	}
}
