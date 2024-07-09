package _21_lambda._03_jdk_functional_interface.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		Function<String, String> function1 = x -> x.toUpperCase();
		Function<String, String> function2 = x -> x.toLowerCase();
		
		// Call the functions directly
		String result1 = function1.apply("Code with Passion!");
		System.out.println(result1);
		
		String result2 = function2.apply("Code with Passion!");
		System.out.println(result2);
		
		// Pass the functions to a method as an argument
		doSomething(function1, "JPassion.com");
		doSomething(function2, "JPassion.com");
		
		Function<String, Integer> function3 = x -> x.length();
		doSomething(function3, "JPassion.com");
		
		BiFunction<String, String, String> function4 = (x, y) -> x.concat(y);
		doSomething2(function4, "Sang", "Shin");

		BiFunction<String, String, Integer> function5 = (x, y) -> x.length() + y.length();
		doSomething2(function5, "Sang", "Shin");

		// - Create a Function object, which takes an Integer and returns square value
		// - Call "apply" method of the function object using appropriate Integer value
		// - Pass the function object to doSomething(..) method as an argument
		Function<Integer, Integer> function6 = myInteger -> myInteger * myInteger;
		System.out.println(function6.apply(7));
		
		doSomething(function6, 8);

		// - Create a BiFunction object, which takes two Integer values and return
		//   multiplication of those two numbers
		// - Call "apply" method of the function object using appropriate Integer values
		// - Pass the function object to doSomething2(..) method as an argument
		BiFunction<Integer, Integer, Integer> function7 = (integer1, integer2) -> integer1 * integer2;
		System.out.println(function7.apply(2,3));
		
		doSomething2(function7, 2, 3);

	}

	public static <T,R> void doSomething(Function<T, R> function, T something) {
		System.out.println(function.apply(something));
	}
	
	
	public static <T,U,R> void doSomething2(BiFunction<T, U, R> function, T something1, U something2) {
		System.out.println(function.apply(something1, something2));
	}
	
}
