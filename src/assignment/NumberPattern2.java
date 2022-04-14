package assignment;

public class NumberPattern2
{
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=(6-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if((k==1)||(k==i))
				System.out.print(1+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
