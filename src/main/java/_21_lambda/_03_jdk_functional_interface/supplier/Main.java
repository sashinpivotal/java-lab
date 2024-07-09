package _21_lambda._03_jdk_functional_interface.supplier;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Supplier<String> supplier1 = () -> "Boston";
		String result = supplier1.get();
		System.out.println(result);
		
		Supplier<Integer> supplier2 = () -> 34;
		printSupplied(supplier2);

	}

	public static <T> void  printSupplied(Supplier<T> supplier) {
		System.out.println(supplier.get());
	}

}
