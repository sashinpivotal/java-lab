package _12_lambda._03_jdk_functional_interface.supplier;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		// TODO-lambda-functional-interface-04a:
		// - Study how lambda object of
		//   Supplier<String> functional interface type
		//   is defined and invoked below
		Supplier<String> supplier1 = () -> "Boston";
		String result = supplier1.get();
		System.out.println(result);

		// TODO-lambda-functional-interface-04b:
		// - Study how lambda object of
		//   Supplier<String> functional interface type
		//   is defined and passed to a method
		//   as an argument
		Supplier<Integer> supplier2 = () -> 34;
		printSupplied(supplier2);

	}

	public static <T> void  printSupplied(Supplier<T> supplier) {
		System.out.println(supplier.get());
	}

}
