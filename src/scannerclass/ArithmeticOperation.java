package scannerclass;

import java.util.Scanner;

public class ArithmeticOperation 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=scan.nextInt();
		System.out.println("Enter valu of b:");
		int b=scan.nextInt();
		System.out.println("Enter 1 for Addition:\n"
								+"Enter 2 for Substraction: \n"
								+ "Enter 3 for Multiplication:\n"
								+ "Enter 4 for Division:\n");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Additionof a and b is:"+ (a+b));break;
		case 2:System.out.println("Substraction of a and b is:"+ (a-b));break;
		case 3:System.out.println("Multiplication of a and b is:"+ (a*b));break;
		case 4:System.out.println("Division of a and b is:"+ (a/b));
		}
		
	}

}
