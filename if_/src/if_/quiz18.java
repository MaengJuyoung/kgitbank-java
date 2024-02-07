package if_;

import java.util.Scanner;

public class quiz18 {
	public static void main(String[] args) {
		// 6조 3번
		// 약속 시간을 입력하면, 약속 시간 25분 전의 시간을 출력해주는 프로그램을 만드세요

		int hour, minute, newh, newm;
		Scanner sc = new Scanner(System.in);

		System.out.print("약속 시간을 입력하세요(시 분) > ");
		hour = sc.nextInt();
		minute = sc.nextInt();

		if (hour<0 || hour>23 || minute<0 || minute>=60) {
			System.out.println("시각[0시-23시] 분[0분-29분]이내의 범위로 다시 적어주세요");
		}else {
			if (minute>=0 && minute<25) {
				newm = minute+60-25;
				if (hour==0) {
					newh = 23;
					System.out.println("전날 "+newh+"시 "+newm+"분에 알람을 맞추겠습니다.");
				}else {
					newh = hour-1;
					System.out.println(newh+"시 "+newm+"분에 알람을 맞추겠습니다.");
				}
			}else {
				newm = minute-25;
				System.out.println(hour+"시 "+newm+"분에 알람을 맞추겠습니다.");
			}
		}
		
		/* 출제자 답
		//시간이 24이상이거나 음수 일 때
        if(hour<0 || hour>23 || minute<0 || minute>=60) {
        	System.out.println("시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요");
        }
        
        //minute이 25분보다 작은경우, hour에 변화가 생김
        if( minute>= 0 && minute < 25 ){
            
        	//hour가 01시~23시 사이일 때 => hour-1 
            if(hour>00 && hour<=23){
                hour--;
                minute = 60 - (25 -minute);
                System.out.printf(hour+"시 "+minute+ "분에 알람을 맞추겠습니다.");
            }
            //hour가 00일 때 => 23시로 바꿔줘야 함
            else if (hour==00){
                hour = 23;
                minute = 60 - (25 - minute);
                System.out.printf("전날 "+ hour+"시 "+minute+ "분에 알람을 맞추겠습니다.");
            }
            
        //minute이 25분~60분, hour는 그대로
        }else if( minute >= 25 && minute <= 59 ){
            minute = minute - 25;
            System.out.printf(hour+"시 "+minute+ "분에 알람을 맞추겠습니다.");
        }
        */
	}
}
