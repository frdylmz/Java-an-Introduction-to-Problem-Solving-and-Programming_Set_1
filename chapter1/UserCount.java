package chapter1;

import java.util.Scanner;

public class UserCount {
	
	public static void main(String[] args){
		
		int backVal1;
		int backVal2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will take two separate values and add the missing values in between");
		
		System.out.println("\nPlease supply the first value [Number(s)]");
		int val1 = scan.nextInt();
		
		System.out.println("\nPlease supply the second value [Number(s)]");
		int val2 = scan.nextInt();
		
		if(val1 > val2){
			backVal1  = val2;
			backVal2  = val1;
		}else{
			backVal1  = val1;
			backVal2  = val2;
		}
		
		int val3 = backVal1;
		
		System.out.println("");
		while(val3 < (backVal2+1)){
			
			System.out.print(val3 + " ");
			val3++;
		}
	}
}
