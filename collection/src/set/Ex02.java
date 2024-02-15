package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// 로또 번호 뽑기 ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		Random r = new Random();
		for (; arr.size()<6 ;) {
			int num = r.nextInt(45)+1;
			if (arr.contains(num)==false) {	// 존재하면 true
				arr.add(num);
			}	
		}
		System.out.println(arr);
		
		// 로또 번호 뽑기 HashSet : set은 중복이 존재하지 않으므로 if문 생략 가능
		HashSet<Integer> set = new HashSet<>();
		for (; set.size()<6 ;) {
			int num = r.nextInt(45)+1;
			set.add(num);	
		}
		System.out.println(set);
	}
}
