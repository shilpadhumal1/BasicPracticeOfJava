package scannerclass;

import java.util.Scanner;

public class LoginValidInvalid 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username and userid:");
		String username=scan.next();
		int userid = scan.nextInt();
		System.out.println("Enter password:");
		String password=scan.next();
		
		if(username=="Admin" || userid==123456)
		{
			
			if(password=="admin")
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid userid or username");
		}
	}

}
