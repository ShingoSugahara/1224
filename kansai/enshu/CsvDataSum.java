package poly.kansai.enshu;

public class CsvDataSum {



	
	static int[]numbersChange(String[]numbers,int[] numbers2) {
		
		for(int i =0;i<numbers.length;i++) {
		numbers2[i] = Integer.parseInt(numbers[i]);
		}
		return numbers2;
	}
	
	static int sumResult(String[] numbers,int[]changeNumbers) {
		int sum =0;
		for(int i =0;i<numbers.length;i++) {
			sum += changeNumbers[i];
		}
		return sum;
	}

	
	static void showResult(int sum) {
		System.out.println("合計の値は"+sum);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ArrayList<String>array = new ArrayList<>();
		String data = "65,59,72,85,66";
			String[]numbers =data.split(",");
			int[]numbers2 =new int[numbers.length];
			int[] changeNumbers =numbersChange(numbers,numbers2);
			int sum =sumResult(numbers,changeNumbers);
			showResult(sum);
			
	}

}
