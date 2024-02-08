package for_;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {	// 복습! 그대로 옮겨옴
		// 1조 3번
		// 난수 생성기.	사용자가 원하는 범위를 받아서 그 범위 내에서 사용자가 원하는 만큼의 난수를 발생시키고 
		// 사용 종료를 원하면 종료되도록 만드시오.	(난수 생성은 Math.random()함수를 사용하면 된다)
		// 필요하다면 continue;도 사용
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("1.난수 생성기 사용\n2.사용 종료\n원하시는 기능의 숫자를 입력해주세요:");
			int choice=scan.nextInt();
			if(choice==2) {
				break;
			}
			else if(choice==1) {
				System.out.println("시행 횟수를 입력해주세요.:");
				int cnt=scan.nextInt();
				
				System.out.println("범위의 최소를 입력해주세요.:");
				int min=scan.nextInt();

				System.out.println("범위의 최대를 입력해주세요.:");
				int max=scan.nextInt();
				
				for(int i=1;i<=cnt;i++) {
					int num=(int) ((Math.random()*(max-min))+min);
					System.out.println(i+",range("+min+"~"+max+"):"+num);
				}
				
				
			}
			
			
			
		}
	}
}
