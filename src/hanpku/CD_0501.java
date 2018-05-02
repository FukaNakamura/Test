package hanpku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CD_0501 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("CriptDecode（復号化");
		System.out.println("--------------------------");

		System.out.print("ファイル名：");
		String name = scn.nextLine();
		scn.close();

		File input = new File("C:\\output\\", name);
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(input);

			System.out.print("データ：");
			int c;
			while((c = fi.read()) != -1) {
				char a = (char)(c - 1);
				System.out.print(a);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fi != null) {
					fi.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
