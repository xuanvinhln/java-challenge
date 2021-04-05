package challenge.java8.closures;

//Java program to demonstrate
//how a closure is implemented
//using lambda expressions

//Defining an interface whose
//implementation is given in
//the lambda expression.
//This uses the concept of
//closures
interface SalutationInterface {
	public String salHello();
}

public class GFG {
	// Driver code
	public static void main(String[] args) {
		// Lambda Expression
		SalutationInterface obj = () -> {
			return "Hello, GFGians!";
		};

		// Calling the above interface
		System.out.println(obj.salHello());
	}
}