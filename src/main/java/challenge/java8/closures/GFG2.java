package challenge.java8.closures;

//Java program to demonstrate
//how a closure is implemented
//using lambda expressions

//Defining an interface whose
//implementation is given in
//the lambda expression.
//This uses the concept of
//closures
interface concatStrings {
	public String concat(String a, String b);
}

public class GFG2 {
	// Driver code
	public static void main(String[] args) {
		// Lambda Expression
		concatStrings s = (s1, s2) -> s1 + s2;
		System.out.println(s.concat("Hello, ", "GFGians!"));
	}
}