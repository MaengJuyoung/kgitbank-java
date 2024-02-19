package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("라면");
		set.add("김밥");
		set.add("순대");
		set.add("라면");
		ArrayList<String> arr = new ArrayList<>();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("라면");
		System.out.println("set : "+set);	// 중복 불가, 순서 유지 안됨
		System.out.println("arr : "+arr);	// 중복 가능, 순서 유지 됨
	}
}
