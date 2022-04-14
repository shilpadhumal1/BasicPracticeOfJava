package assignment;

public class PracticeSet 
{		
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
					
				}
				if(i<3)
				{
					j++;
					
				}
				else
				{
					j--;
				}
				
				
			}
			System.out.println();
		}

	}
}

	

	



