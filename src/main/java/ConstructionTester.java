//Name: Patrick McNulty
//Date: 9-24-20
//Assignment: ConstructionTester

import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //Constructs a scanner
        Scanner myScan = new Scanner(System.in);

        //variables for the cost of lumber, windows, and the tax rate
        final double lumberCost = 8.0;
        final double windowCost = 11.0;
        System.out.println("Enter the sales tax rate:");
        final double taxRate = myScan.nextDouble();

        //variables for the amount of lumber and windows
        System.out.println("How many boards do you need?");
        int lumberAmt = myScan.nextInt();
        System.out.println("How many windows do you need?");
        int windowAmt = myScan.nextInt();

        //variable to hold the total
        double total;

        //Constructs a Construction
        Construction myCon = new Construction(lumberCost, windowCost, taxRate);

        //Calculates and prints the totals
        total = myCon.lumberCost(lumberAmt) + myCon.windowCost(windowAmt);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + (total * (taxRate + 1)));
        
    }//Ends public static void main(String[] args)
}//Ends ConstructionTester class
