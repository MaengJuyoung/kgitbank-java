package file;

import java.io.Serializable;

import lombok.Data;

@Data
public class Ex09DTO implements Serializable{
	// Serializable 를 상속받으면 자바에서 알아서 직렬화를 해줌!
	private String name, addr;
}
