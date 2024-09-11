//This is Robert Gross' 6th Java Project written on June 6th, 2023.
//The purpose of this project is to use if else statements to determine
// a persons phone bill based on their package, with each package
//having separate parameters and values for how to calculate the bill

/*
Package 1: For $40 per month 10 hours of access are provided. Additional hours
are $2.00 per hour.
Package 2: For $60 per month 20 hours of access are provided. Additional hours
are $1.00 per hour.
Package 3: For $70 per month unlimited access is provided
*/


package GrossMobileService; // Package declaration

import java.util.Scanner; //import scanner

public class GrossMobileService { //class declaration

	public static void main(String[] args) {
	
	int userPackage; //create integer userPackage
	double userHours; //create double userHours
	double userMinutes; //create double userMinutes
	double extraCost; //create double ExtraCost
	double userExtra; //create double userExtra
	double userBill; //create double userBill
	//create doubles and integers for the base prices, hour limits,
	//and additional hours of Packages 1-3. by changing prices here, prices
	//throughout entire program get adjusted
	final int Package_1_Base = 40;
	final int Package_2_Base = 60;
	final int Package_3_Base = 70;
	final int Package_1_Hour = 10;
	final int Package_2_Hour = 20;
	final double Package_1_Extra = 2.00;
	final double Package_2_Extra = 1.00;

	
	Scanner scanner = new Scanner(System.in);//create Scanner for console
	System.out.println("Please enter your package number(1,2, or 3):"); //ask user for package number
	userPackage = scanner.nextInt(); //assign user answer to userPackage
	System.out.println("Please enter the amount of hours you used this month:");
	userHours = scanner.nextDouble(); //assign user answer to userHours
	userMinutes = (userHours * 60); //multiply hours * 60 to determine minutes
	if(userPackage == 1) {
		System.out.println("Your package is #1"); //declare package number
		System.out.println("You used " + (userMinutes) + " minutes"); //declare minutes
		if (userHours > Package_1_Hour) { //if hours are greater than base package
			userExtra = (userHours - Package_1_Hour); //determine the extra hours
			extraCost = (userExtra * Package_1_Extra); //multiply by cost per hour
			userBill = (Package_1_Base + extraCost); //determine bill by adding base cost
		System.out.printf("Your total cost is $%.2f %n", userBill); //state total cost to 2 decimal places
					
		}else { //if hours don't exceed, state base cost
		System.out.println("Your total cost is $" + Package_1_Base);
		}
	}if (userPackage == 2) { //same thing for Package 2
		System.out.println("Your package is #2");
		System.out.println("You used " + (userMinutes) + " minutes");
		if (userHours > Package_2_Hour) {
			userExtra = (userHours - Package_2_Hour);
			extraCost = (userExtra * Package_2_Extra);
			userBill = (Package_2_Base + extraCost);
		System.out.printf("Your total cost is $%.2f %n", userBill);
					}
		else { 
		System.out.println("Your total cost is $" + Package_2_Base);
		}
	}if (userPackage == 3) { // Same Thing for package 3
		System.out.println("Your package is #3");
		System.out.println("You used " + (userMinutes) + " minutes");
		System.out.println("Your total cost is $" + Package_3_Base);
	}
	else {
		System.out.println("Try Again"); //if other number is entered try again
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
