package exam;

import java.util.Scanner;

public class ConcertDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ�ƮȦ ����ý����Դϴ�");
		Concert concert = new Concert();
		
		while(true) {
			System.out.println("1.���� 2.��ȸ 3.��� 4.������");
			int select = sc.nextInt();
			if(select == 1) {
				concert.choiceSeat();
			} else if(select == 2) {
				concert.allPrint();
			} else if(select == 3) {
				concert.delete();
			} else if(select == 4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else {
				System.out.println("�ٽ��Է����ּ���");
			}
		} 
	}
}
