package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3 {

	public static void main(String[] args) {

		// ファイルをコピー
		File inputFile = new File("C:\\ocjp\\ocjp.txt");
		File outputFile = new File("C:\\ocjp\\ocjpcopy.txt");

		// 37行のcloseがスコープ切れてるため、tryの外側に出してあげる
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);

			// データを読み込んで出力する ※ごり押しで覚える
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// inがnullじゃなかった場合の考慮をする out然り
				if(in != null) {
				in.close();
				}
				if(out != null) {
				out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
