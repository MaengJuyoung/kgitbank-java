package set_get;

import java.util.Scanner;

public class test001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름 입력 > ");
		name = sc.next();
		System.out.print("나이 입력 >> ");
		age = sc.nextInt();
		
		// 객체 생성 후 setter를 통해 각각의 값(age, name)을 저장하세요
		QuizTest01 t = new QuizTest01();
		t.setName(name);
		t.setAge(age);
		
		// 나이를 만으로 계산하는 메소드를 만들어 만으로 age를 저장하세요
		
		t.settingAge();
		// 저장된 값을 getter을 통해 출력하세요
		// =? ???님의 나이는 ??살 입니다. 
		System.out.println(t.getName()+"님의 나이는 "+t.getAge()+"살 입니다.");
		
		
	}
}
