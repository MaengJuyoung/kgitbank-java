package common;

import java.util.Random;
import java.util.Scanner;

class test{
	private int set;

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}
}
public class Ent {
	test t = new test();
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	public void display() {
		while(true) {
			System.out.print("1. HDMI\n2. USB\n3. TV\n4. 종료\n>>> ");
			int func = sc.nextInt();
			if (func == 1) {
				HDMI();
			}else if (func == 2) {
				USB();
			}else if (func == 3) {
				TV();
			}else if (func == 4) {
				System.out.println("종료 하겠습니다.");
				break;
			}else {
				System.out.println("1 ~ 4번 선택해주세요");
			}
		}
	}

	public void HDMI() {
		System.out.println("HDMI에 연결되었습니다.");
		while(true) {
			System.out.println("케이블 연결 시도하겠습니까?");
			System.out.print("1. 연결\t2. 대기\n>>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				t.setSet(rd.nextInt(2));
				if (t.getSet() == 1) {
					System.out.println("연결되었습니다.");
					break;
				}else {
					System.out.println("연결 실패했습니다.");
				}
			}else if (choice == 2) {
				while (true) {
					System.out.print("연결 시도하고 싶으시면 1번, 종료 하시고 싶으시면 2번\n>>> ");
					int con = sc.nextInt();
					if (con == 1) {
						while (true) {
							System.out.println("1. 연결");
							int choice2 = sc.nextInt();
							if (choice2 == 1) {
								t.setSet(rd.nextInt(2));
								if (t.getSet() == 1) {
									System.out.println("연결되었습니다.");
									return;
								}else {
									System.out.println("연결 실패했습니다.");
								}
							}
							else {
								System.out.println("1번 입력해주세요");
							}
						}
					}else if (con == 2) {
						System.out.println("종료 하겠습니다.");
						System.exit(0);
					}else {
						System.out.println("1, 2번 중 선택해주세요");
					}
				}

			}else {
				System.out.println("1, 2번 중 선택해주세요");
			}
		}
	}
	public void USB() {
		System.out.println("USB에 연결되었습니다.");
		while(true) {
			System.out.println("케이블 연결 시도하겠습니까?");
			System.out.print("1. 연결\t2. 대기\n>>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				t.setSet(rd.nextInt(2));
				if (t.getSet() == 1) {
					System.out.println("연결되었습니다.");
					break;
				}else {
					System.out.println("연결 실패했습니다.");
				}
			}else if (choice == 2) {
				while (true) {
					System.out.print("연결 시도하고 싶으시면 1번, 종료 하시고 싶으시면 2번\n>>>  ");
					int con = sc.nextInt();
					if (con == 1) {
						while (true) {
							System.out.println("1. 연결");
							int choice2 = sc.nextInt();
							if (choice2 == 1) {
								t.setSet(rd.nextInt(2));
								if (t.getSet() == 1) {
									System.out.println("연결되었습니다.");
									return;
								}else {
									System.out.println("연결 실패했습니다.");
								}
							}
							else {
								System.out.println("1번 입력해주세요");
							}
						}
					}else if (con == 2) {
						System.out.println("종료 하겠습니다.");
						System.exit(0);
					}else {
						System.out.println("1, 2번 중 선택해주세요");
					}
				}

			}else {
				System.out.println("1, 2번 중 선택해주세요");
			}
		}

	}
	public void TV() {
		System.out.println("TV에 연결되었습니다.");
		while(true) {
			System.out.println("케이블 연결 시도하겠습니까?");
			System.out.print("1. 연결\t2. 대기\n>>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				t.setSet(rd.nextInt(2));
				if (t.getSet() == 1) {
					System.out.println("연결되었습니다.");
					break;
				}else {
					System.out.println("연결 실패했습니다.");
				}
			}else if (choice == 2) {
				while (true) {
					System.out.print("연결 시도하고 싶으시면 1번, 종료 하시고 싶으시면 2번\n>>> ");
					int con = sc.nextInt();
					if (con == 1) {
						while (true) {
							System.out.println("1. 연결");
							int choice2 = sc.nextInt();
							if (choice2 == 1) {
								t.setSet(rd.nextInt(2));
								if (t.getSet() == 1) {
									System.out.println("연결되었습니다.");
									return;
								}else {
									System.out.println("연결 실패했습니다.");
								}
							}
							else {
								System.out.println("1번 입력해주세요");
							}
						}
					}else if (con == 2) {
						System.out.println("종료 하겠습니다.");
						System.exit(0);
					}else {
						System.out.println("1, 2번 중 선택해주세요");
					}
				}

			}else {
				System.out.println("1, 2번 중 선택해주세요");
			}
		}

	}
}

