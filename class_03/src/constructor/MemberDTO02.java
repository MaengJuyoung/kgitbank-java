package constructor;

public class MemberDTO02 {
	private int kor, eng, math, sum;
	private String name, grade;
	
	public MemberDTO02() {}
	public MemberDTO02(String name, int kor, int eng, int math, int sum, String grade) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.sum = sum;
		this.grade = grade;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
