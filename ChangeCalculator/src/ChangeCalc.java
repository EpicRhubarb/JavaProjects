import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
// this will import the scanner and DecimalFormat library

public class ChangeCalc {

	private static char n;

	public static void main(String[] args) {
		
		while(true){
			
		Scanner myInput = new Scanner(System.in);
		// creates the scanner
		
			
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Change Calculator");
		System.out.println("Please enter the amount:");

		float change = myInput.nextFloat();
		float a;
		a = 0;

		System.out.print(df.format(Math.floor((change / 100))) + " hundred dollar bill(s), "); //for hundred dollar bills 
		change %= 100;
			while( !( (a <= change) || (a > (change - 100)) ))
				{
					a = a + 100;
				}

		System.out.print(df.format(Math.floor((change / 50))) + " fifty dollar bill(s), "); //for fifty dollar bills 
		change %= 50;
			while( !( (a <= change) || (a > (change - 50)) ))
				{
					a = a + 50; 
				}

		System.out.print(df.format(Math.floor((change / 20))) + " twenty dollar bill(s), "); //for twenty dollar bills
		change %= 20;
			while( !( (a <= change) || (a > (change - 20)) ))
				{
					a = a + 20;
				}

		System.out.print(df.format(Math.floor((change / 10))) + " ten dollar bill(s), "); //for ten dollar bills 
		change %= 10;
			while( !( (a <= change) || ( a > (change - 10)) ))
				{
					a = a + 10;
				}

		System.out.print(df.format(Math.floor((change / 5))) + " five dollar bill(s), "); //for five dollar bills
		change %= 5;
			while( !( (a <= change) || (a > (change - 5)) ))
				{
					a = a + 5;
				}

		System.out.print(df.format(Math.floor((change / 2))) + " toonie(s), "); //for toonies
		change %= 2;
			while( !( (a <= change) || (a > (change - 2)) ))
				{
					a = a + 2;
				}
		
		System.out.print(df.format(Math.floor((change / 1))) + " loonie(s), "); // for loonies
		change %= 1;
			while( !( (a <= change) || (a > (change - 1)) ))
				{
					a = a + 1;
				}

		System.out.print(df.format(Math.floor((change / 0.25))) + " quarter(s), "); //for quarters
		change %= 0.25;
			while( !( (a <= change) || (a > (change - 0.25)) ))
				{
					a = a  + 25;
				}

		System.out.print(df.format(Math.floor((change / 0.10))) + " dime(s), "); //for dimes 
		change %= 0.10;
			while( !( (a <= change) || (a > (change - 0.10)) ))
				{
					a = a + 10;
				}

		System.out.print(df.format(Math.floor((change / 0.05))) + " nickel(s), "); //for nickels
		change %= 0.05;
			while( !( (a <= change) || (a > (change - 0.05)) ))
				{
					a = a + 5;
				}

		System.out.print(df.format(Math.floor((change / 0.01))) + " penny(ies). "); //for pennies
		change %= 0.01;
			while( !( (a <= change) || (a > (change - 0.01)) ))
				{
					a = a + 1;
				}
			
			System.out.print("\nDo you want to continue? <y/n>");
			char userChar = myInput.next().charAt(0);
			if(userChar == 'n') {
				myInput.close();
				break;
				// this closes the scanner and stops it using any more resources.
			}
		
		}
	}
}