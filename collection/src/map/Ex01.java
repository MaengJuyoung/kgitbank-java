package map;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name", "홍길동");
		map.put("선풍기", "1000만원");
		System.out.println("map : "+map);
		
		System.out.println(map.get("num"));
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("없는값"));
	}
}
