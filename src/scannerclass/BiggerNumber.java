package scannerclass;

import java.util.Scanner;

public class BiggerNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter values of a and b:  ");
		a=scan.nextInt();
		b=scan.nextInt();
		if(a<b)
		{
			System.out.println("b is greater than a ");
		}
		else
		{
			System.out.println("a is greater than b  ");
		}
		
	}

}
