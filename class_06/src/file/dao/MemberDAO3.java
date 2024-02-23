package file.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import file.dto.MemberDTO;

public class MemberDAO3 {
	private String path = "D:\\핀테크 맹주영\\members/";
	private FileInputStream fis;
	private FileOutputStream fos;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public boolean getExists(String id) {
		File p = new File(path+id+".txt");
		return p.exists();
	}
	public boolean register(MemberDTO dto) {
		File p = new File(path+dto.getId()+".txt");
		boolean bool = getExists(dto.getId());
		if (bool) return bool;
		else {
			try {
				fos = new FileOutputStream(p);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				oos.writeObject(dto);

				oos.close(); bos.close(); fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			return bool;
		}
	}
	public String[] getList() {
		File file = new File(path);
		return file.list();
	}
	public boolean delete(String id) {
		File file = new File(path+id+".txt");
		boolean bool = getExists(id);
		if (bool) {
			file.delete();
			return bool;
		}else return bool;
	}
	public MemberDTO search(String id) {
		File f = new File(path+id+".txt");
		MemberDTO dto = null;
		boolean bool = getExists(id);
		if (bool) {
			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				dto = (MemberDTO)ois.readObject();

				ois.close(); bis.close(); fis.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("찾는 회원이 없습니다. \n");
		}
		return dto;
	}
}
