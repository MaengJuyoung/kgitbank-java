package constructor;

import java.util.Scanner;


public class MemberService02 implements MemberInter02 {
	private MemberDTO02 m;
	public MemberService02() {m = new MemberDTO02();}
	Scanner sc = new Scanner(System.in);
	private int kor, eng, math, sum;
	private String name, grade;

	public void display() {
		while (true) {
			System.out.println("1. 학생 등록\n2. 학생 보기\n3. 정보 수정\n4. 회원 탈퇴");
			System.out.print("번호 선택 >> ");
			int num = sc.nextInt();
			System.out.println("----------------");
			switch (num) {
			case 1:
				System.out.println("1. 학생 등록");
				add();
				break;
			case 2:
				System.out.println("2. 학생 보기");
				list();
				break;
			case 3:
				System.out.println("3. 정보 수정");
				edit();
				break;
			case 4:
				delete();
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void add() {
		System.out.print("학생 이름을 입력하세요 >> "); name =sc.next(); m.setName(name);
		while (true) {
			System.out.print("국어, 영어, 수학 점수를 입력하세요 >> ");
			kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
			m.setKor(kor); m.setEng(eng); m.setMath(math);
			m.setSum(m.getKor()+m.getEng()+m.getMath());
			m.setAvg(m.getSum()/3.0);

			if (kor>100 || kor<0 || eng>100 || eng<0 || math>100 || math<0) {
				System.out.println("잘못됩 입력입니다.");
				continue;
			}else {
				if (m.getAvg() >=90 ) m.setGrade("A");
				else if (m.getAvg() >=80 ) m.setGrade("B");
				else m.setGrade("CCCCC");
				System.out.println("등록 완료! \n");
				break;
			}
		}
	}
	public void list() {
		if (m.getName()==null) {
			System.out.println("등록된 정보가 없습니다.\n");
		}else {
			System.out.println(m.getName()+"님의 정보입니다");
			System.out.println("국, 영, 수 : " +m.getKor()+","
					+m.getEng()+","+m.getMath() );
			System.out.println("합 : "+m.getSum() );
			System.out.println("평균 : "+m.getAvg() );
			System.out.println("등급 : "+m.getGrade() );
			System.out.println("-------------------\n");
		}
	}
	public void edit() {	
		if (m.getName()==null) {
			System.out.println("수정할 정보가 없습니다.\n");
		}else {
			while (true) {
				System.out.println("수정할 국어, 영어, 수학 점수 입력 >> ");
				kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
				if (kor>100 || kor<0 || eng>100 || eng<0 || math>100 || math<0) {
					System.out.println("잘못됩 입력입니다.");
				}else {
					m.setKor(kor); m.setEng(eng); m.setMath(math); m.setSum(kor+eng+math);
					m.setAvg(m.getSum()/3.0); 
					if (m.getAvg() >=90 ) m.setGrade("A");
					else if (m.getAvg() >=80 ) m.setGrade("B");
					else m.setGrade("CCCCC");
					System.out.println("저장되었습니다!\n");
					break;
				}
			}
		}
	}
	public void delete() {
		if (m.getName()==null) {
			System.out.println("탈퇴할 정보가 없습니다.\n");
		}else {
			m.setName(null);
			System.out.println("탈퇴가 완료되었습니다.\n");
		}
	}
}

