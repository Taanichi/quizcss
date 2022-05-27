//http://takeharu.boo.jp/quiz.html



package cc.shinbi.shindan;

//import宣言
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

class quiz {
	public static void main(String args[]) {

		// 日付を格納する変数を作成
		int year, month, date, hour, minute, second, day_week;

		// 曜日表示用に、曜日文字列を格納する配列の作成
		String youbi[] = { "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日" };

		// Calendarオブジェクトの取得
		Calendar now = Calendar.getInstance();

		year = now.get(now.YEAR);
		month = now.get(now.MONTH);
		date = now.get(now.DATE);
		hour = now.get(now.HOUR);
		minute = now.get(now.MINUTE);
		second = now.get(now.SECOND);
		day_week = now.get(now.DAY_OF_WEEK) - 1;

		// 日付を出力
		System.out.println(year + "年" + month + "月" + date + "日" + hour + " 時 " + minute + " 分 " + second + " 秒 "
				+ youbi[day_week]);

		System.out.println("------------------------------------------");

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str[][] = { 
					{ "問題1 このホームページのタイトルは?", "1.HP作成講座", "2.はじめてのJava入門", "3.CGI対策講座", "2" },
					{ "問題2 管理人のハンドルネームは?", "1.たけはる", "2.たける", "3.たけりん", "1" },
					{ "問題3 管理人の好きなプロ野球チームは？", "1.ソフトバンクホークス", "2.西武ライオンズ", "3.千葉ロッテマリンーズ", "1" },
					{ "問題4 管理人の出身地は?", "1.東京", "2.大阪", "3.福岡", "3" },
					{ "問題5 管理人の誕生日は？", "1.1968年9月3日", "2.1971年11月18日", "3.1987年2月27日", "2" } 
					
			};

			System.out.println("■■■三択クイズの開始です  5問あります。■■■");

			int count = 0;
			for (int i = 0; i < str.length; i++) {

				System.out.println(str[i][0]);
				System.out.println(str[i][1]);
				System.out.println(str[i][2]);
				System.out.println(str[i][3]);

				System.out.println("クイズの答えは？");
				String str1 = br.readLine();
				int in = Integer.parseInt(str1);

				String str2 = str[i][4];
				int in1 = Integer.parseInt(str2);

				if (in == in1) {
					System.out.println("");
					System.out.println("★★★  大正解です   ★★★");
					System.out.println("");

					count++;

				} else if (in > 3) {
					System.out.println("");
					System.out.println("1 から 3の数字で答えてください");
					System.out.println("");
					i--;
				} else {
					System.out.println("");
					System.out.println("★★★   残念！はずれです   ★★★");
					System.out.println("");
				}
			}
			switch (count) {

			case 0:
				System.out.println("あなたの得点  ： 0点");
				break;
			case 1:
				System.out.println("あなたの得点  ： 1点");
				break;
			case 2:
				System.out.println("あなたの得点  ： 2点");
				break;
			case 3:
				System.out.println("あなたの得点  ： 3点");
				break;
			case 4:
				System.out.println("あなたの得点  ： 4点");
				break;
			case 5:
				System.out.println("あなたの得点  ： 5点");
				break;
			}

		} catch (IOException e) {
			System.out.println("Exception: " + e);
		} catch (NumberFormatException e) {

			System.out.println("数字を入力してください");

		}
	}

}
