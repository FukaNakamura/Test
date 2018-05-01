package hanpku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hanpuku425_sample116 {

	public static void main(String[] args) {

		File inputFile = new File("C:\\ocjp\\ocjp_buf.txt");
		File outputFile = new File("C:\\ocjp\\ocjpcopy_buf.txt");

		BufferedReader in = null;
//		BufferedWriter out = null;
		PrintWriter  out = null; // PrintWriterに書き換えることが出来る
		try {
			in = new BufferedReader(new FileReader(inputFile));
//			out = new BufferedWriter(new FileWriter(outputFile));
			out = new PrintWriter(new FileWriter(outputFile)); // PrintWriter

		String line;
		while((line = in.readLine()) != null){
//			out.write(line);
//			out.newLine();
			out.println(line); // PrintWriter
		}

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
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
