package scannerclass;

import java.util.Scanner;

public class Tables
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Enter table number :");
		int i=scan.nextInt();
		int j=1;
		int multiplication=0;
		while(j<=10)
		{
			multiplication=i*j;
			System.out.println(i+" * "+j+" = "+multiplication);
			j++;
		}
	}

}
