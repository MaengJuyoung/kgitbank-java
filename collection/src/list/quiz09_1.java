package list;

import java.util.ArrayList;
import java.util.Random;

public class quiz09_1 {
	public static void main(String[] args) {	// 다시보기! 복붙
		// 1조 1번
		// lotto당첨번호를 나오게 만드시요!
		/*
		ArrayList<Integer> lotto = new ArrayList(); //선택된 숫자 저장
		ArrayList<Integer> balls = new ArrayList(); //공45개 저장하는 리스트>44>43>
		//1.balls리스트에 1~45숫자를 추가한다.

		//2. balls 리스트에서 뽑을 인덱스를 난수 0~44 ->0~43..0~39범위에서 반복합니다.
		2-0 Random 사용
		//2-1. 난수 인덱스에 해당하는 요소를 로또 리스트에 추가합니다
		//2-2 뽑힌 난수 인덱스의 요소는 삭제(제거)합니다.

		//3.최종 로또 변수가 참조하는 값을 출력합니다.
		3-1.lotto.sort(null); 사용 (메소드로 오름차순 정렬한다)*/
		
		ArrayList<Integer> lotto = new ArrayList(); //선택된 숫자 저장
		ArrayList<Integer> balls = new ArrayList(); //공45개 저장하는 리스트>44>43>
		//1.balls리스트에 1~45숫자를 추가한다.
		for(int i=1;i<45;i++)
			balls.add(i);
		//확인:출력해보기
		System.out.println(balls);
		
		//2. balls 리스트에서 뽑을 인덱스를 난수 0~44 ->0~43..0~39범위에서 반복합니다.
		Random r= new Random();
		int k;
		for(int i=0;i<6;i++) {
			k=r.nextInt(45-i);
			//2-1. 난수 인덱스에 해당하는 요소를 로또 리스트에 추가홥니다.
			lotto.add(balls.get(k));
			//2-2 뽑힌 난수 인덱스의 요소는 삭제(제거)합니다.
			balls.remove(k);
		}
		//3.최종 로또 변수가 참조하는 값을 출력합니다.
		lotto.sort(null);
		System.out.println("뽑은 번호 :"+lotto);
		
		//ArrayList의 중요 메소드 : size(),add(),get(),remove()

	}
}
