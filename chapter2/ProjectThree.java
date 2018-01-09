package chapter2;

/*
	This program will read the amount of a monthly mortgage payment
	and the amount still owed.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 3
	Last Changed: 27 March 2017.
*/

public class ProjectThree {

	public static final double INTEREST_RATE = 7.49 / 12;
	
	public static void main(String[] args){
		 
		double outstandingBalance = 1000000;
		double monthlyPayment = outstandingBalance / 12;
		double interestAmount = monthlyPayment * (INTEREST_RATE / 100);
		double monthlyInterestTotal = interestAmount * 12;
		double montlyPaymentInterestTotal = monthlyPayment + interestAmount;
		double principalAmount = outstandingBalance + monthlyInterestTotal;
		
		double roundMontlyPaymentInterestTotal = (double) Math.round(montlyPaymentInterestTotal * 100) / 100d;
		double roundInterestAmount = (double) Math.round(interestAmount * 100) / 100d;
		double roundMonthlyInterestTotal = (double) Math.round(monthlyInterestTotal * 100) / 100d;
		double roundPrincipalAmount = (double) Math.round(principalAmount * 100) / 100d;
		
		System.out.println("Your morgage amount left is: " + outstandingBalance);
		System.out.println("This program will tell you how much you have left to pay in 12 months"
						 + "with a annual interest of 7.49%");
		
		System.out.println("\nThe monthly payment will be: R " + roundMontlyPaymentInterestTotal);
		System.out.println("The monthly interest payment will be: " + roundInterestAmount);
		System.out.println("Total interest paid: R " + roundMonthlyInterestTotal);
		System.out.println("Your total back payment will be: R " + roundPrincipalAmount);
	}
}
