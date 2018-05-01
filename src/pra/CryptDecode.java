package pra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {

		System.out.println("CriptDecode（復号化）");
		System.out.println("--------------------------");
		Scanner scn = new Scanner (System.in);
		System.out.print("ファイル名：");
		String str = scn.nextLine();
		scn.close();

		System.out.print("データ名：");

		File inputFile = new File("C:\\output\\", str);
		FileInputStream in = null;
		try {
			in = new FileInputStream(inputFile);

			int c;
			while((c = in.read()) != -1) {
				char a = (char)(c - 1);
				System.out.print(a);
			}

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


//■データを暗号化・復号化するプログラム
//
//以下の2つのクラスを作成する
//・CryptEncode
//Scannerで読み込んだ文字データを暗号化してファイルへ保存する
//出力先のフォルダは「C:\output」とする。
//
//・CryptDecode
//ファイルの内容を読み込んで復号化してコンソールへ表示する
//
//＜暗号化アルゴリズム＞
//暗号化は読み込んだ文字コードを1つずらす
//	int c = input.charAt(i) + 1;
//※変数cに文字コードが変わった数値が入る
//
//＜実行例＞
//CryptEncode（暗号化）
//--------------------------
//ファイル名：crypt.txt
//データ：hello world
//...........
//暗号化が終わりました。
//
//CriptDecode（復号化）
//--------------------------
//ファイル名：crypt.txt
//...........
//データ：hello world
//
//
//＜発展問題＞
//暗号化アルゴリズムを複雑にする
//必ず1つずらすのではなく、データ（int値）を全て合算し、
//文字数で割ったあまり分のコードをずらす