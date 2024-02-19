package array;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {	// 너무길어서 복사..... 다시보기!
		// 1조 2번
		/*
		한 반은 5명이 존재한다.
		처음
		1.이름입력
		2.성적입력
		3.성적출력
		4.종료
		선택해주세요 >>>
		이렇게 출력 후 
		1.번을 누르면

		1.모두 입력하시겠습니까?
		2.이름을 수정하시겠습니까?
		선택해주세요 >>>

		위와 같이 출력 후
		1번을 선택하면 1-5번까지 모두의 이름을 입력한다.
		2번을 선택하면 현재 가지고 있는 이름 리스트를 출력 후
		수정할 번호를 고른 후 이름을 변경하도록 한다.

		(단, 풀이 시 String의 자료형을 int로 변경할 때
		사용하는 함수인 Integer.parseInt(문자열) 사용
		 */

		Scanner input = new Scanner(System.in);
		String arr[][]=new String [5][4];
		int select=0,select1=0,select2=0;
		int flag=0,scoreflag=0;
		while(true) {
			System.out.println("1.이름입력");
			System.out.println("2.성적입력");
			System.out.println("3.성적출력");
			System.out.println("4.종료");
			System.out.print("선택해주세요 >>> ");
			select = input.nextInt();
			if(select ==4) {
				System.out.println("종료되었습니다.");
				break;	
			}
			switch (select) {
			case 1 : {
				System.out.println("1.모두 입력하시겠습니까?");
				System.out.println("2.이름을 수정하시겠습니까?");
				System.out.print("선택해주세요 >>>");
				select1 = input.nextInt();
				if(select1==1) {
					for(int i=0;i<arr.length;i++) {
						System.out.print("이름을 입력해주세요 :");
						arr[i][0] = input.next();
					}
				}else if (select1==2) {
					System.out.println("학생목록을 출력합니다.");
					for(int i=0;i<arr.length;i++) {
						System.out.println((i+1)+"번째 이름 :"+arr[i][0]);
					}
					System.out.print("학생의 번호를 선택해주세요 :");
					select1 = input.nextInt()-1;
					System.out.println("현재 이름입니다:"+arr[select1][0]);
					System.out.print("이름을 입력해주세요 :");
					arr[select1][0] = input.next();
					System.out.println("입력하신 이름입니다 :"+arr[select1][0]);
					select1=0;
				}else {
					System.out.println("번호를 잘못 입력하였습니다.");
					break;
				}
				break;
			}
			case 2 : {
				for(int x=0;x<arr.length;x++) {
					if(arr[x][0]==null) {
						flag+=1;
					}
				}
				if(flag>=1) {
					System.out.println("이름을 먼저 입력해주세요 :");
					flag=0;
					continue;
				}
				System.out.println("1.모든 학생의 성적을 입력하시겠습니까?");
				System.out.println("2.1명의 학생의 성적을 수정하시겠습니까?");
				System.out.print("선택해주세요 >>>");
				select2 = input.nextInt();
				if(select2==1) {
					for(int i=0;i<arr.length;i++) {
						System.out.println((i+1)+"번째 학생 :"+arr[i][0]);
						for( int j=1;j<4;j++) {
							if(j==1) {
								while(true) {
									System.out.print("국어 점수를 입력해주세요 :");
									arr[i][j] = input.next();
									if(Integer.parseInt(arr[i][j])>0&&Integer.parseInt(arr[i][j])<=100) {
										break;
									}else {
										System.out.println("다시 입력해주세요.");
										continue;
									}
								}
							}else if(j==2) {
								while(true) {
									System.out.print("영어 점수를 입력해주세요 :");
									arr[i][j] = input.next();
									if(Integer.parseInt(arr[i][j])>0&&Integer.parseInt(arr[i][j])<=100) {
										break;
									}else {
										System.out.println("다시 입력해주세요.");
										continue;
									}
								}
							}else if(j==3) {
								while(true) {
									System.out.print("수학 점수를 입력해주세요 :");
									arr[i][j] = input.next();
									if(Integer.parseInt(arr[i][j])>0&&Integer.parseInt(arr[i][j])<=100) {
										break;
									}else {
										System.out.println("다시 입력해주세요.");
										continue;
									}
								}
							}
						}
					}
				}else if (select2==2) {
					System.out.println("학생목록을 출력합니다.");
					for(int i=0;i<arr.length;i++) {
						System.out.println((i+1)+"번째 이름 :"+arr[i][0]);
						System.out.println("국어:"+arr[i][1]+"/영어 :"+arr[i][2]+"/수학:"+arr[i][3]);
					}
					System.out.print("학생의 번호를 선택해주세요 :");
					select2 = input.nextInt()-1;
					System.out.println("국어:"+arr[select2][1]+"/영어 :"+arr[select2][2]+"/수학:"+arr[select2][3]);
					System.out.println((select2+1)+"번째 학생 :"+arr[select2][0]);
					for( int j=1;j<4;j++) {
						if(j==1) {
							while(true) {
								System.out.print("국어 점수를 입력해주세요 :");
								arr[select2][j] = input.next();
								if(Integer.parseInt(arr[select2][j])>0&&Integer.parseInt(arr[select2][j])<=100) {
									break;
								}else {
									System.out.println("다시 입력해주세요.");
									continue;
								}
							}
						}else if(j==2) {
							while(true) {
								System.out.print("영어 점수를 입력해주세요 :");
								arr[select2][j] = input.next();
								if(Integer.parseInt(arr[select2][j])>0&&Integer.parseInt(arr[select2][j])<=100) {
									break;
								}else {
									System.out.println("다시 입력해주세요.");
									continue;
								}
							}
						}else if(j==3) {
							while(true) {
								System.out.print("수학 점수를 입력해주세요 :");
								arr[select2][j] = input.next();
								if(Integer.parseInt(arr[select2][j])>0&&Integer.parseInt(arr[select2][j])<=100) {
									break;
								}else {
									System.out.println("다시 입력해주세요.");
									continue;
								}
							}
						}
					}
					System.out.print("입력하신 이릅입니다 :"+arr[select2][0]);
					System.out.println("입력 하신 성적 입니다.\n국어:"+arr[select2][1]+"/영어 :"+arr[select2][2]+"/수학:"+arr[select2][3]);
					select2=0;
				}

				else {
					System.out.println("번호를 잘못 입력하였습니다.");
					break;
				}
				break;
			}
			case 3 : {
				for(int x=0;x<arr.length;x++) {
					if(arr[x][0]==null) {
						flag+=1;
					}
					for(int y=0;y<4;y++) {
						if(arr[x][y]==null) {
							scoreflag+=1;
						}
					}
				}
				if(flag>=1) {
					System.out.println("이름을 먼저 입력해주세요 ");
					System.out.println();
					flag=0;
					continue;
				}
				if(scoreflag>=1) {
					System.out.println("성적을 먼저 입력해주세요 ");
					System.out.println();
					scoreflag=0;
					continue;
				}
				for(int i=0;i<arr.length;i++) {
					System.out.println((i+1)+"번째 이름 :"+arr[i][0]);
					System.out.println("국어:"+arr[i][1]+" / 영어:"+arr[i][2]+" / 수학:"+arr[i][3]);
				}
			}default : {
				continue;
			}

			}
		}
	}
}
