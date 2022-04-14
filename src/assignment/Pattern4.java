package assignment;

public class Pattern4 
{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			
			for(int j=0;j<(6-i);j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++)
			{
				if((k==0)||(k==i))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}

}
