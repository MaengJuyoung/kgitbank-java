package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08  {
	public static void main(String[] args) throws Exception {
		String path = "D:\\핀테크 맹주영\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		// DataOutputStream : 기본 스트림보다 많은 기능 사용 가능
		
		dos.writeUTF("안녕하세요");
		dos.writeInt(100);
		dos.writeDouble(1.111);
		dos.close(); bos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String msg = dis.readUTF();
		int num = dis.readInt();
		double dou = dis.readDouble();
		System.out.println(msg);
		System.out.println(num);
		System.out.println(dou);
		
	}
}
