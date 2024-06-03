package datetime.api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateDemos {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate independance = LocalDate.of(1947, Month.AUGUST, 15);

		System.out.println(independance);

		System.out.println(today.isLeapYear());

		System.out.println(independance.isAfter(today));

		System.out.println(today.plusDays(2));

		System.out.println(today.plusMonths(3));
		System.out.println(today.minusYears(1));

		Period period = independance.until(today);

		System.out.println("Days " + period.getDays());

		System.out.println("Months " + period.getMonths());
		System.out.println("Years " + period.getYears());

		System.out.println("Days ChronoUnit " + period.get(ChronoUnit.DAYS));

	}

}
