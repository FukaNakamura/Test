package tsd;

public class Sample6_12 {

	public static void main(String[] args) {

		int i = 5;
//		double d = 2.5;

		System.out.println("int → double : ");
		double id = i;
		System.out.println(id);

		System.out.println("double → char : ");
		//型の不一致: double から char には変換できません→コンパイルエラー
//		char dc = d;
//		System.out.println(dc);

	}

}
