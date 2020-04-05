package exam;

import java.util.Scanner;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한영단어검색 프로그램입니다");
		while(true) {
			System.out.print("한글단어 :");
			String search = sc.next();
			if(search.equals("그만")) {
				break;
			}
			String eng =  dic.kortoEng(search);
			if(eng.equals(false)) {
				System.out.println(search + "는 사전에 없습니다");
			} else {
				System.out.println(eng);
			}
		}
		sc.close();
	}
}
