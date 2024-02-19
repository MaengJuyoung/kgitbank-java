package constructor;

public class TestDTO {
	private String name, addr;
	public TestDTO(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	public TestDTO() {	}
	
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
