package class_;

public class TestClass08 {
	// 강한 결합
	public void inputData() {
		int num = 100;
		// return num;
		op(num);
	}
	public void op(int num) {
		num += 1000;
		printN(num);
	}
	public void printN(int n) {
		System.out.println("n : "+n);
	}
}
