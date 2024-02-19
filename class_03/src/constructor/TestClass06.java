package constructor;

public class TestClass06 {
	private TestDTO t;
	public void display() {
		System.out.println("1. 저장합니다.");
		saveData();
		System.out.println("2. 출력합니다.");
		printData();
	}
	public void printData() {
		System.out.println("이름 : "+t.getName());
		System.out.println("주소 : "+t.getAddr());
	}
	public void saveData() {
		String name = "홍길동";
		String addr = "산골짜기";
		// t = new TestDTO(name, addr);
		t = new TestDTO();
		t.setName(name); t.setAddr(addr);
		System.out.println("저장완료");
	}
}
