package array;

public class Ex02 {
	public static void main(String[] args) {
		double dos[] = new double[] {1.111, 2.222, 3.333};
		System.out.println(dos.length);
		for (int i=0; i<dos.length; i++) {
			System.out.println(i+"번째 : "+dos[i]);
		}
	}
}
