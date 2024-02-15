package class_;

public class TestClass09 {
	public void test1() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			if (i==3)
				// break;
				return;
		}
		System.out.println("test1 종료");
	}
	
	public int test2() {
		int n=10;
		if (n>100)
			return 100;
		// else
		return 0; 	// if문이 실행되지 않을 시 return되는 값이 없으므로 마지막에 써줘야 함!
	}
	public String test3() {
		int num = 100;
		if (num>10)
			return "문자열";
		else
			// return 100;
			return "100";
	}
	public String test4() {
		return "aaaa"; //, "bbbb", "cccc";
		// return으로 돌려줄 수 있는 값은 오로지 하나
		
	}
}
