package common;

import java.util.Scanner;
class num01{
	private int s;

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}


}
public class Num {

	Scanner sc = new Scanner(System.in);
	num01 n = new num01();

	public void display() {
		while(true) {
			System.out.println("1.번호 설정");

			System.out.println("2.한단계씩 올리고 내리기");

			System.out.println("3.나가기");

			int a = sc.nextInt();

			if(a==1) {
				Ent();
			}
			else if(a==2) {
				Updown();
			}
			else {
				System.exit(0);
			}
		}
	}
	public void Ent() {
		int s;
		System.out.println("번호를 입력해주세요");
		s = sc.nextInt();
		if(s <=999 && s >=1) {
			n.setS(s);
			System.out.println("현재 번호는 "+n.getS()+"번 입니다");

		}else {
			System.out.println("없는 번호 입니다.");
		}
	}

	public void Updown() {
		n.getS();
	
		while(true) {
			System.out.println("1. up");
			System.out.println("2. down");
			int b = sc.nextInt();
			if(b==1) {
				if(n.getS()==999) {
					n.setS(1);
					
					System.out.println(n.getS() + "번");
					break;
				}else{
					n.setS(n.getS()+1);
					System.out.println(n.getS() + "번");
					break;
				}
			}else if(b==2) {
				if(n.getS()==0) {
					n.setS(999);
					System.out.println(n.getS() + "번");
					break;
				}else {
				
					n.setS(n.getS()-1);
					System.out.println(n.getS() + "번");
					break;
				}
			}



		}


	}
}
