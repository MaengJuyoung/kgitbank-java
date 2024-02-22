package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Dto02{
	private String name, id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, name;
		ArrayList<Dto02> arr = new ArrayList<>();
		while(true) {
			System.out.print("1. 저장\n2. 모든 내용 확인\n >>> ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				Dto02 d = new Dto02();
				System.out.print("아이디 입력 : ");
				id = sc.next(); 
				d.setId(id);
				System.out.print("이름 입력 : ");
				d.setName(sc.next());
				arr.add(d);
				System.out.println("저장되었습니다!!!");
				break;
			case 2:
				System.out.println("==== 모든 내용 ====");
				for (Dto02 dd : arr) {
					System.out.println("아이디 : "+dd.getId());
					System.out.println("이름 : "+dd.getName());
					System.out.println("----------------");
				}
				break;
			}
		}
	}
}
