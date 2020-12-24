package poly.kansai.enshu;

public class EncryptedMessage {

	
	static String charAt(String angou) {
		String str ="";	
		for(int i= 0;i<angou.length();i++) {
			if(i%3==2) {
				 str +=angou.charAt(i);
			}
		 }
				return str;
		
			}
	
	
	static void showResult(String str,String angou) {
		System.out.println(angou);
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String angou ="こぶはるあじおぷめんうててぬのACJQOABRVEZAIO";
		String str = charAt(angou);
		showResult(str,angou);
				
	}

}
