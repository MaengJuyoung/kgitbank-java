package collection.dto;	// Data Transfer Object, 계층 간(Controller, View) 데이터 교환을 위해 필요한 객체

public class MemberDTO {
	private String name, addr;

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
}
