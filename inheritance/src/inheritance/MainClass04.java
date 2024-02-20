package inheritance;

class Calc04{	// 계산기
	public void display() {
		System.out.println("나는 계산기 입니다.");
	}
}
class Computer04{
	Calc04 calc;
	public Computer04() {
		calc = new Calc04();
	}
	public void print() {
		System.out.println("컴퓨터로 동작합니다.");
		calc.display();
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Computer04 com = new Computer04();
		com.print();
	}
}
