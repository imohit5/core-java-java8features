package predicates;

import java.util.function.Predicate;

public class PredicateDemoTwo {

	public static void main(String[] args) {
		
		Predicate<String> p = s->(s.length()<5);
		
		System.out.println(p.test("Testing"));
		System.out.println(p.test("test"));
	}

}
