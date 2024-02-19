package while_;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요금을 투입하세요 >>> ");
		int money = sc.nextInt();

		
		while (true) {
			System.out.println("======== 커피 자판기 ========");
			System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			int num = sc.nextInt();
			
			if ((num==1 && money<200) || (num==2 && money<250)) {
				System.out.println("요금이 부족합니다.");
			}else if (num==1) {
				System.out.println("맛있게 드세요");
				money-=200;
			}else if (num==2) {
				System.out.println("맛있게 드세요");
				money-=250;
			}else if (num==3) {
				System.out.println("거스름돈 : "+money);
			}else if (num==4) {
				System.out.println("자판기 프로그램 종료");
				break;
			}else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
		
		/* 강사님 답
		Scanner input = new Scanner(System.in);
		int money=0,j=0;
		System.out.print("요금을 투입 하세요 >>> ");
		money = input.nextInt();
		for(;;){
			System.out.println("==========커피 자판기==========\n");
			System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			j = input.nextInt();
			if(j == 4)
				break;
			else if((j == 1 && money < 200) || (j == 2 && money< 250) ){
				System.out.println("요금이 부족합니다.\n");
			}
			else if(j == 1){
				System.out.println("맛있게 드세요\n");
				money -= 200;
			}
			else if(j == 2){
				System.out.println("맛있게 드세요\n");
				money -= 250;
			}
			else if(j == 3){
				System.out.println("거스름돈 : "+ money);
				money = 0;
			}
			else{
				System.out.println("잘못입력하셨습니다.\n\n");
			}
		}
		System.out.println("프로그램 종료!!!");
		*/
	}
}
