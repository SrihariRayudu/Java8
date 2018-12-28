package java8.assignment5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayTemporalAdjuster implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporalAdjusterInput) {
		LocalDate temporalAdjusterDate = LocalDate.from(temporalAdjusterInput);
		LocalDate firstNovInYear = temporalAdjusterDate.with(TemporalAdjusters.firstDayOfNextMonth());
		// adjusting two weeks
		LocalDate secondSaturday = firstNovInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		return secondSaturday;
	}

	public static void main(String ars[]) {
		LocalDate currentDate = LocalDate.now();
		SecondSundayTemporalAdjuster secondSundayTemporalAdjuster = new SecondSundayTemporalAdjuster();
		LocalDate secondSunday = currentDate.with(secondSundayTemporalAdjuster);
		System.out.println("Second Sunday is on " + secondSunday);
	}
}