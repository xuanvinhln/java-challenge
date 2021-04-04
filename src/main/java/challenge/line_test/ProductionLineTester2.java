package challenge.line_test;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ProductionLineTester2 {
	int abc;

	private final ProductVerifier verifier;

	ProductionLineTester2(ProductVerifier verifier) {
		this.verifier = verifier;
	}

	ProductLineTestReport test(Stream<Product> products) {
		if (products == null) {
			return new ProductLineTestReport(0, 0, 0, 0);
		}

		Stream<Product> stream = products.filter(x -> x != null).filter(x -> !x.getStatus().equalsIgnoreCase("invalid"))
				.skip(10).limit(20);

		if (!stream.findAny().isEmpty()) {
			return new ProductLineTestReport(0, 0, 0, 0);
		}
		
		int correctCnt = 0;
		int checkedExcCnt = 0;
		int uncheckedExcCnt = 0;
		int otherExcCnt = 0;
		

//		for (Product x : list) {
//			try {
//				verifier.verify(x);
//				correctCnt++;
//
//			} catch (Exception e) {
//				if (e instanceof RuntimeException) {
//					uncheckedExcCnt++;
//				} else {
//					Throwable throwable = (Throwable) e;
//					if (throwable instanceof Error) {
//						otherExcCnt++;
//					} else {
//						checkedExcCnt++;
//					}
//				}
//			}
//		}
		System.out.println(correctCnt);
		System.out.println(checkedExcCnt);
		System.out.println(uncheckedExcCnt);
		System.out.println(otherExcCnt);

		return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
	}

}