package poly.kansai.enshu;

import java.util.Calendar;

public class CheckNoOverTimeDay {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] noOvertimeDays = {Calendar.MONDAY,Calendar.WEDNESDAY,};
//2,4

		String[] weeks = {"日","月","火","水","木","金","土"};
		String today = getToday();

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String dayoftheweek = getWeeks(noOvertimeDays,week);
		//boolean is Day = isNoOvertimeDay(noOvertimeDays);

		showResult(today,weeks,week,dayoftheweek);

	}



		static String getToday() {
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month =cal.get(Calendar.MONTH)+1;
			int date = cal.get(Calendar.DATE);
			String today = year+"年"+month+"月"+date+"日";


		return today;

	}
		static String getWeeks(int[]noOvertimeDays,int week) {

			String dayoftheweek = "";
			for(int i =0;i<noOvertimeDays.length;i++) {
			if(week==(noOvertimeDays[i])) {
				 dayoftheweek = ("今日はノー残業日です");

			}else {
				 dayoftheweek = ("今日はノー残業日ではありません");
				}
			}
			     return dayoftheweek;

		}
			static void showResult(String today,String[]weeks,int week,String dayoftheweek) {
				System.out.println(today+"("+weeks[week-1]+")");
				System.out.println(dayoftheweek);
			}

		}






