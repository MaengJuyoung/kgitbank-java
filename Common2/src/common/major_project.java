package common;

import java.util.Scanner;

public class major_project {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" TV 리모컨 기능을 실행합니다");
		System.out.println("1. 번호 설정");
		System.out.println("2. 볼륨 설정");
		System.out.println("3. 외부입력 설정");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			Num n = new Num();
			n.display();
			break;
		case 2 :
			Vol v = new Vol();
			v.display();
			break;
		case 3 :
			Ent e = new Ent();
			e.display();
			break;

		default:
			break;

		}
	}
}
