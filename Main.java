// Student Name: Muhammad Conn

// DESCRIPTION:  This is a program that converts a dollar amount to quarters, dimes, nickels, and pennies.

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION

    //We define the input dollar value
    double dollarAmount = 1.16; 

    //We define a second dollar value, multiplying by 100 temporarily as well as using the round operation to avoid Java rounding errors
    int bigDollarAmount = (int) Math.round(100 * dollarAmount); 

    //Variables for each coin amount
    int quarters, dimes, nickels, pennies;

    //Variables for the remainder after each coin value
    int leftAfterQuarters;
    int leftAfterDimes;
    int leftAfterNickels;
    //CALCULATION SECTION

    //We use integer division to see how  many of each coin go into the dollar amount. We multiply the coin value by 100 to account for our previous operation to avoid rounding errors
    quarters = (bigDollarAmount / 25);
    leftAfterQuarters = bigDollarAmount % 25;
    
    dimes = leftAfterQuarters / 10;
    leftAfterDimes = leftAfterQuarters % 10;

    nickels = leftAfterDimes / 5;
    leftAfterNickels = leftAfterDimes % 5;

    pennies = leftAfterNickels;

    //OUTPUT SECTION
    System.out.println(quarters);
    System.out.println(dimes);
    System.out.println(nickels);
    System.out.println(pennies);

    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.", dollarAmount, quarters, dimes, nickels, pennies);
    }
}
