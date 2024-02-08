package if_;

import java.util.Scanner;

public class quiz17 {
	public static void main(String[] args) {	// 복습! 복잡하다잉
		// 6조 2번
		// 메뉴판을 출력 후 금액을 입력 받은 뒤 메뉴를 선택하면 거스름돈과 주문한 메뉴가 출력된다.
		Scanner sc = new Scanner(System.in);
		int money, menunum, wherenum, menucost=0;
		String menu=null, where=null;

		System.out.println("------ 메뉴판 ------");
		System.out.println("1. 햄버거\t(9,000원)");
		System.out.println("2. 피자\t(11,000원)");
		System.out.println("3. 치킨\t(32,000원)");
		System.out.println("4. 금액 반환");
		System.out.println("------------------");

		System.out.print("투입할 금액을 입력 > ");
		money = sc.nextInt();
		if (money<9000) {
			System.out.println("주문할 수 있는 메뉴 없음.");
		}else {
			System.out.println("원하는 메뉴의 번호 입력 > ");
			menunum = sc.nextInt();
			if (menunum==1) {
				menu = "햄버거";
				menucost = 9000;
			}else if (menunum==2) {
				menu = "피자";
				menucost = 11000;
			}else if (menunum==3) {
				menu = "치킨";
				menucost = 32000;
			}else if (menunum==4) {
				System.out.println("투입 금액 "+money+"원 반환");
			}

			if (menunum<1 && menunum>4) {			
				System.out.println("올바른 주문이 아닙니다.");
				System.out.println(money+"원 반환");
			}else if (menucost>money) {
				System.out.println("투입 금액이 부족합니다. "+money+"원 반환");
			}else {
				System.out.println("1.포장\t2.매장식사 선택 >");
				wherenum = sc.nextInt();
				if (wherenum==1) where="포장";
				else if (wherenum==2) where="매장식사";
				else System.out.println("선택 오류! "+money+"원 반환");

				System.out.println("-----------------");
				System.out.println("주문 메뉴 : "+menu);
				System.out.println(where);
				System.out.println("거스름돈 : "+(money-menucost)+"원");
				System.out.println("-----------------");
			}
		}

		/*출제자 답
		int coin = 0;
		int menunum = 0;
		int menucost = 0;
		String menuname = null;
		int wherenum = 0;
		String where = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입하세요 : ");
		coin = sc.nextInt();

		if (coin >= 9000) {

			System.out.print("메뉴를 선택하세요 : ");
			menunum = sc.nextInt();

			if (menunum == 1) {
				menucost = 9000;
				menuname = "김치찌개";
			}else if (menunum == 2) {
				menucost = 11000;
				menuname = "피자";
			}else if (menunum == 3) {
				menucost = 32000;
				menuname = "치킨";
			}

			if (menunum < 1 && menunum > 4) {
				System.out.printf("올바른 주문이 아닙니다. %d원 반환\n", coin);
			}else if (menucost > coin){
				System.out.printf("투입 금액이 부족합니다. %d원 반환\n", coin);
			}else if (menunum >= 1 && menunum <= 3){
				System.out.print("식사 방식을 선택하세요. (1. 포장, 2.매장식사)");
				wherenum = sc.nextInt();

				if (wherenum != 1 && wherenum != 2) {
					System.out.printf("선택 오류 %d원 반환\n", coin);
				}else {
					if(wherenum == 1) {
						where = "포장";
					}else {
						where = "매장식사";
					}

					System.out.println("------------------");
					System.out.printf("주문 메뉴 : %s\n", menuname);
					System.out.println(where);
					System.out.printf("거스름돈 : %d원\n", (coin - menucost));
					System.out.println("------------------");

				}

			}else if (menunum == 4)	System.out.printf("투입 금액 %d원 반환", coin);

		}else {
			System.out.printf("주문할 수 있는 메뉴 없음 %d원 반환\n", coin);
		}
		*/
	}
}
