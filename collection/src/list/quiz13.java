package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz13 {
	public static void main(String[] args) {
		// 5조 2번
		// 리스트를 활용하여 연락처 목록을 생성하는 프로그램을 만드시오
		/*1. 연락처 등록
		2. 연락처 보기
		3. 연락처 삭제
		4. 모든 연락처 보기
		5. 종료

		1 입력 시 ) 연락처의 이름과 번호를 등록. 중복된 이름 등록 시 "중복된 이름이 있습니다." 
		2 입력 시 ) 원하는 이름을 입력하면 번호를 확인할 수 있음.없는 이름 입력 시 "목록에 없습니다."
		3 입력 시 ) 원하는 이름을 입력하면 번호를 삭제할 수 있음. 없는 이름 입력 시 "목록에 없습니다."
		4 입력 시 ) 모든 이름과 번호를 확인할 수 있음	*/
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr_n = new ArrayList<>();
		ArrayList<String> arr_p = new ArrayList<>();
		String name=null, phone=null;
		
		while (true) {
			System.out.println("----------------");
			System.out.println("1. 연락처 등록\n2. 연락처 보기\n3. 연락처 삭제\n4. 모든 연락처 보기\n5. 종료");
			System.out.print("번호 선택 > ");
			int choice = sc.nextInt();
			System.out.println("----------------");
			
			if (choice==1) {
				System.out.print("이름 등록 > ");
				name = sc.next();
				if (arr_n.contains(name)) {
					System.out.println("중복된 이름이 있습니다.");
					continue;
				}else {
					arr_n.add(name);
					System.out.print("번호 등록 > ");
					arr_p.add(sc.next());
				}
			}else if (choice==2) {
				System.out.print("이름 입력 >> ");
				name = sc.next();
				if (arr_n.contains(name)) {
					int num=arr_n.indexOf(name);
					System.out.println(name+"님의 번호 : "+arr_p.get(num));
				}else {
					System.out.println("목록에 없습니다.");
					continue;
				}
			}else if (choice==3) {
				System.out.print("이름 입력 >> ");
				name = sc.next();
				if (arr_n.contains(name)) {
					int num=arr_n.indexOf(name);
					System.out.println(name+"님의 번호를 삭제합니다");
					arr_p.remove(num);
					arr_n.remove(num);
				}else {
					System.out.println("목록에 없습니다.");
					continue;
				}
			}else if (choice==4) {
				for (int i=0; i<arr_n.size(); i++) {
					System.out.println(i+1+". "+arr_n.get(i)+" : "+arr_p.get(i));
				}
			}else if (choice==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList<>();
				
		ArrayList<String> num = new ArrayList<>();
				
		String na, nu;
		boolean bool = true;
				
		while (bool) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
					
			int n = input.nextInt();
					
			switch (n) {
			case 1:
				System.out.print("등록할 이름을 입력하세요 : ");
				na = input.next();
				// 이름이 중복되지 않을 경우 저장
				if (name.indexOf(na) == -1) {
					name.add(na) ; 
					System.out.print("등록할 번호를 입력하세요 : ");
					nu = input.next();
					num.add(nu);
					System.out.println("이름 : " + na);
					System.out.println("번호 : " + nu);
				}
				else {
					System.out.println("중복된 이름이 있습니다. ");
				}
				break;
			case 2:
				System.out.println("누구의 연락처를 확인하시겠습니까?");
				System.out.println("-------이름 목록--------");
				for (int i = 0 ; i < name.size() ; i++) {
					System.out.println(name.get(i));
				}
				na = input.next();	
				if (name.indexOf(na) == -1) {
					System.out.println("목록에 없습니다.");	
				}
				else {
					System.out.println(na + "의 연락처는 " + num.get(name.indexOf(na)) + "입니다.");
				}
				break;	
			case 3:
				System.out.println("-----이름 목록-----");
				for (int i = 0 ; i < name.size() ; i++) {
					System.out.println(name.get(i));
				}
				System.out.println("삭제할 연락처의 이름을 작성하세요.");
				na = input.next();
				if (name.indexOf(na) == -1) {
					System.out.println("없는 연락처 입니다.");
				}
				else {
					num.remove(name.indexOf(na));
					name.remove(na);
					System.out.println("-----연락처 목록-----");
					for (int i = 0 ; i < name.size() ; i++) {
						System.out.println(name.get(i) + " : \t" + num.get(i));
					}
				}
				break;		
			case 4:
				System.out.println("-----연락처 목록-----");
				for (int i = 0 ; i < name.size() ; i++) {
				System.out.println(name.get(i) + " : \t" + num.get(i));
				}
				break;
			case 5:
				bool = false;
				break;
			default:
				System.out.println("다른 번호를 입력해주세요");
				break;
			}					
		}
		*/
	}
}
