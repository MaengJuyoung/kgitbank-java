package while_;

public class test03 {
	public static void main(String[] args) {
		// 쌀 100통, 암수 1쌍의 쥐. 며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까?
		int rice=100000, mouse=2, day;
		for (day=1; rice>0; day++ ) {
			rice -= mouse*20;
			if (day%10==0) {
				mouse *=2;
			}
		}
		day--;
		System.out.println("쌀이 며칠 만에 없어졌는가? "+day+"일");
		System.out.println("현재 쥐는 몇 마리인가? "+mouse+"마리");
	}
}
