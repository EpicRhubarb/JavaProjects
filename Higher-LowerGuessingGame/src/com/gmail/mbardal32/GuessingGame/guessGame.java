package com.gmail.mbardal32.GuessingGame;
import java.util.Random;
import java.util.Scanner;

public class guessGame {

	public static void main(String[] args) {
		
		System.out.print("Hello, what is your name? \n");
		
		Scanner input = new Scanner(System.in);
		String myName = input.nextLine();
		
		System.out.print("Hello there, " + myName + "! Guess a number between 1-100. \n");
		
		Random rand = new Random();
		int number = rand.nextInt(100) + 1;
		int guessesTaken = 0;
		
		while(true) {
		
		int myGuess = input.nextInt();
		
		if (myGuess < number) {
			guessesTaken++;
			System.out.print("Your guess is too low. Try again. \n");
		}
		else if(myGuess > number) {
			guessesTaken++;
			System.out.print("Your guess is too high. Try again. \n");
		}
		else if(myGuess == number) {
			guessesTaken++;
			System.out.print("Congrats, you have guessed the right number! You guessed the number in " + guessesTaken + " guess(es)!");
			
			System.out.print("\nDo you want to play again? <y/n> ");
			char userChar = input.next().charAt(0);
			if(userChar == 'n'){
				input.close();
				// this closes the scanner and stops it using any more resources.
				break;
			}
			else if(userChar == 'y') {
				number = rand.nextInt(100) + 1;
				System.out.print("Guess a number between 1-100. \n");
			}
		}
	
	}
}
}
