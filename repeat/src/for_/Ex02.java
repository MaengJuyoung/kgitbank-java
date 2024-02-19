package for_;
/*
F11 : 디버깅 시작 모드
F6 : 한줄씩 실행(메소드 건너뜀)
F7 : 한줄씩 실행(메소드로 이동)
F8 : 다음 브레이크 포인터로 이동(파란색 부분 더블클릭)
ctrl+F2 : 디버깅 종료
 */
public class Ex02 {
	public static void main(String[] args) {
		int sum=0;
		// sum = sum + i; i++;
		for(int i=1; i<=100000; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum : "+sum);
	}
}


