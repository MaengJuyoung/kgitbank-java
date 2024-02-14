package list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		// 3조 3번
		// s1, s2, s3 3명이 1부터 45까지 숫자중에 6개를 입력한다. 1부터 45까지의 난수 6개를 발생시켜
		// 세 사람중에 적중한 숫자가 많은 사람이 누구인지 출력하시오. (단 발생된 난수는 중복 가능하다.)

		int arr[] = new int[6];
		ArrayList<Integer> s1 = new ArrayList<>(); 
		ArrayList<Integer> s2 = new ArrayList<>(); 
		ArrayList<Integer> s3 = new ArrayList<>(); 
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);


		for (int j=0; j<3; j++) {
			System.out.print(j+1+"s, 6개의 숫자를 입력하세요 >> ");
			if (j==0) {
				for (int i=0; i<6; i++) {
					s1.add(sc.nextInt());
				}
			}else if (j==1) {
				for (int i=0; i<6; i++) {
					s2.add(sc.nextInt());
				}
			}else {
				for (int i=0; i<6; i++) {
					s3.add(sc.nextInt());
				}
			}

		}
		System.out.println("--------------------------");
		System.out.print("로또 번호 : ");
		for (int i=0; i<arr.length; i++) {
			arr[i] =ran.nextInt(45)+1;
			System.out.print(arr[i]+" ");
		}
		
		int sum1=0, sum2=0, sum3=0;
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if (s1.get(j)==arr[i]) sum1++;
				if (s2.get(j)==arr[i]) sum2++;
				if (s3.get(j)==arr[i]) sum3++;
			}
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("s1가 맞춘 갯수는 : "+sum1);
		System.out.println("s2가 맞춘 갯수는 : "+sum2);
		System.out.println("s3가 맞춘 갯수는 : "+sum3);
		System.out.println("---------------------------");
		
		if(sum1 > sum2) {
			if(sum1 > sum3) {
				System.out.println("가장 많이 맞춘 사람은 : s1");
			}
			else if(sum1 < sum3){
				System.out.println("가장 많이 맞춘 사람은 : s3");
			}else {
				System.out.println("가장 많이 맞춘 사람은 : s1, s3");
			}
		}else if(sum1 < sum2) {
			if(sum2 > sum3) {
				System.out.println("가장 많이 맞춘 사람은 : s2");
			}
			else if(sum2 < sum3){
				System.out.println("가장 많이 맞춘 사람은 : s3");
			}else {
				System.out.println("가장 많이 맞춘 사람은 : s2, s3");
			}
		}else {
			if(sum1 > sum3) {
				System.out.println("가장 많이 맞춘 사람은 : s1,s2");
			}else if(sum1 < sum3) {
				System.out.println("가장 많이 맞춘 사람은 : s3");
			}else {
				System.out.println("가장 많이 맞춘 사람은 : s1,s3,s3");
			}
		}
	}
}
