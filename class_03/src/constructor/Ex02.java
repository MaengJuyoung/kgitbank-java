package constructor;

class TestClass02{
	private String officeName;
	public TestClass02(String officeName) {
		System.out.println("생성자 실행");
		this.officeName = officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getOfficeNamge() {
		return this.officeName;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		String name = "나의 회사";
		TestClass02 t = new TestClass02(name);
		// t.setOfficeName(name);
		System.out.println(t.getOfficeNamge());
	}
}
