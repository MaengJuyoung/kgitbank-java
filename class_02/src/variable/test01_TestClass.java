package variable;

import java.util.Scanner;

public class test01_TestClass {		// 연산, 입력, 출력하는 역할
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 > ");
		name = sc.next();
		while (true) {
			System.out.print("국어, 영어, 수학 점수를 입력하세요 >> ");
			kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
			if (kor>100 || kor<0 || eng>100 || eng<0 || math>100 || math<0) {
				System.out.println("잘못된 입력입니다.");
			}else break;
		}

	}
	public void result() {
		sum = kor+eng+math;
		avg = sum/3.0;
		if (avg<=100 && avg>=90) {
			grade="A";
		}else if (avg>=80) {
			grade="B";
		}else {
			grade="C";
		}
	}
	public void print() {
		System.out.println(name+"님의 평균은 "+avg+"점으로, "+grade+"등급 입니다.");
		System.out.println("========================================================");
		System.out.println(name + "님 인적사항");
		System.out.println("========================================================");
		System.out.println("이름\t국\t영\t수\t합\t평균\t등급");
		System.out.println("--------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+
				math+"\t"+sum+"\t"+avg+"\t"+grade);
		System.out.println("--------------------------------------------------------");
	}

	
	/* 강사님 답
	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("국어 입력");
		kor = input.nextInt();
		System.out.println("영어 입력");
		eng = input.nextInt();
		System.out.println("수학 입력");
		math = input.nextInt();
		System.out.println("--- 모두 입력 되었습니다 ---");
	}
	public void operationData() {
		sum = kor + eng + math;
		avg = sum / 3.0;
		if(avg >= 90) {
			grade = "A 등급";
		}else if(avg >= 80 ) {
			grade = "B 등급";
		}else {
			grade = "C 등급";
		}
	}
	public void printData() {
		System.out.println("===============");
		System.out.println(name + "님 인적사항");
		System.out.println("===============");
		System.out.println("이름\t국\t영\t수\t합\t평균\t등급");
		System.out.println("-----------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+
		math+"\t"+sum+"\t"+avg+"\t"+grade);
		System.out.println("-----------------------------");
	}
	*/
}
