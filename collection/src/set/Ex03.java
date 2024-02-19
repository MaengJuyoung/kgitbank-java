package set;

import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("111");
		set.add("222");
		set.add("333");
		System.out.println("set : "+set);
		set.remove("111");
		System.out.println("삭제 set : "+set);
	}
}
