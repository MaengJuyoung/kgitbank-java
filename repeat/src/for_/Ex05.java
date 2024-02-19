package for_;

public class Ex05 {
	public static void main(String[] args) {
		/*
		for ( ; ; ) {
			System.out.println("실행");
		}
		*/
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------");
		for (i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("--------");
		
		i=0;
		// for ( ; i<5; ) {
		while (i<5) {
			System.out.println("i : "+i);
			i++;
		}
	}
}
