package class_;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		int n = t.inputData();
		// System.out.println("n : "+n);
		
		int s = t.opData(n);
		// System.out.println("s : "+s);
		
		t.printData(n, s);
	}
}
