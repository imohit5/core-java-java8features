package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterDemo {

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
		
	}

}
