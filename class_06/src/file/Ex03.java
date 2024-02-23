package file;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		String sPath = "c:/test/";
		File fPath = new File("D:/핀테크 맹주영/abcd");
		// 경로만 쓸 땐 위에 두개 다 사용 가능하나, String과 File의 기능이 다르므로
		// 필요한 기능을 사용할 땐 그 기능으로 경로를 작성해줘야 함
		fPath.mkdir();
		fPath.delete();
		
		fPath = new File("D:/핀테크 맹주영/");
		String[] s = fPath.list();
		System.out.println(s.length);
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println(fPath.exists()); 	// .exists() : 해당하는 값이 존재하는지 여부 출력
	}
}
