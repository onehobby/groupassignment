package exam;

public class Dictionary {

	public String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	public String[] eng = {"love", "baby", "money", "future", "hope"};

	public String kortoEng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				if(i%2==0) {
					System.out.println(word + "��");
				} else {
					System.out.println(word + "��");
				}
				return eng[i];
			}
		}
		return "false";
	}
}
