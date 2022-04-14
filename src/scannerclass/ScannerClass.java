package scannerclass;

import java.util.Scanner;

public class ScannerClass
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=scan.nextInt();
		System.out.println("Enter value of b:");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Addition of a+b is: "+c);
		System.out.println("Enter Your name:");
		scan.nextLine();
		String name=scan.next();
		
	}

}
