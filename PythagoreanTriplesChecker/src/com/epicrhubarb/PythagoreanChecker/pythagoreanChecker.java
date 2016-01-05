package com.epicrhubarb.PythagoreanChecker;
import java.util.Scanner;
import java.lang.Math;


public class pythagoreanChecker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("Enter the lengths of your triangle (Preferably a first, then b, then c). This program is used to find pythagorean triples. \n");
		
		System.out.print("a - ");
		int a = input.nextInt();
		
		System.out.print("b - ");
		int b = input.nextInt();
		
		System.out.print("c - ");
		int c = input.nextInt();
		
		if(a > c){
			a ^= c;
			c ^= a;
			a ^= c;
		}
		else if(b > c){
			b ^= c;
			c ^= b;
			b ^= c;
		} 
		
		System.out.print(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
		
		System.out.print("\nDo you want to do that again? <y/n> ");
		char userChar = input.next().charAt(0);
		if(userChar == 'n') {
			input.close();
			// this closes the scanner and stops it using any more resources.
			break;
		}
		
	}
	}
}
