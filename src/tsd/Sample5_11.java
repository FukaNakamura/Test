package tsd;

class RefTest{
	void metTest1(int num) {
		num += 30;
		System.out.println("int型定義側は " + num);
	}

	void metTest2(int[] array) {
		array[0] += 30;
		System.out.println("配列定義側は " + array[0]);
	}

	void meTest3(String str) {
		str += 30;
		System.out.println("String型定義側は " + str);
	}
}


public class Sample5_11 {

	public static void main(String[] args) {
		int num = 20; //20+30
		int[] array = {20, 40}; //配列はオブジェクト参照型 //{20+30, 40}
		String str = "20"; //String型も参照型 //"20"+"30"
		RefTest obj = new RefTest();

		obj.metTest1(num);
		System.out.println("int型呼び出し側は " + num);
		obj.metTest2(array); //[0]を参照してるため
		System.out.println("配列呼び出し側は " + array[0]);  //[0]を参照してるため
		obj.meTest3(str);
		System.out.println("String型呼び出し側は " + str);
	}

}
