package day02;

public class Ex08 {
	public static void main(String[] args) {
		int n1 = 9, n2 = 2;
		System.out.println(n1/n2);
		System.out.println(n1/(double)n2);
		System.out.println(n1%n2);
		
		System.out.println("====복합대입연산자====");
		n1 = n2 = 5;
		n1 += 1;	// n1(6) = n1(5) + 1
		System.out.println(n1);
		n1 -= 1;	// n1(5) = n1(6) - 1
		System.out.println(n1);
		n1 *= n2;	// n1(25) = n1(5) * n2(5)
		System.out.println(n1);
		n1 /= n2;	// n1(5) = n1(25) / n2(5)
		System.out.println(n1);
		n1 %= n2;	// n1(0) = n1(5) % n2(5)
		System.out.println(n1);
		
		System.out.println("==== 관계 연산자 ====");
		n1 = 5;
		n2 = 2;
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		boolean bool;
		bool = n1 > n2;
		System.out.println(bool);
		bool = n1 < n2;
		System.out.println(bool);
		
		System.out.println("==== 논리 연산자 ====");
		int n3 = 10;
		n1 = 5; n2 = 7;
		System.out.println(n1>n2 && n1>n3);
		System.out.println(n2>n1 && n2>n3);
		System.out.println(n3>n2 && n3>n1);
		
		System.out.println("------ or ------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("------ and ------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("------ not ------");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(!(10>5));
		System.out.println("------예제------");
		n1 = 10; n2 = 5;
		bool = n1>n2 && n1%n2==0;
		System.out.println(bool);
		
		System.out.println("==== 증감 연산자 ====");
		n1 = 5;
		++n1;
		System.out.println(n1);
		
		n2 = 5;
		n2++;
		System.out.println(n2);
		
		System.out.println("-------------");
		n1 = 10;
		n2 = ++n1;
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("-------------");
		n1 = 10;
		n2 = n1++;
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		int a=5, b=6, c=10, d;
		d = ++a*b--;		// d(36) = a(6)*b(6)
		System.out.println(a+", "+b+", "+d);
		d = a++ + ++c - b--;// d = a(6)+c(11)-b(5)
		// a(7), b(4), c(11), d(12)
		System.out.println(a+", "+b+", "+c+", "+d);
		
		System.out.println("====삼항(조건)연산자====");
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1>n2)?"참인경우":"거짓인경우";
		System.out.println(result);
	}
}
