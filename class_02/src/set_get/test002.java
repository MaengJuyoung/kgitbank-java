package set_get;

public class test002 {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		// 객체 생성 후 각각의 값(kor, eng, math, sum, avg)을 저장하세요
		QuizTest02 t = new QuizTest02();
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum(m+k+e);
		t.setAvg((k+e+m)/3);	// t.setAvg(t.getSum()/3.0);
		
		// 출력하세요. 국, 영, 수, 합, 평균
		System.out.println("국어\t영어\t수학\t합계\t평균\t");
		System.out.println(t.getKor()+"\t"+t.getEng()+"\t"+t.getMath()+
				"\t"+t.getSum()+"\t"+t.getAvg()+"\t");
	}
}
