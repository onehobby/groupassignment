package exam;

import java.util.Scanner;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ��ܾ�˻� ���α׷��Դϴ�");
		while(true) {
			System.out.print("�ѱ۴ܾ� :");
			String search = sc.next();
			if(search.equals("�׸�")) {
				break;
			}
			String eng =  dic.kortoEng(search);
			if(eng.equals(false)) {
				System.out.println(search + "�� ������ �����ϴ�");
			} else {
				System.out.println(eng);
			}
		}
		sc.close();
	}
}
