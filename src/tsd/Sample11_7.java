package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal1 {
	Animal1(){
		System.out.println("Animal()");
	}
}

class Dog1 extends Animal1 {
	Dog1(){
		System.out.println("Dog()");
	}
}

class Bulldog1 extends Dog1  implements Serializable  {

}


public class Sample11_7 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		Bulldog1 obj = new Bulldog1();
		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("----- シリアライズ完了");

			fis = new FileInputStream(new File("dog.txt"));
			ois = new ObjectInputStream(fis);
			Bulldog1 readObj = (Bulldog1) ois.readObject();
			System.out.println("----- デシリアライズ完了");
		} catch(ClassNotFoundException e) {
			System.out.println("クラスファイルがありません");
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありません");
		} catch (IOException e) {
			System.out.println("IO Error");
		} finally {
			try {
				oos.close();
				ois.close();
			} catch(IOException e) {

			}
		}

	}

}
