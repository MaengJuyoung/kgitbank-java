package file;		// 보조스트림

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		String path = "D:\\핀테크 맹주영\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// BufferedOutputStream : 데이터를 저장할 수 있는 보조 공간
		// 보조스트림 사용 목적 : 내용을 한 번에 전송할 수 있음. 효율적인 데이터 이동!
		for (char ch = '0'; ch<='9'; ch++) {
			Thread.sleep(1);
			// fos.write(ch);
			bos.write(ch);	// 한 번에 정보가 들어옴
		}
		bos.flush();	// bos에 저장되어있는 값을 비워주세요 > fos에 보내겠다는 의미
		bos.write('a');
		bos.close();	// 1. 데이터 전송 2. 연결 끊기
		bos.write('b');
		bos.close();
		
		fos.close();
		
	}
}
