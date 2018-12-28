package java8.assignment6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CaliculateWiproExp {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2018, Month.APRIL, 16);
		Period gap = Period.between(date2, date1);
		System.out.println(" Wipro experience is " + gap.getYears() + " years & " + gap.getMonths() + " months & "
				+ gap.getDays() + " days");

	}

}
