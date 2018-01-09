package chapter2;

/*
	Program to determine a certain mathematical answer.
	Author: Josias JJ Oberholster.
	Chapter 2 exercise 4
	Last Changed: 26 March 2017
*/

public class ExerciseFour {

	public static void main(String[] args){
		
		int u = 2;
		int v = 3;
		int w = 5;
		int x = 7;
		int y = 11;
		
		System.out.println("2 + 3 * 5 + 7 = " + (u + v * w + x));
		System.out.println("2 + 11 % 3 * 5 + 7 = " + (u + y % v * w + x));
		System.out.println("2++ / 3 + 2++ * 5 = " + (u++ / v + u++ * w));
	}
}
