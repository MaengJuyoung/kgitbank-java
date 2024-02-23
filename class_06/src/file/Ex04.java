package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String path = "D:\\핀테크 맹주영\\test\\";
		
		System.out.print("파일명 입력 : ");
		String fileName = input.next();
		
		File filePath = new File(path+fileName+".txt");
		
		if (filePath.exists()) {
			System.out.println("이미 존재하는 파일입니다.");
		}else {
			FileOutputStream fos = new FileOutputStream(filePath);
			String msg;
			System.out.print("내용을 입력하세요 : ");
			input.nextLine();	// 처음 입력받은 값이 next이므로 엔터치고 저장되는 값을 여기에 두는 것.
			msg = input.nextLine();		// 공백 포함 저장, 엔터를 칠 때까지의 내용을 저장
			fos.write(msg.getBytes());
			System.out.println("저장되었습니다!");
		}
		
	}
}
