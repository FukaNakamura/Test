package tsd;

import java.time.LocalTime;

public class Sample9_2 {

	public static void main(String[] args) {

		LocalTime time = LocalTime.of(12, 34, 56, 78);
		System.out.println("time                         :" + time);
		System.out.println("time.pulsHours(10)           :" + time.plusHours(10));
		System.out.println("time                         :" + time);

		System.out.println("time                         :" + time);

		System.out.println("------------------------------");

		LocalTime now = LocalTime.now();
		System.out.println("現在時刻                     :" + now);

		LocalTime afterOneHour = now.plusHours(1);
		System.out.println("1時間後の現在時刻            :" + afterOneHour);

		LocalTime nano0 = now.withNano(0);
		System.out.println("現在時刻                     :" + nano0);

		System.out.println("now.equals(nano0)            :" + now.equals(nano0));
		System.out.println("now.withNano(0).equals(nano0):" + now.withNano(0).equals(nano0));
	}

}
