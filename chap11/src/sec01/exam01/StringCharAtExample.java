package sec01.exam01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �Է� >> ");
		String ssn = sc.next();
		
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�");
			break;
		}
	}

}
