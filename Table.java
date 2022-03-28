package javaprogram;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number for table");
		num=s.nextInt();
		
		for(int i=1;i<=10;i++)

		System.out.println(num+" * "+i+" = "+num*i);
	}

}
