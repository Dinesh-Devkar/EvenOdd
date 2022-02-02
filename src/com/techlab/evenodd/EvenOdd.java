package com.techlab.evenodd;

import java.util.Scanner;

public class EvenOdd {
	
	public void isEven(int number)
	{
		Scanner sc=new Scanner(System.in);
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
