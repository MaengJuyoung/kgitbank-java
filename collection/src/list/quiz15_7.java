package list;

import java.util.ArrayList;
import java.util.Random;

public class quiz15_7 {
	public static void main(String[] args) {
		// 7조 1번
		// ArrayList<String> arr = new ArrayList<>(); 를 이용하여
		// 고블린 10마리를 생성하고 잡는 코드를 작성하고 남은 고블린을 확인해보시오.
		
		ArrayList<String> arr = new ArrayList<>();
		Random r = new Random();
		
		for (int i=0; i<10; i++) {
			arr.add("고블린" + (i+1));			
		}
		System.out.println("생성된 고블린 : "+arr);
		
		int num = r.nextInt(11);
		System.out.println("잡을 고블린 수 랜덤 생성 : "+num);
		for (int i=0; i<num; i++) {
			int rm = r.nextInt(num)+1;
			System.out.println(arr.get(0)+"을 잡았습니다.");
			arr.remove(0);
		}
		System.out.println("남은 고블린 : "+arr);
		
		
		/* 작성자 답
		// 고블린 10마리 생성
        for(int i = 0; i < 10; i++) {
            arr.add("고블린" + (i+1));
        }

        System.out.println("생성된 고블린: " + arr);
        
        // 고블린 잡기
        for(int i = 0; i < 10; i++) {
            System.out.println(arr.get(0) + "을(를) 잡았습니다.");
            arr.remove(0);
        }

        System.out.println("잡은 후 남은 고블린: " + arr);
		 */
		
	}
}
