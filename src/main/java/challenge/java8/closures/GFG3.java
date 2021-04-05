package challenge.java8.closures;

//Java program to demonstrate
//how a closure is implemented
//using lambda expressions

//Defining an interface whose
//implementation is given in
//the lambda expression.
//This uses the concept of
//closures
interface NumToMonth {
	public String convertToMonth(int x);
}

public class GFG3 {

	// Driver code
	public static void main(String[] args) {
		// Lambda Expression
		NumToMonth obj = new NumToMonth() {
			String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

			public String convertToMonth(int n) {
				return (n > 0 && n < months.length) ? months[n - 1] : null;
			};
		};

		System.out.println(obj.convertToMonth(8));
	}
}