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

public class Pra426_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// tryで囲まれた部分の変数を取り除く
		BufferedReader in = null;
		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");
		ArrayList<String> list = new ArrayList<String>();
		try {
			in = new BufferedReader(new FileReader(inputFile));
			String typ;
			while((typ = in.readLine()) != null) {
				list.add(typ);
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("データがみつかりません。");
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
		// ここからゲーム開始
		System.out.println("タイピングゲームを開始します。");
		Scanner scn = new Scanner (System.in);
		System.out.println("何かキーを入力してください：");
		// キー入力させるためで特に
		String startpoint = scn.nextLine();

		// 計測開始
		LocalTime start = LocalTime.now();
		// 正答文字数を記録するための変数の設置
		int allwords = 0;
		Random random = new Random();
		for(int j = 1; j<= 5; j++) {

			System.out.println("**************** 第" + j + "問 ****************");
			int i = random.nextInt(list.size());
			// 文字を分割
			String mondai = list.get(i);
			String kanzi = mondai.split(",")[0];
			String yomi = mondai.split("\\,")[1];
			// 問題文表示
			System.out.println(kanzi);
			System.out.println(yomi);
			System.out.println();

			// whileで無限ループさせ、ifでbreakさせて抜ける
			while(true) {
				// 回答入力
				System.out.println("【入力してください】");
				String answer = scn.nextLine();
				// 正誤判定
				if(answer.equals(yomi)) {
					// 問題の再表示防止用のremoveと文字数記録
					list.remove(i);
					allwords += answer.length();
					System.out.println();
					// while脱出
					break;
				}
			}
		}
		System.out.println("**************************************");
		System.out.println("終了しました。おつかれさまでした。");

		//計測終了
		LocalTime end = LocalTime.now();
		long times = ChronoUnit.SECONDS.between(start, end);

		System.out.println();
		System.out.println("**************** 成績 ****************");
		System.out.println("時間　　　：" + times + " 秒");
		System.out.println("文字数　　：" + allwords + " 文字");
		System.out.println("１秒あたり：" + (allwords / times) + " 文字");
		System.out.println("**************************************");

		scn.close();
	}

}
