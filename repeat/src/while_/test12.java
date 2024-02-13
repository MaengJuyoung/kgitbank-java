package while_;

public class test12 {
	public static void main(String[] args) {	// 이중 반복문
		// 별찍기
		
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("☆");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		for (int i=1; i<3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=3-i; j++) {
				System.out.print("☆");
			}
			for (int j=1; j<3-i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
