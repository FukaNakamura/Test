package tsd;

class StaffTh {
	String name = "名無し";

	void setName(String name) {
		System.out.println("name = " + name); // 引数のname
		System.out.println("this.name = " + this.name); // インスタンス変数のname
		this.name = name;
		System.out.println("this.name = " + this.name);
	}

}

public class Sample6_9 {

	public static void main(String[] args) {
		StaffTh s1 = new StaffTh();
		System.out.println("------メソッド呼び出し-------");
		s1.setName("田中");


	}

}
