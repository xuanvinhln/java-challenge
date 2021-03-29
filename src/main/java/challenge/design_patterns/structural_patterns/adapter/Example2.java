package challenge.design_patterns.structural_patterns.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");

		try {
			String s = br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.in : Adaptee
		// BufferedReader: Target
		// InputStreamReader: Adapter
	}
}
