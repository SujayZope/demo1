package javaprogram;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) 
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd");
		int a=s.nextInt();
		if(a%2==0)
		    System.out.println("This is even number");
		else
			System.out.println("This is odd number");
	}

}
