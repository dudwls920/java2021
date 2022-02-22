package bank;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		boolean bank = true;
		boolean login = true;
		int account = 0;
		int lout = 0;
		Scanner sc = new Scanner(System.in);

		String id[] = new String[3];
		String pw[] = new String[3];
		id[0] = "a1";
		id[1] = "a2";
		id[2] = "a3";
		pw[0] = "a1";
		pw[1] = "a2";
		pw[2] = "a3";
		String inputid = null;
		String inputpw = null;
		int useraccount = 3;

		while (login == true) {
			if (login) {

				System.out.println("id를 입력하세요");
				inputid = sc.nextLine();
				System.out.println("pw를 입력하세요");
				inputpw = sc.nextLine();

				for (int i = 0; i < useraccount; i++) {
					if (!id[i].equals(inputid) || !pw[i].equals(inputpw)) {
						System.out.println("로그인 실패");
						System.out.println("id를 입력하세요");
						inputid = sc.nextLine();
						System.out.println("pw를 입력하세요");
						inputpw = sc.nextLine();
						if (id[i].equals(inputid) && pw[i].equals(inputpw)) {
							System.out.println("로그인 성공");
							break;
						}
					} else {
						System.out.println("로그인 성공");
						break;
					}
				}
			}

			while (bank == true) {
				System.out.println(inputid + "고객님의 은행업무");
				System.out.println("선택: 1.예금 2.출금 3.잔액확인 4.종료");
				int ba = sc.nextInt();
				if (ba == 1) {
					System.out.println("입금할 금액은?");
					int count = sc.nextInt();
					account += count;
					System.out.println(account + "원 입금완료");
					System.out.println("현재잔액은" + account + " 원");
				} else if (ba == 2) {
					System.out.println("출금할 금액은?");
					int count = sc.nextInt();
					account -= count;
					if (account > 0) {
						System.out.println(count + "원 출금완료");
						System.out.println("현재잔액은" + account + " 원");
					} else {
						System.out.println("고객님은 잔액보다 " + -(account) + "원 초과한 금액을 출금하려 합니다.");
						System.out.println("잔액을 초과하여 출금할 수 없습니다");
						bank = false;
					}
				} else if (ba == 3) {
					System.out.println("현재잔액은 " + account + "원");
				} else if (ba == 4) {
					bank = false;
				} else {
					System.out.println("입력이 잘못되었습니다");
				}
			}
			System.out.println("은행업무가 종료되었습니다");
			System.out.println("로그아웃 하시겠습니까? 1.재로그인창으로 이동 2. 완전히 로그아웃");
			lout = sc.nextInt();
			if (lout == 1) {
				bank = true;
				System.out.println("id를 입력하세요");
				inputid = sc.nextLine();
			} else if (lout == 2) {
				login = false;
			}
		}
		System.out.println(inputid + "고객님 로그아웃 되었습니다");
	}
}