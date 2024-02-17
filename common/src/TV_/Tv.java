package TV_;

import java.util.Scanner;

class Tv01{
	private String power,sound,channel;

	public String getTv() {
		return power;
	}
	public void setTv(String power) {
		this.power = power;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
}
public class Tv {
	Scanner sc=new Scanner(System.in);
	Tv01 T = new Tv01();

	public void powerOn() {
		while (true) {


			System.out.println("TV On/Off");
			String po = sc.next();
			if(po.equals("On")) {
				T.setTv("On");
				System.out.println("전원을 On합니다.");
				break;
			}else if(po.equals("Off")) {
				T.setTv("Off");
				System.out.println("전원을 Off합니다. ");
				System.exit(0);
			}else {
				System.out.println("버튼을 눌러주세요");
			}
		}

	}

	public void Sound() {
		int i = 0;
		while(true) {
			System.out.println("소리를 설정합니다.Up/Down/뒤로가기");
			String so = sc.next();
			if(so.equals("Up")) {
				System.out.println("증가합니다"+ i++);
				T.setSound("Up");
			}else if(so.equals("Down")) {
				System.out.println("감소합니다"+ i--);
				T.setSound("Down");
			}else if(so.equals("뒤로가기")) {
				T.setSound("뒤로가기");
				break;
			}else {
				System.out.println("입력해주세요");

			}
		}
	}
	public void channel(){
		int j = 0;
		while(true){
			System.out.println("채널을 설정합니다.Up/Down/종료");
			String ch = sc.next();
			if(ch.equals("Up")){
				System.out.println(j++ +"번");
				T.setChannel("Up");
			}else if(ch.equals("Down")){
				System.out.println(j-- +"번");
				T.setChannel("Down");
			}else if(ch.equals("종료")) {
				T.setSound("종료");
				break;
			}else
				System.out.println("입력해주세요");
		}

	}
	public void display() {
		powerOn();
		Sound();
		channel();
	}

}


