package my_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
@Setter
@Getter
@ToString	// 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
@NoArgsConstructor	// 기본생성자 생성해주는 기능
@AllArgsConstructor	// 모든 변수를 받아주는 생성자 생성
*/
@Data	// 위 4개의 기능을 한 번에 만들어주는 기능
@AllArgsConstructor	
// - Data로 이 기능은 안 만들어줌
// - 이 기능만 사용 시 기본 생성자가 삭제되므로
@NoArgsConstructor	// 이 기능도 추가해야함
public class MainDTO {
	private String name;
	private int age;
}
