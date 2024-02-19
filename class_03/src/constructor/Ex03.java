package constructor;

class TestClass03{
	private String name, addr;
	private int age;
	
	public TestClass03(String name, String addr, int age) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t=null ;//= new TestClass03();
		// System.out.println(t);
		String name = "홍길동";
		String addr = "산골짜기";
		int age = 20;
		t = new TestClass03(name, addr, age);
		// t.setName(name); t.setAddr(addr); t.setAge(age);
		System.out.println("이름 : "+t.getName());
		System.out.println("주소 : "+t.getAddr());
		System.out.println("나이 : "+t.getAge());
	}
}
