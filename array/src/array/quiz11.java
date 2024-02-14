package array;

public class quiz11 {
	public static void main(String[] args) {
		// 3조 2번
		// 5명의 학생이 각자 사탕을 가지고 왔다.
		/* int 변수명 = (int) ((Math.random()* (10)) + 1); 으로 임의의 5개 값을 생성하여,
		배열을 이용해 각 갯수를 입력하고, 전부 더해 평균을 내어 각 학생에게 공평하게 나누어줄 수 있는 갯수를 도출하시오
		---예시----
		n번째 학생이 가져온 사탕 = r
		n번째 학생이 가져온 사탕 = r
		n번째 학생이 가져온 사탕 = r
		...
		사탕의 총 갯수 = t
		각 학생이 받을 사탕 = c 
		------------	*/
		int ran[] = new int[5];
		int sum=0, num=0;
		for (int i=0; i<ran.length; i++) {
			ran[i] = (int) ((Math.random()* (10)) + 1);
			System.out.println(i+1+"번째 학생이 가져온 사탕 개수 : "+ran[i]);
		}
		for (int i=0; i<ran.length; i++) {
			sum+=ran[i];
		}
		System.out.println("사탕의 총 갯수 : "+sum);
		num = sum/ran.length;
		System.out.println("각 학생이 받을 사탕 개수: "+num);
		
	}
}
