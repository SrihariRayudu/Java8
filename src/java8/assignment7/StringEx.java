package java8.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> emptyString = new ArrayList<String>();
		Stream<String> stringStream = Stream.of("srihari", "", "satish", "", "madhavi", "", "jaswanth", "ravi");
		stringStream.forEach(i -> {
			if (i.length() > 5) {
				list.add(i);
			}
			if (i.length() == 0) {
				emptyString.add(i);
			}
		});

		System.out.println("Count no.strings whose length  is> 5 ===>" + list.size());
		System.out.println("Count no.of empty strings" + emptyString.size());
	}

}
