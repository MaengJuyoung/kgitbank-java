package tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex06_server {
	public static void main(String[] args) throws Exception {
		// 1. 서버소켓 생성
		ServerSocket server = new ServerSocket(12345);
		while (true) {
			System.out.println("접속을 기다립니다");
			// 2. 클라이언트 접속 대기
			Socket s = server.accept();
			System.out.println(s.getInetAddress()+"님 접속");
			new Ex06_serverThread(s);
		}
	}
}
