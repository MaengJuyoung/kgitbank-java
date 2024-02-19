package if_;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1>n2) System.out.println("큰 수 : "+n1);
		if (n1<n2) System.out.println("큰 수 : "+n2);
		System.out.println();
		
		System.out.print("세 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		/*if (n1>n2 && n1>n3) System.out.println("큰 수 : "+n1);
		if (n1<n2 && n3<n2) System.out.println("큰 수 : "+n2);
		if (n3>n1 && n3>n2) System.out.println("큰 수 : "+n3);*/
		int max=0;
		if (n1>n2) max = n1;
		if (n2>n1) max = n2;
		if (n3>max)	max = n3;
		System.out.println("큰 수 : "+max);
	}
}
