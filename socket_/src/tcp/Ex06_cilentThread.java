package tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Ex06_cilentThread extends Thread{
	Socket sock;
	public Ex06_cilentThread(Socket sock) {
		this.sock = sock;
		start();
	}
	@Override
	public void run() {		// 쓰레드를 이용하기 위한 run()메서드 재정의
		try {	
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while (true) {
				String data = dis.readUTF();	// 입력스트림을 통해 읽어온 문자열 data에 할당
				System.out.println("수신 데이터 : "+data);
			}
		}catch (Exception e) {
			
		}
	}
}
