package pra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);

		System.out.println("CryptEncode（暗号化）");
		System.out.println("--------------------------");
		System.out.print("ファイル名："); //忘れてた
		String onamae = scn.nextLine();

		File outputFile = new File("C:\\output\\", onamae);

		FileOutputStream out = null;
		try {
			out = new FileOutputStream(outputFile);
			System.out.print("データ：");
			String str = scn.nextLine();
			scn.close();

			for(int i = 0; i < str.length(); i++) {
				int c = str.charAt(i) + 1;
				System.out.print(".");
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
					System.out.println();
					System.out.println("暗号化が終わりました。");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
