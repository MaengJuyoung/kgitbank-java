package list;

import java.util.ArrayList;
import java.util.Random;

public class quiz07 {
	public static void main(String[] args) {	// 다시보기! 복붙
		// 2조 2번
		// 1부터 20까지 랜덤으로  뽑은 수를 중복되지 않게 나열하세요
		// ex) 16,19,3,4,12,17,18,9,6,2,10,7,1,11,5,15,8,13,14, 

		ArrayList<Integer> list = new ArrayList<>();

		for(int i=1; i<=20 ;++i) {
			list.add(i);
		}

		Random rd = new Random();
		while (0<list.size()) {
			int index = rd.nextInt(list.size()); //꺼낼 번호 랜덤 선택
			Integer in = (Integer) list.remove(index); // 중복되지 않도록 제거
			System.out.print(in.intValue());

			System.out.print(" ");
		}
	}
}
