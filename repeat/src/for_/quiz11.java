package for_;

import java.util.Scanner;

public class quiz11 {
	public static void main(String[] args) {	// 복습! 그대로 옮겨옴
		// 3조 2번
		// 학생 수 입력 후, 학생 수 만큼 줄 세운 다음 1~N까지 순서에 맞지 않은 학생 수 출력
		
		Scanner sc = new Scanner(System.in);
		int stu;	// 현우네 반 학생수
		System.out.print("반 학생수를 입력하시오 : ");
		stu = sc.nextInt();
		int num;	// 처음 줄 섰을때 받은 번호
		int count = 0;	// 순서대로 서지 않은 학생 수
		
		System.out.print("학생들이 줄서있는 순서대로 번호표 번호를 쓰시오 : ");
		for(int i = 1; i <=stu; i++) {
			num = sc.nextInt();
			if(i != num) {
				count++;
			}
		}
		System.out.println("순서대로 서지 않은 학생 수는 : " + count);
	}
}
