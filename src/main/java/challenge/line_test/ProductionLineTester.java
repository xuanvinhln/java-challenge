package challenge.line_test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ProductionLineTester {

	private final ProductVerifier verifier;

	ProductionLineTester(ProductVerifier verifier) {
		this.verifier = verifier;
	}

	ProductLineTestReport test(Stream<Product> products) {
		if (products == null) {
			return new ProductLineTestReport(0, 0, 0, 0);
		}

		List<Product> list = products.filter(x -> x != null).filter(x -> !x.getStatus().equalsIgnoreCase("invalid"))
				.skip(10).limit(20).collect(Collectors.toList());
		
		if (list.isEmpty()) {
			return new ProductLineTestReport(0, 0, 0, 0);
		}
		
		int correctCnt = 0;
		int checkedExcCnt = 0;
		int uncheckedExcCnt = 0;
		int otherExcCnt = 0;

		for (Product x : list) {
			try {
				verifier.verify(x);
				correctCnt++;

			} catch (Exception e) {
				if (e instanceof RuntimeException) {
					uncheckedExcCnt++;
				} else {
					Throwable throwable = (Throwable) e;
					if (throwable instanceof Error) {
						otherExcCnt++;
					} else {
						checkedExcCnt++;
					}
				}
			}
		}
		System.out.println(correctCnt);
		System.out.println(checkedExcCnt);
		System.out.println(uncheckedExcCnt);
		System.out.println(otherExcCnt);

		return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
	}

}

class ProductLineTestReport {

	long correctCnt; // number of correct products
	long checkedExcCnt; // number of products which threw a checked exception during verification
	long uncheckedExcCnt; // number of products which threw an unchecked exception during verification
	long otherExcCnt; // number of products which threw an error during verification

	ProductLineTestReport(long correctCnt, long checkedExcCnt, long uncheckedExcCnt, long otherExcCnt) {
		this.correctCnt = correctCnt;
		this.checkedExcCnt = checkedExcCnt;
		this.uncheckedExcCnt = uncheckedExcCnt;
		this.otherExcCnt = otherExcCnt;
	}
}

class Product {
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}