package if_;

import java.util.Scanner;

public class quiz12 {
	public static void main(String[] args) {
		// 3조 3번
		// 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점"
		// 60점 이상이면 "D학점", 나머지 "F학점"

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 > ");
		int mat = sc.nextInt();
		if(mat>=90){
			System.out.println("수학 : A학점");
		} else if (mat>=80){
			System.out.println("수학 : B학점");
		} else if (mat>=70){
			System.out.println("수학 : C학점");
		} else if (mat>=60){
			System.out.println("수학 : D학점");
		} else {
			System.out.println("수학 : F학점");
		}
	}
}
