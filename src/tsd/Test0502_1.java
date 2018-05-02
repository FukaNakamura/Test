package tsd;

import java.util.Arrays;

public class Test0502_1 {

	public static void main(String[] args) {

		Employee[] array = new Employee[3];
		array[0] = new Employee(461, "sakamoto");
		array[1] = new Employee(462, "tutitoi");
		array[2] = new Employee(460, "kimura");

//		//Comparableを用いた書き方
//		Arrays.sort(array);

//		//Comparatorを用いた書き方
//		Arrays.sort(array, new Comparator<Employee>() {
//
//			// 社員番号逆順ソート
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o2.no - o1.no;
//			}
//
//			// 名前ソート
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.name.compareTo(oj2.name);
//			}
//
//		});

		// ラムダ式に書き換えると…
		Arrays.sort(array, (o1, o2) -> o1.name.compareTo(o2.name));

//		for(Employee e : array) {
//			System.out.printf("社員番号：%d、名前：%s", e.no, e.name);
//			System.out.println();
//		}

		// Stream API
		Arrays.stream(array).forEach(e ->{
			System.out.printf("社員番号：%d、名前：%s", e.no, e.name);
			System.out.println();
		});
	}
}


// Comparableを用いた書き方
class Employee implements Comparable<Employee>{
	protected int no;
	protected String name;

	public Employee (int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		//		if(this.no == o.no) {
		//			return 0;
		//		} else if(this.no < o.no) {
		//			return -1;
		//		} else {
		//			return 1;
		//		}
		return this.no - o.no;
	}
}