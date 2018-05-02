package hanpku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CE_0501 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

		System.out.println("CryptEncode（暗号化）");
		System.out.println("--------------------------");

		System.out.print("ファイル名：");
		String name = scn.nextLine();

		File output = new File("C\\output\\", name);
		FileOutputStream fo = null;

		try {
			fo = new FileOutputStream(output);

			System.out.print("データ：");
			String str = scn.nextLine();
			scn.close();

			for(int i = 0; i < str.length(); i++) {
				int c = str.charAt(i) + 1;
				System.out.print(".");
				fo.write(c);
			}

			System.out.println();
			System.out.println("暗号化が終わりました。");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fo != null) {
					fo.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
