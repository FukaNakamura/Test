package pra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pra426 {

	public static void main(String[] args) {



		BufferedReader in = null;
		int allwords = 0;

		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");

		try {
			in = new BufferedReader(new FileReader(inputFile));

			System.out.println("タイピングゲームを開始します。");
			Scanner scn = new Scanner (System.in);
			System.out.println("何かキーを入力してください：");
			String startpoint = scn.nextLine();

			LocalTime start = LocalTime.now();

			ArrayList<String> list = new ArrayList<String>();
			String typ;
			while((typ = in.readLine()) != null) {
				list.add(typ);
			}

			Random random = new Random();

			for(int j = 1; j<= 5; j++) {

				System.out.println("**************** 第" + j + "問 ****************");
				int i = random.nextInt(list.size());
				// 文字を分割
				String mondai = list.get(i);
				String kanzi = mondai.split(",")[0];
				String yomi = mondai.split("\\,")[1];
				System.out.println(kanzi);
				System.out.println(yomi);
				System.out.println();

				// 入力 → 正誤判定
				//whileで無限ループさせ、ifで抜ける。elseなら再度やらせる。
				String answer;
				while(true) {

					System.out.println("【入力してください】");
					answer = scn.nextLine();

					if(answer.equals(yomi)) {

						list.remove(i);
						allwords += answer.length();
						System.out.println();
						break;
					} else {
						continue;
					}
				}
			}

			System.out.println("**************************************");
			System.out.println("終了しました。おつかれさまでした。");

			LocalTime end = LocalTime.now();
			long times = ChronoUnit.SECONDS.between(start, end);

			System.out.println();
			System.out.println("**************** 成績 ****************");
			System.out.println("時間　　　：" + times + " 秒");
			System.out.println("文字数　　：" + allwords + " 文字");
			System.out.println("１秒あたり：" + (allwords / times) + " 文字");
			System.out.println("**************************************");

			scn.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
