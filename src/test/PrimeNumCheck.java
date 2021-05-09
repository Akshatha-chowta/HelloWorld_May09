package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			int a=num%i;
			if(a==0)
			{
				 flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("number is  a prime no");
		}
		else
			System.out.println("number is not a prime no");
	}

}
