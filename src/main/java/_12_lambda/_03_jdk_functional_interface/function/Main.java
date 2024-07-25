package _12_lambda._03_jdk_functional_interface.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		// TODO-lambda-functional-interface-02a:
		// - Study how lambda objects of
		//   Function<String, String> functional interface type
		//   are defined and invoked below
		Function<String, String> function1 = x -> x.toUpperCase();
		Function<String, String> function2 = x -> x.toLowerCase();
		Function<String, Integer> function3 = x -> x.length();

		// Call the functions directly
		String result1 = function1.apply("Code with Passion!");
		System.out.println(result1);
		
		String result2 = function2.apply("Code with Passion!");
		System.out.println(result2);

		// TODO-lambda-functional-interface-02b:
		// - Study how a lambda object of
		//   Function<String, String> functional interface type
		//   is passed to a method as an argument
		doSomething(function1, "JPassion.com");
		doSomething(function2, "JPassion.com");
		doSomething(function3, "JPassion.com");

		// TODO-lambda-functional-interface-02c:
		// - Create a Function object, which takes an Integer and returns square value
		// - Call "apply" method of the function object using appropriate Integer value
		Function<Integer, Integer> function6
				= myInteger -> myInteger * myInteger;
		System.out.println(function6.apply(7));

		// TODO-lambda-functional-interface-02d:
		// - Pass the function object you created above
		//   to doSomething(..) method as an argument
		doSomething(function6, 8);
	}

	public static <T,R> void doSomething(Function<T, R> function, T something) {
		System.out.println(function.apply(something));
	}
	
}
