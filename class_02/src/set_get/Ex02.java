package set_get;

class Test02{
	private int num, age;
	/*
	public void setNum(int num) {		// setter : 값을 설정하는 메소드
		this.num = num;
	}
	public int getNum() {			// getter : 값을 꺼내오는 메소드
		return num;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	*/

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.setNum(100);
		t.setAge(20);
		int a = t.getAge();
		System.out.println("age : "+a);
		System.out.println(t.getNum());
	}
}
