package predicates;

import java.util.function.Predicate;

public class PredicateDemoFour {

	public static void main(String[] args) {

		int[] integer = { 3, 7, 8, 11, 14, 18, 19 };

		Predicate<Integer> p1 = i -> (i < 10);
		Predicate<Integer> p2 = i -> (i%2 == 0);
		System.out.println("Less than 10");
		method1(p1, integer);
		System.out.println("Even numbers");
		method2(p2, integer);
		System.out.println("Not Less than 10");
		method1(p1.negate(), integer);
		System.out.println("Less than 10 and Even numbers");
		method1(p1.and(p2), integer);
		System.out.println("Less than 10 or Even numbers");
		method1(p1.or(p2), integer);

	}

	public static void method1(Predicate<Integer> p1, int[] a) {

		for (int i : a) {
			if (p1.test(i)) {
				System.out.println(i);
			}
		}

	}
	
	public static void method2(Predicate<Integer> p1, int[] a) {

		for (int i : a) {
			if (p1.test(i)) {
				System.out.println(i);
			}
		}

	}

}
