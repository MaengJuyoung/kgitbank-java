package constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService02 {
	MemberDTO02 m = new MemberDTO02();
	Scanner sc = new Scanner(System.in);
	private int kor, eng, math, sum;
	private String name, grade;
	
	ArrayList<String> arrN = new ArrayList<>();
	ArrayList<String> arrG = new ArrayList<>();
	ArrayList<Integer> arrK = new ArrayList<>();
	ArrayList<Integer> arrE = new ArrayList<>();
	ArrayList<Integer> arrM = new ArrayList<>();
	ArrayList<Integer> arrS = new ArrayList<>();


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
				System.out.println("4. 회원 탈퇴");
				delete();
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void add() {
		System.out.print("학생 이름을 입력하세요 >> ");
		m.setName(sc.next());
		while (true) {
			System.out.print("국어, 영어, 수학 점수를 입력하세요 >> ");
			int kor = sc.nextInt(); int eng = sc.nextInt(); int math = sc.nextInt();
			m.setKor(kor); m.setEng(eng); m.setMath(math);
			m.setSum(m.getKor()+m.getEng()+m.getMath());
			if (kor>100 || kor<0 || eng>100 || eng<0 || math>100 || math<0) {
				System.out.println("잘못됩 입력입니다.");
				continue;
			}
			m.setGrade(kor+eng+math);
			arrN.add(m.getName()); arrK.add(m.getKor()); arrE.add(m.getEng());
			arrM.add(m.getMath()); arrS.add(m.getSum()); arrG.add(m.getGrade());
			System.out.println("등록 완료! \n");
			break;
		}
	}
	public void list() {
		if (arrN.size()==0) {
			System.out.println("등록된 정보가 없습니다.\n");
		}else {
			System.out.println("이름\t국어\t영어\t수학\t합계\t등급");
			for (int i=0; i<arrN.size(); i++) {
				System.out.println(arrN.get(i)+"\t"+arrK.get(i)+"\t"+arrE.get(i)+"\t"+arrM.get(i)
				+"\t"+arrS.get(i)+"\t"+arrG.get(i));
			}
			System.out.println();
		}


	}
	public void edit() {
		System.out.print("수정할 이름 입력 >>");
		String name = sc.next();
		if (arrN.contains(name)) {
			int index = arrN.indexOf(name);
			arrN.set(index, name);		
			while (true) {
				System.out.println("수정할 국어, 영어, 수학 점수 입력 >> ");
				int kor = sc.nextInt(); int eng = sc.nextInt(); int math = sc.nextInt();
				if (kor>100 || kor<0 || eng>100 || eng<0 || math>100 || math<0) {
					System.out.println("잘못됩 입력입니다.");
				}else {
					arrK.set(index, kor); arrE.set(index, eng);	arrM.set(index, math);
					arrS.set(index, kor+eng+math);
					m.setGrade(kor+eng+math);
					arrG.set(index, m.getGrade());
					break;
				}
			}
		}else {
			System.out.println("없는 이름입니다.");
		}
	}
	public void delete() {
		
	}
}
