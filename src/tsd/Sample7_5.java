package tsd;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Sample7_5 {
	public void someMethod() throws IOException {}
}

class Sample7_5_1 extends Sample7_5 {
	public void someMethod() throws IOException {}
}

class Sample7_5_2 extends Sample7_5 {
	public void someMethod() {}
}

class Sample7_5_3 extends Sample7_5 {
	public void someMethod() throws EOFException, FileNotFoundException {}
}

class Sample7_5_4 extends Sample7_5 {
	public void someMethod() throws ClassNotFoundException {}
}

class Sample7_5_5 extends Sample7_5 {
	public void someMethod() throws Expention {}
}

class Sample7_5_6 extends Sample7_5 {
	public void someMethod() throws IOExpention, ClassNotFoundExpention {}
}

class Sample7_5_7 extends Sample7_5 {
	public void someMethod() throws RuntimeExpention {}
}