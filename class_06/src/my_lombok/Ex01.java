package my_lombok;
// lombok :  DTO의 기능(getter, setter, toString .. 등)의 반복 메서드 작성 코드를 줄여주는 라이브러리
class Ex01DTO{
	private String name;
	private int age;
	public Ex01DTO() {}
	public Ex01DTO(String name, int age) {
		this.name=name; this.age=age;
	}
	@Override
	public String toString() {
		return "Ex01DTO = [name : "+name+"]";
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Ex01DTO dto = new Ex01DTO("홍길동", 20);
		System.out.println(dto);
		
	}
}
