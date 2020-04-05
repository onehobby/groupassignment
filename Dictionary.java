package exam;

public class Dictionary {

	public String[] kor = {"»ç¶û", "¾Æ±â", "µ·", "¹Ì·¡", "Èñ¸Á"};
	public String[] eng = {"love", "baby", "money", "future", "hope"};

	public String kortoEng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				if(i%2==0) {
					System.out.println(word + "Àº");
				} else {
					System.out.println(word + "´Â");
				}
				return eng[i];
			}
		}
		return "false";
	}
}
