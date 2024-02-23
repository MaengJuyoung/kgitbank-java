package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		File path = new File("D:\\핀테크 맹주영\\test\\test.txt");
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(97);
		fos.write('a');
		fos.write("test".getBytes());
	}
}
