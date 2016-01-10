package com.epicrhubarb.FibonacciSequence;
import java.util.Scanner;

public class fibonacciSequence {

	public static void main(String[] args) {
		
		int f = 0;
		fibonacci(f);
		
		System.out.print("Enter the number you wish the sequence to print upto.\n");
		Scanner scannerInput = new Scanner(System.in);
		int number = scannerInput.nextInt();
		
		System.out.print("\n");
		
		System.out.print("The Fibonacci Sequence up to " + number + " numbers. (Don't count the zero!) \n");
		for(int fibonacci = 0; fibonacci <= number; fibonacci++) {

			System.out.print(fibonacci(fibonacci) +" ");
			
		} 
		
		scannerInput.close();
	}

	public static int fibonacci(int f) {
		if(f == 0)
			return 0;
		else if(f == 1)
			return 1;
		else
			return fibonacci(f - 1) + fibonacci(f - 2);
	}
	 
}

