package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		System.out.println("map : "+map);
		
		System.out.println("key set : "+map.keySet());
		System.out.println("value set : "+map.values());
		
		Set<String> set = map.keySet();
		System.out.println("set : "+set);
		Iterator<String> it = set.iterator();	// key값을 각각 꺼내기 위해선 iterator 이용해야함
		for(;it.hasNext();) {
			// System.out.println(it.next());
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		System.out.println("종료!!!");
	}
}
