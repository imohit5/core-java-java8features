package functions;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {
		
		Function<String, Integer>  fn = s -> s.length();
		
		System.out.println(fn.apply("Tim"));
		System.out.println(fn.apply("Tony"));
	}

}
