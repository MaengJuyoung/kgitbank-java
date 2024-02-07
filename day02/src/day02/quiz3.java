package day02;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		String name;
		int kor, eng, mat, sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		sum = kor+eng+mat;
		avg = (double)sum/3;
		System.out.println("================학생정보==========================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t");
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t",name, kor, eng, mat, sum, avg);
	}
}
