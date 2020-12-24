package poly.kansai.enshu;
import java.util.Scanner;
public class GetDomain {


	static String scanAddress() {
		Scanner scan = new Scanner(System.in);
		System.out.println("アドレスを入力してください:");
		String imput =scan.nextLine();
		return imput;
	}





	static void showResult(String mailAddress,String domein,String[] s1) {

		if(s1.length==2) {
			System.out.println(domein);
		}else if(s1.length==1){
			System.out.println("@が見つかりません");
		}else {
			System.out.println("@が複数含まれています");
		}

	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String mailAddress = scanAddress();
		String[] s1 = mailAddress.split("@");
		String domein =s1[s1.length-1];
		showResult(mailAddress,domein,s1);









	}

}
