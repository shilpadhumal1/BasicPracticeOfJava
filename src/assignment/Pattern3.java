package assignment;

public class Pattern3 {
	public static void main(String[] args) {
		int j;
		for(int i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j<=(6-i))
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
