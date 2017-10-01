package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOtherDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			al1.add(i);
		}
		System.out.println(al1);
		
//		ArrayList<Integer> al2 = new ArrayList<>();
//		for (Integer i : al1) {
//			if (i%2 == 0) {
//				al2.add(i);
//			}
//		}
//		System.out.println(al2);
		
		List<Integer> collect = al1.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		long count = al1.stream().filter(i -> i%2==0).count();
		System.out.println(count);
		
		Comparator<Integer> comp = (i1,i2) -> i2.compareTo(i1);
		
		List<Integer> collect2 = al1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(collect2);
		
		Integer integer = al1.stream().sorted(comp).max(comp).get();
		System.out.println(integer);
		
		Integer integer2 = al1.stream().sorted(comp).min(comp).get();
		System.out.println(integer2);
		
		al1.stream().forEach(
								i -> {
									System.out.println(i);
								}
							);
		
	}

}
