package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception {
		String path = "D:\\핀테크 맹주영\\test\\test.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Ex09DTO dto = (Ex09DTO)ois.readObject();	// 객체 얻어오기, 역직렬화
		System.out.println("name : "+dto.getName());
		System.out.println("addr : "+dto.getAddr());
	}
}
