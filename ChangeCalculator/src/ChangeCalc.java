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

		System.out.print(df.format(Math.floor((change / 100))) + " hundred dollar bill(s), ");
		change %= 100;

			float a;
			a = 0;
			while( !( (a <= change) || (a > (change - 100)) ))
				{
					a = a + 100;
				}
		
		//for hundred dollar bills ^

		System.out.print(df.format(Math.floor((change / 50))) + " fifty dollar bill(s), ");
		change %= 50;
		
			float b;
			b = 0;
			while( !( (b <= change) || (b > (change - 50)) ))
				{
					b = b + 50; 
				}
		
		//for fifty dollar bills ^

		System.out.print(df.format(Math.floor((change / 20))) + " twenty dollar bill(s), ");
		change %= 20;
		
			float c;
			c = 0;
			while( !( (c <= change) || (c > (change - 20)) ))
				{
					c = c + 20;
				}
		
		//for twenty dollar bills ^

		System.out.print(df.format(Math.floor((change / 10))) + " ten dollar bill(s), ");
		change %= 10;
		
			float d;
			d = 0;
			while( !( (d <= change) || ( d > (change - 10)) ))
				{
					d = d + 10;
				}
		
		//for ten dollar bills ^

		System.out.print(df.format(Math.floor((change / 5))) + " five dollar bill(s), ");
		change %= 5;
		
			float e;
			e = 0;
			while( !( (e <= change) || (e > (change - 5)) ))
				{
					e = e + 5;
				}
		
		//for five dollar bills ^

		System.out.print(df.format(Math.floor((change / 2))) + " toonie(s), ");
		change %= 2;
		
			float f;
			f = 0;
			while( !( (f <= change) || (f > (change - 2)) ))
				{
					f = f + 2;
				}
		
		//for toonies ^

		System.out.print(df.format(Math.floor((change / 1))) + " loonie(s), ");
		change %= 1;
		
			float g;
			g = 0;
			while( !( (g <= change) || (g > (change - 1)) ))
				{
					g = g + 1;
				}
		
		// for loonies ^

		System.out.print(df.format(Math.floor((change / 0.25))) + " quarter(s), ");
		change %= 0.25;
		
			float h;
			h = 0;
			while( !( (h <= change) || (h > (change - 0.25)) ))
				{
					h = h + 25;
				}
		
		
		//for quarters ^

		System.out.print(df.format(Math.floor((change / 0.10))) + " dime(s), ");
		change %= 0.10;
		
			float i;
			i = 0;
			while( !( (i <= change) || (i > (change - 0.10)) ))
				{
					i = i + 10;
				}
		
		//for dimes ^

		System.out.print(df.format(Math.floor((change / 0.05))) + " nickel(s), ");
		change %= 0.05;
			
			float j;
			j = 0;
			while( !( (j <= change) || (j > (change - 0.05)) ))
				{
					j = j + 5;
				}
		
		//for nickels ^

		System.out.print(df.format(Math.floor((change / 0.01))) + " penny(ies). ");
		change %= 0.01;

			float k;
			k = 0;
			while( !( (k <= change) || (k > (change - 0.01)) ))
				{
					k = k + 1;
				}
		
		//for pennies ^
			
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