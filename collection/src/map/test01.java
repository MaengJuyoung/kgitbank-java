package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String menu=null; 
		int price=0;

		while (true) {
			System.out.println("------------------------");
			System.out.println("1. 메뉴 등록\n2. 메뉴별 가격 보기\n3. 종료");
			System.out.print("번호 입력 > ");
			int choice = sc.nextInt();
			System.out.println("------------------------");

			if (choice==1) {
				System.out.print("등록할 메뉴 입력 >> ");
				menu = sc.next();
				if (map.containsKey(menu)==true) {
					System.out.println("존재하는 메뉴입니다.");
					continue;
				}
				System.out.print("메뉴의 가격 입력 >> ");
				price = sc.nextInt();
				map.put(menu, price);
				System.out.println("등록 되었습니다.");
			}else if (choice==2) {
				Set<String> set = map.keySet();
				Iterator<String> it = set.iterator();
				if (it.hasNext()==false) {
					System.out.println("메뉴를 등록해주세요 !");
					continue;
				}
				for(int i=1; it.hasNext(); i++) {
					String key = it.next();
					System.out.println(i+". "+key+" : "+map.get(key));
				}
				System.out.println("------------------------");
				System.out.println("1. 수정\n2. 삭제\n3. 나가기");
				System.out.print("번호 입력 >> ");
				int num = sc.nextInt();

				if (num==1) {
					System.out.print("수정할 메뉴 이름 입력 >>> ");
					menu = sc.next();
					if (map.containsKey(menu)==true) {
						System.out.print("수정 가격 입력 : ");
						int newprice = sc.nextInt();
						System.out.println(menu+"가격 "+map.get(menu)+" -> "+newprice+" 변경완료!");
						map.put(menu, newprice);		
					}else {
						System.out.println("없는 메뉴입니다. 처음으로 돌아갑니다.");
					}
				}else if (num==2) {
					System.out.print("삭제할 메뉴 이름 입력 >>> ");
					menu = sc.next();
					if (map.containsKey(menu)==true) {
						map.remove(menu);
						System.out.println(menu+" 삭제 되었습니다.");
					}else {
						System.out.println("없는 메뉴입니다. 처음으로 돌아갑니다.");
					}
				}else if (num==3) {
					System.out.println("가격보기를 종료합니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if (choice==3) {
				System.out.println("메뉴판 만들기 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}


		/* 강사님 답
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name = null;
		String price = null;
		int num=0;
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");		System.out.println("3.종 료");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("메뉴 입력 : ");
				name = input.next();
				if(map.containsKey(name)==false) {
					System.out.print("가격 입력 : ");
					price = input.next();
					map.put(name, price);
					System.out.println("등록 되었습니다.");
				}else {
					System.out.println("존재하는 메뉴 입니다");
				}
			}
			else if(num == 2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.print(">>> ");
				int choise = input.nextInt();
				if(choise == 1) {
					System.out.print("변경 메뉴이름 입력 : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.print("수정 가격 입력 : ");
						String newPrice = input.next();
						System.out.println(map.get(name)+"->"+newPrice);
						System.out.println("변경 됐습니다.!!!");
						map.replace(name, newPrice);
					}else {
						System.out.println("메뉴가 없습니다!!!");
					}
				}
				else if(choise == 2) {
					System.out.print("삭제할 이름 입력");
					name = input.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println(name+" 삭제 됐습니다");
					}else {System.out.println(name+"없는 이름입니다");}
				}
			}
			else break;
		}
		*/
	}
}
