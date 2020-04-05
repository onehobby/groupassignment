package exam;

import java.util.Scanner;

public class Concert {
	
	public String S[];
	public String A[];
	public String B[];
	
	Scanner sc = new Scanner(System.in);

	Concert() {
		S = new String[10];
		A = new String[10];
		B = new String[10];
		
		for(int i=0; i<S.length; i++) {
			S[i] = "___";
			A[i] = "___";
			B[i] = "___";
		}
	}
	
	public static void printSeat(String seat[]) {		
		//�¼�������¸޼ҵ�
		for(int i=0; i<seat.length; i++) {
			System.out.print(" " + seat[i] + " ");
		}
		System.out.println();
	}
	
	public void allPrint() {
		// ����¼���¸޼ҵ�
		System.out.print("S>>");
		Concert.printSeat(S);
		System.out.print("A>>");
		Concert.printSeat(A);
		System.out.print("B>>");
		Concert.printSeat(B);
		System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
	}
	
	public void choiceSeat() {
		// �¼����ø޼ҵ�
		while(true) {
			System.out.println("�¼����� S(1), A(2), B(3)");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("S :");
				printSeat(S);
				inputSeat(S);
				return;
			} else if(select == 2) {
				System.out.print("A :");
				printSeat(A);
				inputSeat(A);
				return;
			} else if(select == 3) {
				System.out.println("B :");
				printSeat(B);
				inputSeat(B);
				return;
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
				
		}
	}
	
	public void inputSeat(String seat[]) {
		// �¼��� �̸��� �ִ� �޼ҵ�
		System.out.print("�̸��� �Է����ּ���");
		String name = sc.next();
		while(true) {
			System.out.print("��ȣ�� �Է����ּ���");
			int num = sc.nextInt();
			num--;
			if(seat[num].equals("___")) {
				seat[num] = name;
				break;
			}
			else {
				System.out.println("�ٸ��¼��� �������ּ���");
			}
		}
	}
	
	public void deleteSeat(String seat[]) {
		// �¼���� ����ó�� �޼ҵ�
		System.out.print("�̸� :");
		String name = sc.next();
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i] = "___";
				break;
			}
		}
	}
	
	public void delete() {
		// �¼���Ҹ޼ҵ�
		System.out.println("�¼�����: S(1), A(2), B(3)");
		while(true) {
			int select = sc.nextInt();
			if(select == 1) {
				printSeat(S);
				deleteSeat(S);
				return;
			} else if(select == 2) {
				printSeat(A);
				deleteSeat(A);
				return;
			} else if(select == 3) {
				printSeat(B);
				deleteSeat(B);
				return;
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}
}
