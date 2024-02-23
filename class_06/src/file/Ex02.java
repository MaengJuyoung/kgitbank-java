package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String path = "D:\\핀테크 맹주영\\test\\test2.txt";
		// String path = "D:/핀테크 맹주영/test/test2.txt";
		FileOutputStream fos = new FileOutputStream(path);
		System.out.print("출력할 내용 입력 : ");
		String name = input.next();
		fos.write(name.getBytes());
		System.out.println("저장되었습니다!");
	}
}
