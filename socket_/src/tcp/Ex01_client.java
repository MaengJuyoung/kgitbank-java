package tcp;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex01_client {
	public static void main(String[] args) throws Exception {
		// 192.168.42.104, 12345 ("IP", 패킷번호)
		// 강사님 IP : 192.168.42.44
		Socket sock = new Socket("192.168.42.104", 12345);
		System.out.println("클라이언트 실행!!!");
		
		OutputStream os = sock.getOutputStream();
		
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int data = input.nextInt();
		
		os.write(data);
		os.close(); sock.close();
		
	}
}
