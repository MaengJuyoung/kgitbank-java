package for_;

import java.util.Random;
import java.util.Scanner;

public class quiz18 {
	public static void main(String[] args) {	// throwYut()부분 다시보기! 
		// 6조 3번
		// [윷놀이 게임] 숫자 1을 입력하여 윷을 던진다.
		// 하나의 윷으로 4번을 던져 나온 결과를(*윷놀이의 규칙에 기반하여)출력
		// *윷놀이의 규칙은 다음과 같다.
		// X X X O => '도'
		// X X O O => '개'
		// X O O O => '걸'
		// O O O O => '윷'
		// X X X X => '모'
		Scanner sc = new Scanner(System.in);



		while(true) {
			System.out.println("========================================");
			System.out.println("윷 던지기 - 모(X X X X)가 나올때까지 계속됩니다.");
			System.out.println("1. 윷 던지기");
			System.out.println("2. 게임 종료하기");
			System.out.println("========================================");
			System.out.println("번호 선택 > ");
			int num = sc.nextInt();

			if (num==1) {
				Random random = new Random();
				int result=0; // X(앞) O(뒤) 결과를 저장할 변수
				int sumFront = 0; // (X(앞)이 나온 개수)

				for (int i = 0; i < 4; i++) {
					result = random.nextInt(2); // 0과 2사이의 난수 1개 발생
					// 난수가 1이면 X(앞), 0이면 O(뒤)
					if (result == 1) 
						System.out.print("X ");
					else 
						System.out.print("O ");

					sumFront += result; 
				}

				// sumFront = (X(앞)이 나온 개수)
				switch (sumFront) {
				case 0: 
					System.out.println("=> '윷'");
					System.out.println();
					break;
				case 1: 
					System.out.println("=> '걸'");
					System.out.println();
					break;
				case 2: 
					System.out.println("=> '개'");
					System.out.println();
					break;
				case 3: 
					System.out.println("=> '도'");
					System.out.println();
					break;
				case 4: 
					System.out.println("=> '모'");
					System.out.println();
				default:
					
				}
				if (sumFront ==4) {
					System.out.println("['모'가 나왔습니다! 게임 종료!!!]");
					System.out.println();
					break;
				}
			}else if (num==2) {
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
				System.out.println();
			}
		}
	}
}


/* 출제자 답
import java.util.Random;
import java.util.Scanner;

public class quiz18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("윷 던지기- 모(X X X X)가 나올 때까지 계속됩니다. ");
            System.out.println("1. 윷 던지기 ");
            System.out.print("2. 게임 종료하기 ");

            int choice = sc.nextInt();

            if (choice == 1) {
                throwYut();
            } else if (choice == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

    }

	//윷 던지고 결과 출력하는 함수
	// X X X O => 도
	// X X O O => 개
	// X O O O => 걸
	// O O O O => 윷
	// X X X X => 모
	
    private static void throwYut() {
        Random random = new Random();
        int result=0; // X(앞) O(뒤) 결과를 저장할 변수
        int sumFront = 0; // (X(앞)이 나온 개수)

        for (int i = 0; i < 4; i++) {
            result = random.nextInt(2); // 0과 2사이의 난수 1개 발생
            // 난수가 1이면 X(앞), 0이면 O(뒤)
            if (result == 1) 
                System.out.print("X ");
            else 
                System.out.print("O ");

            sumFront += result; 
        }

        // sumFront = (X(앞)이 나온 개수)
        switch (sumFront) {
        case 0: 
        	System.out.println("=> '윷'");
        	System.out.println();
        	break;
        case 1: 
        	System.out.println("=> '걸'");
        	System.out.println();
        	break;
        case 2: 
        	System.out.println("=> '개'");
        	System.out.println();
        	break;
        case 3: 
        	System.out.println("=> '도'");
        	System.out.println();
        	break;
        case 4: 
        	System.out.println("=> '모'");
        	System.out.println();
        default:
        	System.out.println("     ['모'가 나왔습니다! 게임 종료!!!]");
        	System.out.println("====================================");
        	System.out.println();
        	break;
        }


    }
}*/