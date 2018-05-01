package pra;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pra424_2 {

	public static void main(String[] args) {

		String[][] holidays = {
				{ "2018-01-01", "元日" },
				{ "2018-01-08", "成人の日" },
				{ "2018-02-11", "建国記念の日" },
				{ "2018-02-12", "振替休日" },
				{ "2018-03-21", "春分の日" },
				{ "2018-04-29", "昭和の日" },
				{ "2018-04-30", "振替休日" },
				{ "2018-05-03", "憲法記念日" },
				{ "2018-05-04", "みどりの日" },
				{ "2018-05-05", "こどもの日" },
				{ "2018-07-16", "海の日" },
				{ "2018-08-11", "山の日" },
				{ "2018-09-17", "敬老の日" },
				{ "2018-09-23", "秋分の日" },
				{ "2018-09-24", "振替休日" },
				{ "2018-10-08", "体育の日" },
				{ "2018-11-03", "文化の日" },
				{ "2018-11-23", "勤労感謝の日" },
				{ "2018-12-23", "天皇誕生日" },
				{ "2018-12-24", "振替休日" }
		};

		//数値スキャン
		Scanner scn = new Scanner(System.in);
		System.out.print("year  = ");
		int a = scn.nextInt();
		System.out.print("month = ");
		int b = scn.nextInt();
		System.out.println();

		//ここ日付
		LocalDate date = LocalDate.of(a, b, 1);
		LocalDate next = date.plusMonths(1);
		LocalDate last = next.plusDays(-1);
		Period p = date.until(last);

		//ここforネストで表示
		for(int i = 0; i <= p.getDays(); i++) {

			//日付表示 ※外側の最後に改行入れる
			System.out.print(date.plusDays(i));

			//配列内処理
			for(int j = 0; j < holidays.length; j++) {
				LocalDate date1 = LocalDate.parse(holidays[j][0]);

				//祝日表示
				if(date1.equals(date.plusDays(i))) {
					System.out.print(" " + holidays[j][1]);
				}
			}

			System.out.println();

		}


		//		// whileだった場合の大枠ってこんな感じだったんじゃよい
		//		while(b == date.getMonthValue()) {
		//			System.out.print(date);
		//
		//			System.out.println();
		//			date = date.plusDays(1);
		//		}

		scn.close();
	}

}
