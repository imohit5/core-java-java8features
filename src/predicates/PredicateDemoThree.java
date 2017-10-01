package predicates;

import java.util.function.Predicate;

public class PredicateDemoThree {

	public static void main(String[] args) {

		int[] integer = { 3, 7, 8, 11, 15, 18, 19 };

		Predicate<Integer> p = i -> (i < 10);

		method(p, integer);

	}

	public static void method(Predicate<Integer> p, int[] a) {

		for (int i : a) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}

	}

}
