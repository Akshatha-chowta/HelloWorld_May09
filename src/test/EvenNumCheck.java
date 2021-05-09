package test;

import java.util.Scanner;

public class EvenNumCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");

	}

}
