package list;

public class quiz12_5 {
	public static void main(String[] args) {	// 다시보기! 복붙
		// 5조 1번
		// 배열에 1~9까지의 수를 넣고 random으로 3개의 수를 출력하되 중복되지 않는 수 3개를 출력 하시오
		// System.arraycopy(args, 0, args, 0, 0); 사용
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		int[] num3 = new int[3];
		int j , tmp;
		
		for(int i=0; i<num.length; i++) {
			j = (int)(Math.random() * num.length);
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}
		System.arraycopy(num, 0, num3, 0, 3);
		
		for(int i =0; i<num3.length ; i++) {
			System.out.print(num3[i]+" ");
		}
	}
}
