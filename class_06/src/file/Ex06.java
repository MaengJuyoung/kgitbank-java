package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String path = "D:\\핀테크 맹주영\\test\\test.txt";
		
		FileOutputStream fos = new FileOutputStream(path, true);
		// true : 해당 파일이 존재하면 파일의 기존 내용을 유지하면서 새로운 내용을 추가해주는 기능, append
		fos.write('c');
		fos.close();
		fos = new FileOutputStream(path, true);
		fos.write('d');	// close로 닫아주면 다시 new연산자로 만들어준 다음 기능 사용 가능!
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		int re = fis.read();
		System.out.println((char)re);
		while (true) {
			re = fis.read();
			if (re<0) {
				System.out.println("내용이 없습니다 : "+re);
				break;
			}
			System.out.println((char)re);
		}
		fis.close();
	}
}
