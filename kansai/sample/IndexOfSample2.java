package poly.kansai.sample;

public class IndexOfSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String mailAddress = "hoge@example.com";
		
		int pos =mailAddress.indexOf("@");
		String user = mailAddress.substring(0,pos);
		System.out.println(user);
		
	}

}
