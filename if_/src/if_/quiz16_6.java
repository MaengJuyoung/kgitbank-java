package if_;

import java.util.Scanner;

public class quiz16_6 {
	public static void main(String[] args) {
		// 6조 1번
		// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		
		int n1, n2, n3, money;
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위 3번을 던진 결과 입력 > ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1==n2 && n2==n3 && n1==n3) {
			money = 10000 + n1*1000;
		}else if (n1==n2) {
			money = 1000 + n1*100;
		}else if (n1==n3) {
			money = 1000 + n1*100;
		}else if (n3==n2) {
			money = 1000 + n2*100;
		}else {
			if (n1>n2 && n1>n3) {
				money = n1*100;
			}else if (n2>n1 && n2>n3) {
				money = n2*100;
			}else money = n3*100;
		}
		System.out.println("상금 : "+money+"원");
		
		/* 출제자 답
		Scanner scanner = new Scanner(System.in);

        //3번의 주사위 입력을 받음
        System.out.println("주사위 값을 3번 입력하세요: ex) 1 2 3 ");
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        //주사위의 눈이 모두 같은 경우 ex) dice1=2 dice2=2 dice3=2
        if ((dice1 == dice2) && (dice1 == dice3) && (dice2 == dice3)) {
            System.out.println(10000 + dice1 * 1000);
        }
        //주사위 눈이 2개만 같은 경우 ex) dice1=2 dice2=2 dice3=4
        else if ((dice1 == dice2) || (dice1 == dice3) || (dice2 == dice3)) {

            //어떤 주사위가 같은 값을 가졌는지 확인
            int sameValue;

            if (dice1 == dice2) {
                sameValue = dice1;
            } else if (dice1 == dice3) {
                sameValue = dice1;
            } else {
                sameValue = dice2; //dice2 = dice3 인 경우이기 때문에 dice2 or dice3 값을 넣으면 됨
            }

            System.out.println(1000 + sameValue * 100);
        }
        //주사위 눈이 모두 다른 경우
        else {

            //주사위 가장 큰 값
            int maxValue;

            if (dice1 > dice2) {

                maxValue = dice1;
                if (maxValue > dice3) {
                    System.out.println(maxValue * 100);
                }
                else{
                    maxValue = dice3; //dice3 > dice1이기 때문에 maxValue 변경
                    System.out.println(maxValue * 100);
                }
            }
            // dice1 < dice1인 경우
            else{

                maxValue = dice2;
                if (maxValue > dice3) {
                    System.out.println(maxValue * 100);
                }
                else{
                    maxValue = dice3; //dice3 > dice1이기 때문에 maxValue 변경
                    System.out.println(maxValue * 100);
                }
            }
        }*/
	}
}
