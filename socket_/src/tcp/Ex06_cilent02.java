package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex06_cilent02 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);
		// 3. 데이터 송수신을 위한 output 스트림 생성
		OutputStream out = sock.getOutputStream();
		// 4. output스트림을 통한 데이터 송신(클라이언트 -> 서버) , socket으로부터 출력스트림을 얻는다. 
		DataOutputStream dos = new DataOutputStream(out);

		Scanner input = new Scanner(System.in);
		String msg = null;

		new Ex06_cilentThread(sock);

		while (true) {
			System.out.println("전송 데이터 입력 : ");
			msg = input.next();
			dos.writeUTF(msg);
			System.out.println("데이터 수신 했음");
			// 데이터 수신 코드
		}
	}
}
