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

				System.out.println("id�� �Է��ϼ���");
				inputid = sc.nextLine();
				System.out.println("pw�� �Է��ϼ���");
				inputpw = sc.nextLine();

				for (int i = 0; i < useraccount; i++) {
					if (!id[i].equals(inputid) || !pw[i].equals(inputpw)) {
						System.out.println("�α��� ����");
						System.out.println("id�� �Է��ϼ���");
						inputid = sc.nextLine();
						System.out.println("pw�� �Է��ϼ���");
						inputpw = sc.nextLine();
						if (id[i].equals(inputid) && pw[i].equals(inputpw)) {
							System.out.println("�α��� ����");
							break;
						}
					} else {
						System.out.println("�α��� ����");
						break;
					}
				}
			}

			while (bank == true) {
				System.out.println(inputid + "������ �������");
				System.out.println("����: 1.���� 2.��� 3.�ܾ�Ȯ�� 4.����");
				int ba = sc.nextInt();
				if (ba == 1) {
					System.out.println("�Ա��� �ݾ���?");
					int count = sc.nextInt();
					account += count;
					System.out.println(account + "�� �ԱݿϷ�");
					System.out.println("�����ܾ���" + account + " ��");
				} else if (ba == 2) {
					System.out.println("����� �ݾ���?");
					int count = sc.nextInt();
					account -= count;
					if (account > 0) {
						System.out.println(count + "�� ��ݿϷ�");
						System.out.println("�����ܾ���" + account + " ��");
					} else {
						System.out.println("������ �ܾ׺��� " + -(account) + "�� �ʰ��� �ݾ��� ����Ϸ� �մϴ�.");
						System.out.println("�ܾ��� �ʰ��Ͽ� ����� �� �����ϴ�");
						bank = false;
					}
				} else if (ba == 3) {
					System.out.println("�����ܾ��� " + account + "��");
				} else if (ba == 4) {
					bank = false;
				} else {
					System.out.println("�Է��� �߸��Ǿ����ϴ�");
				}
			}
			System.out.println("��������� ����Ǿ����ϴ�");
			System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�? 1.��α���â���� �̵� 2. ������ �α׾ƿ�");
			lout = sc.nextInt();
			if (lout == 1) {
				bank = true;
				System.out.println("id�� �Է��ϼ���");
				inputid = sc.nextLine();
			} else if (lout == 2) {
				login = false;
			}
		}
		System.out.println(inputid + "���� �α׾ƿ� �Ǿ����ϴ�");
	}
}