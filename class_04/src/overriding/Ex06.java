package overriding;

class TestDTO{
	String name;
	int age;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString(); <원래 값
		return "[name : "+name+", age : "+age+"]";
	}
}
class Test06{
	TestDTO t;
	public Test06() { t = new TestDTO(); }
	public void setDTO() {
		t.name = "홍길동"; t.age=200;
	}
	public void print() {
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println("------------");
		System.out.println(t.toString());
		System.out.println(t);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.setDTO();
		t.print();
	}
}
