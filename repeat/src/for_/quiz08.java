package for_;

import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		// 2조 3번
		// 아래와 같은 모양을 만드세요

		//*****
		//****
		//***
		//**
		//*

		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 > ");
		int n = sc.nextInt();

		int i=n;
		while(i>0) {
			for (int j=n; j>n-i; j--) {
				System.out.print("*");
			}
			i--;
			System.out.println();
		}


		/* 출제자 답
		Scanner sc = new Scanner(System.in);

		for(int i = 1 ; i < 6 ; i++ ) {
			for(int j = 1 ; j < 7-i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		*/
	}
}
