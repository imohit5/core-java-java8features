package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("tim");
		al1.add("kim");
		al1.add("jim");
		al1.add("pim");
		System.out.println(al1);
		
//		ArrayList<Integer> al2 = new ArrayList<>();
//		for (Integer i : al1) {
//			if (i%2 == 0) {
//				al2.add(i);
//			}
//		}
//		System.out.println(al2);
		
		List<String> collect = al1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
