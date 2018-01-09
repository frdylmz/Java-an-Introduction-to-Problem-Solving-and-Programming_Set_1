package chapter1;

import java.util.Scanner;

public class OddCountAlgorithm 
{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will tell you how many odd numbers there are in the prefered amount");
		System.out.println("Please supply a number");
		
		int userNum;
		
		userNum = scan.nextInt();
		
		int oddNum = 0;
		
		for(int a = 0; a <= userNum; a++){
			if(a%2 != 0){
				oddNum++;
			}
		}
		
		System.out.println("\nThe amount of odd number(s) in " + userNum + " is:");
		System.out.println(oddNum);
	}
}
