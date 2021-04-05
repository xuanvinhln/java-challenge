package challenge.line_test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		Stream<Integer> stream = list.stream();
//		.filter(x -> x != null).forEach(x -> System.out.println(x));
//
//		Error e = new Error();
//		Throwable throwable = (Throwable) e;
//		Exception ex = (Exception) throwable;
//
//		if ((Throwable) ex instanceof Error) {
//			System.out.println();
//		}
//
		AtomicInteger atomicInteger = new AtomicInteger();
		stream.forEach(x -> {
			atomicInteger.getAndIncrement();
		});

		System.out.println(atomicInteger.get());
	}
}
