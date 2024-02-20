package quiz.members;

import java.util.Scanner;
/*
결과 확인해 보고 중복되는 코드는 메소드를 만들어 줄여보세요^^
*/
public class MemberService {
	private MemberDTO member;
	public MemberService() { member = new MemberDTO(); }
	public void display() {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.학생 등록"); System.out.println("2.학생 보기");
			System.out.println("3.학생 정보 수정"); System.out.println("4.회원 탈퇴");
			System.out.print(">>> : ");	num = input.nextInt();
			switch(num) {
			case 1:	registerMember();	break;
			case 2:	viewMember(); break;
			case 3:	modifyMember();	break;
			case 4: exitMember();	break;
			default : System.out.println("번호를 다시 입력하세요...");
			}
		}
	}
	public void registerMember() {
		Scanner input = new Scanner(System.in);
		String name;  int kor, eng, math;
		System.out.print("이름 입력 : "); name = input.next();
		System.out.print("국어 점수 입력 : "); kor = input.nextInt();
		System.out.print("영어 점수 입력 : "); eng = input.nextInt();
		System.out.print("수학 점수 입력 : "); member.setMath( input.nextInt() );
		member.setName(name); member.setKor(kor); member.setEng(eng);
		System.out.println("저장되었습니다!!!");
		member.setSum(kor + eng + member.getMath() );
		member.setAvg( member.getSum() / 3.0 );
		if(member.getAvg() >= 90) member.setGrade("A");
		else if(member.getAvg() >= 80) member.setGrade("B");
		else member.setGrade("CCCCC");
	}
	public void viewMember() {
		System.out.println("-------------------");
		if(member.getName() != null) {
			System.out.println(member.getName()+"님의 정보입니다");
			System.out.println("국, 영, 수 : " +member.getKor()+","
								+member.getEng()+","+member.getMath() );
			System.out.println("합 : "+member.getSum() );
			System.out.println("평균 : "+member.getAvg() );
			System.out.println("등급 : "+member.getGrade() );
			System.out.println("-------------------");
		}else 
			System.out.println("회원가입 먼저하세요!!!");
	}
	public void modifyMember() {
		System.out.println("--------------");
		System.out.println("이름은 수정할 수 없습니다");
		Scanner input = new Scanner(System.in);
		int kor, eng, math;
		System.out.print("수정할 국어 점수 입력 : "); kor = input.nextInt();
		System.out.print("수정할 영어 점수 입력 : "); eng = input.nextInt();
		System.out.print("수정할 수학 점수 입력 : "); member.setMath( input.nextInt() );
		System.out.println("수정 되었습니다!!!");
		
		member.setKor(kor); member.setEng(eng);
		System.out.println("저장되었습니다!!!");
		
		member.setSum(kor + eng + member.getMath() );
		member.setAvg( member.getSum() / 3.0 );
		if(member.getAvg() >= 90) member.setGrade("A");
		else if(member.getAvg() >= 80) member.setGrade("B");
		else member.setGrade("CCCCC");
	}
	public void exitMember() { member.setName(null); }
}