package for_;

import java.util.Scanner;

public class quiz15 {
	public static void main(String[] args) {
		// 5조 3번
		// 반 별 국어 중간고사 성적 입력하는 프로그램을 작성하시오
		// 각 반의 명수를 입력하고 해당 학생의 국어 성적을 입력하면 총 점과 총 평균이 출력됩니다. 
		// 입력 성적이 0점 이하 거나 100점 이상일 시 "다시 입력해주세요" 라는 문구와 재입력이 되도록 합니다.
		int sum=0, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("총 학생 수 입력 > ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			while(true) {
				System.out.print(i+"번 학생 국어 성적 : ");
				int score = sc.nextInt();
				if (score>100 || score<0) {
					System.out.println("점수 오입력");
				}else {
					sum+=score;
					break;
				}
			}

		}
		avg=sum/n;
		System.out.println("총 점수 : "+sum);
		System.out.println("총 평균 : "+avg);
		
		
		/* 출제자 정답
		Scanner input = new Scanner(System.in);
		
		int kor = 0, cnt = 0, tot_kor = 0, j = 1;
		double avg_kor = 0;
				
		System.out.print("총 학생 수 : ");
		cnt = input.nextInt();
				
		for (int i = 0 ; i < cnt ; i++) {
					
			System.out.print(j + "번 학생 국어 성적 : ");
			kor = input.nextInt();
					
			if (kor <= 100 && kor > 0) {
				tot_kor += kor;
				j++;
			}
			else {
				System.out.print(j + "번 학생 다시 입력해주세요 : ");
				kor = input.nextInt();
			}				
		}

		avg_kor = tot_kor / (double)cnt;
						
		System.out.println("총 점 : " + tot_kor);
		System.out.println("총 평균 : " + avg_kor);
		*/
	}
}
