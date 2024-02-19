package for_;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		// 6조 2번
		// 숫자를 입력받아서 그 값이 짝수면 덧셈을, 홀수면 뺄셈을 진행하는 프로그램을 만듭니다.
		// 입력받는 숫자는 1~20사이의 값이고 100이되면 종료됩니다.
		// 더해지거나 뺀 값은 0미만, 100초과가 될 수 없습니다.
		int num=0;
		while (true) {
			System.out.println("현재 숫자는 "+num+"입니다.");
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 > ");
			int n = sc.nextInt();
			if (n>0 && n<20) {
				if (n%2==0) {
					num +=n;
					if (num==100) {
						System.out.println("100이 되었으므로 종료합니다.");
						break;
					}else if (num>100) {
						num-=n;
						System.out.println("합계는 100초과가 될 수 없습니다. 다시 입력해주세요.");
						System.out.println("----------------");
					}else {
						System.out.println("숫자를 더합니다.");
						System.out.println("----------------");
					}
				}else {
					num-=n;
					if(num<0) {
						num+=n;
						System.out.println("합계는 0이하로 내려갈 수 없습니다. 다시 입력해주세요.");
						System.out.println("----------------");
					}else {
						System.out.println("숫자를 뺍니다.");
						System.out.println("----------------");
					}
				}
			}else {
				System.out.println("1~20사이의 숫자로 다시 입력해주세요.");
				System.out.println("----------------");
			}
		}
	}
}
