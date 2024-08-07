package _12_lambda._03_jdk_functional_interface.predicate;

import java.util.Calendar;
import java.util.Date;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// TODO-lambda-functional-interface-03a:
		// - Study how lambda objects of
		//   Predicate functional interface type
		//   are defined and invoked below
		Predicate<Double> predicate1 = x -> x > 10;
		System.out.println(predicate1.test(Double.valueOf(9.0)));
		
		Predicate<String> predicate2 = x -> x.length() > 5;
		System.out.println(predicate2.test("JPassion.com"));
		
		BiPredicate<Double, Double> predicate3 = (x, y) -> x + y > 10;
		System.out.println(predicate3.test(Double.valueOf(3), Double.valueOf(2)));
		
		BiPredicate<String, Integer> predicate4 = (x, y) -> x.length() > y;
		System.out.println(predicate4.test("JPassion.com", 5));

		// TODO-lambda-functional-interface-03b:
		// - Study how Predicate object which receives a Date object and returns
		//   true if the Date is later than the current date and time and 
		//   false otherwise is used
		Predicate<Date> myPredicate = date -> {
			// Set current time
			Calendar calendarCurrentTime = Calendar.getInstance();
			calendarCurrentTime.setTime(date);
			
			// Set noon
			Calendar calendarNoon = Calendar.getInstance();
			calendarCurrentTime.set(Calendar.HOUR_OF_DAY, 12);
			
			return calendarCurrentTime.before(calendarNoon);
		};
		
		System.out.println(myPredicate.test(new Date()));

	}

}
