package file.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberDTO implements Serializable{	
	// Serializable 상속받아 직렬화해주기
	private String id, name;
}
