package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Ex06_serverThread extends Thread{
	public static ArrayList<Socket> arr;
	static {
		arr = new ArrayList<>();
	}
	private Socket s;
	public Ex06_serverThread(Socket s) {
		arr.add(s);
		this.s = s;
		start();
	}
	@Override
	public void run() {
		try {
			// 3. 데이터 송수신을 위한 input스트림 생성
			// InputStream in = arr.get(arr.size()-1).getInputStream();
			InputStream in = s.getInputStream();
			// 4. input스트림을 통한 데이터 수신(서버 -> 클라이언트) , socket으로부터 입력스트림을 얻는다. 
			DataInputStream dis = new DataInputStream(in);
			while (true) {
				String msg = dis.readUTF();
				for(Socket ss : arr) {
					OutputStream out = ss.getOutputStream();
					DataOutputStream dos = new DataOutputStream(out);
					dos.writeUTF(msg);
				}
			}
		}catch (Exception e) {
			
		}
	}
}
